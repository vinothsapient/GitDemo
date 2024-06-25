package com.testx.web.api.selenium.restassured.qe.ui.stepdefinitions;

import com.testx.web.api.selenium.restassured.qe.common.utils.TestVariables;
import com.testx.web.api.selenium.restassured.qe.ui.context.TestContext;
import com.testx.web.api.selenium.restassured.qe.ui.enums.ApplicationInputs;
import com.testx.web.api.selenium.restassured.qe.ui.enums.ECommInputs;
import com.testx.web.api.selenium.restassured.qe.ui.pageobjects.CartPage;
import com.testx.web.api.selenium.restassured.qe.ui.pageobjects.CheckOutPage;
import com.testx.web.api.selenium.restassured.qe.ui.webdriver.DriverManagerUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class CheckOutPageStepDef {

    CheckOutPage checkOutPage;
    CartPage cartPage;
    protected static final String PHONE_NUM_REGEX = "^\\d{3}-\\d{3}-\\d{4}$";
    protected static final String PHONE_TEN_DIGIT_REGEX = "^\\d{10}$";

    public CheckOutPageStepDef(TestContext testContext){
        this.checkOutPage = new CheckOutPage(testContext);
        this.cartPage = new CartPage(testContext);
    }

    @Then("User is navigated to Checkout Page")
    @Then("User is able to see Checkout Header on Checkout Page")
    public void verifyCheckoutHeaderText() {
        Assert.assertEquals(checkOutPage.getCheckoutHeaderText(), ECommInputs.CHECK_OUT.getValue());
    }

    @Then("User is able to see InStore Pickup details label on Checkout Page")
    public void verifyInStorePickupDetailsLabelOnCheckOutPage() {
        Assert.assertEquals(checkOutPage.getInStorePickDetailsText(), ECommInputs.IN_STORE_PICK_DETAILS.getValue());
    }

    @Then("User is able to see Pickup address on Checkout Page")
    public void verifyPickupAddressOnCheckOutPage() {
        Assert.assertTrue(checkOutPage.getPickUpAddressStoreNameText().contains(ECommInputs.FAMILY_DOLLAR.getValue()));
        Assert.assertTrue(checkOutPage.isPickUpAddressPresent());
        Assert.assertTrue(checkOutPage.getPickUpAddressPhoneNumberText().matches(PHONE_NUM_REGEX));
    }

    @Then("User is able to see Item Image with badge on Checkout Page")
    public void verifyItemImageWithBadgeOnCheckOutPage() {
        Assert.assertTrue(checkOutPage.isItemImagePresent()
                && checkOutPage.isItemBadgePresent());
    }

    @And("User is able to see Payment Info Icon on Checkout Page")
    public void verifyPaymentInfoIcon() {
        Assert.assertTrue(checkOutPage.isPaymentIconPresent());
    }

    @And("User is able to see Payment Information text on Order Confirmation Page")
    @Then("User is able to see Payment Information text on Checkout Page")
    public void verifyPaymentInformationTextOnCheckOutPage() {
        Assert.assertEquals(checkOutPage.getPaymentInformationText(), ECommInputs.PAYMENT_INFORMATION.getValue());
    }

    @Then("User is able to see Payment Info Add Text on Checkout Page")
    public void verifyPaymentInfoAddTextOnCheckOutPage() {
        Assert.assertEquals(checkOutPage.getPaymentInfoAddTextText(), ECommInputs.ADD.getValue());
    }

    @When("User clicks on Add Payment Information button on Checkout Page")
    public void userClicksOnAddPaymentButtonText() {
        checkOutPage.clickOnAddPaymentText();
    }

    @Then("User is able to see Sms Notification Text Updates on Checkout Page")
    public void verifySmsNotificationTextUpdatesOnCheckOutPage() {
        Assert.assertEquals(checkOutPage.getSmsNotificationTextUpdatesText(), ECommInputs.TEXT_UPDATES.getValue());
    }

    @Then("User is able to see Sms Notification Add Text on Checkout Page")
    public void verifySmsNotificationAddTextOnCheckOutPage() {
        Assert.assertEquals(checkOutPage.getSmsNotificationAddText(), ECommInputs.ADD.getValue());
    }

    @When("User clicks on Add Sms Notification button on Checkout Page")
    public void userClicksOnAddSmsNotificationButton() {
        checkOutPage.clickOnAddSmsNotificationButton();
    }

    @Then("User is able to see Sms Updates title {string} text on bottom sheet")
    public void verifySmsUpdatesTitleTextOnBottomSheet(String expectedTitle) {
        Assert.assertEquals(checkOutPage.getSmsUpdatesModalHeaderText(), expectedTitle);
    }

    @Then("User is able to see close button on Sms Updates bottom sheet")
    public void verifyCloseButtonOnSmsUpdatesBottomSheet() {
        Assert.assertTrue(checkOutPage.isSmsUpdatesCloseButtonPresent());
    }

    @When("User clicks Close button on Sms Updates bottom sheet")
    public void userClicksCloseButtonOnSmsUpdatesBottomSheet() {
        checkOutPage.clickOnSmsUpdatesCloseButton();
    }

    @And("User is able to see Your Phone Number title {string} text on Mobile SMS Communication")
    @Then("User is able to see Your Phone Number title {string} text on bottom sheet")
    public void verifyYourPhoneNumberTitleTextOnBottomSheet(String expectedTitle) {
        Assert.assertEquals(checkOutPage.getYourPhoneNumberTitleText(), expectedTitle);
    }

    @Then("User is able to see Your Phone Number text on bottom sheet")
    public void verifyYourPhoneNumberTextOnBottomSheet() {
        Assert.assertTrue(checkOutPage.getSmsUpdatesPhoneNumber().matches(PHONE_TEN_DIGIT_REGEX));
    }

    @Then("User is able to see Sms Updates message on bottom sheet")
    public void verifySmsUpdatesMessageOnBottomSheet() {
        Assert.assertEquals(checkOutPage.getSmsUpdatesMessageText(), ECommInputs.SMS_UPDATES_MESSAGE.getValue());
    }

    @And("User is able to see Order Updates {string} text on Mobile SMS Communication")
    @Then("User is able to see Order Updates {string} text on bottom sheet")
    public void verifyOrderUpdatesTextOnBottomSheet(String expectedText) {
        Assert.assertEquals(checkOutPage.getOrderUpdatesText(), expectedText);
    }

    @Then("User is able to see Order Updates description on bottom sheet")
    public void verifyOrderUpdatesDescriptionOnBottomSheet() {
        Assert.assertEquals(checkOutPage.getOrderUpdatesDescription(), ECommInputs.ORDER_UPDATES_MESSAGE.getValue());
    }

    @And("User is able to see Order Updates toggle button on bottom sheet")
    public void verifyOrderUpdatesToggleButtonOnBottomSheet() {
        Assert.assertTrue(checkOutPage.isOrderUpdatesToggleButtonPresent());
    }

    @And("User clicks Order Updates toggle button on bottom sheet")
    public void userClicksOrderUpdatesToggleButtonOnBottomSheet() {
        checkOutPage.clickOrderUpdatesToggleButton();
    }

    @Then("User is able to see Sms Updates Terms Message on bottom sheet")
    public void verifySmsUpdatesTermsMessageOnBottomSheet() {
        Assert.assertEquals(checkOutPage.getSmsUpdatesTermsMessageText(), ECommInputs.TERMS_AND_PRIVACY_POLICY.getValue());
    }

    @Then("User is able to see {string} and {string} links on Sms Updates bottom sheet")
    public void verifyLinksOnSmsUpdatesBottomSheet(String expectedLink1, String expectedLink2) {
        Assert.assertEquals(checkOutPage.getSmsUpdatesTermsLinkText(), expectedLink1);
        Assert.assertEquals(checkOutPage.getSmsUpdatesPrivacyPolicyLinkText(), expectedLink2);
    }

    @When("User clicks Terms link on Sms Updates bottom sheet")
    public void userClicksTermsLinkOnSmsUpdatesBottomSheet() {
        checkOutPage.clickOnSmsUpdatesTermsLink();
    }

    @When("User clicks Privacy Policy link on Sms Updates bottom sheet")
    public void userClicksPrivacyPolicyLinkOnSmsUpdatesBottomSheet() {
        checkOutPage.clickOnSmsUpdatesPrivacyPolicyLink();
    }

    @And("User is able to see Marketing Notifications {string} text on Mobile SMS Communication")
    @Then("User is able to see Marketing Notifications {string} text on bottom sheet")
    public void verifyMarketingNotificationsTextOnBottomSheet(String expectedText) {
        Assert.assertEquals(checkOutPage.getMarketingNotificationText(), expectedText);
    }

    @Then("User is able to see Marketing Notifications description on bottom sheet")
    public void verifyMarketingNotificationsDescriptionOnBottomSheet() {
        Assert.assertEquals(checkOutPage.getMarketingNotificationDescriptionText(), ECommInputs.MARKETING_NOTIFICATIONS_MESSAGE.getValue());
    }

    @And("User is able to see Marketing Notifications toggle button on bottom sheet")
    public void verifyMarketingNotificationsToggleButtonOnBottomSheet() {
        Assert.assertTrue(checkOutPage.isMarketingNotificationToggleButtonPresent());
    }

    @Then("User is able to see Save text on bottom sheet")
    public void verifySaveTextOnBottomSheet() {
        Assert.assertEquals(checkOutPage.getSmsUpdatesSaveText(), ECommInputs.SAVE.getValue());
    }

    @Then("User is able to see Save button enabled on bottom sheet")
    public void verifySaveButtonEnabledOnBottomSheet() {
        Assert.assertTrue(checkOutPage.isSmsUpdatesSaveButtonEnabled());
    }

    @When("User clicks Save CTA on bottom sheet")
    public void userClicksSaveCTAOnBottomSheet() {
        checkOutPage.clickSmsUpdatesSaveCTA();
    }

    @Then("User is able to see Mobile Number label on Checkout Page")
    public void verifyMobileNumberLabelOnCheckoutPage() {
        Assert.assertEquals(checkOutPage.getMobileNumberLabelText(), ECommInputs.MOBILE_NUMBER.getValue());
    }

    @And("User is able to see Mobile Number on Checkout Page")
    public void verifyMobileNumberOnCheckoutPage() {
        Assert.assertTrue(checkOutPage.getMobileNumberText().matches(PHONE_TEN_DIGIT_REGEX));
    }

    @And("User is able to see Terms And Privacy Message on Checkout Page")
    public void verifyTermsAndPrivacyMessageOnCheckoutPage() {
        Assert.assertEquals(checkOutPage.getTermsAndPrivacyMessageText(), ECommInputs.TERMS_AND_PRIVACY_MESSAGE.getValue());
    }

    @Then("User is able to see Sms Notification Edit Text on Checkout Page")
    public void verifySmsNotificationEditTextOnCheckOutPage() {
        Assert.assertEquals(checkOutPage.getSmsNotificationAddText(), ApplicationInputs.EDIT.getValue());
    }

    @Then("User is able to see Tax text on Checkout Page")
    public void verifyTaxTextOnCartPage() {
        Assert.assertEquals(cartPage.getEstimatedTaxText(), ECommInputs.TAX.getValue());
    }

    @Then("User is able to see Order Total text on Cart Page")
    public void verifyOrderTotalTextOnCartPage() {
        Assert.assertEquals(cartPage.getEstimatedTotalText(), ECommInputs.ORDER_TOTAL.getValue());
    }

    @Then("User is able to see Order Confirmation Updates on Checkout Page")
    public void verifyOrderConfirmationUpdatesOnCheckOutPage() {
        Assert.assertEquals(checkOutPage.getOrderConfirmationUpdatesText(), ECommInputs.ORDER_CONFIRMATION.getValue());
    }

    @Then("User is able to see Order Confirmation Email on Checkout Page")
    public void verifyOrderConfirmationEmailOnCheckOutPage() {
        Assert.assertTrue(checkOutPage.isOrderConfirmationEmailPresent());
    }

    @Then("User is able to see Place Order Description on Checkout Page")
    public void verifyPlaceOrderDescriptionOnCheckOutPage() {
        Assert.assertEquals(checkOutPage.getPlaceOrderDescText(), ECommInputs.PLACE_ORDER_DESC.getValue());
    }

    @And("User is able to see Terms and Conditions text on Checkout Page")
    public void verifyTermsAndConditionsText() {
        Assert.assertEquals(checkOutPage.getTermsAndConditionsText(), ApplicationInputs.TERMS_AND_CONDITIONS.getValue());
    }

    @When("User clicks on Terms and Conditions link on Checkout Page")
    public void userClicksOnTermsAndConditionsLink() {
        if (DriverManagerUtils.configuration.mobilePlatform().equalsIgnoreCase("android")) {
            checkOutPage.clickOnTermsAndConditionsLink();
        }
    }

    @And("User is able to see Checkout Terms And Conditions Web Page")
    public void verifyCheckoutTermsAndConditionsWebPage() {
        if (DriverManagerUtils.configuration.mobilePlatform().equalsIgnoreCase("android")) {
            Assert.assertTrue(checkOutPage.isTermsAndConditionsWebPagePresent());
        }
    }

    @Then("User is able to see Smart Coupon Disclaimers Section on Checkout Page")
    @Then("User is able to see Smart Coupon Section Description on Checkout Page")
    public void verifySmartCouponSectionDescriptionOnCheckOutPage() {
        Assert.assertEquals(checkOutPage.getSmartCouponSectionText(), ECommInputs.SMART_COUPON_SECTION.getValue());
    }

    @Then("User is able to see Want to add remove items text on Checkout Page")
    public void verifyWantToAddRemoveItemsOnCheckOutPage() {
        Assert.assertEquals(checkOutPage.getWantToAddRemoveText(), ECommInputs.WANT_TO_ADD_REMOVE.getValue());
    }

    @Then("User is able to see Return to Cart Text on Checkout Page")
    public void verifyReturnToCartCheckOutPage() {
        Assert.assertEquals(checkOutPage.getReturnToCartText(), ECommInputs.RETURN_TO_CART.getValue());
    }

    @When("User clicks on Return To Cart link on Checkout Page")
    public void userClicksOnReturnToCartLink() {
        checkOutPage.clickOnReturnToCartLink();
    }

    @And("User is able to see Order Price on Checkout Page")
    public void verifyOrderPriceOnCheckoutPage() {
        Assert.assertTrue(checkOutPage.getOrderPriceText().contains(ECommInputs.SUB_TOTAL.getValue()));
    }

    @And("User is able to see Order Quantity on Checkout Page")
    public void verifyOrderQuantityOnCheckoutPage() {
        Assert.assertTrue(checkOutPage.getOrderQuantityText().contains(ECommInputs.ITEM.getValue()));
    }

    @And("User is able to see Place Order text on Checkout Page")
    public void verifyPlaceOrderTextOnCheckoutPage() {
        Assert.assertEquals(checkOutPage.getPlaceOrderText(), ECommInputs.PLACE_ORDER.getValue());
    }

    @When("User clicks Place Order button on Checkout Page")
    public void userClicksOnPlaceOrderButton() {
        checkOutPage.clickOnPlaceOrderButton();
    }

    @Then("User is able to see Payment header on Payment Popup")
    public void verifyPaymentHeaderOnPaymentPopup() {
        Assert.assertEquals(checkOutPage.getPaymentHeaderText(), ECommInputs.PAYMENT.getValue());
    }

    @Then("User is able to see Cancel Button on Payment Popup")
    public void verifyPaymentPopupCancelButton() {
        Assert.assertTrue(checkOutPage.isPaymentPopupCancelButtonPresent());
    }

    @When("User clicks Cancel Button on Payment Popup")
    public void userClicksPaymentPopupCancelButton() {
        checkOutPage.clickPaymentPopupCancelButton();
    }

    @And("User is able to see Pay with Card option text on Payment Popup")
    public void verifyPayWithCardText() {
        Assert.assertEquals(checkOutPage.getPayWithCardText(), ECommInputs.PAY_WITH_CARD.getValue());
    }

    @When("User selects Pay with Card option on Payment Popup")
    public void userSelectPayWithCardOptionOnPaymentPopUp() {
        checkOutPage.clickPayWithCardButton();
    }

    @And("User is able to see Payment Option Modal Card on Payment Popup")
    public void verifyPaymentOptionModalCard() {
        Assert.assertTrue(checkOutPage.isPaymentOptionModalCardPresent());
    }

    @And("User is able to see Pay with PayPal option text on Payment Popup")
    public void verifyPayWithPaypalText() {
        Assert.assertEquals(checkOutPage.getPayWithPaypalText(), ECommInputs.PAY_WITH_PAYPAL.getValue());
    }

    @When("User selects Pay with Paypal option on Payment Popup")
    public void userSelectPayWithPaypalOptionOnPaymentPopUp() {
        checkOutPage.clickPayWithPaypalButton();
    }

    @And("User is able to see Payment Option Modal PayPal text on Payment Popup")
    public void verifyPaymentOptionModalPayPalText() {
        Assert.assertEquals(checkOutPage.getPaymentOptionModalPayPalText(), ECommInputs.PAY_NOW_LATER.getValue());
    }

    @And("User is able to see Continue text on Payment Popup")
    public void verifyContinueTextOnPaymentPopUp() {
        Assert.assertEquals(checkOutPage.getContinueText(), ApplicationInputs.CONTINUE.getValue());
    }

    @When("User clicks on Continue button on Payment Popup")
    public void userClicksOnContinueBtnOnPaymentPopup() {
        checkOutPage.clickOnContinueButton();
    }

    @And("User is able to see Add Card header text on Payment Card Details Page")
    public void verifyAddCardHeaderText() {
        Assert.assertEquals(checkOutPage.getAddCardHeaderText(), ECommInputs.ADD_CARD.getValue());
    }

    @Then("User is able to see Cancel Button on Payment Card Details Page")
    public void verifyCancelButtonOnPaymentCardDetailsPage() {
        Assert.assertTrue(checkOutPage.isAddCardCancelButtonPresent());
    }

    @And("User is able to see Name On Card text on Payment Card Details Page")
    public void verifyNameOnCardText() {
        Assert.assertEquals(checkOutPage.getNameOnCardText(), ECommInputs.NAME_ON_CARD.getValue());
    }

    @And("User is able to see Card Number text on Payment Card Details Page")
    public void verifyCardNumberText() {
        Assert.assertEquals(checkOutPage.getCardNumberText(), ECommInputs.CARD_NUMBER.getValue());
    }

    @And("User is able to see Expiration text on Payment Card Details Page")
    public void verifyExpirationText() {
        Assert.assertEquals(checkOutPage.getExpirationText(), ECommInputs.EXPIRATION.getValue());
    }

    @And("User is able to see CVV text on Payment Card Details Page")
    public void verifyCVVText() {
        Assert.assertEquals(checkOutPage.getCVVText(), ECommInputs.CVV.getValue());
    }

    @And("User is able to see Billing Address text on Payment Card Details Page")
    public void verifyBillingAddressText() {
        if (DriverManagerUtils.configuration.mobilePlatform().equalsIgnoreCase("android")) {
            Assert.assertEquals(checkOutPage.getBillingAddressText(), ECommInputs.BILLING_ADDRESS.getValue());
        }
    }

    @And("User is able to see First name text on Payment Card Details Page")
    public void verifyFirstNameText() {
        Assert.assertEquals(checkOutPage.getFirstNameText(), ECommInputs.FIRST_NAME.getValue());
    }

    @And("User is able to see Last Name text on Payment Card Details Page")
    public void verifyLastNameText() {
        Assert.assertEquals(checkOutPage.getLastNameText(), ECommInputs.LAST_NAME.getValue());
    }

    @And("User is able to see Address Line1 text on Payment Card Details Page")
    public void verifyAddressLine1Text() {
        Assert.assertEquals(checkOutPage.getAddressLine1Text(), ECommInputs.ADDRESS_LINE_1.getValue());
    }

    @And("User is able to see Address Line2 text on Payment Card Details Page")
    public void verifyAddressLine2Text() {
        Assert.assertEquals(checkOutPage.getAddressLine2Text(), ECommInputs.ADDRESS_LINE_2.getValue());
    }

    @And("User is able to see City text on Payment Card Details Page")
    public void verifyCityText() {
        Assert.assertEquals(checkOutPage.getCityText(), ECommInputs.CITY.getValue());
    }

    @And("User is able to see State text on Payment Card Details Page")
    public void verifyStateText() {
        Assert.assertEquals(checkOutPage.getStateText(), ECommInputs.STATE.getValue());
    }

    @And("User is able to see Zip Code text on Payment Card Details Page")
    public void verifyZipCodeText() {
        Assert.assertEquals(checkOutPage.getZipCodeText(), ECommInputs.ZIP_CODE.getValue());
    }

    @And("User is able to see Phone number text on Payment Card Details Page")
    public void verifyPhoneNumberText() {
        Assert.assertEquals(checkOutPage.getPhoneNumberText(), ECommInputs.PHONE_NUMBER.getValue());
    }

    @And("User is able to see Save text on Payment Card Details Page")
    public void verifySaveButtonText() {
        Assert.assertEquals(checkOutPage.getSaveButtonText(), ECommInputs.SAVE.getValue());
    }

    @When("User enters Name on Card as {string} in Add Card popup on checkout page")
    public void enterNameOnCardOnAddCardPopup(String name) {
        checkOutPage.enterNameOnCard(name);
    }

    @When("User enters Card Number {string} in Add Card popup on checkout page")
    public void enterCardNumberOnAddCardPopup(String cardNumber) {
        checkOutPage.enterCardNumber(cardNumber);
    }

    @When("User enters Card Expiration date as {string} in Add Card popup on checkout page")
    public void enterCardExpirationDateOnAddCardPopup(String cardExpiryDate) {
        checkOutPage.enterCardExpirationDate(cardExpiryDate);
    }

    @When("User enters CVV number {string} in Add Card popup on checkout page")
    public void enterCVVNumberOnAddCardPopup(String cvvNumber) {
        checkOutPage.enterCVV(cvvNumber);
    }

    @And("User enters 2 characters in Address Line1 {string} on Payment Card Details Page")
    @And("User enters 3 characters in Address Line1 {string} on Payment Card Details Page")
    @And("User edits the Address {string} on Payment Card Details Page")
    public void enterAddressLine1(String address) {
        checkOutPage.enterAddressLine1(address);
    }

    @And("User should be able to see Type ahead")
    public void verifyTypeAhead() {
        Assert.assertTrue(checkOutPage.isTypeAheadPresent());
    }

    @And("Type ahead should not trigger")
    public void verifyTypeAheadPresent() {
        Assert.assertFalse(checkOutPage.isTypeAheadPresent());
    }

    @And("User should have ability to select the updated address from the pop up")
    @And("User should have ability to select the suggested address from the pop up")
    public void selectAddressFromTypeAhead() {
        checkOutPage.selectFirstAddressInAutoSuggestion();
    }

    @And("User is able to see updated address {string} in Address Line1")
    @And("User is able to see selected address {string} in Address Line1")
    public void verifySelectedAddressInAddressLine1(String address) {
        Assert.assertTrue(checkOutPage.getInputAddressLine1Text().contains(address));
    }

    @And("User enters First name {string} on Payment Card Details Page")
    public void enterFirstNameInBillingAddress(String name) {
        checkOutPage.enterFirstName(name);
    }

    @And("User enters Last Name {string} on Payment Card Details Page")
    public void enterLastNameInBillingAddress(String name) {
        checkOutPage.enterLastName(name);
    }

    @And("User enters Address Line1 {string} on Payment Card Details Page")
    public void enterAddressLine1InBillingAddress(String address) {
        checkOutPage.enterAddressLine1(address);
        checkOutPage.clickAddressAutoSuggestion();
    }

    @And("User enters Phone number {string} on Payment Card Details Page")
    public void enterPhoneNumberInBillingAddress(String phoneNumber) {
        if (DriverManagerUtils.configuration.mobilePlatform().equalsIgnoreCase("android")) {
            checkOutPage.clickPhoneNumberLabel();
            checkOutPage.enterPhoneNumber(phoneNumber);
        }
    }

    @And("User clicks on Save button on Payment Card Details Page")
    public void clickSaveButtonInBillingAddress() {
        checkOutPage.clickSaveButton();
    }

    @And("User is able to see Name On Card error message in Add Card popup on Checkout Page")
    public void verifyNameOnCardErrorMessage() {
        Assert.assertTrue(checkOutPage.isNameOnCardErrorPresent());
    }

    @And("User is able to see Card Number error message in Add Card popup on Checkout Page")
    public void verifyCardNumberErrorMessage() {
        Assert.assertTrue(checkOutPage.isCardNumberErrorPresent());
    }

    @And("User is able to see Card Expiration Date error message in Add Card popup on Checkout Page")
    public void verifyCardExpirationDateErrorMessage() {
        Assert.assertTrue(checkOutPage.isCardExpirationErrorPresent());
    }

    @And("User is able to see Card CVV error message in Add Card popup on Checkout Page")
    public void verifyCardCVVErrorMessage() {
        Assert.assertTrue(checkOutPage.isCVVErrorPresent());
    }

    @And("User is able to see Address First Name error message in Add Card popup on Checkout Page")
    public void verifyAddressFirstNameErrorMessage() {
        Assert.assertTrue(checkOutPage.isAddressFirstNameErrorPresent());
    }

    @And("User is able to see Address Last Name error message in Add Card popup on Checkout Page")
    public void verifyAddressLastNameErrorMessage() {
        Assert.assertTrue(checkOutPage.isAddressLastNameErrorPresent());
    }

    @And("User is able to see Address Line1 error message in Add Card popup on Checkout Page")
    public void verifyAddressLine1ErrorMessage() {
        Assert.assertTrue(checkOutPage.isAddressLine1ErrorPresent());
    }

    @And("User is able to see Address State error message in Add Card popup on Checkout Page")
    public void verifyAddressStateErrorMessage() {
        Assert.assertTrue(checkOutPage.isAddressStateErrorPresent());
    }

    @And("User is able to see Address Zip Code error message in Add Card popup on Checkout Page")
    public void verifyAddressZipCodeErrorMessage() {
        Assert.assertTrue(checkOutPage.isAddressZipCodeErrorPresent());
    }

    @And("User is able to see Address Phone Number error message in Add Card popup on Checkout Page")
    public void verifyAddressPhoneNumberErrorMessage() {
        Assert.assertTrue(checkOutPage.isAddressPhoneErrorPresent());
    }

    @And("User is able to see Address City error message in Add Card popup on Checkout Page")
    public void verifyAddressCityErrorMessage() {
        Assert.assertTrue(checkOutPage.isAddressCityErrorPresent());
    }

    @Then("User is able to see Edit in Payment Information Section")
    public void verifyEditText() {
        Assert.assertEquals(checkOutPage.getEditText(), ApplicationInputs.EDIT.getValue());
    }

    @Then("User is able to see already entered {string} and {string} payment details in Payment Information Section")
    public void verifyPaymentDetails(String cardNumber, String cardExpiry) {
        Assert.assertTrue(checkOutPage.isPaymentInfoContainerPresent());
        String cardDetails = (checkOutPage.getPaymentHeading().replaceAll("[^0-9]", " ")).trim();
        Assert.assertTrue(cardNumber.contains(cardDetails));
        Assert.assertEquals(checkOutPage.getPaymentExpiration(),"Expires "+cardExpiry);
    }

    @Then("User clicks on Edit link Payment Information Section")
    public void clickEdit() {
        checkOutPage.clickEditPayment();
    }

    @Then("User should be able to see Add Payment popup")
    public void verifyAddPaymentPopup() {
        Assert.assertEquals(checkOutPage.getAddressHeaderTitleText(), ECommInputs.ADD_CARD.getValue());
    }
    @Then("User should be able to see Edit Payment popup")
    public void verifyEditPaymentPopup() {
        Assert.assertEquals(checkOutPage.getAddressHeaderTitleText(), ECommInputs.EDIT_CARD.getValue());
    }

    @Then("User click on Cancel button in Add Payment popup")
    public void clickCancelInAddCardPopup() {
        checkOutPage.clickAddCardCancelButton();
    }

    @And("User is able to see Place Order button in disabled status on Checkout Page")
    public void verifyPlaceOrderButtonDisabled() {
        Assert.assertFalse(checkOutPage.isPlaceOrderButtonEnabled());
    }

    @And("User is able to see Place Order button in enabled status on Checkout Page")
    public void verifyPlaceOrderButtonEnabled() {
        Assert.assertTrue(checkOutPage.isPlaceOrderButtonEnabled());
    }

    @And("User is able to see Paypal Payment Option on Checkout Page")
    public void verifyPaypalPaymentOptionOnCheckoutPage() {
        Assert.assertTrue(checkOutPage.isPaypalPaymentOption());
    }

    @And("User is not able to see Paypal Payment Option on Checkout Page")
    public void verifyNoPaypalPaymentOptionOnCheckoutPage() {
        Assert.assertFalse(checkOutPage.isPaypalPaymentOption());
    }

    @And("User is navigated to Order Confirmation Page")
    @And("User is able to see Header {string} on Order Confirmation Page")
    public void verifyOrderConfirmationHeader(String expectedHeader) {
        Assert.assertEquals(checkOutPage.getOrderConfirmationHeaderText(), expectedHeader);
    }

    @Then("User is able to see Thank you message on Order Confirmation Page")
    public void verifyThankYouMessageOnOrderConfirmationPage() {
        Assert.assertEquals(checkOutPage.getThankYouMessageText(), ECommInputs.THANK_YOU_MESSAGE.getValue());
    }

    @And("User is able to see Order Id on Order Confirmation Page")
    public void verifyOrderIdOnOrderConfirmationPage() {
        Assert.assertTrue(checkOutPage.getOrderIdText().contains(ECommInputs.ORDER_ID.getValue()));
    }

    @And("User is able to see View Order Details on Order Confirmation Page")
    public void verifyViewOrderDetailsOnOrderConfirmationPage() {
        Assert.assertEquals(checkOutPage.getViewOrderDetailsText(), ECommInputs.VIEW_ORDER_DETAILS.getValue());
    }

    @And("User is able to see View Order Details Right arrow on Order Confirmation Page")
    public void verifyViewOrderDetailsRightArrowText() {
        Assert.assertTrue(checkOutPage.isViewOrderDetailsRightArrowPresent());
    }

    @And("User is able to see PickUp Details on Order Confirmation Page")
    public void verifyPickUpDetailsOnOrderConfirmationPage() {
        Assert.assertEquals(checkOutPage.getPickUpDetailsText(), ECommInputs.PICK_UP_DETAILS.getValue());
    }

    @And("User is able to see Address on Order Confirmation Page")
    public void verifyAddressInOrderConfirmation() {
        Assert.assertTrue(checkOutPage.isAddressInOrderConfirmationPresent());
    }

    @And("User is able to see Get Directions on Order Confirmation Page")
    public void verifyGetDirectionsOnOrderConfirmationPage() {
        Assert.assertEquals(checkOutPage.getGetDirectionsText(), ECommInputs.GET_DIRECTIONS.getValue());
    }

    @And("User is able to see Get Directions Map on Order Confirmation Page")
    public void verifyGetDirectionsMapOnOrderConfirmationPage() {
        Assert.assertTrue(checkOutPage.isGetDirectionsMapPresent());
    }

    @And("User is able to see PickUp Person on Order Confirmation Page")
    public void verifyPickUpPersonOnOrderConfirmationPage() {
        Assert.assertEquals(checkOutPage.getPickUpPersonText(), ECommInputs.PICK_UP_PERSON.getValue());
        Assert.assertTrue(checkOutPage.isUserNamePresent());
    }

    @And("User is able to see Email on Order Confirmation Page")
    public void verifyEmailOnOrderConfirmationPage() {
        Assert.assertEquals(checkOutPage.getEmail(), TestVariables.getValue("email"));
    }

    @And("User is able to see Phone Number on Order Confirmation Page")
    public void verifyPhoneNumberOnOrderConfirmationPage() {
        Assert.assertTrue(checkOutPage.getPhoneNumber().matches(PHONE_TEN_DIGIT_REGEX));
    }

    @And("User is able to see Items In Order on Order Confirmation Page")
    public void verifyItemsInOrderOnOrderConfirmationPage() {
        Assert.assertEquals(checkOutPage.getItemsInOrderText(), ECommInputs.ITEMS_IN_ORDER.getValue());
    }

    @And("User is able to see Item Image on Order Confirmation Page")
    public void verifyItemImageOnOrderConfirmationPage() {
        Assert.assertTrue(checkOutPage.isItemImageInOrderPresent());
    }

    @And("User is able to see Item Product Price on Order Confirmation Page")
    public void verifyItemProductPriceOnOrderConfirmationPage() {
        Assert.assertTrue(checkOutPage.isItemProductPricePresent());
    }

    @And("User is able to see Items Quantity on Order Confirmation Page")
    public void verifyItemsQuantityOnOrderConfirmationPage() {
        Assert.assertTrue(checkOutPage.getItemQuantityText().contains(ECommInputs.QUANTITY.getValue()));
    }

    @And("User is able to see Item Descriptions on Order Confirmation Page")
    public void verifyItemDescriptionsOnOrderConfirmationPage() {
        Assert.assertTrue(checkOutPage.isItemProductDescriptionsPresent());
    }

    @And("User is able to see Buy Again text on Order Confirmation Page")
    public void verifyBuyAgainOnOrderConfirmationPage() {
        Assert.assertEquals(checkOutPage.getBuyAgainText(), ECommInputs.BUY_AGAIN.getValue());
    }

    @When("User clicks Buy Again button on Order Confirmation Page")
    public void userClicksBuyAgainButtonOnConfirmationPage() {
        checkOutPage.clickBuyAgainButton();
    }

    @And("User is able to see Paid via PayPal text on Order Confirmation Page")
    public void verifyPaidViaPayPalTextOnOrderConfirmationPage() {
        Assert.assertEquals(checkOutPage.getPaidViaPaypalText(), ECommInputs.PAID_VIA_PAYPAL.getValue());
    }

    @And("User is able to see Amount Price text on Order Confirmation Page")
    public void verifyAmountPriceTextOnOrderConfirmationPage() {
        Assert.assertTrue(checkOutPage.isAmountPricePresent());
    }

    @And("User is able to see {string} popup after saving Card Details")
    public void verifyIsThisYourCorrectAddressText(String expectedTitle) {
        Assert.assertEquals(checkOutPage.getSuggestedAddressTitleText(), expectedTitle);
    }

    @And("User selects Use Address as Entered in popup")
    public void UserSelectsUseAddressAsEnteredButton() {
        checkOutPage.clickUseAddressAsEnteredButton();
    }

    @Then("User should not get already entered CardNumber and CardExpiryDate payment details in Payment Information Section")
    public void verifyPaymentDetailsShouldNotPresent() {
        Assert.assertFalse(checkOutPage.isPaymentHeadingPresent());
        Assert.assertFalse(checkOutPage.isPaymentExpirationPresent());
    }
    
    @And("User enters Address Line1 {string} on Payment Details Page")
    public void enterAddressLine1InBillingDetails(String address) {
        checkOutPage.enterAddressLine1(address);
        checkOutPage.clickAddressLine1Label();
    }
    
    @And("User enters city {string} on Payment Card Details Page")
    public void enterCityInBillingDetails(String city) {
        checkOutPage.enterCity(city);
    }
    
    @And("User enters State {string} on Payment Card Details Page")
    public void enterStateInBillingDetails(String state) {
        checkOutPage.clickStateDropdown();
        checkOutPage.enterState(state);
        checkOutPage.selectState();
        checkOutPage.selectState();
    }
    
    @And("User enters zipcode {string} on Payment Card Details Page")
    public void enterZipCodeInBillingDetails(String zipcode) {
        checkOutPage.enterZipCode(zipcode);
    }
    
    @And("User selects edit suggested address in popup")
    public void selectEditSuggestedAddressButton() {
        checkOutPage.clickEditSuggestedAddressButton();
    }
    
    @And("User selects Use Suggested Address in popup")
    public void selectUserSuggestedAddressButton() {
        checkOutPage.clickUseSuggestedAddressButton();
    }
}
