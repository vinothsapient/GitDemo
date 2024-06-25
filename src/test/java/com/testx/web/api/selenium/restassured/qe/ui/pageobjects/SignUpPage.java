package com.testx.web.api.selenium.restassured.qe.ui.pageobjects;

import com.testx.web.api.selenium.restassured.qe.ui.context.TestContext;
import com.testx.web.api.selenium.restassured.qe.ui.stepdefinitions.BaseSetup;
import com.testx.web.api.selenium.restassured.qe.ui.webdriver.DriverManagerUtils;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage extends BaseSetup {

    public SignUpPage(TestContext testContext) {
        super(testContext);
        PageFactory.initElements(testContext.getDriverManager().getDriver(), this);
    }

    @FindBy(xpath = "//*[contains(@class,'widget.TextView')] | //XCUIElementTypeOther[contains(@name,'')] | //XCUIElementTypeButton[contains(@label,'')] | //XCUIElementTypeStaticText[contains(@name,'')]")
    protected static List<WebElement> btnWebElements;

    @FindBy(xpath = "//*[@resource-id='FdAppHeader:BackIcon'] | //*[@name='FdAppHeader:BackIcon']")
    protected static WebElement btnBack;

    @FindBy(xpath = "//*[@content-desc='App Header']//com.horcrux.svg.SvgView | //*[@name='FdAppHeader:Container']")
    protected static WebElement familyDollarIcon;

    @FindBy(xpath = "//*[@resource-id='FDSignUp:Heading'] | //*[@name='FDSignUp:Heading']")
    protected static WebElement signUpHeader;

    @FindBy(xpath = "//*[@resource-id='FDSignUp:SubHeading'] | //*[@name='FDSignUp:SubHeading']")
    protected static WebElement headerSubText;

    @FindBy(xpath = "//*[@resource-id='FDSignUp:LoginCTA'] | //*[@name='FDSignUp:LoginCTA']")
    protected static WebElement btnLogin;

    @FindBy(xpath = "//*[@resource-id='FDTipView:ErrorImage'] | //*[@name='FDTipView:ErrorImage']")
    protected static WebElement bulbIcon;

    @FindBy(xpath = "//*[@resource-id='StoreFinder:SearchBar']//com.horcrux.svg.SvgView | ((//*[@name='StoreFinder:SearchBar'])[2]//XCUIElementTypeOther)[2]")
    protected static WebElement storeSearchIcon;

    @FindBy(xpath = "//*[@resource-id='StoreFinder:SearchBarTextInput'] | //*[@name='StoreFinder:SearchBarTextInput']")
    protected static WebElement storeSearchBarTextInput;

    @FindBy(xpath = "//*[@content-desc='Google Map'] | //*[@name='StoreFinderMap:MapComponent']")
    protected static WebElement googleMap;

    @FindBy(xpath = "//*[@resource-id='StoreList:ListView'] | //*[@name='StoreList:ListView']")
    protected static WebElement storeList;

    @FindBy(xpath = "//*[@resource-id='StoreListRow:LeftView']//com.horcrux.svg.u")
    protected static WebElement selectStoreAndroid;

    @FindBy(xpath = "//*[@name='StoreListRow:LeftView']")
    protected static WebElement selectStoreIOS;

    @FindBy(xpath = "//*[@resource-id='FDTipView:Title'] | //*[@name='FDTipView:Title']")
    protected static WebElement signUpTip;

    @FindBy(xpath = "//*[@resource-id='FDTipView:Description'] | //*[@name='FDTipView:Description']")
    protected static WebElement tipDescription;

    @FindBy(xpath = "//*[@resource-id='FDSignUp:FirstNameLabel'] | //*[@name='FDSignUp:FirstNameLabel']")
    protected static WebElement firstNameLabel;

    @FindBy(xpath = "//*[@resource-id='FDSignUp:FirstName'] | //*[@name='FDSignUp:FirstName']")
    protected static WebElement firstNameInputBox;

    @FindBy(xpath = "//*[@resource-id='FDSignUp:LastNameLabel'] | //*[@name='FDSignUp:LastNameLabel']")
    protected static WebElement lastNameLabel;

    @FindBy(xpath = "//*[@resource-id='FDSignUp:LastName'] | //*[@name='FDSignUp:LastName']")
    protected static WebElement lastNameInputBox;

    @FindBy(xpath = "//*[@resource-id='FDSignUp:ZipCodeLabel'] | //*[@name='FDSignUp:ZipCodeLabel']")
    protected static WebElement zipCodeLabel;

    @FindBy(xpath = "//*[@resource-id='FDSignUP:PhoneNumberLabel'] | //*[@name='FDSignUP:PhoneNumberLabel']")
    protected static WebElement phoneNumberLabel;

    @FindBy(xpath = "//*[@resource-id='FDSignUp:ZipCode'] | //*[@name='FDSignUp:ZipCode']")
    protected static WebElement zipCodeInputBox;

    @FindBy(xpath = "//*[@resource-id='FDSignUP:PhoneNumber'] | //*[@name='FDSignUP:PhoneNumber']")
    protected static WebElement phoneNumberInputBox;

    @FindBy(xpath = "//*[@resource-id='FDSignUp:EmailLabel'] | //*[@name='FDSignUp:EmailLabel']")
    protected static WebElement emailLabel;

    @FindBy(xpath = "//*[@resource-id='FDSignUp:Email'] | //*[@name='FDSignUp:Email']")
    protected static WebElement emailInputBox;

    @FindBy(xpath = "//*[@resource-id='FDSignUp:PassLabel'] | //*[@name='FDSignUp:PassLabel']")
    protected static WebElement passwordLabel;

    @FindBy(xpath = "//*[@resource-id='FDSecureTextInput:InputText'] | //*[@name='FDSecureTextInput:InputText']")
    protected static WebElement passwordInputBox;

    @FindBy(xpath = "//*[@resource-id='FDSecureTextInput:Eye'] | //*[@name='FDSecureTextInput:Eye']")
    protected static WebElement passwordEyeButton;

    @FindBy(xpath = "//*[@resource-id= 'StoreListRow:MainView'] | //*[@name='StoreListRow:MainView'] | (//*[@name='StoreListRow:MiddleView'])[1]")
    protected static WebElement storeListViewIcon;

    @FindBy(xpath = "//*[@resource-id='FDSignUp:NewsLetterCheck'] | //*[@name='FDSignUp:NewsLetterCheck']")
    protected static WebElement newsLetterCheckbox;

    @FindBy(xpath = "//*[@resource-id='FDSignUp:PrivacyPolicyCheck'] | //*[@name='FDSignUp:PrivacyPolicyCheck']")
    protected static WebElement privacyPolicyCheckbox;

    @FindBy(xpath = "//*[@resource-id='FDSignUp:DollorEmployeeCheck'] | //*[@name='FDSignUp:DollorEmployeeCheck']")
    protected static WebElement dollarEmployeeCheckbox;

    @FindBy(xpath = "//*[@resource-id='FDSignUp:PassCharacterCheck'] | //*[@name='FDSignUp:PassCharacterCheck']")
    protected static WebElement passCharacterCheck;

    @FindBy(xpath = "//*[@resource-id='FDSignUp:PassAlphabetCheck'] | //*[@name='FDSignUp:PassAlphabetCheck']")
    protected static WebElement passAlphabetCheck;

    @FindBy(xpath = "//*[@resource-id='FDSignUp:PassNumberCheck'] | //*[@name='FDSignUp:PassNumberCheck']")
    protected static WebElement passNumberCheck;

    @FindBy(xpath = "//*[@resource-id='FDSignUp:PassSpecialCharacterCheck'] | //*[@name='FDSignUp:PassSpecialCharacterCheck']")
    protected static WebElement passSpecialCharCheck;

    @FindBy(xpath = "//*[@resource-id='FDSignUp:EmployeeID'] | //*[@name='FDSignUp:EmployeeID']")
    protected static WebElement employeeIDInputBox;

    @FindBy(xpath = "//*[@resource-id='FDSignUp:CreateAccountButton']//android.widget.TextView | //*[@name='FDSignUp:CreateAccountButton']")
    protected static WebElement btnCreateAccount;

    @FindBy(xpath = "//*[@resource-id='Biometric:MainContainer'] | //*[@name='Biometric:MainContainer']")
    protected static WebElement enableBiometricScreen;

    @FindBy(xpath = "//*[@resource-id='StoreDetails:MakeThisMyStoreButton']//android.widget.TextView | //*[@name='StoreDetails:MakeThisMyStoreButton']")
    protected static WebElement makeThisMyStore;

    @FindBy(xpath = "//*[@resource-id='StoreList:MakeMyStoreButton']//android.widget.TextView | //*[@name='StoreList:MakeMyStoreButton']")
    protected static WebElement makeThisMyStoreForGuestUser;

    @FindBy(xpath = "//*[@resource-id='FDError:CTA']//android.widget.TextView | //*[@name='FDError:CTA']")
    protected static WebElement logInLinkBesidesEmailErrorMessage;

    @FindBy(xpath = "//*[@resource-id='FDAlert:CrossBtnClick'] | //*[@name='FDAlert:CrossBtnClick']")
    protected static WebElement btnClose;

    @FindBy(xpath = "//*[@resource-id='Biometric:NotNowLink']//android.widget.TextView | //*[@name='Biometric:NotNowLink']")
    protected static WebElement btnNotNowInBiometric;

    @FindBy(xpath = "//*[@resource-id='WelcomeScreen:StartSavingButton']//android.widget.TextView | //*[@name='WelcomeScreen:StartSavingButton']")
    protected static WebElement btnStartSavingInSignUpCompletePage;

    @FindBy(xpath = "//*[@resource-id='FdAppHeader:Title']//android.widget.TextView | //*[@name='FdAppHeader:Title']")
    protected static WebElement btnSkipInEnableMyLocation;

    @FindBy(xpath = "//*[@resource-id='FDAlert:CancelBtnClick']//android.widget.TextView | //*[@name='FDAlert:CancelBtnClick']")
    protected static WebElement btnSkipInEnableMyLocationPopUp;

    @FindBy(xpath = "//*[@resource-id='Tab:Coupons'] | //XCUIElementTypeOther[@name='Tab:Coupons']")
    protected static WebElement couponsButton;

    @FindBy(xpath = "//*[@resource-id='Tab:Home'] | //*[@name='Tab:Home']")
    protected static WebElement homeButton;

    @FindBy(xpath = "//*[@resource-id='Tab:More'] | //*[@name='Tab:More']")
    protected static WebElement moreButtonOnHomePage;

    @FindBy(xpath = "//*[@resource-id='Tab:AdsAndBooks'] | //*[@name='Tab:AdsAndBooks']")
    protected static WebElement clickAdsAndBooksButton;

    @FindBy(xpath = "//*[@resource-id='EnableNotification:NotNow'] | //*[@name='EnableNotification:NotNow']")
    protected static WebElement btnNotNowInKeepUpToDatePage;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.ImageView")
    protected static WebElement errorPopUp;

    @FindBy(xpath = "//*[@resource-id='StoreFinderMap:MapComponentCurrentLocationButton'] | //*[@name='StoreFinderMap:MapComponentCurrentLocationButton']")
    protected static WebElement locationIcon;

    @FindBy(xpath = "//*[@resource-id='Biometric:TurnOnButton']//android.widget.TextView | //*[@name='Biometric:TurnOnButton']")
    protected static WebElement biometricLoginLink;

    @FindBy(xpath = "//*[@resource-id='FDPhoneVerification:Heading'] | //*[@name='FDPhoneVerification:Heading']")
    protected static WebElement enterYourVerificationCodeText;

    @FindBy(xpath = "//*[@content-desc='Choose a Store'] | //*[@name='FdAppHeader:Title']")
    protected static WebElement chooseAStoreHeader;

    @FindBy(xpath = "//*[@resource-id='FDPhoneVerification:SubHeading'] | //*[@name='FDPhoneVerification:SubHeading']")
    protected static WebElement enterYourVerificationMessageText;

    @FindBy(xpath = "//*[contains(@text,'mile')] | //*[@name ='StoreAddress:Distance']")
    protected static WebElement storeMilesText;

    @FindBy(xpath = "//XCUIElementTypeOther[@name='StoreFinder:SearchBar']//*[@name='List View']")
    protected static WebElement listViewButton;

    @FindBy(xpath = "//*[@text='Password must contain:'] | //*[@name='Password must contain:']")
    protected static WebElement passwordMustContain;

    @FindBy(xpath = "//*[@text='At least 8 characters'] | //*[@name='At least 8 characters']")
    protected static WebElement atLeastCharacter;

    @FindBy(xpath = "//*[@text='One uppercase alphabetic character'] | //*[@name='One uppercase alphabetic character']")
    protected static WebElement alphabeticCharacter;

    @FindBy(xpath = "//*[@text='One number (1, 2, 3, 4 ...)'] | //*[@name='One number (1, 2, 3, 4 ...)']")
    protected static WebElement oneNumber;

    @FindBy(xpath = "//*[@text='One special character (![]`@$%^&*()-_=+;:’,<.>/?)'] | //*[@name='One special character (![]`@$%^&*()-_=+;:’,<.>/?)']")
    protected static WebElement oneSpecialCharacter;

    @FindBy(xpath = "//*[@text='I want to receive news and promotions emails from Family Dollar'] | //*[@name='I want to receive news and promotions emails from Family Dollar']")
    protected static WebElement newsAndPromotionsEmails;

    @FindBy(xpath = "//*[@text='I agree to the following: '] | //*[@name='I agree to the following: ']")
    protected static WebElement iAgreeToTheFollowing;

    @FindBy(xpath = "//*[@resource-id='UserConsentComponent:PrivacyPolicyButton']/android.widget.TextView | //*[@name='UserConsentComponent:PrivacyPolicyButton']")
    protected static WebElement privacyPolicyButton;

    @FindBy(xpath = "//*[@resource-id='UserConsentComponent:TermsAndConditionButton']/android.widget.TextView | //*[@name='UserConsentComponent:TermsAndConditionButton']")
    protected static WebElement termsAndConditionButton;

    @FindBy(xpath = "//*[@resource-id='UserConsentComponent:TermsAndConditionButton']/following-sibling::android.widget.TextView | //*[@name=' and ']")
    protected static WebElement termsAndConditionAnd;

    @FindBy(xpath = "//*[@resource-id='UserConsentComponent:SmartCouponTermsAndConditionButton']/android.widget.TextView | //*[@name='UserConsentComponent:SmartCouponTermsAndConditionButton']")
    protected static WebElement smartCouponTermsAndConditionButton;

    @FindBy(xpath = "//*[@resource-id='FDSignUp:DollorEmployeeCheck']/following-sibling::android.widget.TextView | //*[@name='I am a Family Dollar employee']")
    protected static WebElement familyDollarEmployee;

    @FindBy(xpath = "//*[@resource-id='FDSignUp:EmployeeIDLabel'] | //*[@name='FDSignUp:EmployeeIDLabel']")
    protected static WebElement employeeID;

    @FindBy(xpath = "//*[@resource-id='FDButton:title'] | //*[@name='FDSignUp:CreateAccountButton']")
    protected static WebElement createAccountButton;

    public boolean isBackButtonDisplayed() {
        return driverManagerUtils.isElementDisplayed(btnBack);
    }

    public void clickBackButton() {
        driverManagerUtils.clickElement(btnBack);
    }

    public boolean isFDIconDisplayed() {
        return driverManagerUtils.isElementDisplayed(familyDollarIcon);
    }

    public boolean isElementPresent(String buttonName) {
        return driverManagerUtils.isTextDisplayed(btnWebElements, buttonName);
    }

    public void clickButton(String buttonName) {
        driverManagerUtils.clickByLabel(btnWebElements, buttonName);
    }

    public boolean isBulbIconDisplayed() {
        return driverManagerUtils.isElementDisplayed(bulbIcon);
    }

    public boolean isEnterZipCodeStateTextPresent() {
        return driverManagerUtils.isElementDisplayed(storeSearchBarTextInput);
    }

    public void enterFirstName(String value) {
        if (value.equals("firstName")) {
            driverManagerUtils.enterText(firstNameInputBox, DriverManagerUtils.fakerData(value));
        } else {
            driverManagerUtils.enterText(firstNameInputBox, value);
        }
    }

    public void enterLastName(String value) {
        if (value.equals("lastName")) {
            driverManagerUtils.enterText(lastNameInputBox, DriverManagerUtils.fakerData(value));
        } else {
            driverManagerUtils.enterText(lastNameInputBox, value);
        }
    }

    public void enterZipCode(String value) {
        if (value.equals("zipCode")) {
            driverManagerUtils.enterText(zipCodeInputBox, DriverManagerUtils.randomZipCode());
        } else {
            driverManagerUtils.enterText(zipCodeInputBox, value);
        }
    }

    public void enterPhoneNumber(String value) {
        if (value.equals("phoneNumber")) {
            driverManagerUtils.enterText(phoneNumberInputBox, DriverManagerUtils.randomPhoneNumber());
        } else {
            driverManagerUtils.enterText(phoneNumberInputBox, value);
        }
    }

    public void enterEmail(String value) {
        if (value.equals("email")) {
            driverManagerUtils.enterText(emailInputBox, DriverManagerUtils.randomEmail());
        } else {
            driverManagerUtils.enterText(emailInputBox, value);
        }
    }

    public void enterPassword(String value) {
        driverManagerUtils.enterText(passwordInputBox, value);
        if (configuration.mobilePlatform().equalsIgnoreCase("ios")) {
            driverManagerUtils.clickElement(passwordEyeButton);
        }
    }

    public void enterEmployeeID(String value) {
        driverManagerUtils.enterText(employeeIDInputBox, value);
    }

    public void clickNewsLetterCheckbox() {
        driverManagerUtils.scrollToElement(newsLetterCheckbox);
        driverManagerUtils.clickElement(newsLetterCheckbox);
    }

    public void clickOnMakeThisMyStore() {
        driverManagerUtils.scrollToElement(makeThisMyStore);
        driverManagerUtils.clickElement(makeThisMyStore);
    }

    public void clickOnMakeThisMyStoreGuestUser() {
        driverManagerUtils.scrollToElement(makeThisMyStoreForGuestUser);
        driverManagerUtils.clickElement(makeThisMyStoreForGuestUser);
    }

    public void clickPrivacyPolicyCheckbox() {
        driverManagerUtils.scrollDown();
        driverManagerUtils.clickElement(privacyPolicyCheckbox);
    }

    public void clickDollarEmployeeCheckbox() {
        driverManagerUtils.clickElement(dollarEmployeeCheckbox);
    }

    public boolean isEnableBiometricScreenDisplayed() {
        return driverManagerUtils.isElementDisplayed(enableBiometricScreen);
    }

    public boolean isFirstNameInputBoxDisplayed() {
        return driverManagerUtils.isElementDisplayed(firstNameInputBox);
    }

    public boolean isLastNameInputBoxDisplayed() {
        return driverManagerUtils.isElementDisplayed(lastNameInputBox);
    }

    public boolean isZipCodeInputBoxDisplayed() {
        return driverManagerUtils.isElementDisplayed(zipCodeInputBox);
    }

    public boolean isPhoneNumberInputBoxDisplayed() {
        return driverManagerUtils.isElementDisplayed(phoneNumberInputBox);
    }

    public boolean isEmailInputBoxDisplayed() {
        return driverManagerUtils.isElementDisplayed(emailInputBox);
    }

    public boolean isPasswordInputBoxDisplayed() {
        return driverManagerUtils.isElementDisplayed(passwordInputBox);
    }

    public boolean isPasswordEyeButtonDisplayed() {
        driverManagerUtils.scrollDown();
        return driverManagerUtils.isElementDisplayed(passwordEyeButton);
    }

    public boolean isPassCharacterCheckDisplayed() {
        return driverManagerUtils.isElementDisplayed(passCharacterCheck);
    }

    public boolean isPassAlphabetCheckDisplayed() {
        return driverManagerUtils.isElementDisplayed(passAlphabetCheck);
    }

    public boolean isPassNumberCheckDisplayed() {
        return driverManagerUtils.isElementDisplayed(passNumberCheck);
    }

    public boolean isPassSpecialCharCheckDisplayed() {
        return driverManagerUtils.isElementDisplayed(passSpecialCharCheck);
    }

    public boolean isNewsLetterCheckboxDisplayed() {
        return driverManagerUtils.isElementDisplayed(newsLetterCheckbox);
    }

    public boolean isPrivacyPolicyCheckboxDisplayed() {
        return driverManagerUtils.isElementDisplayed(privacyPolicyCheckbox);
    }

    public boolean isDollarEmployeeCheckboxDisplayed() {
        return driverManagerUtils.isElementDisplayed(dollarEmployeeCheckbox);
    }

    public boolean isEmployeeIDCheckboxDisplayed() {
        return driverManagerUtils.isElementDisplayed(employeeIDInputBox);
    }

    public String getEnteredInputPasswordText() {
        return driverManagerUtils.getElementText(passwordInputBox);
    }

    public void clickEyeButtonInsidePasswordTextBox() {
        driverManagerUtils.clickElement(passwordEyeButton);
    }

    public String getLogInLinkTextBesidesEmailErrorMessage() {
        return driverManagerUtils.getElementText(logInLinkBesidesEmailErrorMessage).trim();
    }

    public void clickLogInLinkBesidesEmailErrorMessage() {
        driverManagerUtils.clickElement(logInLinkBesidesEmailErrorMessage);
    }

    public void clickClose() {
        driverManagerUtils.clickElement(btnClose);
    }

    public void clickErrorPopUp() {
        driverManagerUtils.clickElement(errorPopUp);
    }

    public void enterZipCodeOnChooseAStore(String value) {
        if (DriverManagerUtils.configuration.mobilePlatform().equalsIgnoreCase("android")) {
            driverManagerUtils.enterText(storeSearchBarTextInput, value);
            ((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.ENTER));
        } else {
            driverManagerUtils.enterText(storeSearchBarTextInput, value + "\n");
        }
    }

    public void clickStoreView() {
        driverManagerUtils.clickElement(storeListViewIcon);
    }

    public boolean isLocationIconDisplayed() {
        return driverManagerUtils.isElementDisplayed(locationIcon);
    }

    public void clickNotNowButtonInBiometricPage() {
        driverManagerUtils.clickElement(btnNotNowInBiometric);
    }

    public String getNotNowTextInBiometricPage() {
        return driverManagerUtils.getElementText(btnNotNowInBiometric);
    }

    public void clickStartSavingButtonSignUpCompletePage() {
        driverManagerUtils.clickElement(btnStartSavingInSignUpCompletePage);
    }

    public String getStartSavingTextInSignUpCompletePage() {
        return driverManagerUtils.getElementText(btnStartSavingInSignUpCompletePage);
    }

    public void clickSkipButtonInEnableMyLocation() {
        driverManagerUtils.clickElement(btnSkipInEnableMyLocation);
    }

    public String getSkipTextOnEnableMyLocationPage() {
        return driverManagerUtils.getElementText(btnSkipInEnableMyLocation);
    }

    public void clickSkipButtonInEnableMyLocationPopUpPage() {
        driverManagerUtils.clickElement(btnSkipInEnableMyLocationPopUp);
    }

    public String getSkipLinkTextOnEnableMyLocationPopUpPage() {
        return driverManagerUtils.getElementText(btnSkipInEnableMyLocationPopUp);
    }

    public void clickCouponButton() {
        driverManagerUtils.clickElement(couponsButton);
    }

    public void clickHomeButton() {
        driverManagerUtils.clickElement(homeButton);
    }

    public void clickMoreButton() {
        driverManagerUtils.clickElement(moreButtonOnHomePage);
    }

    public void clickAdsAndBooksButton() {
        driverManagerUtils.clickElement(clickAdsAndBooksButton);
    }

    public void clickNotNowButtonInKeepUpToDatePage() {
        driverManagerUtils.clickElement(btnNotNowInKeepUpToDatePage);
    }

    public boolean isBiometricLoginLinkDisplayed() {
        return driverManagerUtils.isElementDisplayed(biometricLoginLink);
    }

    public void clickCreateAccountButtonInSignUpPage() {
        driverManagerUtils.scrollDown();
        driverManagerUtils.clickElement(btnCreateAccount);
    }

    public List<String> getAllLabelText() {
        List<String> list = new ArrayList<>();
        for (WebElement element : btnWebElements) {
            list.add(driverManagerUtils.getElementText(element));
        }
        return list;
    }

    public void clickLoginButton() {
        driverManagerUtils.clickElement(btnLogin);
    }

    public String getSignUpHeaderText() {
        return driverManagerUtils.getElementText(signUpHeader);
    }

    public String getSignUpHeaderSubText() {
        return driverManagerUtils.getElementText(headerSubText);
    }

    public String getLogInText() {
        return driverManagerUtils.getElementText(btnLogin).trim();
    }

    public String getSignUpErrorTipText() {
        return driverManagerUtils.getElementText(signUpTip);
    }

    public String getSignUpTipDescriptionText() {
        return driverManagerUtils.getElementText(tipDescription);
    }

    public String getFirstNameLabelText() {
        return driverManagerUtils.getElementText(firstNameLabel);
    }

    public String getLastNameLabelText() {
        return driverManagerUtils.getElementText(lastNameLabel);
    }

    public String getZipCodeLabelText() {
        return driverManagerUtils.getElementText(zipCodeLabel);
    }

    public String getPhoneNumberLabelText() {
        return driverManagerUtils.getElementText(phoneNumberLabel);
    }

    public String getEmailLabelText() {
        return driverManagerUtils.getElementText(emailLabel);
    }

    public String getPasswordLabelText() {
        return driverManagerUtils.getElementText(passwordLabel);
    }

    public String getInputPasswordText() {
        return driverManagerUtils.getElementText(passwordInputBox);
    }

    public String getEnterYourVerificationCodeText() {
        return driverManagerUtils.getElementText(enterYourVerificationCodeText);
    }

    public String getChooseAStoreHeaderText() {
        return driverManagerUtils.getElementText(chooseAStoreHeader);
    }

    public boolean isSearchIconDisplayed() {
        return driverManagerUtils.isElementDisplayed(storeSearchIcon);
    }

    public String getDefaultStoreSearchText() {
        return driverManagerUtils.getElementText(storeSearchBarTextInput);
    }

    public boolean isGoogleMapDisplayed() {
        return driverManagerUtils.isElementDisplayed(googleMap);
    }

    public boolean isStoreListDisplayed() {
        return driverManagerUtils.isElementDisplayed(storeList);
    }

    public void selectStoreFromChooseAStorePage() {
        if (DriverManagerUtils.configuration.mobilePlatform().equalsIgnoreCase("android")) {
            driverManagerUtils.clickElement(selectStoreAndroid);
        } else {
            driverManagerUtils.clickElement(selectStoreIOS);
        }
    }

    public String getMakeThisMyStoreText() {
        return driverManagerUtils.getElementText(makeThisMyStoreForGuestUser);
    }

    public boolean verificationMessageNotContains(String verificationMessage) {
        return !driverManagerUtils.getElementText(enterYourVerificationMessageText).contains(verificationMessage);
    }

    public boolean isStoreMilesPresentOnStoreDetails() {
        return  driverManagerUtils.isElementDisplayed(storeMilesText);
    }

    public void listViewClick(String buttonName) {
        if (DriverManagerUtils.configuration.mobilePlatform().equalsIgnoreCase("android")) {
            driverManagerUtils.clickByLabel(btnWebElements, buttonName);
        }else {
            driverManagerUtils.clickElement(listViewButton);
        }
    }

    public String getPasswordMustContainText() {
        return driverManagerUtils.getElementText(passwordMustContain);
    }

    public String getAtLeastCharactersText() {
        return driverManagerUtils.getElementText(atLeastCharacter);
    }

    public String getOneUppercaseAlphabeticCharacterText() {
        return driverManagerUtils.getElementText(alphabeticCharacter);
    }

    public String getOneNumberText() {
        return driverManagerUtils.getElementText(oneNumber);
    }

    public String getOneSpecialCharacterText() {
        return driverManagerUtils.getElementText(oneSpecialCharacter);
    }

    public String getNewsAndPromotionsEmailsText() {
        return driverManagerUtils.getElementText(newsAndPromotionsEmails);
    }

    public String getIAgreeToTheFollowingText() {
        return driverManagerUtils.getElementText(iAgreeToTheFollowing);
    }

    public String getPrivacyPolicyButtonText() {
        return driverManagerUtils.getElementText(privacyPolicyButton);
    }

    public String getTermsAndConditionButtonText() {
        return driverManagerUtils.getElementText(termsAndConditionButton);
    }

    public String getTermsAndConditionAndText() {
        return driverManagerUtils.getElementText(termsAndConditionAnd);
    }

    public String getSmartCouponTermsAndConditionButtonText() {
        return driverManagerUtils.getElementText(smartCouponTermsAndConditionButton);
    }

    public String getFamilyDollarEmployeeText() {
        return driverManagerUtils.getElementText(familyDollarEmployee);
    }

    public String getEmployeeIDText() {
        return driverManagerUtils.getElementText(employeeID);
    }

    public String getCreateAccountText() {
        return driverManagerUtils.getElementText(createAccountButton);
    }
}
