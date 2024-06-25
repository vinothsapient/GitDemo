package com.testx.web.api.selenium.restassured.qe.ui.pageobjects;

import com.testx.web.api.selenium.restassured.qe.ui.context.TestContext;
import com.testx.web.api.selenium.restassured.qe.ui.stepdefinitions.BaseSetup;
import com.testx.web.api.selenium.restassured.qe.ui.webdriver.DriverManagerUtils;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

public class PDPPage extends BaseSetup {

    public PDPPage(TestContext testContext) {
        super(testContext);
        PageFactory.initElements(testContext.getDriverManager().getDriver(), this);
    }

    @FindBy(xpath = "//*[@resource-id='Pdp:AllSectionsList'] | //*[@name='Pdp:AllSectionsList']")
    protected static WebElement productDetailsPage;

    @FindBy(xpath = "//*[@content-desc='Products'] | //*[@name='Products']")
    protected static WebElement productTabOnPLP;

    @FindBy(xpath = "//*[@resource-id='ProductTile:Title'] | //*[@name='Pdp:TitleAndRatingView']/XCUIElementTypeOther")
    protected static WebElement productTitle;

    @FindBy(xpath = "//*[@resource-id='ProductTile:Rating'] | //*[@name='ProductTile:Rating']")
    protected static WebElement productRating;

    @FindBy(xpath = "//*[@resource-id='ProductTile:DescriptionText'] | //*[@name='ProductTile:Description']")
    protected static WebElement productDescription;

    @FindBy(xpath = "//*[contains(@content-desc,'Product SKU')] | //*[contains(@name,'Product SKU')]")
    protected static WebElement productSKU;

    @FindBy(xpath = "//*[@resource-id='ProductTile:StrikeThroughPrice'] | //*[@name='ProductTile:StrikeThroughPrice']")
    protected static WebElement productStrikeThroughPrice;

    @FindBy(xpath = "//*[@text='Why is there a minimum quantity?'] | //*[@name='Why is there a minimum quantity?']")
    protected static WebElement minimumQtyLink;

    @FindBy(xpath = "//*[@resource-id='MinimumQuantityPopUpHeading:TestID'] | //*[@name='MinimumQuantityPopUpHeading:TestID']")
    public static WebElement minimumQtyPopUpHeader;

    @FindBy(xpath = "//*[@resource-id='MinimumQuantityPopUpContent:TestID'] | //*[@name='MinimumQuantityPopUpContent:TestID']")
    public static WebElement minimumQtyPopUpContent;

    @FindBy(xpath = "//*[@resource-id='MinimumQuantityPopUpBtnContainer:TestID']//android.widget.TextView | //*[@name='MinimumQuantityPopUpBtnContainer:TestID']")
    public static WebElement minimumQtyPopUpCloseButton;

    @FindBy(xpath = "//*[@resource-id='bopisInStorePickup:inStorePickup'] | //*[@name='bopisInStorePickup:inStorePickup']")
    protected static WebElement inStorePickUp;

    @FindBy(xpath = "//*[@resource-id='bopisInStorePickup:freePickupLabel'] | //*[@name='bopisInStorePickup:freePickupLabel']")
    protected static WebElement freePickupLabel;

    @FindBy(xpath = "//*[@resource-id='bopisInStorePickup:freePickupData'] | //*[@name='bopisInStorePickup:freePickupData']")
    protected static WebElement freePickupDay;

    @FindBy(xpath = "//*[@resource-id='bopisInStorePickup:orderWithinLabel'] | //*[@name='bopisInStorePickup:orderWithinLabel']")
    protected static WebElement orderWithinLabel;

    @FindBy(xpath = "//*[@resource-id='bopisInStorePickup:orderWithinData'] | //*[@name='bopisInStorePickup:orderWithinData']")
    protected static WebElement orderWithinData;

    @FindBy(xpath = "//*[@resource-id='bopisInStorePickup:pickupAddess']//android.widget.TextView | //*[@name='bopisInStorePickup:pickupAddess']")
    protected static WebElement pickupAddress;

    @FindBy(xpath = "//*[@resource-id='BopisFulfilmentContainer:StockStatusText'] | //*[@name='BopisFulfilmentContainer:StockStatusText']")
    protected static WebElement stockStatus;

    @FindBy(xpath = "//*[@resource-id='StatusBannerComponent:description'] | //*[@name='StatusBannerComponent:description']")
    protected static WebElement noteDescription;

    @FindBy(xpath = "//*[@resource-id='CountAction:RemoveButton'] | //*[@name='CountAction:RemoveButton']")
    protected static WebElement productCountRemoveButton;

    @FindBy(xpath = "//*[@resource-id='count:Text'] | //*[@name='count:Text']")
    protected static WebElement quantityCountText;

    @FindBy(xpath = "//*[@resource-id='CountAction:AddButton'] | //*[@name='CountAction:AddButton']")
    protected static WebElement productCountAddButton;

    @FindBy(xpath = "//*[@resource-id='addToCart:Text'] | //*[@name='addToCart:Action']")
    protected static WebElement addToCart;

    @FindBy(xpath = "//*[@text='Check Nearby Stores'] | //*[@name='Check Nearby Stores']")
    protected static WebElement checkNearbyStores;

    @FindBy(xpath = "//*[@resource-id='FDPlpSearchHeader:backIcon'] | //*[@name='FDPlpSearchHeader:backIcon']")
    public static WebElement pdpBackButton;

    @FindBy(xpath = "//*[@resource-id='FDPlpSearchHeader:searchBar']//com.horcrux.svg.SvgView | //*[@name='FDPlpSearchHeader:searchIcon']")
    protected static WebElement pdpSearchIcon;

    @FindBy(xpath = "//*[@resource-id='FDPlpSearchHeader:scan'] | //*[@name='FDPlpSearchHeader:scan']")
    protected static WebElement pdpScanner;

    @FindBy(xpath = "//*[@resource-id='FDPlpSearchHeader:searchInput'] | //*[@name='FDPlpSearchHeader:searchInput']")
    public static WebElement pdpSearchBox;

    @FindBy(xpath= "//*[@text='Product Description'] | //*[@name='FDTwoTopTabs:Tab1']")
    protected static WebElement productDescriptionTab;

    @FindBy(xpath = "//*[@text='Specifications'] | //*[@name='Specifications']")
    protected static WebElement specificationTab;

    @FindBy(xpath = "//*[@resource-id='Pdp:PdpProductDescriptionText'] | //*[@name='Pdp:PdpProductDescriptionText']")
    protected static WebElement productInformation;

    @FindAll(@FindBy(xpath = "//android.widget.ScrollView[@resource-id='Pdp:AllSectionsList']/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup"))
    protected static List<WebElement> specificationColumns;

    @FindBy(xpath = "//*[@class='android.widget.HorizontalScrollView']/android.view.ViewGroup/android.view.ViewGroup | //*[@name='ProductCarousal:productDescriptionText']")
    protected static List<WebElement> productCountInYouMayLike;

    @FindBy(xpath = "//*[@resource-id='ProductCarousal:productDescriptionText'] | //*[@name='FDCarousel:TestID']")
    protected static List<WebElement> productNameOnCarousel;

    @FindBy(xpath = "//*[@text='You Might Also Like'] | //*[@name='You Might Also Like']")
    protected static WebElement youMayAlsoLikeHeading;

    @FindBy(xpath = "//*[@content-desc='USDDollar']/following-sibling::*[@content-desc='each'] | //*[contains(@name,'USDDollar')]")
    protected static WebElement productPriceFromCarousel;

    @FindBy(xpath = "//*[@resource-id='setPopupCountList:TestID']//android.widget.TextView | //*[@name='setPopupCountList:TestID']")
    protected static WebElement overlayPopUp;

    @FindBy(xpath = "//*[@resource-id='setPopupCountList:TestID']//android.widget.TextView | //*[@name='setPopupCountList:TestID']")
    protected static List<WebElement> overlayOptions;

    @FindBy(xpath = "//*[@text='Select a Store'] | //*[@name='Select a Store']")
    protected static WebElement selectAStore;

    @FindBy(xpath = "//*[@resource-id='ChangeStoreModalHeading:TestID']//android.widget.TextView | //*[@name='ChangeStoreModalHeading:TestID']")
    protected static WebElement changeStoreHeader;

    @FindBy(xpath = "//*[@resource-id='ChangeStoreModalIcon:TestID'] | //*[@name='ChangeStoreModalIcon:TestID']")
    protected static WebElement changeStoreCloseButton;

    @FindBy(xpath = "//*[@resource-id='FDError:ErrorMessageTitle'] | //*[@name='FDError:ErrorMessageTitle']")
    protected static WebElement maxItemReachedTitle;

    @FindBy(xpath = "//*[@resource-id='FDError:ErrorMessageDesc'] | //*[@name='FDError:ErrorMessageDesc']")
    protected static WebElement maxItemReachedDesc;

    @FindBy(xpath = "//*[@resource-id='FDError:CrossButton'] | //*[@name='FDError:CrossButton']")
    protected static WebElement maxItemReachedCloseButton;

    public boolean isProductDetailsPageDisplayed() {
        if (!driverManagerUtils.isElementDisplayed(productDetailsPage)) {
            DriverManagerUtils.sleep(10);
        }
        return driverManagerUtils.isElementDisplayed(productDetailsPage);
    }

    public void clickBackButtonOnPDP() {
        driverManagerUtils.clickElement(pdpBackButton);
    }

    public boolean isBackButtonOnPDPPresent() {
        return driverManagerUtils.isElementDisplayed(pdpBackButton);
    }

    public boolean isSearchIconPresent() {
        return driverManagerUtils.isElementDisplayed(pdpSearchIcon);
    }

    public boolean isScannerOnPDPPresent() {
        return driverManagerUtils.isElementDisplayed(pdpScanner);
    }

    public String getSearchDefaultText() {
        return driverManagerUtils.getElementText(pdpSearchBox);
    }

    public void clickOnProductsAndCouponsSearchBox() {
        driverManagerUtils.clickElement(pdpSearchBox);
    }

    public void enterSearchKeysOnSearchBar(String value) {
        if (DriverManagerUtils.configuration.mobilePlatform().equalsIgnoreCase("android")) {
            driverManagerUtils.enterText(pdpSearchBox, value);
            ((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.ENTER));
        } else {
            driverManagerUtils.enterText(pdpSearchBox, value+"\n");
        }
    }

    public boolean isProductTabOnPLPPresent() {
        return driverManagerUtils.isElementDisplayed(productTabOnPLP);
    }

    public boolean isProductTitleOnPDPPresent() {
        return driverManagerUtils.isElementDisplayed(productTitle);
    }

    public boolean isProductSKUOnPDPPresent() {
        return driverManagerUtils.isElementDisplayed(productSKU);
    }

    public boolean isProductRatingOnPDPPresent() {
        return driverManagerUtils.isElementDisplayed(productRating);
    }

    public boolean isProductDescriptionOnPDPPresent() {
        return driverManagerUtils.isElementDisplayed(productDescription);
    }

    public boolean isProductStrikeThroughPriceOnPDPPresent() {
        return driverManagerUtils.isElementDisplayed(productStrikeThroughPrice);
    }

    public boolean isProductDescriptionTabOnPDPPresent() {
        return driverManagerUtils.isElementDisplayed(productDescriptionTab);
    }

    public boolean isProductSpecificationTabOnPDPPresent() {
        return driverManagerUtils.isElementDisplayed(specificationTab);
    }

    public boolean isProductInformationOnPDPPresent() {
        return driverManagerUtils.isElementDisplayed(productInformation);
    }

    public void clickProductSpecificationTabOnPDP() {
        driverManagerUtils.clickElement(specificationTab);
    }

    public int specificationColumnsCount() {
        return specificationColumns.size();
    }

    public boolean isYouMayAlsoLikePresent() {
        return driverManagerUtils.isElementDisplayed(youMayAlsoLikeHeading);
    }

    public boolean verifyRecommendationCountInBetween(int low, int high) {
        return productCountInYouMayLike.size()>=low && productCountInYouMayLike.size()<=high;
    }

    public boolean isCarouselShowingProductName() {
        return productNameOnCarousel.size()>0;
    }

    public boolean isCarouselPriceShowing() {
        return driverManagerUtils.isElementDisplayed(productPriceFromCarousel);
    }

    public String getMinimumQuantityLinkText() {
        return driverManagerUtils.getElementText(minimumQtyLink);
    }

    public void clickMinimumQuantityLink() {
        driverManagerUtils.clickElement(minimumQtyLink);
    }

    public String getMinimumQuantityOverlayHeaderText() {
        return driverManagerUtils.getElementText(minimumQtyPopUpHeader);
    }

    public String getMinimumQuantityOverlayContentText() {
        return driverManagerUtils.getElementText(minimumQtyPopUpContent);
    }

    public String getMinimumQuantityOverlayCloseText() {
        return driverManagerUtils.getElementText(minimumQtyPopUpCloseButton);
    }

    public void clickCloseButton() {
        driverManagerUtils.clickElement(minimumQtyPopUpCloseButton);
    }

    public String getInStorePickupText() {
        return driverManagerUtils.getElementText(inStorePickUp);
    }

    public String getFreePickupLabelText() {
        return driverManagerUtils.getElementText(freePickupLabel);
    }

    public String getFreePickupDayText() {
        return driverManagerUtils.getElementText(freePickupDay);
    }

    public String getOrderWithinLabelText() {
        return driverManagerUtils.getElementText(orderWithinLabel);
    }

    public boolean isOrderWithinDataPresent() {
        return driverManagerUtils.isElementDisplayed(orderWithinData);
    }

    public boolean isPickUpAddressPresent() {
        return driverManagerUtils.isElementDisplayed(pickupAddress);
    }

    public String getStockStatusText() {
        return driverManagerUtils.getElementText(stockStatus);
    }

    public String getNoteDescriptionText() {
        return driverManagerUtils.getElementText(noteDescription);
    }

    public boolean isRemoveCounterPresent() {
        return driverManagerUtils.isElementDisplayed(productCountRemoveButton);
    }

    public boolean isCountNumberPresent() {
        return driverManagerUtils.isElementDisplayed(quantityCountText);
    }

    public boolean isAddCounterPresent() {
        return driverManagerUtils.isElementDisplayed(productCountAddButton);
    }

    public String getAddToCartText() {
        return driverManagerUtils.getElementText(addToCart);
    }

    public boolean isAddToCartButtonPresent() {
        return driverManagerUtils.isElementDisplayed(addToCart);
    }

    public boolean isCheckNearbyStoresCTAPresent() {
        return driverManagerUtils.isElementDisplayed(checkNearbyStores);
    }

    public String getProductQuantityText() {
        return driverManagerUtils.getElementText(quantityCountText);
    }

    public boolean isProductCountRemoveButtonEnabled() {
        return driverManagerUtils.isElementEnabled(productCountRemoveButton);
    }

    public boolean isProductCountAddButtonEnabled() {
        return driverManagerUtils.isElementEnabled(productCountAddButton);
    }

    public void clickAddProductCountButton() {
        driverManagerUtils.clickElement(productCountAddButton);
    }

    public void clickRemoveProductCountButton() {
        driverManagerUtils.clickElement(productCountRemoveButton);
    }

    public void selectItemQuantity(String quantity) {
        for (WebElement overlayOption : overlayOptions) {
            if (driverManagerUtils.getElementText(overlayOption).equals(quantity)) {
                driverManagerUtils.clickElement(overlayOption);
                break;
            }
        }
    }

    public void clickOnQuantitySelector() {
        driverManagerUtils.clickElement(quantityCountText);
    }

    public boolean isOverlayPresent() {
        return driverManagerUtils.isElementDisplayed(overlayPopUp);
    }

    public String getSelectAStoreText() {
        return driverManagerUtils.getElementText(selectAStore);
    }

    public void clickSelectAStoreCTA() {
        driverManagerUtils.clickElement(selectAStore);
    }

    public String getChangeStoreHeader() {
        return driverManagerUtils.getElementText(changeStoreHeader);
    }

    public void clickChangeStoreCloseButton() {
        driverManagerUtils.clickElement(changeStoreCloseButton);
    }

    public void clickAddToCartButton() {
        driverManagerUtils.clickElement(addToCart);
    }

    public String getMaxItemReachedTitle() {
        return driverManagerUtils.getElementText(maxItemReachedTitle);
    }

    public String getMaxItemReachedDesc() {
        return driverManagerUtils.getElementText(maxItemReachedDesc);
    }

    public void clickMaxItemReachedCloseButton() {
        driverManagerUtils.clickElement(maxItemReachedCloseButton);
    }
}
