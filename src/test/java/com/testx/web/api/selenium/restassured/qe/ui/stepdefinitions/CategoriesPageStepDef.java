package com.testx.web.api.selenium.restassured.qe.ui.stepdefinitions;

import com.testx.web.api.selenium.restassured.qe.ui.context.TestContext;
import com.testx.web.api.selenium.restassured.qe.ui.enums.ApplicationInputs;
import com.testx.web.api.selenium.restassured.qe.ui.pageobjects.CategoriesPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.messages.internal.com.google.common.collect.Ordering;
import org.testng.Assert;

public class CategoriesPageStepDef {
    CategoriesPage categoriesPage;

    public CategoriesPageStepDef(TestContext testContext){
    this.categoriesPage = new CategoriesPage(testContext);
    }

    @Then("User is able to see Explore All Categories Header on Product Category Page")
    @Then("User is able to see Explore All Categories Header on Category Page")
    public void verifyExploreAllCategoriesOnProductCategoryPage() {
        Assert.assertEquals(categoriesPage.getExploreAllCategoriesHeaderText(), ApplicationInputs.EXPLORE_ALL_CATEGORIES.getValue());
    }

    @Then("User is able to see Explore Coupon Categories Header on Coupon Category Page")
    public void verifyExploreCouponCategoriesOnCouponCategoryPage() {
        Assert.assertEquals(categoriesPage.getExploreAllCategoriesHeaderText(), ApplicationInputs.EXPLORE_COUPON_CATEGORIES.getValue());
    }

    @And("User is able to see a Horizontally separated line after Explore All Categories title")
    public void verifyHorizontallySeparatedLineAfterExploreAllCategoriesTitle() {
        Assert.assertTrue(categoriesPage.isHorizontalSeparatorLineDisplayed());
    }

    @And("User is able to view search icon on Category Page")
    public void userIsAbleToViewSearchIconOnCategoryPage() {
        Assert.assertTrue(categoriesPage.isSearchIconDisplayed());
    }

    @When("User clicks on search icon Category Page")
    public void userClicksOnSearchIconCategoryPage() {
        categoriesPage.clickSearchButton();
    }

    @Then("User is able to enter text for a global search")
    public void userIsAbleToEnterTextForAGlobalSearch() {
    }

    @And("User is able to view back button on Category Page")
    public void userIsAbleToViewBackButtonOnCategoryPage() {
        Assert.assertTrue(categoriesPage.isBackButtonDisplayed());
    }

    @And("User is able to see Out of stock product on Plp Page")
    public void userIsAbleToSeeOutOfStockOnPlpPage() {
        Assert.assertEquals(categoriesPage.getOutOfStoreText(), ApplicationInputs.OUT_OF_STOCK.getValue());
    }

    @And("User is able to see IN Store Only on Plp Page")
    public void userIsAbleToSeeInStoreOnlyOnPlpPage() {
        Assert.assertTrue(categoriesPage.isInStoreOnlyDisplayed());
    }

    @When("User clicks on back button on Category Page")
    public void userClicksOnBackButtonOnCategoryPage() {
        categoriesPage.clickBackButton();
    }

    @And("User is able to view {string} under L4 Sub Categories Page")
    @And("User is able to view {string} under Sub Categories Page")
    @And("User is able to see {string} text on Category Page")
    public void verifyTextOnCategoryPage(String label) {
        Assert.assertTrue(categoriesPage.isElementPresent(label));
    }

    @And("User is able to see Featured section list in Alphabetical order")
    public void verifyFeaturedSectionListInAlphabeticalOrder() {
        Assert.assertTrue(Ordering.natural().isOrdered(categoriesPage.getFeaturedListText()));
    }

    @And("User is able to see Find Products by Category section list in Alphabetical order")
    public void verifyFindProductsByCategorySectionListInAlphabeticalOrder() {
        Assert.assertTrue(Ordering.natural().isOrdered(categoriesPage.getFindProductByCategoryListText()));
    }

    @And("User is able to view drilled down arrow beside Product of Featured section")
    @And("User is able to view drilled down arrow beside Product of Find Products by Category section")
    public void verifyDrilledDownArrowBesideProductOfFeaturedSection() {
        Assert.assertTrue(categoriesPage.isProductDrillDownArrowPresent());
    }

    @And("User clicks on {string} under L4 Sub Categories Page")
    @And("User clicks on {string} under Sub Categories Page")
    @When("User clicks on {string} under Find Products by Category section")
    @When("User tap on {string} radioButton from Sorting List")
    @When("User tap on {string} from Filters List")
    public void userClicksOnUnderFeaturedSection(String label) {
        categoriesPage.clickButton(label);
    }

    @And("User is able to view {string} as header on L4 Sub Categories Page")
    @Then("User is able to view {string} as header on Sub Categories Page")
    @Then("User is able to view {string} as header on drill down page")
    public void verifyProductAsHeaderOnDrillDownPage(String expectedHeader) {
        Assert.assertEquals(categoriesPage.getProductHeaderText(), expectedHeader);
    }

    @And("User is able to see total number of products searched on product and Coupon listing Page")
    @And("User is able to see total number of coupons searched on Coupon Search Page")
    @And("User is able to view total number of products searched on L4 Sub Categories Page")
    public void verifyTotalNumberOfProductsSearchedOnLSubCategoriesPage() {
        Assert.assertTrue(categoriesPage.isProductCountDisplayed());
    }

    @And("User is able to see Product list on Sub Category page in Alphabetical order")
    public void verifyProductListOnSubCategoryPageInAlphabeticalOrder() {
        Assert.assertTrue(Ordering.natural().isOrdered(categoriesPage.getFindProductByCategoryListText()));
    }

    @And("User is able to view All Categories under L4 Sub Categories Page")
    public void userIsAbleToViewAllCategoriesUnderLSubCategoriesPage() {
        Assert.assertTrue(categoriesPage.isAllCategoryTextDisplayed());
    }

    @And("User is able to view PLP product list in L4 Sub Categories Page")
    public void userIsAbleToViewProductListLSubCategoriesPage() {
        Assert.assertTrue(categoriesPage.isPlpProductListPresent());
    }

    @And("User is able to view Smart Coupon toggle button on PLP Page")
    public void verifySmartCouponToggleButtonOnPLPPage() {
        Assert.assertTrue(categoriesPage.isSmartCouponToggleButtonDisplayed());
    }

    @And("User clicks on Smart Coupon toggle button on PLP Page")
    public void userClicksOnSmartCouponToggleButtonOnPLPPage() {
        categoriesPage.clickSmartCouponToggleButton();
    }

    @And("User is able to view product image on L4 Sub Categories Page")
    @And("User is able to view product Image for every product")
    public void verifyProductImageShowingForEveryProduct() {
        Assert.assertTrue(categoriesPage.isProductImageDisplayed());
    }

    @When("User clicks on First Product from the List")
    public void userClicksOnFirstProductFromTheList() {
        categoriesPage.clickOnFirstProductImage();
    }

    @When("User clicks on relevancy info tooltip on Pdp Page")
    public void userClicksOnRelevancyInfoToolTipOnPdpPage() {
        categoriesPage.clickOnRelevancyInfoToolTip();
    }

    @When("User clicks on Second Product from the List")
    public void userClicksOnSecondProductFromTheList() {
        categoriesPage.clickOnSecondProductImage();
    }

    @And("User verify product Rating widget showing for every product")
    public void verifyProductRatingWidgetShowingForEveryProduct() {
        Assert.assertTrue(categoriesPage.isProductRatingWidgetDisplayed());
    }

    @And("User verify product Previous Price showing for every product")
    public void verifyProductPreviousPriceShowingForEveryProduct() {
        Assert.assertTrue(categoriesPage.isProductPreviousPriceDisplayed());
    }

    @And("User is able to see sort CTA")
    public void userIsAbleToSeeSortCTA() {
        Assert.assertTrue(categoriesPage.isProductSortButtonDisplayed());
    }

    @When("User clicks on sort CTA")
    public void userClicksOnSortCTA() {
        categoriesPage.clickSortCTAButton();
    }

    @Then("User is able to see Sorting Box Open Up")
    public void userIsAbleToSeeSortingBoxOpenUp() {
        Assert.assertTrue(categoriesPage.isSortingBoxDisplayed());
    }

    @And("User is able to see close button in Sorting Box")
    public void userIsAbleToSeeCloseButtonInSortingBox() {
        Assert.assertTrue(categoriesPage.isCloseButtonInSortingBoxDisplayed());
    }

    @When("User clicks on close button in Sorting box")
    public void userClicksOnCloseButtonInSortingBox() {
        categoriesPage.clickCloseButtonInSortingBoxButton();
    }

    @When("User select any other form of sort apart from Expiring Soon")
    @When("User select any other form of sort apart from Relevance")
    public void userSelectAnyOtherFormOfSortApartFromRelevance() {
        categoriesPage.selectOtherThanRelevance();
    }

    @And("User is able to see all sorting opting text")
    public void verifyTextOnSortingBox(DataTable table) {
        Assert.assertEquals(categoriesPage.getAllSortingOptionText(), table.asList());
    }

    @And("User is able to see Show Results CTA in Sorting Box")
    public void userIsAbleToSeeShowResultsCTAInSortingBox() {
        Assert.assertTrue(categoriesPage.isShowResultsCTADisplayed());
    }

    @Then("User is able to see Reset CTA in Sorting Box")
    public void userIsAbleToSeeResetCTAInSortingBox() {
        Assert.assertTrue(categoriesPage.isResetCTADisplayed());
    }

    @When("User clicks on Show Results CTA in Sorting Box")
    public void userClicksOnShowResultsCTAInSortingBox() {
        categoriesPage.clickShowResultsButton();
    }

    @When("User clicks on Reset CTA in Sorting Box")
    public void userClicksOnResetCTAInSortingBox() {
        categoriesPage.clickResetButton();
    }

    @When("User clicks on All Categories under L4 Sub Categories Page")
    public void userClicksOnAllCategoriesUnderLSubCategoriesPage() {
        categoriesPage.clickAllCategoryLink();
    }

    @And("User is able to see filter CTA")
    public void verifyFilterCTA() {
        Assert.assertTrue(categoriesPage.isFilterCTADisplayed());
    }

    @When("User clicks on filter CTA")
    public void userClicksOnFilterCTA() {
        categoriesPage.clickFilterCTAButton();
    }

    @Then("User is able to see Filter Box Open Up")
    public void verifyFilterBoxOpenUp() {
        Assert.assertTrue(categoriesPage.isFilterBoxDisplayed());
    }

    @And("User is able to see all filter options text")
    public void verifyAllFilterOptionsText(DataTable table) {
        Assert.assertTrue(categoriesPage.getAllFilterOptionText().contains(table.asList().get(0)));
        // Assert.assertEquals(categoriesPage.getAllFilterOptionText(), table.asList());
    }

    @And("User is able to see Show Results CTA in Filter Box")
    public void verifyShowResultsCTAInFilterBox() {
        Assert.assertTrue(categoriesPage.isFilterShowResultsCTADisplayed());
    }

    @And("User is able to see close button in Filter Box")
    public void verifyCloseButtonInFilterBox() {
        Assert.assertTrue(categoriesPage.isCloseButtonInFilterBoxDisplayed());
    }

    @When("User clicks on close button in Filter box")
    public void userClicksOnCloseButtonInFilterBox() {
        categoriesPage.clickCloseButtonInFilterBoxButton();
    }

    @And("User is unable to see all sorting opting text")
    public void userIsUnableToSeeAllSortingOptingText(DataTable table) {
        Assert.assertNotEquals(categoriesPage.getAllSortingOptionText(), table.asList());
    }
}
