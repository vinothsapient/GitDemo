@mobile
Feature: Coupon Details Page - Structure

  @FD_982_TC1 @FD_982_TC3 @FD_982_TC5 @FD_983_TC4
  Scenario: Verify Coupon screen UI
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
    When User selects any coupon from SmartCoupon Page
    Then User is able to see Coupon details page
    And User is able see to Back button on Coupon details page
    And User is able to see the search icon on Coupon Details Page
    And User is able to see the scanner on Coupon Details Page
    And User is able to see the search for coupon text default on Coupon Details Page
    And User is able to see For Your Store on Coupon Details Page
    And User is able to see Clip coupon CTA on Coupon Details Page
    And User is able to see Terms and Conditions on Coupon Details Page
    When User scrolls down to move bottom
    Then User is able to see Scan in Store Products CTA on Coupon Details Page
    And User is able to see Related Smart Coupons on Coupon Details Page
    When User clicks Account Tab on Home Page
    And User scrolls down to move bottom
    Then User is able to see sign out button in account page
    When User clicks sign out button in account page
    Then User is on Welcome Page

  @FD_982_TC4
  Scenario: Verify back button on the Coupon details page
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
    When User selects any coupon from SmartCoupon Page
    Then User is able to see Coupon details page
    And User is able see to Back button on Coupon details page
    When User clicks back button on Coupon Details page
    Then User is able to see SmartCoupon Page
    When User clicks Account Tab on Home Page
    And User scrolls down to move bottom
    Then User is able to see sign out button in account page
    When User clicks sign out button in account page
    Then User is on Welcome Page

  @FD_983_TC1 @FD_983_TC3
  Scenario: Verify when user is on the coupon details page and focus on the product tile
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
    When User selects any coupon from SmartCoupon Page
    Then User is able to see Coupon details page
    And User is able to see Product Image on Coupon Details Page
    And User is able to see "Save $4.60" text on Coupon details Page
    And User is able to see "Tide, Downy, Bounce" text on Coupon details Page
    And User is able to see "Exp. Saturday, September 30" text on Coupon details Page
    And User is able to see "Buy(1) 25ct Tide Power Pod AND(1) 48oz or 77oz Downy Softener, 25.5oz Downy Rinse, AND Downy 8.6oz Bead, Get 40ct Pet or 80ct Bounce sheet FREE" text on Coupon details Page
    When User clicks Account Tab on Home Page
    And User scrolls down to move bottom
    Then User is able to see sign out button in account page
    When User clicks sign out button in account page
    Then User is on Welcome Page

  @FD_987_TC1 @FD_987_TC3
  Scenario: Verify Terms and Conditions on the coupon details page
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
    When User selects any coupon from SmartCoupon Page
    Then User is able to see Coupon details page
    When User scrolls down to move bottom
    Then User is able to see Terms and Conditions on Coupon Details Page
    When User clicks on Terms and Conditions on Coupon Details Page
    Then User is able to see "Must purchase 3 forms including the free beads to redeem. Dealer: Submission to Procter & Gamble signifies compliance with 'Requirements for Proper Coupon Redemption.' Please visit this link for coupon terms for proper redemption: http://www.pg.com/en_US/downloads/partners_suppliers/PG_Coupon_Terms_of_Proper_Redemption.pdf. Limit of one coupon per item. Consumer: Limit ONE coupon per purchase of products and quantities stated. Any other use constitutes fraud. Coupons are not authorized if purchasing products for resale. You may pay sales tax. Not valid in Puerto Rico." text on Coupon details Page
    And User is able to see Scan in Store Products CTA on Coupon Details Page
    When User clicks Account Tab on Home Page
    And User scrolls down to move bottom
    Then User is able to see sign out button in account page
    When User clicks sign out button in account page
    Then User is on Welcome Page
