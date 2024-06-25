package com.testx.web.api.selenium.restassured.qe.ui.pageobjects;

import com.testx.web.api.selenium.restassured.qe.common.utils.TestVariables;
import com.testx.web.api.selenium.restassured.qe.ui.context.TestContext;
import com.testx.web.api.selenium.restassured.qe.ui.enums.ApplicationInputs;
import com.testx.web.api.selenium.restassured.qe.ui.stepdefinitions.BaseSetup;
import com.testx.web.api.selenium.restassured.qe.ui.webdriver.DriverManagerUtils;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SmartCouponsPage extends BaseSetup {

    @FindBy(xpath = "//*[contains(@class,'widget.TextView')] | //*[contains(@name,'')]")
    protected static List<WebElement> btnWebElements;

    @FindBy(xpath = "//*[@content-desc='Smart Coupons®'] | //*[@label='Smart Coupons®']")
    protected static WebElement smartCouponPageHeader;
    @FindBy(xpath = "//*[@resource-id='couponTile:ShareCouponButton'] | (//*[@label='Share Button'])[3]")
    protected static WebElement shareIcon;

    @FindBy(xpath = "//*[@resource-id='SmartCouponHeader:title'] | //*[@name='SmartCouponHeader:title']")
    protected static WebElement relatedSmartCoupon;

    @FindAll(@FindBy(xpath = "//*[@resource-id='List:Component']/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup"))
    protected static List<WebElement> searchDropDownItems;

    @FindBy(xpath = "//*[@resource-id='FDPlpSearchHeader:searchInput'] | //*[@name='Search for Coupons']")
    protected static WebElement searchBox;

    @FindAll(@FindBy(xpath = "//android.widget.TextView[@Resource-Id='CouponInfo: ProductNameTestID']"))
    protected static List<WebElement> listCoupons;

    @FindAll(@FindBy(xpath = "//android.view.ViewGroup[@content-desc='Coupon View']"))
    protected static List<WebElement> couponView;

    @FindBy(xpath = "//*[@resource-id='FDPlpSearchHeader:searchBar']//com.horcrux.svg.SvgView | //*[@name='FDPlpSearchHeader:searchBar']//XCUIElementTypeOther")
    protected static WebElement searchIcon;

    @FindBy(xpath = "//*[@resource-id='FDPlpSearchHeader:scan'] | //*[@name='FDPlpSearchHeader:scan']")
    protected static WebElement couponScanner;

    @FindBy(xpath = "//android.view.ViewGroup[@content-desc='Click on Explore All Suggested Coupons']/android.view.ViewGroup")
    protected static WebElement SmartCouponPageLink;

    @FindBy(xpath = "//*[@resource-id='FDPlpSearchHeader:cancel']//android.widget.TextView | //*[@name='FDPlpSearchHeader:cancel']")
    public static WebElement cancelLink;

    @FindBy(xpath = "//android.view.ViewGroup[@content-desc='Coupon View'] ")
    public static WebElement ForYouCoupons;

    @FindBy(xpath = "//*[@resource-id='FDPlpSearchHeader:backIcon'] | //*[@name='FDPlpSearchHeader:backIcon']")
    public static WebElement couponBackButton;

    @FindBy(xpath = "//*[@resource-id='PlpNoItems:SearchIcon']//com.horcrux.svg.SvgView | //*[@name='PlpNoItems:SearchIcon']")
    public static WebElement searchIconInBody;

    @FindBy(xpath = "//*[@resource-id='PlpNoItems:Title'] | //*[@name='PlpNoItems:Title']")
    public static WebElement noCoupons;

    @FindBy(xpath = "//*[@resource-id='PlpNoItems:Message'] | //*[@name='PlpNoItems:Message']")
    public static WebElement noItemsMessage;

    @FindBy(xpath = "//*[@resource-id='PlpNoItems:Button']//android.widget.TextView | //*[@name='PlpNoItems:Button']")
    public static WebElement exploreButton;

    @FindBy(xpath = "//*[@resource-id='PlpNoItems:ScanIcon'] | //*[@name='PlpNoItems:ScanIcon']")
    public static WebElement scannerButton;

    @FindBy(xpath = "//android.view.ViewGroup[@content-desc='Clear Search'] | //XCUIElementTypeOther[@name='FDPlpSearchHeader:clearSearch']")
    public static WebElement clearSearch;

    @FindBy(xpath = " //android.widget.TextView[@content-desc='All Suggested Coupons For You']")
    protected static WebElement isCouponExplorePage;

    @FindBy(xpath = "//*[@resource-id='MyBarCode:RedeemCoupons']//android.widget.TextView | //*[@name='MyBarCode:RedeemCoupons']")
    protected static WebElement btnRedeemCoupons;

    @FindBy(xpath = "//*[@resource-id='MyBarCode:HeaderIcon'] | //*[@name='MyBarCode:HeaderIcon']")
    protected static WebElement barcodeHeaderIcon;

    @FindBy(xpath = "//*[@resource-id='MyBarCode:BarcodeTitle'] | //*[@name='MyBarCode:BarcodeTitle']")
    protected static WebElement barcodeTitle;

    @FindBy(xpath = "//*[@resource-id='MyBarCode:CrossButton'] | //*[@name='MyBarCode:CrossButton']")
    protected static WebElement btnBarcodeClose;

    @FindBy(xpath = "//*[@resource-id='DisplayBarcode:ClippedAmount'] | //XCUIElementTypeStaticText[@name='DisplayBarcode:ClippedAmount']")
    protected static WebElement clippedAmount;

    @FindBy(xpath = "//*[@resource-id='DisplayBarcode:ClippedCoupons'] | //XCUIElementTypeStaticText[@name='DisplayBarcode:ClippedCoupons']")
    protected static WebElement clippedCoupons;

    @FindBy(xpath = "//*[@resource-id='DisplayBarcode:BarcodeImage'] | //XCUIElementTypeOther[@name='DisplayBarcode:BarcodeImage']")
    protected static WebElement barcodeImage;

    @FindBy(xpath = "//*[@resource-id='DisplayBarcode:InstructionText'] | //*[@name='DisplayBarcode:InstructionText']")
    protected static List<WebElement> displayBarcodeInstructionText;

    @FindBy(xpath = "//*[@resource-id='For You']//android.widget.TextView | //*[@name='For You:container']")
    protected static WebElement forYouListedCouponSection;

    @FindBy(xpath = "//*[@resource-id='Recommended']//android.widget.TextView | //*[@name='Recommended:container']")
    protected static WebElement recommendedCouponSection;

    @FindBy(xpath = "//*[@resource-id='SmartCouponHeader:titleTestID'] | //*[@name = 'SmartCouponHeader:titleTestID']")
    protected static WebElement trendingLabel;

    @FindBy(xpath = "//*[@resource-id='SmartCouponHeader:linkTestID'] | //*[@name = 'SmartCouponHeader:linkTestID']")
    protected static WebElement viewAllLink;

    @FindBy(xpath = "//*[@resource-id='All']//android.widget.TextView | //*[@name='All:container']")
    protected static WebElement allListedCouponSection;

    @FindBy(xpath = "//*[contains(@resource-id,'Clipped')] | //*[contains(@name,'Clipped')]")
    protected static WebElement clippedListedCouponSection;

    @FindBy(xpath = "//*[@content-desc='Expiring Soon']/android.widget.TextView | //*[@name='Expiring Soon:container']")
    protected static WebElement ExpiringSoonSection;

    @FindBy(xpath = "//*[@resource-id='CouponsForYou:Title'] | //*[@name='CouponsForYou:Title']")
    protected static WebElement smartCouponsForYouTitle;

    @FindBy(xpath = "//*[@resource-id='Wallet:yearlyClipped'] | //*[@name='Wallet:yearlyClipped'] | //*[contains(@name,'info button')]")
    protected static WebElement yearlyClipped;

    @FindBy(xpath = "(//*[@resource-id='countTestID'])[1] | //*[@name='Expired & Unused Coupons']")
    protected static WebElement expiredAndUnusedCouponsSection;

    @FindBy(xpath = "//*[@resource-id='Wallet:clippedValue'] | //*[@name='Wallet:clippedValue']")
    protected static WebElement clippedValue;

    @FindBy(xpath = "//*[@resource-id='Wallet:Max'] | //*[@name='Wallet:Max']")
    protected static WebElement maxClippedValue;

    @FindBy(xpath = "//*[@resource-id='CouponsCategories:AllCoupons'] | //*[@name='CouponsCategories:AllCoupons']")
    protected static WebElement allCouponsLink;

    @FindBy(xpath = "//*[@content-desc='Coupons category Image'] | //*[@name='CouponsCategories:CategoriesList'] | //*[@name='CouponsCategories:CategoryTile:Food & Beverages CouponsCategories:CategoryTile:Beauty CouponsCategories:CategoryTile:Personal Care CouponsCategories:CategoryTile:Cleaning']")
    protected static WebElement allCategories;

    @FindBy(xpath = "//*[@content-desc='Coupons category Image'] | //*[@name='CouponsCategories:CategoryTile:Food & Beverages CouponsCategories:CategoryTile:Beauty CouponsCategories:CategoryTile:Personal Care CouponsCategories:CategoryTile:Cleaning']")
    protected static List<WebElement> categoriesList;

    @FindBy(xpath = "//*[@content-desc='Explore By Category'] | //*[@name='Explore By Category']")
    protected static WebElement exploreByCategoryText;

    @FindBy(xpath = "//*[@resource-id='CouponsCategories:CategoryTile:Food & Beverages'] | //*[@name='CouponsCategories:CategoryTile:Food & Beverages']")
    protected static WebElement foodAndBeveragesCategory;

    @FindBy(xpath = "//*[@content-desc='Explore via Ads & Books'] | //*[@name='FDRowView:MainView']")
    protected static WebElement exploreViaAdsAndBooks;

    @FindBy(xpath = "//*[@resource-id='CouponListingHeader:TestID'] | //*[@name='CouponListingHeader:TestID']")
    protected static WebElement redeemedCouponsHeaderText;

    @FindBy(xpath = "//*[@resource-id='selectedSortOption'] | //*[@name='SortClick']")
    protected static WebElement redeemedCouponsSortListBox;

    @FindBy(xpath = "//*[@resource-id='CouponListingHeader:TestID'] | //*[@label='All Coupons']")
    protected static WebElement allCouponsHeader;

    @FindBy(xpath = "//*[@resource-id='countTestID'] | //*[@name='countTestID'] | //*[@name='CouponListingHeader:TestID']//following-sibling::*[contains(@name,'Coupons')]//*[contains(@name,'Coupons')]")
    protected static WebElement couponsCount;

    @FindBy(xpath = "//*[@content-desc='Food & Beverages'] | //*[@name='CouponListingHeader:TestID']")
    protected static WebElement firstCategoryHeader;

    @FindBy(xpath = "//*[@resource-id='CouponInfo: ImageTestID'] | //*[@name='CouponInfo: ImageTestID']")
    protected static WebElement couponImage;

    @FindBy(xpath = "//*[@resource-id='couponTile:Container'] | //*[@name='couponTile:Container']")
    protected static WebElement couponDetailsPage;

    @FindBy(xpath = "//*[@resource-id='StoreYourStoreTitle:Text'] | //*[@name='StoreYourStoreTitle:Text']")
    protected static WebElement forYourStore;

    @FindBy(xpath = "//*[@resource-id='couponTile:productImage'] | //*[@name='couponTile:productImage']")
    protected static WebElement productImage;

    @FindBy(xpath = "//*[@resource-id='CouponInfo: FDButtonTestID']//android.widget.TextView | //*[@name='CouponInfo: FDButtonTestID']")
    protected static WebElement clipCouponCTA;

    @FindBy(xpath = "//*[@resource-id='CouponInfo: FDButtonTestID' and @content-desc='Clip Coupon']//android.widget.TextView | //*[@name='CouponInfo: FDButtonTestID'")
    protected static List<WebElement> clipCouponCTAElements;

    @FindBy(xpath = "//*[@content-desc='Terms & Conditions'] | //*[@name='Terms & Conditions']")
    protected static WebElement termsAndConditions;

    @FindBy(xpath = "//*[@text='Scan In-Store Products'] | //*[@name='Scan In-Store Products']")
    protected static WebElement scanInStoreProductsCTA;

    @FindBy(xpath = "//*[@text='Related Smart Coupons'] | //*[@name='Related Smart Coupons']")
    protected static WebElement relatedSmartCoupons;

    @FindBy(xpath = "//*[@content-desc='product Image'] | //*[contains(@name,'product Image Save')]")
    protected static WebElement couponProductImage;

    @FindBy(xpath = "//*[@resource-id='CouponInfo: SavingPriceTestID'] | //*[@name='CouponInfo: SavingPriceTestID']")
    protected static WebElement couponProductSaveField;

    @FindBy(xpath = "//*[@resource-id='CouponInfo: ProductNameTestID'] | //*[@name='CouponInfo: ProductNameTestID']")
    protected static WebElement couponProductNameField;

    @FindBy(xpath = "//*[@resource-id='CouponInfo: CouponStatusTestID'] | //*[@name='CouponInfo: CouponStatusTestID']")
    protected static WebElement couponProductStatusField;

    @FindBy(xpath = "//*[@resource-id='CouponInfo: DescriptionTestID'] | //*[@name='CouponInfo: DescriptionTestID']")
    protected static WebElement couponProductDescField;

    @FindBy(xpath = "//*[@resource-id='selectedSortOption'] | //*[@name='Expiring Soon'] | //*[@name='Biggest Savings']")
    protected static WebElement couponSortOption;

    @FindBy(xpath = "//*[@resource-id='Wallet:dropDownPicker']//com.horcrux.svg.SvgView | //*[@name='Wallet:dropDownPicker']")
    protected static WebElement savingsDropdownOption;

    @FindBy(xpath = "//*[@resource-id='Wallet:dropDownPicker']/android.widget.TextView | //*[@name='Wallet:dropDownPicker']")
    protected static WebElement savingsDropdownOptionText;

    @FindBy(xpath = "//*[@text='Lifetime Savings'] | //*[@name='Lifetime Savings']")
    protected static WebElement lifetimeSavingsTextForIBotta;

    @FindBy(xpath = "//*[@content-desc='info button'] | //*[@name='info button']")
    protected static WebElement infoIcon;

    @FindBy(xpath = "//*[@resource-id='TooltipComponentTestID:TooltipText'] | //*[@name='TooltipComponentTestID:TooltipText']")
    protected static WebElement infoIconTooltip;

    @FindBy(xpath = "//*[@resource-id='LoginGuestContainerTestId']//android.widget.TextView | //*[@name='Clip, Scan, and Save Hundreds of Dollars with Smart Coupons®']")
    protected static WebElement guestSubTitle;

    @FindBy(xpath = "//*[@resource-id='LoginGuestButtonTestId']//android.widget.TextView | //*[@name='LoginGuestButtonTestId']")
    protected static WebElement loginTitle;

    @FindBy(xpath = "//*[@resource-id='CreateAccountGuestTestId']//android.widget.TextView | //*[@name='CreateAccountGuestTestId']")
    protected static WebElement createAccountTitle;

    @FindBy(xpath = "//*[@content-desc='Sign In to Clip Coupon']//android.widget.TextView | //*[@label='Sign In to Clip Coupon']")
    protected static WebElement signInToClipCoupon;

    @FindBy(xpath = "//*[@content-desc='Trending Searches'] | //*[@name='Trending Searches']")
    protected static WebElement trendingSearches;

    @FindBy(xpath = "//*[@content-desc='Previously Searched'] | //*[@name='Previously Searched']")
    protected static WebElement previouslySearched;

    @FindBy(xpath = "//*[@content-desc='Clear'] | //XCUIElementTypeButton[@name='Clear']")
    protected static WebElement btnClear;

    @FindBy(xpath = "//*[@resource-id='ScanButton:Button'] | //*[@name='ScanButton:Button']")
    protected static WebElement scanBarcodeButton;

    @FindBy(xpath = "//*[@content-desc='Scan Product Barcode'] | //*[@name='ScanProduct:Title']")
    protected static WebElement scanProductBarcode;

    @FindBy(xpath = "//*[@resource-id='PlpNoItems:ScanTitle'] | //*[@name='PlpNoItems:ScanTitle']")
    protected static WebElement plpNoItemsScanProductBarcode;

    @FindBy(xpath = "//*[@content-desc='Trending'] | //*[@name = 'SmartCouponHeader:titleTestID']")
    protected static WebElement trendingLabelText;

    @FindBy(xpath = "//*[@content-desc='Browse By Category'] | //*[@name='Browse By Category']")
    protected static WebElement browseByCategoryText;

    @FindBy(xpath = "//*[@content-desc='All Suggested Coupons For You'] | //*[@name='CouponListingHeader:TestID']")
    protected static WebElement AllSuggestedCouponsForYouLabel;

    @FindBy(xpath = "//android.widget.TextView[@content-desc='Biggest Savings'] | //XCUIElementTypeOther[@name='Biggest Savings']")
    protected static WebElement biggestSavingsText;

    @FindBy(xpath = "//*[@content-desc='Clip Coupon'] | (//*[@name='Clip Coupon'])[1]")
    protected static WebElement ClipCoupon;

    @FindBy(xpath = "//*[@content-desc='Back Button'] | //*[@name='Back Button']")
    protected static WebElement clickCouponBackButtonOnAllSuggestedCouponsPage;

    @FindBy(xpath = "//*[@content-desc='No Coupons Expiring Soon'] | //*[@name='No Coupons Expiring Soon']")
    protected static WebElement noCouponsExpiringSoon;

    @FindBy(xpath = "//*[@content-desc='Clipped Coupons Expiring Soon'] | //*[@name='Clipped Coupons Expiring Soon']")
    protected static WebElement clippedCouponsExpiringSoon;

    public SmartCouponsPage(TestContext testContext) {
        super(testContext);
        PageFactory.initElements(testContext.getDriverManager().getDriver(), this);
    }

    public void clickButton(String buttonName) {
        driverManagerUtils.clickByLabel(btnWebElements, buttonName);
    }

    public boolean isElementPresent(String buttonName) {
        return driverManagerUtils.isTextDisplayed(btnWebElements, buttonName);
    }

    public boolean isCouponProductDescField() {
        return driverManagerUtils.isElementDisplayedWithOutWait(couponProductDescField);
    }

    public boolean isCouponProductStatusField() {
        return driverManagerUtils.isElementDisplayedWithOutWait(couponProductStatusField);
    }

    public boolean isCouponProductNameField() {
        return driverManagerUtils.isElementDisplayedWithOutWait(couponProductNameField);
    }

    public boolean isCouponImagePresent() {
        return driverManagerUtils.isElementDisplayedWithOutWait(couponProductImage);
    }

    public boolean isCouponSaveFieldPresent() {
        return driverManagerUtils.isElementDisplayedWithOutWait(couponProductSaveField);
    }

    public boolean isSmartCouponPageDisplayed() {
        return driverManagerUtils.isElementDisplayed(smartCouponPageHeader);
    }
    public boolean isShareIconPresent() {
        return driverManagerUtils.isElementDisplayed(shareIcon);
    }

    public boolean isRelatedSmartCouponDisplayed() {
        return driverManagerUtils.isElementDisplayed(relatedSmartCoupon);
    }

    public void clickSmartCouponLink() {
        driverManagerUtils.scrollToElement(SmartCouponPageLink);
        driverManagerUtils.clickElement(SmartCouponPageLink);
    }

    public boolean isSearchIconPresentInBody() {
        return driverManagerUtils.isElementDisplayed(searchIconInBody);
    }

    public boolean isMessageBodyPresent() {
        return driverManagerUtils.isElementDisplayed(noItemsMessage);
    }

    public String getNoCouponFoundText() {
        return driverManagerUtils.getElementText(noCoupons);
    }

    public String getExploreCouponCategoriesText() {
        return driverManagerUtils.getElementText(exploreButton);
    }

    public boolean isScannerButtonPresent() {
        return driverManagerUtils.isElementDisplayed(scannerButton);
    }

    public boolean isCouponExplorePage() {
        return driverManagerUtils.isElementDisplayed(isCouponExplorePage);
    }

    public void clickSearchBar() {
        driverManagerUtils.clickElement(searchBox);
    }
    public void clickShareIcon() {
        driverManagerUtils.clickElement(shareIcon);
    }

    public int getDropDownCount() {
        return searchDropDownItems.size();
    }

    public void enterSearchKeysSearchBar(String value) {
        if (DriverManagerUtils.configuration.mobilePlatform().equalsIgnoreCase("android")) {
            driverManagerUtils.enterText(searchBox, value);
            ((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.ENTER));
        } else {
            driverManagerUtils.enterText(searchBox, value+"\n");
        }
    }

    public boolean isSearchIconPresent() {
        return driverManagerUtils.isElementDisplayed(searchIcon);
    }

    public boolean isCouponScannerPresent() {
        return driverManagerUtils.isElementDisplayed(couponScanner);
    }

    public String getSearchDefaultText() {
        return driverManagerUtils.getElementText(searchBox);
    }

    public void clickCouponBackButton() {
        driverManagerUtils.clickElement(couponBackButton);
    }

    public void clickClearSearch() {
        driverManagerUtils.clickElement(clearSearch);
    }

    public boolean isSearchCouponDisplayed(String searchValue) {
        return listCoupons.stream().allMatch(webElement -> webElement.getText().toLowerCase().contains(searchValue));
    }

    public void clickEnterButton() {
        new Actions(driver).sendKeys(AndroidKey.ENTER.toString()).build().perform();
    }

    public boolean isTabPresent(String tabName) {
        return driverManagerUtils.isElementDisplayed(driver.findElement(By.xpath(" //android.widget.Button[contains(@content-desc,'" + tabName + "')]")));
    }

    public String getCancelLinkText() {
        return driverManagerUtils.getElementText(cancelLink);
    }

    public void clickCancelButton() {
        driverManagerUtils.clickElement(cancelLink);
    }

    public boolean isCouponBackButtonPresent() {
        return driverManagerUtils.isElementDisplayed(couponBackButton);
    }

    public String getRedeemCouponText() {
        return driverManagerUtils.getElementText(btnRedeemCoupons);
    }

    public void clickRedeemCouponLink() {
        driverManagerUtils.clickElement(btnRedeemCoupons);
    }

    public boolean isBarcodeHeaderIconDisplayed() {
        return driverManagerUtils.isElementDisplayed(barcodeHeaderIcon);
    }

    public String getBarcodeTitleText() {
        return driverManagerUtils.getElementText(barcodeTitle);
    }

    public boolean isBarcodeCloseButtonDisplayed() {
        return driverManagerUtils.isElementDisplayed(btnBarcodeClose);
    }

    public void clickBarcodeCloseButton() {
        driverManagerUtils.clickElement(btnBarcodeClose);
    }

    public String getClippedAmountText() {
        return driverManagerUtils.getElementText(clippedAmount);
    }

    public String getCouponsClippedText() {
        return driverManagerUtils.getElementText(clippedCoupons);
    }

    public boolean isBarcodeImageDisplayed() {
        return driverManagerUtils.isElementDisplayed(barcodeImage);
    }

    public boolean isPhoneNumberDisplayed() {
        return driverManagerUtils.isElementDisplayed(displayBarcodeInstructionText.get(0));
    }

    public String getDisplayBarcodeInstructionText() {
        return driverManagerUtils.getElementText(displayBarcodeInstructionText.get(1));
    }

    public String getForYouListedCouponSectionText() {
        return driverManagerUtils.getElementText(forYouListedCouponSection);
    }
    public String recommendedCouponSectionText() {
        return driverManagerUtils.getElementText(recommendedCouponSection);
    }

    public String getTrendingLabelText() {
        return driverManagerUtils.getElementText(trendingLabel);
    }

    public String getViewAllLabelText() {
        return driverManagerUtils.getElementText(viewAllLink);
    }

    public String getAllListedCouponSectionText() {
        return driverManagerUtils.getElementText(allListedCouponSection);
    }

    public boolean isClippedListedCouponSectionDisplayed() {
        return driverManagerUtils.isElementDisplayed(clippedListedCouponSection);
    }

    public boolean isExpiringSoonSectionDisplayed() {
        return driverManagerUtils.isElementDisplayed(ExpiringSoonSection);
    }

    public String getSmartCouponsForYouTitleText() {
        return driverManagerUtils.getElementText(smartCouponsForYouTitle);
    }

    public boolean isExpiredAndUnusedCouponsDisplayed() {
        return driverManagerUtils.isElementDisplayed(expiredAndUnusedCouponsSection);
    }

    public boolean isRedeemedCouponsText() {
        return driverManagerUtils.isElementDisplayed(expiredAndUnusedCouponsSection);
    }

    public boolean isForYouCouponsPresent() {
        return driverManagerUtils.isElementDisplayed(ForYouCoupons);
    }

    public boolean isTotalSavingDisplayed() {
        return driverManagerUtils.isElementDisplayed(yearlyClipped);
    }

    public boolean isClippedDollarAmountDisplayed() {
        return driverManagerUtils.isElementDisplayed(clippedValue);
    }

    public boolean isTotalAmountAvailableForClippingDisplayed() {
        return driverManagerUtils.isElementDisplayed(maxClippedValue);
    }

    public void clickAllAllListedCouponTab() {
        driverManagerUtils.clickElement(allListedCouponSection);
    }

    public boolean isAllCouponsLinkDisplayed() {
        return driverManagerUtils.isElementDisplayed(allCouponsLink);
    }

    public boolean isCategoriesListDisplayed() {
        return driverManagerUtils.isElementDisplayed(allCategories);
    }

    public void clickAllCouponsLink() {
        driverManagerUtils.clickElement(allCouponsLink);
    }

    public boolean isAllCouponsHeaderDisplayed() {
        return driverManagerUtils.isElementDisplayed(allCouponsHeader);
    }

    public boolean isCouponsCountDisplayed() {
        return driverManagerUtils.isElementDisplayed(couponsCount);
    }

    public boolean isExploreViaAdsAndBooksTextDisplayed() {
        return driverManagerUtils.isElementDisplayed(exploreViaAdsAndBooks);
    }

    public void clickExploreViaAdsAndBooksLink() {
        driverManagerUtils.clickElement(exploreViaAdsAndBooks);
    }
    public void clickExpiringSoonTab() {
        driverManagerUtils.clickElement(ExpiringSoonSection);
    }

    public String getRedeemedCouponsText() {
        return driverManagerUtils.getElementText(redeemedCouponsHeaderText).trim();
    }

    public String getSortedOptionTextOnRedeemedCouponsPage() {
        return driverManagerUtils.getElementText(redeemedCouponsSortListBox);
    }

    public boolean isExploreByCategoryTextDisplayed() {
        return driverManagerUtils.isElementDisplayed(exploreByCategoryText);
    }

    public boolean isFoodAndBeveragesCategoryDisplayed() {
        return driverManagerUtils.isElementDisplayed(foodAndBeveragesCategory);
    }

    public void clickOnFoodAndBeveragesCategory() {
        driverManagerUtils.clickElement(foodAndBeveragesCategory);
    }

    public void clickFirstCoupons() {
        driverManagerUtils.clickElement(couponImage);
    }

    public boolean isCouponDetailsPageDisplayed() {
        return driverManagerUtils.isElementDisplayed(couponDetailsPage);
    }

    public boolean isForYourStorePresent() {
        return driverManagerUtils.isElementDisplayed(forYourStore);
    }

    public boolean isProductImagePresent() {
        return driverManagerUtils.isElementDisplayed(productImage);
    }

    public boolean isClipCouponCTAPresent() {
        return driverManagerUtils.isElementDisplayedWithOutWait(clipCouponCTA);
    }

    public boolean isTermsAndConditionsTextPresent() {
        return driverManagerUtils.isElementDisplayedWithOutWait(termsAndConditions);
    }

    public boolean isScanInStoreProductCTAPresent() {
        return driverManagerUtils.isElementDisplayedWithOutWait(scanInStoreProductsCTA);
    }

    public boolean isRelatedSmartCouponsPresent() {
        return driverManagerUtils.isElementDisplayed(relatedSmartCoupons);
    }

    public boolean isCouponsPresent() {
        return couponView.size() > 0;
    }

    public void clickTermsAndConditionLink() {
        driverManagerUtils.clickElement(termsAndConditions);
    }

    public void clickScanInStoreProductsLink() {
        driverManagerUtils.clickElement(scanInStoreProductsCTA);
    }

    public boolean isCouponSortOptionDisplayed() {
        return driverManagerUtils.isElementDisplayed(couponSortOption);
    }

    public void clickCouponSortOption() {
        driverManagerUtils.clickElement(couponSortOption);
    }

    public boolean isSavingsDropdownOptionDisplayed() {
        return driverManagerUtils.isElementDisplayed(savingsDropdownOption);
    }

    public String getSavingsDropdownOptionsText() {
        return driverManagerUtils.getElementText(savingsDropdownOptionText);
    }

    public String getLifeTimeSavingsTextForIBotta() {
        return driverManagerUtils.getElementText(lifetimeSavingsTextForIBotta);
    }
    public boolean isInfoIconDisplayed() {
        return driverManagerUtils.isElementDisplayed(infoIcon);
    }

    public void clickInfoIconButton() {
        driverManagerUtils.clickElement(infoIcon);
    }

    public String getInfoIconText() {
        return driverManagerUtils.getElementText(infoIconTooltip);
    }

    public void clickInfoIconTooltipButton() {
        driverManagerUtils.clickElement(infoIconTooltip);
    }

    public String getGuestSubTitleText() {
        return driverManagerUtils.getElementText(guestSubTitle);
    }

    public String getHeaderLoginTitleText() {
        return driverManagerUtils.getElementText(loginTitle);
    }

    public String getHeaderCreateAccountTitleText() {
        return driverManagerUtils.getElementText(createAccountTitle);
    }

    public void clickLoginButton() {
        driverManagerUtils.clickElement(loginTitle);
    }

    public void clickCreateAccountButton() {
        driverManagerUtils.clickElement(createAccountTitle);
    }

    public String getSortedOptionText() {
        return driverManagerUtils.getElementText(couponSortOption);
    }

    public String getSignInToClipCouponText() {
        return driverManagerUtils.getElementText(signInToClipCoupon);
    }

    public String getClipCouponText() {
        return driverManagerUtils.getElementText(clipCouponCTA);
    }

    public void clickClipCouponCTA() {
        driverManagerUtils.isTextDisplayed(clipCouponCTAElements, ApplicationInputs.CLIP_COUPON.getValue());
        driverManagerUtils.clickElement(clipCouponCTAElements.get(0));
    }

    public void getClippedCouponText(String clippedText) {
        TestVariables.store(clippedText, driverManagerUtils.getElementText(clippedValue));
    }

    public void clickSignInToClipCouponButton() {
        driverManagerUtils.clickElement(signInToClipCoupon);
    }

    public void clickFirstCategoryFromCategoriesList() {
        driverManagerUtils.clickElement(categoriesList.get(0));
    }

    public boolean isFirstCategoryHeaderDisplayed() {
        return driverManagerUtils.isElementDisplayed(firstCategoryHeader);
    }

    public String getTrendingSearchText() {
        return driverManagerUtils.getElementText(trendingSearches);
    }

    public boolean isScanBarcodeButtonDisplayed() {
        return driverManagerUtils.isElementDisplayed(scanBarcodeButton);
    }

    public String getScanProductBarcodeText() {
        return driverManagerUtils.getElementText(scanProductBarcode);
    }

    public String getPlpNoItemsScanProductBarcodeText() {
        return driverManagerUtils.getElementText(plpNoItemsScanProductBarcode);
    }

    public String getPreviouslySearchedText() {
        return driverManagerUtils.getElementText(previouslySearched);
    }

    public String getClearText() {
        return driverManagerUtils.getElementText(btnClear);
    }

    public void clickClearButton() {
        driverManagerUtils.clickElement(btnClear);
    }

    public boolean isPreviouslySearchedTextPresent() {
        return driverManagerUtils.isElementDisplayed(previouslySearched);
    }

    public void clickCouponCategory(){
        driverManagerUtils.clickElement(allCategories);
    }

    public String getTrendingLabel() {
        return driverManagerUtils.getElementText(trendingLabelText);
    }
    public boolean isBrowseByCategoryTextDisplayed() {
        return driverManagerUtils.isElementDisplayed(browseByCategoryText);
    }

    public String getAllSuggestedCouponsForYouLabelText() {
        return driverManagerUtils.getElementText(AllSuggestedCouponsForYouLabel);
    }
    public boolean isBiggestSavingsTextDisplayed() {
        return driverManagerUtils.isElementDisplayed(biggestSavingsText);
    }

    public void clickSignInToClipCouponLink() {driverManagerUtils.clickElement(signInToClipCoupon);}

    public boolean isClipCouponTextDisplayed() {
        return driverManagerUtils.isElementDisplayed(ClipCoupon);
    }

    public void clickCouponBackButtonOnAllSuggestedCouponsPage() {
        driverManagerUtils.clickElement(clickCouponBackButtonOnAllSuggestedCouponsPage);
    }

    public boolean isExpiringSoonCouponsDisplayed() {
        if(driverManagerUtils.isElementDisplayed(noCouponsExpiringSoon)) {
            return true;
        } else if (driverManagerUtils.isElementDisplayed(clippedCouponsExpiringSoon)) {
            return true;
        } else {
            return false;
        }
    }

}
