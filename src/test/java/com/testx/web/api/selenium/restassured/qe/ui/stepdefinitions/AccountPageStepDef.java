package com.testx.web.api.selenium.restassured.qe.ui.stepdefinitions;

import com.testx.web.api.selenium.restassured.qe.ui.context.TestContext;
import com.testx.web.api.selenium.restassured.qe.ui.enums.ApplicationInputs;
import com.testx.web.api.selenium.restassured.qe.ui.pageobjects.AccountPage;
import com.testx.web.api.selenium.restassured.qe.ui.pageobjects.ProfilePage;
import com.testx.web.api.selenium.restassured.qe.ui.webdriver.DriverManagerUtils;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.util.List;
import org.junit.Assert;

public class AccountPageStepDef {
    AccountPage accountPage;
    ProfilePage profilePage;

    public AccountPageStepDef(TestContext testContext) {
        this.accountPage = new AccountPage(testContext);
        this.profilePage = new ProfilePage(testContext);
    }

    @Then("User is able to see Account header on Account Page")
    @Then("User move to Account Page")
    public void userMoveToAccountPage() {
        Assert.assertEquals(accountPage.getAccountHeaderText(), ApplicationInputs.ACCOUNT.getValue());
    }

    @And("User scroll to Legal on Account Page")
    public void userScrollToLegalSectionOnAccountPage() {
        accountPage.scrollToLegalSection();
    }

    @And("User scroll to Family Dollar Employee on Profile Page")
    public void userScrollToFDEmployeeProfilePage() {
        profilePage.scrollToFDEmployeeSection();
    }

    @And("User scroll to Support on Account Page")
    public void userScrollToSupportSectionOnAccountPage() {
        accountPage.scrollToSupportSection();
    }

    @And("User is able to see {string} text on Profile PopUp Page")
    @And("User is able to see {string} text on Profile Page")
    @And("User is able to see {string} text on Account Settings Page")
    @And("User is able to see {string} text on Account Page")
    public void verifyTextOnAccountPage(String label) {
        Assert.assertTrue(accountPage.isElementPresent(label));
    }

    @And("User is able to see {string} link on Account Page")
    public void verifyTextLinkOnAccountPage(String label) {
        if (DriverManagerUtils.configuration.mobilePlatform().equalsIgnoreCase("android")) {
            Assert.assertTrue(accountPage.isElementPresent(label));
        } else {
            Assert.assertTrue(accountPage.isElementPresent(label + " Link"));
        }
    }

    @And("User clicks {string} button on Profile PopUp Page")
    @When("User clicks {string} button on Profile Page")
    @When("User clicks {string} button on Account Page")
    public void userClicksButtonOnAccountPage(String label) {
        accountPage.clickButton(label);
    }

    @When("User clicks {string} link on Account Page")
    public void userClicksLinkOnAccountPage(String label) {
        if (DriverManagerUtils.configuration.mobilePlatform().equalsIgnoreCase("android")) {
            accountPage.clickButton(label);
        } else {
            accountPage.clickButton(label + " Link");
        }
    }

    @When("User clicks {string} button on More Page")
    public void userClicksButtonOnMorePage(String label) {
        accountPage.clickButton(label);
    }

    @And("User is able to see {string} text on Web view Page")
    public void verifyHeaderTextOnWebViewPage(String label) {
        Assert.assertTrue(accountPage.isWebViewHeaderTextDisplayed(label));
    }

    @When("User clicks close button on web view page")
    public void userClicksCloseButtonOnWebViewPage() {
        accountPage.closeWebView();
    }

    @Then("User verify Back Button is present on Privacy Options Page")
    @Then("User verify Back Button is present on App Settings Page")
    @Then("User verify Back Button is present on Communication Page")
    public void verifyBackButtonOnCommunicationPage() {
        Assert.assertTrue(accountPage.isBackButtonPresent());
    }

    @When("User clicks Back Button on Mobile SMS Communications Page")
    @When("User clicks Back Button on App Settings Page")
    @When("User clicks Back Button on Communication Page")
    public void userClicksBackButtonOnCommunicationPage() {
        accountPage.clickCommunicationBackButton();
    }

    @Then("User verify Back Button is present on Profile Page")
    public void verifyBackButtonOnProfilePage() {
        Assert.assertTrue(profilePage.isProfileBackButtonPresent());
    }

    @Then("User verify Privacy Options Header is present")
    @Then("User verify App Settings Header is present")
    @Then("User verify Communication Header is present")
    public void userVerifyCommunicationHeaderIsPresent() {
        Assert.assertTrue(accountPage.isCommunicationHeaderPresent());
    }

    @When("User clicks on Push Notification Toggle button")
    public void userClicksOnPushNotificationToggleButton() {
        accountPage.clickPushNotificationToggleButton();
    }

    @Then("User verify Push Notification is enabled")
    public void verifyPushNotificationIsEnabled() {
        Assert.assertTrue(accountPage.isPushNotificationsToggleEnabled());
    }

    @Then("User verify Push Notification is disabled")
    public void verifyPushNotificationIsDisabled() {
        Assert.assertTrue(accountPage.isPushNotificationsToggleEnabled());
    }

    @When("User clicks on Email Updates Toggle button")
    public void userClicksOnEmailUpdatesToggleButton() {
        accountPage.clickEmailUpdatesToggleButton();
    }

    @Then("User verify Email Updates is enabled")
    public void verifyEmailUpdatesIsEnabled() {
        Assert.assertTrue(accountPage.isEmailUpdatesToggleEnabled());
    }

    @Then("User verify Email Updates is disabled")
    public void userVerifyEmailUpdatesIsDisabled() {
        Assert.assertTrue(accountPage.isEmailUpdatesToggleEnabled());
    }

    @When("User clicks on Biometrics Toggle button")
    public void userClicksOnBiometricsToggleButton() {
        accountPage.clickBiometricToggleButton();
    }

    @Then("User verify Biometrics is enabled")
    public void userVerifyBiometricsIsEnabled() {
        Assert.assertTrue(accountPage.isBiometricToggleEnabled());
    }

    @Then("User verify Biometrics is disabled")
    public void userVerifyBiometricsIsDisabled() {
        Assert.assertTrue(accountPage.isBiometricToggleEnabled());
    }

    @When("User clicks on Share Shopping Information Toggle button")
    public void userClicksOnShareShoppingInformationToggleButton() {
        accountPage.clickShareShoppingInformationToggleButton();
    }

    @Then("User verify Share Shopping Information is enabled")
    public void userVerifyShareShoppingInformationIsEnabled() {
        Assert.assertTrue(accountPage.isShareShoppingInformationToggleEnabled());
    }

    @Then("User verify Share Shopping Information is disabled")
    public void userVerifyShareShoppingInformationIsDisabled() {
        Assert.assertTrue(accountPage.isShareShoppingInformationToggleEnabled());
    }

    @Then("User is able to see close button on Profile PopUp Page")
    public void verifyCloseButtonOnProfilePopUpPage() {
        Assert.assertTrue(profilePage.isProfilePopupCloseButtonDisplayed());
    }

    @Then("User is able to see Verify button on Profile PopUp Page")
    @Then("User is able to see Save button on Profile PopUp Page")
    public void verifySaveButtonOnProfilePopUpPage() {
        Assert.assertTrue(profilePage.isProfilePopupSaveButtonDisplayed());
    }

    @Then("User is able to see Name button on Profile Page")
    public void verifyNameButtonOnProfilePopUpPage() {
        Assert.assertTrue(profilePage.isNameButtonDisplayed());
    }

    @When("User enters {string} in First Name Edit input box")
    public void userEntersInFirstNameEditInputBox(String firstName) {
        profilePage.updateFirstName(firstName);
    }

    @When("User enters {string} in Last Name Edit input box")
    public void userEntersInLastNameEditInputBox(String lastName) {
        profilePage.updateLastName(lastName);
    }

    @And("User clicks on Verify button on Profile Update Page")
    @And("User clicks on Save button on Profile Update Page")
    public void userClicksOnSaveButtonOnProfileUpdatePage() {
        profilePage.clickSaveButton();
    }

    @And("User clicks on Close button on Profile Update Page")
    public void userClicksOnCloseButtonOnProfileUpdatePage() {
        profilePage.clickCloseButton();
    }

    @And("User enters {string} in Date Of Birth Edit input box")
    public void userEntersInDateOfBirthEditInputBox(String dob) {
        profilePage.updateDOB(dob);
    }

    @And("User enters {string} in Zip Code Edit input box")
    public void userEntersInZipCodeEditInputBox(String zipCode) {
        profilePage.updateZipCode(zipCode);
    }

    @And("User enters {string} in Email Edit input box")
    public void userEntersInEmailEditInputBox(String email) {
        profilePage.updateEmail(email);
    }

    @When("User enters {string} in Phone Number Edit input box")
    public void userEntersInPhoneNumberEditInputBox(String phoneNumber) {
        profilePage.updatePhoneNumber(phoneNumber);
    }

    @When("User enters {string} in Associate ID Edit input box")
    public void userEntersInAssociateIDEditInputBox(String associateID) {
        profilePage.updateAssociateID(associateID);
    }

    @When("User clicks on Profile Back Button")
    public void userClicksOnProfileBackButton() {
        profilePage.clickOnProfileBackButton();
    }

    @Then("User is able to see First Name Text {string} In Edit Input Box")
    public void verifyFirstNameTextInEditInputBox(String firstName) {
        Assert.assertEquals(profilePage.getFirstNameText(), firstName);
    }

    @Then("User is able to see Last Name Text {string} In Edit Input Box")
    public void verifyLastNameTextInEditInputBox(String lastName) {
        Assert.assertEquals(profilePage.getLastNameText(), lastName);
    }

    @When("User clicks Edit button on Account Page")
    public void userClicksEditButtonOnAccountPage() {
        accountPage.clickProfileEditButton();
    }

    @When("User clicks Name button on Profile Page")
    public void userClicksNameButtonOnAccountPage() {
        accountPage.clickNameButton();
    }

    @And("User is able to see labels on Profile PopUp Page")
    @And("User is able to see labels on Profile Page")
    @And("User is able to see labels on Account Page")
    public void verifyLabelsOnAccountPage(DataTable table) {
        List<String> expectedTextList = table.asList();
        for (String expectedText : expectedTextList) {
            Assert.assertTrue(accountPage.getAllLabelText().contains(expectedText));
        }
    }

    @When("User clicks OK button on Profile PopUp Page")
    public void userClicksOKButtonOnProfilePopUpPage() {
        profilePage.clickOnProfilePopUpOKButton();
    }

    @And("User is able to see Email Text {string} In Edit Input Box")
    @And("User is able to see Zip Code Text {string} In Edit Input Box")
    public void verifyZipCodeTextInEditInputBox(String expectedText) {
        Assert.assertEquals(profilePage.getInputText(), expectedText);
    }

    @And("User is able to see {string} text on Profile PopUp Edit Page")
    public void verifyTextOnProfilePopUpEditPage(String label) {
        Assert.assertTrue(profilePage.isElementPresent(label));
    }

    @Then("User is able to see Password Text {string} In Edit Input Box")
    public void verifyPasswordTextInEditInputBox(String password) {
        Assert.assertEquals(profilePage.getPasswordText(), password);
    }

    @When("User clicks Add your Associate Id Number button on Profile Page")
    public void userClicksAddYourAssociateIdNumberButtonOnProfilePage() {
        profilePage.clickOnAddAssociatedIdButton();
    }

    @Then("User is able to see Profile header text on Profile Page")
    public void verifyProfileHeaderTextOnProfilePage() {
        Assert.assertEquals(profilePage.getProfileText(), ApplicationInputs.PROFILE.getValue());
    }

    @When("User clicks sign out button in account page")
    @When("User clicks sign out button in Profile page")
    public void userClicksSignOutButtonOnProfilePage() {
        accountPage.clickSignOutButton();
    }

    @Then("User is able to see sign out button in account page")
    @Then("User is able to see sign out button in Profile page")
    public void isSignOutButtonPresent() {
       Assert.assertTrue(accountPage.isSignOutButtonPresent());
    }

    @And("User is able to see Next button is Disabled on Profile PopUp Page")
    public void verifyNextButtonIsDisabledOnProfilePopUpPage() {
        Assert.assertFalse(profilePage.isNextButtonEnabled());
    }

    @Then("User is able to see Next button is Enabled on Profile PopUp Page")
    public void verifyNextButtonIsEnabledOnProfilePopUpPage() {
        Assert.assertTrue(profilePage.isNextButtonEnabled());
    }

    @Then("User is able to see Delete Your Account header text on Delete Account Page")
    public void verifyDeleteYourAccountHeaderTextOnDeleteAccountPage() {
        Assert.assertEquals(profilePage.getDeleteAccountPageHeader(), ApplicationInputs.DELETE_YOUR_ACCOUNT.getValue());
    }

    @Then("User is able to see {string} title on Delete Account Page")
    public void verifyReadCarefullyTitleTextOnDeleteAccountPage(String expectedTitle) {
        Assert.assertEquals(profilePage.getDeleteAccountPageTitle(), expectedTitle);
    }

    @And("User is able to see {string} Description1 on Delete Account Page")
    public void verifyReadCarefullyDescription1TextOnDeleteAccountPage(String expectedTitle) {
        Assert.assertEquals(profilePage.getDeleteAccountPageDescription1(), expectedTitle);
    }

    @And("User is able to see {string} Description2 on Delete Account Page")
    public void verifyReadCarefullyDescription2TextOnDeleteAccountPage(String expectedTitle) {
        Assert.assertEquals(profilePage.getDeleteAccountPageDescription2(), expectedTitle);
    }

    @When("User clicks Back Button on Delete Account Page")
    public void userClicksBackButtonOnDeleteAccountPage() {
        profilePage.clickBackButtonOnDeleteAccountPage();
    }

    @Then("User is able to see {string} text on Empty Cart Page for Guest User")
    @Then("User is able to see {string} text on Account Page for Guest User")
    public void verifyTitleTextOnAccountPageForGuestUser(String expectedText) {
        Assert.assertEquals(accountPage.getAccountTitleText(), expectedText);
    }

    @Then("User is able to see {string} sub text on Empty Cart Page for Guest User")
    @Then("User is able to see {string} sub text on Account Page for Guest User")
    public void verifySubTitleTextOnAccountPageForGuestUser(String expectedText) {
        Assert.assertEquals(accountPage.getAccountSubTitleText(), expectedText);
    }

    @And("User is able to see Log In link text on Empty Cart page")
    @And("User is able to see Log In link text on Account page")
    public void verifyLogInLinkTextOnAccountPage() {
        Assert.assertEquals(accountPage.getLogInLinkText(), ApplicationInputs.LOG_IN.getValue());
    }

    @When("User clicks Login button on Empty Cart page")
    @And("User clicks Login button on Account page")
    public void userClickLogInButtonOnAccountPage() {
        accountPage.clickLogInButton();
    }

    @And("User is able to see Create one link text on Empty Cart page")
    @And("User is able to see Create one link text on Account page")
    public void verifyCreateOneLinkTextOnAccountPage() {
        Assert.assertEquals(accountPage.getCreateOneLinkText(), ApplicationInputs.CREATE_ONE.getValue());
    }

    @When("User clicks Create One button on Empty Cart page")
    @And("User clicks Create One button on Account page")
    public void userClickCreateOneButtonOnAccountPage() {
        accountPage.clickCreateOneButton();
    }

    @Then("User is able to see {string} text on Account Page for Logged In User")
    @Then("User is able to see {string} text on Payment Card Details Page")
    @Then("User is able to see {string} text on More Page for Logged In User")
    public void verifyTitleTextOnAccountPageForLoggedInUser(String expectedText) {
        Assert.assertTrue(accountPage.getUserInfoText().contains(expectedText));
    }

    @Then("User is able to see Personal and Contact Information text on Account Page for Logged In User")
    public void verifyPersonalAndContactInformationTextOnAccountPageForLoggedInUser() {
        Assert.assertEquals(accountPage.getPersonalInfoText(), ApplicationInputs.PERSONAL_CONTACT.getValue());
    }

    @Then("User is able to see Edit Link text on Account Page for Logged In User")
    public void verifyEditLinkTextOnAccountPageForLoggedInUser() {
        Assert.assertEquals(accountPage.getEditText(), ApplicationInputs.EDIT.getValue());
    }

    @Then("User is able to see For Your Store text on Account Page for Logged In User")
    public void verifyForYourStoreTextOnAdsAndBooksPage() {
        Assert.assertEquals(accountPage.getYourStoreText(), ApplicationInputs.YOUR_STORE.getValue());
    }

    @Then("User is able to see Store Address text on Account Page for Logged In User")
    public void verifyStoreAddressTextOnAdsAndBooksPage() {
        Assert.assertTrue(accountPage.isStoreAddressPresent());
    }

    @Then("User is able to see Change Store text on Account Page for Logged In User")
    public void verifyChangeStoreTextOnAdsAndBooksPage() {
        Assert.assertEquals(accountPage.getChangeStoreText(), ApplicationInputs.CHANGE.getValue());
    }

    @And("User is able to see Account Settings text on Account Page")
    public void verifyAccountSettingsTextOnAccountPage() {
        Assert.assertEquals(accountPage.getAccountSettingsText(), ApplicationInputs.ACCOUNT_SETTINGS.getValue());
    }

    @And("User is able to see Communications text on Account Page")
    @And("User is able to see Communications text on More Page")
    public void verifyCommunicationsTextOnAccountPage() {
        Assert.assertEquals(accountPage.getCommunicationsText(), ApplicationInputs.COMMUNICATIONS.getValue());
    }

    @And("User clicks Communications button on More Page")
    public void userClicksCommunicationsButtonOnMorePage() {
        accountPage.clickCommunicationsButton();
    }

    @And("User is able to see App Settings text on Account Page")
    @And("User is able to see App Settings text on More Page")
    public void verifyAppSettingsTextOnAccountPage() {
        Assert.assertEquals(accountPage.getAppSettingsText(), ApplicationInputs.APP_SETTINGS.getValue());
    }

    @And("User clicks App Settings button on More Page")
    public void userClicksAppSettingsButtonOnMorePage() {
        accountPage.clickAppSettingsButton();
    }

    @And("User is able to see Support text on Account Page")
    public void verifySupportTextOnAccountPage() {
        Assert.assertEquals(accountPage.getSupportText(), ApplicationInputs.SUPPORT.getValue());
    }

    @And("User is able to see Help text on More Page")
    @And("User is able to see Help text on Account Page")
    public void verifyHelpTextOnAccountPage() {
        Assert.assertEquals(accountPage.getHelpText(), ApplicationInputs.HELP.getValue());
    }

    @And("User clicks Help button on Account Page")
    @And("User clicks Help button on More Page")
    public void userClickHelpButtonOnAccountPage() {
        accountPage.clickHelpButton();
    }

    @And("User is able to see Delete Account text on Account Page")
    @And("User is able to see Delete Account text on More Page")
    public void verifyDeleteAccountTextOnAccountPage() {
        Assert.assertEquals(accountPage.getDeleteAccountText(), ApplicationInputs.DELETE_ACCOUNT.getValue());
    }

    @And("User clicks Delete Account button on Account Page")
    @And("User clicks Delete Account button on More Page")
    public void userClickDeleteAccountButtonOnAccountPage() {
        accountPage.clickDeleteAccountButton();
    }

    @And("User is able to see FD {string} header text on Web Page")
    public void verifyFDHelpHeaderTextOnAccountPage(String expectedText) {
        Assert.assertEquals(accountPage.getWebPageHeaderText(), expectedText);
    }

    @And("User is able to see FD Visit Site Web Page")
    public void verifyFDVisitSiteWebPage() {
        if (DriverManagerUtils.configuration.mobilePlatform().equalsIgnoreCase("android")) {
            Assert.assertTrue(accountPage.isVisitSiteWebPageDisplayed());
        }
    }

    @And("User is able to see Legal text on Account Page")
    @And("User is able to see Legal text on More Page")
    public void verifyLegalTextOnAccountPage() {
        Assert.assertEquals(accountPage.getLegalText(), ApplicationInputs.LEGAL.getValue());
    }

    @And("User is able to see Privacy Policy text on Account Page")
    @And("User is able to see Privacy Policy text on Legal Page")
    public void verifyPrivacyPolicyTextOnAccountPage() {
        Assert.assertEquals(accountPage.getPrivacyPolicyText(), ApplicationInputs.PRIVACY_POLICY.getValue());
    }

    @And("User clicks Privacy Policy button on Account Page")
    @And("User clicks Privacy Policy button on Legal Page")
    public void userClickPrivacyPolicyButtonOnAccountPage() {
        accountPage.clickPrivacyPolicyButton();
    }

    @And("User clicks Allow While Using App button on Device Location pop up")
    public void userClickAllowWhileUsingAppButtonOnAccountPage() {
        accountPage.clickallowWhileUsingAppBtn();
    }

    @And("User is able to see Privacy Policy header text on Web Page")
    public void verifyPrivacyPolicyHeaderTextOnAccountPage() {
        Assert.assertEquals(accountPage.getPrivacyPolicyWebPageHeaderText(), ApplicationInputs.PRIVACY_POLICY.getValue());
    }

    @And("User is able to see Terms And Conditions text on Account Page")
    @And("User is able to see Terms And Conditions text on Legal Page")
    public void verifyTermsAndConditionsTextOnAccountPage() {
        Assert.assertEquals(accountPage.getTermsAndConditionsText(), ApplicationInputs.TERMS_AND_CONDITIONS.getValue());
    }

    @And("User clicks Terms And Conditions button on Account Page")
    @And("User clicks Terms And Conditions button on Legal Page")
    public void userClickTermsAndConditionsButtonOnAccountPage() {
        accountPage.clickTermsAndConditionsButton();
    }

    @And("User is able to see Terms And Conditions header text on Web Page")
    public void verifyTermsAndConditionsHeaderTextOnAccountPage() {
        Assert.assertEquals(accountPage.getTermsAndConditionsWebPageHeaderText(), ApplicationInputs.TERMS_AND_CONDITIONS.getValue());
    }

    @And("User is able to see Smart Coupons Terms text on Account Page")
    @And("User is able to see Smart Coupons Terms text on Legal Page")
    public void verifySmartCouponsTermsTextOnAccountPage() {
        Assert.assertEquals(accountPage.getSmartCouponsTermsText(), ApplicationInputs.SMART_COUPONS_TERMS.getValue());
    }

    @And("User clicks Smart Coupons Terms button on Account Page")
    @And("User clicks Smart Coupons Terms button on Legal Page")
    public void userClickSmartCouponsTermsButtonOnAccountPage() {
        accountPage.clickSmartCouponsTermsButton();
    }

    @And("User is able to see Smart Coupons Terms header text on Web Page")
    public void verifySmartCouponsTermsHeaderTextOnAccountPage() {
        Assert.assertEquals(accountPage.getSmartCouponsTermsWebPageHeaderText(), ApplicationInputs.SMART_COUPONS_TERMS.getValue());
    }

    @And("User is able to see Coupon Policy text on Account Page")
    @And("User is able to see Coupon Policy text on Legal Page")
    public void verifyCouponPolicyTextOnAccountPage() {
        Assert.assertEquals(accountPage.getCouponPolicyText(), ApplicationInputs.COUPON_POLICY.getValue());
    }

    @And("User clicks Coupon Policy button on Account Page")
    @And("User clicks Coupon Policy button on Legal Page")
    public void userClickCouponPolicyButtonOnAccountPage() {
        accountPage.clickCouponPolicyButton();
    }

    @And("User is able to see Coupon Policy header text on Web Page")
    public void verifyCouponPolicyHeaderTextOnAccountPage() {
        Assert.assertEquals(accountPage.getCouponPolicyWebPageHeaderText(), ApplicationInputs.COUPON_POLICY.getValue());
    }

    @And("User is able to see California Information Sharing Disclosure text on Account Page")
    public void verifyCaliforniaInformationSharingDisclosureTextOnAccountPage() {
        Assert.assertEquals(accountPage.getCaliforniaInformationText(), ApplicationInputs.CALIFORNIA_INFORMATION.getValue());
    }

    @And("User clicks California Information Sharing Disclosure button on Account Page")
    public void userClickCaliforniaInformationSharingDisclosureButtonOnAccountPage() {
        accountPage.clickCaliforniaInformationButton();
    }

    @And("User is able to see California Information Sharing Disclosure header text on Web Page")
    public void verifyCaliforniaInformationSharingDisclosureHeaderTextOnAccountPage() {
        Assert.assertEquals(accountPage.getCaliforniaInformationWebPageHeaderText(), ApplicationInputs.CALIFORNIA_INFORMATION.getValue());
    }

    @And("User is able to see Family Dollar Version Number on Account Page")
    public void verifyFamilyDollarVersionNumberOnAccountPage() {
        Assert.assertTrue(accountPage.isVersionNumberDisplayed());
    }

    @And("User is able to see Family Dollar Trade Mark text on Account Page")
    public void verifyFamilyDollarTradeMarkTextOnAccountPage() {
        Assert.assertTrue(accountPage.isTradeMarkTextDisplayed());
    }

    @Then("User is able to see Delete My Account text on Account Page")
    @Then("User is able to see Delete My Account text on Delete Account Page")
    public void verifyDeleteMyAccountTextOnAccountPage() {
        Assert.assertEquals(profilePage.getDeleteMyAccountText(), ApplicationInputs.DELETE_MY_ACCOUNT.getValue());
    }

    @And("User is able to see Keep My Account text on Account Page")
    @And("User is able to see Keep My Account text on Delete Account Page")
    public void verifyKeepMyAccountTextOnAccountPage() {
        Assert.assertEquals(profilePage.getKeepMyAccountText(), ApplicationInputs.KEEP_MY_ACCOUNT.getValue());
    }

    @And("User clicks Delete My Account button on Account Page")
    public void userClickDeleteMyAccountButtonOnAccountPage() {
        profilePage.clickDeleteMyAccountButton();
    }

    @And("User clicks Keep My Account button on Account Page")
    @And("User clicks Keep My Account button on More Page")
    public void userClickKeepMyAccountButtonOnAccountPage() {
        profilePage.clickKeepMyAccountButton();
    }

    @Then("User is able to see Delete Account Confirmation Popup Message")
    public void verifyDeleteAccountConfirmationPopupMessage() {
        Assert.assertEquals(profilePage.getDeleteAccountConfirmationPopupMessage(), ApplicationInputs.DELETE_ACCOUNT_CONFIRMATION.getValue());
    }

    @And("User is able to see Cancel text on Delete Account Confirmation Popup")
    public void verifyCancelTextOnDeleteAccountConfirmationPopup() {
        if (DriverManagerUtils.configuration.mobilePlatform().equalsIgnoreCase("android")) {
            Assert.assertEquals(profilePage.getDeleteAccountConfirmationPopupCancelText(), ApplicationInputs.CANCEL.getValue().toUpperCase());
        } else {
            Assert.assertEquals(profilePage.getDeleteAccountConfirmationPopupCancelText(), ApplicationInputs.CANCEL.getValue());
        }
    }

    @And("User is able to see Continue text on Delete Account Confirmation Popup")
    public void verifyContinueTextOnDeleteAccountConfirmationPopup() {
        if (DriverManagerUtils.configuration.mobilePlatform().equalsIgnoreCase("android")) {
            Assert.assertEquals(profilePage.getDeleteAccountConfirmationPopupContinueText(), ApplicationInputs.CONTINUE.getValue().toUpperCase());
        } else {
            Assert.assertEquals(profilePage.getDeleteAccountConfirmationPopupContinueText(), ApplicationInputs.CONTINUE.getValue());
        }
    }

    @And("User clicks Cancel button on Delete Account Confirmation Popup")
    public void userClickCancelButtonOnAccountPage() {
        profilePage.clickDeleteAccountConfirmationPopupCancelButton();
    }

    @Then("User is able to see Profile header on Profile Page")
    public void verifyProfileHeaderTextOnAccountPage() {
        Assert.assertEquals(accountPage.getProfileHeaderText(), ApplicationInputs.PROFILE.getValue());
    }

    @Then("User is able to see Personal Information text on Profile Page")
    public void verifyPersonalInformationTextOnAccountPage() {
        Assert.assertEquals(accountPage.getPersonalInformationText(), ApplicationInputs.PERSONAL_INFO.getValue());
    }

    @And("User is able to see Name text on Profile Page")
    public void userIsAbleToSeeNameTextOnProfilePage() {
        Assert.assertEquals(accountPage.getNameText(), ApplicationInputs.NAME.getValue());
    }

    @And("User is able to see Date of Birth text on Profile Page")
    public void userIsAbleToSeeDateOfBirthTextOnProfilePage() {
        Assert.assertEquals(accountPage.getDateOfBirthText(), ApplicationInputs.DATE_OF_BIRTH.getValue());
    }

    @And("User is able to see ZIP Code text on Profile Page")
    public void userIsAbleToSeeZIPCodeTextOnProfilePage() {
        Assert.assertEquals(accountPage.getZipCodeText(), ApplicationInputs.ZIP_CODE.getValue());
    }

    @And("User is able to see Password text on Profile Page")
    public void userIsAbleToSeePasswordTextOnProfilePage() {
        Assert.assertEquals(accountPage.getPasswordText(), ApplicationInputs.PASSWORD.getValue());
    }

    @And("User is able to see Contact Information text on Profile Page")
    public void userIsAbleToSeeContactInformationTextOnProfilePage() {
        Assert.assertEquals(accountPage.getContactInformationText(), ApplicationInputs.CONTACT_INFORMATION.getValue());
    }

    @And("User is able to see Email text on Profile Page")
    public void userIsAbleToSeeEmailTextOnProfilePage() {
        Assert.assertEquals(accountPage.getEmailText(), ApplicationInputs.EMAIL.getValue());
    }

    @And("User is able to see Phone Number text on Profile Page")
    public void userIsAbleToSeePhoneNumberTextOnProfilePage() {
        Assert.assertEquals(accountPage.getPhoneNumberText(), ApplicationInputs.PHONE_NUMBER.getValue());
    }

    @And("User is able to see FD Employee text on Profile Page")
    public void userIsAbleToSeeFDEmployeeTextOnProfilePage() {
        Assert.assertEquals(accountPage.getFDEmployeeText(), ApplicationInputs.FD_EMPLOYEE.getValue());
    }

    @Then("User is able to see Associate Id Number text on Profile Page")
    public void userIsAbleToSeeAssociateIdNumberTextOnProfilePage() {
        Assert.assertEquals(accountPage.getAssociateIdNumberText(), ApplicationInputs.ASSOCIATE_ID_NUMBER.getValue());
    }

    @When("User taps on Date Of Birth Input box")
    public void userTapsOnDateOfBirthInputBox() {
        accountPage.tapOnDOBInput();
    }

    @Then("User tap on OK from Calender")
    public void userTapOnOKFromCalender() {
        accountPage.tapOnOkButtonOnCalender();
    }


    @And("User verify Error Message Date of birth must not be the current date on Edit profile page")
    public void userVerifyErrorMessageDateOfBirthMustNotBeTheCurrentDateOnEditProfilePage() {
        Assert.assertTrue(accountPage.verifyCurrentDateErrorMessage());
    }
}
