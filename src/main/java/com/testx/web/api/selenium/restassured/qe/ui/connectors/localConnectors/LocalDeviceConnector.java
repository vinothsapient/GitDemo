package com.testx.web.api.selenium.restassured.qe.ui.connectors.localConnectors;

import com.testx.web.api.selenium.restassured.qe.ui.capabilities.Cloud;
import com.testx.web.api.selenium.restassured.qe.ui.capabilities.PlatformDesiredCapabilities;
import com.testx.web.api.selenium.restassured.qe.ui.connectors.IDeviceConnector;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class LocalDeviceConnector implements IDeviceConnector {

    public DesiredCapabilities capabilities;

    @Override
    public RemoteWebDriver connect(PlatformDesiredCapabilities platform, Cloud cloud, DesiredCapabilities capabilities, RemoteWebDriver driver) throws Exception {
        if(capabilities.getPlatformName().toString().equalsIgnoreCase("android"))
        {
            driver = new AndroidDriver(new URL(platform.getUrl()), capabilities);
        }
        else {
            driver = new IOSDriver(new URL(platform.getUrl()),capabilities);
        }
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver;
    }
}

