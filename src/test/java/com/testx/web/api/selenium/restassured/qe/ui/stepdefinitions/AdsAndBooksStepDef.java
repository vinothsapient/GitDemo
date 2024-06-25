package com.testx.web.api.selenium.restassured.qe.ui.stepdefinitions;

import com.testx.web.api.selenium.restassured.qe.ui.context.TestContext;
import com.testx.web.api.selenium.restassured.qe.ui.enums.ApplicationInputs;
import com.testx.web.api.selenium.restassured.qe.ui.pageobjects.AdsAndBooksPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class AdsAndBooksStepDef {

    public AdsAndBooksPage adsAndBooksPage;

    public AdsAndBooksStepDef(TestContext testContext) {
        this.adsAndBooksPage = new AdsAndBooksPage(testContext);
    }

    @Then("User is on Ads and Books Page")
    public void verifyAdsAndBooksHeader() {
       Assert.assertEquals(adsAndBooksPage.getAdsAndBooksHeaderText(), ApplicationInputs.ADS_AND_BOOKS.getValue());
    }

    @Then("User is able to see For Your Store text on Ads And Books Page")
    public void verifyForYourStoreTextOnAdsAndBooksPage() {
        Assert.assertEquals(adsAndBooksPage.getForYourStoreText(), ApplicationInputs.FOR_YOUR_STORE.getValue());
    }

    @Then("User is able to see Store Address text on Ads And Books Page")
    public void verifyStoreAddressTextOnAdsAndBooksPage() {
        Assert.assertTrue(adsAndBooksPage.isForYourStoreText());
    }

    @Then("User is able to see Change Store text on Ads And Books Page")
    public void verifyChangeStoreTextOnAdsAndBooksPage() {
        Assert.assertEquals(adsAndBooksPage.getChangeStoreText(), ApplicationInputs.CHANGE.getValue());
    }

    @When("User close pop up on Ads and Books Page")
    public void closePopup() {
       adsAndBooksPage.closePopUp();
    }

    @When("User click adds Image on Ads and Books Page")
    public void clickAddsImage() {
        adsAndBooksPage.clickAddsImage();
    }

    @When("User will see adds list on AdAndBook detail page")
    public void verifyAddsArePresent() {
        adsAndBooksPage.isAddsPresent();
    }

    @When("User click single add on Image on Ads and Books Page")
    public void clickSingleAddImage() {
        adsAndBooksPage.clickSingleAddOnImage();
    }

    @When("User will see share add image button on Ads and Books Page")
    public void isShareImageButtonPresent() {
        Assert.assertTrue(adsAndBooksPage.isShareImageButtonPresent());
    }

    @When("User will see max ten adds on AdsAndBooks Page")
    public void isMaxTenAds() {
        Assert.assertTrue( adsAndBooksPage.getListAds()<=10);
    }

    @When("User clicks first add on AdsAndBooks Page")
    public void userClicksFirstAddOnAdsAndBooksPage() {
       adsAndBooksPage.clickFirstAdd();
    }

    @When("User will click second add on AdsAndBooks Page")
    public void clickSecondAdd() {
        adsAndBooksPage.clickSecondAdd();
    }

    @When("User will click Third add on AdsAndBooks Page")
    public void clickThirdAdd() {
        adsAndBooksPage.clickThirdAdd();
    }

    @When("User will click change store on AdsAndBooks Page")
    @When("User will click change store on PDP page")
    public void clickStoreChange() {
        adsAndBooksPage.clickStoreChange();
    }

    @When("User is successfully navigated to add detail page on AdsAndBooks Page")
    public void isUserOnAddDetailPage() {
       Assert.assertTrue(adsAndBooksPage.isUserOnAddPage());
    }

    @When("User will click back button add on Product Availability filter")
    @When("User will click cross Icon on filter")
    public void clickBackButtonOnProductAvailability() {
        adsAndBooksPage.clickBackButtonOnProductAvailability();
    }

    @When("User will click back button on PDP Page")
    public void clickBackButtonOnPDPPage() {
        adsAndBooksPage.clickBackButtonOnPDP();
    }

    @When("User will click back button on Category Page")
    public void clickBackButtonOnCategoryPage() {
        adsAndBooksPage.clickBackButtononCategory();
    }

    @Then("User is able to see {string} header on AdsAndBooks details Page")
    public void verifyHeaderOnAdsAndBooksDetailsPage(String expectedText) {
        Assert.assertEquals(adsAndBooksPage.getCurrentAdHeaderLabel(), expectedText);
    }

    @And("User is able to see {string} on AdsAndBooks Landing Top Category Label")
    public void verifyAdsAndBooksLandingTopCategoryLabel(String expectedText) {
        Assert.assertTrue(adsAndBooksPage.getTopCategoryLabels().contains(expectedText));
    }

    @And("User is able to see AdsAndBooks Image on Shop Page")
    public void verifyAdsAndBooksImageOnShopPage() {
        Assert.assertTrue(adsAndBooksPage.isExploreAdsBooksImagePresent());
    }

    @And("User is able to see AdsAndBooks Title text {string} on Shop Page")
    public void verifyAdsAndBooksTitleTextOnShopPage(String expectedText) {
        Assert.assertEquals(adsAndBooksPage.getExploreAdsBooksTitleText(), expectedText);
    }

    @And("User is able to see AdsAndBooks Store Title text {string} on Shop Page")
    public void verifyAdsAndBooksStoreTitleTextOnShopPage(String expectedText) {
        Assert.assertEquals(adsAndBooksPage.getExploreAdsBooksStoreTitleText(), expectedText);
    }

    @And("User is able to see AdsAndBooks Store on Shop Page")
    public void verifyAdsAndBooksStoreOnShopPage() {
        Assert.assertTrue(adsAndBooksPage.isExploreAdsBooksStorePresent());
    }

    @When("User clicks Explore AdsAndBooks button on Shop Page")
    public void userClicksExploreAdsAndBooksButtonOnShopPage() {
        adsAndBooksPage.clickExploreAdsBooksButton();
    }

    @And("User is able to see Featured Title on Shop Page")
    public void verifyFeaturedTitleOnShopPage() {
        Assert.assertTrue(adsAndBooksPage.isFeaturedTitlePresent());
    }

    @And("User is able to see Find Products By Category on Shop Page")
    public void verifyFindProductsByCategoryOnShopPage() {
        Assert.assertTrue(adsAndBooksPage.isFindProductsByCategoryPresent());
    }
}
