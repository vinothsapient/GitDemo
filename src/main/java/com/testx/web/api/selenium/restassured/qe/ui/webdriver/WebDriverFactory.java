package com.testx.web.api.selenium.restassured.qe.ui.webdriver;

import com.testx.web.api.selenium.restassured.qe.ui.custom_exceptions.HeadlessNotSupportedException;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.DriverManagerType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
//import org.openqa.selenium.opera.OperaDriver;
//import org.openqa.selenium.opera.OperaOptions;
import org.openqa.selenium.remote.AbstractDriverOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;

import static com.testx.web.api.selenium.restassured.qe.ui.config.ConfigurationManager.getConfiguration;
import static java.lang.Boolean.TRUE;


public enum WebDriverFactory {

    CHROME {
        @Override
        public RemoteWebDriver createDriver() {
            WebDriverManager.getInstance(DriverManagerType.CHROME).setup();
            return new ChromeDriver(getOptions());
        }

        @Override
        public ChromeOptions getOptions() {
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.addArguments(START_MAXIMIZED);
            chromeOptions.addArguments("--disable-infobars");
            chromeOptions.addArguments("--disable-notifications");
            chromeOptions.addArguments("--remote-allow-origins=*");
            chromeOptions.setHeadless(getConfiguration().headless());
            return chromeOptions;
        }
    }, FIREFOX {
        @Override
        public RemoteWebDriver createDriver() {
            WebDriverManager.getInstance(DriverManagerType.FIREFOX).setup();
            return new FirefoxDriver(getOptions());
        }

        @Override
        public FirefoxOptions getOptions() {
            FirefoxOptions firefoxOptions = new FirefoxOptions();
            firefoxOptions.addArguments(START_MAXIMIZED);
            firefoxOptions.setHeadless(getConfiguration().headless());

            return firefoxOptions;
        }
    }, EDGE {
        @Override
        public RemoteWebDriver createDriver() {
            WebDriverManager.getInstance(DriverManagerType.EDGE).setup();

            return new EdgeDriver(getOptions());
        }

        @Override
        public EdgeOptions getOptions() {
            EdgeOptions edgeOptions = new EdgeOptions();
            edgeOptions.addArguments(START_MAXIMIZED);
            edgeOptions.setHeadless(getConfiguration().headless());

            return edgeOptions;
        }
    }, SAFARI {
        @Override
        public RemoteWebDriver createDriver() {
            WebDriverManager.getInstance(DriverManagerType.SAFARI).setup();

            return new SafariDriver(getOptions());
        }

        @Override
        public SafariOptions getOptions() {
            SafariOptions safariOptions = new SafariOptions();
            safariOptions.setAutomaticInspection(false);

            if (TRUE.equals(getConfiguration().headless()))
                throw new HeadlessNotSupportedException(safariOptions.getBrowserName());

            return safariOptions;
        }
    },
//    OPERA {
//        @Override
//        public RemoteWebDriver createDriver() {
//            WebDriverManager.getInstance(DriverManagerType.OPERA).setup();
//
//            return new OperaDriver(getOptions());
//        }
//
//        @Override
//        public OperaOptions getOptions() {
//            OperaOptions operaOptions = new OperaOptions();
//            operaOptions.addArguments(START_MAXIMIZED);
//            operaOptions.addArguments("--disable-infobars");
//            operaOptions.addArguments("--disable-notifications");
//
//            if (TRUE.equals(getConfiguration().headless()))
//                throw new HeadlessNotSupportedException(operaOptions.getBrowserName());
//
//            return operaOptions;
//        }
//    },
        IE {
        @Override
        public RemoteWebDriver createDriver() {
            WebDriverManager.getInstance(DriverManagerType.IEXPLORER).setup();
            return new InternetExplorerDriver(getOptions());
        }

        @Override
        public InternetExplorerOptions getOptions() {
            InternetExplorerOptions internetExplorerOptions = new InternetExplorerOptions();
            internetExplorerOptions.ignoreZoomSettings();
            internetExplorerOptions.takeFullPageScreenshot();
            internetExplorerOptions.introduceFlakinessByIgnoringSecurityDomains();

            if (TRUE.equals(getConfiguration().headless()))
                throw new HeadlessNotSupportedException(internetExplorerOptions.getBrowserName());
            return internetExplorerOptions;
        }
    };

    private static final String START_MAXIMIZED = "--start-maximized";

    public abstract RemoteWebDriver createDriver();

    public abstract AbstractDriverOptions<?> getOptions();
}
