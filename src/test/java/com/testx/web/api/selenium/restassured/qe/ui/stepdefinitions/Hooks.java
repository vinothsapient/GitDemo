package com.testx.web.api.selenium.restassured.qe.ui.stepdefinitions;

import static com.testx.web.api.selenium.restassured.qe.ui.config.ConfigurationManager.getConfiguration;

import com.testx.web.api.selenium.restassured.qe.ui.capabilities.Capabilities;
import com.testx.web.api.selenium.restassured.qe.ui.capabilities.PlatformDesiredCapabilities;
import com.testx.web.api.selenium.restassured.qe.ui.config.DataManagerImpl;
import com.testx.web.api.selenium.restassured.qe.ui.connectors.IDeviceConnector;
import com.testx.web.api.selenium.restassured.qe.ui.connectors.cloudConnectors.BrowserStackConnector;
import com.testx.web.api.selenium.restassured.qe.ui.connectors.cloudConnectors.PerfectoConnector;
import com.testx.web.api.selenium.restassured.qe.ui.connectors.localConnectors.LocalDeviceConnector;
import com.testx.web.api.selenium.restassured.qe.ui.context.TestContext;
import com.testx.web.api.selenium.restassured.qe.ui.reporter.AllureManager;
import com.testx.web.api.selenium.restassured.qe.ui.webdriver.SelectWebDriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import java.io.File;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Hooks extends BaseSetup {

    private static final Logger LOGGER = LoggerFactory.getLogger(Hooks.class);
    RemoteWebDriver driver;
    TestContext testContext;

    DesiredCapabilities caps = new DesiredCapabilities();

    Capabilities capabilities = null;

    PlatformDesiredCapabilities platform;

    IDeviceConnector iDeviceConnector;
    DataManagerImpl dataManager = new DataManagerImpl();
    public Hooks(TestContext testContext){
        super(testContext);
        this.testContext = testContext;
        driver = testContext.getDriverManager().getDriver();
    }

    @Before()
    public void preConditionForUITests(Scenario scenario) throws Exception {
        capabilities = dataManager.getObjectData(System.getProperty("user.dir") + "/src/test/resources/config/desired_capabilities.json", Capabilities.class);
        AllureManager.setAllureEnvironmentInformation();
        if (configuration.platform().equalsIgnoreCase("mobile")) {
            passCapabilities();
            if(configuration.target().equalsIgnoreCase("local"))
            {
                iDeviceConnector = new LocalDeviceConnector();
            }
            else if(configuration.target().equalsIgnoreCase("remote")) {
                if (configuration.cloudPlatform().equalsIgnoreCase("perfecto")) {
                    iDeviceConnector = new PerfectoConnector();
                }
                else if(configuration.cloudPlatform().equalsIgnoreCase("browserStack"))
                {
                    iDeviceConnector = new BrowserStackConnector();
                }
            }
            caps.setCapability("project", configuration.project());
            caps.setCapability("build", configuration.build());
            //caps.setCapability("name", configuration.name());
            caps.setCapability("name", scenario.getName());
            driver = iDeviceConnector.connect(platform, capabilities.getCloud(), caps, driver);
            testContext.getDriverManager().addDriver(driver);
            testContext.getDriverManager().setDriver(driver);
    }
        else
        {
            driver = new SelectWebDriverFactory().createInstance(getConfiguration().browser());
            testContext.getDriverManager().addDriver(driver);
            testContext.getDriverManager().setDriver(driver);
            if (testContext.getDriverManager().getDriver() == null) {
                System.out.println("Why this is null");
            }
            testContext.getDriverManager().getDriver().get(getConfiguration().url());
        }
    }

    @After()
    public void postConditionForUITests(Scenario scenario) {
        if (scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
            AllureManager.saveScreenshotPNG(driver);
        }
        System.out.println("Stop Driver: " + driver);
        driver.quit();
    }

    public void passCapabilities() {
        if (configuration.target().equalsIgnoreCase("local")) {
            caps.setCapability("autoLaunch", true);
            caps.setCapability("takesScreenshot", false);
            caps.setCapability("screenshotOnError", true); // Take screenshot only on errors
            caps.setCapability("enableAppiumBehavior", true);
            caps.setCapability("openDeviceTimeout", 2);
        }
        if (configuration.mobilePlatform().equalsIgnoreCase("android")) {
            platform = capabilities.getAndroid();
            if(configuration.target().equalsIgnoreCase("local")){
                caps.setCapability("appActivity",capabilities.getAndroid().getAppActivity());
                caps.setCapability("androidInstallTimeout", 180000);
                caps.setCapability("model", platform.getDevices().get(0).getModel());
            }
            caps.setCapability("platformName", "android");
            caps.setCapability("autoGrantPermissions", "true");
        } else if (configuration.mobilePlatform().equalsIgnoreCase("ios")) {
            platform = capabilities.getIos();
            if(configuration.target().equalsIgnoreCase("local")){
                caps.setCapability("platformVersion", platform.getDevices().get(0).getOs_version());
                caps.setCapability("iOSResign", true);
                caps.setCapability("automationName", "XCUITest");
            }
            caps.setCapability("platformName", "iOS");
            caps.setCapability("autoAcceptAlerts", "true");
        }
        caps.setCapability("automationName", platform.getDevices().get(0).getAutomationName());
        caps.setCapability("deviceName", platform.getDevices().get(0).getDeviceName());
        if (configuration.isMobileWeb().equalsIgnoreCase("true")) {
            caps.setCapability("browserName", platform.getDevices().get(0).getBrowserName());
        } else {
            caps.setCapability("app", new File(System.getProperty("user.dir") + platform.getApp()).getPath());
        }
        // Set Perfecto Media repository path of App under test.
        if (configuration.target().equalsIgnoreCase("remote")) {
            if (configuration.cloudPlatform().equalsIgnoreCase("browserStack")) {
                caps.setCapability("deviceName", platform.getCloudDevices().get(1).getDeviceName());
            } else if (configuration.cloudPlatform().equalsIgnoreCase("perfecto")) {
                caps.setCapability("deviceName", platform.getCloudDevices().get(0).getDeviceName());
                caps.setCapability("os_version", platform.getCloudDevices().get(1).getOs_version());
            }
        }
    }
}