package com.testx.web.api.selenium.restassured.qe.ui.stepdefinitions;

import com.testx.web.api.selenium.restassured.qe.ui.context.TestContext;
import com.testx.web.api.selenium.restassured.qe.ui.enums.ApplicationInputs;
import com.testx.web.api.selenium.restassured.qe.ui.enums.ECommInputs;
import com.testx.web.api.selenium.restassured.qe.ui.pageobjects.MorePage;
import com.testx.web.api.selenium.restassured.qe.ui.pageobjects.OrderHistoryPage;
import com.testx.web.api.selenium.restassured.qe.ui.webdriver.DriverManagerUtils;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.util.HashMap;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;

public class MorePageStepDef {

    MorePage morePage;

    public MorePageStepDef(TestContext testContext) {
        this.morePage = new MorePage(testContext);
    }

    @And("User will see {string} on more page")
    public void isExploreProductButtonVisible(String text) {
        Assert.assertTrue(morePage.isTextVisible(text));
    }

    @And("User will see default search {string} on more page")
    public void verifyDefaultSearchString(String text) {
        Assert.assertTrue(morePage.getDefaultSearchString().equalsIgnoreCase(text));
    }

    @And("User will see cancel button more page")
    public void verifyCancelButton() {
        Assert.assertTrue(morePage.isCancelButtonPresent());
    }

    @And("User will click on search bar from more page")
    public void clickSearchBar() {
        morePage.clickSearchBox();
    }

    @When("User search {string} in search box on more page")
    public void userClicksTabOnHomePage(String tabName) {
        morePage.enterSearchText(tabName);

    }

    @When("User enter search {string} in search box and select on more page")
    public void selectSearch(String name) {
        morePage.enterSearchText(name);
        morePage.SelectDropDownValue(name);


    }

    @When("User verifies search {string} product name matches from list in more page")
    public void verifySearchProducts(String searchValue) {
        Assert.assertTrue(morePage.isSearchProductDisplayed(searchValue));

    }

    @When("User click {string} button on more page")
    public void userClicksBtn(String btnName) {
        morePage.clickButton(btnName);
    }

    @When("User clicks enter button on more page")
    @When("User clicks enter button on page")
    public void clickEnterButton() {
        morePage.clickEnterButton();
    }

    @When("User will see default trending header on more page")
    public void verifyTrendingSearch() {
        Assert.assertTrue(morePage.isTrendingTextDisplayed());
    }

    @When("User will see previous Search Header on more page")
    public void isPreviousSearchDisplayed() {
        Assert.assertTrue(morePage.isPreviousSearchDisplayed());
    }

    @When("User will not see previous Search Header on more page")
    public void isPreviousSearchNotDisplayed() {
        Assert.assertFalse(morePage.isPreviousSearchDisplayed());
    }

    @And("user click on clear link on more page")
    public void clickClearButton() {
      morePage.clickClearButton();
    }

    @When("User verify trending search items with default count more page")
    public void verifyTrendingSearchCount() {
        Assert.assertTrue(morePage.getCountTrendingSearches() <= 11);
    }

    @When("User clicks cancel icon in searchBar on more page")
    public void clickCancelIcon() {
        morePage.clickCancelIcon();
    }

    @When("User verifies dropdown fields are same search {string} text on more page")
    public void verifyDropDownFields(String text) {
        Assert.assertTrue(morePage.isDropdownFieldsMatchingWithSearchText(text));
    }

    @When("User verifies search icon present on more page")
    public void isSearchIconPresent() {
        Assert.assertTrue(morePage.isSearchIconPresent());
    }

    @When("User verifies scanner present on more page")
    public void isScannerPresent() {
        Assert.assertTrue(morePage.isScannerPresent());
    }


    @When("User will see productCount on more page")
    public void isProductCountShowing() {
        Assert.assertTrue(morePage.isProductCountPresent());
    }

    @When("User will see FilterButton on more page")
    public void isFilterButton() {
        Assert.assertTrue(morePage.isFilterButtonPresent());
    }

    @When("User will see smartCoupon on more page")
    public void isSmartCoupon() {
        Assert.assertTrue(morePage.isSmartCouponPresent());
    }

    @When("User will see sortButton on more page")
    public void isSortButton() {
        Assert.assertTrue(morePage.isSortButtonPresent());
    }

    @When("User will see loadMoreButton on more page")
    public void isLoadMoreButtonPresent() {
        Assert.assertTrue(morePage.isLoadMoreButtonPresent());
    }

    @When("User will click loadMoreButton on more page")
    public void clickLoadMoreButton() {
        morePage.clickLoadMoreButton();
    }

    @When("User will see showing 30 default text on more page")
    public void isListShowing30Default() {
        Assert.assertTrue(morePage.isListShowing30Default());
    }

    @When("User scrolls down to move bottom")
    @When("User will scroll bottom in more page")
    public void scrollToBottom() {
        boolean driverType = morePage.driver instanceof AndroidDriver;
        if (driverType) {
            morePage.driver.findElements(AppiumBy.androidUIAutomator(
                    "new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(30)"));
        } else {
            JavascriptExecutor js = morePage.driver;
            HashMap<String, Object> scrollObject = new HashMap<>();
            scrollObject.put("direction", "down");
            js.executeScript("mobile: scroll", scrollObject);
        }
    }

    @Then("User is able to see Scanner icon in More Page")
    public void userIsAbleToSeeScannerIconInMorePage() {
        Assert.assertTrue(morePage.isScannerIconPresent());
    }

    @When("User clicks Explore Product Categories Tab on More Page")
    public void userClicksExploreProductCategoriesTabOnHomePage() {
        morePage.clickExploreProductCategoriesTab();
    }

    @When("User clicks Explore Coupon Categories Tab on More Page")
    public void userClicksExploreCouponCategoriesTabOnHomePage() {
        morePage.clickExploreCouponCategoriesTab();
    }

    @Then("User is able to see Explore Product Categories text on More Page")
    public void verifyExploreProductCategoriesTextOnMorePage() {
        Assert.assertEquals(
                morePage.getExploreProductCategoriesText(), "Explore Product\n" + "Categories");
    }

    @Then("User is able to see Explore Coupon Categories text on More Page")
    public void verifyExploreCouponCategoriesTextOnMorePage() {
        Assert.assertEquals(
                morePage.getExploreCouponCategoriesText(), "Explore Coupon\n" + "Categories");
    }

    @Then("User is able to see Message text on More Page")
    public void verifyMessageTextOnMorePage() {
        Assert.assertEquals(morePage.getMessageText(), ApplicationInputs.MESSAGES.getValue());
    }

    @Then("User is able to see Your Orders text on More Page")
    public void verifyYourOrdersTextOnMorePage() {
        Assert.assertEquals(morePage.getYourOrdersText(), ECommInputs.YOUR_ORDERS.getValue());
    }

    @Then("User is able to see Your Store text on More Page for Logged In User")
    public void verifyYourStoreTextOnMorePage() {
        Assert.assertEquals(morePage.getYourStoreText(), ApplicationInputs.YOUR_STORE.getValue());
    }

    @When("User clicks Your Store button on More Page")
    public void userClicksYourStoreButtonOnMorePage() {
        morePage.clickYourStoreButton();
    }

    @And("User is able to see View My Store Details text on More Page")
    public void verifyViewMyStoreDetailsTextOnMorePage() {
        Assert.assertEquals(morePage.getViewMyStoreDetailsText(), "View My Store\n" + "Details");
    }

    @And("User is able to see Redeem Clipped Coupons text on More Page")
    public void verifyRedeemClippedTextOnMorePage() {
        Assert.assertEquals(morePage.getRedeemClippedText(), "Redeem Clipped\n" + "Coupons");
    }

    @And("User clicks Message button on More Page")
    public void userClicksMessageButtonOnMorePage() {
        morePage.clickMessageButton();
    }

    @And("User clicks Your Orders button on More Page")
    public void userClickYourOrdersButtonOnMorePage() {
        morePage.clickYourOrdersButton();
    }

    @And("User is on Message display Page")
    public void userIsOnMessageDisplayPage() {
        Assert.assertTrue(morePage.isMessageDisplayed());
    }

    @Then("User is able to see Back Button on Message Display Page")
    public void verifyBackButtonOnMessageDisplayPage() {
        Assert.assertTrue(morePage.isMessageBackButtonDisplayed());
    }

    @When("User clicks Back Button on Message Display Page")
    public void userClicksBackButtonOnMessageDisplayPage() {
        morePage.clickBackButtonOnMessagePage();
    }

    @Then("User is able to see Recent Orders text on More Page")
    public void verifyRecentOrdersTextOnMorePage() {
        Assert.assertEquals(morePage.getRecentOrdersText(), ECommInputs.RECENT_ORDERS.getValue());
    }

    @Then("User is not able to see Recent Orders text on More Page")
    public void verifyNoRecentOrdersTextOnMorePage() {
        Assert.assertFalse(morePage.isRecentOrdersTextPresent());
    }

    @Then("User is able to see View All text on More Page")
    public void verifyViewAllTextOnMorePage() {
        Assert.assertEquals(morePage.getViewAllText(), ECommInputs.VIEW_ALL.getValue());
    }

    @When("User clicks View All button on More Page")
    public void userClicksViewAllButtonOnMorePage() {
        morePage.clickViewAllButton();
    }

    @Then("User is able to see Order Tile text on More Page")
    public void verifyOrderTileTextOnMorePage() {
        Assert.assertTrue(morePage.isOrderTilePresent());
    }

    @And("User is able to see Support text on More Page")
    public void verifySupportTextOnMorePage() {
        Assert.assertEquals(morePage.getSupportText(), ApplicationInputs.SUPPORT.getValue());
    }

    @Then("User is able to see the Support and Settings text on More Page")
    public void verifySupportAndSettingsTextOnHomePage() {
        Assert.assertEquals(morePage.getSupportAndSettingsText(), ApplicationInputs.SUPPORT_AND_SETTINGS.getValue());
    }

    @And("User is able to see Contact Us text on More Page")
    public void verifyContactUsTextOnMorePage() {
        Assert.assertEquals(morePage.getContactUsText(), ApplicationInputs.CONTACT_US.getValue());
    }

    @And("User clicks Contact Us button on More Page")
    public void userClickContactUsButtonOnMorePage() {
        if (DriverManagerUtils.configuration.mobilePlatform().equalsIgnoreCase("android")) {
            morePage.clickContactUsButton();
        }
    }

    @And("User clicks Allow device location pop up")
    public void userClickAllowDeviceLocationPopUp() {
        if (DriverManagerUtils.configuration.mobilePlatform().equalsIgnoreCase("android")) {
            morePage.clickAllowDeviceLocationPopUp();
        }
    }

    @And("User is able to see FD Contact Us header text on Web Page")
    public void verifyFDContactUsHeaderTextOnWebPage() {
        if (DriverManagerUtils.configuration.mobilePlatform().equalsIgnoreCase("android")) {
            Assert.assertTrue(morePage.isContactUsHeaderPresent());
        }
    }

    @And("User is able to see FAQs text on More Page")
    public void verifyFAQsTextOnMorePage() {
        Assert.assertEquals(morePage.getFAQsText(), ApplicationInputs.FAQS.getValue());
    }

    @And("User clicks FAQs button on More Page")
    public void userClickFAQsButtonOnMorePage() {
        morePage.clickFAQsButton();
    }

    @And("User is able to see FAQs header text on Web Page")
    public void verifyFDFAQsHeaderTextOnAccountPage() {
        Assert.assertEquals(morePage.getFAQsWebPageHeaderText(), ApplicationInputs.FAQS.getValue());
    }

    @And("User is able to see Visit Site text on Account Page")
    @And("User is able to see Visit Site text on More Page")
    public void verifyVisitSiteTextOnMorePage() {
        Assert.assertEquals(morePage.getVisitSiteText(), ApplicationInputs.VISIT_SITE.getValue());
    }

    @And("User clicks Visit Site button on More Page")
    @And("User clicks Visit Site button on Account Page")
    public void userClickVisitSiteButtonOnAccountPage() {
        if (DriverManagerUtils.configuration.mobilePlatform().equalsIgnoreCase("android")) {
            morePage.clickVisitSiteButton();
        }
    }

    @And("User is able to see Facebook text on More Page")
    public void verifyFacebookTextOnMorePage() {
        Assert.assertEquals(morePage.getFacebookText(), ApplicationInputs.FACEBOOK.getValue());
    }

    @And("User clicks Facebook link on More Page")
    public void userClicksFacebookLinkOnMorePage() {
        if (DriverManagerUtils.configuration.mobilePlatform().equalsIgnoreCase("android")) {
            morePage.clickFacebookLink();
        }
    }

    @And("User is able to see Facebook text on FD Web Page")
    public void verifyFacebookTextOnFDWebPage() {
        if (DriverManagerUtils.configuration.mobilePlatform().equalsIgnoreCase("android")) {
            Assert.assertEquals(morePage.getFacebookHeaderOnFDWebPage(), ApplicationInputs.FACEBOOK_HEADER.getValue());
        }
    }

    @And("User is able to see Instagram text on More Page")
    public void verifyInstagramTextOnMorePage() {
        Assert.assertEquals(morePage.getInstagramText(), ApplicationInputs.INSTAGRAM.getValue());
    }

    @And("User clicks Instagram link on More Page")
    public void userClicksInstagramLinkOnMorePage() {
        if (DriverManagerUtils.configuration.mobilePlatform().equalsIgnoreCase("android")) {
            morePage.clickInstagramLink();
        }
    }

    @And("User is able to see X text on More Page")
    public void verifyXTextOnMorePage() {
        Assert.assertEquals(morePage.getXText(), ApplicationInputs.X.getValue());
    }

    @And("User clicks X link on More Page")
    public void userClicksXLinkOnMorePage() {
        if (DriverManagerUtils.configuration.mobilePlatform().equalsIgnoreCase("android")) {
            morePage.clickXLink();
        }
    }

    @And("User is able to see X text on FD Web Page")
    public void verifyXTextOnFDWebPage() {
        if (DriverManagerUtils.configuration.mobilePlatform().equalsIgnoreCase("android")) {
            Assert.assertTrue(morePage.isXImagePresent());
        }
    }

    @And("User is able to see TikTok text on More Page")
    public void verifyTikTokTextOnMorePage() {
        Assert.assertEquals(morePage.getTikTokText(), ApplicationInputs.TIKTOK.getValue());
    }

    @And("User clicks TikTok link on More Page")
    public void userClicksTikTokLinkOnMorePage() {
        if (DriverManagerUtils.configuration.mobilePlatform().equalsIgnoreCase("android")) {
            morePage.clickTikTokLink();
        }
    }

    @And("User is able to see TikTok text on FD Web Page")
    public void verifyTikTokTextOnFDWebPage() {
        if (DriverManagerUtils.configuration.mobilePlatform().equalsIgnoreCase("android")) {
            Assert.assertTrue(morePage.isTikTokFDWebPageDisplayed());
        }
    }

    @And("User is able to see Pinterest text on More Page")
    public void verifyPinterestTextOnMorePage() {
        Assert.assertEquals(morePage.getPinterestText(), ApplicationInputs.PINTEREST.getValue());
    }

    @And("User clicks Pinterest link on More Page")
    public void userClicksPinterestLinkOnMorePage() {
        if (DriverManagerUtils.configuration.mobilePlatform().equalsIgnoreCase("android")) {
            morePage.clickPinterestLink();
        }
    }

    @And("User is able to see Pinterest text on FD Web Page")
    public void verifyPinterestTextOnFDWebPage() {
        if (DriverManagerUtils.configuration.mobilePlatform().equalsIgnoreCase("android")) {
            Assert.assertEquals(morePage.getPinterestTextOnFDWebPage(), ApplicationInputs.PINTEREST_APP.getValue());
        }
    }

    @And("User is able to see {string} text on More page")
    public void userIsAbleToSeeTextOnMorePage(String socialLink) {
        Assert.assertTrue(morePage.verifyLink(socialLink));
    }

    @And("User Move to {string} Web Page")
    public void userMoveToWebPage(String socialLink) {
        Assert.assertTrue(morePage.verifyWebPage(socialLink));
    }

    @And("User scroll down to {string} of page on More Page")
    public void userScrollDownToOfPageOnMorePage(String navigationDirection) throws Exception {
        morePage.scrollToPageInDirectionOnMorePage(navigationDirection);
    }

    @When("User move back to app")
    public void userMoveBackToApp() {
        morePage.navigateBack();
    }

    @When("User clicks back button from Keypad")
    public void userClicksBackButtonFromKeypad() {
        if (DriverManagerUtils.configuration.mobilePlatform().equalsIgnoreCase("android")) {
            morePage.clickCloseKeypad();
        }
    }

    @Then("User is able to see Your Profile text on More Page for Logged In User")
    public void verifyYourProfileTextOnMorePageForLoggedInUser() {
        Assert.assertEquals(morePage.getYourProfileText(), ApplicationInputs.YOUR_PROFILE.getValue());
    }

    @When("User clicks Your Profile link on Account Page")
    public void userClicksYourProfileLinkOnAccountPage() {
        morePage.clickYourProfileLink();
    }

    @When("User clicks Legal link on More Page")
    public void userClicksLegalLinkOnMorePage() {
        morePage.clickLegalLink();
    }

    @Then("User is able to see Legal Header on Legal Page")
    public void verifyLegalHeaderOnLegalPage() {
        Assert.assertEquals(morePage.getLegalHeaderText(), ApplicationInputs.LEGAL.getValue());
    }

    @And("User is able to see Back button on Legal Page")
    public void verifyBackButtonOnLegalPage() {
        Assert.assertTrue(morePage.isLegalBackButtonPresent());
    }

    @When("User clicks Back button on Legal Page")
    public void userClicksBackButtonOnLegalPage() {
        morePage.clickLegalBackButton();
    }

    @And("User is able to see Push Notifications text on Communications Page")
    public void verifyPushNotificationsTextOnCommunicationsPage() {
        Assert.assertEquals(morePage.getPushNotificationsText(), ApplicationInputs.PUSH_NOTIFICATION.getValue());
    }

    @And("User is able to see Email Updates text on Communications Page")
    public void verifyEmailUpdatesTextOnCommunicationsPage() {
        Assert.assertEquals(morePage.getEmailUpdatesText(), ApplicationInputs.EMAIL_UPDATES.getValue());
    }

    @And("User is able to see Push Notifications description on Communications Page")
    public void verifyPushNotificationsDescriptionOnCommunicationsPage() {
        Assert.assertEquals(morePage.getPushNotificationsDescription(), ApplicationInputs.NOTIFICATION_DESC.getValue());
    }

    @And("User is able to see Email Updates description on Communications Page")
    public void verifyEmailUpdatesDescriptionOnCommunicationsPage() {
        Assert.assertEquals(morePage.getEmailUpdatesDescription(), ApplicationInputs.EMAIL_UPDATES_DESC.getValue());
    }

    @And("User is able to see Text Notifications label on Communications Page")
    public void verifyTextNotificationsLabelOnCommunicationsPage() {
        Assert.assertEquals(morePage.getTextNotificationLabel(), ApplicationInputs.TEXT_NOTIFICATION.getValue());
    }

    @And("User is able to see Text Notifications description on Communications Page")
    public void verifyTextNotificationsDescriptionOnCommunicationsPage() {
        Assert.assertEquals(morePage.getTextNotificationDescription(), ApplicationInputs.TEXT_NOTIFICATION_DESC.getValue());
    }

    @When("User clicks on Text Notifications Toggle button")
    public void userClicksOnTextNotificationsToggleButton() {
        morePage.clickTextNotificationsToggleButton();
    }

    @Then("User verify Text Notifications is enabled")
    public void verifyTextNotificationsIsEnabled() {
        Assert.assertTrue(morePage.isTextNotificationsToggleEnabled());
    }

    @Then("User verify Text Notifications is disabled")
    public void userVerifyTextNotificationsIsDisabled() {
        Assert.assertTrue(morePage.isTextNotificationsToggleEnabled());
    }

    @And("User is able to see Mobile Text Communications on Communications Page")
    public void verifyMobileTextCommunicationsOnCommunicationsPage() {
        Assert.assertEquals(morePage.getMobileTextCommunications(), ApplicationInputs.MOBILE_TEXT_COMM.getValue());
    }

    @And("User is able to see Mobile Text Message on Communications Page")
    public void verifyMobileTextMessageOnCommunicationsPage() {
        Assert.assertEquals(morePage.getMobileTextMessage(), ApplicationInputs.MOBILE_TEXT_MESSAGE.getValue());
    }

    @When("User clicks Mobile Text Message on Communications Page")
    public void userClicksMobileTextMessageOnCommunicationsPage() {
        morePage.clickOnMobileTextMessage();
    }

    @Then("User is able to see Mobile SMS Communications header")
    public void verifyMobileSMSCommunicationsHeader() {
        Assert.assertEquals(morePage.getMobileSMSHeader(), ApplicationInputs.MOBILE_SMS_HEADER.getValue());
    }

    @And("User is able to see Biometrics text on App Settings Page")
    public void verifyBiometricsTextOnAppSettingsPage() {
        if (DriverManagerUtils.configuration.mobilePlatform().equalsIgnoreCase("android")) {
            Assert.assertEquals(morePage.getBiometricsText(), ApplicationInputs.BIOMETRICS.getValue());
        } else {
            Assert.assertEquals(morePage.getBiometricsText(), ApplicationInputs.FACE_ID.getValue());
        }
    }

    @And("User is able to see Biometrics description on App Settings Page")
    public void verifyBiometricsDescriptionOnAppSettingsPage() {
        Assert.assertEquals(morePage.getBiometricsDescription(), ApplicationInputs.BIOMETRICS_DESC.getValue());
    }

    @And("User is able to see App Permissions text on App Settings Page")
    public void verifyAppPermissionsTextOnAppSettingsPage() {
        Assert.assertEquals(morePage.getAppPermissionsText(), ApplicationInputs.APP_PERMISSIONS.getValue());
    }

    @And("User is able to see App Permissions description on App Settings Page")
    public void verifyAppPermissionsDescriptionOnAppSettingsPage() {
        Assert.assertEquals(morePage.getAppPermissionsDescription(), ApplicationInputs.APP_PERMISSIONS_DESC.getValue());
    }

}
