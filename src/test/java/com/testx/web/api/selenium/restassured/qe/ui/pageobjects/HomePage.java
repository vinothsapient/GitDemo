package com.testx.web.api.selenium.restassured.qe.ui.pageobjects;

import com.testx.web.api.selenium.restassured.qe.ui.context.TestContext;
import com.testx.web.api.selenium.restassured.qe.ui.stepdefinitions.BaseSetup;
import com.testx.web.api.selenium.restassured.qe.ui.webdriver.DriverManagerUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage extends BaseSetup {

    public HomePage(TestContext testContext) {
        super(testContext);
        PageFactory.initElements(testContext.getDriverManager().getDriver(), this);
    }

    @FindBy(xpath = "//*[contains(@class,'widget.TextView')] | //XCUIElementTypeOther[contains(@name,'')]")
    protected static List<WebElement> btnWebElements;

    @FindBy(xpath = "//*[@resource-id='Tab:Home']//android.widget.TextView | //*[@name='Tab:Home']")
    protected static WebElement homeTab;

    @FindBy(xpath = "//*[@resource-id='storeSelectedBanner:TestID'] | //*[@name='Your Store']")
    protected static WebElement storeDetails;

    @FindBy(xpath = "//*[@resource-id='Tab:AdsAndBooks'] | //*[@name='Tab:AdsAndBooks']")
    protected static WebElement adsAndBooksTab;

    @FindBy(xpath = "//*[@resource-id='Tab:Coupons'] | //*[@name='Tab:Coupons']")
    protected static WebElement couponsTab;

    @FindBy(xpath = "//*[@resource-id='SmartCouponHeader:link'] | //*[@name='Show All']")
    protected static WebElement btnShowAll;

    @FindBy(xpath = "(//*[@resource-id='CouponInfo: ProductNameTestID'])[1] | //*[@name='Tab:Coupons']")
    protected static WebElement btnFirstCoupon;

    @FindBy(xpath = "//*[@resource-id='RefreshSection:RefreshButton'] | //*[@name='Refresh']")
    protected static WebElement btnRefresh;

    @FindBy(xpath = "//android.view.ViewGroup[@resource-id='SearchCoupons:TopTabs']//*[contains(@resource-id,'Clipped')]")
    protected static WebElement clippedTab;

    @FindBy(xpath = "//*[@resource-id='ExpiredRedeemSection:ExpiredUsedText'] | //*[@name='Expired & Unused Coupons']")
    protected static WebElement expiredUsedCouponsTab;

    @FindBy(xpath = "//*[@resource-id='ExpiredRedeemSection:RedeemText'] | //*[@name='Redeemed Coupons']")
    protected static WebElement redeemedCouponsTab;

    @FindBy(xpath = "//*[@resource-id='Tab:MyAccount']//android.widget.TextView | //*[@name='Tab:MyAccount']")
    protected static WebElement accountTab;

    @FindBy(xpath = "//*[@resource-id='undefined:SectionList:LabelTitle'] | //*[@name='Visit Site']")
    protected static WebElement visitSite;

    @FindBy(xpath = "//*[@resource-id='Help Link'] | //*[@name='Help Link']")
    protected static WebElement helpTap;

    @FindBy(xpath = "//*[@resource-id='Terms & Conditions Link'] | //*[@name='Terms & Conditions Link']")
    protected static WebElement termsCondition;

    @FindBy(xpath = "//*[@resource-id='Smart Coupons® Terms Link'] | //*[@name='Smart Coupons® Terms Link']")
    protected static WebElement smartCoupons;

    @FindBy(xpath = "//*[@resource-id='Coupon Policy Link'] | //*[@name='Coupon Policy Link']")
    protected static WebElement couponsPolicy;

    @FindBy(xpath = "//*[@resource-id='California Information Sharing Disclosure Link'] | //*[@name='California Information Sharing Disclosure Link']")
    protected static WebElement californiaInformation;

    @FindBy(xpath = "//*[@resource-id='Privacy Policy Link'] | //*[@name='Privacy Policy Link']")
    protected static WebElement privacyPolicy;

    @FindBy(xpath = "//*[@resource-id='undefined:SectionList:LabelTitle'] | //*[@name='Contact Us Link']")
    protected static WebElement contactUs;

    @FindBy(xpath = "//*[@resource-id='undefined:SectionList:LabelTitle'] | //*[@name='FAQs Link']")
    protected static WebElement FAQs;

    @FindBy(xpath = "//*[@resource-id='AvailableCoupon:ButtonText'] | //android.widget.Button[@content-desc='Click on Clip Coupon Button']/android.widget.TextView")
    protected static WebElement clickLogInClipCoupon;

    @FindBy(xpath = "//*[@resource-id='AvailableCoupon:ButtonText'] | //*[@name='Clip Coupon']")
    protected static WebElement clipCoupon;

    @FindBy(xpath = "//*[@resource-id='Tab:More'] | //*[@name='Tab:More']")
    protected static WebElement moreTab;

    @FindBy(xpath = "//*[@resource-id='PlpIdleSearch:myStoreDetails'] | //*[@name='View My Store Details']")
    protected static WebElement viewStoreDetailsTab;

    @FindBy(xpath = "(//*[@resource-id='FDRowView:Title'])[7] | //*[@name='Food & Beverages']")
    protected static WebElement firstProduct;

    @FindBy(xpath = "(//*[@resource-id='FDRowView:Title'])[2] | //*[@name='Condiments & Garnishes']")
    protected static WebElement subProduct;

    @FindBy(xpath = "(//*[@content-desc='Product Img'])[1]")
    protected static WebElement firstSearchElement;

    @FindBy(xpath = "(//*[contains(@resource-id,'ProductTile:touchableFeedbackTestID')])[1]")
    protected static WebElement btnProduct;

    @FindBy(xpath = "//*[@content-desc='Tide Detergent Pods, 16 ct.']")
    protected static WebElement firstProductElement;

    @FindBy(xpath = "//*[@resource-id='Header:GuestTitle'] | //*[@name='Header:GuestTitle']")
    protected static WebElement guestTitle;

    @FindBy(xpath = "//*[@resource-id='Header:GuestSubTitle'] | //*[@name='Header:GuestSubTitle']")
    protected static WebElement guestSubTitle;

    @FindBy(xpath = "//*[@resource-id='HeaderLoginTitle:Login']//android.widget.TextView | //*[@name='HeaderLoginTitle:Login']")
    protected static WebElement loginTitle;

    @FindBy(xpath = "//*[@resource-id='HeaderCreateAccountTitle:CreateAccount']//android.widget.TextView | //*[@name='HeaderCreateAccountTitle:CreateAccount']")
    protected static WebElement createAccountTitle;

    @FindBy(xpath = "//*[@resource-id='FDCarousel:TestID'] | (//*[@name='FDCarousel:TestID'])[1]")
    protected static WebElement bannerAds;

    @FindBy(xpath = "//*[@content-desc='Sponsored'] | //*[@name='Sponsored']")
    protected static WebElement sponsoredLabel;

    @FindBy(xpath = "//*[@resource-id='dotsRender:TestID'] | (//*[@name='dotsRender:TestID'])[1] | //*[@name='FDCarousel:TestID'] | (//*[@name='dotsRender:TestID'])[3]")
    protected static WebElement indicatorsAssociatedToTheCarousel;

    @FindBy(xpath = "//*[@resource-id='SmartCouponHeader:titleTestID'] | //*[@name='SmartCouponHeader:title'] | //*[@name='SmartCouponHeader:titleTestID'] | //*[@label='Trending Smart Coupons®']")
    protected static WebElement smartCouponTitle;

    @FindBy(xpath = "//*[@resource-id='SmartCouponHeader:linkTestID'] | //*[@name='SmartCouponHeader:link'] | //*[@name='SmartCouponHeader:linkTestID']")
    protected static WebElement smartCouponLink;

    @FindBy(xpath = "//*[@resource-id='AvailableCoupon:LeftTagImage'] | //*[@name='SmartCouponHeader:titleTestID']")
    protected static WebElement smartCouponTag;

    @FindBy(xpath = "//*[@resource-id='AvailableCoupon:MainImage'] | (//*[@name='AvailableCoupon:MainContainer'])[1]")
    protected static WebElement smartCouponMainImage;

    @FindBy(xpath = "//*[@resource-id='AvailableCoupon:DiscountText'] | (//*[@name='AvailableCoupon:navigateToDetails'])[1]")
    protected static WebElement smartCouponDiscountLabel;

    @FindBy(xpath = "//*[@resource-id='AvailableCoupon:TitleText'] | (//*[@name='AvailableCoupon:navigateToDetails'])[1]")
    protected static WebElement smartCouponTitleText;

    @FindBy(xpath = "//*[@resource-id='AvailableCoupon:ExpiryText'] | (//*[@name='AvailableCoupon:navigateToDetails'])[1]")
    protected static WebElement smartCouponExpiryText;

    @FindBy(xpath = "//*[@resource-id='AvailableCoupon:Description'] | (//*[@name='AvailableCoupon:navigateToDetails'])[1]")
    protected static WebElement smartCouponDescription;

    @FindBy(xpath = "//*[@resource-id='AvailableCoupon:CouponButton']//android.widget.TextView | //*[@name='Click on Clip Coupon Button'] | //*[@name='Coupon Clipped Button'] | //*[@name='Sign In to Clip Coupon']")
    protected static WebElement smartCouponClipButton;

    @FindBy(xpath = "//*[@resource-id='NoStoreSelectedBannerHomeScreenHeader:TestID'] | //*[@name='NoStoreSelectedBannerHomeScreenHeader:TestID']")
    protected static WebElement noStoreSelected;

    @FindBy(xpath = "//*[@resource-id='NoStoreSelectedBannerHomeScreenLinkHeader:TestID'] | //*[@name='NoStoreSelectedBannerHomeScreenLinkHeader:TestID']")
    protected static WebElement selectAStore;

    @FindBy(xpath = "//*[@resource-id='NoStoreSelectedBannerHomeScreenText:TestID'] | //*[@name='NoStoreSelectedBannerHomeScreenText:TestID']")
    protected static WebElement selectAStoreDescription;

    @FindBy(xpath = "//*[@resource-id='StoreSelectedBannerHomeScreenHeader:TestId'] | //*[@name='StoreSelectedBannerHomeScreenHeader:TestId']")
    protected static WebElement yourStore;

    @FindBy(xpath = "//*[@resource-id='StoreSelectedBannerHomeScreenLinkHeader:TestId'] | //*[@name='StoreSelectedBannerHomeScreenLinkHeader:TestId']")
    protected static WebElement changeStore;

    @FindBy(xpath = "//*[@resource-id='StoreSelectedBannerHomeScreenAddress:TestId'] | //*[@name='StoreSelectedBannerHomeScreenAddress:TestId']")
    protected static WebElement storeAddress;

    @FindBy(xpath = "//*[@resource-id='TopCategories:Header'] | //*[@name='TopCategories:Header']")
    protected static WebElement topCategoriesHeader;

    @FindBy(xpath = "//*[@resource-id='TopCategories:CategoryTile'] | //*[@name='TopCategories:Header' and @label='Top Categories']")
    protected static WebElement topCategoriesTile;

    @FindBy(xpath = "//android.widget.TextView[@content-desc='Explore All Product Categories'] | (//*[@name='TopCategoryExploreView:MainView'])[1]")
    protected static WebElement exploreAllProductCategories;

    @FindBy(xpath = "//android.widget.TextView[@content-desc='Explore All Coupon Categories'] | (//*[@name='TopCategoryExploreView:MainView'])[2]")
    protected static WebElement exploreAllCouponCategories;

    @FindBy(xpath = "//*[@resource-id='Home:BannerAd'] | //*[@name='Home:BannerAd']")
    protected static WebElement bannerAd;

    @FindBy(xpath = "//*[@resource-id='productTileHomeComponentHeader:TestID'] | //*[@name='productTileHomeComponentHeader:TestID']")
    protected static WebElement welcomeAutumn;

    @FindBy(xpath = "//*[@resource-id='productImage:TestID'] | //*[@name='productImage:TestID']")
    protected static WebElement welcomeAutumnProductImage;

    @FindBy(xpath = "//*[@content-desc='USDDollar'] | //*[@name='USDDollar']")
    protected static WebElement welcomeAutumnProductUSD;

    @FindBy(xpath = "//*[@content-desc='each'] | //*[@name='each']")
    protected static WebElement welcomeAutumnProductEach;

    @FindBy(xpath = "//*[@resource-id='productDescriptionText:TestID'] | //*[@name='productDescriptionText:TestID']")
    protected static WebElement welcomeAutumnProductDescription;

    @FindBy(xpath = "//*[@resource-id='InstaCartComponent:instaCart']//android.widget.ImageView | //*[@name='Get Same-Day Delivery via Instacart']/XCUIElementTypeOther/XCUIElementTypeImage")
    protected static WebElement instacartTag;

    @FindBy(xpath = "//*[@resource-id='InstaCartComponent:Title'] | //*[@name='InstaCartComponent:Title']")
    protected static WebElement instacartTitle;

    @FindBy(xpath = "//*[@resource-id='InstaCartComponent:SubTitle'] | //*[@name='InstaCartComponent:SubTitle']")
    protected static WebElement instacartSubTitle;

    @FindBy(xpath = "//*[@content-desc='Accessibility compliant text describing the image'] | //*[@name='Accessibility compliant text describing the image']")
    protected static WebElement instacartImage;

    @FindBy(xpath = "//*[@text='sameday.familydollar.com'] | //XCUIElementTypeButton[@name='URL']")
    protected static WebElement instacartWebView;

    @FindBy(xpath = "//*[@resource-id='com.android.chrome:id/close_button'] | //XCUIElementTypeButton[@name='Done']")
    protected static WebElement instacartWebCloseButton;

    @FindBy(xpath = "//*[@resource-id='Header:Title'] | //*[@name='Header:Title']")
    protected static WebElement headerTitleForLoginUser;

    @FindBy(xpath = "//*[@resource-id='FDAdRowView:LeftView'] | //*[@name='FDAdRowView:ListItemView']")
    protected static WebElement adsAndBooksImage;

    @FindBy(xpath = "//*[@resource-id='FDAdRowView:Title'] | //*[@name='FDAdRowView:Title']")
    protected static WebElement adsAndBooksTitle;

    @FindBy(xpath = "//*[@resource-id='BannerImageTestID'] | //*[contains(@name,'BannerAdClickTestID')]")
    protected static WebElement endBannerImage;

    @FindBy(xpath = "//*[@resource-id='Tab:Explore']//android.widget.TextView | //*[@name='Tab:Explore']")
    protected static WebElement exploreTab;

    @FindBy(xpath = "//*[@resource-id='Tab:Shop']//android.widget.TextView | //*[@name='Tab:Shop']")
    protected static WebElement shopTab;

    @FindBy(xpath = "//*[@resource-id='Tab:Cart']//android.widget.TextView | //*[@name='Tab:Cart']")
    protected static WebElement cartTab;

    @FindBy(xpath = "//android.widget.TextView[contains(@content-desc,'Clipped')] | //XCUIElementTypeButton[contains(@name,'Clipped')]")
    protected static WebElement clippedCTA;

    @FindBy(xpath = "//*[@resource-id='SmartCouponHeader:titleTestID'] | //*[@name = 'SmartCouponHeader:titleTestID']")
    protected static WebElement trendingSmartCouponsLabel;

    @FindBy(xpath = "//*[@content-desc='View All'] | //*[@name='SmartCouponHeader:linkTestID']")
    protected static WebElement ViewAllCTA;

    public boolean isElementPresent(String buttonName) {
        return driverManagerUtils.isTextDisplayed(btnWebElements, buttonName);
    }

    public void clickButton(String buttonName) {
        driverManagerUtils.clickByLabel(btnWebElements, buttonName);
    }

    public void clickAccountTab() {
        driverManagerUtils.clickElement(accountTab);
    }

    public void clickVisitSite() {
        driverManagerUtils.clickElement(visitSite);
    }

    public void clickHelp() {
        driverManagerUtils.clickElement(helpTap);
    }

    public void clickTermsCondition() {
        driverManagerUtils.clickElement(termsCondition);
    }

    public void clickSmartCoupons() {
        driverManagerUtils.clickElement(smartCoupons);
    }

    public void clickCouponsPolicy() {
        driverManagerUtils.clickElement(couponsPolicy);
    }

    public void clickCaliforniaInformation() {
        driverManagerUtils.clickElement(californiaInformation);
    }

    public void clickPrivacyPolicy() {
        driverManagerUtils.clickElement(privacyPolicy);
    }
    public void clickContactUs() {
        driverManagerUtils.clickElement(contactUs);
    }

    public void clickFAQs() {
        driverManagerUtils.clickElement(FAQs);
    }

    public void clickLogInClipCoupon() {
        driverManagerUtils.clickElement(clickLogInClipCoupon);
    }

    public void clickClipCoupon() {
        driverManagerUtils.clickElement(clipCoupon);
    }

    public void clickTab(String tabName) {
        driverManagerUtils.clickElement( driver.findElement(By.xpath("//*[@resource-id='Tab:"+tabName+"'] | //*[@name='Tab:"+tabName+"']")));
    }

    public void clickHomeTab() {
        driverManagerUtils.clickElement(homeTab);
    }

    public void clickAdsAndBooksTab() {
        driverManagerUtils.clickElement(adsAndBooksTab);
    }

    public void clickCouponsTab() {
        driverManagerUtils.clickElement(couponsTab);
    }

    public void clickShowAllButton() {
        driverManagerUtils.clickElement(btnShowAll);
    }

    public void clickCoupon() {
        driverManagerUtils.clickElement(btnFirstCoupon);
    }

    public void clickRefreshButton() {
        driverManagerUtils.clickElement(btnRefresh);
    }
    public void clickClippedTab() {
        driverManagerUtils.clickElement(clippedTab);
    }
    public void clickExpiredUnusedCouponsTab() {
        driverManagerUtils.clickElement(expiredUsedCouponsTab);
    }

    public void clickRedeemedCouponsTab() {
        driverManagerUtils.clickElement(redeemedCouponsTab);
    }

    public void clickMoreTab() {
        driverManagerUtils.clickElement(moreTab);
    }

    public void clickViewMyStoreDetails() {
        driverManagerUtils.clickElement(viewStoreDetailsTab);
    }

    public void clickSubProduct() {
        driverManagerUtils.clickElement(subProduct);
    }

    public void clickFirstProduct() {
        driverManagerUtils.clickElement(firstProduct);
    }
    public void clickExploreButton(String name){
        driver.findElement(By.xpath("//android.widget.TextView[@content-desc='Explore All "+name+" Categories']")).click();
    }

    public boolean isHomeTabTextDisplayed() {
        return driverManagerUtils.isElementDisplayed(homeTab);
    }

    public boolean isStoreDetailsPresent() {
        return driverManagerUtils.isElementDisplayed(storeDetails);
    }

    public boolean isAdsAndBooksTabPresent() {
        return driverManagerUtils.isElementDisplayed(adsAndBooksTab);
    }

    public boolean isCouponTabPresent() {
        return driverManagerUtils.isElementDisplayed(couponsTab);
    }

    public boolean isAccountTabPresent() {
        return driverManagerUtils.isElementDisplayed(accountTab);
    }

    public boolean isMoreTabPresent() {
        return driverManagerUtils.isElementDisplayed(moreTab);
    }

    public boolean isBannerAdsPresent() {
            return driverManagerUtils.isElementDisplayed(bannerAds);
    }

    public void clickBannerAds() {
        driverManagerUtils.clickElement(bannerAds);
    }

    public String getSponsoredLabelText() {
        return driverManagerUtils.getElementText(sponsoredLabel);
    }

    public boolean isIndicatorsAssociatedToTheCarouselPresent() {
        return driverManagerUtils.isElementDisplayed(indicatorsAssociatedToTheCarousel);
    }

    public void clickProduct() {
        driverManagerUtils.clickElement(btnProduct);
    }

    public void openFirstProduct() {
        driverManagerUtils.clickElement(firstProductElement);
    }

    public boolean isFirstElementPresent() {
        return driverManagerUtils.isElementDisplayed(firstSearchElement);
    }

    public void clickInstacartBanner() {
        driverManagerUtils.clickElement(instacartTitle);
    }

    public void clickInstacartCloseButton() {
        driverManagerUtils.clickElement(instacartWebCloseButton);
    }

    public boolean isInstacartWebPageVisible(){
        return  driverManagerUtils.isElementDisplayed(instacartWebView);
    }

    public void DragAndDrop(){
        driverManagerUtils.dragAndDropBasedOnPointers();
    }

    public String getGuestTitleText() {
        return driverManagerUtils.getElementText(guestTitle);
    }

    public String getGuestSubTitleText() {
        return driverManagerUtils.getElementText(guestSubTitle);
    }

    public String getHeaderLoginTitleText() {
        return driverManagerUtils.getElementText(loginTitle);
    }

    public void clickLoginButton() {
        driverManagerUtils.clickElement(loginTitle);
    }

    public String getHeaderCreateAccountTitleText() {
        return driverManagerUtils.getElementText(createAccountTitle);
    }

    public void clickCreateAccountButton() {
        driverManagerUtils.clickElement(createAccountTitle);
    }

    public String getHeaderSmartCouponTitleText() {
        return driverManagerUtils.getElementText(smartCouponTitle);
    }

    public String getHeaderSmartCouponLinkText() {
        return driverManagerUtils.getElementText(smartCouponLink);
    }

    public void clickAllCouponLink() {
        driverManagerUtils.clickElement(smartCouponLink);
    }

    public boolean isSmartCouponTagPresent() {
        DriverManagerUtils.sleep(2);
        return driverManagerUtils.isElementDisplayed(smartCouponTag);
    }

    public boolean isSmartCouponImagePresent() {
        return driverManagerUtils.isElementDisplayed(smartCouponMainImage);
    }

    public boolean isSmartCouponDiscountLabelDisplayed() {
        return driverManagerUtils.isElementDisplayed(smartCouponDiscountLabel);
    }

    public boolean isSmartCouponTitleTextPresent() {
        return driverManagerUtils.isElementDisplayed(smartCouponTitleText);
    }

    public String getSmartCouponExpiryText() {
        return driverManagerUtils.getElementText(smartCouponExpiryText);
    }

    public boolean isSmartCouponDescriptionTextPresent() {
        return driverManagerUtils.isElementDisplayed(smartCouponDescription);
    }

    public String getSignInToClipCouponText() {
        return driverManagerUtils.getElementText(smartCouponClipButton).trim();
    }

    public void clickSignInToClipCouponButton() {
        if (DriverManagerUtils.configuration.mobilePlatform().equalsIgnoreCase("ios")) {
            swipeUpLittle();
        }
        driverManagerUtils.clickElement(smartCouponClipButton);
    }

    public String getNoStoreSelectedText() {
        return driverManagerUtils.getElementText(noStoreSelected);
    }

    public String getSelectAStoreText() {
        return driverManagerUtils.getElementText(selectAStore);
    }

    public String getSelectAStoreDescriptionText() {
        return driverManagerUtils.getElementText(selectAStoreDescription);
    }

    public String getYourStoreText() {
        return driverManagerUtils.getElementText(yourStore);
    }

    public String getChangeStoreText() {
        return driverManagerUtils.getElementText(changeStore);
    }

    public boolean isStoreAddressPresent() {
            return driverManagerUtils.isElementDisplayed(storeAddress);
    }

    public String getTopCategoriesText() {
        return driverManagerUtils.getElementText(topCategoriesHeader);
    }

    public boolean isTopCategoriesTilePresent() {
        return driverManagerUtils.isElementDisplayed(topCategoriesTile);
    }

    public String getExploreAllProductCategoriesText() {
        return driverManagerUtils.getElementText(exploreAllProductCategories);
    }

    public void clickExploreAllProductCategoriesLink() {
        driverManagerUtils.clickElement(exploreAllProductCategories);
    }

    public String getExploreAllCouponCategoriesText() {
        return driverManagerUtils.getElementText(exploreAllCouponCategories);
    }

    public void clickExploreAllCouponCategoriesLink() {
        driverManagerUtils.clickElement(exploreAllCouponCategories);
    }

    public boolean isBannerAdPresent() {
        return driverManagerUtils.isElementDisplayed(bannerAd);
    }

    public String getWelcomeAutumnText() {
        return driverManagerUtils.getElementText(welcomeAutumn);
    }

    public boolean isWelcomeAutumnPresent() {
        return driverManagerUtils.isElementDisplayed(welcomeAutumn);
    }

    public boolean isWelcomeAutumnProductImagePresent() {
        return driverManagerUtils.isElementDisplayed(welcomeAutumnProductImage);
    }

    public boolean isWelcomeAutumnProductUSDPresent() {
        return driverManagerUtils.isElementDisplayed(welcomeAutumnProductUSD);
    }

    public boolean isWelcomeAutumnProductEachPresent() {
        return driverManagerUtils.isElementDisplayed(welcomeAutumnProductEach);
    }

    public boolean isWelcomeAutumnProductDescriptionPresent() {
        return driverManagerUtils.isElementDisplayed(welcomeAutumnProductDescription);
    }

    public boolean isInstacartTagPresent() {
        return driverManagerUtils.isElementDisplayed(instacartTag);
    }

    public boolean isInstacartTitlePresent() {
        return driverManagerUtils.isElementDisplayed(instacartTitle);
    }

    public boolean isInstacartSubTitlePresent() {
        return driverManagerUtils.isElementDisplayed(instacartSubTitle);
    }

    public boolean isInstacartImagePresent() {
        return driverManagerUtils.isElementDisplayed(instacartImage);
    }

    public String getHeaderTextForLoginUser() {
        return driverManagerUtils.getElementText(headerTitleForLoginUser);
    }

    public boolean isAdsAndBooksImagePresent() {
        return driverManagerUtils.isElementDisplayed(adsAndBooksImage);
    }

    public boolean isAdsAndBooksTitlePresent() {
        return driverManagerUtils.isElementDisplayed(adsAndBooksTitle);
    }

    public void clickSelectAStoreButton() {
        driverManagerUtils.clickElement(selectAStore);
    }


    public void swipeUpLittle() {
        driverManagerUtils.dragAndDropBasedOnPointersLittleDistance();
    }

    public boolean verifyBannerAtEndOfHome() {
        return driverManagerUtils.isElementDisplayed(endBannerImage);
    }

    public boolean isExploreTabPresent() {
        return driverManagerUtils.isElementDisplayed(exploreTab);
    }

    public boolean isShopTabPresent() {
        return driverManagerUtils.isElementDisplayed(shopTab);
    }

    public void clickShopTab() {
        driverManagerUtils.clickElement(shopTab);
    }

    public boolean isCartTabPresent() {
        return driverManagerUtils.isElementDisplayed(cartTab);
    }

    public void clickCartTab() {
        driverManagerUtils.clickElement(cartTab);
    }

    public void clickClippedCTA() {
        driverManagerUtils.clickElement(clippedCTA);
    }

    public String getTrendingSmartCouponsLabelText() {
        return driverManagerUtils.getElementText(trendingSmartCouponsLabel);
    }
    public void clickViewAllCTALink() {driverManagerUtils.clickElement(ViewAllCTA);
    }
    public boolean isTextVisible(String text) {
        WebElement webElement = driver.findElement(
                By.xpath("//android.widget.TextView[@content-desc='" + text + "'] " +
                        " | //XCUIElementTypeStaticText[@name='" + text + "'] " +
                        " | //XCUIElementTypeOther[@name='" + text + "']" +
                        " |//XCUIElementTypeStaticText[@name='SmartCouponHeader:linkTestID']"));
        driverManagerUtils.scrollToElement(webElement);
        return driverManagerUtils.isElementDisplayed(webElement);
    }
}
