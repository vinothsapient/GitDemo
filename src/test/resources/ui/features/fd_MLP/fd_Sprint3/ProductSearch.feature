@mobile
Feature: Product Search Feature

  Background: login to the application
    Given User is on Welcome Page
    When User clicks Log In button on Welcome Page
    And User enter the login details for "ValidLoginDetails"
    And User clicks Now Now button on Enable Biometric Login page
    And User clicks Start Saving button on Sign Up complete Page
    And User clicks Skip button on Enable My Location Page
    And User clicks Skip button on Enable My Location Page Pop Up
    And User clicks Not Now button on Keep Up to Date Page
    Then User is able to see More text on Home Page

  @FD_738_TC1 @FD_738_TC4 @FD_738_TC3 @FD_738_TC2 @FD_738_TC5 @FD_737_TC2
  Scenario:Verify default values and fields in search bar
    And User clicks More Tab on Home Page
    And User will click on search bar from more page
    And User clicks enter button on more page
    And User will see default search "Search Products and Coupons" on more page
    And User will see cancel button more page
    And User will see default trending header on more page
    And User verify trending search items with default count more page
    And User search "shirt" in search box on more page
    And User verifies dropdown fields are same search "shirt" text on more page
    And User clicks enter button on more page
    And User will click on search bar from more page
    And User clicks cancel icon in searchBar on more page
    And User will see previous Search Header on more page
    And user click on clear link on more page
    And User will not see previous Search Header on more page
    And User will see default search "Search Products and Coupons" on more page
    When User clicks Account Tab on Home Page
    And User scrolls down to move bottom
    Then User is able to see sign out button in account page
    When User clicks sign out button in account page
    Then User is on Welcome Page

  @FD_465_TC1 @FD_737_TC3 @FD_737_TC4 @FD_737_TC7
  Scenario: Verify search list
    And User clicks More Tab on Home Page
    And User verifies search icon present on more page
    And User verifies scanner present on more page
    And User will click on search bar from more page
    And User enter search "shirts" in search box and select on more page
    And User will see smartCoupon on more page
    And User will see FilterButton on more page
    And User will see sortButton on more page
    And User will scroll bottom in more page
    And User will see showing 30 default text on more page
    And User will see loadMoreButton on more page
    And User will see productCount on more page
    And User verifies search "shirts" product name matches from list in more page
    When User clicks Account Tab on Home Page
    And User scrolls down to move bottom
    Then User is able to see sign out button in account page
    When User clicks sign out button in account page
    Then User is on Welcome Page

  @FD_739_TC1 @FD_739_TC2 @FD_2035_TC1 @FD_1913_TC1 @FD_1913_TC2 @FD_1913_TC3 @FD_1913_TC4 @FD_1913_TC5
  @FD_1913_TC6 @FD_1913_TC7 @FD_1913_TC8 @FD_1913_TC9 @FD_1913_TC10
  Scenario:Empty Search results Verification for Coupons and products
    And User clicks More Tab on Home Page
    And User search "XXXBMSFYT" in search box on more page
    And User clicks enter button on more page
    And User will see "No Products Found" on more page
    And User will see "We couldn’t find any results for “XXXBMSFYT”. Try searching again, exploring by category, or scan a product if you are in a Family Dollar store." on more page
    And User will see "Explore Product Categories" on more page
    And User will see "Scan Product Barcode" on more page
    And User click "coupons" button on more page
    And User will see "No Coupons Found" on more page
    And User will see "Explore Coupon Categories" on more page
    And User will see "Scan In-Store Coupons" on more page
    And User will see "We couldn’t find any results for “[object Object]”. Try searching again, exploring by category, or scan a product if you are in a Family Dollar store." on more page
    When User clicks Account Tab on Home Page
    And User scrolls down to move bottom
    Then User is able to see sign out button in account page
    When User clicks sign out button in account page
    Then User is on Welcome Page
