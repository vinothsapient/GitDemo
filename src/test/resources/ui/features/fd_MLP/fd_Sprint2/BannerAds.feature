@mobile
Feature: BannerAds feature

  @FD_1553_5
  Scenario: Verify banner from Main Categories (L2) Banner Ad
    Given User is on Welcome Page
    When User clicks Log In button on Welcome Page
    And User enter the login details for "ValidLoginDetails"
    And User clicks Now Now button on Enable Biometric Login page
    And User clicks Start Saving button on Sign Up complete Page
    And User clicks Skip button on Enable My Location Page
    And User clicks Skip button on Enable My Location Page Pop Up
    And User clicks Not Now button on Keep Up to Date Page
    When User clicks More Tab on Home Page
    And User clicks Explore Product Categories Tab on More Page
    When User clicks on "Food & Beverages" under Find Products by Category section
    And User clicks on "Condiments & Garnishes" under Sub Categories Page
    Then User is able to View the Banner ads
    When User clicks Account Tab on Home Page
    And User scrolls down to move bottom
    Then User is able to see sign out button in account page
    When User clicks sign out button in account page
    Then User is on Welcome Page

  @FD_1554_5
  Scenario: Verify banner from Coupon Landing page Coupon Navigation Page
    Given User is on Welcome Page
    When User clicks Log In button on Welcome Page
    And User enter the login details for "ValidLoginDetails"
    And User clicks Now Now button on Enable Biometric Login page
    And User clicks Start Saving button on Sign Up complete Page
    And User clicks Skip button on Enable My Location Page
    And User clicks Skip button on Enable My Location Page Pop Up
    And User clicks Not Now button on Keep Up to Date Page
    When User clicks More Tab on Home Page
    And User clicks Explore Coupon Categories Tab on More Page
    Then User is able to View the Banner ads
    When User clicks Account Tab on Home Page
    And User scrolls down to move bottom
    Then User is able to see sign out button in account page
    When User clicks sign out button in account page
    Then User is on Welcome Page

  @FD_1504_5
  Scenario: Verify the banner from the Product Listing Pages (PLPs)
    Given User is on Welcome Page
    When User clicks Log In button on Welcome Page
    And User enter the login details for "ValidLoginDetails"
    And User clicks Now Now button on Enable Biometric Login page
    And User clicks Start Saving button on Sign Up complete Page
    And User clicks Skip button on Enable My Location Page
    And User clicks Skip button on Enable My Location Page Pop Up
    And User clicks Not Now button on Keep Up to Date Page
    When User clicks More Tab on Home Page
    And User clicks Explore Product Categories Tab on More Page
    When User clicks on "Food & Beverages" under Find Products by Category section
    When User scrolls down to move coupon
    Then User is able to View the Banner ads
    When User clicks Account Tab on Home Page
    And User scrolls down to move bottom
    Then User is able to see sign out button in account page
    When User clicks sign out button in account page
    Then User is on Welcome Page
