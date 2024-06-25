package com.testx.web.api.selenium.restassured.qe.ui.stepdefinitions;

import com.testx.web.api.selenium.restassured.qe.common.utils.GeneralUtils;
import com.testx.web.api.selenium.restassured.qe.common.utils.TestVariables;
import com.testx.web.api.selenium.restassured.qe.ui.context.TestContext;
import com.testx.web.api.selenium.restassured.qe.ui.enums.ApplicationInputs;
import com.testx.web.api.selenium.restassured.qe.ui.pageobjects.HomePage;
import com.testx.web.api.selenium.restassured.qe.ui.pageobjects.SmartCouponsPage;
import com.testx.web.api.selenium.restassured.qe.ui.webdriver.DriverManagerUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class SmartCouponPageStepDef {
    SmartCouponsPage smartCouponsPage;
    HomePage homePage;

    public SmartCouponPageStepDef(TestContext testContext) {
        this.smartCouponsPage = new SmartCouponsPage(testContext);
        this.homePage=new HomePage(testContext);
    }

    @And("User is able to see SmartCoupon Page")
    public void verifySmartCouponPage() {
        Assert.assertTrue(smartCouponsPage.isSmartCouponPageDisplayed());
    }
    @And("User is able to see the Share Icon on Coupon Details Page")
    public void verifyShareIconCouponDetailsPage() {
        Assert.assertTrue(smartCouponsPage.isShareIconPresent());
    }

    @And("User is able to see Related SmartCoupon")
    public void verifyRelatedSmartCouponPage() {
        Assert.assertTrue(smartCouponsPage.isRelatedSmartCouponDisplayed());
    }

    @And("User is able to see Coupon product Image SmartCoupon Page")
    public void isCouponImagePresent() {
        Assert.assertTrue(smartCouponsPage.isCouponImagePresent());
    }

    @And("User is able to see Coupon product Save field SmartCoupon Page")
    public void isCouponSaveFieldPresent() {
        if (DriverManagerUtils.configuration.mobilePlatform().equalsIgnoreCase("android")) {
            Assert.assertTrue(smartCouponsPage.isCouponSaveFieldPresent());
        }
    }

    @And("User is able to see Coupon product Name field SmartCoupon Page")
    public void isCouponProductNameField() {
        if (DriverManagerUtils.configuration.mobilePlatform().equalsIgnoreCase("android")) {
            Assert.assertTrue(smartCouponsPage.isCouponProductNameField());
        }
    }

    @And("User is able to see Coupon product Description field SmartCoupon Page")
    public void isCouponProductDescField() {
        Assert.assertTrue(smartCouponsPage.isCouponProductDescField());
    }

    @And("User is able to see Coupon product Status field SmartCoupon Page")
    public void isCouponProductStatusField() {
        if (DriverManagerUtils.configuration.mobilePlatform().equalsIgnoreCase("android")) {
            Assert.assertTrue(smartCouponsPage.isCouponProductStatusField());
        }
    }

    @And("User is able to see Coupons separately SmartCoupon Page")
    public void isCouponsArePresent() {
        Assert.assertTrue(smartCouponsPage.isCouponsPresent());
    }

    @And("User click on explore SmartCoupon link on smartCoupon Page")
    public void clickExploreSmartCouponLink() {
        smartCouponsPage.clickSmartCouponLink();
    }

    @And("User click on searchBar on smartCoupon Page")
    public void clickSearchBar() {
        smartCouponsPage.clickSearchBar();
    }
    @And("User Clicks on Share Icon")
    public void clickShareIcon() {
        smartCouponsPage.clickShareIcon();
    }

    @And("User click on clear search button on smartCoupon Page")
    public void clickClearSearch() {
        smartCouponsPage.clickClearSearch();
    }

    @And("User enter the {string} in searchBar on smartCoupon Page")
    public void enterKeys(String value) {
        smartCouponsPage.enterSearchKeysSearchBar(value);
    }

    @When("User clicks enter button on smartCoupon page")
    public void clickEnterButton() {
        smartCouponsPage.clickEnterButton();
    }

    @When("User verifies search {string} coupon name matches from list in smart coupon page")
    public void verifySearchProducts(String searchValue) {
        Assert.assertTrue(smartCouponsPage.isSearchCouponDisplayed(searchValue));
    }

    @When("User verifies {string} coupon button on smart coupon page")
    public void verifyCouponButton(String btnName) {
        Assert.assertTrue( smartCouponsPage.isTabPresent(btnName));
    }

    @Then("User is able to see cancel link text on Search Coupon Page")
    public void verifyCancelButton() {
        Assert.assertEquals(smartCouponsPage.getCancelLinkText(), ApplicationInputs.CANCEL.getValue());
    }
    @Then("User clicks cancel link button on Search Coupon Page")
    public void userClicksCancelLinkButton() {
        smartCouponsPage.clickCancelButton();
    }

    @When("User clicks back button on Coupon Details page")
    @When("User clicks back button on smartCoupon page")
    public void clickBackButton() {
        smartCouponsPage.clickCouponBackButton();
    }

    @And("User verifySearch drop down items count max ten on smartCoupon Page")
    public void verifySearchDropDownCount() {
        Assert.assertTrue(smartCouponsPage.getDropDownCount() < 11);
    }

    @And("User is able to see the explore smartCouponDetail Page")
    public void isCouponExplorePage() {
        Assert.assertTrue(smartCouponsPage.isCouponExplorePage());
    }

    @And("User is able to see Empty Cart icon in Cart Page")
    @And("User is able to see Search icon in empty Search Coupon Page")
    public void verifySearchIconPresentInBody() {
        Assert.assertTrue(smartCouponsPage.isSearchIconPresentInBody());
    }

    @And("User is able to see No Coupon Found text in empty Search Coupon Page")
    public void verifyNoCouponFoundTextInEmptySearchCouponPage() {
        Assert.assertEquals(smartCouponsPage.getNoCouponFoundText(), ApplicationInputs.NO_COUPONS_FOUND.getValue());
    }

    @And("User is able to see No Coupon Found Message body in empty Search Coupon Page")
    public void isNoCouponFoundMessageBodyText() {
        Assert.assertTrue(smartCouponsPage.isMessageBodyPresent());
    }

    @And("User is able to see Explore Coupon Categories text in empty Search Coupon Page")
    public void isExploreCouponCategoriesTextInEmptySearchCouponPage() {
        Assert.assertEquals(smartCouponsPage.getExploreCouponCategoriesText(), ApplicationInputs.EXPLORE_COUPON_CATEGORIES.getValue());
    }

    @And("User is able to see Scanner button in empty Cart Page")
    @And("User is able to see Scanner button in empty Search Coupon Page")
    public void verifyScannerButtonInEmptySearchCouponPage() {
        Assert.assertTrue(smartCouponsPage.isScannerButtonPresent());
    }

    @And("User is able to see the search icon on Shop Page")
    @And("User is able to see the search icon on More Page")
    @And("User is able to see the search icon on Home Page")
    @And("User is able to see the search icon on Coupon Details Page")
    @And("User is able to see the search icon on SmartCoupon Page")
    public void verifyCouponSearchIconPresent() {
        Assert.assertTrue(smartCouponsPage.isSearchIconPresent());
    }

    @And("User is able to see the scanner on Coupon Details Page")
    @And("User is able to see the scanner on SmartCoupon Page")
    public void verifyCouponScannerPresent() {
        Assert.assertTrue(smartCouponsPage.isCouponScannerPresent());
    }

    @And("User is able to see the search for coupon text default on Coupon Details Page")
    @And("User is able to see the search for coupon text default on SmartCoupon Page")
    public void verifyDefaultTextInSearchBox() {
        Assert.assertEquals(smartCouponsPage.getSearchDefaultText(), ApplicationInputs.SEARCH_FOR_COUPONS.getValue());
    }

    @And("User is able to see Redeem Coupons text on Coupons Page")
    public void verifyRedeemCouponsTextOnCouponsPage() {
        Assert.assertEquals(smartCouponsPage.getRedeemCouponText(), ApplicationInputs.REDEEM_COUPONS.getValue());
    }

    @When("User clicks on Redeem Coupons on Coupons Page")
    public void userClicksOnRedeemCouponsOnCouponsPage() {
        smartCouponsPage.clickRedeemCouponLink();
    }

    @Then("User is able to see Barcode Title on SmartCoupon Page")
    public void verifyBarcodeTitle() {
        Assert.assertEquals(smartCouponsPage.getBarcodeTitleText(), ApplicationInputs.YOUR_DIGITAL_ID.getValue());
    }

    @Then("User is able to see Barcode page close button")
    public void verifyBarcodePageCloseButton() {
        Assert.assertTrue(smartCouponsPage.isBarcodeCloseButtonDisplayed());
    }

    @When("User clicks on Barcode page close button")
    public void userClicksOnBarcodePageCloseButton() {
        smartCouponsPage.clickBarcodeCloseButton();
    }

    @And("User is able to see {string} Amount In Barcode Page")
    public void verifyClippedAmountInBarcodePage(String expectedText) {
        Assert.assertTrue(smartCouponsPage.getClippedAmountText().contains(expectedText));
    }

    @And("User is able to see Clipped Coupons In Barcode Page")
    public void verifyClippedCouponsInBarcodePage() {
        Assert.assertTrue(smartCouponsPage.getCouponsClippedText().contains(ApplicationInputs.COUPONS_CLIPPED.getValue()));
    }

    @And("User is able to see Barcode Image In Barcode Page")
    public void verifyBarcodeImageInBarcodePage() {
        Assert.assertTrue(smartCouponsPage.isBarcodeImageDisplayed());
    }

    @And("User is able to see Phone Number Text In Barcode Page")
    public void verifyPhoneNumberText() {
        Assert.assertTrue(smartCouponsPage.isPhoneNumberDisplayed());
    }

    @And("User is able to see Barcode Instruction Text In Barcode Page")
    public void verifyDisplayBarcodeInstructionText() {
        Assert.assertEquals(smartCouponsPage.getDisplayBarcodeInstructionText(), ApplicationInputs.BARCODE_INSTRUCTION_TEXT.getValue());
    }

    @And("User is able to see For You Listed Coupon section on SmartCoupon Page")
    public void verifyForYouListedCouponSectionOnSmartCouponPage() {
        Assert.assertEquals(smartCouponsPage.getForYouListedCouponSectionText(), ApplicationInputs.FOR_YOU.getValue() );
    }

    @And("User is able to see Recommended section on SmartCoupon Page")
    public void verifyRecommendedCouponSectionOnSmartCouponPage() {
        Assert.assertEquals(smartCouponsPage.recommendedCouponSectionText(), ApplicationInputs.RECOMMENDED.getValue() );
    }

    @And("User is able to see Trending label in Browse section on SmartCoupon Page")
    public void verifyTrendingLabelInBrowseCouponSectionOnSmartCouponPage() {
        Assert.assertEquals(smartCouponsPage.getTrendingLabelText(), ApplicationInputs.TRENDING.getValue() );
    }

    @And("User is able to see View All link in Recommended section on SmartCoupon Page")
    public void verifyViewAllLinkInRecommendedSectionOnSmartCouponPage() {
        Assert.assertEquals(smartCouponsPage.getViewAllLabelText(), ApplicationInputs.VIEW_ALL.getValue() );
    }

    @And("User is able to see All Listed Coupon section on SmartCoupon Page")
    public void verifyAllListedCouponSectionOnSmartCouponPage() {
        Assert.assertEquals(smartCouponsPage.getAllListedCouponSectionText(), ApplicationInputs.ALL.getValue() );
    }

    @And("User is able to see Clipped Listed Coupon section on SmartCoupon Page")
    public void verifyClippedListedCouponSectionOnSmartCouponPage() {
        Assert.assertTrue(smartCouponsPage.isClippedListedCouponSectionDisplayed());
    }

    @And("User is able to see Expiring Soon section on SmartCoupon Page")
    public void verifyExpiringSoonSectionOnSmartCouponPage() {
        Assert.assertTrue(smartCouponsPage.isExpiringSoonSectionDisplayed());
    }

    @And("User is able to see Smart Coupons For You text on SmartCoupon Page")
    public void verifySmartCouponsForYouTitleText() {
        Assert.assertEquals(smartCouponsPage.getSmartCouponsForYouTitleText(), ApplicationInputs.SMART_COUPONS_FOR_YOU.getValue() );
    }

    @And("User is able to see Expired & Unused Coupons text on Expired & Unused Coupons Page")
    public void UserIsAbleToSeeExpiredUnusedCouponsTextExpiredUnusedCouponsPage() {
        Assert.assertTrue(smartCouponsPage.isExpiredAndUnusedCouponsDisplayed());
    }

    @And("User is able to see Redeemed Coupons text on Redeemed Coupons Page")
    public void UserIsAbleToSeeRedeemedCouponsTextRedeemedCouponsPage() {
        Assert.assertTrue(smartCouponsPage.isRedeemedCouponsText());
    }

    @And("User is able to see for you Coupon section on SmartCoupon Page")
    public void verifyCouponsPresent() {
        Assert.assertTrue(smartCouponsPage.isForYouCouponsPresent());
    }

    @And("User is able to see total Lifetime Savings done by the user")
    public void verifyTotalSavingDoneByTheUser() {
        Assert.assertTrue(smartCouponsPage.isTotalSavingDisplayed());
    }

    @And("User is able to see clipped amount done by the user")
    public void verifyClippedAmountDoneByTheUser() {
        Assert.assertTrue(smartCouponsPage.isClippedDollarAmountDisplayed());
    }

    @When("User clicks on Clip Coupon CTA on SmartCoupon Page")
    public void userClicksOnClipCoupon() {
        smartCouponsPage.clickClipCouponCTA();
    }

    @Then("User store the text for clipped coupons in {string} on SmartCoupon Page")
    public void userGetTextForAlreadyClippedCoupons(String clippedValue) {
        smartCouponsPage.getClippedCouponText(clippedValue);
    }
    @Then("User verifies {string} and {string} on SmartCoupon Page")
    public void userVerifyClippedValues(String oldClippedValue, String newClippedValue) {
        System.out.println(GeneralUtils.extractFirstDoubleFromString(TestVariables.getValue(newClippedValue)) + GeneralUtils.extractFirstDoubleFromString(TestVariables.getValue(oldClippedValue)));
        Assert.assertTrue(Double.compare(GeneralUtils.extractFirstDoubleFromString(TestVariables.getValue(newClippedValue)) ,
                GeneralUtils.extractFirstDoubleFromString(TestVariables.getValue(oldClippedValue))) > 0);
    }

    @And("User is able to see total amount available for clipping for the user")
    public void verifyTotalAmountAvailableForClippingForTheUser() {
        Assert.assertTrue(smartCouponsPage.isTotalAmountAvailableForClippingDisplayed());
    }

    @When("User clicks All Listed Coupon Tab on SmartCoupon Page")
    public void userClicksAllListedCouponTabOnSmartCouponPage() {
        smartCouponsPage.clickAllAllListedCouponTab();
    }

    @And("User is able to see All Coupons Link on Browse section")
    @And("User is able to see All Coupons Link on All Listed Coupon section")
    public void verifyAllCouponsLinkOnAllListedCouponSection() {
        Assert.assertTrue(smartCouponsPage.isAllCouponsLinkDisplayed());
    }

    @And("User is able to see Categories List on Browse section")
    @And("User is able to see Categories List on All Listed Coupon section")
    public void verifyCategoriesListOnAllListedCouponSection() {
        Assert.assertTrue(smartCouponsPage.isCategoriesListDisplayed());
    }

    @When("User clicks on All Coupons Link on All Listed Coupon section")
    public void userClicksOnAllCouponsLinkOnAllListedCouponSection() {
        smartCouponsPage.clickAllCouponsLink();
    }
    @When("User clicks on All Coupons Link on Browse By Category section")
    public void userClicksOnAllCouponsLinkOnBrowseByCategorySection() {
        smartCouponsPage.clickAllCouponsLink();
    }

    @Then("User is able to see All coupons header on All coupons Page")
    public void verifyAllCouponsHeaderOnAllCouponsPage() {
        Assert.assertTrue(smartCouponsPage.isAllCouponsHeaderDisplayed());
    }

    @Then("User is able to see total Redeemed Coupons on Redeemed Coupons Page")
    @And("User is able to see coupons count on All coupons Page")
    public void verifyCouponsCountOnAllCouponsPage() {
        Assert.assertTrue(smartCouponsPage.isCouponsCountDisplayed());
    }

    @Then("User is able to see Explore via Ads and Books text on SmartCoupon Page")
    public void verifyExploreViaAdsAndBooksTextOnSmartCouponPage() {
        Assert.assertTrue(smartCouponsPage.isExploreViaAdsAndBooksTextDisplayed());
    }

    @When("User clicks on Explore via Ads and Books link on SmartCoupon Page")
    public void userClicksOnExploreViaAdsAndBooksLinkOnSmartCouponPage() {
        smartCouponsPage.clickExploreViaAdsAndBooksLink();
    }


    @Then("User is able to see Explore By Category on All Listed Coupon section")
    @Then("User is able to see Explore By Category on Recommended section")
    public void verifyExploreByCategoryOnAllListedCouponSection() {
        Assert.assertTrue(smartCouponsPage.isExploreByCategoryTextDisplayed());
    }

    @Then("User is able to see Food and Beverages category under Browse By Category")
    public void verifyFoodAndBeveragesCategoryUnderBrowseByCategorySection() {
        Assert.assertTrue(smartCouponsPage.isFoodAndBeveragesCategoryDisplayed());
    }

    @When("User clicks on Expiring Soon tab on SmartCoupon Page")
    public void userClicksOnExpiringSoonTabOnSmartCouponPage() {
        smartCouponsPage.clickExpiringSoonTab();
    }

    @And("User is able to see {string} header on Redeemed Coupons page")
    public void verifyRedeemedCouponsHeaderOnRedeemedCouponPage(String expectedText) {
        Assert.assertEquals(smartCouponsPage.getRedeemedCouponsText(), expectedText);
    }

    @And("User is able to see {string} sorted text on Redeemed Coupons Page")
    public void verifySortedTextOnRedeemedCouponsPage(String expectedText) {
        Assert.assertEquals(smartCouponsPage.getSortedOptionTextOnRedeemedCouponsPage(), expectedText);
    }

    @When("User clicks {string} Category on All Listed Coupon section")
    public void userClicksCategoryOnAllListedCouponSection(String label) {
        smartCouponsPage.clickButton(label);
    }

    @Then("User is able to see {string} header on Individual Category Page")
    @And("User is able to see {string} text on Expired & Unused Coupons Page")
    @And("User is able to see {string} text on Redeemed Coupons Page")
    @And("User is able to see {string} text on Coupons Page")
    @And("User is able to see {string} text on Barcode Page")
    @And("User is able to see {string} text on Coupon details Page")
    public void verifyTextOnCouponsPage(String label) {
        Assert.assertTrue(smartCouponsPage.isElementPresent(label));
    }

    @When("User selects any coupon from SmartCoupon Page")
    public void userSelectsAnyCouponFromSmartCouponPage() {
        smartCouponsPage.clickFirstCoupons();
    }

    @Then("User is able to see Coupon details page")
    public void verifyCouponDetailsPage() {
        Assert.assertTrue(smartCouponsPage.isCouponDetailsPageDisplayed());
    }

    @And("User is able see to Back button on Coupon details page")
    public void verifyBackButtonOnCouponDetailsPage() {
        Assert.assertTrue(smartCouponsPage.isCouponBackButtonPresent());
    }

    @And("User is able to see For Your Store on Coupon Details Page")
    public void verifyForYourStoreOnCouponDetailsPage() {
        Assert.assertTrue(smartCouponsPage.isForYourStorePresent());
    }

    @And("User is able to see Product Image on Coupon Details Page")
    public void verifyProductImageOnCouponDetailsPage() {
        Assert.assertTrue(smartCouponsPage.isProductImagePresent());
    }

    @And("User is able to see Clip coupon CTA on Coupon Details Page")
    public void verifyClipCouponCTAOnCouponDetailsPage() {
        Assert.assertTrue(smartCouponsPage.isClipCouponCTAPresent());
    }

    @And("User is able to see Terms and Conditions on Coupon Details Page")
    public void verifyTermsAndConditionsOnCouponDetailsPage() {
        Assert.assertTrue(smartCouponsPage.isTermsAndConditionsTextPresent());
    }

    @Then("User is able to see Scan in Store Products CTA on Coupon Details Page")
    public void verifyScanInStoreProductsCTAOnCouponDetailsPage() {
        Assert.assertTrue(smartCouponsPage.isScanInStoreProductCTAPresent());
    }

    @Then("User is able to see Related Smart Coupons on Coupon Details Page")
    public void verifyRelatedSmartCouponsOnCouponDetailsPage() {
        Assert.assertTrue(smartCouponsPage.isRelatedSmartCouponsPresent());
    }

    @And("User clicks on Terms and Conditions on Coupon Details Page")
    public void userClicksOnTermsAndConditionsOnCouponDetailsPage() {
        smartCouponsPage.clickTermsAndConditionLink();
    }

    @When("User clicks on Scan in Store Products CTA on Coupon Details Page")
    public void userClicksOnScanInStoreProductsCTAOnCouponDetailsPage() {
        smartCouponsPage.clickScanInStoreProductsLink();
    }

    @Then("User is able to see Coupon sort CTA")
    public void verifyCouponSortCTA() {
        Assert.assertTrue(smartCouponsPage.isCouponSortOptionDisplayed());
    }

    @When("User clicks on Coupon sort CTA")
    public void userClicksOnCouponSortCTA() {
        smartCouponsPage.clickCouponSortOption();
    }

    @And("User is able to see Dropdown option on SmartCoupon Page")
    public void verifyDropdownOptionOnSmartCouponPage() {
        Assert.assertTrue(smartCouponsPage.isSavingsDropdownOptionDisplayed());
    }

    @And("User is able to see Lifetime Savings text on Coupons Page")
    public void verifyLifetimeSavingsTextOnSmartCouponPage() {
        Assert.assertEquals(smartCouponsPage.getSavingsDropdownOptionsText(), ApplicationInputs.LIFETIME_SAVINGS.getValue());
    }

    @And("User is able to see Lifetime Savings text on iBotta Coupons Page")
    public void verifyLifetimeSavingsTextOnIbottaSmartCouponPage() {
        Assert.assertEquals(smartCouponsPage.getLifeTimeSavingsTextForIBotta(), ApplicationInputs.LIFETIME_SAVINGS.getValue());
    }

    @And("User is able to see info icon on SmartCoupon Page")
    public void verifyInfoIconOnSmartCouponPage() {
        Assert.assertTrue(smartCouponsPage.isInfoIconDisplayed());
    }

    @When("User clicks info icon on SmartCoupon Page")
    public void userClicksInfoIconOnSmartCouponPage() {
        smartCouponsPage.clickInfoIconButton();
    }

    @Then("User is able to see info icon tooltip message")
    public void userIsAbleToSeeInfoIconTooltipMessage() {
        Assert.assertEquals(smartCouponsPage.getInfoIconText(), ApplicationInputs.INFO_ICON_TOOLTIP.getValue());
    }

    @When("User clicks on Info Icon Tooltip on SmartCoupon Page")
    public void userClicksOnInfoIconTooltipOnCouponsPage() {
        smartCouponsPage.clickInfoIconTooltipButton();
    }

    @And("User is able to see {string} Guest sub title on Coupons Page")
    public void verifyGuestSubTitleOnHomePage(String expectedText) {
        Assert.assertEquals(smartCouponsPage.getGuestSubTitleText(), expectedText);
    }

    @And("User is able to see {string} header login title on Coupons Page")
    public void verifyHeaderLoginTitleOnCouponsPage(String expectedText) {
        Assert.assertEquals(smartCouponsPage.getHeaderLoginTitleText(), expectedText);
    }

    @And("User is able to see {string} header Create Account Title on Coupons Page")
    public void verifyHeaderCreateAccountTitleOnCouponsPage(String expectedText) {
        Assert.assertEquals(smartCouponsPage.getHeaderCreateAccountTitleText(), expectedText);
    }

    @And("User clicks Login button on Coupons Page")
    public void userClicksLoginButtonOnCouponsPage() {
        smartCouponsPage.clickLoginButton();
    }

    @And("User clicks Create Account button on Coupons Page")
    public void userClicksCreateAccountButtonOnHomePage() {
        smartCouponsPage.clickCreateAccountButton();
    }

    @And("User is able to see {string} sorted text on Coupon details Page")
    public void verifySortedTextOnCouponDetailsPage(String expectedText) {
        Assert.assertEquals(smartCouponsPage.getSortedOptionText(), expectedText);
    }

    @And("User is able to see Sign In to Clip Coupon text on Coupon details Page")
    public void verifySignInToClipCouponTextOnCouponDetailsPage() {
        Assert.assertEquals(smartCouponsPage.getSignInToClipCouponText(), ApplicationInputs.SIGN_IN_TO_CLIP_COUPON.getValue());
    }

    @When("User clicks Sign In to Clip Coupon button on Coupon details Page")
    public void userClicksSignInToClipCouponButtonOnCouponDetailsPage() {
        if (DriverManagerUtils.configuration.mobilePlatform().equalsIgnoreCase("ios")) {
            homePage.swipeUpLittle();
            homePage.swipeUpLittle();
        }
        smartCouponsPage.clickSignInToClipCouponButton();
    }

    @And("User is able to see Clip Coupon text on Coupon details Page")
    public void verifyClipCouponTextOnCouponDetailsPage() {
        if (smartCouponsPage.getClipCouponText().equals(ApplicationInputs.CLIP_COUPON.getValue())) {
            Assert.assertEquals(smartCouponsPage.getClipCouponText(), ApplicationInputs.CLIP_COUPON.getValue());
        } else {
            Assert.assertEquals(smartCouponsPage.getClipCouponText(), ApplicationInputs.COUPON_CLIPPED.getValue());
        }
    }

    @When("User clicks First Category From Categories List on Coupon details Page")
    public void userClicksFirstCategoryFromCategoriesListOnCouponDetailsPage() {
        if (DriverManagerUtils.configuration.mobilePlatform().equalsIgnoreCase("android")) {
            smartCouponsPage.clickFirstCategoryFromCategoriesList();
        } else {
            smartCouponsPage.clickCouponCategory();
        }
    }

    @Then("User is able to see First Category header on Category coupons Page")
    public void verifyFirstCategoryHeaderOnAllCouponsPage() {
        Assert.assertTrue(smartCouponsPage.isFirstCategoryHeaderDisplayed());
    }

    @And("User is able to see Trending Search text on Search Coupon Page")
    public void verifyTrendingSearchTextOnSearchCouponPage() {
        Assert.assertEquals(smartCouponsPage.getTrendingSearchText(), ApplicationInputs.TRENDING_SEARCH.getValue());
    }

    @And("User is able to see Scan Barcode Button on Coupon Search Page")
    public void verifyScanBarcodeButtonOnCouponSearchPage() {
        Assert.assertTrue(smartCouponsPage.isScanBarcodeButtonDisplayed());
    }

    @And("User is able to see Scan Product Barcode text on Coupon Search Page")
    public void verifyScanProductBarcodeTextOnCouponSearchPage() {
        Assert.assertEquals(smartCouponsPage.getScanProductBarcodeText(), ApplicationInputs.SCAN_PRODUCT_BARCODE.getValue());
    }

    @And("User is able to see Scan Product Barcode text in empty Cart Page")
    @And("User is able to see Scan Product Barcode text in empty Search Coupon Page")
    public void verifyScanProductBarcodeTextOnEmptyCouponSearchPage() {
        Assert.assertEquals(smartCouponsPage.getPlpNoItemsScanProductBarcodeText(), ApplicationInputs.SCAN_IN_STORE_PRODUCTS.getValue());
    }

    @And("User is able to see Previously Searched text on Search Coupon Page")
    public void verifyPreviouslySearchedTextOnSearchCouponPage() {
        Assert.assertEquals(smartCouponsPage.getPreviouslySearchedText(), ApplicationInputs.PREVIOUSLY_SEARCHED.getValue());
    }

    @And("User is able to see Clear text on Search Coupon Page")
    public void verifyClearTextOnSearchCouponPage() {
        Assert.assertEquals(smartCouponsPage.getClearText(), ApplicationInputs.CLEAR.getValue());
    }

    @When("User clicks Clear button on Search Coupon Page")
    public void userClicksClearButtonOnSearchCouponPage() {
        smartCouponsPage.clickClearButton();
    }

    @Then("User is not able to see Previously Searched text on Search Coupon Page")
    public void verifyNoPreviouslySearchedTextOnSearchCouponPage() {
        Assert.assertFalse(smartCouponsPage.isPreviouslySearchedTextPresent());
    }

    @And("User is able to see Barcode Header Icon on SmartCoupon Page")
    public void verifyBarcodeHeaderIconOnSmartCouponPage() {
        Assert.assertTrue(smartCouponsPage.isBarcodeHeaderIconDisplayed());
    }

    @When("User clicks First Category under Browse By Category")
    public void userClicksFirstCategoryUnderBrowseByCategory() {
        smartCouponsPage.clickOnFoodAndBeveragesCategory();
    }

    @And("User is able to see Trending label on SmartCoupon Page")
    public void userIsAbleToSeeTrendingLabelOnSmartCouponPage() {
        Assert.assertEquals(smartCouponsPage.getTrendingLabel(), ApplicationInputs.TRENDING.getValue() );
    }

    @Then("User is able to see Browse By Category on Browse section")
    public void userIsAbleToSeeBrowseByCategoryOnBrowseSection() {
        Assert.assertTrue(smartCouponsPage.isBrowseByCategoryTextDisplayed());
    }

    @Then("User able to see All Suggested Coupons For You label on SmartCoupon Page")
    public void userAbleToSeeAllSuggestedCouponsForYouLabelOnSmartCouponPage() {
        Assert.assertEquals(smartCouponsPage.getAllSuggestedCouponsForYouLabelText().trim(), ApplicationInputs.ALL_SUGGESTED_COUPONS_FOR_YOU.getValue() );
    }

    @And("User able to see {string} Default sort option on All Suggested Coupons page")
    public void userAbleToSeeDefaultSortOptionOnAllSuggestedCouponsPage(String value) {
        Assert.assertTrue(smartCouponsPage.isBiggestSavingsTextDisplayed());
    }
    @When("User clicks Sign In to Clip Coupon button on All Suggested Coupons Page")
    public void userClicksSignInToClipCouponButtonOnAllSuggestedCouponsPage() {
        smartCouponsPage.clickSignInToClipCouponLink();
    }

    @And("User is able to see Clip Coupon text on All Suggested Coupons page")
    public void userIsAbleToSeeClipCouponTextOnAllSuggestedCouponsPage() {
        Assert.assertTrue(smartCouponsPage.isClipCouponTextDisplayed());
    }

    @And("User is able to see coupons count on All Suggested Coupons page")
    public void userIsAbleToSeeCouponsCountOnAllSuggestedCouponsPage() {
        Assert.assertTrue(smartCouponsPage.isCouponsCountDisplayed());
    }

    @And("User is able to see Smart Coupon Sign In to Clip Coupon Text on All Suggested Coupons page")
    public void userIsAbleToSeeSmartCouponSignInToClipCouponTextOnAllSuggestedCouponsPage() {
        Assert.assertEquals(smartCouponsPage.getSignInToClipCouponText(), ApplicationInputs.SIGN_IN_TO_CLIP_COUPON.getValue());
    }

    @When("User clicks Back Button on All Suggested Coupons Page")
    public void userClicksBackButtonOnAllSuggestedCouponsPage() {
        smartCouponsPage.clickCouponBackButtonOnAllSuggestedCouponsPage();
    }

    @Then("User is able to see Expiring Soon Coupons on Expiring Soon Section if available")
    public void userIsAbleToSeeExpiringSoonCouponsOnExpiringSoonSectionIfAvailable() {
        Assert.assertTrue(smartCouponsPage.isExpiringSoonCouponsDisplayed());
    }
}
