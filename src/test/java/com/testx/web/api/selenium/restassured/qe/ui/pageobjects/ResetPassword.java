package com.testx.web.api.selenium.restassured.qe.ui.pageobjects;

import com.testx.web.api.selenium.restassured.qe.ui.context.TestContext;
import com.testx.web.api.selenium.restassured.qe.ui.stepdefinitions.BaseSetup;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResetPassword extends BaseSetup {

    public ResetPassword(TestContext testContext) {
        super(testContext);
        PageFactory.initElements(testContext.getDriverManager().getDriver(), this);
    }

    @FindBy(xpath = "//*[contains(@class,'widget.TextView')] | //*[contains(@name,'')]")
    protected static List<WebElement> btnWebElements;

    @FindBy(xpath="//*[@resource-id='ResetPassword:Title'] | //*[@name='ResetPassword:Title']")
    protected WebElement resetPasswordPageHeading;

    @FindBy(xpath="//*[@resource-id='ResetPassword:Body'] | //*[@name='ResetPassword:Body']")
    protected WebElement resetPasswordBody;

    @FindBy(xpath="//*[@resource-id='ResetPassword:Email'] | //*[@name='ResetPassword:Email']")
    protected WebElement resetPasswordEmail;

    @FindBy(xpath = "//*[@resource-id='ResetPassword:InputField'] | //*[@name='ResetPassword:InputField']")
    protected WebElement resetPasswordEmailInput;

    @FindBy(xpath="//*[@resource-id='ResetPassword:RememberPassword'] | //*[@name='ResetPassword:RememberPassword']")
    protected WebElement resetPasswordRememberPassword;

    @FindBy(xpath = "//*[@resource-id='ResetPassword:LogIn']/android.widget.TextView | //*[@name='ResetPassword:LogIn']")
    protected WebElement resetPasswordLoginLink;

    @FindBy(xpath="//*[@resource-id='ResetPassword:HandleResetPassword']//android.widget.TextView | //*[@name='ResetPassword:HandleResetPassword']")
    protected WebElement btnSendRecoveryLink;

    @FindBy(xpath = "//*[@resource-id='FdAppHeader:RightIcon'] | //*[@name='FdAppHeader:RightIcon']")
    protected WebElement btnClose;

    @FindBy(xpath = "//*[@resource-id='RecoveryLink:Body'] | //*[@name='RecoveryLink:Body']")
    protected WebElement recoveryLinkSentPageHeader;

    @FindBy(xpath = "//*[@resource-id='RecoveryLink:Body']/android.widget.TextView | //*[@name='RecoveryLink:Body']")
    protected List<WebElement> recoveryLinkSentPageDescription;

    @FindBy(xpath = "//*[@resource-id='RecoveryLink:Button']//android.widget.TextView | //*[@name='RecoveryLink:Button']")
    protected WebElement returnToLoginLink;

    @FindBy(xpath = "//*[@resource-id='ResetPassword:InlineError'] | //*[@name='ResetPassword:InlineError']")
    protected WebElement resetPasswordErrorMessage;

    public boolean isResetPasswordPageDisplayed() {
        return driverManagerUtils.isElementDisplayed(resetPasswordPageHeading);
    }

    public String getResetYourPasswordText() {
        return driverManagerUtils.getElementText(resetPasswordPageHeading);
    }

    public String getResetPasswordBodyText() {
        return driverManagerUtils.getElementText(resetPasswordBody);
    }

    public String getEmailTextOnResetPasswordPage() {
        return driverManagerUtils.getElementText(resetPasswordEmail);
    }

    public boolean isResetPasswordEmailInputPresent() {
        return driverManagerUtils.isElementDisplayed(resetPasswordEmailInput);
    }

    public String getRememberYourPasswordText() {
        return driverManagerUtils.getElementText(resetPasswordRememberPassword).trim();
    }

    public String getLoginLinkText() {
        return driverManagerUtils.getElementText(resetPasswordLoginLink).trim();
    }

    public String getSendMeARecoveryLink() {
        return driverManagerUtils.getElementText(btnSendRecoveryLink);
    }

    public void clickCloseButton() {
        driverManagerUtils.clickElement(btnClose);
    }

    public boolean isElementPresent(String buttonName) {
        return driverManagerUtils.isTextDisplayed(btnWebElements, buttonName);
    }

    public void enterTextInEmailField(String emailId) {
        driverManagerUtils.enterText(resetPasswordEmailInput, emailId);
    }

    public void clickElement(String buttonName) {
        driverManagerUtils.clickByLabel(btnWebElements, buttonName);
    }

    public boolean isCloseButtonPresent() {
        return driverManagerUtils.isElementDisplayed(btnClose);
    }

    public void clickLoginLink() {
        driverManagerUtils.clickElement(resetPasswordLoginLink);
    }

    public boolean isRecoveryLinkSentPageDisplayed() {
        return driverManagerUtils.isElementDisplayed(recoveryLinkSentPageHeader);
    }

    public String getRecoveryLinkSentPageDescription1() {
        return driverManagerUtils.getElementText(recoveryLinkSentPageDescription.get(0));
    }

    public String getRecoveryLinkSentPageDescription2() {
        return driverManagerUtils.getElementText(recoveryLinkSentPageDescription.get(1));
    }

    public void clickOnSendMeRecoveryLink() {
        driverManagerUtils.clickElement(btnSendRecoveryLink);
    }

    public void clickReturnToLoginLink() {
        driverManagerUtils.clickElement(returnToLoginLink);
    }

    public String getErrorText() {
        return driverManagerUtils.getElementText(resetPasswordErrorMessage);
    }
}
