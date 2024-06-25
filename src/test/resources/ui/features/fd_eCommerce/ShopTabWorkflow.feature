@mobile @FD_eCommerce @FD_iBotta
Feature: Shop Tab Workflow

  Background:
    Given User is on Welcome Page
    And User is able to see Family Dollar Icon on Welcome Page

  @LoginUserWorkflowAdsAndBooksTab @FD_465_TC1 @FD_465_TC2 @FD_465_TC8 @FD_465_TC9 @FD_465_TC10
  @FD_466_TC1 @FD_466_TC4@FD_467_TC1 @FD_467_TC3 @FD_468_TC1 @FD_468_TC5 @FD_469_TC1 @FD_469_TC2
  @FD_469_TC8 @FD_470_TC1 @FD_715_716_TC2 @FD_715_TC @FD_712_713_714_TC6 @FD_3940_TC1 @FD_3940_TC2
  @FD_3940_TC3 @FD_3940_TC4 @FD_3940_TC5
  Scenario: Verify Login User Workflow For Shop Screen
    When User clicks Log In button on Welcome Page
    And User enter the login details for "ValidLoginDetails"
    And User clicks Now Now button on Enable Biometric Login page
    And User clicks Start Saving button on Sign Up complete Page
    And User clicks Skip button on Enable My Location Page
    And User clicks Skip button on Enable My Location Page Pop Up
    And User clicks Not Now button on Keep Up to Date Page
    Then User is able to see Shop button on Global Navigation
    When User clicks Shop button on Home Page
    Then User is able to see the search icon on Shop Page
    And User is able to see the Search Products and Coupons default text on Shop Page
    And User is able to see the scanner on Shop Page
    And User is able to see AdsAndBooks Image on Shop Page
    And User is able to see AdsAndBooks Title text "Explore via Ads & Books" on Shop Page
    And User is able to see AdsAndBooks Store Title text "Based on your store" on Shop Page
    And User is able to see AdsAndBooks Store on Shop Page
    When User clicks Explore AdsAndBooks button on Shop Page
    Then User is on Ads and Books Page
    And User is able to see back button on AdsAndBooks Page
    And User is able to see For Your Store text on Ads And Books Page
    And User is able to see Store Address text on Ads And Books Page
    And User is able to see Change Store text on Ads And Books Page
    And User is able to see Ads and Books Image on Ads And Books Page
    And User is able to see Ads and Books Title on Ads And Books Page
    And User will see max ten adds on AdsAndBooks Page
    When User clicks first add on AdsAndBooks Page
    And User is able to see back button on AdsAndBooks details Page
    And User is able to see "Featured" on AdsAndBooks Landing Top Category Label
    When User click adds Image on Ads and Books Page
    And User clicks back button on AdsAndBooks Detail Page
    And User clicks back button on AdsAndBooks Detail Page
    And User will click second add on AdsAndBooks Page
    Then User is able to see "Featured" on AdsAndBooks Landing Top Category Label
    And User clicks back button on AdsAndBooks Detail Page
    And User clicks back button on AdsAndBooks Detail Page
    And User is able to see Featured Title on Shop Page
    When User scroll down little on home page
    And User is able to see Find Products By Category on Shop Page
    When User scrolls down for one time
    And User scrolls down for one time
    And User scrolls down for one time
    Then User is able to see Banner Ads Image on Shop Page at the End
    And User is able to see "Sponsored" Coupon label below Banner Ad on Shop Page
    When User clicks More Tab on Home Page
    And User clicks Your Profile link on Account Page
    And User scrolls down for one time
    And User clicks sign out button in Profile page
    Then User is on Welcome Page
    When User clicks Continue as Guest button on Welcome Page
    And User click Continue as Guest link on popup dialog
    Then User is able to see Shop button on Global Navigation
    When User clicks Shop button on Home Page
    Then User is able to see AdsAndBooks Image on Shop Page
    And User is able to see AdsAndBooks Title text "Explore via Ads & Books" on Shop Page
    And User is able to see AdsAndBooks Store Title text "Based on your store" on Shop Page
    When User clicks Explore AdsAndBooks button on Shop Page
    Then User is on Ads and Books Page
    And User is able to see No Store Selected text on Home Page
    And User is able to see Select a Store text on Home Page
    And User is able to see Select a Store description text on Home Page
    When User clicks Select a Store button on Adds And Books Page
    And User select Only this time on Device Location pop up
    And User clicks OK button on Profile PopUp Page
    Then User is able to see "Choose a Store" header on Choose A Store Page
    And User is able to see back button on Choose A Store Page
    And User is able to see Search icon on Choose A Store Page
    And User is able to see "Enter ZIP code, City, or State" default Search on Choose A Store Page
    And User is able to see Google Map on Choose A Store Page
    And User is able to see Location icon on Choose A Store Page
    When User enters the Zipcode "11202"
    Then User is able to see Store List on Choose A Store Page
    When User selects a Store from Choose A Store Page
    Then User is able to see "Make This My Store" link text on Choose A Store Page
    When User clicks Make This My Store button on Choose Store Page
    Then User is on Ads and Books Page
    And User is able to see For Your Store text on Ads And Books Page
    And User is able to see Store Address text on Ads And Books Page
    And User is able to see Change Store text on Ads And Books Page
    And User is able to see Ads and Books Image on Ads And Books Page
    And User is able to see Ads and Books Title on Ads And Books Page
