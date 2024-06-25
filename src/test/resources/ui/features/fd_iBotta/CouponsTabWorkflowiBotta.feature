@mobile @FD_iBotta @FD_eCommerce
Feature: Coupons Screen Components Workflow

  Background:
    Given User is on Welcome Page
    And User is able to see Family Dollar Icon on Welcome Page

  @LoginUserWorkflowCouponsTab @FD_53_TC1 @FD_53_TC2 @FD_53_TC3 @FD_53_TC4 @FD_53_TC5 @FD_39_TC1 @FD_39_TC2 @FD_39_TC3 @FD_54_TC1 @FD_23_TC1
  @FD_53_TC6 @FD_53_TC7 @FD_53_TC8 @FD_53_TC9 @FD_53_TC10 @FD_201_TC1 @FD_201_TC2 @FD_201_TC3 @FD_201_TC4 @FD_201_TC5
  @FD_46_TC1 @FD_46_TC2 @FD_46_TC3 @FD_300_TC01 @FD_300_TC02 @FD_300_TC03 @FD_300_TC04 @FD_300_TC0
  Scenario: Verify Login User Workflow For Coupons Screen iBotta
    When User clicks Log In button on Welcome Page
    And User enter the login details for "ValidLoginDetails"
    And User clicks Now Now button on Enable Biometric Login page
    And User clicks Start Saving button on Sign Up complete Page
    And User clicks Skip button on Enable My Location Page
    And User clicks Skip button on Enable My Location Page Pop Up
    And User clicks Not Now button on Keep Up to Date Page
    Then User is able to see Home text on Home Page
    And User will see "View All" on home page
#    And User is able to see Smart Coupons For You label on Home Page
    And User is able to see Trending Smart Coupons label on Home Page
#    When User clicks on Explore All CTA button on Home Page
    When User clicks on View All CTA button on Home Page
    Then User able to see All Suggested Coupons For You label on SmartCoupon Page
    And User able to see "Biggest Savings" Default sort option on All Suggested Coupons page
    And User is able to see coupons count on All Suggested Coupons page
    And User is able to see Clip Coupon text on All Suggested Coupons page
    When User clicks on Coupon sort CTA
    Then User is able to see Sorting Box Open Up
    And User is able to see all sorting opting text
      | Biggest Savings |
      | Newest Offers   |
      | Popular Offers  |
    And User is unable to see all sorting opting text
      | For You         |
      | Expiring Soon   |
    And User is able to see close button in Sorting Box
    And User clicks on close button in Sorting box
    When User clicks Coupons Tab on Home Page
    Then User is able to see SmartCoupon Page
    And User is able to see Lifetime Savings text on iBotta Coupons Page
    And User is able to see total Lifetime Savings done by the user
    And User is able to see info icon on SmartCoupon Page
    When User clicks info icon on SmartCoupon Page
    Then User is able to see info icon tooltip message
    When User clicks on Info Icon Tooltip on SmartCoupon Page
    Then User is able to see Barcode Header Icon on SmartCoupon Page
    And User is able to see Barcode Title on SmartCoupon Page
    And User is able to see Redeem Coupons text on Coupons Page
    When User clicks on Redeem Coupons on Coupons Page
    Then User is able to see Barcode Title on SmartCoupon Page
#    And User is able to see "Clipped" Amount In Barcode Page
#    And User is able to see Clipped Coupons In Barcode Page
    And User is able to see Barcode Image In Barcode Page
    And User is able to see Phone Number Text In Barcode Page
    And User is able to see Barcode Instruction Text In Barcode Page
    And User is able to see Barcode page close button
    When User clicks on Barcode page close button
    Then User is able to see Redeem Coupons text on Coupons Page
    And User is able to see the search icon on SmartCoupon Page
    And User is able to see the search for coupon text default on SmartCoupon Page
    And User is able to see the scanner on SmartCoupon Page
#    And User is able to see Browse section on SmartCoupon Page
    And User is able to see Recommended section on SmartCoupon Page
    And User is able to see Clipped Listed Coupon section on SmartCoupon Page
#    And User is able to see Redeemed section on SmartCoupon Page
    And User is able to see Expiring Soon section on SmartCoupon Page
#    And User is able to see Smart Coupons For You label on SmartCoupon Page
    And User is able to see Trending label on SmartCoupon Page
#    And User is able to see Explore All link in Browse section on SmartCoupon Page
    And User is able to see View All link in Recommended section on SmartCoupon Page
    When User clicks on View All CTA button on Home Page
    Then User able to see All Suggested Coupons For You label on SmartCoupon Page
    And User is able to see Clip Coupon text on All Suggested Coupons page
    And User is able to see coupons count on All Suggested Coupons page
    And User able to see "Biggest Savings" Default sort option on All Suggested Coupons page
    When User clicks on Coupon sort CTA
    Then User is able to see Sorting Box Open Up
    And User is able to see all sorting opting text
      | Biggest Savings |
      | Newest Offers   |
      | Popular Offers  |
    And User is unable to see all sorting opting text
      | For You         |
      | Expiring Soon   |
    And User is able to see close button in Sorting Box
    And User clicks on close button in Sorting box
    When User clicks Back Button on All Suggested Coupons Page
    Then User is able to see Smart Coupon Image on SmartCoupon Page
    And User is able to see Smart Coupon Discount Text on SmartCoupon Page
    And User is able to see Smart Coupon Title Text on SmartCoupon Page
#    And User is able to see Smart Coupon Expiry Text on SmartCoupon Page
    And User is able to see Smart Coupon Description Text on SmartCoupon Page
    And User is able to see Clip Coupon text under Trending section
    When User scrolls down for one time
#    Then User is able to see Browse By Category on Browse section
    Then User is able to see Explore By Category on Recommended section
    And User is able to see All Coupons Link on Browse section
    And User is able to see Categories List on Browse section
    And User is able to see Food and Beverages category under Browse By Category
    And User scrolls down for one time
    Then User is able to see Explore via Ads and Books text on SmartCoupon Page
    And User is able to see Banner Ads Image on SmartCoupon Page at the End
    And User is able to see "Sponsored" Coupon label below Banner Ad on SmartCoupon Page
    When User clicks on Expiring Soon tab on SmartCoupon Page
    Then User is able to see Expiring Soon Coupons on Expiring Soon Section if available
#    And User is able to see "Redeemed Coupons" header on Redeemed Coupons page
#    And User is able to see total Redeemed Coupons on Redeemed Coupons Page
#    And User is able to see "Redeemed Recently" sorted text on Redeemed Coupons Page
    When User click on searchBar on smartCoupon Page
    Then User is able to see cancel link text on Search Coupon Page
    And User is able to see Trending Search text on Search Coupon Page
    And User is able to see Scan Barcode Button on Coupon Search Page
    And User is able to see Scan Product Barcode text on Coupon Search Page
    Then User clicks cancel link button on Search Coupon Page
#    And User is able to see Redeemed section on SmartCoupon Page
    When User clicks More Tab on Home Page
    And User clicks Your Profile link on Account Page
    And User scrolls down for one time
    And User clicks sign out button in Profile page
    Then User is on Welcome Page



  @LoginUserWorkflowCouponsTab @FD_129_TC1 @FD_129_TC2 @FD_129_TC3 @FD_371_TC1 @FD_371_TC2 @FD_371_TC3 @FD_371_TC4 @FD_371_TC5 @FD_371_TC6
  Scenario: Verify Login User is able to see Explore all on home Page and Message text on More screen
    When User clicks Log In button on Welcome Page
    And User enter the login details for "ValidLoginDetails"
    And User clicks Now Now button on Enable Biometric Login page
    And User clicks Start Saving button on Sign Up complete Page
    And User clicks Skip button on Enable My Location Page
    And User clicks Skip button on Enable My Location Page Pop Up
    And User clicks Not Now button on Keep Up to Date Page
    Then User is able to see Home text on Home Page
#    And User is able to see "Smart Coupons® for You" Smart Coupon Header title on Home Page
    And User is able to see Trending Smart Coupons label on Home Page
#    And User is able to see "Explore All" Smart Coupon Header link on Home Page
    And User will see "View All" on home page
    Then User is able to see Smart Coupon Tag on Home Page
    And User is able to see Smart Coupon Image on Home Page
    And User is able to see Smart Coupon Discount Text on Home Page
    And User is able to see Smart Coupon Title Text on Home Page
    And User is able to see Smart Coupon Expiry Text on Home Page
    When User clicks More Tab on Home Page
    Then User is able to see Message text on More Page
    When User clicks Message button on More Page
    Then User is on Message display Page
    And User is able to see Back Button on Message Display Page
    When User clicks Back Button on Message Display Page
    When User clicks More Tab on Home Page
    And User clicks Your Profile link on Account Page
    And User scrolls down for one time
    And User clicks sign out button in Profile page
    Then User is on Welcome Page
