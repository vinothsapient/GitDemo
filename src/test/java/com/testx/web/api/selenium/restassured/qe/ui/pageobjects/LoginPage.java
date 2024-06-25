package com.testx.web.api.selenium.restassured.qe.ui.pageobjects;

import com.testx.web.api.selenium.restassured.qe.common.utils.TestVariables;
import com.testx.web.api.selenium.restassured.qe.ui.context.TestContext;
import com.testx.web.api.selenium.restassured.qe.ui.stepdefinitions.BaseSetup;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseSetup {

    public LoginPage(TestContext testContext) {
        super(testContext);
        PageFactory.initElements(testContext.getDriverManager().getDriver(), this);
    }

    @FindBy(xpath = "//*[contains(@class,'widget.TextView')] | //XCUIElementTypeOther[contains(@name,'')]")
    protected static List<WebElement> btnWebElements;

    @FindBy(xpath = "//*[@resource-id='FDLogin:EmailInput'] | //*[@name='FDLogin:EmailInput']")
    protected static WebElement emailInput;

    @FindBy(xpath = "//*[@resource-id='FDSecureTextInput:InputText'] | //*[@name='FDSecureTextInput:InputText']")
    protected static WebElement passwordInput;

    @FindBy(xpath = "//*[@resource-id='FDSecureTextInput:Eye'] | //*[@name='FDSecureTextInput:Eye']")
    protected static WebElement passwordEyeButton;

    @FindBy(xpath= "//*[@resource-id='FDLogin:NextButton']//android.widget.TextView | //*[@name='FDLogin:NextButton']")
    protected static WebElement btnNext;

    @FindBy(xpath = "//*[@resource-id='FDLogin:LoginTitle'] | //*[@name='FDLogin:LoginTitle']")
    protected static WebElement loginHeader;

    @FindBy(xpath = "//*[@resource-id='FDLogin:DontHaveAccount'] | //*[@name='FDLogin:DontHaveAccount']")
    protected static WebElement loginSubHeader;

    @FindBy(xpath = "//*[@resource-id='FDLogin:SignUpLink']//android.widget.TextView | //*[@name='FDLogin:SignUpLink']")
    protected static WebElement btnSignUp;

    @FindBy(xpath = "//*[@resource-id='FDLogin:EmailLabel'] | //*[@name='FDLogin:EmailLabel']")
    protected static WebElement emailLabel;

    @FindBy(xpath = "//*[@resource-id='FDLogin:PasswordLabel'] | //*[@name='FDLogin:PasswordLabel']")
    protected static WebElement passwordLabel;

    @FindBy(xpath = "//*[@resource-id='FDLogin:ForgotPasswordLink']//android.widget.TextView | //*[@name='FDLogin:ForgotPasswordLink']")
    protected static WebElement forgetPasswordLink;

    @FindBy(xpath = "//*[@resource-id='Biometric:SubContainer']//com.horcrux.svg.SvgView | //*[@name='Biometric:SubContainer']//XCUIElementTypeOther")
    protected static WebElement biometricLock;

    @FindBy(xpath = "//*[@resource-id='Biometric:Heading'] | //*[@name='Biometric:Heading']")
    protected static WebElement biometricHeader;

    @FindBy(xpath = "//*[@resource-id='Biometric:SettingsInfo'] | //*[@name='Biometric:SettingsInfo']")
    protected static WebElement biometricSettingsInfo;

    @FindBy(xpath = "//*[@resource-id='Biometric:TurnOnButton']//android.widget.TextView | //*[@name='Biometric:TurnOnButton']")
    protected static WebElement biometricTurnOnButton;

    @FindBy(xpath = "//*[@resource-id='Biometric:NotNowLink']//android.widget.TextView | //*[@name='Biometric:NotNowLink']")
    protected static WebElement biometricNotNowButton;

    public void enterUserName(String inputText) {
        TestVariables.store("email", inputText);
        driverManagerUtils.enterText(emailInput, inputText);
    }

    public String getInputEmailText() {
        return driverManagerUtils.getElementText(emailInput);
    }

    public void enterPassword(String password) {
        TestVariables.store("password", password);
        driverManagerUtils.enterText(passwordInput, password);
        if(configuration.mobilePlatform().equalsIgnoreCase("ios")) {
            driverManagerUtils.clickElement(passwordEyeButton);
        }
    }

    public boolean isElementPresent(String buttonName) {
        return driverManagerUtils.isTextDisplayed(btnWebElements, buttonName);
    }

    public void clickNextButton() {
        driverManagerUtils.clickElement(btnNext);
    }

    public String getLogInHeaderText() {
        return driverManagerUtils.getElementText(loginHeader);
    }

    public String getLogInHeaderSubText() {
        return driverManagerUtils.getElementText(loginSubHeader);
    }

    public String getForgetPasswordLinkText() {
        return driverManagerUtils.getElementText(forgetPasswordLink);
    }

    public void clickForgetPasswordLink() {
        driverManagerUtils.clickElement(forgetPasswordLink);
    }

    public String getSignUpText() {
        return driverManagerUtils.getElementText(btnSignUp);
    }

    public String getEmailLabelText() {
        return driverManagerUtils.getElementText(emailLabel);
    }

    public boolean isEmailInputBoxDisplayed() {
        return driverManagerUtils.isElementDisplayed(emailInput);
    }

    public String getPasswordLabelText() {
        return driverManagerUtils.getElementText(passwordLabel);
    }

    public boolean isPasswordInputBoxDisplayed() {
        return driverManagerUtils.isElementDisplayed(passwordInput);
    }

    public String getNextButtonText() {
        return driverManagerUtils.getElementText(btnNext);
    }

    public void clickSignUpButton() {
        driverManagerUtils.clickElement(btnSignUp);
    }

    public boolean isBiometricLockDisplayed() {
        return driverManagerUtils.isElementDisplayed(biometricLock);
    }

    public String getBiometricHeaderText() {
        return driverManagerUtils.getElementText(biometricHeader);
    }

    public String getBiometricSettingsInfoText() {
        return driverManagerUtils.getElementText(biometricSettingsInfo);
    }

    public String getTurnOnBiometricLinkText() {
        return driverManagerUtils.getElementText(biometricTurnOnButton);
    }

    public String getBiometricNotNowLinkText() {
        return driverManagerUtils.getElementText(biometricNotNowButton);
    }

    public void enterText(String label,String value) {
        WebElement element=driver.findElement(
                By.xpath("(//android.widget.TextView[@text = '"+label+"']/following-sibling::android.widget.EditText | " +
                        " //android.widget.TextView[@text = '"+label+"']/following-sibling::android.view.ViewGroup/android.widget.EditText | " +
                        "//XCUIElementTypeStaticText[@label='"+label+"']/following-sibling::XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeSecureTextField | " +
                        "//XCUIElementTypeStaticText[@label='"+label+"']/following-sibling::XCUIElementTypeOther/XCUIElementTypeTextField)[1]" ));
        driverManagerUtils.enterText(element,value);
    }

    public boolean checkBiometric(String value) {
        boolean retunFlag=false;
        if(getTurnOnBiometricLinkText().equalsIgnoreCase(value) || getTurnOnBiometricLinkText().equalsIgnoreCase("Turn on Face ID")){
            retunFlag=true;
        }
        return  retunFlag;
    }
}
