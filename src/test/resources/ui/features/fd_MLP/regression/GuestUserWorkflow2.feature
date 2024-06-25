@mobile @regression
Feature: Guest User Workflow 2

  Background:
    Given User is on Welcome Page
    And User is able to see Family Dollar Icon on Welcome Page

  @GuestWorkflowSignInTab @FD_1306_TC1 @FD_1306_TC2 @FD_1306_TC3 @FD_1307_TC1 @FD_1307_TC2 @FD_1613_TC1
  @FD_1613_TC3 @FD_1613_TC6 @FD_492_TC1 @FD_1911_TC1 @FD_492_TC2 @FD_492_TC3 @FD_1613_TC8 @FD_1613_TC10
  @FD_1613_TC12 @FD_1613_TC14
  Scenario: Verify continue as a guest Workflow For Sign In Screen
    When User clicks Continue as Guest button on Welcome Page
    And User click Continue as Guest link on popup dialog
    And User clicks Skip button on Enable My Location Page
    And User clicks Skip button on Enable My Location Page Pop Up
    And User clicks Not Now button on Keep Up to Date Page
    Then User is able to see Home text on Home Page
    When User clicks SignIn Tab on Home Page
    Then User is able to see Account header on Account Page
    And User is able to see "Hello!" text on Account Page for Guest User
    And User is able to see "Sign in to get started on clipping coupons, then watch your savings soar." sub text on Account Page for Guest User
    And User is able to see Log In link text on Account page
    When User clicks Login button on Account page
    Then User is redirected to the login page
    When User clicks back button on Login Page
    Then User is able to see Create one link text on Account page
    When User clicks Create One button on Account page
    Then User is redirected to the Sign Up page
    When User clicks back button on Sign Up Page
    Then User is able to see Support text on Account Page
    And User is able to see Help text on Account Page
    When User clicks Help button on Account Page
    And User select Only this time on Device Location pop up
    Then User is able to see FD "Help" header text on Web Page
    When User clicks close button on web view page
    Then User is able to see Visit Site text on Account Page
    When User clicks Visit Site button on Account Page
    And User clicks Allow device location pop up
    Then User is able to see FD Visit Site Web Page
    When User clicks back button from Keypad
    Then User is able to see Legal text on Account Page
    When User scrolls down for one time
    Then User is able to see Privacy Policy text on Account Page
    When User clicks Privacy Policy button on Account Page
    Then User is able to see Privacy Policy header text on Web Page
    When User clicks close button on web view page
    Then User is able to see Terms And Conditions text on Account Page
    When User clicks Terms And Conditions button on Account Page
    Then User is able to see Terms And Conditions header text on Web Page
    When User clicks close button on web view page
    Then User is able to see Smart Coupons Terms text on Account Page
    When User clicks Smart Coupons Terms button on Account Page
    Then User is able to see Smart Coupons Terms header text on Web Page
    When User clicks close button on web view page
    Then User is able to see Coupon Policy text on Account Page
    When User clicks Coupon Policy button on Account Page
    Then User is able to see Coupon Policy header text on Web Page
    When User clicks close button on web view page
    Then User is able to see Family Dollar Version Number on Account Page
    And User is able to see Family Dollar Trade Mark text on Account Page

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
