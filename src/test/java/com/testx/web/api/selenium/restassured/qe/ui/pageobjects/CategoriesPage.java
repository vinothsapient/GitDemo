package com.testx.web.api.selenium.restassured.qe.ui.pageobjects;

import com.testx.web.api.selenium.restassured.qe.ui.context.TestContext;
import com.testx.web.api.selenium.restassured.qe.ui.stepdefinitions.BaseSetup;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CategoriesPage extends BaseSetup {

    public CategoriesPage(TestContext testContext) {
        super(testContext);
        PageFactory.initElements(testContext.getDriverManager().getDriver(), this);
    }

    @FindBy(xpath = "//*[@resource-id='FDCategoryHeader:Title'] | //*[@name='FDCategoryHeader:Title']")
    protected static WebElement exploreAllCategoriesHeader;

    @FindBy(xpath = "//*[@resource-id='FDCategoryHeader:BackIcon'] | //*[@name='FDCategoryHeader:BackIcon']")
    protected static WebElement btnBack;

    @FindBy(xpath = "//*[@resource-id='ProductTile:OutOfStockForStore']//android.widget.TextView | //*[@name='ProductTile:OutOfStockForStore']")
    protected static WebElement outOfStock;

    @FindBy(xpath = "//*[@resource-id='FDCategoryHeader:RightIcon'] | //*[@name='FDCategoryHeader:RightIcon']")
    protected static WebElement searchIcon;

    @FindBy(xpath = "//*[@resource-id='FDRowView:Title'] | //*[@name='FDRowView:Title']")
    protected static List<WebElement> productList;

    @FindBy(xpath = "//*[@resource-id='FDRowView:RightIcon'] | //*[@name='Vertical scroll bar, 3 pages']")
    protected static WebElement productDrillDownArrow;

    @FindBy(xpath = "//*[@resource-id='FDCategoryHeader:Title'] | //*[@name='FDCategoryHeader:Title']")
    protected static WebElement productHeader;

    @FindBy(xpath = "//*[@resource-id='PLPCategories:CategoriesTitleView'] | //*[@name='PLPCategories:CategoriesTitleView']")
    protected static WebElement plpProductList;

    @FindBy(xpath = "//*[@resource-id='FilterAndSorting:ProductCount'] | //*[@name='FilterAndSorting:ProductCount']")
    protected static WebElement productCount;

    @FindBy(xpath = "//*[@resource-id='PLPCategories:AllCategories']/android.widget.TextView | //*[@name='PLPCategories:AllCategories']")
    protected static WebElement allCategories;

    @FindBy(xpath = "//*[@resource-id='FilterAndSorting:Switch'] | //*[@name='FilterAndSorting:Switch']")
    protected static WebElement smartCouponToggle;

    @FindBy(xpath = "(//*[contains(@resource-id,'ProductTile:ProductImage')])[1] | //*[@name='IN_VIEW_TEST_ID']")
    protected static WebElement productImage;

    @FindBy(xpath = "//*[@resource-id='TooltipTestID'] | //*[@name='Relevancy info button']")
    protected static WebElement relevancyInfoTooltip;

    @FindBy(xpath = "(//*[contains(@resource-id,'ProductTile:ProductImage')])[2] | (//*[contains(@name,'ProductTile:ContentContainer')])[2]")
    protected static WebElement productImage1;

    @FindBy(xpath = "(//*[@resource-id='Rating:starImgTestID'])[1] | (//*[@name='Rating:starImgTestID'])[1]")
    protected static WebElement productRatingWidget;

    @FindBy(xpath = "(//*[@content-desc='Was:'])[1] | (//*[@name='Was:'])[1]")
    protected static WebElement productPreviousPrice;

    @FindBy(xpath = "//*[@resource-id='FilterAndSorting:SelectedSort'] | //*[@name='FilterAndSorting:SortButton']")
    protected static WebElement productSortButton;

    @FindBy(xpath = "//*[@resource-id='FilterAndSorting:SelectedFilter'] | //*[@name='FilterAndSorting:FilterButton']")
    protected static WebElement productFilterButton;

    @FindBy(xpath = "//*[@content-desc='Sort By'] | //*[@name='Sort By']")
    protected static WebElement sortingBox;

    @FindBy(xpath = "//*[@resource-id='AccountLoginSection:Title'] | //*[@name='AccountLoginSection:Title']")
    protected static WebElement filterBox;

    @FindBy(xpath = "//*[@content-desc='Close Button'] | //*[@name='Close Button'] | //*[@name='SortModalHeader:CrossButton']")
    protected static WebElement btnCloseInSortingBox;

    @FindBy(xpath = "//*[@resource-id='FilterHeaderLeftIconTestId:Back'] | //*[@name='FilterHeaderLeftIconTestId:Back']")
    protected static WebElement btnCloseInFilterBox;

    @FindBy(xpath = "//*[@content-desc='Radio Button'] | //*[@resource-id='SortOptions:RadioCircle'] | //*[@name='Radio Button'] | //*[@name='SortOptions:RadioCircle']")
    protected static List<WebElement> sortingRadioButtonList;

    @FindBy(xpath = "//*[@resource-id='SortOptions:RadioText'] | //*[@name='SortOptions:OptionContainer']/XCUIElementTypeOther")
    protected static List<WebElement> sortingTextList;

    @FindBy(xpath = "//*[@resource-id='ProductFilter: MainFilterItem']//android.widget.TextView | //*[@name='ProductFilter: MainFilterItem']")
    protected static List<WebElement> filterOptionsList;

    @FindBy(xpath = "//*[@content-desc='Show Results Button']//android.widget.TextView | //*[@name='Show Results Button'] | //*[@name='SortModal:ShowResultsButton']")
    protected static WebElement btnShowResults;

    @FindBy(xpath = "//*[@resource-id='ProductFilter:Button']//android.widget.TextView | //*[@name='ProductFilter:Button']")
    protected static WebElement btnFilterShowResults;

    @FindBy(xpath = "//*[@content-desc='Reset']//android.widget.TextView | //*[@name='SortModalHeader:RightButton' and @label='Reset']//XCUIElementTypeStaticText")
    protected static WebElement btnReset;

    public String getExploreAllCategoriesHeaderText() {
        return driverManagerUtils.getElementText(exploreAllCategoriesHeader);
    }

    public boolean isHorizontalSeparatorLineDisplayed() {
        return driverManagerUtils.isElementDisplayed(exploreAllCategoriesHeader);
    }

    public boolean isBackButtonDisplayed() {
        return driverManagerUtils.isElementDisplayed(btnBack);
    }

    public String getOutOfStoreText() {
        return driverManagerUtils.getElementText(outOfStock);
    }

    public boolean isInStoreOnlyDisplayed() {
        return driverManagerUtils.isElementDisplayed(outOfStock);
    }

    public void clickBackButton() {
        driverManagerUtils.clickElement(btnBack);
    }

    public boolean isSearchIconDisplayed() {
        return driverManagerUtils.isElementDisplayed(searchIcon);
    }

    public void clickSearchButton() {
        driverManagerUtils.clickElement(searchIcon);
    }

    public boolean isElementPresent(String buttonName) {
        return driverManagerUtils.isDisplayed(By.xpath("//*[@text='"+buttonName+"'] | (//*[@label='"+buttonName+"'])[1] | //*[@name='"+buttonName+"']"));
    }

    public void clickButton(String buttonName) {
        driverManagerUtils.click(By.xpath("//*[@content-desc='"+buttonName+"'] | (//*[@name='"+buttonName+"'])[1]"));

    }

    public List<String> getFeaturedListText() {
        List<String> list = new ArrayList<>();
        for (int i=0; i<3; i++) {
            list.add(driverManagerUtils.getElementText(productList.get(i)));
        }
        return list;
    }

    public List<String> getFindProductByCategoryListText() {
        List<String> list = new ArrayList<>();
        for (int i=3; i<productList.size(); i++) {
            list.add(driverManagerUtils.getElementText(productList.get(i)));
        }
        return list;
    }

    public boolean isProductDrillDownArrowPresent() {
        return driverManagerUtils.isElementDisplayed(productDrillDownArrow);
    }

    public String getProductHeaderText() {
        try {
            return driverManagerUtils.getElementText(productHeader);
        } catch (StaleElementReferenceException exception) {
            return driverManagerUtils.getElementText(productHeader);
        }
    }

    public boolean isPlpProductListPresent() {
        return driverManagerUtils.isElementDisplayed(plpProductList);
    }

    public boolean isProductCountDisplayed() {
        return driverManagerUtils.isElementDisplayed(productCount);
    }

    public boolean isAllCategoryTextDisplayed() {
        return driverManagerUtils.isElementDisplayed(allCategories);
    }

    public void clickAllCategoryLink() {
        driverManagerUtils.clickElement(allCategories);
    }

    public boolean isSmartCouponToggleButtonDisplayed() {
        return driverManagerUtils.isElementDisplayed(smartCouponToggle);
    }

    public void clickSmartCouponToggleButton() {
        driverManagerUtils.clickElement(smartCouponToggle);
    }

    public boolean isProductImageDisplayed() {
        return driverManagerUtils.isElementDisplayed(productImage);
    }

    public boolean isProductRatingWidgetDisplayed() {
        return driverManagerUtils.isElementDisplayed(productRatingWidget);
    }

    public boolean isProductPreviousPriceDisplayed() {
        return driverManagerUtils.isElementDisplayed(productPreviousPrice);
    }

    public boolean isProductSortButtonDisplayed() {
        return driverManagerUtils.isElementDisplayed(productSortButton);
    }

    public void clickSortCTAButton() {
        driverManagerUtils.clickElement(productSortButton);
    }

    public boolean isSortingBoxDisplayed() {
        return driverManagerUtils.isElementDisplayed(sortingBox);
    }

    public boolean isCloseButtonInSortingBoxDisplayed() {
        return driverManagerUtils.isElementDisplayed(btnCloseInSortingBox);
    }

    public void clickCloseButtonInSortingBoxButton() {
        driverManagerUtils.clickElement(btnCloseInSortingBox);
    }

    public void selectOtherThanRelevance() {
        driverManagerUtils.clickElement(sortingRadioButtonList.get(2));
    }

    public List<String> getAllSortingOptionText() {
        List<String> list = new ArrayList<>();
        for (WebElement element : sortingTextList) {
            list.add(driverManagerUtils.getElementText(element));
        }
        boolean driverType = driver instanceof AndroidDriver;
        if (driverType) {
            driver.findElements(AppiumBy.androidUIAutomator(
                    "new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(1)"));
        } else {
            JavascriptExecutor js = driver;
            HashMap<String, Object> scrollObject = new HashMap<>();
            scrollObject.put("direction", "down");
            js.executeScript("mobile: scroll", scrollObject);
        }
        for (WebElement element : sortingTextList) {
            if (!list.contains(driverManagerUtils.getElementText(element)))
                list.add(driverManagerUtils.getElementText(element));
        }
        return list;
    }

    public boolean isShowResultsCTADisplayed() {
        return driverManagerUtils.isElementDisplayed(btnShowResults);
    }

    public boolean isResetCTADisplayed() {
        return driverManagerUtils.isElementDisplayed(btnReset);
    }

    public void clickShowResultsButton() {
        driverManagerUtils.clickElement(btnShowResults);
    }

    public void clickResetButton() {
        driverManagerUtils.clickElement(btnReset);
    }

    public void clickOnFirstProductImage() {
        driverManagerUtils.clickElement(productImage);
    }

    public void clickOnRelevancyInfoToolTip() {
        driverManagerUtils.clickElement(relevancyInfoTooltip);
    }

    public void clickOnSecondProductImage() {
        driverManagerUtils.clickElement(productImage1);
    }

    public boolean isFilterCTADisplayed() {
        return driverManagerUtils.isElementDisplayed(productFilterButton);
    }

    public void clickFilterCTAButton() {
        driverManagerUtils.clickElement(productFilterButton);
    }

    public boolean isFilterBoxDisplayed() {
        return driverManagerUtils.isElementDisplayed(filterBox);
    }

    public List<String> getAllFilterOptionText() {
        List<String> list = new ArrayList<>();
        for (WebElement element : filterOptionsList) {
            list.add(driverManagerUtils.getElementText(element));
        }
        return list;
    }

    public boolean isFilterShowResultsCTADisplayed() {
        return driverManagerUtils.isElementDisplayed(btnFilterShowResults);
    }

    public boolean isCloseButtonInFilterBoxDisplayed() {
        return driverManagerUtils.isElementDisplayed(btnCloseInFilterBox);
    }

    public void clickCloseButtonInFilterBoxButton() {
        driverManagerUtils.clickElement(btnCloseInFilterBox);
    }
}
