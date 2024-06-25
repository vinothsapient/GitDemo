@mobile
Feature: Product Listing Page

  Background:
    Given User is on Welcome Page
    When User clicks Log In button on Welcome Page
    And User enter the login details for "ValidLoginDetails"
    And User clicks Now Now button on Enable Biometric Login page
    And User clicks Start Saving button on Sign Up complete Page
    And User clicks Skip button on Enable My Location Page
    And User clicks Skip button on Enable My Location Page Pop Up
    And User clicks Not Now button on Keep Up to Date Page
    Then User is able to see More text on Home Page
    When User clicks More Tab on Home Page

  @FD_743_TC11 @FD_743_TC12 @FD_743_TC13 @FD_743_TC18 @FD_743_TC6
  Scenario: User navigate to PLP Page with Explore Product categories search option
    And User enter search "shirts" in search box and select on more page
    Then User is able to view " Filters" under L4 Sub Categories Page
    And User is able to view "Home" under L4 Sub Categories Page
    And User is able to view "Ads & Books" under L4 Sub Categories Page
    And User is able to view "Coupons" under L4 Sub Categories Page
    And User is able to view "Account" under L4 Sub Categories Page
    And User is able to view "More" under L4 Sub Categories Page
    And User is able to view "Smart Coupon Available" under L4 Sub Categories Page
    And User is able to view PLP product list in L4 Sub Categories Page
    And User is able to view total number of products searched on L4 Sub Categories Page
    And User is able to view Smart Coupon toggle button on PLP Page
    And User is able to view back button on Category Page
    When User clicks on back button on Category Page
    Then User is able to view "Cleaning" as header on Sub Categories Page
    When User clicks Account Tab on Home Page
    And User scrolls down to move bottom
    Then User is able to see sign out button in account page
    When User clicks sign out button in account page
    Then User is on Welcome Page

  @FD_743_TC14
  Scenario: User able to see Smart Coupon available product when Toggle button on In shop Category search options
    And User search "Skin Care" in search box on more page
    And User clicks enter button on more page
    Then User is able to view "Smart Coupon Available" under L4 Sub Categories Page
    And User is able to view Smart Coupon toggle button on PLP Page
    When User clicks on Smart Coupon toggle button on PLP Page
    Then verify User able to see product List Page
    And User is able to view "Smart Coupon" under L4 Sub Categories Page
    When User clicks Account Tab on Home Page
    And User scrolls down to move bottom
    Then User is able to see sign out button in account page
    When User clicks sign out button in account page
    Then User is on Welcome Page

  @FD_744_TC2 @FD_744_TC3 @FD_744_TC4 @FD_744_TC5 @FD_744_TC6
  Scenario: User verify Smart coupon displayed is product applicable for Smart Coupon
    Then User is able to see Scanner icon in More Page
    And User clicks Explore Product Categories Tab on More Page
    Then User is able to see Explore All Categories Header on Category Page
    When User clicks on "Food & Beverages" under Find Products by Category section
    And User clicks on "Breakfast" under Sub Categories Page
    Then User is able to view PLP product list in L4 Sub Categories Page
    And User is able to view total number of products searched on L4 Sub Categories Page
    And User is able to view Smart Coupon toggle button on PLP Page
    And verify User able to see product List Page
    And User is able to view product Image for every product
    And User verify product Previous Price showing for every product
    And User verify product Rating widget showing for every product
    And User is able to view "$" under L4 Sub Categories Page
    And User is able to view "each" under L4 Sub Categories Page
    When User clicks Account Tab on Home Page
    And User scrolls down to move bottom
    Then User is able to see sign out button in account page
    When User clicks sign out button in account page
    Then User is on Welcome Page
