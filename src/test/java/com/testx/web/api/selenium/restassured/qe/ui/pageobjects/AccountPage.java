package com.testx.web.api.selenium.restassured.qe.ui.pageobjects;

import com.testx.web.api.selenium.restassured.qe.ui.context.TestContext;
import com.testx.web.api.selenium.restassured.qe.ui.stepdefinitions.BaseSetup;
import com.testx.web.api.selenium.restassured.qe.ui.webdriver.DriverManagerUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class AccountPage extends BaseSetup {

    @FindBy(xpath = "//*[contains(@class,'widget.TextView')] | //XCUIElementTypeOther[contains(@name,'')]")
    protected static List<WebElement> btnWebElements;

    @FindBy(xpath = "//*[@content-desc='Account'] | //*[@name='Account']")
    protected static WebElement accountPageHeader;

    @FindBy(xpath = "//*[@resource-id='AccountSettings:UserInfo'] | //*[@name='AccountSettings:UserInfo']")
    protected static WebElement userInfo;

    @FindBy(xpath = "//*[@resource-id='AccountSettings:PersonalInfo:SectionList:LabelTitle'] | //*[@name='AccountSettings:PersonalInfo:SectionList:LabelTitle']")
    protected static WebElement personalInfoLabel;

    @FindBy(xpath = "//*[@resource-id='AccountSettings:PersonalInfo:SectionList:LabelTitle:Edit'] | //*[@name='AccountSettings:PersonalInfo:SectionList:LabelTitle:Edit']")
    protected static WebElement editLink;

    @FindBy(xpath = "//*[@resource-id='ProfileView:RenderItemMainViewName'] | //*[@name='Name']")
    protected static WebElement namebtn;

    @FindBy(xpath = "//*[@resource-id='AccountSettings:YourStoreInfo:Your Store'] | //*[@name='AccountSettings:YourStoreInfo:Your Store']")
    protected static WebElement yourStore;

    @FindBy(xpath = "//*[@resource-id='AccountSettings:YourStoreInfo:SectionList:LabelTitle'] | //XCUIElementTypeOther[contains(@name,'AccountSettings:YourStoreInfo')]")
    protected static WebElement storeAddress;

    @FindBy(xpath = "//*[@resource-id='AccountSettings:YourStoreInfo:SectionList:LabelTitle:Change'] | //*[@name='Change']")
    protected static WebElement changeStore;

    @FindBy(xpath = "//*[@resource-id='AccountLoginSection:Instruction'] | //*[@name='AccountLoginSection:Instruction']")
    protected static WebElement accountSubTitle;

    @FindBy(xpath = "//*[@resource-id='AccountLoginSection:SignInLink']//android.widget.TextView | //*[@name='AccountLoginSection:SignInLink']")
    protected static WebElement btnLogin;

    @FindBy(xpath = "//*[@resource-id='AccountLoginSection:DontHaveAccountLink']//android.widget.TextView | //*[@name='AccountLoginSection:DontHaveAccountLink']")
    protected static WebElement btnCreateOne;

    @FindBy(xpath = "//*[@resource-id='ProfileView:SignOutButtonTestId']//android.widget.TextView | //*[@name='ProfileView:SignOutButtonTestId']")
    protected static WebElement btnSignOut;

    @FindBy(xpath = "//*[contains(@class,'widget.TextView')] | //XCUIElementTypeStaticText[contains(@name,'')]")
    protected static List<WebElement> webViewHeaderText;

    @FindBy(xpath = "//*[@resource-id='FdProfileHeader:LeftIcon'] | //*[@name='FdProfileHeader:LeftIcon']")
    protected static WebElement webViewCloseButton;

    @FindBy(xpath = "//*[@resource-id='SectionList:HeaderTitle' and (@text='Legal')] | //XCUIElementTypeOther[@name='Legal']")
    protected static WebElement legalHeading;

    @FindBy(xpath = "//*[@resource-id='SectionList:HeaderTitle' and (@text='Support')] | //XCUIElementTypeOther[@name='Support']")
    protected static WebElement supportHeading;

    @FindBy(xpath = "//*[@resource-id='HeaderComponentBackIconTestId:Back'] | //XCUIElementTypeOther[@name='HeaderComponentBackIconTestId:Back']")
    protected static WebElement headerComponentBackIcon;

    @FindBy(xpath = "//*[@resource-id='AccountLoginSection:Title'] | //*[@name='AccountLoginSection:Title']")
    protected static WebElement communicationHeader;

    @FindBy(xpath = "//*[@resource-id='Notification:Section:toggle'] | //*[@name='Notification:Section:toggle']")
    protected static WebElement btnPushNotificationToggle;

    @FindBy(xpath = "//*[@resource-id='EmailOptin:Section:toggle'] | //*[@name='EmailOptin:Section:toggle']")
    protected static WebElement btnEmailUpdatesToggle;

    @FindBy(xpath = "//*[@resource-id='Biometric:Section:toggle'] | //*[@name='Biometric:Section:toggle']")
    protected static WebElement btnBiometricsToggle;

    @FindBy(xpath = "//*[@text='Share Shopping Information']/following-sibling::android.widget.Switch | //XCUIElementTypeOther[@name='Share Shopping Information']")
    protected static WebElement btnShareShoppingInformationToggle;

    @FindBy(xpath = "//*[@content-desc='Account Settings'] | //*[@label='Account Settings'] | //*[@name='AccountSubSettings:SubSettings:SectionList:HeaderTitle']")
    protected static WebElement accountSettingsLabel;

    @FindBy(xpath = "//*[@content-desc='Communications'] | //*[@name='Communications']")
    protected static WebElement communicationsLink;

    @FindBy(xpath = "//*[@content-desc='App Settings'] | //*[@name='App Settings']")
    protected static WebElement appSettingsLink;

    @FindBy(xpath = "//*[@content-desc='Support'] | //*[@name='AccountSupportSettings:SupportSettings:SectionList:HeaderTitle'] | //*[@name='AccountSupportSettings:SupportSettingsForNotLoggedIn:SectionList:HeaderTitle']")
    protected static WebElement supportTitle;

    @FindBy(xpath = "//*[@content-desc='Help'] | //*[@name='Help']")
    protected static WebElement helpLink;

    @FindBy(xpath = "//*[@content-desc='Delete Account'] | //*[@name='Delete Account']")
    protected static WebElement deleteAccountLink;

    @FindBy(xpath = "//*[@resource-id='WebViewScreen:SafeAreaContainer']//android.widget.TextView | //XCUIElementTypeStaticText[@name='Help']")
    protected static WebElement webPageHeader;

    @FindBy(xpath = "//*[@text='FIND A STORE'] | //*[@text='TrustedSite Certified'] | //*[@name='Family Dollar | General Discount & Dollar Store | Online Shopping']")
    protected static WebElement visitSiteWeb;

    @FindBy(xpath = "//*[@resource-id='com.android.chrome:id/positive_button'] | //*[@name='Allow']")
    protected static WebElement allowDeviceLocation;

    @FindBy(xpath = "//*[@content-desc='Legal'] | //*[@label='Legal']")
    protected static WebElement legalLink;

    @FindBy(xpath = "//*[@content-desc='Privacy Policy'] | //*[@name='Privacy Policy']")
    protected static WebElement privacyPolicyLink;

    @FindBy(xpath = "//*[@resource-id='com.android.permissioncontroller:id/permission_allow_foreground_only_button'] | //*[@name='Allow While Using App']")
    protected static WebElement allowWhileUsingAPP;

    @FindBy(xpath = "//*[@resource-id='WebViewScreen:SafeAreaContainer']//android.widget.TextView | //XCUIElementTypeStaticText[@name='Privacy Policy']")
    protected static WebElement privacyPolicyWebPage;

    @FindBy(xpath = "//*[@content-desc='Terms & Conditions'] | //*[@name='Terms & Conditions']")
    protected static WebElement termsAndConditionsLink;

    @FindBy(xpath = "//*[@resource-id='WebViewScreen:SafeAreaContainer']//android.widget.TextView | //XCUIElementTypeStaticText[@name='Terms & Conditions']")
    protected static WebElement termsAndConditionsWebPage;

    @FindBy(xpath = "//*[@content-desc='Smart Coupons® Terms'] | //*[@name='Smart Coupons® Terms']")
    protected static WebElement smartCouponsTermsLink;

    @FindBy(xpath = "//*[@resource-id='WebViewScreen:SafeAreaContainer']//android.widget.TextView | //XCUIElementTypeStaticText[@name='Smart Coupons® Terms']")
    protected static WebElement smartCouponsTermsWebPage;

    @FindBy(xpath = "//*[@content-desc='Coupon Policy'] | //*[@name='Coupon Policy']")
    protected static WebElement couponsPolicyLink;

    @FindBy(xpath = "//*[@resource-id='WebViewScreen:SafeAreaContainer']//android.widget.TextView | //XCUIElementTypeStaticText[@name='Coupon Policy']")
    protected static WebElement couponsPolicyWebPage;

    @FindBy(xpath = "//*[@content-desc='California Information Sharing Disclosure'] | //*[@name='California Information Sharing Disclosure']")
    protected static WebElement californiaInformationLink;

    @FindBy(xpath = "//*[@resource-id='WebViewScreen:SafeAreaContainer']//android.widget.TextView | //XCUIElementTypeStaticText[@name='California Information Sharing Disclosure']")
    protected static WebElement californiaInformationWebPage;

    @FindBy(xpath = "//*[@resource-id='AccountSettingsFooter:VersionNumber'] | //*[@name='AccountSettingsFooter:VersionNumber']")
    protected static WebElement versionNumber;

    @FindBy(xpath = "//*[@resource-id='AccountSettingsFooter:TradeMarkText'] | //*[@name='AccountSettingsFooter:TradeMarkText']")
    protected static WebElement tradeMarkText;

    @FindBy(xpath = "//*[@text='Profile'] | //*[@name='Profile']")
    protected static WebElement profileHeader;

    @FindBy(xpath = "//*[@content-desc='Personal Information'] | //*[@name='Personal Information']")
    protected static WebElement personalInfo;

    @FindBy(xpath = "//*[@content-desc='Name'] | //*[@name='Name']")
    protected static WebElement nameLabel;

    @FindBy(xpath = "//*[@content-desc='Date of Birth'] | //*[@name='Date of Birth']")
    protected static WebElement dateOfBirthLabel;

    @FindBy(xpath = "//*[@content-desc='ZIP Code'] | //*[@name='ZIP Code']")
    protected static WebElement zipcodeLabel;

    @FindBy(xpath = "//*[@content-desc='Password'] | //*[@name='Password']")
    protected static WebElement passwordLabel;

    @FindBy(xpath = "//*[@text='Contact Information'] | //*[@name='Contact Information']")
    protected static WebElement contactInformationLabel;

    @FindBy(xpath = "//*[@content-desc='Email'] | //*[@name='Email']")
    protected static WebElement emailLabel;

    @FindBy(xpath = "//*[@content-desc='Phone Number'] | //*[@name='Phone Number']")
    protected static WebElement phoneNumberLabel;

    @FindBy(xpath = "//*[@resource-id='ProfileView :BodyText'] | //*[@name='ProfileView :BodyText']")
    protected static WebElement fdEmployeeLabel;

    @FindBy(xpath = "//*[@resource-id='ProfileView :ButtonText'] | //*[@name='ProfileView :ButtonText']")
    protected static WebElement associateIDLabel;

    @FindBy(xpath = "//*[@resource-id='ProfileUpdateComponent:dateOfBirth'] | //*[@name='FieldComponent:textField']")
    protected static WebElement dOBInputBox;

    @FindBy(xpath = "//*[@text='OK'] | //*[@name='ProfileUpdateComponent:saveButton']")
    protected static WebElement okButtonOnCalender;

    @FindBy(xpath = "//*[@text='Date of birth must not be the current date'] | //*[@name='Date of birth must not be the current date']")
    protected static WebElement curretnDateDOBError;

    public AccountPage(TestContext testContext) {
        super(testContext);
        PageFactory.initElements(testContext.getDriverManager().getDriver(), this);
    }

    public String getAccountHeaderText() {
        return driverManagerUtils.getElementText(accountPageHeader);
    }

    public String getUserInfoText() {
        return driverManagerUtils.getElementText(userInfo);
    }

    public String getPersonalInfoText() {
        return driverManagerUtils.getElementText(personalInfoLabel);
    }

    public String getEditText() {
        return driverManagerUtils.getElementText(editLink);
    }

    public String getYourStoreText() {
        return driverManagerUtils.getElementText(yourStore);
    }

    public boolean isStoreAddressPresent() {
        return driverManagerUtils.isElementDisplayed(storeAddress);
    }

    public String getChangeStoreText() {
        return driverManagerUtils.getElementText(changeStore);
    }

    public void scrollToLegalSection() {
        driverManagerUtils.scrollToElement(legalHeading);
    }

    public void scrollToSupportSection() {
        driverManagerUtils.scrollToElement(supportHeading);
    }

    public boolean isElementPresent(String buttonName) {
        return driverManagerUtils.isTextDisplayed(btnWebElements, buttonName);
    }

    public boolean isWebViewHeaderTextDisplayed(String label) {
        return driverManagerUtils.isTextDisplayed(webViewHeaderText, label);
    }

    public void closeWebView() {
        driverManagerUtils.clickElement(webViewCloseButton);
    }

    public boolean isBackButtonPresent() {
        return driverManagerUtils.isElementDisplayed(headerComponentBackIcon);
    }

    public void clickCommunicationBackButton() {
        driverManagerUtils.clickElement(headerComponentBackIcon);
    }

    public void clickButton(String buttonName) {
        driverManagerUtils.clickByLabel(btnWebElements, buttonName);
    }

    public boolean isCommunicationHeaderPresent() {
        return driverManagerUtils.isElementDisplayed(communicationHeader);
    }

    public void clickPushNotificationToggleButton() {
        driverManagerUtils.clickElement(btnPushNotificationToggle);
    }

    public void clickEmailUpdatesToggleButton() {
        driverManagerUtils.clickElement(btnEmailUpdatesToggle);
    }

    public boolean isPushNotificationsToggleEnabled() {
        DriverManagerUtils.sleep(1);
        return driverManagerUtils.isElementEnabled(btnPushNotificationToggle);
    }

    public boolean isEmailUpdatesToggleEnabled() {
        return driverManagerUtils.isElementEnabled(btnEmailUpdatesToggle);
    }

    public void clickBiometricToggleButton() {
        driverManagerUtils.clickElement(btnBiometricsToggle);
    }

    public boolean isBiometricToggleEnabled() {
        return driverManagerUtils.isElementEnabled(btnBiometricsToggle);
    }

    public void clickShareShoppingInformationToggleButton() {
        driverManagerUtils.clickElement(btnShareShoppingInformationToggle);
    }

    public boolean isShareShoppingInformationToggleEnabled() {
        return driverManagerUtils.isElementEnabled(btnShareShoppingInformationToggle);
    }

    public void clickProfileEditButton() {
        driverManagerUtils.clickElement(editLink);
    }

    public void clickNameButton() {
        driverManagerUtils.clickElement(namebtn);
    }

    public List<String> getAllLabelText() {
        List<String> list = new ArrayList<>();
        for (WebElement element : btnWebElements) {
            list.add(driverManagerUtils.getElementText(element));
        }
        return list;
    }

    public void clickSignOutButton() {
        if (!driverManagerUtils.isElementDisplayed(btnSignOut)) {
            driverManagerUtils.scrollDown();
        }
        driverManagerUtils.clickElement(btnSignOut);
    }

    public boolean isSignOutButtonPresent() {
        if (!driverManagerUtils.isElementDisplayed(btnSignOut)) {
            driverManagerUtils.scrollDown();
        }
        return driverManagerUtils.isElementDisplayed(btnSignOut);
    }

    public String getAccountTitleText() {
        return driverManagerUtils.getElementText(communicationHeader);
    }

    public String getAccountSubTitleText() {
        return driverManagerUtils.getElementText(accountSubTitle);
    }

    public String getLogInLinkText() {
        return driverManagerUtils.getElementText(btnLogin);
    }

    public void clickLogInButton() {
        driverManagerUtils.clickElement(btnLogin);
    }

    public String getCreateOneLinkText() {
        return driverManagerUtils.getElementText(btnCreateOne);
    }

    public void clickCreateOneButton() {
        driverManagerUtils.clickElement(btnCreateOne);
    }

    public String getAccountSettingsText() {
        return driverManagerUtils.getElementText(accountSettingsLabel);
    }

    public String getCommunicationsText() {
        return driverManagerUtils.getElementText(communicationsLink);
    }

    public void clickCommunicationsButton() {
        driverManagerUtils.clickElement(communicationsLink);
    }

    public String getAppSettingsText() {
        return driverManagerUtils.getElementText(appSettingsLink);
    }

    public void clickAppSettingsButton() {
        driverManagerUtils.clickElement(appSettingsLink);
    }

    public String getSupportText() {
        return driverManagerUtils.getElementText(supportTitle);
    }

    public String getHelpText() {
        return driverManagerUtils.getElementText(helpLink);
    }

    public void clickHelpButton() {
        driverManagerUtils.clickElement(helpLink);
    }

    public String getDeleteAccountText() {
        return driverManagerUtils.getElementText(deleteAccountLink);
    }

    public void clickDeleteAccountButton() {
        driverManagerUtils.clickElement(deleteAccountLink);
    }

    public String getWebPageHeaderText() {
        DriverManagerUtils.sleep(10);
        return driverManagerUtils.getElementText(webPageHeader);
    }

    public boolean isVisitSiteWebPageDisplayed() {
        if (driverManagerUtils.isElementDisplayed(allowDeviceLocation)) {
            driverManagerUtils.clickElement(allowDeviceLocation);
        }
        return driverManagerUtils.isElementDisplayed(visitSiteWeb);
    }

    public String getLegalText() {
        return driverManagerUtils.getElementText(legalLink);
    }

    public String getPrivacyPolicyText() {
        return driverManagerUtils.getElementText(privacyPolicyLink);
    }

    public void clickPrivacyPolicyButton() {
        driverManagerUtils.clickElement(privacyPolicyLink);
    }

    public void clickallowWhileUsingAppBtn() {
        driverManagerUtils.clickElement(allowWhileUsingAPP);
    }

    public String getPrivacyPolicyWebPageHeaderText() {
        return driverManagerUtils.getElementText(privacyPolicyWebPage);
    }

    public String getTermsAndConditionsText() {
        return driverManagerUtils.getElementText(termsAndConditionsLink);
    }

    public void clickTermsAndConditionsButton() {
        driverManagerUtils.clickElement(termsAndConditionsLink);
    }

    public String getTermsAndConditionsWebPageHeaderText() {
        return driverManagerUtils.getElementText(termsAndConditionsWebPage);
    }

    public String getSmartCouponsTermsText() {
        return driverManagerUtils.getElementText(smartCouponsTermsLink);
    }

    public void clickSmartCouponsTermsButton() {
        driverManagerUtils.clickElement(smartCouponsTermsLink);
    }

    public String getSmartCouponsTermsWebPageHeaderText() {
        DriverManagerUtils.sleep(5);
        return driverManagerUtils.getElementText(smartCouponsTermsWebPage);
    }

    public String getCouponPolicyText() {
        return driverManagerUtils.getElementText(couponsPolicyLink);
    }

    public void clickCouponPolicyButton() {
        driverManagerUtils.clickElement(couponsPolicyLink);
    }

    public String getCouponPolicyWebPageHeaderText() {
        return driverManagerUtils.getElementText(couponsPolicyWebPage);
    }

    public String getCaliforniaInformationText() {
        return driverManagerUtils.getElementText(californiaInformationLink);
    }

    public void clickCaliforniaInformationButton() {
        driverManagerUtils.clickElement(californiaInformationLink);
    }

    public String getCaliforniaInformationWebPageHeaderText() {
        return driverManagerUtils.getElementText(californiaInformationWebPage);
    }

    public boolean isVersionNumberDisplayed() {
        return driverManagerUtils.isElementDisplayed(versionNumber);
    }

    public boolean isTradeMarkTextDisplayed() {
        return driverManagerUtils.isElementDisplayed(tradeMarkText);
    }

    public String getProfileHeaderText() {
        return driverManagerUtils.getElementText(profileHeader);
    }

    public String getPersonalInformationText() {
        return driverManagerUtils.getElementText(personalInfo);
    }

    public String getNameText() {
        return driverManagerUtils.getElementText(nameLabel);
    }

    public String getDateOfBirthText() {
        return driverManagerUtils.getElementText(dateOfBirthLabel);
    }

    public String getZipCodeText() {
        return driverManagerUtils.getElementText(zipcodeLabel);
    }

    public String getPasswordText() {
        return driverManagerUtils.getElementText(passwordLabel);
    }

    public String getContactInformationText() {
        return driverManagerUtils.getElementText(contactInformationLabel);
    }

    public String getEmailText() {
        return driverManagerUtils.getElementText(emailLabel);
    }

    public String getPhoneNumberText() {
        return driverManagerUtils.getElementText(phoneNumberLabel);
    }

    public String getFDEmployeeText() {
        return driverManagerUtils.getElementText(fdEmployeeLabel);
    }

    public String getAssociateIdNumberText() {
        return driverManagerUtils.getElementText(associateIDLabel);
    }

    public void tapOnDOBInput() {
        driverManagerUtils.clickElement(dOBInputBox);
    }

    public void tapOnOkButtonOnCalender() {
        driverManagerUtils.clickElement(okButtonOnCalender);
    }

    public boolean verifyCurrentDateErrorMessage() {
        return driverManagerUtils.isElementDisplayed(curretnDateDOBError);
    }
}
