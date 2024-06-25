package com.testx.web.api.selenium.restassured.qe.ui.webdriver;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.util.ArrayList;
import java.util.List;

public class DriverManager {

    static final ThreadLocal<RemoteWebDriver> driver = new ThreadLocal<>();
    static final List<WebDriver> storedDrivers = new ArrayList<>();

    public DriverManager() {}

    public RemoteWebDriver getDriver() {
        return driver.get();
    }

    public void setDriver(RemoteWebDriver driver) {
        DriverManager.driver.set(driver);
    }

    public void addDriver(RemoteWebDriver driver) {
        storedDrivers.add(driver);
        DriverManager.driver.set(driver);
    }

    public static void quitDriver() {
        DriverManager.driver.get().quit();
        driver.remove();
    }

    public static void destroyDriver() {
        for (WebDriver driver : storedDrivers) {
            if (driver != null) {
                driver.quit();
            }
        }
    }

    public String getInfo() {
        Capabilities cap = ((RemoteWebDriver) getDriver()).getCapabilities();
        String browserName = cap.getBrowserName();
        String platform = cap.getPlatformName().toString();
        String version = cap.getBrowserVersion();
        return String.format("browser: %s v: %s platform: %s", browserName, version, platform);
    }
}
