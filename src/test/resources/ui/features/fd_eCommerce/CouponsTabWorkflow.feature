@mobile @FD_eCommerce_iBotta_Disabled
Feature: Coupons Screen Components Workflow

  Background:
    Given User is on Welcome Page
    And User is able to see Family Dollar Icon on Welcome Page

  @LoginUserWorkflowCouponsTab @FD_997_TC1 @FD_997_TC2 @FD_997_TC3 @FD_988_TC4 @FD_2040_TC1
  @FD_988_TC1 @FD_988_TC3 @FD_988_TC5 @FD_993_TC3 @FD_989_TC1 @FD_989_TC3 @FD_989_TC4 @FD_1228_TC1
  @FD_1228_TC3 @FD_1228_TC4 @FD_1228_TC5 @FD_1229_TC1 @FD_1229_TC2 @FD_1230_TC1 @FD_1230_TC2
  @FD_2132_TC1 @FD_2039_TC1 @FD_994_TC1 @FD_994_TC3 @FD_994_TC4 @FD_745_TC2 @FD_745_TC3 @FD_741_TC1
  @FD_741_TC2 @FD_741_TC3 @FD_741_TC4 @FD_741_TC5 @FD_741_TC6 @FD_741_TC7 @FD_741_TC8
  @FD_712_713_714_TC7
  Scenario: Verify Login User Workflow For Coupons Screen
    When User clicks Log In button on Welcome Page
    And User enter the login details for "ValidLoginDetails"
    And User clicks Now Now button on Enable Biometric Login page
    And User clicks Start Saving button on Sign Up complete Page
    And User clicks Skip button on Enable My Location Page
    And User clicks Skip button on Enable My Location Page Pop Up
    And User clicks Not Now button on Keep Up to Date Page
    Then User is able to see Home text on Home Page
    When User clicks Coupons Tab on Home Page
    Then User is able to see SmartCoupon Page
    And User is able to see Dropdown option on SmartCoupon Page
    And User is able to see Lifetime Savings text on Coupons Page
    And User is able to see total Lifetime Savings done by the user
    And User is able to see clipped amount done by the user
    And User is able to see total amount available for clipping for the user
    And User is able to see info icon on SmartCoupon Page
    When User clicks info icon on SmartCoupon Page
    Then User is able to see info icon tooltip message
    When User clicks on Info Icon Tooltip on SmartCoupon Page
    Then User is able to see Barcode Header Icon on SmartCoupon Page
    And User is able to see Barcode Title on SmartCoupon Page
    And User is able to see Redeem Coupons text on Coupons Page
    When User clicks on Redeem Coupons on Coupons Page
    Then User is able to see Barcode Title on SmartCoupon Page
    And User is able to see "Clipped" Amount In Barcode Page
    And User is able to see Clipped Coupons In Barcode Page
    And User is able to see Barcode Image In Barcode Page
    And User is able to see Phone Number Text In Barcode Page
    And User is able to see Barcode Instruction Text In Barcode Page
    And User is able to see Barcode page close button
    When User clicks on Barcode page close button
    Then User is able to see Redeem Coupons text on Coupons Page
    And User is able to see the search icon on SmartCoupon Page
    And User is able to see the search for coupon text default on SmartCoupon Page
    And User is able to see the scanner on SmartCoupon Page
    And User is able to see For You Listed Coupon section on SmartCoupon Page
    And User is able to see All Listed Coupon section on SmartCoupon Page
    And User is able to see Clipped Listed Coupon section on SmartCoupon Page
    And User is able to see Smart Coupons For You text on SmartCoupon Page
    When User clicks All Listed Coupon Tab on SmartCoupon Page
    And User is able to see Explore By Category on All Listed Coupon section
    And User is able to see All Coupons Link on All Listed Coupon section
    When User clicks on All Coupons Link on All Listed Coupon section
    Then User is able to see All coupons header on All coupons Page
    And User is able to see coupons count on All coupons Page
    And User is able to see Coupon sort CTA
    And User is able to see "Expiring Soon" sorted text on Coupon details Page
    And User is able to see Coupon product Image SmartCoupon Page
    And User is able to see Coupon product Save field SmartCoupon Page
    And User is able to see Coupon product Name field SmartCoupon Page
    And User is able to see Coupon product Status field SmartCoupon Page
    And User is able to see Coupon product Description field SmartCoupon Page
    And User is able to see Clip Coupon text on Coupon details Page
    When User clicks on Coupon sort CTA
    Then User is able to see Sorting Box Open Up
    And User is able to see all sorting opting text
      | Expiring Soon   |
      | Newest Offers   |
      | Biggest Savings |
      | Popular Offers  |
    And User is able to see Show Results CTA in Sorting Box
    And User is able to see close button in Sorting Box
    When User clicks on close button in Sorting box
    Then User is able to see Coupon sort CTA
    When User clicks on Coupon sort CTA
    Then User is able to see Sorting Box Open Up
    When User select any other form of sort apart from Expiring Soon
    Then User is able to see Reset CTA in Sorting Box
    When User clicks on Show Results CTA in Sorting Box
    Then User is able to see Coupon sort CTA
    And User is able to see "Biggest Savings" sorted text on Coupon details Page
    When User clicks on Coupon sort CTA
    Then User is able to see Sorting Box Open Up
    And User is able to see Reset CTA in Sorting Box
    When User clicks on Reset CTA in Sorting Box
    And User clicks on Show Results CTA in Sorting Box
    Then User is able to see Coupon sort CTA
    And User is able to see "Expiring Soon" sorted text on Coupon details Page
    When User clicks back button on Coupon Details page
    Then User is able to see SmartCoupon Page
    And User is able to see Categories List on All Listed Coupon section
    When User clicks First Category From Categories List on Coupon details Page
    Then User is able to see First Category header on Category coupons Page
    And User is able to see Coupon sort CTA
    When User clicks back button on Coupon Details page
    Then User is able to see SmartCoupon Page
    When User click on searchBar on smartCoupon Page
    Then User is able to see cancel link text on Search Coupon Page
    And User is able to see Trending Search text on Search Coupon Page
    And User is able to see Scan Barcode Button on Coupon Search Page
    And User is able to see Scan Product Barcode text on Coupon Search Page
    When User enter the "abcd" in searchBar on smartCoupon Page
    Then User is able to see total number of coupons searched on Coupon Search Page
    And User is able to see sort CTA
    And User is able to see Search icon in empty Search Coupon Page
    And User is able to see No Coupon Found text in empty Search Coupon Page
    And User is able to see No Coupon Found Message body in empty Search Coupon Page
    When User scrolls down for one time
    Then User is able to see Explore Coupon Categories text in empty Search Coupon Page
    And User is able to see Scanner button in empty Search Coupon Page
    And User is able to see Scan Product Barcode text in empty Search Coupon Page
    When User clicks back button on Coupon Details page
    Then User is able to see SmartCoupon Page
    When User click on searchBar on smartCoupon Page
    And User is able to see Previously Searched text on Search Coupon Page
    And User is able to see Clear text on Search Coupon Page
    When User clicks Clear button on Search Coupon Page
    Then User is not able to see Previously Searched text on Search Coupon Page
    When User clicks cancel link button on Search Coupon Page
    Then User is able to see SmartCoupon Page
    When User clicks More Tab on Home Page
    And User clicks Your Profile link on Account Page
    And User scrolls down for one time
    And User clicks sign out button in Profile page
    Then User is on Welcome Page

  @GuestWorkflowCouponsTab @FD_988_TC2 @FD_989_TC2 @FD_994_TC2 @FD_982_TC2 @FD_983_TC2 @FD_987_TC2
  @FD_1228_TC2 @FD_1229_TC2 @FD_1230_TC2 @FD_995_TC2 @FD_745_TC2 @FD_745_TC3
  Scenario: Verify continue as a guest Workflow For Coupons Screen
    When User clicks Continue as Guest button on Welcome Page
    And User click Continue as Guest link on popup dialog
    And User clicks Skip button on Enable My Location Page
    And User clicks Skip button on Enable My Location Page Pop Up
    And User clicks Not Now button on Keep Up to Date Page
    Then User is able to see Home text on Home Page
    When User clicks Coupons Tab on Home Page
    Then User is able to see SmartCoupon Page
    And User is able to see "Clip, Scan, and Save Hundreds of Dollars with Smart Coupons®" Guest sub title on Coupons Page
    And User is able to see "Log In" header login title on Coupons Page
    When User clicks Login button on Coupons Page
    Then User is redirected to the login page
    When User clicks back button on Login Page
    Then User is able to see SmartCoupon Page
    And User is able to see "Create Account" header Create Account Title on Coupons Page
    When User clicks Create Account button on Coupons Page
    Then User is redirected to the Sign Up page
    When User clicks back button on Sign Up Page
    Then User is able to see SmartCoupon Page
    And User is able to see the search icon on SmartCoupon Page
    And User is able to see the search for coupon text default on SmartCoupon Page
    And User is able to see the scanner on SmartCoupon Page
    And User is able to see Explore By Category on All Listed Coupon section
    And User is able to see All Coupons Link on All Listed Coupon section
    When User clicks on All Coupons Link on All Listed Coupon section
    Then User is able to see All coupons header on All coupons Page
    And User is able to see Coupon sort CTA
    And User is able to see "Expiring Soon" sorted text on Coupon details Page
    And User is able to see Coupon product Image SmartCoupon Page
    And User is able to see Coupon product Status field SmartCoupon Page
    And User is able to see Coupon product Description field SmartCoupon Page
    And User is able to see Sign In to Clip Coupon text on Coupon details Page
    When User clicks Sign In to Clip Coupon button on Coupon details Page
    Then User is redirected to the login page
    When User clicks back button on Login Page
    Then User is able to see All coupons header on All coupons Page
    When User clicks back button on Coupon Details page
    Then User is able to see SmartCoupon Page
    And User is able to see Categories List on All Listed Coupon section
    When User clicks First Category From Categories List on Coupon details Page
    Then User is able to see First Category header on Category coupons Page
    And User is able to see Coupon sort CTA
    When User clicks back button on Coupon Details page
    Then User is able to see SmartCoupon Page
    When User click on searchBar on smartCoupon Page
    Then User is able to see cancel link text on Search Coupon Page
    And User is able to see Trending Search text on Search Coupon Page
    And User is able to see Scan Barcode Button on Coupon Search Page
    And User is able to see Scan Product Barcode text on Coupon Search Page
    When User enter the "abcd" in searchBar on smartCoupon Page
    Then User is able to see total number of coupons searched on Coupon Search Page
    And User is able to see sort CTA
    And User is able to see Search icon in empty Search Coupon Page
    And User is able to see No Coupon Found text in empty Search Coupon Page
    And User is able to see No Coupon Found Message body in empty Search Coupon Page
    When User scrolls down for one time
    Then User is able to see Explore Coupon Categories text in empty Search Coupon Page
    And User is able to see Scanner button in empty Search Coupon Page
    And User is able to see Scan Product Barcode text in empty Search Coupon Page
    When User clicks back button on Coupon Details page
    Then User is able to see SmartCoupon Page
    When User click on searchBar on smartCoupon Page
    And User is able to see Previously Searched text on Search Coupon Page
    And User is able to see Clear text on Search Coupon Page
    When User clicks Clear button on Search Coupon Page
    Then User is not able to see Previously Searched text on Search Coupon Page
    When User clicks cancel link button on Search Coupon Page
    Then User is able to see SmartCoupon Page
