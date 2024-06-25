package com.testx.web.api.selenium.restassured.qe.ui.stepdefinitions;

import com.testx.web.api.selenium.restassured.qe.ui.context.TestContext;
import com.testx.web.api.selenium.restassured.qe.ui.enums.ApplicationInputs;
import com.testx.web.api.selenium.restassured.qe.ui.enums.ECommInputs;
import com.testx.web.api.selenium.restassured.qe.ui.pageobjects.HomePage;
import com.testx.web.api.selenium.restassured.qe.ui.pageobjects.PDPPage;
import com.testx.web.api.selenium.restassured.qe.ui.pageobjects.RatingsPage;
import com.testx.web.api.selenium.restassured.qe.ui.webdriver.DriverManagerUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.StaleElementReferenceException;
import org.testng.Assert;

public class PDPPageStepDef {

    PDPPage pDPPage;
    RatingsPage ratingsPage;
    HomePage homePage;

    public PDPPageStepDef(TestContext testContext) {
        this.pDPPage = new PDPPage(testContext);
        this.ratingsPage = new RatingsPage(testContext);
        this.homePage = new HomePage(testContext);
    }

    @Then("User is able to see Product details page")
    public void verifyProductDetailsPage(){
        Assert.assertTrue(pDPPage.isProductDetailsPageDisplayed());
    }

    @When("User clicks back button on Product Details page")
    public void userTapOnButtonOnPDPPage() {
        pDPPage.clickBackButtonOnPDP();
    }

    @And("User is able see to Back button on Product details page")
    public void verifyBackButtonOnProductDetailsPage() {
        Assert.assertTrue(pDPPage.isBackButtonOnPDPPresent());
    }

    @And("User is able to see the search icon on Product Details Page")
    public void verifyProductSearchIconPresent() {
        Assert.assertTrue(pDPPage.isSearchIconPresent());
    }

    @And("User is able to see the scanner on Shop Page")
    @And("User is able to see the scanner on More Page")
    @And("User is able to see the scanner on Home Page")
    @And("User is able to see the scanner on Product Details Page")
    public void verifyProductScannerPresent() {
        Assert.assertTrue(pDPPage.isScannerOnPDPPresent());
    }

    @And("User is able to see the Search Products and Coupons default text on Shop Page")
    @And("User is able to see the Search Products and Coupons default text on More Page")
    @And("User is able to see the Search Products and Coupons default text on Home Page")
    @And("User is able to see the Search Products and Coupons text default on PDP")
    public void verifyDefaultTextInSearchBoxOnPDP() {
        Assert.assertEquals(pDPPage.getSearchDefaultText(), ApplicationInputs.SEARCH_PRODUCTS_AND_COUPONS.getValue());
    }

    @And("User clicks Products and Coupons Search box on Home Page")
    public void userClicksProductAndCouponsSearchBoxOnHomePage() {
        pDPPage.clickOnProductsAndCouponsSearchBox();
    }

    @And("User enter the {string} in searchBar on Home Page")
    public void enterKeys(String value) {
        pDPPage.enterSearchKeysOnSearchBar(value);
    }

    @And("User is able see to Product tab on Product and Coupons listing page")
    public void verifyProductTabOnProductAndCouponsListingPage() {
        Assert.assertTrue(pDPPage.isProductTabOnPLPPresent());
    }

    @And("User is able see to Product Title on Product details page")
    public void verifyProductTitleOnProductDetailsPage() {
        Assert.assertTrue(pDPPage.isProductTitleOnPDPPresent());
    }

    @And("User is able see to SKU on Product details page")
    public void verifyToSKUOnProductDetailsPage() {
        if (DriverManagerUtils.configuration.mobilePlatform().equalsIgnoreCase("android")) {
            Assert.assertTrue(pDPPage.isProductSKUOnPDPPresent());
        }
    }

    @And("User is able see to Rating on Product details page")
    public void verifyToRatingOnProductDetailsPage() {
        Assert.assertTrue(pDPPage.isProductRatingOnPDPPresent());
    }

    @And("User is able see to Description on Product details page")
    public void verifyToDescriptionOnProductDetailsPage() {
        Assert.assertTrue(pDPPage.isProductDescriptionOnPDPPresent());
    }

    @And("User is able see to Strike Through Price on Product details page")
    public void verifyToStrikeThroughPriceOnProductDetailsPage() {
        if (DriverManagerUtils.configuration.mobilePlatform().equalsIgnoreCase("android")) {
            Assert.assertTrue(pDPPage.isProductStrikeThroughPriceOnPDPPresent());
        }
    }

    @And("User is able see to Product Description Tab on Product details page")
    public void verifyToProductDescriptionTabOnProductDetailsPage() {
        Assert.assertTrue(pDPPage.isProductDescriptionTabOnPDPPresent());
    }

    @And("User is able see to Product Specifications Tab on Product details page")
    public void verifyToProductSpecificationsTabOnProductDetailsPage() {
        Assert.assertTrue(pDPPage.isProductSpecificationTabOnPDPPresent());
    }

    @And("User is able see to Product Information on Product details page")
    public void verifyToProductInformationOnProductDetailsPage() {
        Assert.assertTrue(pDPPage.isProductInformationOnPDPPresent());
    }

    @When("User clicks Specifications Tab on Product Details page")
    public void userClicksSpecificationsTabOnProductDetailsPage() {
        pDPPage.clickProductSpecificationTabOnPDP();
    }

    @When("User verifies Specifications Tab columns counts are present on Product Details page")
    public void verifySpecificationColumnsPresent() {
        Assert.assertTrue(pDPPage.specificationColumnsCount()>1);
    }

    @Then("User able to see you may also like section on Product details page")
    public void userAbleToSeeYouMayAlsoLikeSectionOnProductDetailsPage() {
        Assert.assertTrue(pDPPage.isYouMayAlsoLikePresent());
    }

    @And("User See Minimum {int} and maximum {int} tabs showing")
    public void userSeeMinimumAndMaximumTabsShowing(int low, int high) {
        if (DriverManagerUtils.configuration.mobilePlatform().equalsIgnoreCase("android")) {
            Assert.assertTrue(pDPPage.verifyRecommendationCountInBetween(low, high));
        }
    }

    @And("User verify Product name is displayed on you may also like for Product details Page")
    public void verifyProductNameIsDisplayedOnYouMayAlsoLikeForProductDetailsPage() {
        homePage.swipeUpLittle();
        homePage.swipeUpLittle();
        Assert.assertTrue(pDPPage.isCarouselShowingProductName());
    }

    @And("User verify each product showing price in carousel")
    public void userVerifyEachProductShowingPriceInCarousel() {
        if (DriverManagerUtils.configuration.mobilePlatform().equalsIgnoreCase("android")) {
            Assert.assertTrue(pDPPage.isCarouselPriceShowing());
        }
    }

    @Then("User is able to see rating snapshot header on pdp page")
    public void isRatingHeaderPresent() {
        Assert.assertTrue(ratingsPage.isRatingHeaderPresent());
    }

    @Given("User scroll to {string} field of page on SmartCoupon Page")
    @Given("User scroll to {string} field of page")
    public void scrollByUsingText(String value) throws Exception {
        ratingsPage.driverManagerUtils.scrollByUsingText(value);
    }

    @Then("User is able to see overall rating on pdp page")
    public void isOverallRatingPresent() {
        Assert.assertTrue(ratingsPage.isOverallRatingPresent());
    }

    @Then("User is able to see five rating fields on pdp page")
    public void isRatingFieldsPresent() {
        Assert.assertTrue(ratingsPage.isRatingFieldsPresent());
    }

    @Then("User is able to see review search field on pdp page")
    public void isReviewSearchField() {
        Assert.assertTrue(ratingsPage.isReviewSearchField());
    }

    @Then("User enter value {string} review search field on pdp page")
    public void enterValueReviewSearchField(String value) {
        ratingsPage.enterValueReviewSearchField(value);
    }

    @Then("User is able to see rating selector drop down btn on pdp page")
    public void isRatingSelectorDropDownPresent() {
        Assert.assertTrue(ratingsPage.isRatingSelectorDropDownPresent());
    }

    @Then("User select {string} rating selector drop down btn on pdp page")
    public void selectRatingSelectorDropDown(String value) {
        ratingsPage.clickRatingSelectorDropDown();
    }

    @Then("User is able to see locale selector drop down btn on pdp page")
    public void isLocaleSelectorDropDownPresent() {
        Assert.assertTrue(ratingsPage.isLocaleSelectorDropDownPresent());
    }

    @Then("User verify 1-8 of and Reviews Present")
    public void userVerifyAndPresent() {
        Assert.assertTrue(ratingsPage.isRatingsCountPresent());
    }

    @Then("User verify previous and next button present")
    public void userVerifyPreviousAndNextButtonPresent() {
        Assert.assertTrue(ratingsPage.verifyReviewsButtonsPresent());
    }

    @When("User tap on next review Button")
    public void userTapOnNextReviewButton() {
        ratingsPage.userPressNextReviewButton();
    }

    @Then("User is presented with {string} link on the fulfillment selector")
    public void userIsPresentedWithLinkOnTheFulfillmentSelector(String expectedText) {
        Assert.assertEquals(pDPPage.getMinimumQuantityLinkText(), expectedText);
    }

    @When("User clicks minimum quantity link on Product details page")
    public void userClicksMinimumQuantityLinkOnProductDetailsPage() {
        pDPPage.clickMinimumQuantityLink();
    }

    @Then("User is able to see {string} header on overlay popup")
    public void verifyOverlayPopupHeader(String expectedText) {
        Assert.assertEquals(pDPPage.getMinimumQuantityOverlayHeaderText(), expectedText);
    }

    @Then("User is able to see {string} content on overlay popup")
    public void verifyOverlayPopupContent(String expectedText) {
        Assert.assertEquals(pDPPage.getMinimumQuantityOverlayContentText(), expectedText);
    }

    @Then("User is able to see {string} button on overlay popup")
    public void verifyOverlayPopupClose(String expectedText) {
        Assert.assertEquals(pDPPage.getMinimumQuantityOverlayCloseText(), expectedText);
    }

    @When("User clicks close button on overlay popup")
    public void userClicksCloseButtonOnOverlayPopup() {
        pDPPage.clickCloseButton();
    }

    @Then("User is able to see In Store Pickup label on Cart Page")
    @Then("User is able to see In Store Pickup label on pdp")
    public void verifyInStorePickupLabelOnPdp() {
        Assert.assertEquals(pDPPage.getInStorePickupText(), ECommInputs.IN_STORE_PICKUP.getValue());
    }

    @And("User is able to see Free Pickup label on Checkout Page")
    @And("User is able to see Free Pickup label on Cart Page")
    @And("User is able to see Free Pickup label on pdp")
    public void verifyFreePickupLabelOnPdp() {
        Assert.assertEquals(pDPPage.getFreePickupLabelText(), ECommInputs.FREE_PICKUP.getValue());
    }

    @And("User is able to see Free Pickup Day on Checkout Page")
    @And("User is able to see Free Pickup Day on Cart Page")
    @And("User is able to see Free Pickup Day on pdp")
    public void verifyFreePickupDayOnPdp() {
        if (pDPPage.getFreePickupDayText().equals(ECommInputs.TODAY.getValue())) {
            Assert.assertEquals(pDPPage.getFreePickupDayText(), (ECommInputs.TODAY.getValue()));
        } else {
            Assert.assertEquals(pDPPage.getFreePickupDayText(), (ECommInputs.TOMORROW.getValue()));
        }
    }

    @And("User is able to see Order Within label on Checkout Page")
    @And("User is able to see Order Within label on Cart Page")
    @And("User is able to see Order Within label on pdp")
    public void verifyOrderWithinLabelOnPdp() {
        Assert.assertEquals(pDPPage.getOrderWithinLabelText(), ECommInputs.ORDER_WITHIN.getValue());
    }

    @And("User is able to see Order Within data on Checkout Page")
    @And("User is able to see Order Within data on Cart Page")
    @And("User is able to see Order Within data on pdp")
    public void verifyOrderWithinDataOnPdp() {
        Assert.assertTrue(pDPPage.isOrderWithinDataPresent());
    }

    @And("User is able to see PickUp address on Cart Page")
    @And("User is able to see PickUp address on pdp")
    public void verifyPickUpAddressOnPdp() {
        Assert.assertTrue(pDPPage.isPickUpAddressPresent());
    }

    @And("User is able to see stock status {string} on pdp")
    public void verifyStockStatusOnPdp(String expectedStatus) {
        Assert.assertEquals(pDPPage.getStockStatusText(), expectedStatus);
    }

    @And("User is able to see warning message on pdp")
    @And("User is able to see Note Description on pdp")
    public void verifyNoteDescriptionOnPdp() {
        Assert.assertEquals(pDPPage.getNoteDescriptionText(), ECommInputs.NOTE_DESC.getValue());
    }

    @And("User is able to see Note Description for Out of Stock on pdp")
    public void verifyNoteDescriptionForOutOfStockOnPdp() {
        Assert.assertEquals(pDPPage.getNoteDescriptionText(), ECommInputs.NOTE_DESC_OUT_OF_STOCK.getValue());
    }

    @And("User is able to see Note Description for Limited Stock on pdp")
    public void verifyNoteDescriptionForLimitedStockOnPdp() {
        Assert.assertEquals(pDPPage.getNoteDescriptionText(), ECommInputs.LIMITED_STOCK.getValue());
    }

    @And("User is able to see Decrease count CTA for a product on Cart Page")
    @And("User is able to see Decrease count CTA for a product on pdp")
    public void verifyRemoveCountOnPdp() {
        Assert.assertTrue(pDPPage.isRemoveCounterPresent());
    }

    @And("User is able to see count Number for a product on Cart Page")
    @And("User is able to see count Number for a product on pdp")
    public void verifyCountNumberOnPdp() {
        Assert.assertTrue(pDPPage.isCountNumberPresent());
    }

    @And("User is able to see Increase count CTA for a product on Cart Page")
    @And("User is able to see Increase count CTA for a product on pdp")
    public void verifyAddCountOnPdp() {
        Assert.assertTrue(pDPPage.isAddCounterPresent());
    }

    @And("User is able to see Add To Cart button on pdp")
    public void verifyAddToCartButtonOnPdp() {
        Assert.assertEquals(pDPPage.getAddToCartText(), ECommInputs.ADD_TO_CART.getValue());
    }

    @And("User is not able to see quantity selector for a product on pdp")
    public void verifyQuantitySelectorNotPresentOnPdp() {
        Assert.assertFalse(pDPPage.isCountNumberPresent());
    }

    @And("User is not able to see Add To Cart button on pdp")
    public void verifyAddToCartButtonNotPresentOnPdp() {
        Assert.assertFalse(pDPPage.isAddToCartButtonPresent());
    }

    @And("User is able to see Check Nearby Stores CTA on pdp")
    public void verifyCheckNearbyStoresCTAOnPdp() {
        Assert.assertFalse(pDPPage.isCheckNearbyStoresCTAPresent());
    }

    @Then("User is able to see Product Quantity as {string} on pdp")
    @Then("User is able to see Default Product Quantity as {string} on pdp")
    public void verifyQuantitySelectorOnPdp(String expectedQuantity) {
        Assert.assertEquals(pDPPage.getProductQuantityText(), expectedQuantity);
    }

    @Then("User is able to see decrease CTA is disabled on the quantity selector")
    @Then("User is able to see Default decrease CTA is disabled on the quantity selector")
    public void verifyDefaultDecreaseCTAIsDisabledOnQuantitySelector() {
        Assert.assertFalse(pDPPage.isProductCountRemoveButtonEnabled());
    }

    @Then("User is able to see Default increase CTA is enabled on the quantity selector")
    public void verifyDefaultIncreaseCTAEnabledOnPdp() {
        Assert.assertTrue(pDPPage.isProductCountAddButtonEnabled());
    }

    @When("User clicks increase CTA on the quantity selector")
    public void userClickIncreaseCTAOnQuantitySelector() {
        pDPPage.clickAddProductCountButton();
    }

    @Then("User is able to see Decrease CTA is enabled on the quantity selector")
    public void verifyDecreaseCTAOnQuantitySelectorEnabled() {
        Assert.assertTrue(pDPPage.isProductCountRemoveButtonEnabled());
    }

    @When("User clicks decrease CTA on the quantity selector")
    public void clickOnDecreaseCTAOnQuantitySelector() {
        pDPPage.clickRemoveProductCountButton();
    }

    @When("User selects item quantity {string} from the overlay")
    @When("User selects maximum allowed quantity {string} of the product")
    public void selectMaximumAllowedQuantity(String quantity) {
        pDPPage.selectItemQuantity(quantity);
    }

    @Then("User is able to see increase CTA is disabled on the quantity selector")
    public void verifyIncreaseCTADisabled() {
        Assert.assertFalse(pDPPage.isProductCountAddButtonEnabled());
    }

    @When("User clicks quantity count text on quantity selector")
    public void userClicksQuantityCountTextOnQuantitySelector() {
        pDPPage.clickOnQuantitySelector();
    }

    @Then("User is able to see quantity options as an overlay")
    public void verifyOverlayPresentOnPdp() {
        Assert.assertTrue(pDPPage.isOverlayPresent());
    }

    @Then("User is able to see quantity options overlay is dismissed")
    public void verifyQuantityOptionsOverlayDismissed() {
        DriverManagerUtils.sleep(5);
        Assert.assertFalse(pDPPage.isOverlayPresent());
    }

    @And("User is able to see {string} store text on pdp")
    public void verifyStoreTextOnPdp(String expectedValue) {
        Assert.assertEquals(pDPPage.getSelectAStoreText(), expectedValue);
    }

    @When("User clicks on Select A Store CTA")
    public void userClicksOnSelectAStoreCTA() {
        pDPPage.clickSelectAStoreCTA();
    }

    @And("User is able to see {string} Change store header on pdp")
    public void verifyChangeStoreHeaderTextOnPdp(String expectedValue) {
        Assert.assertEquals(pDPPage.getChangeStoreHeader(), expectedValue);
    }

    @When("User clicks on Change Store Close Button")
    public void userClicksOnChangeStoreCloseButton() {
        pDPPage.clickChangeStoreCloseButton();
    }

    @When("User clicks on Add To Cart button on pdp")
    public void userClicksOnAddToCartButtonOnPdp() {
        pDPPage.clickAddToCartButton();
    }

    @Then("User is able to Max Item Reached warning message on pdp")
    public void verifyMaxItemReachedWarningOnPdp() {
        Assert.assertEquals(pDPPage.getMaxItemReachedTitle(), ECommInputs.MAX_ITEM_TITLE.getValue());
        Assert.assertEquals(pDPPage.getMaxItemReachedDesc(), ECommInputs.MAX_ITEM_DESC.getValue());
    }

    @When("User clicks Max Item Reached Close button on pdp")
    public void userClicksOnMaxItemReachedCloseButtonOnPdp() {
        pDPPage.clickMaxItemReachedCloseButton();
    }
}
