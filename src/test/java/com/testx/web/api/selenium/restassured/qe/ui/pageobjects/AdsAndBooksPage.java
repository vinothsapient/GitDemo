package com.testx.web.api.selenium.restassured.qe.ui.pageobjects;

import com.testx.web.api.selenium.restassured.qe.common.utils.TestVariables;
import com.testx.web.api.selenium.restassured.qe.ui.context.TestContext;
import com.testx.web.api.selenium.restassured.qe.ui.stepdefinitions.BaseSetup;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdsAndBooksPage extends BaseSetup {

    public AdsAndBooksPage(TestContext testContext) {
        super(testContext);
        PageFactory.initElements(testContext.getDriverManager().getDriver(), this);
    }

    @FindBy(xpath = "//*[@resource-id='FDAdRowView:Title'] | //*[@name='FDAdRowView:ListItemView']")
    protected static List<WebElement> adsAndBooksList;

    @FindBy(xpath = "//*[@content-desc='Ads and Books'] | //*[@name='FdAppHeader:Title']")
    protected static WebElement adsAndBooksHeader;

    @FindBy(xpath = "//*[@resource-id='StoreYourStoreTitle:Text'] | //*[@name='StoreYourStoreTitle:Text']")
    protected static WebElement forYourStore;

    @FindBy(xpath = "//*[@resource-id='StoreAddressTextView:TextCopy'] | //*[@name='StoreAddressTextView:TextCopy']")
    protected static WebElement storeAddress;

    @FindBy(xpath = "//*[@resource-id='storeHeaderLinkText:TestID'] | //*[@name='storeHeaderLinkText:TestID']")
    protected static WebElement changeStore;

    @FindBy(xpath = "//*[@content-desc='Current Ad'] | //*[@name='Current Ad']")
    protected static WebElement currentAdHeader;

    @FindBy(xpath = "//*[@content-desc='FDPlpSearchHeader:backIcon'] | //*[@name='FDPlpSearchHeader:backIcon']")
    protected static WebElement backButtonPDP;

    @FindBy(xpath = "//*[@content-desc='FDCategoryHeader:BackIcon'] | //*[@name='FDCategoryHeader:BackIcon']")
    protected static WebElement backBtnCategory;

    @FindBy(xpath = "//*[@content-desc='Back Button'] | //*[@name='FilterHeaderLeftIconTestId:Back']")
    protected static WebElement backBtAvailability;

    @FindBy(xpath = "//*[@resource-id='AdsAndBooksLanding:TopCategoryLabel'] | //*[@name='AdsAndBooksLanding:TopCategory']")
    protected static List<WebElement> topCategoryList;

    @FindBy(xpath = "//*[@content-desc='Close Button'] | //*[@name='Close Button']")
    protected static WebElement popCloseBtn;

    @FindBy(xpath = "//*[@resource-id='StoreChangeCTA:ChangeButton'] | //*[@name='StoreChangeCTA:ChangeButton']")
    protected static WebElement changeStoreButton;

    @FindBy(xpath = "//android.view.ViewGroup[contains(@resource-id,'AdsBooksProductInfo')]")
    protected static WebElement addsInDetails;

    @FindBy(xpath = "(//android.widget.ImageView[@content-desc='Click on Ad Page'])[1] | //XCUIElementTypeOther[@name='FDCarousel:TestID']")
    protected static WebElement addImage;

    @FindBy(xpath = "//android.widget.ImageView/following-sibling::android.view.ViewGroup")
    protected static List<WebElement> images;

    @FindBy(xpath = "//*[@content-desc='Share Ad'] | //*[@name='FdAppHeader:RightIcon']")
    protected static WebElement addImageShareButton;

    @FindBy(xpath = "//*[@resource-id='TFDExploreAdsBooksView:LeftView'] | //*[@name='TFDExploreAdsBooksView:LeftView']")
    protected static WebElement exploreAdsBooksImage;

    @FindBy(xpath = "//*[@resource-id='FDExploreAdsBooksView:Title'] | //*[@name='FDExploreAdsBooksView:Title']")
    protected static WebElement exploreAdsBooksTitle;

    @FindBy(xpath = "//*[@resource-id='FDExploreAdsBooksView:StoreTitle'] | //*[@name='FDExploreAdsBooksView:StoreTitle']")
    protected static WebElement exploreAdsBooksStoreTitle;

    @FindBy(xpath = "//*[@resource-id='FDExploreAdsBooksView:Store'] | //*[@name='FDExploreAdsBooksView:Store']")
    protected static WebElement exploreAdsBooksStore;

    @FindBy(xpath = "//*[@text='Featured'] | //*[@name='Featured']")
    protected static WebElement featuredTitle;

    @FindBy(xpath = "//*[@text='Find Products by Category'] | //*[@name='Find Products by Category']")
    protected static WebElement findProductsByCategory;

    public String getAdsAndBooksHeaderText() {
        return driverManagerUtils.getElementText(adsAndBooksHeader);
    }

    public String getForYourStoreText() {
        return driverManagerUtils.getElementText(forYourStore);
    }

    public boolean isForYourStoreText() {
        return driverManagerUtils.isElementDisplayed(storeAddress);
    }

    public String getChangeStoreText() {
        return driverManagerUtils.getElementText(changeStore);
    }

    public void closePopUp() {
        driverManagerUtils.clickElement(popCloseBtn);
    }

    public void clickStoreChange() {
        driverManagerUtils.clickElement(changeStoreButton);
    }

    public void clickAddsImage() {
        driverManagerUtils.clickElement(addImage);
    }

    public void isAddsPresent(){
        driverManagerUtils.isElementDisplayed(addsInDetails);
    }

    public void clickSingleAddOnImage() {
        images.get(0).click();
    }

    public boolean isShareImageButtonPresent() {
        return driverManagerUtils.isElementDisplayed(addImageShareButton);
    }

    public boolean isUserOnAddPage() {
        return driverManagerUtils.isElementDisplayed
                (driver.findElement(By.xpath("//android.widget.TextView[@content-desc='" + TestVariables.getValue("firstAddName") + "']")));
    }

    public void clickFirstAdd() {
        TestVariables.store("firstAddName", driverManagerUtils.getElementText(adsAndBooksList.get(0)));
        driverManagerUtils.clickElement(adsAndBooksList.get(0));
    }

    public void clickSecondAdd() {
        TestVariables.store("secondAddName", driverManagerUtils.getElementText(adsAndBooksList.get(1)));
        driverManagerUtils.clickElement(adsAndBooksList.get(1));
    }

    public void clickThirdAdd() {
        TestVariables.store("ThirdAddName", driverManagerUtils.getElementText(adsAndBooksList.get(2)));
        driverManagerUtils.clickElement(adsAndBooksList.get(2));
    }

    public void clickBackButtonOnPDP() {
        driverManagerUtils.clickElement(backButtonPDP);
    }

    public void clickBackButtononCategory() {
        driverManagerUtils.clickElement(backBtnCategory);
    }

    public void clickBackButtonOnProductAvailability() {
        driverManagerUtils.clickElement(backBtAvailability);
    }

    public int getListAds() {
        return adsAndBooksList.size();
    }

    public String getCurrentAdHeaderLabel() {
        return driverManagerUtils.getElementText(currentAdHeader);
    }

    public List<String> getTopCategoryLabels() {
        List<String> list = new ArrayList<>();
        for (WebElement element : topCategoryList) {
            list.add(driverManagerUtils.getElementText(element));
        }
        return list;
    }

    public boolean isExploreAdsBooksImagePresent() {
        return driverManagerUtils.isElementDisplayed(exploreAdsBooksImage);
    }

    public String getExploreAdsBooksTitleText() {
        return driverManagerUtils.getElementText(exploreAdsBooksTitle);
    }

    public String getExploreAdsBooksStoreTitleText() {
        return driverManagerUtils.getElementText(exploreAdsBooksStoreTitle);
    }

    public boolean isExploreAdsBooksStorePresent() {
        return driverManagerUtils.isElementDisplayed(exploreAdsBooksStore);
    }

    public void clickExploreAdsBooksButton() {
        driverManagerUtils.clickElement(exploreAdsBooksTitle);
    }

    public boolean isFeaturedTitlePresent() {
        return driverManagerUtils.isElementDisplayed(featuredTitle);
    }

    public boolean isFindProductsByCategoryPresent() {
        return driverManagerUtils.isElementDisplayed(findProductsByCategory);
    }
}
