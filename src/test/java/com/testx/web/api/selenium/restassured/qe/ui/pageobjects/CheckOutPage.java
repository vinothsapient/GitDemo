package com.testx.web.api.selenium.restassured.qe.ui.pageobjects;

import com.testx.web.api.selenium.restassured.qe.ui.context.TestContext;
import com.testx.web.api.selenium.restassured.qe.ui.stepdefinitions.BaseSetup;
import com.testx.web.api.selenium.restassured.qe.ui.webdriver.DriverManagerUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CheckOutPage extends BaseSetup {


    public CheckOutPage(TestContext testContext) {
        super(testContext);
        PageFactory.initElements(testContext.getDriverManager().getDriver(), this);
    }

    @FindBy(xpath = "//*[@content-desc='Checkout'] | //*[@name='FdAppHeader:Title']")
    protected static WebElement checkoutHeader;

    @FindBy(xpath = "//*[@resource-id='bopisInStorePickup:inStorePickup'] | //*[@name='bopisInStorePickup:inStorePickup']")
    protected static WebElement inStorePickDetails;

    @FindBy(xpath = "//*[@resource-id='CheckoutAddress:StoreName'] | //*[@name='CheckoutAddress:StoreName']")
    protected static WebElement pickUpAddressStoreName;

    @FindBy(xpath = "//*[@resource-id='CheckoutAddress:StoreAddress'] | //*[@name='CheckoutAddress:StoreAddress']")
    protected static List<WebElement> pickUpAddress;

    @FindBy(xpath = "//*[@resource-id='CheckoutAddress:StorePhone'] | //*[@name='CheckoutAddress:StorePhone']")
    protected static WebElement pickUpAddressPhoneNumber;

    @FindBy(xpath = "//*[@resource-id='HorizontalList:itemContainer'] | //*[@name='HorizontalList:itemContainer']")
    protected static WebElement itemImage;

    @FindBy(xpath = "//*[@resource-id='HorizontalList:badgeContainer']/android.widget.TextView | //*[@name='HorizontalList:badgeContainer']")
    protected static WebElement itemBadge;

    @FindBy(xpath = "//*[@resource-id='FDCheckoutHeader:HeaderIcon'] | //*[@name='FDCheckoutHeader:HeaderIcon']")
    protected static WebElement paymentIcon;

    @FindBy(xpath = "//*[@resource-id='FDCheckoutTitle:HeaderTitle'] | //*[@name='FDCheckoutTitle:HeaderTitle']")
    protected static WebElement paymentInformationLabel;

    @FindBy(xpath = "//*[@resource-id='FDCheckoutRightIcon:RightIcon']/android.widget.TextView | //*[@name='FDCheckoutRightIcon:RightIcon']")
    protected static WebElement paymentAddLabel;

    @FindBy(xpath = "//*[@resource-id='FDSMSNotificationHeader:HeadingText'] | //*[@name='FDSMSNotificationHeader:HeaderTitle']")
    protected static WebElement smsNotificationTextUpdates;

    @FindBy(xpath = "//*[@resource-id='FDSMSNotificationHeader:SubHeadingText']")
    protected static WebElement smsNotificationOptional;

    @FindBy(xpath = "//*[@resource-id='FDSMSNotificationHeader:RightActionButton'] | //*[@name='FDSMSNotificationHeader:RightCTA']")
    protected static WebElement smsNotificationAddButton;

    @FindBy(xpath = "//*[@resource-id='SmsUpdatedModalHeadingText:TestID'] | //*[@name='SmsUpdatedModalHeadingText:TestID']")
    protected static WebElement smsUpdatesModalHeader;

    @FindBy(xpath = "//*[@resource-id='SmsUpdatesCrossTestID'] | //*[@name='SmsUpdatesCrossTestID']")
    protected static WebElement smsUpdatesCloseButton;

    @FindBy(xpath = "//*[@resource-id='section:TitleId']/android.widget.TextView | //XCUIElementTypeStaticText[@name='Your Phone Number']")
    protected static WebElement yourPhoneNumberLabel;

    @FindBy(xpath = "//*[@resource-id='phone:TestId'] | //*[@name='phone:TestId']")
    protected static WebElement smsUpdatesPhoneNumber;

    @FindBy(xpath = "//*[@resource-id='message:TestId'] | //*[@name='message:TestId']")
    protected static WebElement smsUpdatesMessage;

    @FindBy(xpath = "//*[@resource-id='notificationSectionTestId:title'] | //*[@name='notificationSectionTestId:title']")
    protected static WebElement orderUpdates;

    @FindBy(xpath = "//*[@resource-id='notificationSectionTestId:description'] | //*[@name='notificationSectionTestId:description']")
    protected static WebElement orderUpdatesDescription;

    @FindBy(xpath = "//*[@resource-id='notificationSectionTestId:toggle'] | //*[@name='notificationSectionTestId:toggle']")
    protected static WebElement orderUpdatesToggle;

    @FindBy(xpath = "//*[@resource-id='SmsUpdatesTerm:TestID'] | //*[@name='SmsUpdatesTerm:TestID']")
    protected static WebElement smsUpdatesTermsMessage;

    @FindBy(xpath = "//*[@resource-id='SmsTermConditionTestID'] | //*[@name='SmsTermConditionTestID']")
    protected static WebElement smsUpdatesTermsLink;

    @FindBy(xpath = "//*[@resource-id='SmsTermPrivacyPolicyTestID'] | //*[@name='SmsTermPrivacyPolicyTestID']")
    protected static WebElement smsUpdatesPrivacyPolicyLink;

    @FindBy(xpath = "//*[@resource-id='marketingStatusTestID:title'] | //*[@name='marketingStatusTestID:title']")
    protected static WebElement marketingNotification;

    @FindBy(xpath = "//*[@resource-id='marketingStatusTestID:description'] | //*[@name='marketingStatusTestID:description']")
    protected static WebElement marketingNotificationDescription;

    @FindBy(xpath = "//*[@resource-id='marketingStatusTestID:toggle'] | //*[@name='marketingStatusTestID:toggle']")
    protected static WebElement marketingNotificationToggle;

    @FindBy(xpath = "//*[@resource-id='FDButton:title'] | //*[@name='FDButton:title']")
    protected static WebElement smsUpdatesSaveButton;

    @FindBy(xpath = "//*[@resource-id='FDSMSNotificationHeader:MobileNumberLabel'] | //*[@name='FDSMSNotificationHeader:MobileNumberLabel']")
    protected static WebElement mobileNumberLabel;

    @FindBy(xpath = "//*[@resource-id='FDSMSNotificationHeader:MobileNumber'] | //*[@name='FDSMSNotificationHeader:MobileNumber']")
    protected static WebElement mobileNumber;

    @FindBy(xpath = "//*[@resource-id='FDSMSNotificationHeader:labelTextOne'] | //*[@name='FDSMSNotificationHeader:labelTextOne']")
    protected static WebElement termAndPrivacyTextOne;

    @FindBy(xpath = "//*[@resource-id='FDSMSNotificationHeader:termConditionText'] | //*[@name='FDSMSNotificationHeader:termConditionText']")
    protected static WebElement termAndPrivacyTextTwo;

    @FindBy(xpath = "//*[@resource-id='FDSMSNotificationHeader:labelTextTwo'] | //*[@name='FDSMSNotificationHeader:labelTextTwo']")
    protected static WebElement termAndPrivacyTextThree;

    @FindBy(xpath = "//*[@resource-id='FDSMSNotificationHeader:privacyPolicyText'] | //*[@name='FDSMSNotificationHeader:privacyPolicyText']")
    protected static WebElement termAndPrivacyTextFour;

    @FindBy(xpath = "//*[@resource-id='FDSupportingSection:EmailIdTitle'] | //*[@name='FDSupportingSection:EmailIdTitle']")
    protected static WebElement orderConfirmationTitle;

    @FindBy(xpath = "//*[@resource-id='FDSupportingSection:EmailIdDesc'] | //*[@name='FDSupportingSection:EmailIdDesc']")
    protected static WebElement orderConfirmationEmail;

    @FindBy(xpath = "//*[@resource-id='FDSupportingSection:TermConditionTitle'] | //*[@name='FDSupportingSection:TermConditionTitle']")
    protected static WebElement placeOrderTitle;

    @FindBy(xpath = "//*[@resource-id='FDSupportingSection:TermConditionDesc']//android.widget.TextView | //*[@name='FDSupportingSection:TermConditionDesc']")
    protected static WebElement termsAndConditionsText;

    @FindBy(xpath = "//*[@text='Terms & Conditions']")
    protected static WebElement termsAndConditionsWebPage;

    @FindBy(xpath = "//*[@resource-id='FDSupportingSection:SmartCoupons'] | //*[@name='FDSupportingSection:SmartCoupons']")
    protected static WebElement smartCouponSectionText;

    @FindBy(xpath = "//*[@resource-id='FDSupportingSection:ReturnToCartTitle'] | //*[@name='FDSupportingSection:ReturnToCartTitle']")
    protected static WebElement wantToAddRemoveText;

    @FindBy(xpath = "//*[@resource-id='FDSupportingSection:ReturnToCartBtn']//android.widget.TextView | //*[@name='FDSupportingSection:ReturnToCartBtn']")
    protected static WebElement returnToCartLink;

    @FindBy(xpath = "//*[@resource-id='FDSupportingSection:OrderPrice'] | //*[@name='FDSupportingSection:OrderPrice']")
    protected static WebElement OrderPrice;

    @FindBy(xpath = "//*[@resource-id='FDSupportingSection:OrderQuantity'] | //*[@name='FDSupportingSection:OrderQuantity']")
    protected static WebElement OrderQuantity;

    @FindBy(xpath = "//*[@resource-id='FDSupportingSection:OrderBtn']//android.widget.TextView | //*[@name='FDSupportingSection:OrderBtn']")
    protected static WebElement placeOrderButton;

    @FindBy(xpath = "//*[@resource-id='PaymentPayPal:TestID'] | //*[@name='PaymentPayPal:TestID']")
    protected static WebElement paypalPaymentOption;

    @FindBy(xpath = "//*[@resource-id='PaymentOptionModalHeadingText:TestID'] | //*[@name='PaymentOptionModalHeadingText:TestID']")
    protected static WebElement paymentHeader;

    @FindBy(xpath = "//*[@resource-id='PaymentOptionModalHeadingText:TestID']//parent::android.view.ViewGroup/following-sibling::android.view.ViewGroup | (//XCUIElementTypeOther[@name='Payment'])[1]/XCUIElementTypeOther[2]")
    protected static WebElement paymentPopupCancelButton;

    @FindBy(xpath = "//*[@content-desc='Pay With Credit or Debit Card'] | //XCUIElementTypeStaticText[@name='Pay With Credit or Debit Card']")
    protected static WebElement payWithCardLabel;

    @FindBy(xpath = "(//*[@resource-id='PaymentOptionModalCard:TestID'])[1] | //*[@name='PaymentOptionModalCard:TestID']")
    protected static WebElement paymentOptionModalCard;

    @FindBy(xpath = "//*[@content-desc='Pay With PayPal'] | //*[@name='Pay With PayPal']")
    protected static WebElement payWithPayPalLabel;

    @FindBy(xpath = "//*[@resource-id='PaymentOptionModalPayPal:TestID'] | //*[@name='PaymentOptionModalPayPal:TestID']")
    protected static WebElement paymentOptionModalPayPal;

    @FindBy(xpath = "//*[@resource-id='PaymentOptionModalContinueBtn:TestID']//android.widget.TextView | //*[@name='PaymentOptionModalContinueBtn:TestID']")
    protected static WebElement continueButton;

    @FindBy(xpath = "//*[@resource-id='Address:HeaderTitle']//android.widget.TextView | //XCUIElementTypeStaticText[@name='Add Card']")
    protected static WebElement addCardHeader;

    @FindBy(xpath = "//*[@resource-id='Address:HeaderCross'] | //*[@name='Address:HeaderCross']")
    protected static WebElement addCardCancelButton;

    @FindBy(xpath = "//*[@resource-id='Card:NameOnCardLabel'] | //*[@name='Card:NameOnCardLabel']")
    protected static WebElement nameOnCardLabel;

    @FindBy(xpath = "//*[@resource-id='Card:NameOnCard'] | //*[@name='Card:NameOnCard']")
    protected static WebElement nameOnCardInputBox;

    @FindBy(xpath = "//*[@resource-id='Card:CardNumberLabel'] | //*[@name='Card:CardNumberLabel']")
    protected static WebElement cardNumberLabel;

    @FindBy(xpath = "//*[@resource-id='Card:CardNumber'] | //*[@name='Card:CardNumber']")
    protected static WebElement cardNumberInputBox;

    @FindBy(xpath = "//*[@resource-id='Card:CardExpirationLabel'] | //*[@name='Card:CardExpirationLabel']")
    protected static WebElement expirationLabel;

    @FindBy(xpath = "//*[@resource-id='Card:CardExpiration'] | //*[@name='Card:CardExpiration']")
    protected static WebElement cardExpirationInputBox;

    @FindBy(xpath = "//*[@resource-id='Card:CardCVVLabel'] | //*[@label='Card:CardCVVLabel']")
    protected static WebElement cvvLabel;

    @FindBy(xpath = "//*[@resource-id='Card:CardCVV'] | //XCUIElementTypeOther[@name='Enter card CVV']")
    protected static WebElement cvvNumberInputBox;

    @FindBy(xpath = "//*[@content-desc='Billing Address'] | //*[@name='Billing Address']")
    protected static WebElement billingAddressLabel;

    @FindBy(xpath = "//*[@resource-id='Address:FirstNameLabel'] | //*[@name='Address:FirstNameLabel']")
    protected static WebElement firstNameLabel;

    @FindBy(xpath = "//*[@resource-id='Address:FirstName'] | //*[@name='Address:FirstName']")
    protected static WebElement firstNameInputBox;

    @FindBy(xpath = "//*[@resource-id='Address:LastNameLabel'] | //*[@name='Address:LastNameLabel']")
    protected static WebElement lastNameLabel;

    @FindBy(xpath = "//*[@resource-id='Address:LastName'] | //*[@name='Address:LastName']")
    protected static WebElement lastNameInputBox;

    @FindBy(xpath = "//*[@resource-id='Address:AddressLine1Label'] | //*[@name='Address:AddressLine1Label']")
    protected static WebElement addressLine1Label;

    @FindBy(xpath = "//*[@resource-id='Address:AddressLine1'] | //*[@name='Address:AddressLine1']")
    protected static WebElement addressLine1InputBox;

    @FindBy(xpath = "//*[@resource-id='Address:AddressLine2label'] | //*[@name='Address:AddressLine2label']")
    protected static WebElement addressLine2Label;

    @FindBy(xpath = "//*[@resource-id='Address:CityLabel'] | //*[@name='Address:CityLabel']")
    protected static WebElement cityLabel;

    @FindBy(xpath = "//*[@resource-id='Address:City'] | //*[@name='Address:City']")
    protected static WebElement cityInputBox;

    @FindBy(xpath = "//*[@resource-id='Address:StateLabel'] | //*[@name='Address:StateLabel']")
    protected static WebElement stateLabel;

    @FindBy(xpath = "//*[@resource-id='Address:State'] | //*[@name='Address:State']")
    protected static WebElement stateInputBox;

    @FindBy(xpath = "//*[@resource-id='Address:zipCodeLabel'] | //*[@name='Address:zipCodeLabel']")
    protected static WebElement zipCodeLabel;

    @FindBy(xpath = "//*[@resource-id='Address:ZipCode'] | //*[@name='Address:ZipCode']")
    protected static WebElement zipCodeInputBox;

    @FindBy(xpath = "//*[@resource-id='Address:phoneLabel'] | //*[@name='Address:phoneLabel']")
    protected static WebElement phoneNumberLabel;

    @FindBy(xpath = "//*[@resource-id='Address:Phone'] | //*[@name='Address:Phone']")
    protected static WebElement phoneNumberInputBox;

    @FindBy(xpath = "//*[@resource-id='Address:Save']//android.widget.TextView | //*[@name='Address:Save']")
    protected static WebElement saveButton;

    @FindBy(xpath = "//*[contains(@resource-id,'Address:SearchSuggestion_')] | //*[contains(@name,'Address:SearchSuggestion_')]")
    protected static WebElement addressAutoSuggestion;

    @FindBy(xpath = "(//*[contains(@resource-id,'Address:SearchSuggestion_')])[1] | (//*[contains(@name,'Address:SearchSuggestion_')])[1]")
    protected static WebElement selectFirstAddressInAutoSuggestion;

    @FindBy(xpath = "//*[@text='Type something...'] | //*[@name='Type something...']")
    protected static WebElement typeStateInputBox;

    @FindBy(xpath = "//*[@resource-id='Card:NameOnCardError'] | //*[@name='Card:NameOnCardError']")
    protected static WebElement nameOnCardError;

    @FindBy(xpath = "//*[@resource-id='Card:CardNumberError'] | //*[@name='Card:CardNumberError']")
    protected static WebElement cardNumberError;

    @FindBy(xpath = "//*[@resource-id='Card:CardExpirationError'] | //*[@name='Card:CardExpirationError']")
    protected static WebElement cardExpirationError;

    @FindBy(xpath = "(//*[@resource-id='Card:CardNumberError'])[2] | (//*[@name='Card:CardNumberError'])[2]")
    protected static WebElement cvvError;

    @FindBy(xpath = "//*[@resource-id='Address:FirstNameError'] | //*[@name='Address:FirstNameError']")
    protected static WebElement addressFirstNameError;

    @FindBy(xpath = "//*[@resource-id='Address:LastNameError'] | //*[@name='Address:LastNameError']")
    protected static WebElement addressLastNameError;

    @FindBy(xpath = "//*[@resource-id='Address:AddressLine1Error'] | //*[@name='Address:AddressLine1Error']")
    protected static WebElement addressLine1Error;

    @FindBy(xpath = "//*[@resource-id='Address:CityError'] | //*[@name='Address:CityError']")
    protected static WebElement addressCityError;

    @FindBy(xpath = "//*[@resource-id='Address:StateError'] | //*[@name='Address:StateError']")
    protected static WebElement addressStateError;

    @FindBy(xpath = "//*[@resource-id='Address:ZipCodeError'] | //*[@name='Address:ZipCodeError']")
    protected static WebElement addressZipCodeError;

    @FindBy(xpath = "//*[@resource-id='Address:PhoneError'] | //*[@name='Address:PhoneError']")
    protected static WebElement addressPhoneError;

    @FindBy(xpath = "//*[@text='Edit'] | //*[@name='Edit']")
    protected static WebElement editPaymentText;

    @FindBy(xpath = "//*[@resource-id='PaymentInfoContainer:TestID'] | //*[@name='PaymentInfoContainer:TestID']")
    protected static WebElement paymentInfoContainer;

    @FindBy(xpath = "//*[@resource-id='PaymentHeading:TestID'] | //*[@name='PaymentHeading:TestID']")
    protected static WebElement paymentHeading;

    @FindBy(xpath = "//*[@resource-id='PaymentDescription:TestID'] | //*[@resource-id='PaymentDescription:TestID']")
    protected static WebElement paymentExpiration;

    @FindBy(xpath = "//*[@content-desc='Order Confirmation'] | //*[@name='Order Confirmation']")
    protected static WebElement orderConfirmationHeader;

    @FindBy(xpath = "//*[@resource-id='FDOrderConfirmationComponent:OrderConfirmationMessage'] | //*[@name='FDOrderConfirmationComponent:OrderConfirmationMessage']")
    protected static WebElement thankYouMessageText;

    @FindBy(xpath = "//*[@resource-id='FDOrderConfirmationComponent:OrderId'] | //*[@name='FDOrderConfirmationComponent:OrderId']")
    protected static WebElement orderId;

    @FindBy(xpath = "//*[@resource-id='FDOrderConfirmationComponent:ViewOrderDetails'] | //*[@name='FDOrderConfirmationComponent:ViewOrderDetailsTouchable']")
    protected static WebElement viewOrderDetails;

    @FindBy(xpath = "//*[@resource-id='FDOrderConfirmationComponent:RightArrowIcon'] | //*[@name='FDOrderConfirmationComponent:RightArrowIcon']")
    protected static WebElement viewOrderDetailsRightArrow;

    @FindBy(xpath = "//*[@resource-id='FDCheckoutTitle:HeaderTitle'] | //*[@name='FDCheckoutTitle:HeaderTitle']")
    protected static WebElement pickUpDetailsLabel;

    @FindBy(xpath = "//*[@resource-id='OrderStatus:AddressTestId']//android.widget.TextView | //*[@name='OrderStatus:AddressTestId']")
    protected static List<WebElement> addressInOrderConfirmation;

    @FindBy(xpath = "//*[@content-desc='Get Directions'] | //*[@name='Get Directions']")
    protected static WebElement getDirectionsLabel;

    @FindBy(xpath = "//*[@resource-id='OrderStatus:MapTestId'] | //*[@name='OrderStatus:MapTestId']")
    protected static WebElement getDirectionsMap;

    @FindBy(xpath = "//*[@resource-id='OrderStatus:AddressBottomTestId']//android.widget.TextView | //*[@name='OrderStatus:AddressBottomTestId']")
    protected static List<WebElement> pickUpPerson;

    @FindBy(xpath = "//*[@content-desc='Items in Order'] | //*[@name='Items in Order']")
    protected static WebElement itemsInOrderLabel;

    @FindBy(xpath = "//*[@resource-id='ItemImage:TestId'] | //*[@name='ItemImage:TestId']")
    protected static WebElement itemImageInOrder;

    @FindBy(xpath = "//*[@resource-id='ItemProductPrice:TestID'] | //*[@name='ItemProductPrice:TestID']")
    protected static WebElement itemProductPrice;

    @FindBy(xpath = "//*[@resource-id='ItemQuality:TestID'] | //*[@name='ItemQuality:TestID']")
    protected static WebElement itemQuantity;

    @FindBy(xpath = "//*[@resource-id='ItemProductDescriptions:TestID'] | //*[@name='ItemProductDescriptions:TestID']")
    protected static WebElement itemProductDescriptions;

    @FindBy(xpath = "//*[@content-desc='Buy Again']//android.widget.TextView | //*[@name='Buy Again']")
    protected static WebElement buyAgainButton;

    @FindBy(xpath = "//*[@content-desc='Paid via PayPal'] | //*[@name='Paid via PayPal']")
    protected static WebElement paidViaPaypal;

    @FindBy(xpath = "//*[@content-desc='Estimated Total'] | //*[@name='Estimated Total']")
    protected static WebElement amountPrice;

    @FindBy(xpath = "//*[@resource-id='SuggestedAddress:SuggestedAddressTitle'] | //*[@name='SuggestedAddress:SuggestedAddressTitle']")
    protected static WebElement suggestedAddressTitleText;

    @FindBy(xpath = "//*[@resource-id='SuggestedAddress:UseAddressEntered'] | //*[@name='SuggestedAddress:UseAddressEntered']")
    protected static WebElement useAddressAsEnteredButton;

    @FindBy(xpath = "//*[@resource-id='SuggestedAddress:UseSuggestedAddress'] | //*[@name='SuggestedAddress:UseSuggestedAddress']")
    protected static WebElement useSuggestedAddressButton;

    @FindBy(xpath = "//*[@resource-id='FDButton:title'] | //*[@name='FDButton:title']")
    protected static WebElement editSuggestedAddressButton;

    @FindBy(xpath = "//android.widget.TextView | //*[@name='Type something...']")
    protected static WebElement selectState;

    public String getCheckoutHeaderText() {
        return driverManagerUtils.getElementText(checkoutHeader);
    }

    public String getInStorePickDetailsText() {
        return driverManagerUtils.getElementText(inStorePickDetails);
    }

    public String getPickUpAddressStoreNameText() {
        return driverManagerUtils.getElementText(pickUpAddressStoreName);
    }

    public boolean isPickUpAddressPresent() {
        return driverManagerUtils.isElementDisplayed(pickUpAddress.get(0));
    }

    public String getPickUpAddressPhoneNumberText() {
        return driverManagerUtils.getElementText(pickUpAddressPhoneNumber);
    }

    public boolean isItemImagePresent() {
        return driverManagerUtils.isElementDisplayed(itemImage);
    }

    public boolean isItemBadgePresent() {
        return driverManagerUtils.isElementDisplayed(itemBadge);
    }

    public boolean isPaymentIconPresent() {
        return driverManagerUtils.isElementDisplayed(paymentIcon);
    }

    public String getPaymentInformationText() {
        return driverManagerUtils.getElementText(paymentInformationLabel);
    }

    public String getPaymentInfoAddTextText() {
        return driverManagerUtils.getElementText(paymentAddLabel);
    }

    public void clickOnAddPaymentText() {
        driverManagerUtils.clickElement(paymentAddLabel);
    }

    public String getSmsNotificationTextUpdatesText() {
        if (DriverManagerUtils.configuration.mobilePlatform().equalsIgnoreCase("android")) {
            return driverManagerUtils.getElementText(smsNotificationTextUpdates)
                + driverManagerUtils.getElementText(smsNotificationOptional);
        } else {
            return driverManagerUtils.getElementText(smsNotificationTextUpdates);
        }
    }

    public String getSmsNotificationAddText() {
        return driverManagerUtils.getElementText(smsNotificationAddButton);
    }

    public void clickOnAddSmsNotificationButton() {
        driverManagerUtils.clickElement(smsNotificationAddButton);
    }

    public String getSmsUpdatesModalHeaderText() {
        return driverManagerUtils.getElementText(smsUpdatesModalHeader);
    }

    public boolean isSmsUpdatesCloseButtonPresent() {
        return driverManagerUtils.isElementDisplayed(smsUpdatesCloseButton);
    }

    public void clickOnSmsUpdatesCloseButton() {
        driverManagerUtils.clickElement(smsUpdatesCloseButton);
    }

    public String getYourPhoneNumberTitleText() {
        return driverManagerUtils.getElementText(yourPhoneNumberLabel);
    }

    public String getSmsUpdatesPhoneNumber() {
        return driverManagerUtils.getElementText(smsUpdatesPhoneNumber);
    }

    public String getSmsUpdatesMessageText() {
        return driverManagerUtils.getElementText(smsUpdatesMessage);
    }

    public String getOrderUpdatesText() {
        return driverManagerUtils.getElementText(orderUpdates);
    }

    public String getOrderUpdatesDescription() {
        return driverManagerUtils.getElementText(orderUpdatesDescription);
    }

    public boolean isOrderUpdatesToggleButtonPresent() {
        return driverManagerUtils.isElementDisplayed(orderUpdatesToggle);
    }

    public void clickOrderUpdatesToggleButton() {
        driverManagerUtils.clickElement(orderUpdatesToggle);
    }

    public String getSmsUpdatesTermsMessageText() {
        return driverManagerUtils.getElementText(smsUpdatesTermsMessage);
    }

    public String getSmsUpdatesTermsLinkText() {
        return driverManagerUtils.getElementText(smsUpdatesTermsLink);
    }

    public void clickOnSmsUpdatesTermsLink() {
        driverManagerUtils.clickElement(smsUpdatesTermsLink);
    }

    public String getSmsUpdatesPrivacyPolicyLinkText() {
        return driverManagerUtils.getElementText(smsUpdatesPrivacyPolicyLink);
    }

    public void clickOnSmsUpdatesPrivacyPolicyLink() {
        driverManagerUtils.clickElement(smsUpdatesPrivacyPolicyLink);
    }

    public String getMarketingNotificationText() {
        return driverManagerUtils.getElementText(marketingNotification);
    }

    public String getMarketingNotificationDescriptionText() {
        return driverManagerUtils.getElementText(marketingNotificationDescription);
    }

    public boolean isMarketingNotificationToggleButtonPresent() {
        return driverManagerUtils.isElementDisplayed(marketingNotificationToggle);
    }

    public String getSmsUpdatesSaveText() {
        return driverManagerUtils.getElementText(smsUpdatesSaveButton);
    }

    public boolean isSmsUpdatesSaveButtonEnabled() {
        return driverManagerUtils.isElementDisplayed(smsUpdatesSaveButton);
    }

    public void clickSmsUpdatesSaveCTA() {
        driverManagerUtils.clickElement(smsUpdatesSaveButton);
    }

    public String getMobileNumberLabelText() {
        return driverManagerUtils.getElementText(mobileNumberLabel);
    }

    public String getMobileNumberText() {
        return driverManagerUtils.getElementText(mobileNumber);
    }

    public String getTermsAndPrivacyMessageText() {
        return driverManagerUtils.getElementText(termAndPrivacyTextOne)
                + driverManagerUtils.getElementText(termAndPrivacyTextTwo)
                + driverManagerUtils.getElementText(termAndPrivacyTextThree)
                + driverManagerUtils.getElementText(termAndPrivacyTextFour);
    }

    public String getOrderConfirmationUpdatesText() {
        return driverManagerUtils.getElementText(orderConfirmationTitle).trim();
    }

    public boolean isOrderConfirmationEmailPresent() {
        return driverManagerUtils.isElementDisplayed(orderConfirmationEmail);
    }

    public String getPlaceOrderDescText() {
        return driverManagerUtils.getElementText(placeOrderTitle);
    }

    public String getTermsAndConditionsText() {
        return driverManagerUtils.getElementText(termsAndConditionsText);
    }

    public void clickOnTermsAndConditionsLink() {
        driverManagerUtils.clickElement(termsAndConditionsText);
    }

    public boolean isTermsAndConditionsWebPagePresent() {
        return driverManagerUtils.isElementDisplayed(termsAndConditionsWebPage);
    }

    public String getSmartCouponSectionText() {
        return driverManagerUtils.getElementText(smartCouponSectionText);
    }

    public String getWantToAddRemoveText() {
        return driverManagerUtils.getElementText(wantToAddRemoveText);
    }

    public String getReturnToCartText() {
        return driverManagerUtils.getElementText(returnToCartLink);
    }

    public void clickOnReturnToCartLink() {
        driverManagerUtils.clickElement(returnToCartLink);
    }

    public String getOrderPriceText() {
        return driverManagerUtils.getElementText(OrderPrice);
    }

    public String getOrderQuantityText() {
        return driverManagerUtils.getElementText(OrderQuantity);
    }

    public String getPlaceOrderText() {
        return driverManagerUtils.getElementText(placeOrderButton);
    }

    public void clickOnPlaceOrderButton() {
        driverManagerUtils.clickElement(placeOrderButton);
    }

    public String getPaymentHeaderText() {
        return driverManagerUtils.getElementText(paymentHeader);
    }

    public boolean isPaymentPopupCancelButtonPresent() {
        return driverManagerUtils.isElementDisplayed(paymentPopupCancelButton);
    }

    public void clickPaymentPopupCancelButton() {
        driverManagerUtils.clickElement(paymentPopupCancelButton);
    }

    public String getPayWithCardText() {
        return driverManagerUtils.getElementText(payWithCardLabel);
    }

    public void clickPayWithCardButton() {
        driverManagerUtils.clickElement(payWithCardLabel);
    }

    public boolean isPaymentOptionModalCardPresent() {
        return driverManagerUtils.isElementDisplayed(paymentOptionModalCard);
    }

    public String getPayWithPaypalText() {
        return driverManagerUtils.getElementText(payWithPayPalLabel);
    }

    public void clickPayWithPaypalButton() {
        driverManagerUtils.clickElement(payWithPayPalLabel);
    }

    public String getPaymentOptionModalPayPalText() {
        return driverManagerUtils.getElementText(paymentOptionModalPayPal);
    }

    public String getContinueText() {
        return driverManagerUtils.getElementText(continueButton);
    }

    public void clickOnContinueButton() {
        driverManagerUtils.clickElement(continueButton);
    }

    public String getAddCardHeaderText() {
        return driverManagerUtils.getElementText(addCardHeader);
    }

    public boolean isAddCardCancelButtonPresent() {
        return driverManagerUtils.isElementDisplayed(addCardCancelButton);
    }

    public void clickAddCardCancelButton() {
        driverManagerUtils.clickElement(addCardCancelButton);
    }

    public String getNameOnCardText() {
        return driverManagerUtils.getElementText(nameOnCardLabel);
    }

    public String getCardNumberText() {
        return driverManagerUtils.getElementText(cardNumberLabel);
    }

    public String getExpirationText() {
        return driverManagerUtils.getElementText(expirationLabel);
    }

    public String getCVVText() {
        return driverManagerUtils.getElementText(cvvLabel);
    }

    public String getBillingAddressText() {
        return driverManagerUtils.getElementText(billingAddressLabel);
    }

    public String getFirstNameText() {
        return driverManagerUtils.getElementText(firstNameLabel);
    }

    public String getLastNameText() {
        return driverManagerUtils.getElementText(lastNameLabel);
    }

    public String getAddressLine1Text() {
        return driverManagerUtils.getElementText(addressLine1Label);
    }

    public String getAddressLine2Text() {
        return driverManagerUtils.getElementText(addressLine2Label);
    }

    public String getCityText() {
        return driverManagerUtils.getElementText(cityLabel);
    }

    public String getStateText() {
        return driverManagerUtils.getElementText(stateLabel);
    }

    public String getZipCodeText() {
        return driverManagerUtils.getElementText(zipCodeLabel);
    }

    public String getPhoneNumberText() {
        return driverManagerUtils.getElementText(phoneNumberLabel);
    }

    public String getSaveButtonText() {
        return driverManagerUtils.getElementText(saveButton);
    }

    public boolean isTypeAheadPresent() {
        return driverManagerUtils.isElementDisplayed(addressAutoSuggestion);
    }

    public void clickSaveButton() {
        driverManagerUtils.clickElement(saveButton);
    }

    public void clickAddressAutoSuggestion() {
        driverManagerUtils.clickElement(addressAutoSuggestion);
    }

    public void selectFirstAddressInAutoSuggestion() {
        driverManagerUtils.clickElement(selectFirstAddressInAutoSuggestion);
    }

    public void enterNameOnCard(String name) {
        driverManagerUtils.enterText(nameOnCardInputBox, name);
    }

    public void enterCardNumber(String cardNumber) {
        driverManagerUtils.enterText(cardNumberInputBox, cardNumber);
    }

    public void enterCardExpirationDate(String cardExpiryDate) {
        driverManagerUtils.enterText(cardExpirationInputBox, cardExpiryDate);
    }

    public void enterCVV(String cvvNumber) {
        driverManagerUtils.enterText(cvvNumberInputBox, cvvNumber);
    }

    public void enterFirstName(String firstName) {
        driverManagerUtils.enterText(firstNameInputBox, firstName);
    }

    public void enterLastName(String lName) {
        driverManagerUtils.enterText(lastNameInputBox, lName);
    }

    public void enterAddressLine1(String address) {
        driverManagerUtils.enterText(addressLine1InputBox, address);
    }

    public String getInputAddressLine1Text() {
        return driverManagerUtils.getElementText(addressLine1InputBox);
    }

    public void enterCity(String city) {
        driverManagerUtils.enterText(cityInputBox, city);
    }

    public void enterPhoneNumber(String phoneNumber) {
        driverManagerUtils.closeKeyPadAndEnterText(phoneNumberInputBox, phoneNumber);
    }

    public boolean isNameOnCardErrorPresent() {
        return driverManagerUtils.isElementDisplayed(nameOnCardError);
    }

    public boolean isCardNumberErrorPresent() {
        return driverManagerUtils.isElementDisplayed(cardNumberError);
    }

    public boolean isCardExpirationErrorPresent() {
        return driverManagerUtils.isElementDisplayed(cardExpirationError);
    }

    public boolean isCVVErrorPresent() {
        return driverManagerUtils.isElementDisplayed(cvvError);
    }

    public boolean isAddressFirstNameErrorPresent() {
        return driverManagerUtils.isElementDisplayed(addressFirstNameError);
    }

    public boolean isAddressLastNameErrorPresent() {
        return driverManagerUtils.isElementDisplayed(addressLastNameError);
    }

    public boolean isAddressLine1ErrorPresent() {
        return driverManagerUtils.isElementDisplayed(addressLine1Error);
    }

    public boolean isAddressCityErrorPresent() {
        return driverManagerUtils.isElementDisplayed(addressCityError);
    }

    public boolean isAddressStateErrorPresent() {
        return driverManagerUtils.isElementDisplayed(addressStateError);
    }

    public boolean isAddressZipCodeErrorPresent() {
        return driverManagerUtils.isElementDisplayed(addressZipCodeError);
    }

    public boolean isAddressPhoneErrorPresent() {
        return driverManagerUtils.isElementDisplayed(addressPhoneError);
    }

    public String getEditText() {
        return driverManagerUtils.getElementText(editPaymentText);
    }

    public String getPaymentHeading() {
        return driverManagerUtils.getElementText(paymentHeading);
    }

    public String getPaymentExpiration() {
        return driverManagerUtils.getElementText(paymentExpiration);
    }

    public boolean isPaymentInfoContainerPresent() {
        return driverManagerUtils.isElementDisplayed(paymentInfoContainer);
    }

    public void clickEditPayment() {
        driverManagerUtils.clickElement(editPaymentText);
    }

    public String getAddressHeaderTitleText() {
        return driverManagerUtils.getElementText(addCardHeader);
    }

    public boolean isPlaceOrderButtonEnabled(){
        return driverManagerUtils.isElementEnabled(placeOrderButton);
    }

    public boolean isPaypalPaymentOption(){
        return driverManagerUtils.isElementDisplayed(paypalPaymentOption);
    }

    public String getOrderConfirmationHeaderText() {
        return driverManagerUtils.getElementText(orderConfirmationHeader);
    }

    public String getThankYouMessageText() {
        return driverManagerUtils.getElementText(thankYouMessageText);
    }

    public String  getOrderIdText() {
        return driverManagerUtils.getElementText(orderId);
    }

    public String getViewOrderDetailsText() {
        return driverManagerUtils.getElementText(viewOrderDetails);
    }

    public boolean isViewOrderDetailsRightArrowPresent() {
        return driverManagerUtils.isElementDisplayed(viewOrderDetailsRightArrow);
    }

    public String getPickUpDetailsText() {
        return driverManagerUtils.getElementText(pickUpDetailsLabel);
    }

    public boolean isAddressInOrderConfirmationPresent() {
        return driverManagerUtils.isElementDisplayed(addressInOrderConfirmation.get(0))
                && driverManagerUtils.isElementDisplayed(addressInOrderConfirmation.get(1));
    }

    public String getGetDirectionsText() {
        return driverManagerUtils.getElementText(getDirectionsLabel);
    }

    public boolean isGetDirectionsMapPresent() {
        return driverManagerUtils.isElementDisplayed(getDirectionsMap);
    }

    public String getPickUpPersonText() {
        return driverManagerUtils.getElementText(pickUpPerson.get(0));
    }

    public boolean isUserNamePresent() {
        return driverManagerUtils.isElementDisplayed(pickUpPerson.get(1));
    }

    public String getEmail() {
        return driverManagerUtils.getElementText(pickUpPerson.get(2));
    }

    public String getPhoneNumber() {
        return driverManagerUtils.getElementText(pickUpPerson.get(3));
    }

    public String getItemsInOrderText() {
        return driverManagerUtils.getElementText(itemsInOrderLabel);
    }

    public boolean isItemImageInOrderPresent() {
        return driverManagerUtils.isElementDisplayed(itemImageInOrder);
    }

    public boolean isItemProductPricePresent() {
        return driverManagerUtils.isElementDisplayed(itemProductPrice);
    }

    public String getItemQuantityText() {
        return driverManagerUtils.getElementText(itemQuantity);
    }

    public boolean isItemProductDescriptionsPresent() {
        return driverManagerUtils.isElementDisplayed(itemProductDescriptions);
    }

    public String getBuyAgainText() {
        return driverManagerUtils.getElementText(buyAgainButton);
    }

    public void clickBuyAgainButton() {
        driverManagerUtils.clickElement(buyAgainButton);
    }

    public String getPaidViaPaypalText() {
        return driverManagerUtils.getElementText(paidViaPaypal);
    }

    public boolean isAmountPricePresent() {
        return driverManagerUtils.isElementDisplayed(amountPrice);
    }

    public String getSuggestedAddressTitleText() {
        return driverManagerUtils.getElementText(suggestedAddressTitleText);
    }

    public void clickUseAddressAsEnteredButton() {
        driverManagerUtils.clickElement(useAddressAsEnteredButton);
    }

    public boolean isPaymentHeadingPresent() {
        return driverManagerUtils.isElementDisplayed(paymentHeading);
    }

    public boolean isPaymentExpirationPresent() {
        return driverManagerUtils.isElementDisplayed(paymentExpiration);
    }

    public void clickAddressLine1Label() {
        driverManagerUtils.clickElement(addressLine1Label);
    }

    public void clickStateDropdown() {
        driverManagerUtils.clickElement(stateInputBox);
    }

    public void enterState(String state) {
        driverManagerUtils.enterText(typeStateInputBox, state);
    }

    public void selectState() {
        driverManagerUtils.clickElement(selectState);
    }

    public void enterZipCode(String zipcode) {
        driverManagerUtils.closeKeyPadAndEnterText(zipCodeInputBox, zipcode);
    }

    public void clickUseSuggestedAddressButton() {
        driverManagerUtils.clickElement(useSuggestedAddressButton);
    }

    public void clickEditSuggestedAddressButton() {
        driverManagerUtils.clickElement(editSuggestedAddressButton);
    }

    public void clickPhoneNumberLabel() {
        driverManagerUtils.clickElement(phoneNumberLabel);
    }
}
