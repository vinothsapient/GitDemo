@mobile
Feature: Search Coupon Feature

  @FD_993_TC2 @FD_990_TC2 @FD_991_TC2
  Scenario: Verify Coupons search and Search Interaction with guest user
    Given User clicks Continue as Guest button on Welcome Page
    When User click Continue as Guest link on popup dialog
    When User clicks Skip button on Enable My Location Page
    And User clicks Skip button on Enable My Location Page Pop Up
    And User clicks Not Now button on Keep Up to Date Page
    And User is able to see Home text on Home Page
    When User clicks Coupons Tab on Home Page
    Then User is able to see SmartCoupon Page
    And User is able to see the scanner on SmartCoupon Page
    And User is able to see the search for coupon text default on SmartCoupon Page
    And User click on searchBar on smartCoupon Page
    When User enter the "gl" in searchBar on smartCoupon Page
    Then User verifySearch drop down items count max ten on smartCoupon Page
    When User click on clear search button on smartCoupon Page
    And User enter the "glass" in searchBar on smartCoupon Page
    And User clicks enter button on smartCoupon page
    And User clicks back button on smartCoupon page
    Then User is able to see cancel link text on Search Coupon Page

  @FD_993_TC1 @FD_990_TC1 @FD_990_TC3 @FD_990_TC4 @FD_990_TC6
  @FD_992_TC1 @FD_992_TC3  @FD_992_TC4  @FD_992_TC7 @FD_991_TC1
  @FD_991_TC3 @FD_991_TC4 @FD_991_TC6 @FD_991_TC7
  Scenario: Verify Coupons search and Search Interaction with login user
    Given User is on Welcome Page
    When User clicks Log In button on Welcome Page
    And User enter the login details for "ValidLoginDetails"
    And User clicks Now Now button on Enable Biometric Login page
    And User clicks Start Saving button on Sign Up complete Page
    And User clicks Skip button on Enable My Location Page
    And User clicks Skip button on Enable My Location Page Pop Up
    And User clicks Not Now button on Keep Up to Date Page
    And User is able to see Home text on Home Page
    When User clicks Coupons Tab on Home Page
    Then User is able to see SmartCoupon Page
    And User is able to see the scanner on SmartCoupon Page
    And User is able to see the search for coupon text default on SmartCoupon Page
    And User click on searchBar on smartCoupon Page
    When User enter the "gl" in searchBar on smartCoupon Page
    Then User verifySearch drop down items count max ten on smartCoupon Page
    When User click on clear search button on smartCoupon Page
    Then User enter the "glass" in searchBar on smartCoupon Page
    And User clicks enter button on smartCoupon page
    And User clicks back button on smartCoupon page
    And User is able to see cancel link text on Search Coupon Page
    When User clicks Account Tab on Home Page
    And User scrolls down to move bottom
    Then User is able to see sign out button in account page
    When User clicks sign out button in account page
    Then User is on Welcome Page

  @FD_992_TC5
  Scenario: search with valid coupon name
    Given User is on Welcome Page
    When User clicks Log In button on Welcome Page
    And User enter the login details for "ValidLoginDetails"
    And User clicks Now Now button on Enable Biometric Login page
    And User clicks Start Saving button on Sign Up complete Page
    And User clicks Skip button on Enable My Location Page
    And User clicks Skip button on Enable My Location Page Pop Up
    And User clicks Not Now button on Keep Up to Date Page
    And User is able to see Home text on Home Page
    When User clicks "Coupons" Tab on Home Page
    Then User is able to see SmartCoupon Page
    And User click on searchBar on smartCoupon Page
    When User enter the "tide" in searchBar on smartCoupon Page
    And User clicks enter button on smartCoupon page
    Then User verifies search "tide" coupon name matches from list in smart coupon page
    When User clicks Account Tab on Home Page
    And User scrolls down to move bottom
    Then User is able to see sign out button in account page
    When User clicks sign out button in account page
    Then User is on Welcome Page

  @FD_477_TC1 @FD_477_TC2 @Standalone
  Scenario: Verify the Coupon UI
    Given User is on Welcome Page
    When User clicks Log In button on Welcome Page
    And User enter the login details for "ValidLoginDetails"
    And User clicks Now Now button on Enable Biometric Login page
    And User clicks Start Saving button on Sign Up complete Page
    And User clicks Skip button on Enable My Location Page
    And User clicks Skip button on Enable My Location Page Pop Up
    And User clicks Not Now button on Keep Up to Date Page
    Then User is able to see Home text on Home Page
    When User clicks More Tab on Home Page
    And User will click on search bar from more page
    And User enter search "Tide" in search box and select on more page
    When  User tap on first product from List
    When User scrolls down to move coupon
    And User is able to see "Available Coupons" text on PDP Page
    When User clicks Account Tab on Home Page
    And User scrolls down to move bottom
    Then User is able to see sign out button in account page
    When User clicks sign out button in account page
    Then User is on Welcome Page
