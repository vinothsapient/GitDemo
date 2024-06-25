@mobile @FD_eCommerce @FD_iBotta
Feature: Home Screen Components Workflow

  Background:
    Given User is on Welcome Page
    And User is able to see Family Dollar Icon on Welcome Page

  @LoginUserWorkflowHomeTab @FD_299_TC1 @FD_277_TC7 @FD_299_TC9 @FD_299_TC10 @FD_299_TC11 @FD_299_TC14
  @FD_1472_TC1 @FD_1472_TC4 @FD_1473_TC1 @FD_1473_TC3 @FD_1474_TC1 @FD_1474_TC3 @FD_1553_TC1
  @FD_1553_TC2 @FD_1503_TC1 @FD_1503_TC4 @FD_1504_TC1 @FD_1559_TC1 @FD_1559_TC2 @FD_1472_TC6
  @FD_1473_TC6 @FD_1474_TC6 @FD_930_TC1 @FD_930_TC3 @FD_960_TC1 @FD_960_TC2 @FD_960_TC8 @FD_960_TC9
  @FD_960_TC16 @FD_965_TC16 @FD_965_TC15 @FD_960_TC15 @FD_960_TC14 @FD_965_TC14 @FD_712_713_714_TC5
  @FD_712_713_714_TC13 @FD_712_713_714_TC12
  Scenario: Verify Login User Workflow For Home Screen
    When User clicks Log In button on Welcome Page
    Then User is redirected to the login page
    And User is able to see Log In Header text on Log In Page
    And User is able to see "Don't have an account?" sub text on Login Page
    And User is able to see Sign Up text on Login Page
    And User is able to see bulb icon on Login Page
    And User is able to see FD Tip text on Login Page
    And User is able to see FD Tip Description text on Login Page
    And User is able to see Email text on Login Page
    And User is able to see Email input box on Login Page
    And User is able to see Password text on Login Page
    And User is able to see Password input box on Login Page
    And User is able to see eye image inside the password input box
    And User is able to see Next text on Login Page
    And User is able to see Forget Password Link on Login Page
    When User enter the login details for "ValidLoginDetails"
    Then User is able to see Biometric Lock Image on Biometrics Page
    And User is able to see "Enable Biometric Login" heading on Biometrics Page
    And User is able to see "You can enable or disable this feature anytime in \"App Settings\" from your Account." Settings Info on Biometrics Page
    And User is able to see Turn on Biometrics text on Biometrics Page
    And User is able to see Not Now text on Biometrics Page
    When User clicks Now Now button on Enable Biometric Login page
    Then User is able to see "Welcome to the Family!" text on Sign Up complete Page
    And User is able to see Start Saving text on Sign Up complete Page
    When User clicks Start Saving button on Sign Up complete Page
    Then User is able to see Location Image on Enable My Location Page
    And User is able to see "Enable My Location" title on Enable My Location Page
    And User is able to see "Family Dollar works way better with location services on." Location Instruction1 on Enable My Location Page
    And User is able to see "Family Dollar receives your location when you’re using the app to highlight savings in your area." Location Instruction2 on Enable My Location Page
    And User is able to see "You can adjust your location settings any time." Location Instruction3 on Enable My Location Page
    And User is able to see Share My Location text on Enable My Location Page
    And User is able to see Enter my ZIP Code text on Enable My Location Page
    And User is able to see Skip link text on Enable My Location Page
    When User clicks Skip button on Enable My Location Page
    Then User is able to see "Are you sure?" title on Enable My Location PopUp Page
    And User is able to see "Sharing your location guarantees that we can offer you the latest deals & Smart Coupons for stores in your area." sub text on Enable My Location PopUp Page
    And User is able to see close button
    And User is able to see Skip link text on Enable My Location PopUp Page
    And User is able to see Set Location Settings link text on Enable My Location PopUp Page
    When User clicks Skip button on Enable My Location Page Pop Up
    Then User is able to see Email Image on Enable Notification Page
    And User is able to see "Keep Up to Date" title on Enable Notification Page
    And User is able to see "Enable push notifications to receive the latest deals and coupons!" body text on Enable Notification Page
    And User is able to see "Notifications can be turned off through the Settings app on your phone." body text2 on Enable Notification Page
    And User is able to see Enable Notifications text on Enable Notification Page
    And User is able to see Not Now text on Enable Notification Page
    When User clicks Not Now button on Keep Up to Date Page
    Then User is able to see Home text on Home Page
    And User is able to see Family Dollar Icon on Home Page
    And User is able to see "Hi" header text on Home Page
    And User is able to see the search icon on Home Page
    And User is able to see the Search Products and Coupons default text on Home Page
    And User is able to see the scanner on Home Page
    And User is able to see Banner Ads Image on Home Page
    And User is able to see 5 Page Indicators associated to the Carousel
    And User is able to see "Smart Coupons® for You" Smart Coupon Header title on Home Page
    And User is able to see "All Coupons" Smart Coupon Header link on Home Page
    When User clicks All Coupons link on Home Page
    Then User is able to see SmartCoupon Page
    And User is able to see Redeem Coupons text on Coupons Page
    When User clicks Home Tab from Global Navigation
    Then User is able to see Smart Coupon Tag on Home Page
    And User is able to see Smart Coupon Image on Home Page
    And User is able to see Smart Coupon Discount Text on Home Page
    And User is able to see Smart Coupon Title Text on Home Page
    And User is able to see Smart Coupon Expiry Text on Home Page
    When User scroll down little on home page
    Then User is able to see Smart Coupon Description Text on Home Page
    And User is able to see Smart Coupon Clip Coupon Text on Home Page
    When User scroll down little on home page
    Then User is able to see Your Store text on Home Page
    And User is able to see Change text on Home Page
    And User is able to see Store address text on Home Page
    When User scroll down little on home page
    Then User is able to see Ads and Books Image on Home Page
    And User is able to see Ads and Books Title on Home Page
    When User scroll down little on home page
    And User scroll down little on home page
    Then User is able to see Top Categories Header on Home Page
    And User is able to see Top Categories Tile on Home Page
    When User scroll down little on home page
    Then User is able to see Explore All Product Categories Title on Home Page
    When User clicks Explore All Product Categories Link on Home Page
    Then User is able to see Featured Title on Shop Page
    When User clicks Home Tab from Global Navigation
    And User scroll down little on home page
    And User scroll down little on home page
    And User scroll down little on home page
    And User scroll down little on home page
    And User scroll down little on home page
    And User scroll down little on home page
    Then User is able to see Explore All Coupon Categories Title on Home Page
    When User clicks Explore All Coupon Categories Link on Home Page
    Then User is able to see Explore Coupon Categories Header on Coupon Category Page
    When User clicks on back button on Category Page
    And User scroll down little on home page
    Then User is able to see Banner Ad on Home Page
    When User scroll down little on home page
    Then User is able to see Welcome Autumn text on Home Page
    And User is able to see Product Image on Home Page
    And User is able to see Product Description on Home Page
    When User scroll down little on home page
    Then User is able to see 3 Page Indicators associated to the Carousel
    When User scrolls down for one time
    Then User is able to see Instacart Tag on Home Page
    And User is able to see Instacart Title on Home Page
    And User is able to see Instacart Sub Title on Home Page
    And User is able to see Instacart Image on Home Page
    And User is able to see Banner Ads Image on Home Page at the End
    And User is able to see "Sponsored" Coupon label below Banner Ad on Home Page
    When User clicks More Tab on Home Page
    And User clicks Your Profile link on Account Page
    And User scrolls down for one time
    And User clicks sign out button in Profile page
    Then User is on Welcome Page

  @GuestWorkflowHomeTab @FD_277_TC1 @FD_277_TC4 @FD_254_TC1 @FD_254_TC2 @FD_254_TC5 @FD_265_TC15
  @FD_256_TC2 @FD_256_TC3 @FD_256_TC4 @FD_256_TC6 @FD_1472_TC2 @FD_1473_TC2 @FD_1474_TC2 @FD_1553_TC2
  @FD_1553_TC2 @FD_1503_TC2 @FD_1504_TC2 @FD_930_TC1 @FD_930_TC3 @FD_965_TC1 @FD_965_TC8 @FD_965_TC7
  @FD_960_TC7 @FD_965_TC6 @FD_965_TC18 @FD_965_TC7 @FD_960_TC12 @FD_965_TC12
  Scenario: Verify continue as a guest Workflow Home Screen
    And User is able to see Continue as Guest button on Welcome Page
    And User is able to see "Clip & Save" header text on welcome screen
    And User is able to see "Enjoy discounts on your favorite brands! Clip and redeem coupons to save at the register." sub text on welcome screen
    And The length of header subtext should be maximum of 120 character
    And User is able to see Log In button on Welcome Page
    And User is able to see Sign Up button on Welcome Page
    When User clicks Continue as Guest button on Welcome Page
    Then User is able to see Tailored Landing screen for guests
    And User verify header "Don't miss out" on Continue as Guest popup dialog
    And User verify subTitle "Only Family Dollar members get access to the latest deals and in-store Smart Coupons to maximize their savings!" on Continue as Guest popup dialog
    When User click close button on Continue as Guest popup dialog
    Then User is on Welcome Page
    When User clicks Continue as Guest button on Welcome Page
    Then User verify Sign Up Now link text on Continue As Guest popup dialog
    And User verify Continue as Guest link text on Continue As Guest popup dialog
    When User click Continue as Guest link on popup dialog
    Then User is able to see Location Image on Enable My Location Page
    And User is able to see "Enable My Location" title on Enable My Location Page
    And User is able to see "Family Dollar works way better with location services on." Location Instruction1 on Enable My Location Page
    And User is able to see "Family Dollar receives your location when you’re using the app to highlight savings in your area." Location Instruction2 on Enable My Location Page
    And User is able to see "You can adjust your location settings any time." Location Instruction3 on Enable My Location Page
    And User is able to see Share My Location text on Enable My Location Page
    And User is able to see Enter my ZIP Code text on Enable My Location Page
    And User is able to see Skip link text on Enable My Location Page
    When User clicks Skip button on Enable My Location Page
    Then User is able to see "Are you sure?" title on Enable My Location PopUp Page
    And User is able to see "Sharing your location guarantees that we can offer you the latest deals & Smart Coupons for stores in your area." sub text on Enable My Location PopUp Page
    And User is able to see close button
    And User is able to see Skip link text on Enable My Location PopUp Page
    And User is able to see Set Location Settings link text on Enable My Location PopUp Page
    When User clicks Skip button on Enable My Location Page Pop Up
    Then User is able to see Email Image on Enable Notification Page
    And User is able to see "Keep Up to Date" title on Enable Notification Page
    And User is able to see "Enable push notifications to receive the latest deals and coupons!" body text on Enable Notification Page
    And User is able to see "Notifications can be turned off through the Settings app on your phone." body text2 on Enable Notification Page
    And User is able to see Enable Notifications text on Enable Notification Page
    And User is able to see Not Now text on Enable Notification Page
    When User clicks Not Now button on Keep Up to Date Page
    Then User is able to see Home text on Home Page
    And User is able to see Family Dollar Icon on Home Page
    And User is able to see "Welcome to Family Dollar" Guest title on Home Page
    And User is able to see "Clip, Scan, and Save Hundreds of Dollars with Smart Coupons®" Guest sub title on Home Page
    And User is able to see "Log In" header login title on Home Page
    When User clicks Log In button on Home Page
    Then User is redirected to the login page
    When User clicks back button on Login Page
    Then User is able to see "Create Account" header Create Account Title on Home Page
    When User clicks Create Account button on Home Page
    Then User is redirected to the Sign Up page
    When User clicks back button on Sign Up Page
    Then User is able to see the search icon on Home Page
    And User is able to see the Search Products and Coupons default text on Home Page
    And User is able to see the scanner on Home Page
    And User is able to see Banner Ads Image on Home Page
    And User is able to see 5 Page Indicators associated to the Carousel
    When User scroll down little on home page
    Then User is able to see "Trending Smart Coupons®" Smart Coupon Header title on Home Page
    And User is able to see "All Coupons" Smart Coupon Header link on Home Page
    And User is able to see Smart Coupon Image on Home Page
    And User is able to see Smart Coupon Discount Text on Home Page
    And User is able to see Smart Coupon Title Text on Home Page
    And User is able to see Smart Coupon Expiry Text on Home Page
    When User scroll down little on home page
    Then User is able to see Smart Coupon Description Text on Home Page
    And User is able to see Smart Coupon Sign In to Clip Coupon Text on Home Page
    When User clicks Sign In to Clip Coupon button on Home Page
    Then User is redirected to the login page
    When User clicks back button on Login Page
    Then User is able to see 5 Page Indicators associated to the Carousel
    When User scroll down little on home page
    Then User is able to see No Store Selected text on Home Page
    And User is able to see Select a Store text on Home Page
    And User is able to see Select a Store description text on Home Page
    When User scroll down little on home page
    Then User is able to see Top Categories Header on Home Page
    And User is able to see Top Categories Tile on Home Page
    When User scroll down little on home page
    Then User is able to see Explore All Product Categories Title on Home Page
    When User clicks Explore All Product Categories Link on Home Page
    Then User is able to see Featured Title on Shop Page
    When User clicks Home Tab from Global Navigation
    And User scroll down little on home page
    And User scroll down little on home page
    And User scroll down little on home page
    And User scroll down little on home page
    And User scroll down little on home page
    Then User is able to see Explore All Coupon Categories Title on Home Page
    When User clicks Explore All Coupon Categories Link on Home Page
    Then User is able to see Explore Coupon Categories Header on Coupon Category Page
    When User clicks on back button on Category Page
    And User scroll down little on home page
    Then User is able to see Banner Ad on Home Page
    When User scroll down little on home page
    Then User is able to see Welcome Autumn text on Home Page for Guest User
    And User is able to see Product Description on Home Page
    And User is able to see 3 Page Indicators associated to the Carousel
    When User scrolls down for one time
    Then User is able to see Instacart Tag on Home Page
    And User is able to see Instacart Title on Home Page
    And User is able to see Instacart Sub Title on Home Page
    And User is able to see Instacart Image on Home Page
    And User is able to see Banner Ads Image on Home Page at the End
    And User is able to see "Sponsored" Coupon label below Banner Ad on Home Page
