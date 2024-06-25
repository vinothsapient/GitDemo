@mobile @FD_iBotta
Feature: Coupons Screen Components Workflow

  Background:
    Given User is on Welcome Page
    And User is able to see Family Dollar Icon on Welcome Page

  @LoginUserWorkflowCouponsTab @FD_28_TC1 @FD_28_TC2 @FD_28_TC3 @FD_28_TC4 @FD_45_TC1 @FD_45_TC2 @FD_45_TC3 @FD_45_TC4 @FD_45_TC5
  @FD_51_TC1 @FD_51_TC2 @FD_51_TC3 @FD_51_TC4 @FD_51_TC5 @FD_41_TC1 @FD_42_TC2 @FD_43_TC3 @FD_117_TC1 @FD_117_TC3
  Scenario: Verify when user is on the coupon details page
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
    And User click on searchBar on smartCoupon Page
    When User enter the "tide" in searchBar on smartCoupon Page
    And User clicks enter button on smartCoupon page
    Then User verifies search "tide" coupon name matches from list in smart coupon page
    When User clicks Coupons Tab on Home Page
    Then User is able to see SmartCoupon Page
    When User tap on the coupon on coupons page
    And User is able to see the Share Icon on Coupon Details Page
    When User Clicks on Share Icon

