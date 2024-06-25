package com.testx.web.api.selenium.restassured.qe.ui.connectors.cloudConnectors;

import com.perfecto.reportium.client.ReportiumClient;
import com.perfecto.reportium.client.ReportiumClientFactory;
import com.perfecto.reportium.model.Job;
import com.perfecto.reportium.model.PerfectoExecutionContext;
import com.perfecto.reportium.model.Project;
import com.perfecto.reportium.test.TestContext;
import com.testx.web.api.selenium.restassured.qe.ui.capabilities.Cloud;
import com.testx.web.api.selenium.restassured.qe.ui.capabilities.PlatformDesiredCapabilities;
import com.testx.web.api.selenium.restassured.qe.ui.config.Configuration;
import com.testx.web.api.selenium.restassured.qe.ui.connectors.IDeviceConnector;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.entity.mime.content.ContentBody;
import org.apache.http.entity.mime.content.FileBody;
import org.apache.http.entity.mime.content.StringBody;
import org.apache.http.impl.client.HttpClientBuilder;
import org.json.JSONException;
import org.json.JSONObject;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.TimeUnit;

public class PerfectoConnector implements IDeviceConnector {
    ReportiumClient reportiumClient;

    public DesiredCapabilities capabilities;

    public static Configuration configuration;

    @Override
    public RemoteWebDriver connect(PlatformDesiredCapabilities platform, Cloud cloud, DesiredCapabilities capabilities, RemoteWebDriver driver) throws Exception {
        String localFilePath = new File((String) capabilities.getCapability("app")).getPath();
        Path pathToAFile = Paths.get(localFilePath);
        String repositoryKey = "PRIVATE:" + pathToAFile.getFileName().toString();
        uploadMedia(cloud.getPerfecto().getCloudName(), cloud.getPerfecto().getSecurityToken(), localFilePath, repositoryKey, cloud.getPerfecto().getRepositoryUrl());
        capabilities.setCapability("app", repositoryKey);
        capabilities.setCapability("securityToken", cloud.getPerfecto().getSecurityToken());
        if (capabilities.getPlatformName().toString().equalsIgnoreCase("android")) {
            driver = new AndroidDriver(new URL("https://" + cloud.getPerfecto().getCloudName() + cloud.getPerfecto().getUrl()), capabilities);
        } else {
            driver = new IOSDriver(new URL("https://" + cloud.getPerfecto().getCloudName() + cloud.getPerfecto().getUrl()), capabilities);
        }
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        reportiumClient = setReportiumClient(driver, reportiumClient);
        reportiumClient.testStart("Demo apk installation", new TestContext("tag2", "tag3")); //Starts the reportium test
        reportiumClient.stepStart("app installed successfully");
        reportiumClient.stepEnd();
        return driver;
    }

    private ReportiumClient setReportiumClient(RemoteWebDriver driver, ReportiumClient reportiumClient) throws Exception {
        PerfectoExecutionContext perfectoExecutionContext;

        if (System.getProperty("reportium-job-name") != null) {
            perfectoExecutionContext = new PerfectoExecutionContext.PerfectoExecutionContextBuilder()
                    .withProject(new Project("My Project", "1.0"))
                    .withJob(new Job(System.getProperty("reportium-job-name"), Integer.parseInt(System.getProperty("reportium-job-number"))))
                    .withContextTags("tag1")
                    .withWebDriver(driver)
                    .build();
        } else {
            perfectoExecutionContext = new PerfectoExecutionContext.PerfectoExecutionContextBuilder()
                    .withProject(new Project("My Project", "1.0"))
                    .withContextTags("tag1")
                    .withWebDriver(driver)
                    .build();
        }
        reportiumClient = new ReportiumClientFactory().createPerfectoReportiumClient(perfectoExecutionContext);
        if (reportiumClient == null) {
            throw new Exception("Reportium client not created!");
        }
        return reportiumClient;
    }

    public void uploadMedia(String cloudName, String securityToken, String path, String artifactLocator, String repositoryUrl) throws URISyntaxException, ClientProtocolException, IOException, JSONException {
        URIBuilder taskUriBuilder = new URIBuilder("https://" + cloudName + repositoryUrl);
        HttpClient httpClient = HttpClientBuilder.create().build();
        HttpPost httppost = new HttpPost(taskUriBuilder.build());
        httppost.setHeader("Perfecto-Authorization", securityToken);

        MultipartEntityBuilder mpEntity = MultipartEntityBuilder.create();
        File packagedFile = new File(path);
        ContentBody inputStream = new FileBody(packagedFile, ContentType.APPLICATION_OCTET_STREAM);

        JSONObject req = new JSONObject();
        req.put("artifactLocator", artifactLocator);
        req.put("override", true);
        String rp = req.toString();

        ContentBody requestPart = new StringBody(rp, ContentType.APPLICATION_JSON);
        mpEntity.addPart("inputStream", inputStream);
        mpEntity.addPart("requestPart", requestPart);
        httppost.setEntity(mpEntity.build());
        HttpResponse response = httpClient.execute(httppost);
    }
}
