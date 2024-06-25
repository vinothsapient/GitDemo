package com.testx.web.api.selenium.restassured.qe.ui.pageobjects;

import com.testx.web.api.selenium.restassured.qe.ui.context.TestContext;
import com.testx.web.api.selenium.restassured.qe.ui.stepdefinitions.BaseSetup;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class RatingsPage extends BaseSetup {

    public RatingsPage(TestContext testContext) {
        super(testContext);
        PageFactory.initElements(testContext.getDriverManager().getDriver(), this);
    }

    @FindBy(xpath = "//*[@resource-id='ratingHeader:title']")
    protected static WebElement ratingHeader;

    @FindBy(xpath = "//*[@resource-id='OverallRating:Heading2']")
    protected static WebElement overallRating;

    @FindAll(@FindBy(xpath = " //*[@resource-id='CustomProgressBar:FilledItem']"))
    protected static List<WebElement> ratingFields;

    @FindBy(xpath = "//android.widget.EditText[@content-desc='Review search field'] | //*[@name='ReviewSearchTestID']")
    protected static WebElement reviewSearchField;

    @FindBy(xpath = "//android.view.ViewGroup[@content-desc='star rating selector'] | //*[@name='Rating']")
    protected static WebElement ratingSelector;

    @FindBy(xpath = "//android.view.ViewGroup[@content-desc='locale selector'] | //*[@name='Locals']")
    protected static WebElement localeSelector;

    @FindBy(xpath = "(//*[contains(@text,'Sort by')]/..//android.widget.TextView)[1]")
    protected static WebElement ratingCountText;

    @FindBy(xpath = "//*[@resource-id='Previous:TestID']")
    protected static WebElement  buttonPreviousReviews;

    @FindBy(xpath = "//*[@resource-id='NextPage:TestID']")
    protected static WebElement  buttonNextReview;

    public boolean isRatingHeaderPresent() {
        return driverManagerUtils.isElementDisplayedWithOutWait(ratingHeader);
    }

    public boolean isOverallRatingPresent() {
        return driverManagerUtils.isElementDisplayedWithOutWait(overallRating);
    }

    public boolean isRatingFieldsPresent() {
        return ratingFields.size()==5;
    }

    public boolean isReviewSearchField() {
        return driverManagerUtils.isElementDisplayedWithOutWait(reviewSearchField);
    }

    public void enterValueReviewSearchField(String value) {
         driverManagerUtils.enterText(reviewSearchField,value);
    }

    public boolean isRatingSelectorDropDownPresent() {
        return driverManagerUtils.isElementDisplayedWithOutWait(ratingSelector);
    }

    public void clickRatingSelectorDropDown() {
         new Select(ratingSelector).selectByVisibleText("5 stars");
    }

    public boolean isLocaleSelectorDropDownPresent(){
        return  driverManagerUtils.isElementDisplayedWithOutWait(localeSelector);
    }

    public boolean isRatingsCountPresent() {
       return driverManagerUtils.isElementDisplayed(ratingCountText);
    }

    public boolean verifyReviewsButtonsPresent() {
        return driverManagerUtils.isElementDisplayed(buttonPreviousReviews) && driverManagerUtils.isElementDisplayed(buttonNextReview);
    }

    public void userPressNextReviewButton() {
         driverManagerUtils.clickElement(buttonNextReview);
    }
}
