@mobile
Feature: Coupon Bar Code Feature

  @FD_994_TC5
  Scenario: Verify when user click on individual category
    Given User is on Welcome Page
    When User clicks Log In button on Welcome Page
    And User enter the login details for "ValidLoginDetails"
    And User clicks Now Now button on Enable Biometric Login page
    And User clicks Start Saving button on Sign Up complete Page
    And User clicks Skip button on Enable My Location Page
    And User clicks Skip button on Enable My Location Page Pop Up
    And User clicks Not Now button on Keep Up to Date Page
    Then User is able to see Coupon text on Home Page
    When User clicks Coupons Tab on Home Page
    Then User is able to see SmartCoupon Page
    And User is able to see For You Listed Coupon section on SmartCoupon Page
    And User is able to see All Listed Coupon section on SmartCoupon Page
    And User is able to see Clipped Listed Coupon section on SmartCoupon Page
    When User clicks All Listed Coupon Tab on SmartCoupon Page
    Then User is able to see Explore By Category on All Listed Coupon section
    When User clicks "Food & Beverages" Category on All Listed Coupon section
    Then User is able to see "Food & Beverages" header on Individual Category Page
    When User clicks Account Tab on Home Page
    And User scrolls down to move bottom
    Then User is able to see sign out button in account page
    When User clicks sign out button in account page
    Then User is on Welcome Page

  @FD_994_TC6
  Scenario: Verify user is able to open the Books and Ads page
    Given User is on Welcome Page
    When User clicks Log In button on Welcome Page
    And User enter the login details for "ValidLoginDetails"
    And User clicks Now Now button on Enable Biometric Login page
    And User clicks Start Saving button on Sign Up complete Page
    And User clicks Skip button on Enable My Location Page
    And User clicks Skip button on Enable My Location Page Pop Up
    And User clicks Not Now button on Keep Up to Date Page
    Then User is able to see Coupon text on Home Page
    When User clicks Coupons Tab on Home Page
    Then User is able to see SmartCoupon Page
    And User is able to see All Listed Coupon section on SmartCoupon Page
    When User clicks All Listed Coupon Tab on SmartCoupon Page
    Then User is able to see All Coupons Link on All Listed Coupon section
    When User scrolls down to move bottom
    Then User is able to see Explore via Ads and Books text on SmartCoupon Page
    When User clicks on Explore via Ads and Books link on SmartCoupon Page
    Then User is on Ads and Books Page
    When User clicks Account Tab on Home Page
    And User scrolls down to move bottom
    Then User is able to see sign out button in account page
    When User clicks sign out button in account page
    Then User is on Welcome Page
