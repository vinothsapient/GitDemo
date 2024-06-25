package com.testx.web.api.selenium.restassured.qe.ui.pageobjects;

import com.testx.web.api.selenium.restassured.qe.ui.context.TestContext;
import com.testx.web.api.selenium.restassured.qe.ui.stepdefinitions.BaseSetup;
import com.testx.web.api.selenium.restassured.qe.ui.webdriver.DriverManagerUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage extends BaseSetup {

    public CartPage(TestContext testContext) {
        super(testContext);
        PageFactory.initElements(testContext.getDriverManager().getDriver(), this);
    }

    @FindBy(xpath = "//*[@resource-id='PDPAddToCartModalHeadingText:TestID'] | //*[@name='PDPAddToCartModalHeadingText:TestID']")
    protected static WebElement viewCartHeader;

    @FindBy(xpath = "(//*[@resource-id='PDPAddToCartModalHeadingContainer:TestID']//com.horcrux.svg.SvgView)[1] | //*[@name='PDPAddToCartModalHeadingContainer:TestID']")
    protected static WebElement viewCartHeaderSuccessIcon;

    @FindBy(xpath = "//*[@resource-id='PDPNonLoggedInUserModalText:testID'] | //*[@name='PDPNonLoggedInUserModalText:testID']")
    protected static WebElement viewCartGuestUserContent;

    @FindBy(xpath = "(//*[@resource-id='PDPAddToCartModalHeadingContainer:TestID']/android.view.ViewGroup)[2] | (//*[@name='PDPAddToCartModalHeadingContainer:TestID']//XCUIElementTypeOther)[2]")
    protected static WebElement viewCartCloseButton;

    @FindBy(xpath = "//*[@resource-id='PDPAddToCartModalLoginBtn:TestID']//android.widget.TextView | //*[@name='PDPAddToCartModalLoginBtn:TestID']")
    protected static WebElement viewCartGuestUserLoginButton;

    @FindBy(xpath = "//*[@resource-id='PDPAddToCartModalSignUpBtn:TestID']//android.widget.TextView | //*[@name='PDPAddToCartModalSignUpBtn:TestID']")
    protected static WebElement viewCartGuestUserSignUpButton;

    @FindBy(xpath = "//*[@resource-id='PDPLoggedInUserModalImage:TestID'] | //*[@name='PDPLoggedInUserModalImage:TestID']")
    protected static WebElement viewCartProductImage;

    @FindBy(xpath = "//*[@resource-id='PDPLoggedInUserModalDescription:TestID'] | //*[@name='PDPLoggedInUserModalDescription:TestID']")
    protected static WebElement viewCartProductDescription;

    @FindBy(xpath = "//*[@resource-id='PDPLoggedInUserModalListPrice:TestID'] | //*[@name='PDPLoggedInUserModalListPrice:TestID']")
    protected static WebElement viewCartProductListPrice;

    @FindBy(xpath = "//*[@resource-id='PDPLoggedInUserModalTotalPrice:TestID'] | //*[@name='PDPLoggedInUserModalTotalPrice:TestID']")
    protected static WebElement viewCartProductTotalPrice;

    @FindBy(xpath = "//*[@resource-id='PDPAddToCartModalAddToCartBtn:TestID']//android.widget.TextView | //*[@name='PDPAddToCartModalAddToCartBtn:TestID']")
    protected static WebElement viewCartButton;

    @FindBy(xpath = "//*[@resource-id='FDCartHeaderHeading:TestID'] | //*[@name='FDCartHeaderHeading:TestID']")
    protected static WebElement cartHeader;

    @FindBy(xpath = "//*[@content-desc='Your Cart is Empty'] | //*[@name='FDCartHeaderSubHeadingItem:TestID']")
    protected static WebElement emptyCartSubHeader;

    @FindBy(xpath = "//*[@resource-id='PlpNoItems:Title'] | //*[@name='PlpNoItems:Title']")
    protected static WebElement emptyCartTitle;

    @FindBy(xpath = "//*[@resource-id='PlpNoItems:Message'] | //*[@name='PlpNoItems:Message']")
    protected static WebElement emptyCartMessage;

    @FindBy(xpath = "//*[@resource-id='PlpNoItems:Button']//android.widget.TextView | //*[@name='PlpNoItems:Button']")
    public static WebElement exploreProductCategoriesButton;

    @FindBy(xpath = "//*[@resource-id='FDCartHeaderSubHeading:TestID'] | //*[@name='FDCartHeaderSubHeading:TestID']")
    protected static WebElement cartSubHeader;

    @FindBy(xpath = "//*[@resource-id='FDCartHeaderSubHeadingItem:TestID'] | //*[@name='FDCartHeaderSubHeadingItem:TestID']")
    protected static WebElement cartTotalItems;

    @FindBy(xpath = "//*[@resource-id='CartProductModalImageTestID:TestId'] | //*[@name='CartProductModalImageTestID:TestId']")
    protected static WebElement cartProductModalImage;

    @FindBy(xpath = "//*[@resource-id='CartProductProductPriceTestID:TestID'] | //*[@name='CartProductProductPriceTestID:TestID']")
    protected static WebElement cartProductPrice;

    @FindBy(xpath = "//*[@resource-id='CartProductEachProductPriceTestID:TestID'] | //*[@name='CartProductEachProductPriceTestID:TestID']")
    protected static WebElement cartProductEachProductPrice;

    @FindBy(xpath = "//*[@resource-id='CartProductDescriptionsTestID:TestID'] | //*[@name='CartProductDescriptionsTestID:TestID']")
    protected static WebElement cartProductDescription;

    @FindBy(xpath = "//*[@resource-id='CartProductProductQuantityTestID:TestID'] | //*[@name='CartProductProductQuantityTestID:TestID']")
    protected static WebElement cartProductQuantity;

    @FindBy(xpath = "//*[@resource-id='CartProductIconTestID:TestID']/android.view.ViewGroup | //*[@name='CartProductIconTestID:TestID']")
    protected static WebElement removeProductButton;

    @FindBy(xpath = "//*[@resource-id='FDOrderSummary:Main']/android.widget.TextView | //*[@name='FDOrderSummary:Main']")
    protected static WebElement orderSummaryLabel;

    @FindBy(xpath = "//*[@resource-id='FDOrderSummary:ItemTotal']/android.widget.TextView | //*[@name='FDOrderSummary:ItemTotal']")
    protected static WebElement itemsTotalLabel;

    @FindBy(xpath = "//*[@resource-id='FDOrderSummary:ItemTotalValue']/android.widget.TextView | //*[@name='FDOrderSummary:ItemTotalValue']")
    protected static WebElement itemsTotalValue;

    @FindBy(xpath = "//*[@resource-id='FDOrderSummary:EstimatedTax']/android.widget.TextView | //*[@name='FDOrderSummary:EstimatedTax']")
    protected static WebElement estimatedTaxLabel;

    @FindBy(xpath = "//*[@resource-id='FDOrderSummary:EstimatedTaxValue']/android.widget.TextView | //*[@name='FDOrderSummary:EstimatedTaxValue']")
    protected static WebElement estimatedTaxValue;

    @FindBy(xpath = "//*[@resource-id='FDOrderSummary:EstimatedTotal']/android.widget.TextView | //*[@name='FDOrderSummary:EstimatedTotal']")
    protected static WebElement estimatedTotalLabel;

    @FindBy(xpath = "//*[@resource-id='FDOrderSummary:EstimatedTotalValue']/android.widget.TextView | //*[@name='FDOrderSummary:EstimatedTotalValue']")
    protected static WebElement estimatedTotalValue;

    @FindBy(xpath = "//*[@content-desc='Checkout']//android.widget.TextView | //*[@name='FDButton:CheckoutClick']")
    protected static WebElement checkoutButton;

    @FindBy(xpath = "//*[@resource-id='FDButton:PayPalClick'] | //*[@name='FDButton:PayPalClick']")
    protected static WebElement payPalButton;

    @FindBy(xpath = "//*[@resource-id='headerText'] | //*[@name='headerText']")
    protected static WebElement payPalHeader;

    @FindBy(xpath = "//*[@resource-id='email'] | //*[@name='email']")
    protected static WebElement payPalEmail;

    @FindBy(xpath = "//*[@resource-id='btnNext'] | //*[@name='btnNext']")
    protected static WebElement payPalNextButton;

    @FindBy(xpath = "//*[@resource-id='cancelLink']/android.widget.TextView | //*[@name='cancelLink']")
    protected static WebElement payPalCancelLink;

    @FindBy(xpath = "//*[@resource-id='password'] | //*[@name='password']")
    protected static WebElement payPalPassword;

    @FindBy(xpath = "//*[@resource-id='btnLogin'] | //*[@name='btnLogin']")
    protected static WebElement payPalLoginButton;

    @FindBy(xpath = "//*[@resource-id='payment-submit-btn'] | //*[@name='payment-submit-btn']")
    protected static WebElement payPalContinueToReviewButton;

    public String getViewCartHeaderText() {
        return driverManagerUtils.getElementText(viewCartHeader);
    }

    public boolean isViewCartHeaderPresent() {
        return driverManagerUtils.isElementDisplayed(viewCartHeader);
    }

    public boolean isViewCartHeaderSuccessIconPresent() {
        return driverManagerUtils.isElementDisplayed(viewCartHeaderSuccessIcon);
    }

    public String getViewCartGuestUserContentText() {
        return driverManagerUtils.getElementText(viewCartGuestUserContent);
    }

    public boolean isViewCartGuestUserCloseButtonPresent() {
        return driverManagerUtils.isElementDisplayed(viewCartCloseButton);
    }

    public void clickViewCartGuestUserCloseButton() {
        driverManagerUtils.clickElement(viewCartCloseButton);
    }

    public String getViewCartGuestUserLoginText() {
        return driverManagerUtils.getElementText(viewCartGuestUserLoginButton);
    }

    public void clickViewCartGuestUserLoginButton() {
        driverManagerUtils.clickElement(viewCartGuestUserLoginButton);
    }

    public String getViewCartGuestUserSignUpText() {
        return driverManagerUtils.getElementText(viewCartGuestUserSignUpButton);
    }

    public void clickViewCartGuestUserSignUpButton() {
        driverManagerUtils.clickElement(viewCartGuestUserSignUpButton);
    }

    public boolean isViewCartProductImagePresent() {
        return driverManagerUtils.isElementDisplayed(viewCartProductImage);
    }

    public boolean isViewCartProductDescriptionPresent() {
        return driverManagerUtils.isElementDisplayed(viewCartProductDescription);
    }

    public boolean isViewCartProductListPricePresent() {
        return driverManagerUtils.isElementDisplayed(viewCartProductListPrice);
    }

    public boolean isViewCartProductTotalPricePresent() {
        return driverManagerUtils.isElementDisplayed(viewCartProductTotalPrice);
    }

    public String getViewCartButtonText() {
        return driverManagerUtils.getElementText(viewCartButton);
    }

    public void clickOnViewCartButton() {
        driverManagerUtils.clickElement(viewCartButton);
    }

    public String getCartHeaderText() {
        if (!driverManagerUtils.isElementDisplayed(cartHeader)) {
            DriverManagerUtils.sleep(10);
        }
        return driverManagerUtils.getElementText(cartHeader);
    }

    public String getEmptyCartSubHeaderText() {
        return driverManagerUtils.getElementText(emptyCartSubHeader);
    }

    public String getEmptyCartTitleText() {
        return driverManagerUtils.getElementText(emptyCartTitle);
    }

    public String getEmptyCartMessageText() {
        return driverManagerUtils.getElementText(emptyCartMessage);
    }

    public String getExploreProductCategoriesText() {
        return driverManagerUtils.getElementText(exploreProductCategoriesButton);
    }

    public void clickExploreProductCategoriesButton() {
        driverManagerUtils.clickElement(exploreProductCategoriesButton);
    }

    public String getCartSubTotalText() {
        return driverManagerUtils.getElementText(cartSubHeader);
    }

    public String getTotalItemsText() {
        return driverManagerUtils.getElementText(cartTotalItems);
    }

    public boolean isModelProductImagePresent() {
        return driverManagerUtils.isElementDisplayed(cartProductModalImage);
    }

    public void clickOnModelProductImage() {
        driverManagerUtils.clickElement(cartProductModalImage);
    }

    public boolean isProductPriceDisplayed() {
        return driverManagerUtils.isElementDisplayed(cartProductPrice);
    }

    public boolean isEachProductPriceDisplayed() {
        return driverManagerUtils.isElementDisplayed(cartProductEachProductPrice);
    }

    public boolean isProductDescriptionDisplayed() {
        return driverManagerUtils.isElementDisplayed(cartProductDescription);
    }

    public boolean isCartProductQuantityDisplayed() {
        return driverManagerUtils.isElementDisplayed(cartProductQuantity);
    }

    public boolean isCartRemoveProductButtonDisplayed() {
        return driverManagerUtils.isElementDisplayed(removeProductButton);
    }

    public void clickOnRemoveProductButton() {
        driverManagerUtils.clickElement(removeProductButton);
    }

    public String getOrderSummaryHeaderText() {
        return driverManagerUtils.getElementText(orderSummaryLabel);
    }

    public String getItemsTotalText() {
        return driverManagerUtils.getElementText(itemsTotalLabel);
    }

    public boolean isItemsTotalValuePresent() {
        return driverManagerUtils.isElementDisplayed(itemsTotalValue);
    }

    public String getEstimatedTaxText() {
        return driverManagerUtils.getElementText(estimatedTaxLabel);
    }

    public boolean isEstimatedTaxValuePresent() {
        return driverManagerUtils.isElementDisplayed(estimatedTaxValue);
    }

    public String getEstimatedTotalText() {
        return driverManagerUtils.getElementText(estimatedTotalLabel);
    }

    public boolean isEstimatedTotalValuePresent() {
        return driverManagerUtils.isElementDisplayed(estimatedTotalValue);
    }

    public String getCheckOutButtonText() {
        return driverManagerUtils.getElementText(checkoutButton);
    }

    public void clickOnCheckOutButton() {
        driverManagerUtils.clickElement(checkoutButton);
    }

    public boolean isPayPalButtonPresent() {
        return driverManagerUtils.isElementDisplayed(payPalButton);
    }

    public void clickOnPayPalButton() {
        driverManagerUtils.clickElement(payPalButton);
    }

    public String getPayPalHeaderText() {
        return driverManagerUtils.getElementText(payPalHeader);
    }

    public void enterPaypalEmail(String inputText) {
        driverManagerUtils.enterText(payPalEmail, inputText);
    }

    public void clickPaypalNextButton() {
        driverManagerUtils.clickElement(payPalNextButton);
    }

    public void enterPaypalPassword(String password) {
        driverManagerUtils.enterText(payPalPassword, password);
    }

    public void clickPaypalLoginButton() {
        driverManagerUtils.clickElement(payPalLoginButton);
    }

    public boolean isPayPalContinueToReviewButtonPresent() {
        return driverManagerUtils.isElementDisplayed(payPalContinueToReviewButton);
    }

    public void clickPaypalContinueToReviewButton() {
        driverManagerUtils.clickElement(payPalContinueToReviewButton);
    }

    public void clickPaypalCancelLink() {
        driverManagerUtils.clickElement(payPalCancelLink);
    }
}
