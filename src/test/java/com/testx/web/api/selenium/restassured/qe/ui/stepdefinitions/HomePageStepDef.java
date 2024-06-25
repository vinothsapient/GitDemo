package com.testx.web.api.selenium.restassured.qe.ui.stepdefinitions;

import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static java.time.Duration.ofMillis;

import com.testx.web.api.selenium.restassured.qe.ui.context.TestContext;
import com.testx.web.api.selenium.restassured.qe.ui.enums.ApplicationInputs;
import com.testx.web.api.selenium.restassured.qe.ui.pageobjects.HomePage;
import com.testx.web.api.selenium.restassured.qe.ui.webdriver.DriverManagerUtils;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.util.HashMap;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;

public class HomePageStepDef {
    HomePage homePage;

    public HomePageStepDef(TestContext testContext){
        this.homePage = new HomePage(testContext);
    }

    @Then("User is able to see {string} text on Home Page")
    @Then("User is able to see {string} text on PDP Page")
    public void userIsAbleToSeeTextOnHomePage(String label) {
        Assert.assertTrue(homePage.isElementPresent(label));
    }

    @When("User clicks SignIn Tab on Home Page")
    @When("User clicks Account Tab on Home Page")
    public void userClicksAccountTabOnHomePage() {
        homePage.clickAccountTab();
    }

    @When("User clicks on Visit Site on account page")
    public void userClicksVisitSiteOnHomePage() {
        homePage.clickVisitSite();
    }

    @When("User clicks on Help on account page")
    public void userClicksHelpOnHomePage() {
        homePage.clickHelp();
    }

    @When("User clicks on TermsCondition on account page")
    public void userClicksTermsConditionOnHomePage() {
        homePage.clickTermsCondition();
    }

    @When("User clicks on SmartCoupons on account page")
    public void userClicksSmartCouponsOnHomePage() {
        homePage.clickSmartCoupons();
    }

    @When("User clicks on Coupons Policy on account page")
    public void userClicksCouponsPolicyOnHomePage() {
        homePage.clickCouponsPolicy();
    }

    @When("User clicks on California Information on account page")
    public void userClicksCaliforniaInformationOnHomePage() {
        homePage.clickCaliforniaInformation();
    }

    @When("User clicks on Privacy Policy on account page")
    public void userClicksPrivacyPolicyOnHomePage() {
        homePage.clickPrivacyPolicy();
    }

    @When("User clicks on Contact Us on More page")
    public void userClicksContactUsOnHomePage() {
        homePage.clickContactUs();
    }

    @When("User clicks on FAQs on More page")
    public void userClicksFAQsOnHomePage() {
        homePage.clickFAQs();
    }

    @When("User clicks on Visit Site on More page")
    public void userClicksVisitSiteOnMorePage() {
        homePage.clickVisitSite();
    }

    @When("User clicks Log in to Clip Coupon button on Home Page")
    public void userClicksLogInToClipCouponOnHomePage() {
        homePage.clickLogInClipCoupon();
    }

    @When("User clicks Clip Coupon on Home Page")
    public void userClicksClipCouponOnHomePage() {
        homePage.clickClipCoupon();
    }

    @When("User clicks {string} Tab on Home Page")
    public void userClicksTabOnHomePage(String tabName) {
        homePage.clickTab(tabName);
    }

    @When("User clicks Home Tab from Global Navigation")
    public void userClicksHomeTabFromGlobalNavigation() {
        homePage.clickHomeTab();
    }

    @When("User clicks Ads and Books Tab on Home Page")
    public void userClicksAdsAndBooksTabOnHomePage() {
        homePage.clickAdsAndBooksTab();
    }

    @When("User clicks Coupons Tab on Home Page")
    public void userClicksCouponsTabOnHomePage() {
        homePage.clickCouponsTab();
    }

    @When("User clicks Show All button on coupons page")
    public void userClicksShowAllBtnOnHomePage() {
        homePage.clickShowAllButton();
    }

    @When("User tap on the coupon on coupons page")
    public void userClicksCouponTabOnCouponsPage() {
        homePage.clickCoupon();
    }

    @When("User clicks Refresh button at the bottom of the Coupons Page")
    public void userClicksRefreshTabCouponsPage() {
        homePage.clickRefreshButton();
    }

    @When("User clicks Clipped button on Coupons Page")
    public void userClicksClippedTabOnCouponsPage() {
        homePage.clickClippedTab();
    }
    @When("User clicks Expired & Unused Coupons Tab on Coupons Page")
    public void userClicksExpiredUnusedCouponsTabOnCouponsPage() {
        homePage.clickExpiredUnusedCouponsTab();
    }

    @When("User clicks Redeemed Coupons Tab on Coupons Page")
    public void userClicksRedeemedCouponsTabOnCouponsPage() {
        homePage.clickRedeemedCouponsTab();
    }

    @When("User clicks More Tab on Home Page")
    public void userClicksMoreTabOnHomePage() {
        homePage.clickMoreTab();
    }
    @When("User clicks on View My store details")
    public void userClicksOnViewMyStoreDetails() {
        homePage.clickViewMyStoreDetails();
    }

    @When("User clicks on first product on category list")
    public void userClicksOnFirstProductOnCategoryList() {
        homePage.clickFirstProduct();
    }

    @When("User clicks on sub product from sub category page")
    public void userClicksOnProductOnSubCategoryList() {
        homePage.clickSubProduct();
    }

    @Then("User click explore all {string} Categories on home Page")
    public void clickExploreButton(String label) {
        homePage.clickExploreButton(label);
    }

    @Then("User is able to see Home button on Global Navigation")
    @Then("User is able to see Home text on Home Page")
    public void verifyHomeTextOnHomePage() {
        Assert.assertTrue(homePage.isHomeTabTextDisplayed());
    }

    @Then("User is able to see Store details on Home Page")
    public void verifyStoreDetailsOnHomePage() {
        Assert.assertTrue(homePage.isStoreDetailsPresent());
    }

    @Then("User is able to see Ads and Books button on Global Navigation")
    @Then("User is able to see Ads and Books text on Home Page")
    public void verifyAdsAndBooksTextOnHomePage() {
        Assert.assertTrue(homePage.isAdsAndBooksTabPresent());
    }

    @Then("User is able to see Coupon button on Global Navigation")
    @Then("User is able to see Coupon text on Home Page")
    public void verifyCouponTextOnHomePage() {
        Assert.assertTrue(homePage.isCouponTabPresent());
    }

    @Then("User is able to see Account button on Global Navigation")
    @Then("User is able to see Account text on Home Page")
    public void verifyAccountTextOnHomePage() {
        Assert.assertTrue(homePage.isAccountTabPresent());
    }

    @Then("User is able to see More button on Global Navigation")
    @Then("User is able to see More text on Home Page")
    public void verifyMoreTextOnHomePage() {
        Assert.assertTrue(homePage.isMoreTabPresent());
    }

    @When("User tap on First Product from List")
    public void userTapOnProductFromList() {
        homePage.clickProduct();
    }

    @When("User tap on first product from List")
    public void userTapOnFirstProductFromList() {
        homePage.openFirstProduct();
    }

    @When("User drag and drop to down on Home Page")
    public void dragAndDrop(){
        homePage.DragAndDrop();
    }

    @When("User drag and drop to down from {int} and {int} to {int} and {int} coordinates")
    public void dragAndDrop(int xFrom,int yFrom,int xTo,int yTo){
        new TouchAction((PerformsTouchActions) homePage.driver).press(PointOption.point(xFrom,yFrom))
                .waitAction(waitOptions(ofMillis(800))).moveTo(PointOption.point(xTo, yTo)).release().perform();
    }

    @When("User scrolls down to move coupon")
    @When("User scrolls down to move Home Page")
    public void scrollToBottom() {
        new TouchAction((PerformsTouchActions)homePage.driver).press(PointOption.point(20,1000)) .waitAction(waitOptions(ofMillis(800))).moveTo(PointOption.point(20, 300)).release().perform();
        boolean driverType = homePage.driver instanceof AndroidDriver;
        if (driverType) {
            homePage.driver.findElements(AppiumBy.androidUIAutomator(
                    "new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(1)"));
        } else {
            JavascriptExecutor js = homePage.driver;
            HashMap<String, Object> scrollObject = new HashMap<>();
            scrollObject.put("direction", "down");
            js.executeScript("mobile: scroll", scrollObject);
        }
    }

    @When("User scrolls down for one time")
    public void scrollDownOneTime() {
        boolean driverType = homePage.driver instanceof AndroidDriver;
        if (driverType) {
            homePage.driver.findElements(AppiumBy.androidUIAutomator(
                    "new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(1)"));
        } else {
            JavascriptExecutor js = homePage.driver;
            HashMap<String, Object> scrollObject = new HashMap<>();
            scrollObject.put("direction", "down");
            js.executeScript("mobile: scroll", scrollObject);
        }
    }

    @Then("verify User able to see product List Page")
    public void verifyUserAbleToSeeProductListPage() {
        Assert.assertTrue(homePage.isFirstElementPresent());
    }

    @When("User clicks on Instacart banner on More Page")
    @And("User clicks on Instacart banner on Home Page")
    public void userClicksInstacartBanner() {
        homePage.clickInstacartBanner();
    }

    @Then("User is able to see Instacart Web Page")
    public void verifyInstacartWebPage() {
        Assert.assertTrue(homePage.isInstacartWebPageVisible());
    }

    @When("User clicks close button on Instacart Web Page")
    public void userClicksCloseButtonOnInstacartWebPage() {
        homePage.clickInstacartCloseButton();
    }

    @And("User is able to see {string} Guest title on Home Page")
    public void verifyTitleOnHomePage(String expectedText) {
        Assert.assertEquals(homePage.getGuestTitleText(), expectedText);
    }

    @And("User is able to see {string} Guest sub title on Home Page")
    public void verifyGuestSubTitleOnHomePage(String expectedText) {
        Assert.assertEquals(homePage.getGuestSubTitleText(), expectedText);
    }

    @And("User is able to see {string} header login title on Home Page")
    public void verifyHeaderLoginTitleOnHomePage(String expectedText) {
        Assert.assertEquals(homePage.getHeaderLoginTitleText(), expectedText);
    }

    @When("User clicks Log In button on Home Page")
    public void userClicksLogInButtonOnHomePage() {
        homePage.clickLoginButton();
    }

    @And("User is able to see {string} header Create Account Title on Home Page")
    public void verifyHeaderCreateAccountTitleOnHomePage(String expectedText) {
        Assert.assertEquals(homePage.getHeaderCreateAccountTitleText(), expectedText);
    }

    @When("User clicks Create Account button on Home Page")
    public void userClicksCreateAccountButtonOnHomePage() {
        homePage.clickCreateAccountButton();
    }

    @Then("User is able to View the Banner ads")
    @And("User is able to see Banner Ads Image on Home Page")
    public void verifyBannerImageOnHomePage() {
        Assert.assertTrue(homePage.isBannerAdsPresent());
    }

    @And("User clicks Banner Ads Image on Home Page")
    public void userClicksBannerImageOnHomePage() {
        homePage.clickBannerAds();
    }

    @And("User is able to see {string} Coupon label below Banner Ad on Shop Page")
    @And("User is able to see {string} Coupon label below Banner Ad on SmartCoupon Page")
    @And("User is able to see {string} Coupon label below Banner Ad on Home Page")
    public void verifyCouponLabelBelowBannerAdOnHomePage(String expectedText) {
        Assert.assertEquals(homePage.getSponsoredLabelText(), expectedText);
    }

    @And("User is able to see Dots Render Indicators associated to the Carousel")
    @And("User is able to see 3 Page Indicators associated to the Carousel")
    @And("User is able to see 5 Page Indicators associated to the Carousel")
    public void verifyPageIndicatorsAssociatedToTheCarousel() {
        if (DriverManagerUtils.configuration.mobilePlatform().equalsIgnoreCase("android")) {
            Assert.assertTrue(homePage.isIndicatorsAssociatedToTheCarouselPresent());
        }
    }

    @Then("User is able to see {string} Smart Coupon Header title on Home Page")
    public void verifySmartCouponHeaderTitleOnHomePage(String expectedText) {
        Assert.assertEquals(homePage.getHeaderSmartCouponTitleText(), expectedText);
    }

    @And("User is able to see {string} Smart Coupon Header link on Home Page")
    public void verifySmartCouponHeaderLinkOnHomePage(String expectedText) {
        Assert.assertEquals(homePage.getHeaderSmartCouponLinkText(), expectedText);
    }

    @And("User clicks All Coupons link on Home Page")
    public void userClicksAllCouponsLinkOnHomePage() {
        homePage.clickAllCouponLink();
    }

    @And("User is able to see Smart Coupon Tag on Home Page")
    public void verifySmartCouponTagOnHomePage() {
        Assert.assertTrue(homePage.isSmartCouponTagPresent());
    }

    @And("User is able to see Smart Coupon Image on SmartCoupon Page")
    @And("User is able to see Smart Coupon Image on Home Page")
    public void verifySmartCouponImageOnHomePage() {
        if (DriverManagerUtils.configuration.mobilePlatform().equalsIgnoreCase("android")) {
            Assert.assertTrue(homePage.isSmartCouponImagePresent());
        }
    }

    @And("User is able to see Smart Coupon Discount Text on SmartCoupon Page")
    @And("User is able to see Smart Coupon Discount Text on Home Page")
    public void verifySmartCouponDiscountTextOnHomePage() {
        if (DriverManagerUtils.configuration.mobilePlatform().equalsIgnoreCase("android")) {
            Assert.assertTrue(homePage.isSmartCouponDiscountLabelDisplayed());
        }
    }

    @And("User is able to see Smart Coupon Title Text on SmartCoupon Page")
    @And("User is able to see Smart Coupon Title Text on Home Page")
    public void verifySmartCouponTitleTextOnHomePage() {
        if (DriverManagerUtils.configuration.mobilePlatform().equalsIgnoreCase("android")) {
            Assert.assertTrue(homePage.isSmartCouponTitleTextPresent());
        }
    }

    @And("User is able to see Smart Coupon Expiry Text on SmartCoupon Page")
    @And("User is able to see Smart Coupon Expiry Text on Home Page")
    public void verifySmartCouponExpiryTextOnHomePage() {
        if (DriverManagerUtils.configuration.mobilePlatform().equalsIgnoreCase("android")) {
            Assert.assertTrue(homePage.getSmartCouponExpiryText().contains(ApplicationInputs.EXP.getValue()));
        }
    }

    @And("User is able to see Smart Coupon Description Text on SmartCoupon Page")
    @And("User is able to see Smart Coupon Description Text on Home Page")
    public void verifySmartCouponDescriptionTextOnHomePage() {
        if (DriverManagerUtils.configuration.mobilePlatform().equalsIgnoreCase("android")) {
            Assert.assertTrue(homePage.isSmartCouponDescriptionTextPresent());
        }
    }

    @And("User is able to see Smart Coupon Sign In to Clip Coupon Text on Home Page")
    public void verifySmartCouponSignInToClipCouponTextOnHomePage() {
        Assert.assertEquals(homePage.getSignInToClipCouponText(), ApplicationInputs.SIGN_IN_TO_CLIP_COUPON.getValue());
    }

    @And("User clicks Sign In to Clip Coupon button on Home Page")
    public void userClicksSignInToClipCouponButtonOnHomePage() {
        homePage.clickSignInToClipCouponButton();
    }

    @And("User is able to see Clip Coupon text under Trending section")
    @And("User is able to see Smart Coupon Clip Coupon Text on Home Page")
    public void verifySmartCouponClipCouponTextOnHomePage() {
        if (DriverManagerUtils.configuration.mobilePlatform().equalsIgnoreCase("android")) {
            if (homePage.getSignInToClipCouponText().equals(ApplicationInputs.CLIP_COUPON.getValue())) {
                Assert.assertEquals(homePage.getSignInToClipCouponText(), ApplicationInputs.CLIP_COUPON.getValue());
            } else {
                Assert.assertEquals(homePage.getSignInToClipCouponText(), ApplicationInputs.COUPON_CLIPPED.getValue());
            }
        }
    }

    @And("User is able to see No Store Selected text on Home Page")
    public void verifyNoStoreSelectedTextOnHomePage() {
        Assert.assertEquals(homePage.getNoStoreSelectedText(), ApplicationInputs.NO_STORE_SELECTED.getValue());
    }

    @And("User is able to see Your Store text on Home Page")
    public void verifyYourStoreTextOnHomePage() {
        Assert.assertEquals(homePage.getYourStoreText(), ApplicationInputs.YOUR_STORE.getValue());
    }

    @And("User is able to see Select a Store text on Home Page")
    public void verifySelectAStoreTextOnHomePage() {
        Assert.assertEquals(homePage.getSelectAStoreText(), ApplicationInputs.SELECT_A_STORE.getValue());
    }

    @And("User is able to see Change text on Home Page")
    public void verifyChangeTextOnHomePage() {
        Assert.assertEquals(homePage.getChangeStoreText(), ApplicationInputs.CHANGE.getValue());
    }

    @And("User is able to see Select a Store description text on Home Page")
    public void verifySelectAStoreDescriptionTextOnHomePage() {
        Assert.assertEquals(homePage.getSelectAStoreDescriptionText(), ApplicationInputs.SELECT_A_STORE_DESCRIPTION.getValue());
    }

    @And("User is able to see Store address text on Home Page")
    public void verifyStoreAddressTextOnHomePage() {
        Assert.assertTrue(homePage.isStoreAddressPresent());
    }

    @Then("User is able to see Top Categories Header on Home Page")
    public void verifyTopCategoriesHeaderOnHomePage() {
        Assert.assertEquals(homePage.getTopCategoriesText(), ApplicationInputs.TOP_CATEGORIES.getValue());
    }

    @And("User is able to see Top Categories Tile on Home Page")
    public void verifyTopCategoriesTileOnHomePage() {
        Assert.assertTrue(homePage.isTopCategoriesTilePresent());
    }

    @And("User is able to see Explore All Product Categories Title on Home Page")
    public void verifyExploreAllProductCategoriesTitleOnHomePage() {
        Assert.assertEquals(homePage.getExploreAllProductCategoriesText(), ApplicationInputs.EXPLORE_ALL_PRODUCT_CATEGORIES.getValue());
    }

    @And("User clicks Explore All Product Categories Link on Home Page")
    public void userClicksExploreAllProductCategoriesLinkOnHomePage() {
        homePage.clickExploreAllProductCategoriesLink();
    }

    @And("User is able to see Explore All Coupon Categories Title on Home Page")
    public void verifyExploreAllCouponCategoriesTitleOnHomePage() {
        Assert.assertEquals(homePage.getExploreAllCouponCategoriesText(), ApplicationInputs.EXPLORE_ALL_COUPON_CATEGORIES.getValue());
    }

    @And("User clicks Explore All Coupon Categories Link on Home Page")
    public void userClicksExploreAllCouponCategoriesLinkOnHomePage() {
        homePage.clickExploreAllCouponCategoriesLink();
    }

    @And("User is able to see Banner Ad on Home Page")
    public void verifyBannerAdOnHomePage() {
        Assert.assertTrue(homePage.isBannerAdPresent());
    }

    @And("User is able to see Welcome Autumn text on Home Page")
    public void verifyWelcomeAutumnTextOnHomePage() {
        if (DriverManagerUtils.configuration.mobilePlatform().equalsIgnoreCase("android")) {
            if (homePage.getWelcomeAutumnText() == null) {
                homePage.swipeUpLittle();
            }
        }
        Assert.assertTrue(homePage.isWelcomeAutumnPresent());
    }

    @And("User is able to see Welcome Autumn text on Home Page for Guest User")
    public void verifyWelcomeAutumnTextOnHomePageForGuestUser() {
        if (homePage.getWelcomeAutumnText() != null) {
            Assert.assertEquals(homePage.getWelcomeAutumnText(), ApplicationInputs.WELCOME_AUTUMN.getValue());
            scrollDownOneTime();
        } else {
            scrollDownOneTime();
            Assert.assertEquals(homePage.getWelcomeAutumnText(), ApplicationInputs.WELCOME_AUTUMN.getValue());
        }
    }

    @And("User is able to see Product Image on Home Page")
    public void verifyProductImageOnHomePage() {
        if(DriverManagerUtils.configuration.mobilePlatform().equalsIgnoreCase("android")) {
            if (!homePage.isWelcomeAutumnProductImagePresent()
                    && !homePage.isWelcomeAutumnProductEachPresent()) {
                homePage.swipeUpLittle();
            }
            Assert.assertTrue(homePage.isWelcomeAutumnProductImagePresent()
                    && homePage.isWelcomeAutumnProductUSDPresent()
                    && homePage.isWelcomeAutumnProductEachPresent());
        }
    }

    @And("User is able to see Product Description on Home Page")
    public void verifyProductDescriptionOnHomePage() {
        if (DriverManagerUtils.configuration.mobilePlatform().equalsIgnoreCase("android")) {
            if (!homePage.isWelcomeAutumnProductDescriptionPresent()) {
                homePage.swipeUpLittle();
            }
            Assert.assertTrue(homePage.isWelcomeAutumnProductDescriptionPresent());
        }
    }

    @And("User is able to see Instacart Tag on Home Page")
    @And("User is able to see Instacart Tag on More Page")
    public void verifyInstacartTagOnHomePage() {
        if (DriverManagerUtils.configuration.mobilePlatform().equalsIgnoreCase("android")) {
            Assert.assertTrue(homePage.isInstacartTagPresent());
        }
    }

    @And("User is able to see Instacart Title on Home Page")
    @And("User is able to see Instacart Title on More Page")
    public void verifyInstacartTitleOnHomePage() {
        Assert.assertTrue(homePage.isInstacartTitlePresent());
    }

    @And("User is able to see Instacart Sub Title on Home Page")
    @And("User is able to see Instacart Sub Title on More Page")
    public void verifyInstacartSubTitleOnHomePage() {
        Assert.assertTrue(homePage.isInstacartSubTitlePresent());
    }

    @And("User is able to see Instacart Image on Home Page")
    @And("User is able to see Instacart Image on More Page")
    public void verifyInstacartImageOnHomePage() {
        Assert.assertTrue(homePage.isInstacartImagePresent());
    }

    @And("User is able to see {string} header text on Home Page")
    public void verifyHeaderTextOnHomePage(String expectedText) {
        Assert.assertTrue(homePage.getHeaderTextForLoginUser().contains(expectedText));
    }

    @And("User is able to see Ads and Books Image on Ads And Books Page")
    @And("User is able to see Ads and Books Image on Home Page")
    public void verifyAdsAndBooksImageOnHomePage() {
        Assert.assertTrue(homePage.isAdsAndBooksImagePresent());
    }

    @And("User is able to see Ads and Books Title on Ads And Books Page")
    @And("User is able to see Ads and Books Title on Home Page")
    public void verifyAdsAndBooksTitleOnHomePage() {
        if (DriverManagerUtils.configuration.mobilePlatform().equalsIgnoreCase("android")) {
            Assert.assertTrue(homePage.isAdsAndBooksTitlePresent());
        }
    }

    @When("User clicks Select a Store button on Adds And Books Page")
    @When("User clicks Select a Store button on Home Page")
    public void userClicksSelectAStoreButtonOnAddsAndBooksPage() {
        homePage.clickSelectAStoreButton();
    }

    @When("User scroll down little on More page")
    @When("User scroll down little on home page")
    public void userScrollDownLittleOnHomePage() {
        homePage.swipeUpLittle();
    }

    @And("User is able to see Banner Ads Image on Shop Page at the End")
    @And("User is able to see Banner Ads Image on SmartCoupon Page at the End")
    @And("User is able to see Banner Ads Image on Home Page at the End")
    public void userIsAbleToSeeBannerAdsImageOnHomePageAtTheEnd() {
        Assert.assertTrue(homePage.verifyBannerAtEndOfHome());
    }

    @Then("User is able to see Explore button on Global Navigation")
    public void verifyExploreTextOnHomePage() {
        Assert.assertTrue(homePage.isExploreTabPresent());
    }

    @Then("User is able to see Shop button on Global Navigation")
    public void verifyShopTextOnHomePage() {
        Assert.assertTrue(homePage.isShopTabPresent());
    }

    @When("User clicks Shop button on Home Page")
    public void userClicksShopTabOnHomePage() {
        homePage.clickShopTab();
    }

    @Then("User is able to see Cart button on Global Navigation")
    public void verifyCartTextOnHomePage() {
        Assert.assertTrue(homePage.isCartTabPresent());
    }

    @When("User clicks Cart Tab on Home Page")
    public void userClicksCartTabOnHomePage() {
        homePage.clickCartTab();
    }

    @When("User clicks Clipped CTA on Coupons Page")
    public void userClicksClippedCTAOnCouponsPage() {
        homePage.clickClippedCTA();
    }

    @And("User is able to see Trending Smart Coupons label on Home Page")
    public void userIsAbleToSeeTrendingSmartCouponsLabelOnHomePage() {
        Assert.assertEquals(homePage.getTrendingSmartCouponsLabelText(), ApplicationInputs.TRENDING_SMART_COUPONS.getValue() );
    }

    @When("User clicks on View All CTA button on Home Page")
    public void userClicksOnViewAllCTAButtonOnHomePage() {
        homePage.clickViewAllCTALink();
    }

    @And("User will see {string} on home page")
    public void isExploreProductButtonVisible(String text) {
        Assert.assertTrue(homePage.isTextVisible(text));
    }
}
