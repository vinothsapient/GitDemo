package com.testx.web.api.selenium.restassured.qe.ui.stepdefinitions;

import com.testx.web.api.selenium.restassured.qe.ui.context.TestContext;
import com.testx.web.api.selenium.restassured.qe.ui.enums.ApplicationInputs;
import com.testx.web.api.selenium.restassured.qe.ui.enums.ECommInputs;
import com.testx.web.api.selenium.restassured.qe.ui.pageobjects.OrderHistoryPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class OrderHistoryStepDef {

    OrderHistoryPage orderHistoryPage;

    public OrderHistoryStepDef(TestContext testContext) {
        this.orderHistoryPage = new OrderHistoryPage(testContext);
    }

    @And("User is redirected to {string} screen")
    public void verifyOrdersHistoryScreenOnOrderHistoryPage(String expectedMessage) {
        Assert.assertEquals(orderHistoryPage.getYourOrdersHeaderText(), expectedMessage);
    }

    @And("User is able to see No Order History Image on Order History Page")
    public void verifyNoOrderHistoryImageOnOrderHistoryPage() {
        Assert.assertTrue(orderHistoryPage.isNoOrderHistoryImagePresent());
    }

    @And("User is able to see No Order History text {string} on Order History Page")
    public void verifyNoOrderHistoryTextOnOrderHistoryPage(String expectedMessage) {
        Assert.assertEquals(orderHistoryPage.getNoOrderHistoryText(), expectedMessage);
    }

    @And("User is able to see Order status title {string} on Order Status page")
    public void verifyOrderStatusTitleOnOrderStatusPage(String expectedText) {
        Assert.assertEquals(orderHistoryPage.getOrderStatusTitleText(), expectedText);
    }

    @And("User is able to see Order Number and Order Placed on Order Status page")
    public void verifyOrderNumberAndOrderPlacedOnOrderStatusPage() {
        Assert.assertTrue(orderHistoryPage.isOrderNumberAndOrderDateInfoTextPresent());
    }

    @And("User is able to see estimated pickup date on Order Status page")
    public void verifyEstimatedPickupDatePresent() {
        Assert.assertTrue(orderHistoryPage.isEstimatedPickupTextPresent());
    }
    
    @And("User is able to see Pick up details Section on Order Status page")
    public void verifyPickupDetailsSectionOnOrderStatus() {
        Assert.assertTrue(orderHistoryPage.isPickupDetailsHeaderTextPresent());
    }
    
    @And("User is able to see map thumbnail for the store on Order Status page")
    public void verifyMapThumbnailOnOrderStatusPage() {
        Assert.assertTrue(orderHistoryPage.isOrderMapThumbnailPresent());
    }
    
    @And("User is able to see CTA to get directions on Order Status page")
    public void verifyGetDirectionsCTAOnOrderStatusPage() {
        Assert.assertTrue(orderHistoryPage.isGetDirectionsCTAPresent());
    }
    
    @And("User is able to see Order Details Section on Order Status page")
    public void verifyOrderDetailsSectionOnOrderStatusPage() {
        Assert.assertTrue(orderHistoryPage.isOrderDetailsHeaderTextPresent());
    }
    
    @And("Order Details section should show CTA to take me to the order details landing page")
    public void verifyFullOrderDetailsCTAOnOrderStatusPage() {
        Assert.assertTrue(orderHistoryPage.isFullOrderDetailsRightArrowPresent());
    }
    
    @And("User is able to see Supporting text and mail on Order Status page")
    public void verifySupportingTextAndMailOnOrderStatusPage() {
        Assert.assertEquals(orderHistoryPage.getOrderStatusSupportingText(), ApplicationInputs.SUPPORTING_TEXT.getValue());
        Assert.assertTrue(orderHistoryPage.isOrderStatusSupportingEmailTextPresent());
    }

    @Then("User is able to see Order Status on Your Orders page")
    public void verifyOrderStatusOnYourOrdersPage() {
        Assert.assertTrue(orderHistoryPage.isOrderStatusPresent());
    }

    @Then("User is able to see Order Date on Your Orders page")
    public void verifyOrderDateOnYourOrdersPage() {
        Assert.assertTrue(orderHistoryPage.isOrderDatePresent());
    }

    @Then("User is able to see Order ID on Your Orders page")
    public void verifyOrderIdOnYourOrdersPage() {
        Assert.assertTrue(orderHistoryPage.isOrderIdPresent());
    }

    @Then("User is able to see Order Tile Image on Your Orders page")
    public void verifyOrderTileImageOnYourOrdersPage() {
        Assert.assertTrue(orderHistoryPage.isOrderTileImagePresent());
    }

    @When("User clicks on {string} Order from Order history list page")
    public void userClicksOnOrderFromOrderHistoryListPage(String orderStatus) {
        orderHistoryPage.clickOnOrder(orderStatus);
    }

    @And("User clicks on View Full Order Details button on Order Status page")
    public void userClickOnViewFullOrderDetailsButton() {
        orderHistoryPage.clickFullOrderDetailsButton();
    }

    @And("User should be able to see Order Details header on View Your Order Details page")
    public void verifyOrderDetailsHeader() {
        Assert.assertTrue(orderHistoryPage.isOrderDetailsHeaderTitleTextPresent());
    }

    @And("User should be able to see Order Date on View Your Order Details page")
    public void verifyOrderDateOnViewYourOrderDetailsPage() {
        Assert.assertTrue(orderHistoryPage.isOrderDateTextPresent());
        Assert.assertTrue(orderHistoryPage.isActualOrderDateTextPresent());
    }

    @And("User should be able to see Order Number on View Your Order Details page")
    public void verifyOrderNumberOnViewYourOrderDetailsPage() {
        Assert.assertTrue(orderHistoryPage.isOrderNumberTextPresent());
        Assert.assertTrue(orderHistoryPage.isActualOrderNumberTextPresent());
    }

    @And("User should be able to see Order Total on View Your Order Details page")
    public void verifyOrderTotalOnViewYourOrderDetailsPage() {
        Assert.assertTrue(orderHistoryPage.isOrderTotalTextPresent());
        Assert.assertTrue(orderHistoryPage.isActualOrderTotalTextPresent());
    }

    @And("User should be able to see Items in Order title on View Your Order Details page")
    public void verifyItemsInOrderTitleOnViewYourOrderDetailsPage() {
        Assert.assertTrue(orderHistoryPage.isItemsInOrderHeaderTextPresent());
    }

    @And("User should be able to see Product thumbnail on View Your Order Details page")
    public void verifyProductThumbnailOnViewYourOrderDetailsPage() {
        Assert.assertTrue(orderHistoryPage.isProductThumbnailPresent());
    }

    @And("User should be able to see Product price on View Your Order Details page")
    public void verifyProductPriceOnViewYourOrderDetailsPage() {
        Assert.assertTrue(orderHistoryPage.isProductPricePresent());
    }

    @And("User should be able to see Product description on View Your Order Details page")
    public void verifyProductDescriptionOnViewYourOrderDetailsPage() {
        Assert.assertTrue(orderHistoryPage.isProductDescriptionPresent());
    }

    @And("User should be able to see Product quantity on View Your Order Details page")
    public void verifyProductQuantityOnViewYourOrderDetailsPage() {
        Assert.assertTrue(orderHistoryPage.isProductQuantityPresent());
    }

    @And("User should be able to see CTA to Buy Again on View Your Order Details page")
    public void verifyCTAToBuyAgainOnViewYourOrderDetailsPage() {
        Assert.assertTrue(orderHistoryPage.isBuyAgainButtonPresent());
    }

    @And("User should be able to see Payment Information title on View Your Order Details page")
    public void verifyPaymentInformationTitleOnViewYourOrderDetailsPage() {
        Assert.assertTrue(orderHistoryPage.isPaymentInformationTitleTextPresent());
    }

    @And("User should be able to see Card details and expiry on View Your Order Details page")
    public void verifyCardDetailsAndExpiryOnViewYourOrderDetailsPage() {
        Assert.assertTrue(orderHistoryPage.isPaymentExpiryTextPresent());
    }

    @And("User should be able to see Store Information title on View Your Order Details page")
    public void verifyStoreInformationTitleOnViewYourOrderDetailsPage() {
        Assert.assertTrue(orderHistoryPage.isStoreInformationTitleTextPresent());
    }

    @And("User should be able to see Order Summary title on View Your Order Details page")
    public void verifyOrderSummaryTitleOnViewYourOrderDetailsPage() {
        Assert.assertTrue(orderHistoryPage.isOrderSummaryTextPresent());
    }

    @And("User should be able to see Item Total on View Your Order Details page")
    public void verifyItemTotalOnViewYourOrderDetailsPage() {
        Assert.assertTrue(orderHistoryPage.isItemTotalTextPresent());
        Assert.assertTrue(orderHistoryPage.isItemTotalValueTextPresent());
    }

    @And("User should be able to see tax on View Your Order Details page")
    public void verifyTaxOnViewYourOrderDetailsPage() {
        Assert.assertTrue(orderHistoryPage.isTaxTextPresent());
        Assert.assertTrue(orderHistoryPage.isEstimatedTaxValuePresent());
    }

    @And("User should be able to see Order total on View Your Order Details page")
    public void verifyEstimatedOrderTotalOnViewYourOrderDetailsPage() {
        Assert.assertTrue(orderHistoryPage.isEstimatedOrderTextPresent());
        Assert.assertTrue(orderHistoryPage.isEstimatedOrderTotalTextPresent());
    }

    @And("User is able to see graphical section on Order Status page")
    public void verifyGraphicalSectionOnOrderStatusPage() {
        Assert.assertTrue(orderHistoryPage.isGraphicalImagePresent());
    }

    @And("User is able to see {string} text and Date of Cancellation on Order Status page")
    public void verifyCanceledTextAndDateOfCancellationPresent(String expectedText) {
        Assert.assertTrue(orderHistoryPage.getEstimatedPickupText().contains(expectedText));
    }

    @And("User is able to see Cancellation Reason title on Order Status page")
    public void verifyCancellationReasonTitleOnOrderStatusPage() {
        Assert.assertEquals(orderHistoryPage.getOrderStatusCancelTitleText(), ECommInputs.CANCELLATION_REASON.getValue());
    }

    @And("User is able to see Cancellation Reason Description text on Order Status page")
    public void verifyOrderCancellationDescriptionPresent() {
        Assert.assertEquals(orderHistoryPage.getOrderStatusCancelReasonText(), ECommInputs.CANCELLATION_REASON_TEXT.getValue());
    }

    @And("User is able to see Items Cancelled title on Order Status page")
    public void verifyItemsCancelledTitleOnOrderStatusPage() {
        Assert.assertEquals(orderHistoryPage.getItemsCancelledTitleText(), ECommInputs.ITEMS_CANCELLED.getValue());
    }

    @And("User is able to see Cancelled item Image on Order Status page")
    public void verifyCancelledItemImageOnOrderStatusPage() {
        Assert.assertTrue(orderHistoryPage.isCancelledItemImagePresent());
    }

    @And("User is able to see Cancelled item Price on Order Status page")
    public void verifyCancelledItemPriceOnOrderStatusPage() {
        Assert.assertTrue(orderHistoryPage.isCancelledItemPricePresent());
    }

    @And("User is able to see Cancelled item Quantity on Order Status page")
    public void verifyCancelledItemQuantityOnOrderStatusPage() {
        Assert.assertTrue(orderHistoryPage.isCancelledItemQuantityPresent());
    }

    @And("User is able to see Cancelled item Descriptions on Order Status page")
    public void verifyCancelledItemDescriptionsOnOrderStatusPage() {
        Assert.assertTrue(orderHistoryPage.isCancelledItemDescriptionsPresent());
    }

    @And("User is able to see Cancelled item Reason on Order Status page")
    public void verifyCancelledItemReasonOnOrderStatusPage() {
        Assert.assertTrue(orderHistoryPage.isCancelledReasonMessagePresent());
    }

    @Then("User is able to see End text {string} on Your Orders page")
    public void verifyEndTextOnYourOrdersPage(String expectedText) {
        Assert.assertEquals(orderHistoryPage.getYourOrdersEndText(), expectedText);
    }
}
