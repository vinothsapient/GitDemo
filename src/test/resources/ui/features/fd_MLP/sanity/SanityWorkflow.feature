@mobile @sanity
Feature: Sanity Workflow

  @GuestWorkflow
  Scenario: Verify continue as a guest Sanity Workflow
    Given User is on Welcome Page
    And User is able to see Family Dollar Icon on Welcome Page
    And User is able to see Continue as Guest button on Welcome Page
    And User is able to see "Clip & Save" header text on welcome screen
    And User is able to see Log In button on Welcome Page
    And User is able to see Sign Up button on Welcome Page
    When User clicks Continue as Guest button on Welcome Page
    Then User verify header "Don't miss out" on Continue as Guest popup dialog
    When User click Continue as Guest link on popup dialog
    Then User is able to see Location Image on Enable My Location Page
    When User clicks Skip button on Enable My Location Page
    Then User is able to see "Are you sure?" title on Enable My Location PopUp Page
    And User is able to see Set Location Settings link text on Enable My Location PopUp Page
    When User clicks Skip button on Enable My Location Page Pop Up
    Then User is able to see Email Image on Enable Notification Page
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
    And User is able to see "Sponsored" Coupon label below Banner Ad on Home Page
    And User is able to see 5 Page Indicators associated to the Carousel
    When User clicks Ads and Books Tab on Home Page
    Then User is on Ads and Books Page
    And User is able to see No Store Selected text on Home Page
    And User is able to see Select a Store text on Home Page
    And User is able to see Select a Store description text on Home Page
    When User clicks Coupons Tab on Home Page
    Then User is able to see SmartCoupon Page
    And User is able to see "Clip, Scan, and Save Hundreds of Dollars with Smart Coupons®" Guest sub title on Coupons Page
    And User is able to see "Log In" header login title on Coupons Page
    And User is able to see "Create Account" header Create Account Title on Coupons Page
    And User is able to see the search icon on SmartCoupon Page
    And User is able to see the search for coupon text default on SmartCoupon Page
    And User is able to see the scanner on SmartCoupon Page
    And User is able to see Explore By Category on All Listed Coupon section
    And User is able to see All Coupons Link on All Listed Coupon section
    When User clicks on All Coupons Link on All Listed Coupon section
    Then User is able to see All coupons header on All coupons Page
    And User is able to see Coupon sort CTA
    And User is able to see "Expiring Soon" sorted text on Coupon details Page
    When User clicks Sign In to Clip Coupon button on Coupon details Page
    Then User is redirected to the login page
    When User clicks SignIn Tab on Home Page
    Then User is able to see Account header on Account Page
    And User is able to see "Hello!" text on Account Page for Guest User
    And User is able to see "Sign in to get started on clipping coupons, then watch your savings soar." sub text on Account Page for Guest User
    And User is able to see Log In link text on Account page
    And User is able to see Create one link text on Account page
    And User is able to see Support text on Account Page
    And User is able to see Help text on Account Page
    And User is able to see Visit Site text on Account Page
    When User scrolls down for one time
    Then User is able to see Legal text on Account Page
    And User is able to see Privacy Policy text on Account Page
    And User is able to see Terms And Conditions text on Account Page
    And User is able to see Smart Coupons Terms text on Account Page
    And User is able to see Coupon Policy text on Account Page
    And User is able to see California Information Sharing Disclosure text on Account Page
    And User is able to see Family Dollar Version Number on Account Page
    And User is able to see Family Dollar Trade Mark text on Account Page
    When User clicks More Tab on Home Page
    Then User is able to see the search icon on More Page
    And User is able to see the Search Products and Coupons default text on More Page
    And User is able to see the scanner on More Page
    And User is able to see Explore Product Categories text on More Page
    And User is able to see Explore Coupon Categories text on More Page
    And User is able to see Message text on More Page
    And User is able to see View My Store Details text on More Page
    And User is able to see Redeem Clipped Coupons text on More Page
    When User scrolls down for one time
    Then User is able to see Instacart Tag on More Page
    And User is able to see Instacart Title on More Page
    And User is able to see Instacart Sub Title on More Page
    And User is able to see Instacart Image on More Page
    When User scrolls down for one time
    Then User is able to see Support text on More Page
    And User is able to see Contact Us text on More Page
    And User is able to see FAQs text on More Page
    And User is able to see Visit Site text on More Page
    And User is able to see Facebook text on More Page
    And User is able to see Instagram text on More Page
    And User is able to see X text on More Page
    And User is able to see TikTok text on More Page
    And User is able to see Pinterest text on More Page

  @LoginUserWorkflow
  Scenario: Verify Login User Sanity Workflow
    When User clicks Log In button on Welcome Page
    Then User is able to see Log In Header text on Log In Page
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
    When User clicks Now Now button on Enable Biometric Login page
    Then User is able to see "Welcome to the Family!" text on Sign Up complete Page
    When User clicks Start Saving button on Sign Up complete Page
    Then User is able to see Location Image on Enable My Location Page
    And User is able to see "Enable My Location" title on Enable My Location Page
    When User clicks Skip button on Enable My Location Page
    Then User is able to see "Are you sure?" title on Enable My Location PopUp Page
    When User clicks Skip button on Enable My Location Page Pop Up
    Then User is able to see Email Image on Enable Notification Page
    And User is able to see "Keep Up to Date" title on Enable Notification Page
    When User clicks Not Now button on Keep Up to Date Page
    Then User is able to see Home text on Home Page
    And User is able to see Family Dollar Icon on Home Page
    And User is able to see "Hi" header text on Home Page
    And User is able to see the search icon on Home Page
    And User is able to see the Search Products and Coupons default text on Home Page
    And User is able to see the scanner on Home Page
    And User is able to see Banner Ads Image on Home Page
    And User is able to see "Sponsored" Coupon label below Banner Ad on Home Page
    And User is able to see 5 Page Indicators associated to the Carousel
    When User clicks Ads and Books Tab on Home Page
    Then User is on Ads and Books Page
    And User is able to see For Your Store text on Ads And Books Page
    And User is able to see Store Address text on Ads And Books Page
    And User is able to see Change Store text on Ads And Books Page
    And User is able to see Ads and Books Image on Ads And Books Page
    And User is able to see Ads and Books Title on Ads And Books Page
    When User clicks Coupons Tab on Home Page
    Then User is able to see SmartCoupon Page
    And User is able to see Dropdown option on SmartCoupon Page
    And User is able to see Lifetime Savings text on Coupons Page
    And User is able to see total Lifetime Savings done by the user
    And User is able to see clipped amount done by the user
    And User is able to see total amount available for clipping for the user
    And User is able to see info icon on SmartCoupon Page
    And User is able to see Barcode Header Icon on SmartCoupon Page
    And User is able to see Barcode Title on SmartCoupon Page
    And User is able to see Redeem Coupons text on Coupons Page
    When User clicks on Redeem Coupons on Coupons Page
    Then User is able to see Barcode Title on SmartCoupon Page
    And User is able to see "Clipped" Amount In Barcode Page
    And User is able to see Clipped Coupons In Barcode Page
    And User is able to see Barcode Image In Barcode Page
    And User is able to see Phone Number Text In Barcode Page
    And User is able to see Barcode Instruction Text In Barcode Page
    When User clicks on Barcode page close button
    Then User is able to see Redeem Coupons text on Coupons Page
    And User is able to see the search icon on SmartCoupon Page
    And User is able to see the search for coupon text default on SmartCoupon Page
    And User is able to see the scanner on SmartCoupon Page
    And User is able to see For You Listed Coupon section on SmartCoupon Page
    And User is able to see All Listed Coupon section on SmartCoupon Page
    And User is able to see Clipped Listed Coupon section on SmartCoupon Page
    And User is able to see Smart Coupons For You text on SmartCoupon Page
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
    And User is able to see Visit Site text on Account Page
    And User is able to see Delete Account text on Account Page
    When User clicks More Tab on Home Page
    Then User is able to see the search icon on More Page
    And User is able to see the Search Products and Coupons default text on More Page
    And User is able to see the scanner on More Page
    And User is able to see Explore Product Categories text on More Page
    And User is able to see Explore Coupon Categories text on More Page
    And User is able to see Message text on More Page
    And User is able to see View My Store Details text on More Page
    And User is able to see Redeem Clipped Coupons text on More Page
    When User scrolls down for one time
    Then User is able to see Instacart Tag on More Page
    And User is able to see Instacart Title on More Page
    And User is able to see Instacart Sub Title on More Page
    And User is able to see Instacart Image on More Page
    When User scrolls down for one time
    Then User is able to see Support text on More Page
    And User is able to see Contact Us text on More Page
    And User is able to see FAQs text on More Page
    And User is able to see Visit Site text on More Page
    And User is able to see Facebook text on More Page
    And User is able to see Instagram text on More Page
    And User is able to see X text on More Page
    And User is able to see TikTok text on More Page
    And User is able to see Pinterest text on More Page
    When User clicks Account Tab on Home Page
    And User scrolls down for one time
    When User clicks sign out button in account page
    Then User is on Welcome Page
    And User is able to see Log In button on Welcome Page
    When User clicks Log In button on Welcome Page
    Then User is able to see email field value already present in Login Page
