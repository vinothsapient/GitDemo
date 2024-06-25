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

public class CouponWalletPageStepDef {
    SmartCouponsPage smartCouponsPage;
    HomePage homePage;

    public CouponWalletPageStepDef(TestContext testContext) {
        this.smartCouponsPage = new SmartCouponsPage(testContext);
        this.homePage=new HomePage(testContext);
    }



}
