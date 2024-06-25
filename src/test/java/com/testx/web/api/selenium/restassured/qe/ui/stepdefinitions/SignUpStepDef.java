package com.testx.web.api.selenium.restassured.qe.ui.stepdefinitions;

import com.testx.web.api.selenium.restassured.qe.ui.context.TestContext;
import com.testx.web.api.selenium.restassured.qe.ui.enums.ApplicationInputs;
import com.testx.web.api.selenium.restassured.qe.ui.pageobjects.SignUpPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.util.List;

public class SignUpStepDef {

    SignUpPage signUpPage;

    public SignUpStepDef(TestContext testContext){
        this.signUpPage = new SignUpPage(testContext);
    }

    @And("User is able to see back button on Order Status Page")
    @And("User is able to see back button on Your Order Page")
    @And("User is able to see back button on Order Confirmation Page")
    @And("User is able to see back button on Checkout Page")
    @And("User is able to see back button on Reset Password Page")
    @And("User is able to see back button on AdsAndBooks details Page")
    @And("User is able to see back button on AdsAndBooks Page")
    @And("User is able to see back button on Choose A Store Page")
    @And("User is able to see back button on Login Page")
    @And("User is able to see back button on Sign Up Page")
    public void userIsAbleToSeeBackButton() {
        Assert.assertTrue(signUpPage.isBackButtonDisplayed());
    }

    @When("User clicks back button on View Order Details Page")
    @When("User clicks back button on Order Status Page")
    @When("User clicks back button on Your Order Page")
    @When("User clicks back button on Check Out Page")
    @When("User clicks Back button on Reset Password Page")
    @When("User clicks back button on AdsAndBooks Detail Page")
    @When("User clicks back button on Choose a store Page")
    @When("User clicks back button on Login Page")
    @When("User clicks back button on Sign Up Page")
    public void userClicksBackButtonOnSignUpPage() {
        signUpPage.clickBackButton();
    }

    @And("User is able to see Family Dollar Icon on Home Page")
    @And("User is able to see Family Dollar Icon on Sign Up Page")
    public void userIsOnWelcomePage() {
        Assert.assertTrue(signUpPage.isFDIconDisplayed());
    }

    @And("User verify Error Message {string} on Sign Up Page")
    @And("User is able to see {string} text on Enable Notification Page")
    @And("User is able to see {string} text on Enable My Location Page")
    @And("User is able to see {string} text on Sign Up complete Page")
    @And("User is able to see {string} text on Enable Biometric Login page")
    @And("User is able to see {string} text on Sign Up Page")
    @And("User is able to see {string} text on Choose a Store Page")
    @And("User is able to see {string} text on storeDetails")
    public void verifyButtonPresent(String label) {
        Assert.assertTrue(signUpPage.isElementPresent(label));
    }

    @And("User clicks {string} button on Enable Notification Page")
    @And("User clicks {string} button on Enable My Location Page")
    @And("User clicks {string} button on Sign Up complete Page")
    @And("User clicks {string} button on Enable Biometric Login page")
    @And("User clicks {string} button on Welcome to the Family page")
    @And("User clicks {string} button on Choose a Store Page")
    @When("User clicks {string} button on Sign Up Page")
    public void userClicksButtonOnSignUpPage(String label) {
        signUpPage.clickButton(label);
    }

    @Then("User is able to see Enter Zip Code State text on Enable My Location Page")
    public void verifySearchForCouponsTextOnHomePage() {
        org.junit.Assert.assertTrue(signUpPage.isEnterZipCodeStateTextPresent());
    }

    @And("User is able to see bulb icon on Login Page")
    @And("User is able to see bulb icon on Sign Up Page")
    public void verifyBulbIconOnSignUpPage() {
        Assert.assertTrue(signUpPage.isBulbIconDisplayed());
    }

    @When("User enters the first name {string}")
    public void userEntersTheFirstName(String firstName) {
        signUpPage.enterFirstName(firstName);
    }

    @When("User enters the last name {string}")
    public void userEntersTheLastName(String lastName) {
        signUpPage.enterLastName(lastName);
    }

    @When("User enters the zip code {string}")
    public void userEntersTheZipCode(String zipCode) {
        signUpPage.enterZipCode(zipCode);
    }

    @When("User enters the Phone Number {string}")
    public void userEntersThePhoneNumber(String phoneNumber) {
        signUpPage.enterPhoneNumber(phoneNumber);
    }

    @And("User enters the email {string}")
    public void userEntersTheEmail(String email) {
        signUpPage.enterEmail(email);
    }

    @When("User enters {string} in Password Edit input box")
    @And("User enters the password {string}")
    public void userEntersThePassword(String password) {
        signUpPage.enterPassword(password);
    }

    @And("User clicks on Promotional email checkbox")
    public void userClicksOnPromotionalEmailCheckbox() {
        signUpPage.clickNewsLetterCheckbox();
    }

    @And("User clicks Make This My Store button on storeDetails")
    public void userClicksMakeThisMyStoreButtonOnStoreDetails() {
        signUpPage.clickOnMakeThisMyStore();
    }

    @And("User clicks Change Store button on Choose Store Page")
    @And("User clicks Make This My Store button on Choose Store Page")
    public void userClicksMakeThisMyStoreButtonOnChooseStorePage() {
        signUpPage.clickOnMakeThisMyStoreGuestUser();
    }

    @And("User clicks on T&C checkbox")
    public void userClicksOnTCCheckbox() {
        signUpPage.clickPrivacyPolicyCheckbox();
    }

    @And("User clicks on Create Account button")
    public void userClicksOnCreateAccountButton() {
    }

    @Then("User account will be created in backend and will be redirected to Enable Biometric Login screen")
    public void userAccountWillBeCreatedInBackendAndWillBeRedirectedToScreen() {
        Assert.assertTrue(signUpPage.isEnableBiometricScreenDisplayed());
    }

    @And("User is able to see First Name input box on Sign Up Page")
    public void verifyFirstNameInputBoxOnSignUpPage() {
        Assert.assertTrue(signUpPage.isFirstNameInputBoxDisplayed());
    }

    @And("User is able to see Last Name input box on Sign Up Page")
    public void verifyLastNameInputBoxOnSignUpPage() {
        Assert.assertTrue(signUpPage.isLastNameInputBoxDisplayed());
    }

    @And("User is able to see Zip Code input box on Sign Up Page")
    public void verifyZipCodeInputBoxOnSignUpPage() {
        Assert.assertTrue(signUpPage.isZipCodeInputBoxDisplayed());
    }

    @And("User is able to see Phone Number input box on Sign Up Page")
    public void verifyPhoneNumberInputBoxOnSignUpPage() {
        Assert.assertTrue(signUpPage.isPhoneNumberInputBoxDisplayed());
    }

    @And("User is able to see Email input box on Sign Up Page")
    public void verifyEmailInputBoxOnSignUpPage() {
        Assert.assertTrue(signUpPage.isEmailInputBoxDisplayed());
    }

    @And("User is able to see Password input box on Sign Up Page")
    public void verifyPasswordInputBoxOnSignUpPage() {
        Assert.assertTrue(signUpPage.isPasswordInputBoxDisplayed());
    }

    @And("User is able to see eye image inside the password input box")
    public void verifyEyeImageInsideThePasswordInputBox() {
        Assert.assertTrue(signUpPage.isPasswordEyeButtonDisplayed());
    }

    @And("User is able to see Password character check icon")
    public void userIsAbleToSeePasswordCharacterCheckIcon() {
        Assert.assertTrue(signUpPage.isPassCharacterCheckDisplayed());
    }

    @And("User is able to see Password Alphabet check icon")
    public void userIsAbleToSeePasswordAlphabetCheckIcon() {
        Assert.assertTrue(signUpPage.isPassAlphabetCheckDisplayed());
    }

    @And("User is able to see Password Number check icon")
    public void userIsAbleToSeePasswordNumberCheckIcon() {
        Assert.assertTrue(signUpPage.isPassNumberCheckDisplayed());
    }

    @And("User is able to see Password Special Character check icon")
    public void userIsAbleToSeePasswordSpecialCharacterCheckIcon() {
        Assert.assertTrue(signUpPage.isPassSpecialCharCheckDisplayed());
    }

    @And("User is able to see News Letter checkbox")
    public void userIsAbleToSeeNewsLetterCheckbox() {
        Assert.assertTrue(signUpPage.isNewsLetterCheckboxDisplayed());
    }

    @And("User is able to see Privacy Policy checkbox")
    public void userIsAbleToSeePrivacyPolicyCheckbox() {
        Assert.assertTrue(signUpPage.isPrivacyPolicyCheckboxDisplayed());
    }

    @And("User is able to see Dollar Employee checkbox")
    public void userIsAbleToSeeDollarEmployeeCheckbox() {
        Assert.assertTrue(signUpPage.isDollarEmployeeCheckboxDisplayed());
    }

    @When("User clicks on I am a Family Dollar employee checkbox")
    public void userClicksOnIAmAFamilyDollarEmployeeCheckbox() {
        signUpPage.clickDollarEmployeeCheckbox();
    }

    @And("User is able to see Employee ID input box on Sign Up Page")
    public void userIsAbleToSeeEmployeeIDInputBoxOnSignUpPage() {
        Assert.assertTrue(signUpPage.isEmployeeIDCheckboxDisplayed());
    }

    @Then("User is able to see default entered character as Astrix")
    public void verifyDefaultEnteredCharacterAsAstrix() {
        Assert.assertTrue(signUpPage.getEnteredInputPasswordText().contains("•"));
    }

    @When("User clicks on eye button inside the password input box")
    public void userClicksOnEyeButtonInsideThePasswordInputBox() {
        signUpPage.clickEyeButtonInsidePasswordTextBox();
    }

    @Then("User is able to see {string} text on More Page")
    public void userIsAbleToSeeTextOnMorePage(String label) {
        Assert.assertTrue(signUpPage.isElementPresent(label));
    }

    @Then("User is able to see {string} text on AdsAndBooks Page")
    @Then("User is able to see {string} text on CurrentAd Page")
    public void verifyTextOnAdsAndBooksPage(String label) {
        Assert.assertTrue(signUpPage.isElementPresent(label));
    }

    @And("User enters the Employee ID {string}")
    public void userEntersTheEmployeeID(String employeeID) {
        signUpPage.enterEmployeeID(employeeID);
    }

    @Then("User is not able to see Family Dollar input box")
    public void userIsNotAbleToSeeFamilyDollarInputBox() {
        Assert.assertFalse(signUpPage.isEmployeeIDCheckboxDisplayed());
    }

    @And("User is able to see Login link text besides Email error message")
    public void userIsAbleToSeeLoginLinkTextOnSignUpPage() {
        Assert.assertEquals(signUpPage.getLogInLinkTextBesidesEmailErrorMessage(), ApplicationInputs.LOGIN.getValue());
    }

    @When("User clicks on Log In link present after Email error message")
    public void userClicksOnLogInLinkPresentAfterEmailErrorMessage() {
        signUpPage.clickLogInLinkBesidesEmailErrorMessage();
    }

    @When("User clicks {string} button on Home Page")
    @When("User clicks {string} button on PDP Page")
    @When("User clicks {string} button on Coupons Page")
    public void userClicksButtonOnHomePage(String label) {
        signUpPage.clickButton(label);
    }

    @When("User click close button on Sign up popup dialog")
    public void clickCloseButtonOnSignUpPopupDialog() {
        signUpPage.clickClose();
    }

    @And("User clicks on error popup in Biometric screen")
    public void userClicksOnErrorPopupInBiometricScreen() {
        signUpPage.clickErrorPopUp();
    }

    @And("User enters the city {string}")
    @And("User enters the Zipcode {string}")
    public void userEntersTheZipcode(String zipCode) {
        signUpPage.enterZipCodeOnChooseAStore(zipCode);
    }

    @And("User clicks on storeDetails")
    public void userClicksOnStoreDetails() {
        signUpPage.clickStoreView();
    }

    @Then("User is able to see Location icon on Choose A Store Page")
    public void verifyLocationIcon() {
        Assert.assertTrue(signUpPage.isLocationIconDisplayed());
    }

    @And("User clicks Now Now button on Enable Biometric Login page")
    public void userClicksNowNowButtonOnEnableBiometricLoginPage() {
        signUpPage.clickNotNowButtonInBiometricPage();
    }

    @And("User clicks Start Saving button on Sign Up complete Page")
    public void userClicksStartSavingButtonOnSignUpCompletePage() {
        signUpPage.clickStartSavingButtonSignUpCompletePage();
    }

    @And("User clicks Skip button on Enable My Location Page")
    public void userClicksSkipButtonOnEnableMyLocationPage() {
        signUpPage.clickSkipButtonInEnableMyLocation();
    }

    @And("User clicks Skip button on Enable My Location Page Pop Up")
    public void userClicksSkipButtonOnEnableMyLocationPagePopUp() {
        signUpPage.clickSkipButtonInEnableMyLocationPopUpPage();
    }

    @And("User clicks Coupons button on HomeScreen")
    public void userClicksCouponsButtonOnHomeScreen() {
        signUpPage.clickCouponButton();
    }

    @And("User is able to Click Home text on Home Page")
    public void userIsAbleToClickHomeTextOnHomePage() {
        signUpPage.clickHomeButton();
    }

    @And("User is able to Click More text on Home Page")
    public void userIsAbleToClickAccountTextOnHomePage() {
        signUpPage.clickMoreButton();
    }

    @Then("User clicks AdsAndBooks Button on Home Page")
    public void userIsAbleToClickAdsAndBooksButtonTextOnHomePage() {
        signUpPage.clickAdsAndBooksButton();
    }

    @And("User clicks Not Now button on Keep Up to Date Page")
    public void userClicksNotNowButtonOnKeepUpToDatePage() {
        signUpPage.clickNotNowButtonInKeepUpToDatePage();
    }

    @And("User is able to see Enable Biometric Login Page")
    public void verifyEnableBiometricLoginPage() {
        Assert.assertTrue(signUpPage.isBiometricLoginLinkDisplayed());
    }

    @And("User clicks Create Account button on Sign Up Page")
    public void userClicksCreateAccountButtonOnSignUpPage() {
        signUpPage.clickCreateAccountButtonInSignUpPage();
    }

    @And("User is able to see labels on Sign Up Page")
    public void userIsAbleToSeeLabelsOnSignUpPage(DataTable table) {
        List<String> expectedTextList = table.asList();
        for (String expectedText : expectedTextList) {
            Assert.assertTrue(signUpPage.getAllLabelText().contains(expectedText));
        }
    }

    @When("User clicks Log In button on Sign Up Page")
    public void userClicksLogInButtonOnSignUpPage() {
        signUpPage.clickLoginButton();
    }

    @And("User is able to see Sign Up Header text on Sign Up Page")
    public void verifySignUpHeaderTextOnSignUpPage() {
        Assert.assertEquals(signUpPage.getSignUpHeaderText(), ApplicationInputs.SIGNUP_HEADER.getValue());
    }

    @And("User is able to see Sign Up Header Sub text on Sign Up Page")
    public void verifySignUpHeaderSubTextOnSignUpPage() {
        Assert.assertEquals(signUpPage.getSignUpHeaderSubText(), ApplicationInputs.SIGNUP_SUB_TEXT.getValue());
    }

    @And("User is able to see Sign In text on Sign Up Page")
    public void verifySignInTextOnSignUpPage() {
        Assert.assertEquals(signUpPage.getLogInText(), ApplicationInputs.LOG_IN.getValue());
    }

    @And("User is able to see FD Tip text on Login Page")
    @And("User is able to see FD Tip text on Sign Up Page")
    public void verifyFDTipTextOnSignUpPage() {
        Assert.assertEquals(signUpPage.getSignUpErrorTipText(), ApplicationInputs.FD_TIP.getValue());
    }

    @And("User is able to see FD Tip Description text on Login Page")
    @And("User is able to see FD Tip Description text on Sign Up Page")
    public void verifyFDTipDescriptionTextOnSignUpPage() {
        Assert.assertEquals(signUpPage.getSignUpTipDescriptionText(), ApplicationInputs.SIGNUP_TIP_DESCRIPTION.getValue());
    }

    @And("User is able to see First Name text on Sign Up Page")
    public void verifyFirstNameTextOnSignUpPage() {
        Assert.assertEquals(signUpPage.getFirstNameLabelText(), ApplicationInputs.FIRST_NAME.getValue());
    }

    @And("User is able to see Last Name text on Sign Up Page")
    public void verifyLastNameTextOnSignUpPage() {
        Assert.assertEquals(signUpPage.getLastNameLabelText(), ApplicationInputs.LAST_NAME.getValue());
    }

    @And("User is able to see Zip Code text on Sign Up Page")
    public void verifyZipCodeTextOnSignUpPage() {
        Assert.assertEquals(signUpPage.getZipCodeLabelText(), ApplicationInputs.ZIP_CODE_SIGNUP.getValue());
    }

    @And("User is able to see Phone Number text on Sign Up Page")
    public void verifyPhoneNumberTextOnSignUpPage() {
        Assert.assertEquals(signUpPage.getPhoneNumberLabelText(), ApplicationInputs.PHONE_NUMBER.getValue());
    }

    @And("User is able to see Email text on Sign Up Page")
    public void verifyEmailTextOnSignUpPage() {
        Assert.assertEquals(signUpPage.getEmailLabelText(), ApplicationInputs.EMAIL.getValue());
    }

    @And("User is able to see Password text on Sign Up Page")
    public void verifyPasswordTextOnSignUpPage() {
        Assert.assertEquals(signUpPage.getPasswordLabelText(), ApplicationInputs.PASSWORD.getValue());
    }

    @And("User is able to see Password {string} on Login Page")
    @And("User is able to see Password {string} on Sign Up Page")
    public void verifyPasswordOnSignUpPage(String expectedPassword) {
        Assert.assertEquals(signUpPage.getInputPasswordText(), expectedPassword);
    }

    @And("User is able to see Not Now text on Enable Biometric Login page")
    public void verifyNotNowTextOnEnableBiometricLoginPage() {
        Assert.assertEquals(signUpPage.getNotNowTextInBiometricPage(), ApplicationInputs.NOT_NOW.getValue());
    }

    @And("User is able to see Start Saving text on Sign Up complete Page")
    public void verifyStartSavingTextOnSignUpCompletePage() {
        Assert.assertEquals(signUpPage.getStartSavingTextInSignUpCompletePage(), ApplicationInputs.START_SAVING.getValue());
    }

    @Then("User is able to view Enter Your Verification Code Page")
    public void verifyEnterYourVerificationCodePage() {
        Assert.assertEquals(signUpPage.getEnterYourVerificationCodeText(), ApplicationInputs.VERIFICATION_CODE.getValue());
    }

    @Then("User is able to see {string} header on Choose A Store Page")
    public void verifyHeaderOnChooseAStorePage(String expectedText) {
        Assert.assertEquals(signUpPage.getChooseAStoreHeaderText(), expectedText);
    }

    @And("User is able to see Search icon on Choose A Store Page")
    public void verifySearchIconOnChooseAStorePage() {
        Assert.assertTrue(signUpPage.isSearchIconDisplayed());
    }

    @And("User is able to see {string} default Search on Choose A Store Page")
    public void verifyDefaultSearchOnChooseAStorePage(String expectedText) {
        Assert.assertEquals(signUpPage.getDefaultStoreSearchText(), expectedText);
    }

    @And("User is able to see Google Map on Choose A Store Page")
    public void verifyGoogleMapOnChooseAStorePage() {
        Assert.assertTrue(signUpPage.isGoogleMapDisplayed());
    }

    @And("User is able to see Store List on Choose A Store Page")
    public void verifyStoreListOnChooseAStorePage() {
        Assert.assertTrue(signUpPage.isStoreListDisplayed());
    }

    @When("User selects a Store from Choose A Store Page")
    public void userSelectsAStoreFromChooseAStorePage() {
        signUpPage.selectStoreFromChooseAStorePage();
    }

    @Then("User is able to see {string} link text on Choose A Store Page")
    public void verifyLinkTextOnChooseAStorePage(String expectedText) {
        Assert.assertEquals(signUpPage.getMakeThisMyStoreText(), expectedText);
    }

    @And("User not get {string} message on verification code input screen")
    public void userNotGetMessageOnVerificationCodeInputScreen(String verificationMessage) {
        Assert.assertTrue(signUpPage.verificationMessageNotContains(verificationMessage));
    }


    @And("User able to see miles below Store name")
    public void userAbleToSeeMilesBelowStoreName() {
        Assert.assertTrue(signUpPage.isStoreMilesPresentOnStoreDetails());
    }

    @And("User clicks {string} button on Choose a Store search Page")
    public void userClicksListViewButtonOnChooseAStorePage(String buttonName) {
        signUpPage.listViewClick(buttonName);
    }

    @And("User is able to see Password must contain text on Sign Up Page")
    public void verifyPasswordMustContainTextOnSignUpPage() {
    Assert.assertEquals(signUpPage.getPasswordMustContainText(), ApplicationInputs.PASSWORD_MUST_CONTAIN.getValue());
    }

    @And("User is able to see At least 8 characters text on Sign Up Page")
    public void verifyAtLeastCharactersTextOnSignUpPage() {
        Assert.assertEquals(signUpPage.getAtLeastCharactersText(), ApplicationInputs.AT_LEAST_CHARACTER.getValue());
    }

    @And("User is able to see One uppercase alphabetic character text on Sign Up Page")
    public void verifyOneUppercaseAlphabeticCharacterTextOnSignUpPage() {
        Assert.assertEquals(signUpPage.getOneUppercaseAlphabeticCharacterText(), ApplicationInputs.ALPHABETIC_CHARACTER.getValue());
    }

    @And("User is able to see One number text on Sign Up Page")
    public void verifyOneNumberTextOnSignUpPage() {
        Assert.assertEquals(signUpPage.getOneNumberText(), ApplicationInputs.ONE_NUMBER.getValue());
    }

    @And("User is able to see One special character text on Sign Up Page")
    public void verifyOneSpecialCharacterTextOnSignUpPage() {
        Assert.assertEquals(signUpPage.getOneSpecialCharacterText(), ApplicationInputs.ONE_SPECIAL_CHARACTER.getValue());
    }

    @And("User is able to see news and promotions emails text on Sign Up Page")
    public void verifyNewsAndPromotionsEmailsTextOnSignUpPage() {
        Assert.assertEquals(signUpPage.getNewsAndPromotionsEmailsText(), ApplicationInputs.NEWS_AND_PROMOTIONS_EMAIL.getValue());
    }

    @And("User is able to see I agree to the following text on Sign Up Page")
    public void verifyIAgreeToTheFollowingTextOnSignUpPage() {
        Assert.assertEquals(signUpPage.getIAgreeToTheFollowingText(), ApplicationInputs.I_AGREE_TO_THE_FOLLOWING.getValue());
    }

    @And("User is able to see Privacy Policy text on Sign Up Page")
    public void verifyPrivacyPolicyTextOnSignUpPage() {
        Assert.assertEquals(signUpPage.getPrivacyPolicyButtonText(), ApplicationInputs.PRIVACY_POLICY_COMMA.getValue());
    }

    @And("User is able to see Terms and Conditions text on Sign Up Page")
    public void verifyTermsAndConditionsTextOnSignUpPage() {
        Assert.assertEquals(signUpPage.getTermsAndConditionButtonText(), ApplicationInputs.TERMS_AND_CONDITIONS_COMMA.getValue());
        Assert.assertEquals(signUpPage.getTermsAndConditionAndText(), ApplicationInputs.AND.getValue());
    }

    @And("User is able to see Smart Coupons Terms and Conditions text on Sign Up Page")
    public void verifySmartCouponsTermsAndConditionsTextOnSignUpPage() {
        Assert.assertEquals(signUpPage.getSmartCouponTermsAndConditionButtonText(), ApplicationInputs.SMART_COUPONS_TERMS_AND_CONDITIONS.getValue());
    }

    @And("User is able to see Family Dollar employee text on Sign Up Page")
    public void verifyFamilyDollarEmployeeTextOnSignUpPage() {
        Assert.assertEquals(signUpPage.getFamilyDollarEmployeeText(), ApplicationInputs.FAMILY_DOLLAR_EMPLOYEE.getValue());
    }

    @And("User is able to see Employee ID text on Sign Up Page")
    public void verifyEmployeeIDTextOnSignUpPage() {
        Assert.assertEquals(signUpPage.getEmployeeIDText(), ApplicationInputs.EMPLOYEE_ID.getValue());
    }

    @And("User is able to see Create Account text on Sign Up Page")
    public void verifyCreateAccountTextOnSignUpPage() {
        Assert.assertEquals(signUpPage.getCreateAccountText(), ApplicationInputs.CREATE_ACCOUNT.getValue());
    }
}
