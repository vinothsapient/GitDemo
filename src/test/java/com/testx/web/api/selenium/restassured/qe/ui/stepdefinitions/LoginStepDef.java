package com.testx.web.api.selenium.restassured.qe.ui.stepdefinitions;

import com.testx.web.api.selenium.restassured.qe.common.utils.JsonUtil;
import com.testx.web.api.selenium.restassured.qe.common.utils.TestVariables;
import com.testx.web.api.selenium.restassured.qe.ui.context.TestContext;
import com.testx.web.api.selenium.restassured.qe.ui.enums.ApplicationInputs;
import com.testx.web.api.selenium.restassured.qe.ui.pageobjects.LoginPage;
import com.testx.web.api.selenium.restassured.qe.ui.pageobjects.ResetPassword;
import com.testx.web.api.selenium.restassured.qe.ui.webdriver.DriverManagerUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.util.Map;
import org.testng.Assert;

public class LoginStepDef {

    public static Map<String, String> loginDetails;
    public static Map<String, String> testEmailId;
    public JsonUtil jsonReader = new JsonUtil();
    LoginPage loginPage;
    ResetPassword resetPassword;

    public LoginStepDef(TestContext testContext){
        this.loginPage = new LoginPage(testContext);
        this.resetPassword=new ResetPassword(testContext);
    }

    @When("User enter the login details for {string}")
    public void userEnterTheLoginDetailsFor(String userType) {
        try {
            loginDetails = jsonReader.getData("LoginDetails", userType);
            loginPage.enterUserName(loginDetails.get("UserName"));
            loginPage.enterPassword(loginDetails.get("Password"));
            loginPage.clickNextButton();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @When("User enters email on Login Page {string}")
    public void userEntersEmailOnLoginPage(String email) {
        loginPage.enterUserName(email);
    }

    @When("User enters password on Login Page {string}")
    public void userEntersPasswordOnLoginPage(String password) {
        loginPage.enterPassword(password);
    }

    @When("User enter the stored password in Login Page")
    public void userEnterStoredPasswordFromTestVariables() {
        loginPage.enterPassword(TestVariables.getValue("password"));
    }

    @When("User clicks Next Button in Login Page")
    public void userClicksNextButtonInLoginPage() {
        loginPage.clickNextButton();
    }

    @Then("User is able to see email field value already present in Login Page")
    public void verifyUserNameFieldValue() {
        Assert.assertEquals(loginPage.getInputEmailText(), TestVariables.getValue("email"));
    }

    @And("User verify Error Message {string} on Login Page")
    @And("User is able to see {string} text on Login Page")
    public void verifyButtonPresent(String label) {
        Assert.assertTrue(loginPage.isElementPresent(label));
    }

    @And("User is able to see Log In Header text on Log In Page")
    public void verifyLogInHeaderTextOnLogInPage() {
        Assert.assertEquals(loginPage.getLogInHeaderText(), ApplicationInputs.SIGN_IN_HEADER.getValue());
    }

    @And("User is able to see {string} sub text on Login Page")
    public void verifyLogInHeaderSubTextOnLogInPage(String expectedText) {
        Assert.assertEquals(loginPage.getLogInHeaderSubText(), expectedText);
    }

    @And("User is able to see Sign Up text on Login Page")
    public void verifyLogInTextOnSignUpPage() {
        Assert.assertEquals(loginPage.getSignUpText(), ApplicationInputs.SIGN_UP.getValue());
    }

    @And("User is able to see Email text on Login Page")
    public void verifyEmailTextOnLoginPage() {
        Assert.assertEquals(loginPage.getEmailLabelText(), ApplicationInputs.EMAIL.getValue());
    }

    @And("User is able to see Email input box on Login Page")
    public void verifyEmailInputBoxOnLoginPage() {
        Assert.assertTrue(loginPage.isEmailInputBoxDisplayed());
    }

    @And("User is able to see Password text on Login Page")
    public void verifyPasswordTextOnLoginPage() {
        Assert.assertEquals(loginPage.getPasswordLabelText(), ApplicationInputs.PASSWORD.getValue());
    }

    @And("User is able to see Password input box on Login Page")
    public void verifyPasswordInputBoxOnLoginPage() {
        Assert.assertTrue(loginPage.isPasswordInputBoxDisplayed());
    }

    @And("User is able to see Next text on Login Page")
    public void verifyNextTextOnLoginPage() {
        Assert.assertEquals(loginPage.getNextButtonText(), ApplicationInputs.NEXT.getValue());
    }

    @And("User is able to see Forget Password Link on Login Page")
    public void verifyForgetPasswordLinkOnLoginPage() {
        Assert.assertEquals(loginPage.getForgetPasswordLinkText(), ApplicationInputs.FORGOT_PASSWORD.getValue());
    }

    @When("User clicks on Forget Password Link on Login Page")
    public void userClicksOnForgetPasswordLinkOnLoginPage() {
        loginPage.clickForgetPasswordLink();
    }

    @When("User clicks Sign Up button on Login Page")
    public void userClicksLogInButtonOnSignUpPage() {
        loginPage.clickSignUpButton();
    }

    @Then("User is able to see Biometric Lock Image on Biometrics Page")
    public void verifyBiometricLockImageOnBiometricsPage() {
        Assert.assertTrue(loginPage.isBiometricLockDisplayed());
    }

    @And("User is able to see {string} heading on Biometrics Page")
    public void verifyHeadingOnBiometricsPage(String expectedText) {
        if (DriverManagerUtils.configuration.mobilePlatform().equalsIgnoreCase("android")) {
            Assert.assertEquals(loginPage.getBiometricHeaderText(), expectedText);
        } else {
            Assert.assertEquals(loginPage.getBiometricHeaderText(), ApplicationInputs.BIOMETRIC_HEADING.getValue());
        }
    }

    @And("User is able to see {string} Settings Info on Biometrics Page")
    public void verifySettingsInfoOnBiometricsPage(String expectedText) {
        Assert.assertEquals(loginPage.getBiometricSettingsInfoText(), expectedText);
    }

    @And("User is able to see Turn on Biometrics text on Biometrics Page")
    public void verifyTurnOnBiometricsTextOnBiometricsPage() {
        Assert.assertTrue(loginPage.checkBiometric(ApplicationInputs.TURN_ON_BIOMETRICS.getValue()));
    }

    @And("User is able to see Not Now text on Biometrics Page")
    public void verifyNotNowTextOnBiometricsPage() {
        Assert.assertEquals(loginPage.getBiometricNotNowLinkText(), ApplicationInputs.NOT_NOW.getValue());
    }

    @Then("User is redirected to the Reset Password Page")
    public void userLandsOnResetPasswordPage() {
        Assert.assertTrue(resetPassword.isResetPasswordPageDisplayed());
    }

    @And("User is able to see Reset Your Password text on Reset Password Page")
    public void verifyResetYourPasswordTitle() {
        Assert.assertEquals(resetPassword.getResetYourPasswordText(), ApplicationInputs.RESET_YOUR_PASSWORD.getValue());
    }

    @And("User is able to see Reset Password Body on Reset Password Page")
    public void verifyResetPasswordBody() {
        Assert.assertEquals(resetPassword.getResetPasswordBodyText(), ApplicationInputs.RESET_PASSWORD_BODY.getValue());
    }

    @And("User is able to see Email Text on Reset Password Page")
    public void verifyEmailText() {
        Assert.assertEquals(resetPassword.getEmailTextOnResetPasswordPage(), ApplicationInputs.EMAIL.getValue());
    }

    @And("User is able to see Email input box on Reset Password Page")
    public void verifyEmailInputBoxOnResetPasswordPage() {
        Assert.assertTrue(resetPassword.isResetPasswordEmailInputPresent());
    }

    @And("User is able to see Remember your password Text on Reset Password Page")
    public void verifyRememberYourPasswordText() {
        Assert.assertEquals(resetPassword.getRememberYourPasswordText(), ApplicationInputs.REMEMBER_YOUR_PASSWORD.getValue());
    }

    @And("User is able to see Log In Link text on Reset Password Page")
    public void verifyLogInLinkTextOnResetPasswordPage() {
        Assert.assertEquals(resetPassword.getLoginLinkText(), ApplicationInputs.SIGN_IN.getValue());
    }

    @And("User is able to see Send Me a Recovery Link on Reset Password Page")
    public void verifySendMeARecoveryLink() {
        Assert.assertEquals(resetPassword.getSendMeARecoveryLink(), ApplicationInputs.SEND_ME_A_RECOVERY_LINK.getValue());
    }

    @And("User is able to see {string} text on Reset Password Page")
    public void verifyButtonOnResetPasswordPage(String buttonName) {
        Assert.assertTrue(resetPassword.isElementPresent(buttonName));
    }

    @When("User input {string} in Email input on Reset Password Page")
    public void userInputInEmailInputOnResetPasswordPage(String userEmailType) {
        try {
            testEmailId = jsonReader.getData("TestEmailId", userEmailType);
            resetPassword.enterTextInEmailField(testEmailId.get("emailId"));
        } catch (Exception exception){
            exception.printStackTrace();
        }
    }

    @Then("User is redirected to Recovery Link sent Page")
    public void userIsRedirectedToRecoveryLinkSentPage() {
        Assert.assertTrue(resetPassword.isRecoveryLinkSentPageDisplayed());
    }

    @And("User is able to see Close button on Reset Password Page")
    public void verifyCloseButtonIsPresentOnResetPasswordPage() {
        Assert.assertTrue(resetPassword.isCloseButtonPresent());
    }

    @Then("User is able to see Error Message for {string}")
    public void userSeeErrorMessageFor(String errorMessage) {
        Assert.assertEquals(resetPassword.getErrorText(), errorMessage);
    }

    @When("User clicks on Send Me a Recovery Link on Reset Password Page")
    public void userClicksOnSendMeARecoveryLinkOnResetPasswordPage() {
        resetPassword.clickOnSendMeRecoveryLink();
    }

    @When("User clicks Log In button on Reset Password Page")
    public void userClicksLogInButtonOnResetPasswordPage() {
        resetPassword.clickLoginLink();
    }

    @When("User clicks on Return To Login Link on Recovery Link Sent Page")
    public void userClicksOnReturnToLoginLinkOnRecoveryLinkSentPage() {
        resetPassword.clickReturnToLoginLink();
    }

    @And("User clicks Close button on Recovery Link Sent Page")
    public void userClicksCloseButtonOnRecoveryLinkSentPage() {
        resetPassword.clickCloseButton();
    }

    @And("User enters field values in login Page:")
    public void userFIllFieldValues(Map<String,String> map) {
        map.forEach((key, value) -> {
            if (TestVariables.variables.containsKey(value)) {
                value = TestVariables.getValue(value);
            }
            loginPage.enterText(key, value);
        });
    }
}
