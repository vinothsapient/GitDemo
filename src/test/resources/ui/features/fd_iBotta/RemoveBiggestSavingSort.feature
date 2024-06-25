@mobile @iBotta
Feature: Remove Biggest Saving Sort Option

  @FD_56_TC01 @FD_56_TC02 @TC_56_TC03
  Scenario: Verify for logged in user "Biggest Savings" sort option is not present
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
    When User clicks on All Coupons Link on All Listed Coupon section
    Then User is able to see All coupons header on All coupons Page
    And User clicks on Coupon sort CTA
    Then User is able to see Sorting Box Open Up
    And User is able to see all sorting opting text
      | Expiring Soon   |
      | Newest Offers   |
      | Popular Offers  |
    And User is unable to see all sorting opting text
      | Biggest Savings |
    When User clicks on close button in Sorting box
    Then User is able to see Coupon sort CTA
    When User clicks Coupons Tab on Home Page
    Then User is able to see SmartCoupon Page
    And User is able to see Explore By Category on All Listed Coupon section
    When User clicks First Category From Categories List on Coupon details Page
    When User clicks on Coupon sort CTA
    Then User is able to see Sorting Box Open Up
    And User is able to see all sorting opting text
      | Expiring Soon   |
      | Newest Offers   |
      | Popular Offers  |
    And User is unable to see all sorting opting text
      | Biggest Savings |
    When User clicks on close button in Sorting box
    Then User is able to see Coupon sort CTA
    When User clicks Coupons Tab on Home Page
    Then User is able to see SmartCoupon Page
    When User clicks Clipped CTA on Coupons Page
    And User clicks on Coupon sort CTA
    Then User is able to see Sorting Box Open Up
    And User is able to see all sorting opting text
      | Expiring Soon   |
      | Newest Offers   |
      | Popular Offers  |
    And User is unable to see all sorting opting text
      | Biggest Savings |
    When User clicks on close button in Sorting box
    Then User is able to see Coupon sort CTA


  @FD_56_TC04 @FD_56_TC05
  Scenario: Verify for guest user "Biggest Savings" sort option is not present
    Given User is on Welcome Page
    And User is able to see Family Dollar Icon on Welcome Page
    When User clicks Continue as Guest button on Welcome Page
    And User click Continue as Guest link on popup dialog
    And User clicks Skip button on Enable My Location Page
    And User clicks Skip button on Enable My Location Page Pop Up
    And User clicks Not Now button on Keep Up to Date Page
    Then User is able to see Coupon text on Home Page
    When User clicks Coupons Tab on Home Page
    Then User is able to see SmartCoupon Page
    When User clicks on All Coupons Link on All Listed Coupon section
    Then User is able to see All coupons header on All coupons Page
    And User clicks on Coupon sort CTA
    Then User is able to see Sorting Box Open Up
    And User is able to see all sorting opting text
      | Expiring Soon   |
      | Newest Offers   |
      | Popular Offers  |
    And User is unable to see all sorting opting text
      | Biggest Savings |
    When User clicks on close button in Sorting box
    Then User is able to see Coupon sort CTA
    When User clicks Coupons Tab on Home Page
    Then User is able to see SmartCoupon Page
    And User is able to see Explore By Category on All Listed Coupon section
    And User clicks First Category From Categories List on Coupon details Page
    When User clicks on Coupon sort CTA
    Then User is able to see Sorting Box Open Up
    And User is able to see all sorting opting text
      | Expiring Soon   |
      | Newest Offers   |
      | Popular Offers  |
    And User is unable to see all sorting opting text
      | Biggest Savings |
    When User clicks on close button in Sorting box
    Then User is able to see Coupon sort CTA
