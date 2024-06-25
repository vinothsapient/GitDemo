package com.testx.web.api.selenium.restassured.qe.ui.pageobjects;

import com.testx.web.api.selenium.restassured.qe.ui.context.TestContext;
import com.testx.web.api.selenium.restassured.qe.ui.stepdefinitions.BaseSetup;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ContinueAsGuestPage extends BaseSetup {

    public ContinueAsGuestPage(TestContext testContext) {
        super(testContext);
        PageFactory.initElements(testContext.getDriverManager().getDriver(), this);
    }
    
    @FindBy(xpath = "//*[contains(@class,'widget.TextView')] | //XCUIElementTypeOther[contains(@name,'')] | //XCUIElementTypeStaticText[contains(@name,'')]")
    protected static List<WebElement> btnWebElements;

    @FindBy(xpath = "//*[@resource-id='FDAlert:Header']/android.widget.TextView | //*[@name='FDAlert:Header']/XCUIElementTypeStaticText")
    protected static WebElement headerText;

    @FindBy(xpath = "//*[@resource-id='FDAlert:Subtitle'] | //XCUIElementTypeStaticText[@name='FDAlert:Subtitle']")
    protected static WebElement subTitleText;

    @FindBy(xpath = "//*[@resource-id='FDAlert:CrossBtnClick'] | //XCUIElementTypeOther[@name='FDAlert:CrossBtnClick']")
    protected static WebElement btnClose;

    @FindBy(xpath = "//*[@resource-id='FDAlert:CancelBtnClick']//android.widget.TextView | //*[@name='FDAlert:CancelBtnClick']")
    protected static WebElement continueAsGuestLink;

    @FindBy(xpath = "//*[@resource-id='EnableMyLocation:HandleEnterZipCode'] | //*[@name='EnableMyLocation:HandleEnterZipCode']")
    protected static WebElement enterMyZipcode;

    @FindBy(xpath = "//*[@resource-id='StoreEnableLocationView:EnableLocationButton'] | //*[@name='StoreEnableLocationView:EnableLocationButton']")
    protected static WebElement enterEnableLocationbtn;

    @FindBy(xpath = "//*[@resource-id='FDALert:PrimaryButton']//android.widget.TextView | //XCUIElementTypeOther[@name='FDALert:PrimaryButton']")
    protected static WebElement signUpNowLink;

    @FindBy(xpath = "//*[@resource-id='Location:Image'] | //*[@name='Location:Image']")
    protected static WebElement locationImage;

    @FindBy(xpath = "//*[@resource-id='EnableMyLocation:Title'] | //*[@name='EnableMyLocation:Title']")
    protected static WebElement titleEnableMyLocation;

    @FindBy(xpath = "//*[@resource-id='EnableMyLocation:LocationInstruction1'] | //*[@name='EnableMyLocation:LocationInstruction1']")
    protected static WebElement titleInstruction1;

    @FindBy(xpath = "//*[@resource-id='EnableMyLocation:LocationInstruction2'] | //*[@name='EnableMyLocation:LocationInstruction2']")
    protected static WebElement titleInstruction2;

    @FindBy(xpath = "//*[@resource-id='EnableMyLocation:LocationInstruction3'] | //*[@name='EnableMyLocation:LocationInstruction3']")
    protected static WebElement titleInstruction3;

    @FindBy(xpath = "//*[@resource-id='EnableMyLocation:HandleShareMyLocation']//android.widget.TextView | //*[@name='EnableMyLocation:HandleShareMyLocation']")
    protected static WebElement shareMyLocation;

    @FindBy(xpath = "//*[@resource-id='EnableMyLocation:HandleEnterZipCode']//android.widget.TextView | //*[@name='EnableMyLocation:HandleEnterZipCode']")
    protected static WebElement enterMyZipCode;

    @FindBy(xpath = "//*[@resource-id='EnableNotification:EmailIcon'] | //*[@name='EnableNotification:EmailIcon']")
    protected static WebElement emailImage;

    @FindBy(xpath = "//*[@resource-id='EnableNotification:Title'] | //*[@name='EnableNotification:Title']")
    protected static WebElement enableNotificationTitle;

    @FindBy(xpath = "//*[@resource-id='EnableNotification:Body'] | //*[@name='EnableNotification:Body']")
    protected static WebElement enableNotificationBody;

    @FindBy(xpath = "//*[@resource-id='EnableNotification:Body']//following-sibling::android.widget.TextView | //*[@name='Notifications can be turned off through the Settings app on your phone.']")
    protected static WebElement enableNotificationBody2;

    @FindBy(xpath = "//*[@resource-id='EnableNotification:HandleEnableNotification']//android.widget.TextView | //*[@name='EnableNotification:HandleEnableNotification']")
    protected static WebElement btnEnableNotification;

    @FindBy(xpath = "//*[@resource-id='EnableNotification:NotNow']//android.widget.TextView | //*[@name='EnableNotification:NotNow']")
    protected static WebElement btnNotNow;

    public boolean isElementPresent(String buttonName) {
        return driverManagerUtils.isTextDisplayed(btnWebElements, buttonName);
    }

    public String getHeaderAlertText(){
        return driverManagerUtils.getElementText(headerText);
    }

    public String getSubTitleText(){
        return driverManagerUtils.getElementText(subTitleText);
    }

    public void clickClose(){
        driverManagerUtils.clickElement(btnClose);
    }

    public String getContinueAsGuestLinkText(){
        return driverManagerUtils.getElementText(continueAsGuestLink);
    }

    public void clickContinueAsGuestLink(){
        driverManagerUtils.clickElement(continueAsGuestLink);
    }
    public void clickEnterMyZipCode(){
        driverManagerUtils.clickElement(enterMyZipcode);
    }

    public void clickEnableLocationBtn(){
        driverManagerUtils.clickElement(enterEnableLocationbtn);
    }

    public String getSignUpNowLinkText(){
        return driverManagerUtils.getElementText(signUpNowLink);
    }

    public void clickSignUpNowLinkLink(){
        driverManagerUtils.clickElement(signUpNowLink);
    }

    public boolean isLocationImageDisplayed() {
        return driverManagerUtils.isElementDisplayed(locationImage);
    }

    public String getEnableMyLocationTitleText() {
        return driverManagerUtils.getElementText(titleEnableMyLocation);
    }

    public String getEnableMyLocationInstruction1Text() {
        return driverManagerUtils.getElementText(titleInstruction1);
    }

    public String getEnableMyLocationInstruction2Text() {
        return driverManagerUtils.getElementText(titleInstruction2);
    }

    public String getEnableMyLocationInstruction3Text() {
        return driverManagerUtils.getElementText(titleInstruction3);
    }

    public String getShareMyLocationText() {
        return driverManagerUtils.getElementText(shareMyLocation);
    }

    public String getEnterMyZipCodeText() {
        return driverManagerUtils.getElementText(enterMyZipCode);
    }

    public boolean isCloseButtonDisplayed(){
        return driverManagerUtils.isElementDisplayed(btnClose);
    }

    public boolean isEmailImageDisplayed() {
        return driverManagerUtils.isElementDisplayed(emailImage);
    }

    public String getEnableNotificationTitleText() {
        return driverManagerUtils.getElementText(enableNotificationTitle);
    }

    public String getEnableNotificationBodyText() {
        return driverManagerUtils.getElementText(enableNotificationBody);
    }

    public String getEnableNotificationBodyText2() {
        return driverManagerUtils.getElementText(enableNotificationBody2);
    }

    public String getEnableNotificationsText() {
        return driverManagerUtils.getElementText(btnEnableNotification);
    }

    public String getNotNowText() {
        return driverManagerUtils.getElementText(btnNotNow);
    }
}
