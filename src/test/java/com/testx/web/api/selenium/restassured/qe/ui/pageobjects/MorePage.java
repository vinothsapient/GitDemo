package com.testx.web.api.selenium.restassured.qe.ui.pageobjects;

import com.testx.web.api.selenium.restassured.qe.ui.context.TestContext;
import com.testx.web.api.selenium.restassured.qe.ui.stepdefinitions.BaseSetup;
import com.testx.web.api.selenium.restassured.qe.ui.webdriver.DriverManagerUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class MorePage extends BaseSetup {

    public MorePage(TestContext testContext) {
        super(testContext);
        PageFactory.initElements(testContext.getDriverManager().getDriver(), this);
    }

    @FindBy(xpath = "//*[contains(@class,'widget.TextView')] | //XCUIElementTypeOther[contains(@name,'')]")
    protected static List<WebElement> btnWebElements;

    @FindBy(xpath = "//android.widget.EditText[@content-desc='Search Field'] | //XCUIElementTypeTextField[@name='PlpSearchHeader:searchInput']")
    protected static WebElement searchInput;

    @FindBy(xpath = "//android.widget.EditText[@content-desc='cancel'] | //XCUIElementTypeOther[@name='PlpSearchHeader:cancel']")
    protected static WebElement cancelButton;

    @FindBy(xpath = "//android.widget.TextView[@content-desc=' Products'] | //XCUIElementTypeStaticText[@name='FilterAndSorting:ProductCount']")
    protected static WebElement productCount;

    @FindBy(xpath = "//android.widget.Button[@content-desc=' Filters']/android.view.ViewGroup | //XCUIElementTypeButton[@name=' Filters']")
    protected static WebElement filterButton;

    @FindBy(xpath = "//android.widget.Button[@resource-id='FilterAndSorting:SortButton'] | //XCUIElementTypeButton[@name='FilterAndSorting:SortButton']")
    protected static WebElement sortButton;

    @FindBy(xpath = "//android.view.ViewGroup[@resource-id='FDPlpSearchHeader:searchBar']/com.horcrux.svg.SvgView | //XCUIElementTypeOther[@name='FDPlpSearchHeader:searchIcon']/XCUIElementTypeImage")
    protected static WebElement searchIcon;

    @FindBy(xpath = "//android.view.ViewGroup[@content-desc='Scan Button'] | //XCUIElementTypeOther[@name='FDPlpSearchHeader:scan']")
    protected static WebElement ScanIcon;

    @FindBy(xpath = "//android.view.ViewGroup[@content-desc='Clear Search']/android.widget.ImageView")
    protected static WebElement cancelIcon;

    @FindBy(xpath = "//android.view.ViewGroup//android.widget.TextView[@text='Trending Search']")
    protected static WebElement trendingSearch;

    @FindBy(xpath = " //android.widget.TextView[@content-desc='Previously Searched']")
    protected static WebElement previousSearch;

    @FindBy(xpath = "//android.widget.TextView[@content-desc='Clear']")
    protected static WebElement clearLink;

    @FindBy(xpath = "//android.widget.TextView[contains(@content-desc,'Showing 30 of')]")
    protected static WebElement defaultCount;

    @FindBy(xpath = "//android.widget.Switch[@content-desc='Smart Coupon Available'] | //XCUIElementTypeOther[@name='Smart Coupon Available Smart Coupon Available']")
    protected static WebElement smartCoupon;

    @FindBy(xpath = "//android.widget.Button[@content-desc='Load More']")
    protected static WebElement loadMoreButton;

    @FindBy(xpath = "//android.widget.ScrollView//android.widget.ImageView/following-sibling::android.widget.TextView")
    protected static List<WebElement> trendingSearches;

    @FindBy(xpath = "//android.widget.Button[contains(@resource-id,'ProductTile')]/android.view.ViewGroup[2]/android.view.ViewGroup[3]/android.widget.TextView | //XCUIElementTypeOther[@name='PlpSearchHeader:cancel']")
    protected static List<WebElement> getProductList;

    @FindBy(xpath = "//android.widget.TextView[@resource-id='List:Title']")
    protected static List<WebElement> searchFields;

    @FindBy(xpath = "//*[@resource-id='FDPlpSearchHeader:scan'] | //*[@name='FDPlpSearchHeader:scan']")
    protected static WebElement scannerIcon;

    @FindBy(xpath = "//*[@resource-id='PlpIdleSearch:productCategories']//android.widget.TextView | //*[@name='PlpIdleSearch:productCategories']")
    protected static WebElement exploreProductCategoriesTab;

    @FindBy(xpath = "//*[@resource-id='PlpIdleSearch:couponCategories']//android.widget.TextView | //*[@name='PlpIdleSearch:couponCategories']")
    protected static WebElement exploreCouponCategoriesTab;

    @FindBy(xpath = "//*[@resource-id='PlpIdleSearch:myStoreDetails']//android.widget.TextView | //*[@name='PlpIdleSearch:myStoreDetails']")
    protected static WebElement viewMyStoreDetails;

    @FindBy(xpath = "//*[@resource-id='PlpIdleSearch:redeemCoupons']//android.widget.TextView | //*[@name='PlpIdleSearch:redeemCoupons']")
    protected static WebElement redeemClippedCoupons;

    @FindBy(xpath = "//*[@resource-id='MoreTopTabsMessagesText:TestID'] | //*[@name='MoreTopTabsMessagesText:TestID']")
    protected  static WebElement messageTab;

    @FindBy(xpath = "//*[@resource-id='NotificationsInbox:TurnOnNotificationsHeading'] | //*[@name='NotificationsInbox:TurnOnNotificationsHeading']")
    protected static WebElement messagePage;

    @FindBy(xpath = "//*[@resource-id='FDPlpSearchHeader:backIcon'] | //*[@name='FDPlpSearchHeader:backIcon']")
    protected static WebElement messageBackButton;

    @FindBy(xpath = "//*[@resource-id='MoreTopTabsOrderText:TestID'] | //*[@name='MoreTopTabsOrderText:TestID']")
    protected  static WebElement yourOrders;

    @FindBy(xpath = "//*[@resource-id='MoreTopTabsStoreText:TestID'] | //*[@name='MoreTopTabsStoreText:TestID']")
    protected static WebElement yourStore;

    @FindBy(xpath = "//*[@resource-id='RecentOrderCarouselHeadingText:testId'] | //*[@name='RecentOrderCarouselHeadingText:testId']")
    protected static WebElement recentOrders;

    @FindBy(xpath = "//*[@content-desc='View All'] | //XCUIElementTypeStaticText[@name='RecentOrderCarouselHeadingLink:testId']")
    protected static WebElement viewAll;

    @FindBy(xpath = "//*[@content-desc='Ordr Tile'] | //*[@name='Ordr Tile']")
    protected static List<WebElement> orderTile;

    @FindBy(xpath = "//*[@content-desc='Support'] | //*[@name='Support:SectionList:HeaderTitle'] | //*[@name='Support']")
    protected static WebElement supportTitle;

    @FindBy(xpath = "//*[@resource-id='Support and Settings:SectionList:HeaderTitle'] | //*[@name='Support and Settings:SectionList:HeaderTitle']")
    protected static WebElement supportAndSettings;

    @FindBy(xpath = "//*[@content-desc='Contact Us'] | //*[@name='Contact Us']")
    protected static WebElement contactUsLink;

    @FindBy(xpath = "//*[@resource-id='com.android.chrome:id/positive_button'] | //*[@name='Allow Once']")
    protected static WebElement allowDeviceLocation;

    @FindBy(xpath = "//*[@text='Contact Us'] | //*[@name='Contact Us']")
    protected static WebElement contactUsWebHeader;

    @FindBy(xpath = "//*[@content-desc='FAQs'] | //*[@name='Support:FAQs']")
    protected static WebElement linkFAQs;

    @FindBy(xpath = "//*[@content-desc='Visit Site'] | //*[@name='Visit Site'] | //XCUIElementTypeLink[@label='Visit Site']")
    protected static WebElement visitSiteLink;

    @FindBy(xpath = "//*[@content-desc='Facebook'] | //*[@name='SocialCTA:Facebook']")
    protected static WebElement facebookLink;

    @FindBy(xpath = "//*[@content-desc='facebook']//android.widget.TextView | //*[@name='facebook']")
    protected static WebElement facebookHeader;

    @FindBy(xpath = "//*[@content-desc='Instagram'] | //*[@name='SocialCTA:Instagram']")
    protected static WebElement instagramLink;

    @FindBy(xpath = "//*[@content-desc='X'] | //*[@name='SocialCTA:Twitter']")
    protected static WebElement xLink;

    @FindBy(xpath = "(//*[@resource-id='react-root']//android.widget.Button)[1] | //*[@name='Pinterest Link']")
    protected static WebElement xHeader;

    @FindBy(xpath = "//*[@content-desc='TikTok'] | //*[@name='SocialCTA:TikTok']")
    protected static WebElement tiktokLink;

    @FindBy(xpath = "//*[contains(@text='TikTok')] | //*[@text='Family Dollar is on TikTok'] | //*[@name='TikTok']")
    protected static WebElement tiktokHeader;

    @FindBy(xpath = "//*[@content-desc='Pinterest'] | //*[@name='SocialCTA:Pinterest']")
    protected static WebElement pinterestLink;

    @FindBy(xpath = "(//*[@resource-id='__PWS_ROOT__']//android.widget.Button)[1] | //*[@name='Pinterest Link']")
    protected static WebElement pinterestHeader;

    @FindBy(xpath = "//*[@resource-id='WebViewScreen:SafeAreaContainer']//android.widget.TextView | //XCUIElementTypeStaticText[@name='FAQs']")
    protected static WebElement webPageFAQsHeader;

    @FindBy(xpath = "//*[@resource-id='MoreTopTabsProfileText:TestID'] | //*[@name='MoreTopTabsProfileText:TestID']")
    protected static WebElement yourProfileLink;

    @FindBy(xpath = "//*[@content-desc='Legal'] | //*[@label='Legal']")
    protected static WebElement legalLink;

    @FindBy(xpath = "//*[@resource-id='FDCategoryHeader:Title'] | //*[@name='Legal']")
    protected static WebElement legalHeader;

    @FindBy(xpath = "//*[@resource-id='FDCategoryHeader:BackIcon'] | //*[@name='FDCategoryHeader:BackIcon']")
    protected static WebElement backButton;

    @FindBy(xpath = "//*[@resource-id='Notification:Section:title'] | //*[@name='Notification:Section:title']")
    protected static WebElement pushNotifications;

    @FindBy(xpath = "//*[@resource-id='EmailOptin:Section:title'] | //*[@name='EmailOptin:Section:title']")
    protected static WebElement emailUpdates;

    @FindBy(xpath = "//*[@resource-id='Notification:Section:description'] | //*[@name='Notification:Section:description']")
    protected static WebElement pushNotificationsDesc;

    @FindBy(xpath = "//*[@resource-id='EmailOptin:Section:description'] | //*[@name='EmailOptin:Section:description']")
    protected static WebElement emailUpdatesDesc;

    @FindBy(xpath = "//*[@resource-id='SMSOptIn:Section:title'] | //*[@name='SMSOptIn:Section:title']")
    protected static WebElement textNotification;

    @FindBy(xpath = "//*[contains(@text,'By toggling to')] | //*[contains(@name,'By toggling to')]")
    protected static WebElement textNotificationDesc;

    @FindBy(xpath = "//*[@resource-id='SMSOptIn:Section:toggle'] | //*[@name='SMSOptIn:Section:toggle']")
    protected static WebElement textNotificationToggle;

    @FindBy(xpath = "//*[@resource-id='mobileTextTitleSectionTestId'] | //*[@name='mobileTextTitleSectionTestId']")
    protected static WebElement mobileTextCommunication;

    @FindBy(xpath = "//*[@resource-id='mobileMessageSectionTestId'] | //*[@name='mobileMessageSectionTestId']")
    protected static WebElement mobileTextMessage;

    @FindBy(xpath = "//*[@resource-id='AccountLoginSection:Title'] | //*[@name='AccountLoginSection:Title']")
    protected static WebElement mobileSMSHeader;

    @FindBy(xpath = "//*[@resource-id='Biometric:Section:title'] | //*[@name='Biometric:Section:title']")
    protected static WebElement biometrics;

    @FindBy(xpath = "//*[@resource-id='Biometric:Section:description'] | //*[@name='Biometric:Section:description']")
    protected static WebElement biometricsDesc;

    @FindBy(xpath = "//*[@resource-id='AppPermission:Section:title'] | //*[@name='AppPermission:Section:title']")
    protected static WebElement appPermissions;

    @FindBy(xpath = "//*[@resource-id='AppPermission:Section:description'] | //*[@name='AppPermission:Section:description']")
    protected static WebElement appPermissionsDesc;

    public void clickButton(String btnName) {
        driverManagerUtils.clickByLabel(btnWebElements, btnName);
    }

    public void enterSearchText(String text) {
        driverManagerUtils.enterText(searchInput, text);
    }

    public void clickEnterButton() {
        searchInput.sendKeys(Keys.ENTER);
    }

    public void clickSearchBox() {
        driverManagerUtils.clickElement(searchInput);
    }

    public String getDefaultSearchString() {
        return driverManagerUtils.getElementText(searchInput);
    }

    public boolean isTextVisible(String text) {
        WebElement webElement = driver.findElement(
                By.xpath("//android.widget.TextView[@content-desc='" + text + "'] " +
                        " | //XCUIElementTypeStaticText[@name='" + text + "'] " +
                        " | //XCUIElementTypeOther[@name='" + text + "']"));
        driverManagerUtils.scrollToElement(webElement);
        return driverManagerUtils.isElementDisplayed(webElement);
    }

    public boolean isCancelButtonPresent() {
        return driverManagerUtils.isElementDisplayed(cancelButton);
    }

    public boolean isTrendingTextDisplayed() {
        return driverManagerUtils.isElementDisplayed(trendingSearch);
    }

    public boolean isPreviousSearchDisplayed() {
        return driverManagerUtils.isElementDisplayed(previousSearch);
    }

    public void clickClearButton() {
        driverManagerUtils.clickElement(clearLink);
    }

    public int getCountTrendingSearches() {
        return trendingSearches.size();
    }

    public void SelectDropDownValue(String name) {
        trendingSearches.stream().filter(we -> we.getText().equalsIgnoreCase(name)).findFirst().get().click();
        DriverManagerUtils.sleep(5);
    }

    public void clickCancelIcon() {
        driverManagerUtils.clickElement(cancelIcon);
    }

    public boolean isDropdownFieldsMatchingWithSearchText(String text) {
        return searchFields.stream().allMatch(webElement -> webElement.getText().contains(text));
    }

    public boolean isSearchIconPresent() {
        return searchIcon.isDisplayed();
    }

    public boolean isScannerPresent() {
        return ScanIcon.isDisplayed();
    }

    public boolean isSearchProductDisplayed(String searchValue) {
        return getProductList.stream().allMatch(webElement -> webElement.getText().toLowerCase().contains(searchValue));
    }

    public boolean isSortButtonPresent() {
        return driverManagerUtils.isElementDisplayed(sortButton);
    }

    public boolean isProductCountPresent() {
        return driverManagerUtils.isElementDisplayed(productCount);
    }

    public boolean isSmartCouponPresent() {
        return driverManagerUtils.isElementDisplayed(smartCoupon);
    }

    public boolean isFilterButtonPresent() {
        return driverManagerUtils.isElementDisplayed(filterButton);
    }

    public boolean isListShowing30Default() {
        return driverManagerUtils.isElementDisplayed(defaultCount);
    }

    public boolean isLoadMoreButtonPresent() {
        return driverManagerUtils.isElementDisplayed(loadMoreButton);
    }

    public void clickLoadMoreButton() {
        driverManagerUtils.clickElement(loadMoreButton);
    }

    public boolean isScannerIconPresent() {
        return driverManagerUtils.isElementDisplayed(scannerIcon);
    }

    public void clickExploreProductCategoriesTab() {
        driverManagerUtils.clickElement(exploreProductCategoriesTab);
    }

    public void clickExploreCouponCategoriesTab() {
        driverManagerUtils.clickElement(exploreCouponCategoriesTab);
    }

    public String getExploreProductCategoriesText() {
        return driverManagerUtils.getElementText(exploreProductCategoriesTab);
    }

    public String getExploreCouponCategoriesText() {
        return driverManagerUtils.getElementText(exploreCouponCategoriesTab);
    }

    public String getViewMyStoreDetailsText() {
        return driverManagerUtils.getElementText(viewMyStoreDetails);
    }

    public String getRedeemClippedText() {
        return driverManagerUtils.getElementText(redeemClippedCoupons);
    }

    public String getMessageText() {
        return driverManagerUtils.getElementText(messageTab);
    }

    public void clickMessageButton(){
        driverManagerUtils.clickElement(messageTab);
    }

    public boolean isMessageDisplayed() {
        return driverManagerUtils.isElementDisplayed(messagePage);
    }

    public boolean isMessageBackButtonDisplayed() {
        return driverManagerUtils.isElementDisplayed(messageBackButton);
    }

    public void clickBackButtonOnMessagePage() {
        driverManagerUtils.clickElement(messageBackButton);
    }

    public String getYourOrdersText() {
        return driverManagerUtils.getElementText(yourOrders);
    }

    public void clickYourOrdersButton(){
        driverManagerUtils.clickElement(yourOrders);
    }

    public String getYourStoreText() {
        return driverManagerUtils.getElementText(yourStore);
    }

    public void clickYourStoreButton() {
        driverManagerUtils.clickElement(yourStore);
    }

    public String getRecentOrdersText() {
        return driverManagerUtils.getElementText(recentOrders);
    }

    public boolean isRecentOrdersTextPresent() {
        driverManagerUtils.isElementDisplayed(exploreCouponCategoriesTab);
        return driverManagerUtils.isElementDisplayed(recentOrders);
    }

    public String getViewAllText() {
        return driverManagerUtils.getElementText(viewAll);
    }

    public void clickViewAllButton() {
        driverManagerUtils.clickElement(viewAll);
    }

    public boolean isOrderTilePresent() {
        return driverManagerUtils.isElementDisplayed(orderTile.get(0));
    }

    public String getSupportText() {
        return driverManagerUtils.getElementText(supportTitle);
    }

    public String getSupportAndSettingsText() {
        return driverManagerUtils.getElementText(supportAndSettings);
    }

    public String getContactUsText() {
        return driverManagerUtils.getElementText(contactUsLink);
    }

    public void clickContactUsButton() {
        driverManagerUtils.clickElement(contactUsLink);
    }

    public void clickAllowDeviceLocationPopUp() {
        driverManagerUtils.clickElement(allowDeviceLocation);
    }

    public boolean isContactUsHeaderPresent() {
        return driverManagerUtils.isElementDisplayed(contactUsWebHeader);
    }

    public String getFAQsText() {
        return driverManagerUtils.getElementText(linkFAQs);
    }

    public void clickFAQsButton() {
        driverManagerUtils.clickElement(linkFAQs);
    }

    public String getFAQsWebPageHeaderText() {
        return driverManagerUtils.getElementText(webPageFAQsHeader);
    }

    public String getVisitSiteText() {
        return driverManagerUtils.getElementText(visitSiteLink);
    }

    public void clickVisitSiteButton() {
        driverManagerUtils.clickElement(visitSiteLink);
    }

    public String getFacebookText() {
        return driverManagerUtils.getElementText(facebookLink);
    }

    public void clickFacebookLink() {
        driverManagerUtils.clickElement(facebookLink);
    }

    public String getFacebookHeaderOnFDWebPage() {
        return driverManagerUtils.getElementText(facebookHeader);
    }

    public String getInstagramText() {
        if (!driverManagerUtils.isElementDisplayed(instagramLink)) {
            driverManagerUtils.closeKeypad();
        }
        return driverManagerUtils.getElementText(instagramLink);
    }

    public void clickInstagramLink() {
        driverManagerUtils.clickElement(instagramLink);
    }

    public String getXText() {
        if (!driverManagerUtils.isElementDisplayed(xLink)) {
            driverManagerUtils.closeKeypad();
        }
        return driverManagerUtils.getElementText(xLink);
    }

    public void clickXLink() {
        driverManagerUtils.clickElement(xLink);
    }

    public boolean isXImagePresent() {
        return driverManagerUtils.isElementDisplayed(xHeader);
    }

    public String getTikTokText() {
        return driverManagerUtils.getElementText(tiktokLink);
    }

    public void clickTikTokLink() {
        driverManagerUtils.clickElement(tiktokLink);
    }

    public boolean isTikTokFDWebPageDisplayed() {
        return driverManagerUtils.isElementDisplayed(tiktokHeader);
    }

    public String getPinterestText() {
        if (!driverManagerUtils.isElementDisplayed(pinterestLink)) {
            driverManagerUtils.closeKeypad();
        }
        return driverManagerUtils.getElementText(pinterestLink);
    }

    public void clickPinterestLink() {
        driverManagerUtils.clickElement(pinterestLink);
    }

    public String getPinterestTextOnFDWebPage() {
        return driverManagerUtils.getElementText(pinterestHeader);
    }

    public boolean verifyLink(String socialLink) {
        return isTextVisible(socialLink);
    }

    public boolean verifyWebPage(String socialLink) {
        boolean flag= false;
            switch (socialLink) {
                case "Twitter":
                    flag = driverManagerUtils.isElementDisplayed(xLink);
                    break;
                case "Pinterest":
                    flag = driverManagerUtils.isElementDisplayed(pinterestLink);
                    break;
                case "TikTok":
                    flag = driverManagerUtils.isElementDisplayed(tiktokLink);
                    break;
                case "Instagram":
                    flag = driverManagerUtils.isElementDisplayed(instagramLink);
                    break;
                case "Facebook":
                    flag = driverManagerUtils.isElementDisplayed(facebookLink);
                    break;
            }
        return flag;
    }

    public void scrollToPageInDirectionOnMorePage(String navigationDirection) throws Exception {
        driverManagerUtils.scrollPage(navigationDirection);
    }

    public void navigateBack(){
        driverManagerUtils.navigateBack();
    }

    public void clickCloseKeypad() {
        driverManagerUtils.closeKeypad();
    }

    public String getYourProfileText() {
        return driverManagerUtils.getElementText(yourProfileLink);
    }

    public void clickYourProfileLink() {
        driverManagerUtils.clickElement(yourProfileLink);
    }

    public void clickLegalLink() {
        driverManagerUtils.clickElement(legalLink);
    }

    public String getLegalHeaderText() {
        return driverManagerUtils.getElementText(legalHeader);
    }

    public boolean isLegalBackButtonPresent() {
        return driverManagerUtils.isElementDisplayed(backButton);
    }

    public void clickLegalBackButton() {
        driverManagerUtils.clickElement(backButton);
    }

    public String getPushNotificationsText() {
        return driverManagerUtils.getElementText(pushNotifications);
    }

    public String getEmailUpdatesText() {
        return driverManagerUtils.getElementText(emailUpdates);
    }

    public String getPushNotificationsDescription() {
        return driverManagerUtils.getElementText(pushNotificationsDesc);
    }

    public String getEmailUpdatesDescription() {
        return driverManagerUtils.getElementText(emailUpdatesDesc);
    }

    public String getTextNotificationLabel() {
        return driverManagerUtils.getElementText(textNotification);
    }

    public String getTextNotificationDescription() {
        return driverManagerUtils.getElementText(textNotificationDesc);
    }

    public void clickTextNotificationsToggleButton() {
        driverManagerUtils.clickElement(textNotificationToggle);
    }

    public boolean isTextNotificationsToggleEnabled() {
        return driverManagerUtils.isElementEnabled(textNotificationToggle);
    }

    public String getMobileTextCommunications() {
        return driverManagerUtils.getElementText(mobileTextCommunication);
    }

    public String getMobileTextMessage() {
        return driverManagerUtils.getElementText(mobileTextMessage);
    }

    public void clickOnMobileTextMessage() {
        driverManagerUtils.clickElement(mobileTextMessage);
    }

    public String getMobileSMSHeader() {
        return driverManagerUtils.getElementText(mobileSMSHeader);
    }

    public String getBiometricsText() {
        return driverManagerUtils.getElementText(biometrics);
    }

    public String getBiometricsDescription() {
        return driverManagerUtils.getElementText(biometricsDesc);
    }

    public String getAppPermissionsText() {
        return driverManagerUtils.getElementText(appPermissions);
    }

    public String getAppPermissionsDescription() {
        return driverManagerUtils.getElementText(appPermissionsDesc);
    }
}
