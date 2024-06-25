package com.testx.web.api.selenium.restassured.qe.ui.connectors;


import com.testx.web.api.selenium.restassured.qe.ui.capabilities.Cloud;
import com.testx.web.api.selenium.restassured.qe.ui.capabilities.PlatformDesiredCapabilities;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public interface IDeviceConnector {
     RemoteWebDriver connect(PlatformDesiredCapabilities platform, Cloud cloud, DesiredCapabilities capabilities, RemoteWebDriver driver) throws Exception ;
}
