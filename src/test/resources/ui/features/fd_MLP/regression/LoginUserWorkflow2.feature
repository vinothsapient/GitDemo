@mobile @regression
Feature: Login User Workflow 2

  Background:
    Given User is on Welcome Page
    And User is able to see Family Dollar Icon on Welcome Page

  @LoginUserWorkflowAccountTab @FD_1374_TC1 @FD_1374_TC2 @FD_1374_TC3 @FD_1374_TC4 @FD_1613_TC2
  @FD_1613_TC4 @FD_1613_TC7 @FD_486_TC1 @FD_486_TC2 @FD_486_TC4 @FD_486_TC5 @FD_486_TC7 @FD_486_TC8
  @FD_486_TC10 @FD_486_TC11 @FD_486_TC13 @FD_486_TC14 @FD_1306_TC5 @FD_1306_TC6 @FD_485_TC1
  @FD_485_TC2 @FD_485_TC3 @FD_485_TC4 @FD_1307_CT3 @FD_482_TC1 @FD_482_TC2 @FD_715_716_TC4
  @FD_712_713_714_TC9
  Scenario: Verify Login User Workflow For Sign In Screen
    When User clicks Log In button on Welcome Page
    And User enter the login details for "ValidLoginDetails"
    And User clicks Now Now button on Enable Biometric Login page
    And User clicks Start Saving button on Sign Up complete Page
    And User clicks Skip button on Enable My Location Page
    And User clicks Skip button on Enable My Location Page Pop Up
    And User clicks Not Now button on Keep Up to Date Page
    Then User is able to see Home text on Home Page
    When User clicks Account Tab on Home Page
    Then User is able to see Account header on Account Page
    And User is able to see "Hello," text on Account Page for Logged In User
    And User is able to see Personal and Contact Information text on Account Page for Logged In User
    And User is able to see Edit Link text on Account Page for Logged In User
    When User clicks Edit button on Account Page
    Then User is able to see Profile header on Profile Page
    And User verify Back Button is present on Profile Page
    And User is able to see Personal Information text on Profile Page
    And User is able to see Name text on Profile Page
    And User is able to see Date of Birth text on Profile Page
    And User is able to see ZIP Code text on Profile Page
    And User is able to see Password text on Profile Page
    And User is able to see Contact Information text on Profile Page
    And User is able to see Email text on Profile Page
    And User is able to see Phone Number text on Profile Page
    When User clicks on Profile Back Button
    Then User is able to see For Your Store text on Account Page for Logged In User
    And User is able to see Store Address text on Account Page for Logged In User
    And User is able to see Change Store text on Account Page for Logged In User
    And User is able to see Account Settings text on Account Page
    And User is able to see Communications text on Account Page
    And User is able to see App Settings text on Account Page
    And User is able to see Support text on Account Page
    And User is able to see Help text on Account Page
    When User clicks Help button on Account Page
    And User select Only this time on Device Location pop up
    Then User is able to see FD "Help" header text on Web Page
    When User clicks close button on web view page
    Then User is able to see Visit Site text on Account Page
    When User clicks Visit Site button on Account Page
    And User select Only this time on Device Location pop up
    Then User is able to see FD Visit Site Web Page
    When User clicks back button from Keypad
    Then User is able to see Delete Account text on Account Page
    When User clicks Delete Account button on Account Page
    Then User is able to see Delete Your Account header text on Delete Account Page
    And User is able to see "Are you sure? Please read carefully." title on Delete Account Page
    And User is able to see "If you delete your account, all app data will be lost." Description1 on Delete Account Page
    And User is able to see "Deleting your account will permanently delete your Family Dollar account and all associated data." Description2 on Delete Account Page
    And User is able to see Delete My Account text on Account Page
    And User is able to see Keep My Account text on Account Page
    When User clicks Keep My Account button on Account Page
    Then User is able to see Delete Account text on Account Page
    When User scrolls down for one time
    Then User is able to see Legal text on Account Page
    Then User is able to see Privacy Policy text on Account Page
    When User clicks Privacy Policy button on Account Page
    And User select Only this time on Device Location pop up
    Then User is able to see Privacy Policy header text on Web Page
    When User clicks close button on web view page
    Then User is able to see Terms And Conditions text on Account Page
    When User clicks Terms And Conditions button on Account Page
    And User select Only this time on Device Location pop up
    Then User is able to see Terms And Conditions header text on Web Page
    When User clicks close button on web view page
    Then User is able to see Smart Coupons Terms text on Account Page
    When User clicks Smart Coupons Terms button on Account Page
    And User select Only this time on Device Location pop up
    Then User is able to see Smart Coupons Terms header text on Web Page
    When User clicks close button on web view page
    Then User is able to see Coupon Policy text on Account Page
    When User clicks Coupon Policy button on Account Page
    And User select Only this time on Device Location pop up
    Then User is able to see Coupon Policy header text on Web Page
    When User clicks close button on web view page
    And User select Only this time on Device Location pop up
    And User is able to see Family Dollar Trade Mark text on Account Page
    And User is able to see sign out button in account page
    When User clicks sign out button in account page
    Then User is on Welcome Page
    And User is able to see Log In button on Welcome Page
    When User clicks Log In button on Welcome Page
    Then User is able to see email field value already present in Login Page
    When User enter the stored password in Login Page
    And User clicks Next Button in Login Page
    Then User is able to see Account text on Home Page
    When User clicks Account Tab on Home Page
    And User scrolls down for one time
    Then User is able to see sign out button in account page
    When User clicks sign out button in account page
    Then User is on Welcome Page

  @LoginUserWorkflowCouponsTab @FD_997_TC1 @FD_997_TC2 @FD_997_TC3 @FD_988_TC4 @FD_2040_TC1
  @FD_988_TC1 @FD_988_TC3 @FD_988_TC5 @FD_993_TC3 @FD_989_TC1 @FD_989_TC3 @FD_989_TC4 @FD_1228_TC1
  @FD_1228_TC3 @FD_1228_TC4 @FD_1228_TC5 @FD_1229_TC1 @FD_1229_TC2 @FD_1230_TC1 @FD_1230_TC2
  @FD_2132_TC1 @FD_2039_TC1 @FD_994_TC1 @FD_994_TC3 @FD_994_TC4 @FD_745_TC2 @FD_745_TC3
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
    When User clicks Account Tab on Home Page
    And User scrolls down for one time
    Then User is able to see sign out button in account page
    When User clicks sign out button in account page
    Then User is on Welcome Page
