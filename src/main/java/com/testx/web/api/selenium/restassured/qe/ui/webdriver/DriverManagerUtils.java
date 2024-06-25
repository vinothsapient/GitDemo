package com.testx.web.api.selenium.restassured.qe.ui.webdriver;

import com.github.javafaker.Faker;
import com.testx.web.api.selenium.restassured.qe.ui.config.Configuration;
import com.testx.web.api.selenium.restassured.qe.ui.config.ConfigurationManager;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.MobileBy;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.touch.offset.PointOption;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static java.time.Duration.ofMillis;

public class DriverManagerUtils {
    private static final Logger LOGGER = LoggerFactory.getLogger(DriverManager.class);
    private static final long TIME_OUT_IN_SECONDS = 30;
    public static Map<String, String> HandleMyWindows = new HashMap<>();
    public static final int EXPLICIT_TIMEOUT = 5;
    RemoteWebDriver driver;

    public static Configuration configuration = ConfigurationManager.getConfiguration();

    public DriverManagerUtils(RemoteWebDriver driver) {
        this.driver = driver;
    }

    public void navigateTo(String url) {
        driver.get(url);
        verifyPageLoaded();
        LOGGER.info("Navigated to the (\"" + url + "\")");
    }

    public static void sleep(int seconds) {
        try {
            Thread.sleep(seconds);
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
    }

    public void navigate(String url) {
        driver.navigate().to(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(TIME_OUT_IN_SECONDS));
        verifyPageLoaded();
    }

    public void navigateBack() {
        driver.navigate().back();
        verifyPageLoaded();
        LOGGER.info("Navigate back on the page");
    }

    public void navigateForward() {
        driver.navigate().forward();
        verifyPageLoaded();
        LOGGER.info("Navigate forward on the page");
    }

    public void refreshPage() {
        LOGGER.info("CALLED: navigateForward()");
        driver.navigate().refresh();
        verifyPageLoaded();
    }

    // HANDLING WINDOWS
    public void switchToNewWindow() {
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
            LOGGER.info("Switched to the new windows");
        }
    }

    public void closeWindowByName(String windowTitle) {
        LOGGER.info("Switching to the windows by title: " + windowTitle);
        driver.switchTo().window(windowTitle);
        LOGGER.info("Closing windows: " + windowTitle);
        driver.close();
    }

    public void windowHandle(String WindowsName) {
        if (HandleMyWindows.containsKey(WindowsName)) {
            driver.switchTo().window(HandleMyWindows.get(WindowsName));
            LOGGER.info(String.format("I go to Windows: %s with value: %s ", WindowsName, HandleMyWindows.get(WindowsName)));
        } else {
            for (String winHandle : driver.getWindowHandles()) {
                HandleMyWindows.put(WindowsName, winHandle);
                LOGGER.info("The New window" + WindowsName + "is saved in scenario with value" + HandleMyWindows.get(WindowsName));
                driver.switchTo().window(winHandle);
            }
        }
    }

    public void zoomTillElementDisplay(WebElement element) {
        element.sendKeys(Keys.chord(Keys.CONTROL, "0"));
    }

    public void scrollPage(String to) throws Exception {
        JavascriptExecutor jse = driver;
        if (to.equals("top")) {
            LOGGER.info("Scrolling to the top of the page");
            jse.executeScript("scroll(0, -250);");
        } else if (to.equals("end")) {
            LOGGER.info("Scrolling to the end of the page");
            jse.executeScript("scroll(0, 250);");
        }
    }

    public void verifyPageLoaded() {
        String GetActual = driver.getCurrentUrl();
        LOGGER.info(String.format("Checking if %s page is loaded.", GetActual));
        new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_TIMEOUT)).until(
                webDriver -> ((JavascriptExecutor) webDriver).executeScript("return document.readyState").equals("complete"));
    }

    public void openNewTabWithURL(String url) {
        LOGGER.info("Open New tab with URL: " + url);
        WebDriver newTab = driver.switchTo().newWindow(WindowType.TAB);
        newTab.get(url);
    }

    public void scrollToElement(WebElement webElement) {
        try {
            if ((driver instanceof AndroidDriver) || (driver instanceof IOSDriver)) {
                scrollToMobileElement(webElement);
            } else {
                JavascriptExecutor jse = driver;
                LOGGER.info("Scrolling to element: " + webElement.getTagName());
                jse.executeScript("arguments[0].scrollIntoView();", webElement);
            }
        } catch (Exception e) {
            LOGGER.info("Element not Found");
        }
    }

    public void switchToFrame(WebElement webElement) {
        LOGGER.info("Switching to frame: " + webElement.getTagName());
        driver.switchTo().frame(webElement);
    }

    public void switchToParentFrame() {
        LOGGER.info("Switching to parent frame");
        driver.switchTo().parentFrame();
    }

    public void switchToDefaultContent() {
        LOGGER.info("Switching to default content");
        driver.switchTo().parentFrame();
    }

    public void clickJSElement(WebElement webElement) {
        JavascriptExecutor jse = driver;
        LOGGER.info("Scrolling to element: " + webElement.getTagName());
        jse.executeScript("arguments[0].click()", webElement);
        LOGGER.info("Click the web element");
    }

    public void doubleClickTheElement(WebElement webElement) {
        Actions action = new Actions(driver);
        action.moveToElement(webElement).doubleClick().perform();
        LOGGER.info("Double click on element: " + webElement.getTagName());
    }


    public void waitForElementPresent(WebElement elementLocator)  {
        WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_TIMEOUT));
        LOGGER.info("Waiting for the element: " + elementLocator.getTagName() + " to be present");
        w.until(ExpectedConditions.presenceOfElementLocated((By) elementLocator));
    }

    public void waitForElementVisible(WebElement elementLocator)  {
        WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_TIMEOUT));
        LOGGER.info("Waiting for the element: " + elementLocator.getTagName() + " to be visible");
        w.until(ExpectedConditions.visibilityOfElementLocated((By) elementLocator));
    }

    /**
     * Method to get page title
     *
     * @return String
     */
    public String getPageTitle() {
        return driver.getTitle();
    }

    /**
     * Function to find element and highlight
     *
     * @param driver     Web driver object
     * @param webElement web element to identify
     * @param color      highlighting element
     */

    public void findElementAndHighlight(RemoteWebDriver driver, WebElement webElement, String color) {
        try {
            explicitlyWaitForElement(driver, webElement);
            if (driver != null) {
                LOGGER.info("Highlighting: " + webElement);
                ((JavascriptExecutor) driver).executeScript("arguments[0].style.border='3px solid " + color + "'",
                        webElement);
            }
        } catch (NoSuchElementException e) {
            LOGGER.error("Element highlight method could not find the locator: " + webElement);
        } catch (Exception e) {
            LOGGER.error("Some error occurred while highlighting the locator: " + webElement);
        }
    }

    /**
     * Function to wait for presence of the element
     *
     * @param driver  Web driver object
     * @param locator web element to identify
     * @return web element found
     */
    public WebElement explicitlyWaitForElement(RemoteWebDriver driver, WebElement locator) {
        WebElement foundLocator = null;
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(TIME_OUT_IN_SECONDS));
            wait.ignoring(StaleElementReferenceException.class);
            foundLocator = wait.until(ExpectedConditions.visibilityOf(locator));
        } catch (TimeoutException e) {
            handleException(locator);
        }
        return foundLocator;
    }

    public String getAlertText() {
        String alertMessage = null;
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_TIMEOUT));
            Alert alert = wait.until(ExpectedConditions.alertIsPresent());
            alertMessage = alert.getText();
            LOGGER.info("The alert was accepted successfully.");
        } catch (Throwable e) {
            LOGGER.error("Error came while waiting for the alert popup. " + e.getMessage());
        }
        return alertMessage;
    }

    public void acceptTheAlert() {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_TIMEOUT));
            Alert alert = wait.until(ExpectedConditions.alertIsPresent());
            alert.accept();
            LOGGER.info("The alert was accepted successfully.");
        } catch (Throwable e) {
            LOGGER.error("Error came while waiting for the alert popup. " + e.getMessage());
        }
    }

    public void dismissTheAlert() {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_TIMEOUT));
            Alert alert = wait.until(ExpectedConditions.alertIsPresent());
            alert.dismiss();
            LOGGER.info("The alert was dismissed successfully.");
        } catch (Throwable e) {
            LOGGER.error("Error came while waiting for the alert popup. " + e.getMessage());
        }
    }

    /**
     * Checks if checkbox is checked.
     *
     * @param webElement locator of the web element
     * @return Returns true if the checkbox is checked.
     */
    public boolean isElementSelected(WebElement webElement) {
        boolean isSelected = webElement.isSelected();
        LOGGER.info("Checked: " + isSelected);
        return isSelected;
    }

    /**
     * Deselects an element only if it's selected.
     *
     * @param webElement locator of the web element
     */
    public static void unselectCheckbox(WebElement webElement) {
        if (webElement.isSelected()) {
            webElement.click();
        }
        LOGGER.info("CALLED: clickCheckbox()");
    }

    /**
     * Function to wait for frame and switch to it
     *
     * @param driver  Web driver object
     * @param locator web element to identify
     */
    public void explicitlyWaitForFrame(RemoteWebDriver driver, WebElement locator) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(TIME_OUT_IN_SECONDS));
            wait.ignoring(StaleElementReferenceException.class);
            wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(locator));
        } catch (TimeoutException e) {
            handleException(locator);
        }
    }

    /**
     * Navigate to specific url
     *
     * @param url Url to navigate
     */
    public void navigateToURL(String url) {
        driver.get(url);
    }

    /**
     * Function to handle exception
     *
     * @param locator web element to identify
     */
    private void handleException(WebElement locator) {
        throw new RuntimeException(" " + locator.toString() + " " + TIME_OUT_IN_SECONDS + " " + driver.getCurrentUrl());
    }

    /**
     * Function to validate web page tile
     *
     * @param expected Expected Title of web page
     */
    public void validateTitle(String expected) {
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expected);
    }

    /**
     * Function to click the element
     *
     * @param element web element to identify
     */
    public void clickElement(WebElement element) {
        try {
            new WebDriverWait(driver,Duration.ofSeconds(60)).until(ExpectedConditions.visibilityOf(element));
            element.click();
        } catch (NoSuchElementException e) {
            LOGGER.info("Not Found");
        } catch (StaleElementReferenceException e) {
            element.click();
        }
    }
public void click(By by){
    new WebDriverWait(driver,Duration.ofSeconds(60)).until(ExpectedConditions.visibilityOfElementLocated(by)).click();
}
    public boolean isDisplayed(By by){
      return   new WebDriverWait(driver,Duration.ofSeconds(60)).until(ExpectedConditions.visibilityOfElementLocated(by)).isDisplayed();
    }
    protected void handleException(NoSuchElementException exception) {
        Assert.fail(exception.getMessage() + " on page " + driver.getCurrentUrl());
    }

    /**
     * function to wait for element to be clickable
     *
     * @param driver     Web driver object
     * @param webElement By object to identify
     * @return returns element
     */
    public WebElement explicitlyWaitForClickable(RemoteWebDriver driver, WebElement webElement) {
        WebElement foundLocator;
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(TIME_OUT_IN_SECONDS));
        wait.ignoring(StaleElementReferenceException.class);
        foundLocator = wait.until(ExpectedConditions.elementToBeClickable(webElement));
        return foundLocator;
    }

    /**
     * Method to hover on element
     *
     * @param driver     : String : Locator type (id, name, class, xpath, css)
     * @param webElement : String : Locator value
     */
    public void hoverOverElement(RemoteWebDriver driver, WebElement webElement) {
        Actions action = new Actions(driver);
        action.moveToElement(webElement).perform();
    }

    /**
     * Function to switch to default content/window
     */
    public void switchToDefaultWindow() {
        driver.switchTo().defaultContent();
    }

    /**
     * Function to type value
     * @param element By object to identify
     * @param value Input to be entered
     */
    public void enterText(WebElement element, String value) {
        try {
            element.click();
            element.clear();
            element.sendKeys(value);
        } catch (NoSuchElementException exception) {
            LOGGER.info("Element Not Found");
        }
       closeKeypad();
    }
public void closeKeyPadAndEnterText(WebElement element, String value) {
        try {
            element.click();
            closeKeypad();
            element.sendKeys(value);
        } catch (NoSuchElementException exception) {
            LOGGER.info("Element Not Found");
        }
       
    }
    /**
     * Function to clear the value from the text box
     *
     * @param element By object to identify
     */
    public void clearText(WebElement element) {
        try {
            element.click();
            element.clear();
        } catch (NoSuchElementException e) {
            LOGGER.info("Element Not Found");
        }
    }

    public String getElementText(WebElement element) {
        String elementText = null;
        try {
            elementText = element.getText();
        } catch (NoSuchElementException e) {
            LOGGER.info("Element Not Found");
        }
        return elementText;
    }

    /**
     * @param: String locator. This method verifies if the element is displayed.
     */
    public boolean isElementDisplayed(WebElement element) {
        boolean isDisplayed;
        try {
            LOGGER.info(String.format("Waiting Element: %s", element.getTagName()));
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_TIMEOUT));
            By elementLocator = toByVal(element);
            isDisplayed = wait.until(ExpectedConditions.visibilityOfElementLocated(elementLocator)).isDisplayed();
        } catch (NoSuchElementException | TimeoutException e) {
            isDisplayed = false;
        }
        LOGGER.info(String.format("%s visibility is: %s", element, isDisplayed));
        return isDisplayed;
    }

    /**
     * Method to return element status - enabled?
     *
     * @param webElement : Web element to check
     * @return Boolean
     */
    public boolean isElementEnabled(WebElement webElement) {
        isElementDisplayed(webElement);
        return webElement.isEnabled();
    }

    public void selectOptionDropdownByText(WebElement element, String option) throws Exception {
        LOGGER.info(String.format("Waiting Element: %s", element));
        Select opt = new Select(element);
        LOGGER.info("Select option: " + option + "by text");
        opt.selectByVisibleText(option);
    }

    public void selectOptionFromDropdown(WebElement elementToSelect, String optionBy, String option) {
        LOGGER.info(String.format("Waiting Element: %s", elementToSelect.getTagName()));
        Select selectList = new Select(elementToSelect);
        switch (optionBy) {
            case "selectByIndex":
                selectList.selectByIndex(Integer.parseInt(option) - 1);
                break;
            case "selectByValue":
                selectList.selectByValue(option);
                break;
            case "selectByText":
                selectList.selectByVisibleText(option);
                break;
        }
    }

    public void waitForTheCurrentPageToLoad() {
        LOGGER.info(String.format("Checking if %s page is loaded.", driver.getCurrentUrl()));
        new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_TIMEOUT)).until(
                webDriver -> ((JavascriptExecutor) webDriver).executeScript("return document.readyState").equals("complete"));
    }

    /**
     * Function to replace a string
     *
     * @param regex       regular expression to replace
     * @param actualValue value to be replaced
     * @return updated string
     */
    public String getStringFormat(String regex, String actualValue) {
        return String.format(regex, actualValue);
    }

    /**
     * Function to dynamically generate the webElement by substituting strings
     *
     * @param driver            Web driver object
     * @param locator           Web element
     * @param runtimeValue      value to be passed during the run time
     * @param substitutionValue value to be substituted
     * @return web element found
     */
    public WebElement prepareWebElementWithDynamicValue(RemoteWebDriver driver, String locator, String runtimeValue,
                                                        String substitutionValue) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(TIME_OUT_IN_SECONDS));
        WebElement element = null;
        try {
            if (locator.equalsIgnoreCase("id")) {
                element = driver.findElement(By.id(getStringFormat(runtimeValue, substitutionValue)));
            } else if (locator.equalsIgnoreCase("class")) {
                element = driver.findElement(By.className(getStringFormat(runtimeValue, substitutionValue)));
            } else if (locator.equalsIgnoreCase("name")) {
                element = driver.findElement(By.name(getStringFormat(runtimeValue, substitutionValue)));
            } else if (locator.equalsIgnoreCase("css")) {
                wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(getStringFormat(runtimeValue, substitutionValue))));
                element = driver.findElement(By.cssSelector(getStringFormat(runtimeValue, substitutionValue)));
            } else if (locator.equalsIgnoreCase("xpath")) {
                wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(getStringFormat(runtimeValue, substitutionValue))));
                element = driver.findElement(By.xpath(getStringFormat(runtimeValue, substitutionValue)));
            } else if (locator.equalsIgnoreCase("linkText")) {
                element = driver.findElement(By.linkText(getStringFormat(runtimeValue, substitutionValue)));
            } else {
                return null;
            }
        } catch (NoSuchElementException exception) {
            handleException(exception);
        }
        return element;
    }

    /**
     * Covert web element into By object
     *
     * @param webElement locator of the web element
     * @return web element found
     */
    private By toByVal(WebElement webElement) {
        String[] data;
            data = (webElement.toString().split("->")[1].replaceFirst("(?s)(.*)\\]", "$1" + "")).split(": ");
        if (data.length <= 1) {
            data = (webElement.toString().split("->")[1].replaceFirst("(?s)(.*)\\]", "$1" + "")).split(":");
        }
        String locator = data[0].replaceAll("By.", "").trim();
        String term = data[1];
        switch (locator) {
            case "xpath":
                return By.xpath(term);
            case "css selector":
                return By.cssSelector(term);
            case "id":
                return By.id(term);
            case "tag name":
                return By.tagName(term);
            case "name":
                return By.name(term);
            case "link text":
                return By.linkText(term);
            case "class name":
                return By.className(term);
        }
        return (By) webElement;
    }

    void scrollToMobileElement(WebElement element) {
        int amount = 0;
        int max_scrolls = 5;
        By by = toByVal(element);
        List<WebElement> ele = driver.findElements(by);
        scrollToMobileEle(ScrollDirection.UP, by);
        if (ele.size() == 0) {
            do {
                amount++;
                scrollToMobileEle(ScrollDirection.DOWN, by);
                ele = driver.findElements(by);
            } while ((ele.size() == 0 || !ele.get(0).isDisplayed()) && (amount <= max_scrolls));
        } else if (ele.size() == 1 && !ele.get(0).isDisplayed()) {
            do {
                amount++;
                scrollToMobileEle(ScrollDirection.DOWN, by);
                ele = driver.findElements(by);
            } while ((ele.size() == 0 || !ele.get(0).isDisplayed()) && (amount <= max_scrolls));
        }
    }

    private void scrollToMobileEle(ScrollDirection dir, By by) {
        boolean driverType = driver instanceof AndroidDriver;
        if (driverType) {
            if (dir == ScrollDirection.DOWN) {
                driver.findElement(AppiumBy.androidUIAutomator(
                        "new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(1)"));
            } else if (dir == ScrollDirection.UP) {
                   driver.findElement(AppiumBy.androidUIAutomator(
                        "new UiScrollable(new UiSelector().scrollable(true)).scrollToBeginning(10)"));
            }
        } else {
            HashMap<String, Object> scrollObject = new HashMap<>();
            if (dir == ScrollDirection.UP) {
                scrollObject.put("direction", "up");
            } else {
                RemoteWebElement ele = (RemoteWebElement) driver.findElement(by);
                scrollObject.put("elementId", ele.getId());
                scrollObject.put("toVisible", true);
                scrollObject.put("direct", true);
            }
            driver.executeScript("mobile: scroll", scrollObject);
        }
    }

    public enum ScrollDirection {
        UP, DOWN, LEFT, RIGHT
    }

    public void clickByLabel(List<WebElement> webElements,String label) {
        try {
            webElements.stream().
                    filter(we->we.getText().equalsIgnoreCase(label)).findAny().get().click();
        } catch (NoSuchElementException exception) {
            LOGGER.info("Element Not Found");
        }
    }

    public WebElement getRequiredWebElement(List<WebElement> webElements,String label){
        return webElements.stream().
                filter(we->we.getText().equals(label)).findAny().get();
    }

    public boolean isTextDisplayed(List<WebElement> webElements,String label){
        boolean isDisplayed = false;
        boolean driverType = driver instanceof AndroidDriver;
        try {
            int i = 0;
            if (driverType) {
                driver.findElement(AppiumBy.androidUIAutomator(
                        "new UiScrollable(new UiSelector().scrollable(true)).scrollToBeginning(5)"));
            }
            do {
                if (webElements.stream().
                        anyMatch(we -> we.getText().equals(label))) {
                    isDisplayed = true;
                    break;
                } else {
                    if (driverType) {
                        driver.findElement(AppiumBy.androidUIAutomator(
                                "new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(1)"));
                    }
                }
                i++;
            } while (i < 5);
        } catch (Exception exception) {
            isDisplayed= webElements.stream().
                    anyMatch(we -> we.getText().equals(label));
        }
        return isDisplayed;
    }

    public void scrollDown() {
        boolean driverType = driver instanceof AndroidDriver;
        if (driverType) {
            driver.findElements(AppiumBy.androidUIAutomator(
                    "new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(1)"));
        } else {
            JavascriptExecutor js = driver;
            HashMap<String, Object> scrollObject = new HashMap<>();
            scrollObject.put("direction", "down");
            js.executeScript("mobile: scroll", scrollObject);
        }
    }

    public void closeKeypad() {
        driver.navigate().back();
        LOGGER.info("Close Keypad back on the page");
    }

    public static String randomPhoneNumber() {
        return "8" + RandomStringUtils.randomNumeric(9);
    }

    public static String randomZipCode() {
        return RandomStringUtils.randomNumeric(5);
    }

    public static String randomAssociateID() {
        return RandomStringUtils.randomNumeric(9);
    }

    public static String randomString(int length) {
        return RandomStringUtils.randomAlphabetic(length).toLowerCase();
    }

    public static String randomEmail() {
        return "AUTO_" + (RandomStringUtils.randomAlphabetic(5)) + "-test@yopmail.com";
    }

    public static String fakerData(String nameType) {
        Faker faker = new Faker();
        switch (nameType) {
            case "firstName":
                return faker.name().firstName().replaceAll("[^a-zA-Z0-9]", "");
            case "lastName":
                return faker.name().lastName().replaceAll("[^a-zA-Z0-9]", "");
            case "fullName":
                return faker.name().fullName().replaceAll("[^a-zA-Z0-9]", " ");
            default:
                throw new IllegalStateException("Unexpected value: " + nameType);
        }
    }

    public void dragAndDropBasedOnPointers(){
        int pressX = driver.manage().window().getSize().width / 2;
        int bottomY = driver.manage().window().getSize().height * 4/5;
        int topY = driver.manage().window().getSize().height / 8;
        new TouchAction((PerformsTouchActions) driver).press(PointOption.point(pressX,bottomY)) .waitAction(waitOptions(ofMillis(800))).moveTo(PointOption.point(pressX, topY)).release().perform();


    }
    public void dragAndDropBasedOnPointersLittleDistance() {
        int pressX = driver.manage().window().getSize().width / 2;
        int bottomY = driver.manage().window().getSize().height * 4/5;
        int topY = (int) (driver.manage().window().getSize().height *0.6);
        new TouchAction((PerformsTouchActions) driver).press(PointOption.point(pressX,bottomY)) .waitAction(waitOptions(ofMillis(800))).moveTo(PointOption.point(pressX, topY)).release().perform();
        DriverManagerUtils.sleep(1);
    }


    public boolean isElementDisplayedWithOutWait(WebElement element){
        return element.isDisplayed();
    }



    public void scrollByUsingText(String valueToMove) throws Exception {
        if(driver instanceof AndroidDriver) {
            driver.findElements(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textMatches(\"" + valueToMove + "\").instance(0))"));
        }else{
            dragAndDropBasedOnPointersLittleDistance();

        }
    }
}
