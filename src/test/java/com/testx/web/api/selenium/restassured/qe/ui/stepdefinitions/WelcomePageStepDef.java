package com.testx.web.api.selenium.restassured.qe.ui.stepdefinitions;

import com.testx.web.api.selenium.restassured.qe.ui.context.TestContext;
import com.testx.web.api.selenium.restassured.qe.ui.enums.ApplicationInputs;
import com.testx.web.api.selenium.restassured.qe.ui.pageobjects.ContinueAsGuestPage;
import com.testx.web.api.selenium.restassured.qe.ui.pageobjects.SignUpPage;
import com.testx.web.api.selenium.restassured.qe.ui.pageobjects.WelcomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class WelcomePageStepDef {
    WelcomePage welcomePage;
    ContinueAsGuestPage continueAsGuestPage;
    SignUpPage signUpPage;

  public WelcomePageStepDef(TestContext testContext) {
      this.welcomePage = new WelcomePage(testContext);
      this.continueAsGuestPage = new ContinueAsGuestPage(testContext);
      this.signUpPage = new SignUpPage(testContext);
    }

    @Given("User is on Welcome Page")
    @And("User is able to see Family Dollar Icon on Welcome Page")
    public void userIsOnWelcomePage() {
        Assert.assertTrue(welcomePage.isFDIconDisplayed());
    }

    @When("User clicks Continue as Guest button on Sign Up Page")
    @When("User clicks Continue as Guest button on Welcome Page")
    public void userClicksContinueAsGuestButtonOnWelcomePage() {
        welcomePage.clickContinueAsGuestButton();
    }

    @When("User clicks Log In button on Welcome Page")
    public void userClicksLogInButtonOnWelcomePage() {
        welcomePage.clickLoginButton();
    }

    @When("User clicks Sign Up button on Welcome Page")
    public void userClicksSignUpButtonOnWelcomePage() {
        welcomePage.clickSignUpButton();
    }

    @Then("User is able to see Tailored Landing screen for guests")
    public void verifyTailoredLandingScreenForGuests() {
        Assert.assertTrue(welcomePage.isTailoredScreenDisplayed());
    }

    @And("User is able to see {string} header text on welcome screen")
    public void verifyHeaderTextOnWelcomeScreen(String expectedText) {
        Assert.assertEquals(welcomePage.getHeaderText(), expectedText);
    }

    @And("User is able to see {string} sub text on welcome screen")
    public void verifyHeaderDescriptionOnWelcomeScreen(String expectedText) {
        Assert.assertEquals(welcomePage.getHeaderDescription(), expectedText);
    }

    @And("The length of header subtext should be maximum of {int} character")
    public void verifyLengthOfSubtextShouldBeWithAMaximumOfCharacter(int expectedLength) {
        Assert.assertTrue(welcomePage.getHeaderDescription().length() < expectedLength);
    }

    @Then("User is redirected to the login page")
    public void userIsRedirectedToTheLoginPage() {
        Assert.assertTrue(welcomePage.isLoginPageDisplayed());
    }

    @Then("User is on Sign Up page")
    @Then("User is redirected to the Sign Up page")
    public void userIsRedirectedToTheSignUpPage() {
        Assert.assertTrue(welcomePage.isSignUpPageDisplayed());
    }

    @When("User verify header {string} on Continue as Guest popup dialog")
    @When("User verify header {string} on Choose a store popup dialog")
    public void getHeaderPopUpMessage(String expectedMessage) {
        Assert.assertEquals(continueAsGuestPage.getHeaderAlertText(), expectedMessage);
    }

    @When("User verify subTitle {string} on Continue as Guest popup dialog")
    public void getBodyPopUpMessage(String expectedMessage) {
        Assert.assertEquals(continueAsGuestPage.getSubTitleText(), expectedMessage);
    }

    @When("User click close button on Continue as Guest popup dialog")
    public void clickCloseButtonOnContinueAsGuestPopupDialog() {
        continueAsGuestPage.clickClose();
    }

    @Then("User verify Continue as Guest link text on Continue As Guest popup dialog")
    public void verifyContinueAsGuestLinkTextOnPopupDialog() {
        Assert.assertEquals(continueAsGuestPage.getContinueAsGuestLinkText(), ApplicationInputs.CONTINUE_AS_GUEST.getValue());
    }

    @When("User click Continue as Guest link on popup dialog")
    public void clickBtnOrLink() {
        continueAsGuestPage.clickContinueAsGuestLink();
    }

    @When("User clicks Enter my Zip Code button on Enable My Location Page")
    public void clickEnterMyZipCode() {
        continueAsGuestPage.clickEnterMyZipCode();
    }

    @When("User clicks Enable Location Services button on Choose a Store Page")
    public void clickEnableLocationServicesButton() {
        continueAsGuestPage.clickEnableLocationBtn();
    }

    @And("User verify Sign Up Now link text on Continue As Guest popup dialog")
    public void userVerifySignUpNowLinkTextOnContinueAsGuestPopupDialog() {
        Assert.assertEquals(continueAsGuestPage.getSignUpNowLinkText(), ApplicationInputs.SIGN_UP_NOW.getValue());
    }

    @When("User click Sign Up Now link on popup dialog")
    public void userClickSignUpNowLinkOnPopupDialog() {
        continueAsGuestPage.clickSignUpNowLinkLink();
    }

    @When("User clicks {string} button on Device Location pop up")
    public void userClicksButtonOnEnableMyLocationPage(String label) {
        welcomePage.clickOnDeviceLocationButton(label);
    }

    @When("User select Only this time on Device Location pop up")
    public void userSelectOnlyThisTimeOnDeviceLocationPopUp() {
        welcomePage.clickOnlyThisTimeOnDeviceLocationPopUp();
    }

    @And("User is able to see Continue as Guest button on Sign Up Page")
    @And("User is able to see Continue as Guest button on Welcome Page")
    public void verifyContinueAsGuestButtonOnWelcomePage() {
        Assert.assertTrue(welcomePage.isContinueAsGuestTextPresent());
    }

    @And("User is able to see Log In button on Welcome Page")
    public void verifyLogInButtonOnWelcomePage() {
        Assert.assertTrue(welcomePage.isLogInTextPresent());
    }

    @And("User is able to see Sign Up button on Welcome Page")
    public void verifySignUpButtonOnWelcomePage() {
        Assert.assertTrue(welcomePage.isSignUpTextPresent());
    }

    @Then("User is able to see Location Image on Enable My Location Page")
    public void verifyLocationImageOnEnableMyLocationPage() {
        Assert.assertTrue(continueAsGuestPage.isLocationImageDisplayed());
    }

    @Then("User is able to see {string} title on Enable My Location Page")
    public void verifyTitleOnEnableMyLocationPage(String expectedText) {
        Assert.assertEquals(continueAsGuestPage.getEnableMyLocationTitleText(), expectedText);
    }

    @And("User is able to see {string} Location Instruction1 on Enable My Location Page")
    public void verifyLocationInstruction1OnEnableMyLocationPage(String expectedText) {
        Assert.assertEquals(continueAsGuestPage.getEnableMyLocationInstruction1Text(), expectedText);
    }

    @And("User is able to see {string} Location Instruction2 on Enable My Location Page")
    public void verifyLocationInstruction2OnEnableMyLocationPage(String expectedText) {
        Assert.assertEquals(continueAsGuestPage.getEnableMyLocationInstruction2Text(), expectedText);
    }

    @And("User is able to see {string} Location Instruction3 on Enable My Location Page")
    public void verifyLocationInstruction3OnEnableMyLocationPage(String expectedText) {
        Assert.assertEquals(continueAsGuestPage.getEnableMyLocationInstruction3Text(), expectedText);
    }

    @And("User is able to see Share My Location text on Enable My Location Page")
    public void verifyShareMyLocationTextOnEnableMyLocationPage() {
        Assert.assertEquals(continueAsGuestPage.getShareMyLocationText(), ApplicationInputs.SHARE_MY_LOCATION.getValue());
    }

    @And("User is able to see Enter my ZIP Code text on Enable My Location Page")
    public void verifyEnterMyZIPCodeTextOnEnableMyLocationPage() {
        Assert.assertEquals(continueAsGuestPage.getEnterMyZipCodeText(), ApplicationInputs.ENTER_MY_ZIP_CODE.getValue());
    }

    @And("User is able to see Skip link text on Enable My Location Page")
    public void verifySkipTextOnEnableMyLocationPage() {
        Assert.assertEquals(signUpPage.getSkipTextOnEnableMyLocationPage(), ApplicationInputs.SKIP.getValue());
    }

    @Then("User is able to see {string} title on Enable My Location PopUp Page")
    public void verifyTitleOnEnableMyLocationPopUpPage(String expectedText) {
        Assert.assertEquals(continueAsGuestPage.getHeaderAlertText(), expectedText);
    }

    @And("User is able to see {string} sub text on Enable My Location PopUp Page")
    public void verifySubTextOnEnableMyLocationPopUpPage(String expectedText) {
        Assert.assertEquals(continueAsGuestPage.getSubTitleText(), expectedText);
    }

    @And("User is able to see Skip link text on Enable My Location PopUp Page")
    public void verifySkipLinkTextOnEnableMyLocationPopupPage() {
        Assert.assertEquals(signUpPage.getSkipLinkTextOnEnableMyLocationPopUpPage(), ApplicationInputs.SKIP.getValue());
    }

    @Then("User is able to see Set Location Settings link text on Enable My Location PopUp Page")
    public void verifySetLocationSettingsLinkTextOnEnableMyLocationPopupPage() {
        Assert.assertEquals(continueAsGuestPage.getSignUpNowLinkText(), ApplicationInputs.SET_LOCATION_SETTINGS.getValue());
    }

    @And("User is able to see close button")
    public void verifyCloseButton() {
        Assert.assertTrue(continueAsGuestPage.isCloseButtonDisplayed());
    }

    @Then("User is able to see Email Image on Enable Notification Page")
    public void verifyEmailImageOnEnableNotificationPage() {
        Assert.assertTrue(continueAsGuestPage.isEmailImageDisplayed());
    }

    @And("User is able to see {string} title on Enable Notification Page")
    public void verifyTitleOnEnableNotificationPage(String expectedText) {
        Assert.assertEquals(continueAsGuestPage.getEnableNotificationTitleText(), expectedText);
    }

    @And("User is able to see {string} body text on Enable Notification Page")
    public void verifyBodyTextOnEnableNotificationPage(String expectedText) {
        Assert.assertEquals(continueAsGuestPage.getEnableNotificationBodyText(), expectedText);
    }

    @And("User is able to see {string} body text2 on Enable Notification Page")
    public void verifyBodyText2OnEnableNotificationPage(String expectedText) {
        Assert.assertEquals(continueAsGuestPage.getEnableNotificationBodyText2(), expectedText);
    }

    @And("User is able to see Enable Notifications text on Enable Notification Page")
    public void verifyEnableNotificationsTextOnEnableNotificationPage() {
        Assert.assertEquals(continueAsGuestPage.getEnableNotificationsText(), ApplicationInputs.ENABLE_NOTIFICATIONS.getValue());
    }

    @And("User is able to see Not Now text on Enable Notification Page")
    public void verifyNotNowTextOnEnableNotificationPage() {
        Assert.assertEquals(continueAsGuestPage.getNotNowText(), ApplicationInputs.NOT_NOW.getValue());
    }
}
