@mobile
Feature: Coupon clipped structure Feature

  @FD_995_TC6 @FD_985_TC1 @FD_985_TC2 @FD_985_TC3 @FD_986_TC1 @FD_986_TC2
  Scenario: Verify clipped coupons bottom of the screen
    Given User is on Welcome Page
    When User clicks Log In button on Welcome Page
    And User enter the login details for "ValidLoginDetails"
    And User clicks Now Now button on Enable Biometric Login page
    And User clicks Start Saving button on Sign Up complete Page
    And User clicks Skip button on Enable My Location Page
    And User clicks Skip button on Enable My Location Page Pop Up
    And User clicks Not Now button on Keep Up to Date Page
    Then User is able to see Home text on Home Page
    When User clicks Coupons Tab on Home Page
    Then User is able to see SmartCoupon Page
    When User clicks Clipped button on Coupons Page
    And User scrolls down to move bottom
    When User clicks Expired & Unused Coupons Tab on Coupons Page

  @FD_995_TC5
  Scenario: Verify clipped coupons UI
    Given User is on Welcome Page
    When User clicks Log In button on Welcome Page
    And User enter the login details for "ValidLoginDetails"
    And User clicks Now Now button on Enable Biometric Login page
    And User clicks Start Saving button on Sign Up complete Page
    And User clicks Skip button on Enable My Location Page
    And User clicks Skip button on Enable My Location Page Pop Up
    And User clicks Not Now button on Keep Up to Date Page
    Then User is able to see Home text on Home Page
    When User clicks Coupons Tab on Home Page
    Then User is able to see SmartCoupon Page
    And  User is able to see Clipped Listed Coupon section on SmartCoupon Page
    When User clicks Clipped button on Coupons Page
    And  User is able to see "Expiring Soon" text on Coupons Page
    When User clicks Account Tab on Home Page
    And User scrolls down to move bottom
    Then User is able to see sign out button in account page
    When User clicks sign out button in account page
    Then User is on Welcome Page

  @FD_995_TC7
  Scenario: Verify refresh section should be available
    Given User is on Welcome Page
    When User clicks Log In button on Welcome Page
    And User enter the login details for "ValidLoginDetails"
    And User clicks Now Now button on Enable Biometric Login page
    And User clicks Start Saving button on Sign Up complete Page
    And User clicks Skip button on Enable My Location Page
    And User clicks Skip button on Enable My Location Page Pop Up
    And User clicks Not Now button on Keep Up to Date Page
    Then User is able to see Home text on Home Page
    When User clicks Coupons Tab on Home Page
    Then User is able to see SmartCoupon Page
    And  User is able to see Clipped Listed Coupon section on SmartCoupon Page
    When User clicks Clipped button on Coupons Page
    And User scrolls down to move bottom
    And  User clicks Refresh button at the bottom of the Coupons Page
    When User clicks Account Tab on Home Page
    And User scrolls down to move bottom
    Then User is able to see sign out button in account page
    When User clicks sign out button in account page
    Then User is on Welcome Page

  @FD_986_TC3 @FD_986_TC4
  Scenario: Verify when user is on the coupon details page and focus on the Related Smart coupon section
    Given User is on Welcome Page
    When User clicks Log In button on Welcome Page
    And User enter the login details for "ValidLoginDetails"
    And User clicks Now Now button on Enable Biometric Login page
    And User clicks Start Saving button on Sign Up complete Page
    And User clicks Skip button on Enable My Location Page
    And User clicks Skip button on Enable My Location Page Pop Up
    And User clicks Not Now button on Keep Up to Date Page
    When User clicks Coupons Tab on Home Page
    Then User is able to see SmartCoupon Page
    When User tap on the coupon on coupons page
    And User scrolls down to move coupon
    Then User is able to see Related SmartCoupon
    When User clicks Show All button on coupons page
    And User is able to see "Expiring Soon" text on Coupons Page
    When User clicks Account Tab on Home Page
    And User scrolls down to move bottom
    Then User is able to see sign out button in account page
    When User clicks sign out button in account page
    Then User is on Welcome Page

  @FD_996_TC1 @FD_996_TC2 @FD_996_TC3 @FD_995_TC1 @FD_995_TC3 @FD_995_TC4
  Scenario: Verify that Coupons Page should have three views like For you ,All and Clipped and Clicking on the 'Clipped' section and list of clipped items should be displayed
    Given User is on Welcome Page
    When User clicks Log In button on Welcome Page
    And User enter the login details for "ValidLoginDetails"
    And User clicks Now Now button on Enable Biometric Login page
    And User clicks Start Saving button on Sign Up complete Page
    And User clicks Skip button on Enable My Location Page
    And User clicks Skip button on Enable My Location Page Pop Up
    And User clicks Not Now button on Keep Up to Date Page
    Then User is able to see Home text on Home Page
    When User clicks Coupons Tab on Home Page
    Then User is able to see SmartCoupon Page
    And User is able to see For You Listed Coupon section on SmartCoupon Page
    And User is able to see All Listed Coupon section on SmartCoupon Page
    And User is able to see Clipped Listed Coupon section on SmartCoupon Page
    When User clicks Clipped button on Coupons Page
    When User scrolls down to move coupon
    And User is able to see "Coupon Clipped" text on Coupons Page
    When User clicks Account Tab on Home Page
    And User scrolls down to move bottom
    Then User is able to see sign out button in account page
    When User clicks sign out button in account page
    Then User is on Welcome Page

  @FD_996_TC10 @Standalone
  Scenario: Verify that User is navigated to Redeemed coupons Page once user click on Redeemed coupons CTA
    Given User is on Welcome Page
    When User clicks Log In button on Welcome Page
    And User enter the login details for "ValidLoginDetails"
    And User clicks Now Now button on Enable Biometric Login page
    And User clicks Start Saving button on Sign Up complete Page
    And User clicks Skip button on Enable My Location Page
    And User clicks Skip button on Enable My Location Page Pop Up
    And User clicks Not Now button on Keep Up to Date Page
    Then User is able to see Home text on Home Page
    When User clicks Coupons Tab on Home Page
    Then User is able to see SmartCoupon Page
    And  User is able to see Clipped Listed Coupon section on SmartCoupon Page
    When User clicks Clipped button on Coupons Page
    And User scrolls down to move bottom
    When User clicks Redeemed Coupons Tab on Coupons Page
    And  User is able to see Redeemed Coupons text on Redeemed Coupons Page
    When User clicks Account Tab on Home Page
    And User scrolls down to move bottom
    Then User is able to see sign out button in account page
    When User clicks sign out button in account page
    Then User is on Welcome Page

  @FD_996_TC5 @Standalone
  Scenario: Verify that User is navigated to Expired & unused coupons Page once user click on Expired & unused coupons CTA
    Given User is on Welcome Page
    When User clicks Log In button on Welcome Page
    And User enter the login details for "ValidLoginDetails"
    And User clicks Now Now button on Enable Biometric Login page
    And User clicks Start Saving button on Sign Up complete Page
    And User clicks Skip button on Enable My Location Page
    And User clicks Skip button on Enable My Location Page Pop Up
    And User clicks Not Now button on Keep Up to Date Page
    Then User is able to see Home text on Home Page
    When User clicks Coupons Tab on Home Page
    Then User is able to see SmartCoupon Page
    And  User is able to see Clipped Listed Coupon section on SmartCoupon Page
    When User clicks Clipped button on Coupons Page
    And User scrolls down to move bottom
    When User clicks Expired & Unused Coupons Tab on Coupons Page
    And  User is able to see Expired & Unused Coupons text on Expired & Unused Coupons Page
    When User clicks Account Tab on Home Page
    And User scrolls down to move bottom
    Then User is able to see sign out button in account page
    When User clicks sign out button in account page
    Then User is on Welcome Page
