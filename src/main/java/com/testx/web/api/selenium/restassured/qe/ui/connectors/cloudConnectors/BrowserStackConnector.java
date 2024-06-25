package com.testx.web.api.selenium.restassured.qe.ui.connectors.cloudConnectors;

import com.testx.web.api.selenium.restassured.qe.ui.capabilities.Cloud;
import com.testx.web.api.selenium.restassured.qe.ui.capabilities.PlatformDesiredCapabilities;
import com.testx.web.api.selenium.restassured.qe.ui.connectors.IDeviceConnector;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.restassured.response.Response;
import org.json.JSONException;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import static io.restassured.RestAssured.given;

public class BrowserStackConnector implements IDeviceConnector {

    private String app_url = null;

    public void uploadFile(String filePath, String userName, String key, String endpoint) throws IOException, JSONException {
        String customId = new File(filePath).getName().replaceAll(".apk|.app|.ipa","");
        Response response = given()
                .auth()
                .preemptive()
                .basic(userName, key)
                .multiPart("file",new File(filePath),"multipart/form-data")
                .multiPart("custom_id",customId)
                .when()
                .post(endpoint)
                .then()
                .extract().response();
        Assert.assertEquals(200, response.getStatusCode());
        app_url = response.jsonPath().get("app_url");
    }

    @Override
    public RemoteWebDriver connect(PlatformDesiredCapabilities platform, Cloud cloud, DesiredCapabilities capabilities, RemoteWebDriver driver) throws Exception {
        String localFilePath = new File((String) capabilities.getCapability("app")).getPath();

        String bUrl = "http://" + cloud.getBrowserStack().getUser() + ":" + cloud.getBrowserStack().getKey() + cloud.getBrowserStack().getUrl();

        uploadFile(localFilePath, cloud.getBrowserStack().getUser(), cloud.getBrowserStack().getKey(), cloud.getBrowserStack().getBaseUrl());

        capabilities.setCapability("app", app_url);

        capabilities.setCapability("browserstack.idleTimeout", cloud.getBrowserStack().getidleTimeout());

        if (capabilities.getPlatformName().toString().equalsIgnoreCase("android")) {
            driver = new AndroidDriver(new URL(bUrl), capabilities);
        } else {
            driver = new IOSDriver(new URL(bUrl), capabilities);
        }
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver;
    }
}
