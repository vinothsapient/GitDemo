@mobile @regression
Feature: Guest User Workflow

  Background:
    Given User is on Welcome Page
    And User is able to see Family Dollar Icon on Welcome Page

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
    Then User is able to see Explore All Categories Header on Product Category Page
    When User clicks on back button on Category Page
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

  @GuestWorkflowAdsAndBooksTab @FD_712_713_714_TC1 @FD_712_713_714_TC2 @FD_712_713_714_TC3 @FD_715_TC1
  @FD_712_713_714_TC4 @FD_1393_TC7 @FD_1393_TC9
  Scenario: Verify continue as a guest Workflow For Ads And Books Screen
    When User clicks Continue as Guest button on Welcome Page
    And User click Continue as Guest link on popup dialog
    And User clicks Skip button on Enable My Location Page
    And User clicks Skip button on Enable My Location Page Pop Up
    And User clicks Not Now button on Keep Up to Date Page
    Then User is able to see Home text on Home Page
    When User clicks Ads and Books Tab on Home Page
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
    And User will see max ten adds on AdsAndBooks Page
    When User clicks first add on AdsAndBooks Page
    And User is able to see back button on AdsAndBooks details Page
    And User is able to see "Featured" on AdsAndBooks Landing Top Category Label
    When User click adds Image on Ads and Books Page
    And User clicks back button on AdsAndBooks Detail Page
    And User clicks back button on AdsAndBooks Detail Page
    And User will click second add on AdsAndBooks Page
    Then User is able to see "Featured" on AdsAndBooks Landing Top Category Label
    When User click adds Image on Ads and Books Page
    And User clicks back button on AdsAndBooks Detail Page
    And User clicks back button on AdsAndBooks Detail Page
    And User will click Third add on AdsAndBooks Page
    Then User is able to see "Featured" on AdsAndBooks Landing Top Category Label
    When User click adds Image on Ads and Books Page
    And User clicks back button on AdsAndBooks Detail Page
    And User clicks back button on AdsAndBooks Detail Page

  @GuestWorkflowMoreTab @FD_1306_TC6 @FD_1307_TC4 @FD_2033_TC1 @FD_2033_TC2 @FD_1400_TC1 @FD_1400_TC2
  @FD_930_TC2 @FD_930_TC4 @FD_1613_TC18 @FD_1613_TC20 @FD_1613_TC22
  Scenario: Verify continue as a guest Workflow For More Screen
    When User clicks Continue as Guest button on Welcome Page
    And User click Continue as Guest link on popup dialog
    And User clicks Skip button on Enable My Location Page
    And User clicks Skip button on Enable My Location Page Pop Up
    And User clicks Not Now button on Keep Up to Date Page
    Then User is able to see Home text on Home Page
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
    When User clicks on Instacart banner on More Page
    Then User is able to see Instacart Web Page
    When User clicks close button on Instacart Web Page
    Then User is able to see Instacart Title on More Page
    When User scrolls down for one time
    Then User is able to see Support text on More Page
    And User is able to see Contact Us text on More Page
    When User clicks Contact Us button on More Page
    And User clicks Allow device location pop up
    Then User is able to see FD Contact Us header text on Web Page
    When User clicks back button from Keypad
    Then User is able to see FAQs text on More Page
    When User clicks FAQs button on More Page
    And User select Only this time on Device Location pop up
    Then User is able to see FAQs header text on Web Page
    When User clicks close button on web view page
    Then User is able to see Visit Site text on More Page
    And User is able to see Facebook text on More Page
    And User is able to see Instagram text on More Page
    And User is able to see X text on More Page
    And User is able to see TikTok text on More Page
    And User is able to see Pinterest text on More Page
