package com.testx.web.api.selenium.restassured.qe.ui.pageobjects;


import com.testx.web.api.selenium.restassured.qe.ui.context.TestContext;
import com.testx.web.api.selenium.restassured.qe.ui.stepdefinitions.BaseSetup;
import com.testx.web.api.selenium.restassured.qe.ui.webdriver.DriverManagerUtils;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage extends BaseSetup {

    public WelcomePage(TestContext testContext) {
        super(testContext);
        PageFactory.initElements(testContext.getDriverManager().getDriver(), this);
    }

    @FindBy(xpath = "//*[contains(@class,'widget.TextView')] | //XCUIElementTypeStaticText[contains(@name,'')]")
    protected static List<WebElement> webElementLabels;

    @FindBy(xpath = "//*[@resource-id='FdAppHeader:Title'] | //*[@name='FdAppHeader:Title']")
    protected static WebElement familyDollarIcon;

    @FindBy(xpath = "//*[@resource-id='FDAlert:RenderAlert'] | //*[@name='FDAlert:RenderAlert']")
    protected static WebElement tailoredLandingScreen;

    @FindBy(xpath = "//*[@resource-id='FDLogin:LoginTitle'] | //*[@name='FDLogin:LoginTitle']")
    protected static WebElement loginPage;

    @FindBy(xpath = "//*[contains(@class,'android.widget.Button')] | //*[@name='Allow Once']")
    protected static List<WebElement> deviceLocationPermission;

    @FindBy(xpath = "//*[@text='Only this time'] | //*[@name='Allow Once']")
    protected static WebElement deviceLocation;

    @FindBy(xpath = "//*[@name='OK']")
    protected static WebElement okPopUp;

    @FindBy(xpath = "//*[@resource-id='FDSignUp:Heading'] | //*[@name='FDSignUp:Heading']")
    protected static WebElement signUpPage;

    @FindBy(xpath = "//*[@resource-id='FdAppHeader:Title'] | //*[@name='FdAppHeader:Title']")
    protected static WebElement btnContinueAsGuest;

    @FindBy(xpath = "//*[@text='Log In'] | //*[@label='Log In']")
    protected static WebElement btnLogin;

    @FindBy(xpath = "//*[@text='Sign Up'] | //*[@label='Sign Up']")
    protected static WebElement btnSignUp;

    @FindBy(xpath = "//*[@resource-id='Onboarding:imageTitleTestId'] | //*[@name='Onboarding:imageTitleTestId']")
    protected static WebElement titleHeader;

    @FindBy(xpath = "//*[@resource-id='Onboarding:illustrationTestId'] | //*[@name='Onboarding:illustrationTestId']")
    protected static WebElement titleDescription;

    public boolean isElementPresent(String labelName) {
        return driverManagerUtils.isTextDisplayed(webElementLabels, labelName);
    }

    public boolean isFDIconDisplayed() {
        return driverManagerUtils.isElementDisplayed(familyDollarIcon);
    }
    public boolean isTailoredScreenDisplayed() {
        return driverManagerUtils.isElementDisplayed(tailoredLandingScreen);
    }

    public boolean isLoginPageDisplayed() {
        return driverManagerUtils.isElementDisplayed(loginPage);
    }

    public void clickOnDeviceLocationButton(String buttonName) {
        DriverManagerUtils.sleep(2);
        driverManagerUtils.clickByLabel(deviceLocationPermission, buttonName);
        if (configuration.mobilePlatform().equalsIgnoreCase("ios")) {
            driverManagerUtils.clickElement(okPopUp);
        }
    }

    public void clickOnlyThisTimeOnDeviceLocationPopUp() {
        DriverManagerUtils.sleep(2);
        if(driverManagerUtils.isElementDisplayed(deviceLocation)) {
            driverManagerUtils.clickElement(deviceLocation);
        }
    }

    public boolean isSignUpPageDisplayed() {
        return driverManagerUtils.isElementDisplayed(signUpPage);
    }

    public void clickContinueAsGuestButton() {
        driverManagerUtils.clickElement(btnContinueAsGuest);
    }

    public boolean isContinueAsGuestTextPresent() {
        return driverManagerUtils.isElementDisplayed(btnContinueAsGuest);
    }

    public boolean isLogInTextPresent() {
        return driverManagerUtils.isElementDisplayed(btnLogin);
    }

    public boolean isSignUpTextPresent() {
        return driverManagerUtils.isElementDisplayed(btnSignUp);
    }

    public void clickLoginButton() {
        driverManagerUtils.clickElement(btnLogin);
    }

    public void clickSignUpButton() {
        driverManagerUtils.clickElement(btnSignUp);
    }

    public String getHeaderText() {
        return driverManagerUtils.getElementText(titleHeader);
    }

    public String getHeaderDescription() {
        return driverManagerUtils.getElementText(titleDescription);
    }
}
