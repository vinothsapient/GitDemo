package com.testx.web.api.selenium.restassured.qe.ui.stepdefinitions;

import com.testx.web.api.selenium.restassured.qe.common.utils.JsonUtil;
import com.testx.web.api.selenium.restassured.qe.ui.context.TestContext;
import com.testx.web.api.selenium.restassured.qe.ui.enums.ApplicationInputs;
import com.testx.web.api.selenium.restassured.qe.ui.enums.ECommInputs;
import com.testx.web.api.selenium.restassured.qe.ui.pageobjects.CartPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.util.Map;

public class CartPageStepDef {

    public static Map<String, String> loginDetails;
    public JsonUtil jsonReader = new JsonUtil();
    CartPage cartPage;

    public CartPageStepDef(TestContext testContext) {
        this.cartPage = new CartPage(testContext);
    }

    @Then("User is able to see Logged In User Header {string} on View Cart")
    @Then("User is able to see Guest User Header {string} on View Cart")
    public void verifyHeaderOnViewCart(String expectedValue) {
        Assert.assertTrue(cartPage.getViewCartHeaderText().contains(expectedValue));
    }

    @Then("User is not able to see View Cart Overlay")
    public void verifyViewCartOverlayNotPresent() {
        Assert.assertFalse(cartPage.isViewCartHeaderPresent());
    }

    @Then("User is able to see Header with Success Icon on View Cart")
    public void verifyHeaderWithSuccessIconOnViewCart() {
        Assert.assertTrue(cartPage.isViewCartHeaderSuccessIconPresent());
    }

    @Then("User is able to see Guest User Content {string} on View Cart")
    public void verifyGuestUserContentOnViewCart(String expectedValue) {
        Assert.assertEquals(cartPage.getViewCartGuestUserContentText(), expectedValue);
    }

    @Then("User is able to see close button on View Cart")
    public void verifyCloseButtonOnViewCart() {
        Assert.assertTrue(cartPage.isViewCartGuestUserCloseButtonPresent());
    }

    @When("User clicks close button on View Cart")
    public void userClicksCloseButtonOnViewCart() {
        cartPage.clickViewCartGuestUserCloseButton();
    }

    @And("User is able to see Guest User Login text on View Cart")
    public void verifyGuestUserLoginTextOnViewCart() {
        Assert.assertEquals(cartPage.getViewCartGuestUserLoginText(), ApplicationInputs.LOG_IN.getValue());
    }

    @And("User is able to see Guest User SignUp text on View Cart")
    public void verifyGuestUserSignUpTextOnViewCart() {
        Assert.assertEquals(cartPage.getViewCartGuestUserSignUpText(), ApplicationInputs.SIGN_UP.getValue());
    }

    @When("User clicks Guest User Login button on View Cart")
    public void userClicksGuestUserLoginButtonOnViewCart() {
        cartPage.clickViewCartGuestUserLoginButton();
    }

    @When("User clicks Guest User SignUp button on View Cart")
    public void userClicksGuestUserSignUpButtonOnViewCart() {
        cartPage.clickViewCartGuestUserSignUpButton();
    }

    @And("User is able to see Product Image on View Cart")
    public void verifyProductImageOnViewCart() {
        Assert.assertTrue(cartPage.isViewCartProductImagePresent());
    }

    @And("User is able to see Product Description on View Cart")
    public void verifyProductDescriptionOnViewCart() {
        Assert.assertTrue(cartPage.isViewCartProductDescriptionPresent());
    }

    @And("User is able to see Product List Price on View Cart")
    public void verifyProductListPriceOnViewCart() {
        Assert.assertTrue(cartPage.isViewCartProductListPricePresent());
    }

    @And("User is able to see Product Total Price on View Cart")
    public void verifyProductTotalPriceOnViewCart() {
        Assert.assertTrue(cartPage.isViewCartProductTotalPricePresent());
    }

    @And("User is able to see View Cart button on View Cart")
    public void verifyViewCartButtonOnViewCart() {
        Assert.assertTrue(cartPage.getViewCartButtonText().contains(ECommInputs.VIEW_CART.getValue()));
    }

    @And("User is able to see default number of items on View Cart CTA")
    public void verifyDefaultNumberOfItemsOnViewCartCTA() {
        Assert.assertTrue(cartPage.getViewCartButtonText().contains(ECommInputs.ONE.getValue()));
    }

    @When("User clicks View Cart button on View Cart Page")
    public void userClicksViewCartButtonOnViewCartPage() {
        cartPage.clickOnViewCartButton();
    }

    @Then("User is navigated to Cart Page")
    @Then("User is able to see Cart Header text on Cart Page")
    public void verifyCartHeaderTextOnCartPage() {
        Assert.assertEquals(cartPage.getCartHeaderText(), ApplicationInputs.CART.getValue());
    }

    @Then("User is able to see Empty Cart Sub Header text {string} on Cart Page")
    public void verifyEmptyCartSubHeaderTextOnCartPage(String expectedValue) {
        Assert.assertEquals(cartPage.getEmptyCartSubHeaderText(), expectedValue);
    }

    @Then("User is able to see Empty Cart title {string} on Cart Page")
    public void verifyEmptyCartTitleOnCartPage(String expectedValue) {
        Assert.assertEquals(cartPage.getEmptyCartTitleText(), expectedValue);
    }

    @Then("User is able to see Empty Cart Message on Cart Page")
    public void verifyEmptyCartMessageOnCartPage() {
        Assert.assertEquals(cartPage.getEmptyCartMessageText(), ECommInputs.EMPTY_CART_MESSAGE.getValue());
    }

    @And("User is able to see Explore Product Categories text in empty Cart Page")
    public void isExploreCouponCategoriesTextInEmptySearchCouponPage() {
        Assert.assertEquals(cartPage.getExploreProductCategoriesText(), ApplicationInputs.EXPLORE_PRODUCT_CATEGORIES.getValue());
    }

    @When("User clicks on Explore Product Categories button on Empty Cart Page")
    public void userClicksOnExploreProductCategoriesButtonOnEmptyCartPage() {
        cartPage.clickExploreProductCategoriesButton();
    }

    @Then("User is able to see Sub Total text on Cart Page")
    public void verifySubTotalTextOnCartPage() {
        Assert.assertTrue(cartPage.getCartSubTotalText().contains(ECommInputs.SUB_TOTAL.getValue()));
    }

    @Then("User is able to see Total Items text on Cart Page")
    public void verifyTotalItemsTextOnCartPage() {
        Assert.assertTrue(cartPage.getTotalItemsText().contains(ECommInputs.ITEMS.getValue()));
    }

    @Then("User is able to see Model Product Image on Cart Page")
    public void verifyModelProductImageOnCartPage() {
        Assert.assertTrue(cartPage.isModelProductImagePresent());
    }

    @When("User clicks Model Product Image on Cart Page")
    public void clicksModelProductImageOnCartPage() {
        cartPage.clickOnModelProductImage();
    }

    @Then("User is able to see Product Price on Cart Page")
    public void verifyProductPriceOnCartPage() {
        Assert.assertTrue(cartPage.isProductPriceDisplayed());
    }

    @Then("User is able to see Each Product Price on Cart Page")
    public void verifyEachProductPriceOnCartPage() {
        Assert.assertTrue(cartPage.isEachProductPriceDisplayed());
    }

    @Then("User is able to see Product Description on Cart Page")
    public void verifyProductDescriptionOnCartPage() {
        Assert.assertTrue(cartPage.isProductDescriptionDisplayed());
    }

    @Then("User is able to see Quantity Selector for a product on Cart Page")
    public void verifyQuantitySelectorForAProductOnCartPage() {
        Assert.assertTrue(cartPage.isCartProductQuantityDisplayed());
    }

    @Then("User is able to see Remove Product button for a product on Cart Page")
    public void verifyRemoveProductButtonForAProductOnCartPage() {
        Assert.assertTrue(cartPage.isCartRemoveProductButtonDisplayed());
    }

    @When("User clicks Remove Product button for a product on Cart Page")
    public void clicksRemoveProductButtonForAProductOnCartPage() {
        cartPage.clickOnRemoveProductButton();
    }

    @And("User is able to see Order Summary header text on Order Confirmation Page")
    @And("User is able to see Order Summary header text on Checkout Page")
    @Then("User is able to see Order Summary header text on Cart Page")
    public void verifyOrderSummaryHeaderTextOnCartPage() {
        Assert.assertEquals(cartPage.getOrderSummaryHeaderText(), ECommInputs.ORDER_SUMMARY.getValue());
    }

    @And("User is able to see Items Total text on Order Confirmation Page")
    @And("User is able to see Items Total text on Checkout Page")
    @Then("User is able to see Items Total text on Cart Page")
    public void verifyItemsTotalTextOnCartPage() {
        Assert.assertEquals(cartPage.getItemsTotalText(), ECommInputs.ITEM_TOTAL.getValue());
    }

    @Then("User is able to see Items Total value on Order Confirmation Page")
    @Then("User is able to see Items Total value on Checkout Page")
    @Then("User is able to see Items Total value on Cart Page")
    public void verifyItemsTotalValueOnCartPage() {
        Assert.assertTrue(cartPage.isItemsTotalValuePresent());
    }

    @And("User is able to see Estimated Tax text on Order Confirmation Page")
    @Then("User is able to see Estimated Tax text on Cart Page")
    public void verifyEstimatedTaxTextOnCartPage() {
        Assert.assertEquals(cartPage.getEstimatedTaxText(), ECommInputs.ESTIMATED_TAX.getValue());
    }

    @And("User is able to see Estimated Tax value on Order Confirmation Page")
    @And("User is able to see Tax value on Checkout Page")
    @Then("User is able to see Estimated Tax value on Cart Page")
    public void verifyEstimatedTaxValueOnCartPage() {
        Assert.assertTrue(cartPage.isEstimatedTaxValuePresent());
    }

    @And("User is able to see Estimated Total text on Order Confirmation Page")
    @Then("User is able to see Estimated Total text on Cart Page")
    public void verifyEstimatedTotalTextOnCartPage() {
        Assert.assertEquals(cartPage.getEstimatedTotalText(), ECommInputs.ESTIMATED_TOTAL.getValue());
    }

    @And("User is able to see Estimated Total value on Order Confirmation Page")
    @And("User is able to see Order Total value on Checkout Page")
    @Then("User is able to see Estimated Total value on Cart Page")
    public void verifyEstimatedTotalValueOnCartPage() {
        Assert.assertTrue(cartPage.isEstimatedTotalValuePresent());
    }

    @Then("User is able to see Check Out button text on Cart Page")
    public void verifyCheckOutButtonTextOnCartPage() {
        Assert.assertEquals(cartPage.getCheckOutButtonText(), ECommInputs.CHECK_OUT.getValue());
    }

    @When("User clicks Checkout button on Cart Page")
    public void userClicksCheckoutButtonOnCartPage() {
        cartPage.clickOnCheckOutButton();
    }

    @Then("User is able to see PayPal button text on Cart Page")
    public void verifyPayPalButtonTextOnCartPage() {
        Assert.assertTrue(cartPage.isPayPalButtonPresent());
    }

    @When("User clicks PayPal button on Cart Page")
    public void userClicksPayPalButtonOnCartPage() {
        cartPage.clickOnPayPalButton();
    }

    @Then("User is able to see PayPal header {string} on Paypal Page")
    public void verifyPayPalHeaderOnPaypalPage(String expectedHeader) {
        Assert.assertEquals(cartPage.getPayPalHeaderText(), expectedHeader);
    }

    @When("User enter the Paypal login details for {string}")
    public void userEnterTheLoginDetailsFor(String userType) {
        try {
            loginDetails = jsonReader.getData("PaypalLogin", userType);
            cartPage.enterPaypalEmail(loginDetails.get("UserName"));
            cartPage.clickPaypalNextButton();
            cartPage.enterPaypalPassword(loginDetails.get("Password"));
            cartPage.clickPaypalLoginButton();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Then("User is able to see Continue to Review Order button on Paypal Page")
    public void verifyContinueToReviewOrderOnPaypalPage() {
        Assert.assertTrue(cartPage.isPayPalContinueToReviewButtonPresent());
    }

    @When("User clicks Continue to Review Order button on Paypal Page")
    public void userClicksContinueToReviewOrderButtonOnCartPage() {
        cartPage.clickPaypalContinueToReviewButton();
    }

    @When("User clicks Cancel button on Paypal Page")
    public void userClicksCancelButtonOnCartPage() {
        cartPage.clickPaypalCancelLink();
    }
}
