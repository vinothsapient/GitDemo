@mobile @FD_iBotta
Feature: Explore All CTA in Home page for Guest and Logged In User

  Background:
    Given User is on Welcome Page
    And User is able to see Family Dollar Icon on Welcome Page

  @GuestUserExploreAll @FD_300_TC09 @FD_300_TC10 @FD_300_TC11
  Scenario: Verify "Explore All CTA" Workflow For Guest user iBotta
    When User clicks Continue as Guest button on Welcome Page
    And User click Continue as Guest link on popup dialog
    And User clicks Skip button on Enable My Location Page
    And User clicks Skip button on Enable My Location Page Pop Up
    And User clicks Not Now button on Keep Up to Date Page
    Then User is able to see Home text on Home Page
    And User will see "Explore All" on home page
    And User is able to see Smart Coupons For You label on Home Page
    When User clicks on Explore All CTA button on Home Page
    Then User able to see All Suggested Coupons For You label on SmartCoupon Page
    And User able to see "Expiring Soon" Default sort option on All Suggested Coupons page
    And User is able to see coupons count on All Suggested Coupons page
    And User is able to see Smart Coupon Sign In to Clip Coupon Text on All Suggested Coupons page
    When User clicks on Coupon sort CTA
    Then User is able to see Sorting Box Open Up
    And User is able to see all sorting opting text
      | Expiring Soon   |
      | Newest Offers   |
      | Popular Offers  |
      | Biggest Savings |
    And User is unable to see all sorting opting text
      | For You |
    And User is able to see close button in Sorting Box
    And User clicks on close button in Sorting box
    When User clicks Sign In to Clip Coupon button on All Suggested Coupons Page
    Then User is redirected to the login page

  @LoggedIn_NonVerified_User_ExploreAll @FD_300_TC06 @FD_300_TC07 @FD_300_TC08
  Scenario: Verify "Explore All" CTA Workflow For Logged In Non Verified user
    When User clicks Log In button on Welcome Page
    And User enter the login details for "NonVerifiedLoginDetails"
    And User clicks Now Now button on Enable Biometric Login page
    And User clicks Start Saving button on Sign Up complete Page
    And User clicks Skip button on Enable My Location Page
    And User clicks Skip button on Enable My Location Page Pop Up
    And User clicks Not Now button on Keep Up to Date Page
    Then User is able to see Home text on Home Page
    And User will see "Explore All" on home page
    And User is able to see Smart Coupons For You label on Home Page
    When User clicks on Explore All CTA button on Home Page
    Then User able to see All Suggested Coupons For You label on SmartCoupon Page
    And User able to see "Expiring Soon" Default sort option on All Suggested Coupons page
    And User is able to see coupons count on All Suggested Coupons page
    And User is able to see Clip Coupon text on All Suggested Coupons page
    When User clicks on Coupon sort CTA
    Then User is able to see Sorting Box Open Up
    And User is able to see all sorting opting text
      | Expiring Soon   |
      | Newest Offers   |
      | Popular Offers  |
      | Biggest Savings |
    And User is unable to see all sorting opting text
      | For You |
    And User is able to see close button in Sorting Box
    And User clicks on close button in Sorting box
    When User clicks More Tab on Home Page
    And User clicks Your Profile link on Account Page
    And User scrolls down for one time
    And User clicks sign out button in Profile page
    Then User is on Welcome Page