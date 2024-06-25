package com.testx.web.api.selenium.restassured.qe.ui.pageobjects;

import com.testx.web.api.selenium.restassured.qe.ui.context.TestContext;
import com.testx.web.api.selenium.restassured.qe.ui.stepdefinitions.BaseSetup;
import com.testx.web.api.selenium.restassured.qe.ui.webdriver.DriverManagerUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static com.testx.web.api.selenium.restassured.qe.ui.pageobjects.AccountPage.namebtn;

public class ProfilePage extends BaseSetup {

    public ProfilePage(TestContext testContext) {
        super(testContext);
        PageFactory.initElements(testContext.getDriverManager().getDriver(), this);
    }

    @FindBy(xpath = "//*[contains(@class,'widget.TextView')] | //*[contains(@class,'widget.EditText')] | //*[contains(@name,'')]")
    protected static List<WebElement> btnWebElements;

    @FindBy(xpath = "//*[@resource-id='FdProfileHeader:LeftIcon'] | //*[@name='FdProfileHeader:LeftIcon']")
    protected static WebElement profileBackButton;

    @FindBy(xpath = "//*[@content-desc='Close Button'] | //*[@name='Close Button']")
    protected static WebElement profileUpdateCloseButton;

    @FindBy(xpath = "//*[@resource-id='ProfileUpdateComponent:saveButton']//android.widget.TextView | //*[@name='ProfileUpdateComponent:saveButton']")
    protected static WebElement profileUpdateSaveButton;

    @FindBy(xpath = "//*[@resource-id='ProfileUpdateComponent:firstName']//android.widget.EditText | //*[@name='ProfileUpdateComponent:firstName']")
    protected static WebElement updateFirstNameInputBox;

    @FindBy(xpath = "//*[@resource-id='ProfileUpdateComponent:lastName']//android.widget.EditText | //*[@name='ProfileUpdateComponent:lastName']")
    protected static WebElement updateLastNameInputBox;

    @FindBy(xpath = "//*[@resource-id='FieldComponent:textField'] | //*[@name='FieldComponent:textField']")
    protected static WebElement updateDOBInputBox;

    @FindBy(xpath = "//*[@content-desc='Phone Number']/following-sibling::android.view.ViewGroup/android.widget.EditText | //*[@name='Phone Number']")
    protected static WebElement updatePhoneNumberInputBox;

    @FindBy(xpath = "//*[@resource-id='FDSecureTextInput:InputText'] | //*[@name='FDSecureTextInput:InputText']")
    protected static WebElement passwordInputBox;

    @FindBy(xpath = "//*[@resource-id='FieldComponent:input'] | //*[@name='FieldComponent:input']")
    protected static WebElement updateInputBox;

    @FindBy(xpath = "//*[@resource-id='ProfileView :BodyText' and (@text='Are you a Family Dollar Employee?')] | //XCUIElementTypeOther[@name='Are you a Family Dollar Employee?']")
    protected static WebElement fdEmployeeSection;
    
    @FindBy(xpath = "//*[@resource-id='android:id/button1'] | //*[@name='android:id/button1']")
    protected static WebElement btnProfilePopUpOK;

    @FindBy(xpath = "//*[@resource-id='ProfileView :ButtonText'] | //*[@name='ProfileView :ButtonText']")
    protected static WebElement btnAddAssociatedId;

    @FindBy(xpath = "//*[@text='Profile'] | //*[@name='Profile']")
    protected static WebElement headerProfile;

    @FindBy(xpath = "(//*[@resource-id='UpdatePhoneNumber:Component']/android.view.ViewGroup)[4] | //*[@name='UpdatePhoneNumber:Component']")
    protected static WebElement btnProfileNext;

    @FindBy(xpath = "//*[@resource-id='FDCategoryHeader:Title'] | //*[@name='FDCategoryHeader:Title']")
    protected static WebElement deleteAccountHeader;

    @FindBy(xpath = "//*[@resource-id='deleteAccount:title'] | //*[@name='deleteAccount:title']")
    protected static WebElement deleteAccountTitle;

    @FindBy(xpath = "//*[@resource-id='deleteAccount:Description1'] | //*[@name='deleteAccount:Description1']")
    protected static WebElement deleteAccountDescription1;

    @FindBy(xpath = "//*[@resource-id='deleteAccount:Description2'] | //*[@name='deleteAccount:Description2']")
    protected static WebElement deleteAccountDescription2;

    @FindBy(xpath = "//*[@resource-id='deleteAccount:PrimaryButton']//android.widget.TextView | //*[@name='deleteAccount:PrimaryButton']")
    protected static WebElement btnDeleteMyAccount;

    @FindBy(xpath = "//*[@resource-id='deleteAccount:SecondaryButton']//android.widget.TextView | //*[@name='deleteAccount:SecondaryButton']")
    protected static WebElement btnKeepMyAccount;

    @FindBy(xpath = "//*[@resource-id='android:id/alertTitle'] | //*[@name='Are you sure you want to delete your Family Dollar account?']")
    protected static WebElement deleteAccountConfirmationPopup;

    @FindBy(xpath = "//*[@resource-id='android:id/button2'] | //*[@name='Cancel']")
    protected static WebElement btnConfirmationPopupCancel;

    @FindBy(xpath = "//*[@resource-id='android:id/button1'] | //*[@name='Continue']")
    protected static WebElement btnConfirmationPopupContinue;

    public boolean isProfileBackButtonPresent() {
        return driverManagerUtils.isElementDisplayed(profileBackButton);
    }

    public void clickOnProfileBackButton() {
        driverManagerUtils.scrollToElement(profileBackButton);
        driverManagerUtils.clickElement(profileBackButton);
    }

    public boolean isProfilePopupCloseButtonDisplayed() {
        return driverManagerUtils.isElementDisplayed(profileUpdateCloseButton);
    }

    public boolean isProfilePopupSaveButtonDisplayed() {
        return driverManagerUtils.isElementDisplayed(profileUpdateSaveButton);
    }

    public boolean isNameButtonDisplayed() {
        return driverManagerUtils.isElementDisplayed(namebtn);
    }

    public void updateFirstName(String value) {
        if (value.equals("firstName")) {
            driverManagerUtils.enterText(updateFirstNameInputBox, DriverManagerUtils.fakerData(value));
        } else {
            driverManagerUtils.enterText(updateFirstNameInputBox, value);
        }
    }

    public void updateLastName(String value) {
        if (value.equals("lastName")) {
            driverManagerUtils.enterText(updateLastNameInputBox, DriverManagerUtils.fakerData(value));
        } else {
            driverManagerUtils.enterText(updateLastNameInputBox, value);
        }
    }

    public void updateDOB(String value) {
        if (value.equals("dob")) {
            driverManagerUtils.enterText(updateDOBInputBox, DriverManagerUtils.fakerData(value));
        } else {
            driverManagerUtils.enterText(updateDOBInputBox, value);
        }
    }

    public void updateZipCode(String value) {
        if (value.equals("zipCode")) {
            driverManagerUtils.enterText(updateInputBox, DriverManagerUtils.randomZipCode());
        } else {
            driverManagerUtils.enterText(updateInputBox, value);
        }
    }

    public void updateEmail(String value) {
        if (value.equals("email")) {
            driverManagerUtils.enterText(updateInputBox, DriverManagerUtils.randomEmail());
        } else {
            driverManagerUtils.enterText(updateInputBox, value);
        }
    }

    public void updatePhoneNumber(String value) {
        if (value.equals("phoneNumber")) {
            driverManagerUtils.enterText(updatePhoneNumberInputBox, DriverManagerUtils.randomPhoneNumber());
        } else {
            driverManagerUtils.enterText(updatePhoneNumberInputBox, value);
        }
    }

    public void updateAssociateID(String value) {
        if (value.equals("associateID")) {
            driverManagerUtils.enterText(updateInputBox, DriverManagerUtils.randomAssociateID());
        } else {
            driverManagerUtils.enterText(updateInputBox, value);
        }
    }

    public void clickSaveButton() {
        driverManagerUtils.clickElement(profileUpdateSaveButton);
    }

    public void clickCloseButton() {
        driverManagerUtils.clickElement(profileUpdateCloseButton);
    }

    public void scrollToFDEmployeeSection() {
        driverManagerUtils.scrollToElement(fdEmployeeSection);
    }

    public String getFirstNameText() {
        return driverManagerUtils.getElementText(updateFirstNameInputBox);
    }

    public String getLastNameText() {
        return driverManagerUtils.getElementText(updateLastNameInputBox);
    }

    public String getInputText() {
        return driverManagerUtils.getElementText(updateInputBox);
    }

    public String getPasswordText() {
        return driverManagerUtils.getElementText(passwordInputBox);
    }

    public void clickOnProfilePopUpOKButton() {
        if (driverManagerUtils.isElementDisplayed(btnProfilePopUpOK)) {
            driverManagerUtils.clickElement(btnProfilePopUpOK);
        }
    }

    public void clickOnAddAssociatedIdButton() {
        driverManagerUtils.clickElement(btnAddAssociatedId);
    }

    public String getProfileText() {
        return driverManagerUtils.getElementText(headerProfile);
    }

    public boolean isElementPresent(String buttonName) {
        return driverManagerUtils.isTextDisplayed(btnWebElements, buttonName);
    }

    public boolean isNextButtonEnabled(){
        return driverManagerUtils.isElementEnabled(btnProfileNext);
    }

    public String getDeleteAccountPageHeader() {
        return driverManagerUtils.getElementText(deleteAccountHeader);
    }

    public String getDeleteAccountPageTitle() {
        return driverManagerUtils.getElementText(deleteAccountTitle);
    }

    public String getDeleteAccountPageDescription1() {
        return driverManagerUtils.getElementText(deleteAccountDescription1);
    }

    public String getDeleteAccountPageDescription2() {
        return driverManagerUtils.getElementText(deleteAccountDescription2);
    }

    public void clickBackButtonOnDeleteAccountPage() {
        driverManagerUtils.clickElement(profileBackButton);
    }

    public String getDeleteMyAccountText() {
        return driverManagerUtils.getElementText(btnDeleteMyAccount);
    }

    public String getKeepMyAccountText() {
        return driverManagerUtils.getElementText(btnKeepMyAccount);
    }

    public void clickDeleteMyAccountButton() {
        driverManagerUtils.clickElement(btnDeleteMyAccount);
    }

    public void clickKeepMyAccountButton() {
        driverManagerUtils.clickElement(btnKeepMyAccount);
    }

    public String getDeleteAccountConfirmationPopupMessage() {
        return driverManagerUtils.getElementText(deleteAccountConfirmationPopup);
    }

    public String getDeleteAccountConfirmationPopupCancelText() {
        return driverManagerUtils.getElementText(btnConfirmationPopupCancel);
    }

    public String getDeleteAccountConfirmationPopupContinueText() {
        return driverManagerUtils.getElementText(btnConfirmationPopupContinue);
    }

    public void clickDeleteAccountConfirmationPopupCancelButton() {
        driverManagerUtils.clickElement(btnConfirmationPopupCancel);
    }
}
