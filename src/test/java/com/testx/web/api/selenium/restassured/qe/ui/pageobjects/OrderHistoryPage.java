package com.testx.web.api.selenium.restassured.qe.ui.pageobjects;

import com.testx.web.api.selenium.restassured.qe.ui.context.TestContext;
import com.testx.web.api.selenium.restassured.qe.ui.stepdefinitions.BaseSetup;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class OrderHistoryPage extends BaseSetup {

    public OrderHistoryPage(TestContext testContext) {
        super(testContext);
        PageFactory.initElements(testContext.getDriverManager().getDriver(), this);
    }

    @FindBy(xpath = "//*[@resource-id='FdAppHeader:Title'] | //*[@name='FdAppHeader:Title']")
    protected  static WebElement yourOrdersHeader;

    @FindBy(xpath = "//*[@resource-id='ZeroOrderListContainer:testID']/com.horcrux.svg.SvgView | //*[@name='ZeroOrderListContainer:testID']/XCUIElementTypeOther")
    protected  static WebElement noOrderHistoryImage;

    @FindBy(xpath = "//*[@resource-id='ZeroOrderListTxt:testID'] | //*[@name='ZeroOrderListTxt:testID']")
    protected  static WebElement noOrderHistoryText;

    @FindBy(xpath = "//*[@resource-id='OrderStatus:testID'] | //*[@name='OrderStatus:testID']")
    protected  static List<WebElement> orderStatusList;

    @FindBy(xpath = "//*[@resource-id='OrderDate:testID'] | //*[@name='OrderDate:testID']")
    protected  static List<WebElement> orderDateList;

    @FindBy(xpath = "//*[@resource-id='OrderID:testID'] | //*[@name='OrderID:testID']")
    protected  static List<WebElement> orderIdList;

    @FindBy(xpath = "//*[@resource-id='OrderTile:ImageContainer']//android.widget.ImageView | //*[@name='OrderTile:ImageContainer']")
    protected  static List<WebElement> orderTileImageList;
    
    @FindBy(xpath = "//*[@resource-id='OrderStatus:OrderInfoTestId'] | //*[@name='OrderStatus:OrderInfoTestId']")
    protected  static WebElement orderNumberAndDateInfo;
    
    @FindBy(xpath = "//*[@resource-id='OrderStatus:StatusText'] | //*[@name='OrderStatus:StatusText']")
    protected  static WebElement orderStatusTitle;
    
    @FindBy(xpath = "//*[@resource-id='OrderStatus:EstimationTextTestId'] | //*[@name='OrderStatus:EstimationTextTestId']")
    protected  static WebElement estimatedPickup;
    
    @FindBy(xpath = "(//*[@resource-id='FDCheckoutTitle:HeaderTitle'])[1] | (//*[@name='FDCheckoutTitle:HeaderTitle'])[1]")
    protected  static WebElement pickupDetailsHeaderText;

    @FindBy(xpath = "(//*[@resource-id='FDCheckoutTitle:HeaderTitle'])[2] | (//*[@name='FDCheckoutTitle:HeaderTitle'])[2]")
    protected static WebElement orderDetailsHeaderText;

    @FindBy(xpath = "//*[@resource-id='OrderStatusSupportingSection:SupportHeading1'] | //*[@name='OrderStatusSupportingSection:SupportHeading1']")
    protected static WebElement OrderStatusSupportingText;

    @FindBy(xpath = "//*[@resource-id='OrderStatusSupportingSection:EmailId'] | //*[@name='OrderStatusSupportingSection:EmailId']")
    protected static WebElement OrderStatusSupportingEmailText;

    @FindBy(xpath = "//*[@resource-id='OrderStatus:MapTestId'] | //*[@name='OrderStatus:MapTestId']")
    protected static WebElement OrderMapThumbnail;

    @FindBy(xpath = "//android.widget.TextView[@content-desc='Get Directions'] | //android.widget.TextView[@name='Get Directions']")
    protected static WebElement getDirections;

    @FindBy(xpath = "//*[@resource-id='FDRowView:RightIcon'] | //*[@name='FDRowView:RightIcon']")
    protected static WebElement fullOrderDetailsRightArrow;
    
    @FindBy(xpath = "//*[@resource-id='OrderTitle:TestID'] | //*[@name='OrderTitle:TestID']")
    protected static WebElement orderDetailsHeaderTitleText;
    
    @FindBy(xpath = "(//*[@resource-id='OrderDate:TestID'])[1] | (//*[@name='OrderDate:TestID'])[1]")
    protected static WebElement orderDateText;
    
    @FindBy(xpath = "(//*[@resource-id='OrderDate:TestID'])[2] | (//*[@name='OrderDate:TestID'])[2]")
    protected static WebElement actualOrderDateText;
    
    @FindBy(xpath = "(//*[@resource-id='OrderValue:TestID']/android.widget.TextView)[1] | (//*[@name='OrderValue:TestID']/android.widget.TextView)[1]")
    protected static WebElement orderNumberText;
    
    @FindBy(xpath = "(//*[@resource-id='OrderValue:TestID']/android.widget.TextView)[2] | (//*[@name='OrderValue:TestID']/android.widget.TextView)[2]")
    protected static WebElement actualOrderNumberText;
    
    @FindBy(xpath = "(//*[@resource-id='OrderTotal:TestID']/android.widget.TextView)[1] | (//*[@name='OrderTotal:TestID']/android.widget.TextView)[1]")
    protected static WebElement orderTotalText;
    
    @FindBy(xpath = "(//*[@resource-id='OrderTotal:TestID']/android.widget.TextView)[2] | (//*[@name='OrderTotal:TestID']/android.widget.TextView)[1]")
    protected static WebElement actualOrderTotalText;
    
    @FindBy(xpath = "//android.widget.TextView[@content-desc='Items in Order'] | //[@name='Items in Order']")
    protected static WebElement itemsInOrderHeaderText;
    
    @FindBy(xpath = "//*[@resource-id='ItemImage:TestId'] | //*[@name='ItemImage:TestId']")
    protected static WebElement productThumbnail;
    
    @FindBy(xpath = "//*[@resource-id='ItemProductPrice:TestID'] | //*[@name='ItemProductPrice:TestID']")
    protected static WebElement productPrice;
    
    @FindBy(xpath = "//*[@resource-id='ItemProductDescriptions:TestID'] | //*[@name='ItemProductDescriptions:TestID']")
    protected static WebElement productDescription;
    
    @FindBy(xpath = "//*[@resource-id='ItemQuality:TestID'] | //*[@name='ItemQuality:TestID']")
    protected static WebElement productQuantity;
    
    @FindBy(xpath = "//android.view.ViewGroup[@content-desc='Buy Again'] | //android.view.ViewGroup[@name='Buy Again']")
    protected static WebElement buyAgainButton;
    
    @FindBy(xpath = "//*[@resource-id='FDCheckoutTitle:HeaderTitle'] | //*[@name='FDCheckoutTitle:HeaderTitle']")
    protected static WebElement paymentInformationTitleText;
    
    @FindBy(xpath = "//*[@resource-id='PaymentDescription:TestID'] | //*[@name='PaymentDescription:TestID']")
    protected static WebElement paymentExpiry;
    
    @FindBy(xpath = "//*[@text='Store Information'] | //*[@name='Store Information']")
    protected static WebElement storeInformationTitleText;
    
    @FindBy(xpath = "//*[@text='Order Summary'] | //*[@name='Order Summary']")
    protected static WebElement orderSummaryText;
    
    @FindBy(xpath = "//*[@resource-id='FDOrderSummary:ItemTotal']/android.widget.TextView | //*[@name='FDOrderSummary:ItemTotal']")
    protected static WebElement itemTotalText;
    
    @FindBy(xpath = "//*[@resource-id='FDOrderSummary:ItemTotalValue']/android.widget.TextView | //*[@name='FDOrderSummary:ItemTotalValue']")
    protected static WebElement itemTotalValueText;
    
    @FindBy(xpath = "//*[@resource-id='FDOrderSummary:EstimatedTax']/android.widget.TextView | //*[@name='FDOrderSummary:EstimatedTax']")
    protected static WebElement taxText;
    
    @FindBy(xpath = "//*[@resource-id='FDOrderSummary:EstimatedTaxValue']/android.widget.TextView | //*[@name='FDOrderSummary:EstimatedTaxValue']")
    protected static WebElement estimatedTaxValue;
    
    @FindBy(xpath = "//*[@resource-id='FDOrderSummary:EstimatedTotal']/android.widget.TextView | //*[@name='FDOrderSummary:EstimatedTotal']")
    protected static WebElement estimatedOrderText;
    
    @FindBy(xpath = "//*[@resource-id='FDOrderSummary:EstimatedTotalValue']/android.widget.TextView | //*[@name='FDOrderSummary:EstimatedTotalValue']")
    protected static WebElement estimatedOrderTotalText;
    
    @FindBy(xpath = "//*[@resource-id='OrderStatus:StatusIconsTestId'] | //*[@name='OrderStatus:StatusIconsTestId']")
    protected  static WebElement graphicalImage;
    
    @FindBy(xpath = "//*[@resource-id='orderStatusCancel:View']/android.widget.TextView[1] | //*[@name='orderStatusCancel:View']")
    protected  static WebElement orderStatusCancelTitle;

    @FindBy(xpath = "//*[@resource-id='orderStatusCancel:Text'] | //*[@name='orderStatusCancel:Text']")
    protected  static WebElement orderStatusCancelReasonText;
    
    @FindBy(xpath = "//*[@resource-id='ItemCancelled:TestID'] | //*[@name='ItemCancelled:TestID']")
    protected  static WebElement itemsCancelledTitle;

    @FindBy(xpath = "(//*[@resource-id='ItemImage:TestId'])[1] | (//*[@name='ItemImage:TestId'])[1]")
    protected  static WebElement cancelledItemImage;

    @FindBy(xpath = "(//*[@resource-id='ItemProductPrice:TestID'])[1] | (//*[@name='ItemProductPrice:TestID'])[1]")
    protected  static WebElement cancelledItemPrice;

    @FindBy(xpath = "(//*[@resource-id='ItemQuality:TestID'])[1] | (//*[@name='ItemQuality:TestID'])[1]")
    protected  static WebElement cancelledItemQuantity;

    @FindBy(xpath = "(//*[@resource-id='ItemsOrder:ItemDetailDescriptions'])[1] | (//*[@name='ItemsOrder:ItemDetailDescriptions'])[1]")
    protected  static WebElement cancelledItemDescriptions;

    @FindBy(xpath = "(//*[@resource-id='ItemErrorMessage:TestID'])[1] | (//*[@name='ItemErrorMessage:TestID'])[1]")
    protected  static WebElement cancelledReasonMessage;

    @FindBy(xpath = "//*[@resource-id='EndOfListText:endOfListText'] | //*[@name='EndOfListText:endOfListText']")
    protected  static WebElement yourOrdersEndText;

    public String getYourOrdersHeaderText() {
        return driverManagerUtils.getElementText(yourOrdersHeader);
    }

    public boolean isNoOrderHistoryImagePresent() {
        return driverManagerUtils.isElementDisplayed(noOrderHistoryImage);
    }

    public String getNoOrderHistoryText() {
        return driverManagerUtils.getElementText(noOrderHistoryText);
    }

    public boolean isOrderStatusPresent() {
        return driverManagerUtils.isElementDisplayed(orderStatusList.get(0));
    }

    public void clickOnOrder(String orderStatus) {
        for (WebElement element : orderStatusList) {
            if (driverManagerUtils.getElementText(element).equals(orderStatus)) {
                driverManagerUtils.clickElement(element);
                break;
            }
        }
    }

    public boolean isOrderDatePresent() {
        return driverManagerUtils.isElementDisplayed(orderDateList.get(0));
    }

    public boolean isOrderIdPresent() {
        return driverManagerUtils.isElementDisplayed(orderIdList.get(0));
    }

    public boolean isOrderTileImagePresent() {
        return driverManagerUtils.isElementDisplayed(orderTileImageList.get(0));
    }

    public boolean isOrderNumberAndOrderDateInfoTextPresent() {
        return driverManagerUtils.isElementDisplayed(orderNumberAndDateInfo);
    }

    public String getOrderStatusTitleText() {
        return driverManagerUtils.getElementText(orderStatusTitle);
    }

    public boolean isEstimatedPickupTextPresent() {
        return driverManagerUtils.isElementDisplayed(estimatedPickup);
    }
    
    public boolean isPickupDetailsHeaderTextPresent() {
        return driverManagerUtils.isElementDisplayed(pickupDetailsHeaderText);
    }

    public boolean isOrderMapThumbnailPresent() {
        return driverManagerUtils.isElementDisplayed(OrderMapThumbnail);
    }
    
    public boolean isGetDirectionsCTAPresent() {
        return driverManagerUtils.isElementDisplayed(getDirections);
    }
    
    public boolean isOrderDetailsHeaderTextPresent() {
        return driverManagerUtils.isElementDisplayed(orderDetailsHeaderText);
    }
    
    public boolean isFullOrderDetailsRightArrowPresent() {
        return driverManagerUtils.isElementDisplayed(fullOrderDetailsRightArrow);
    }
    
    public String getOrderStatusSupportingText() {
        return driverManagerUtils.getElementText(OrderStatusSupportingText);
    }

    public boolean isOrderStatusSupportingEmailTextPresent() {
        return driverManagerUtils.isElementDisplayed(OrderStatusSupportingEmailText);
    }

    public void clickFullOrderDetailsButton(){
        driverManagerUtils.clickElement(fullOrderDetailsRightArrow);
    }

    public boolean isOrderDetailsHeaderTitleTextPresent() {
        return driverManagerUtils.isElementDisplayed(orderDetailsHeaderTitleText);
    }

    public boolean isOrderDateTextPresent() {
        return driverManagerUtils.isElementDisplayed(orderDateText);
    }

    public boolean isActualOrderDateTextPresent() {
        return driverManagerUtils.isElementDisplayed(actualOrderDateText);
    }

    public boolean isOrderNumberTextPresent() {
        return driverManagerUtils.isElementDisplayed(orderNumberText);
    }

    public boolean isActualOrderNumberTextPresent() {
        return driverManagerUtils.isElementDisplayed(actualOrderNumberText);
    }

    public boolean isOrderTotalTextPresent() {
        return driverManagerUtils.isElementDisplayed(orderTotalText);
    }

    public boolean isActualOrderTotalTextPresent() {
        return driverManagerUtils.isElementDisplayed(actualOrderTotalText);
    }

    public boolean isItemsInOrderHeaderTextPresent() {
        return driverManagerUtils.isElementDisplayed(itemsInOrderHeaderText);
    }

    public boolean isProductThumbnailPresent() {
        return driverManagerUtils.isElementDisplayed(productThumbnail);
    }

    public boolean isProductPricePresent() {
        return driverManagerUtils.isElementDisplayed(productPrice);
    }

    public boolean isProductDescriptionPresent() {
        return driverManagerUtils.isElementDisplayed(productDescription);
    }

    public boolean isProductQuantityPresent() {
        return driverManagerUtils.isElementDisplayed(productQuantity);
    }

    public boolean isBuyAgainButtonPresent() {
        return driverManagerUtils.isElementDisplayed(buyAgainButton);
    }

    public boolean isPaymentInformationTitleTextPresent() {
        return driverManagerUtils.isElementDisplayed(paymentInformationTitleText);
    }

    public boolean isPaymentExpiryTextPresent() {
        return driverManagerUtils.isElementDisplayed(paymentExpiry);
    }

    public boolean isStoreInformationTitleTextPresent() {
        return driverManagerUtils.isElementDisplayed(storeInformationTitleText);
    }

    public boolean isOrderSummaryTextPresent() {
        return driverManagerUtils.isElementDisplayed(orderSummaryText);
    }

    public boolean isItemTotalTextPresent() {
        return driverManagerUtils.isElementDisplayed(itemTotalText);
    }

    public boolean isItemTotalValueTextPresent() {
        return driverManagerUtils.isElementDisplayed(itemTotalValueText);
    }

    public boolean isTaxTextPresent() {
        return driverManagerUtils.isElementDisplayed(taxText);
    }

    public boolean isEstimatedTaxValuePresent() {
        return driverManagerUtils.isElementDisplayed(estimatedTaxValue);
    }

    public boolean isEstimatedOrderTextPresent() {
        return driverManagerUtils.isElementDisplayed(estimatedOrderText);
    }

    public boolean isEstimatedOrderTotalTextPresent() {
        return driverManagerUtils.isElementDisplayed(estimatedOrderTotalText);
    }

    public boolean isGraphicalImagePresent() {
        return driverManagerUtils.isElementDisplayed(graphicalImage);
    }

    public String getEstimatedPickupText() {
        return driverManagerUtils.getElementText(estimatedPickup);
    }

    public String getOrderStatusCancelTitleText() {
        return driverManagerUtils.getElementText(orderStatusCancelTitle);
    }

    public String getOrderStatusCancelReasonText() {
        return driverManagerUtils.getElementText(orderStatusCancelReasonText);
    }

    public String getItemsCancelledTitleText() {
        return driverManagerUtils.getElementText(itemsCancelledTitle);
    }

    public boolean isCancelledItemImagePresent() {
        return driverManagerUtils.isElementDisplayed(cancelledItemImage);
    }

    public boolean isCancelledItemPricePresent() {
        return driverManagerUtils.isElementDisplayed(cancelledItemPrice);
    }

    public boolean isCancelledItemQuantityPresent() {
        return driverManagerUtils.isElementDisplayed(cancelledItemQuantity);
    }

    public boolean isCancelledItemDescriptionsPresent() {
        return driverManagerUtils.isElementDisplayed(cancelledItemDescriptions);
    }

    public boolean isCancelledReasonMessagePresent() {
        return driverManagerUtils.isElementDisplayed(cancelledReasonMessage);
    }

    public String getYourOrdersEndText() {
        return driverManagerUtils.getElementText(yourOrdersEndText);
    }
}
