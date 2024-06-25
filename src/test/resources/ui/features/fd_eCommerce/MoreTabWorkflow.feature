@mobile @FD_eCommerce @FD_iBotta
Feature: More Screen Components Workflow

  Background:
    Given User is on Welcome Page
    And User is able to see Family Dollar Icon on Welcome Page

  @FD_3078_TC1 @FD_3078_TC2 @FD_3078_TC3 @FD_3076_TC1 @FD_3079_TC1 @FD_3079_TC2 @FD_3079_TC3 @FD_3079_TC4
  @FD_3077_TC1 @FD_3077_TC2 @FD_3077_TC3 @FD_3077_TC4 @FD_3077_TC5 @FD_3077_TC6 @FD_3069_TC1 @FD_3069_TC2
  @FD_3069_TC3 @FD_3069_TC4 @FD_3069_TC5 @FD_3069_TC6 @FD_3069_TC7 @FD_3069_TC8 @FD_3069_TC9 @FD_3069_TC10
  @FD_484_TC1 @FD_484_TC2 @FD_484_TC3 @FD_484_TC4 @FD_484_TC5 @FD_484_TC6 @FD_484_TC7 @FD_484_TC8
  @FD_1305_TC1 @FD_1305_TC2 @FD_1305_TC3 @FD_1305_TC4 @FD_1613_TC9 @FD_1613_TC11 @FD_1613_TC13
  @FD_1613_TC15 @FD_1613_TC19 @FD_1613_TC23 @FD_2038_TC1 @FD_725_TC1 @FD_725_TC2 @FD_725_TC5 @FD_725_TC6
  @FD_1374_TC1 @FD_1374_TC2 @FD_1374_TC3 @FD_1374_TC4 @FD_1613_TC2 @FD_1613_TC4 @FD_1613_TC7 @FD_486_TC1
  @FD_486_TC2 @FD_486_TC4 @FD_486_TC5 @FD_486_TC7 @FD_486_TC8 @FD_486_TC10 @FD_486_TC11 @FD_486_TC13
  @FD_486_TC14 @FD_1306_TC5 @FD_1306_TC6 @FD_485_TC1 @FD_485_TC2 @FD_485_TC3 @FD_485_TC4 @FD_1307_CT3
  @FD_482_TC1 @FD_482_TC2 @FD_715_716_TC4 @FD_712_713_714_TC9 @FD_2033_TC1 @FD_2033_TC2 @FD_1400_TC1
  @FD_1400_TC2 @FD_930_TC2 @FD_930_TC4 @FD_712_713_714_TC17 @FD_712_713_714_TC8 @FD_712_713_714_TC10
  @FD_712_713_714_TC14 @FD_712_713_714_TC15 @FD_1613_TC21 @FD_2869_TC1 @FD_3583_TC1 @FD_3583_TC2
  @FD_3583_TC4 @FD_3583_TC5 @FD_3583_TC6 @FD_3583_TC7 @FD_3585_TC1 @FD_3585_TC4 @FD_3585_TC5
  @FD_3585_TC9 @FD_3592_TC3 @FD_4280_TC1 @FD_4280_TC2 @FD_4280_TC3 @FD_3586_TC3 @FD_3586_TC5
  Scenario: Verify Login User Workflow For More Screen
    When User clicks Log In button on Welcome Page
    And User enter the login details for "ValidLoginDetails"
    And User clicks Now Now button on Enable Biometric Login page
    And User clicks Start Saving button on Sign Up complete Page
    And User clicks Skip button on Enable My Location Page
    And User clicks Skip button on Enable My Location Page Pop Up
    And User clicks Not Now button on Keep Up to Date Page
    Then User is able to see More text on Home Page
    When User clicks More Tab on Home Page
    Then User is able to see the search icon on More Page
    And User is able to see the Search Products and Coupons default text on More Page
    And User is able to see the scanner on More Page
    And User is able to see "Hello," text on More Page for Logged In User
    And User is able to see Your Profile text on More Page for Logged In User
    When User clicks Your Profile link on Account Page
    Then User is able to see Profile header on Profile Page
    And User verify Back Button is present on Profile Page
    And User is able to see Name text on Profile Page
    And User is able to see Date of Birth text on Profile Page
    And User is able to see ZIP Code text on Profile Page
    And User is able to see Password text on Profile Page
    And User is able to see Email text on Profile Page
    And User is able to see Phone Number text on Profile Page
    When User scrolls down for one time
    Then User is able to see FD Employee text on Profile Page
    And User is able to see Associate Id Number text on Profile Page
    And User is able to see sign out button in Profile page
    And User is able to see Family Dollar Version Number on Account Page
    And User is able to see Family Dollar Trade Mark text on Account Page
    When User clicks on Profile Back Button
    Then User is able to see Message text on More Page
    When User clicks Message button on More Page
    Then User is on Message display Page
    And User is able to see Back Button on Message Display Page
    When User clicks Back Button on Message Display Page
    Then User is able to see Your Orders text on More Page
    When User clicks Your Orders button on More Page
    Then User is redirected to "Your Orders" screen
    When User clicks back button on Your Order Page
    And User is able to see Your Store text on More Page for Logged In User
    And User clicks Your Store button on More Page
    And User select Only this time on Device Location pop up
    And User clicks OK button on Profile PopUp Page
    Then User is able to see "Choose a Store" header on Choose A Store Page
    When User clicks back button on Choose a store Page
    Then User is able to see Recent Orders text on More Page
    And User is able to see View All text on More Page
    When User clicks View All button on More Page
    Then User is redirected to "Your Orders" screen
    When User clicks back button on Your Order Page
    Then User is able to see Order Tile text on More Page
    And User is able to see Dots Render Indicators associated to the Carousel
    And User is able to see the Support and Settings text on More Page
    And User is able to see Contact Us text on More Page
    When User clicks Contact Us button on More Page
    And User clicks Allow device location pop up
    Then User is able to see FD Contact Us header text on Web Page
    When User clicks back button from Keypad
    And User scroll down little on home page
    Then User is able to see Help text on More Page
    When User clicks Help button on More Page
    And User select Only this time on Device Location pop up
    Then User is able to see FD "Help" header text on Web Page
    When User clicks close button on web view page
    Then User is able to see Visit Site text on More Page
    When User clicks Visit Site button on More Page
    And User select Only this time on Device Location pop up
    Then User is able to see FD Visit Site Web Page
    When User clicks back button from Keypad
    Then User is able to see Legal text on More Page
    When User clicks Legal link on More Page
    Then User is able to see Legal Header on Legal Page
    And User is able to see Privacy Policy text on Legal Page
    When User clicks Privacy Policy button on Legal Page
    Then User is able to see Privacy Policy header text on Web Page
    When User clicks close button on web view page
    Then User is able to see Terms And Conditions text on Legal Page
    When User clicks Terms And Conditions button on Legal Page
    Then User is able to see Terms And Conditions header text on Web Page
    When User clicks close button on web view page
    Then User is able to see Smart Coupons Terms text on Legal Page
    When User clicks Smart Coupons Terms button on Legal Page
    Then User is able to see Smart Coupons Terms header text on Web Page
    When User clicks close button on web view page
    Then User is able to see Coupon Policy text on Legal Page
    When User clicks Coupon Policy button on Legal Page
    Then User is able to see Coupon Policy header text on Web Page
    When User clicks close button on web view page
    Then User is able to see Back button on Legal Page
    When User clicks Back button on Legal Page
    And User scroll down little on home page
    Then User is able to see App Settings text on More Page
    When User clicks App Settings button on More Page
    Then User verify App Settings Header is present
    And User verify Back Button is present on App Settings Page
    And User is able to see Biometrics text on App Settings Page
    And User is able to see Biometrics description on App Settings Page
    And User verify Biometrics is disabled
    And User is able to see App Permissions text on App Settings Page
    And User is able to see App Permissions description on App Settings Page
    When User clicks Back Button on App Settings Page
    Then User is able to see Communications text on More Page
    When User clicks Communications button on More Page
    Then User verify Communication Header is present
    And User verify Back Button is present on Communication Page
    And User is able to see Push Notifications text on Communications Page
    And User is able to see Push Notifications description on Communications Page
    When User clicks on Push Notification Toggle button
    Then User verify Push Notification is enabled
    When User clicks on Push Notification Toggle button
    Then User verify Push Notification is disabled
    And User is able to see Email Updates text on Communications Page
    And User is able to see Email Updates description on Communications Page
    When User clicks on Email Updates Toggle button
    Then User verify Email Updates is enabled
    When User clicks on Email Updates Toggle button
    Then User verify Email Updates is disabled
    And User is able to see Text Notifications label on Communications Page
    And User is able to see Text Notifications description on Communications Page
    When User clicks on Text Notifications Toggle button
    Then User verify Text Notifications is enabled
    When User clicks on Text Notifications Toggle button
    Then User verify Text Notifications is disabled
    And User is able to see Mobile Text Communications on Communications Page
    And User is able to see Mobile Text Message on Communications Page
    When User clicks Mobile Text Message on Communications Page
    Then User is able to see Mobile SMS Communications header
    And User is able to see Your Phone Number title "Your Phone Number" text on Mobile SMS Communication
    And User is able to see Order Updates "Text Order Updates" text on Mobile SMS Communication
    And User is able to see Marketing Notifications "Text Marketing Notifications" text on Mobile SMS Communication
    When User clicks Back Button on Mobile SMS Communications Page
    And User clicks Back Button on Communication Page
    And User scroll down little on More page
    Then User is able to see Delete Account text on More Page
    When User clicks Delete Account button on More Page
    Then User is able to see Delete Your Account header text on Delete Account Page
    And User is able to see "Are you sure? Please read carefully." title on Delete Account Page
    And User is able to see "If you delete your account, all app data will be lost." Description1 on Delete Account Page
    And User is able to see "Deleting your account will permanently delete your Family Dollar account and all associated data." Description2 on Delete Account Page
    And User is able to see Delete My Account text on Delete Account Page
    And User is able to see Keep My Account text on Delete Account Page
    When User clicks Keep My Account button on More Page
    Then User is able to see Delete Account text on More Page
    When User scroll down little on More page
    And User is able to see Explore Coupon Categories text on More Page
    And User is able to see Redeem Clipped Coupons text on More Page
    When User scrolls down for one time
    Then User is able to see Instacart Tag on More Page
    And User is able to see Instacart Title on More Page
    And User is able to see Instacart Sub Title on More Page
    And User is able to see Instacart Image on More Page
    When User clicks on Instacart banner on More Page
    Then User is able to see Instacart Web Page
    When User clicks close button on Instacart Web Page
    Then User is able to see Facebook text on More Page
    And User is able to see Instagram text on More Page
    And User is able to see X text on More Page
    And User is able to see TikTok text on More Page
    And User is able to see Pinterest text on More Page
    When User clicks More Tab on Home Page
    And User clicks Your Profile link on Account Page
    And User scrolls down for one time
    And User clicks sign out button in Profile page
    Then User is on Welcome Page

  @GuestWorkflowMoreTab @FD_1306_TC6 @FD_1307_TC4 @FD_2033_TC1 @FD_2033_TC2 @FD_1400_TC1 @FD_1400_TC2
  @FD_930_TC2 @FD_930_TC4 @FD_1613_TC18 @FD_1613_TC20 @FD_1613_TC22 @FD_1306_TC1 @FD_1306_TC2
  @FD_1306_TC3 @FD_1307_TC1 @FD_1307_TC2 @FD_1613_TC1 @FD_1613_TC3 @FD_1613_TC6 @FD_492_TC1
  @FD_1911_TC1 @FD_492_TC2 @FD_492_TC3 @FD_1613_TC8 @FD_1613_TC10 @FD_1613_TC12 @FD_1613_TC14
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
    And User is able to see the Support and Settings text on More Page
    And User is able to see Contact Us text on More Page
    When User clicks Contact Us button on More Page
    And User clicks Allow device location pop up
    Then User is able to see FD Contact Us header text on Web Page
    When User clicks back button from Keypad
    Then User is able to see Help text on More Page
    When User clicks Help button on More Page
    And User select Only this time on Device Location pop up
    Then User is able to see FD "Help" header text on Web Page
    When User clicks close button on web view page
    Then User is able to see Visit Site text on More Page
    When User clicks Visit Site button on More Page
    And User select Only this time on Device Location pop up
    Then User is able to see FD Visit Site Web Page
    When User clicks back button from Keypad
    And User scroll down little on More page
    Then User is able to see Legal text on More Page
    When User clicks Legal link on More Page
    Then User is able to see Legal Header on Legal Page
    And User is able to see Privacy Policy text on Legal Page
    When User clicks Privacy Policy button on Legal Page
    Then User is able to see Privacy Policy header text on Web Page
    When User clicks close button on web view page
    Then User is able to see Terms And Conditions text on Legal Page
    When User clicks Terms And Conditions button on Legal Page
    Then User is able to see Terms And Conditions header text on Web Page
    When User clicks close button on web view page
    Then User is able to see Smart Coupons Terms text on Legal Page
    When User clicks Smart Coupons Terms button on Legal Page
    Then User is able to see Smart Coupons Terms header text on Web Page
    When User clicks close button on web view page
    Then User is able to see Coupon Policy text on Legal Page
    When User clicks Coupon Policy button on Legal Page
    Then User is able to see Coupon Policy header text on Web Page
    When User clicks close button on web view page
    Then User is able to see Back button on Legal Page
    When User clicks Back button on Legal Page
    And User scroll down little on More page
    Then User is able to see App Settings text on More Page
    When User clicks App Settings button on More Page
    Then User verify App Settings Header is present
    And User verify Back Button is present on App Settings Page
    And User is able to see App Permissions text on App Settings Page
    And User is able to see App Permissions description on App Settings Page
    When User clicks Back Button on App Settings Page
    Then User is able to see Communications text on More Page
    When User clicks Communications button on More Page
    Then User verify Communication Header is present
    And User verify Back Button is present on Communication Page
    And User is able to see Push Notifications text on Communications Page
    And User is able to see Push Notifications description on Communications Page
    When User clicks on Push Notification Toggle button
    Then User verify Push Notification is enabled
    When User clicks on Push Notification Toggle button
    Then User verify Push Notification is disabled
    When User clicks Back Button on Communication Page
    And User scrolls down for one time
    And User is able to see Explore Coupon Categories text on More Page
    And User is able to see Redeem Clipped Coupons text on More Page
    Then User is able to see Instacart Tag on More Page
    And User is able to see Instacart Title on More Page
    And User is able to see Instacart Sub Title on More Page
    And User is able to see Instacart Image on More Page
    When User clicks on Instacart banner on More Page
    Then User is able to see Instacart Web Page
    When User clicks close button on Instacart Web Page
    Then User is able to see Facebook text on More Page
    And User is able to see Instagram text on More Page
    And User is able to see X text on More Page
    And User is able to see TikTok text on More Page
    And User is able to see Pinterest text on More Page

  @FD_3592_TC1 @FD_3592_TC2 @FD_3592_TC3 @FD_3592_TC14 @FD_3594_TC1 @FD_3594_TC2 @FD_3594_TC4
  @FD_3594_TC5 @FD_3594_TC8 @FD_3593_TC1 @FD_3586_TC1 @FD_3586_TC6 @FD_3586_TC13 @FD_3588_TC1
  @FD_3588_TC2 @FD_3588_TC3 @FD_3588_TC4 @FD_3588_TC5 @FD_3588_TC6 @FD_3588_TC12
  Scenario: Verify Order History workflow For More Screen
    When User clicks Log In button on Welcome Page
    And User enter the login details for "OrderHistoryLoginDetails"
    And User clicks Now Now button on Enable Biometric Login page
    And User clicks Start Saving button on Sign Up complete Page
    And User clicks Skip button on Enable My Location Page
    And User clicks Skip button on Enable My Location Page Pop Up
    And User clicks Not Now button on Keep Up to Date Page
    Then User is able to see More text on Home Page
    When User clicks More Tab on Home Page
    Then User is able to see Your Orders text on More Page
    When User clicks Your Orders button on More Page
    Then User is redirected to "Your Orders" screen
    And User is able to see back button on Your Order Page
    And User is able to see Order Status on Your Orders page
    And User is able to see Order Date on Your Orders page
    And User is able to see Order ID on Your Orders page
    And User is able to see Order Tile Image on Your Orders page
    When User clicks on "Processing" Order from Order history list page
    Then User is redirected to "Order Status" screen
    And User is able to see back button on Order Status Page
    And User is able to see Order Number and Order Placed on Order Status page
    And User is able to see estimated pickup date on Order Status page
    And User is able to see Order status title "Your order was placed" on Order Status page
    And User is able to see graphical section on Order Status page
    And User is able to see Pick up details Section on Order Status page
    And User is able to see map thumbnail for the store on Order Status page
    And User is able to see CTA to get directions on Order Status page
    #And User should be able to see store address
    #And User should be able to see Pickup person details
    When User scrolls down for one time
    Then User is able to see Order Details Section on Order Status page
    And Order Details section should show CTA to take me to the order details landing page
    And User is able to see Supporting text and mail on Order Status page
    When User clicks on View Full Order Details button on Order Status page
    Then User is redirected to "View Order Details" screen
    And User should be able to see Order Details header on View Your Order Details page
    And User should be able to see Order Date on View Your Order Details page
    And User should be able to see Order Number on View Your Order Details page
    And User should be able to see Order Total on View Your Order Details page
    And User should be able to see Items in Order title on View Your Order Details page
    And User should be able to see Product thumbnail on View Your Order Details page
    And User should be able to see Product price on View Your Order Details page
    And User should be able to see Product description on View Your Order Details page
    And User should be able to see Product quantity on View Your Order Details page
    And User should be able to see CTA to Buy Again on View Your Order Details page
    And User should be able to see Payment Information title on View Your Order Details page
    #And User should be able to see Card type thumbnail on View Your Order Details page
    And User should be able to see Card details and expiry on View Your Order Details page
    And User should be able to see Store Information title on View Your Order Details page
    #And User should be able to see Store Address and Contact information on View Your Order Details page
    And User should be able to see Order Summary title on View Your Order Details page
    And User should be able to see Item Total on View Your Order Details page
    And User should be able to see tax on View Your Order Details page
    And User should be able to see Order total on View Your Order Details page
    When User clicks back button on View Order Details Page
    Then User is redirected to "Order Status" screen
    When User clicks back button on Order Status Page
    Then User is redirected to "Your Orders" screen
    When User clicks More Tab on Home Page
    And User clicks Your Profile link on Account Page
    And User scrolls down for one time
    And User clicks sign out button in Profile page
    Then User is on Welcome Page

  @FD_3595_TC1 @FD_3595_TC2 @FD_3595_TC3 @FD_3595_TC4 @FD_3586_TC14 @FD_3588_TC7
  Scenario: Verify Order History cancelled Order workflow For More Screen
    When User clicks Log In button on Welcome Page
    And User enter the login details for "OrderHistoryLoginDetails"
    And User clicks Now Now button on Enable Biometric Login page
    And User clicks Start Saving button on Sign Up complete Page
    And User clicks Skip button on Enable My Location Page
    And User clicks Skip button on Enable My Location Page Pop Up
    And User clicks Not Now button on Keep Up to Date Page
    Then User is able to see More text on Home Page
    When User clicks More Tab on Home Page
    Then User is able to see Your Orders text on More Page
    When User clicks Your Orders button on More Page
    Then User is redirected to "Your Orders" screen
    When User scrolls down for one time
    Then User is able to see End text "You’ve reached the end of the list" on Your Orders page
    And User clicks on "Canceled" Order from Order history list page
    Then User is redirected to "Order Status" screen
    And User is able to see Order status title "Your order was canceled" on Order Status page
    #And User is able to see "Canceled:" text and Date of Cancellation on Order Status page
    And User is able to see Cancellation Reason title on Order Status page
    And User is able to see Cancellation Reason Description text on Order Status page
    When User scrolls down for one time
    Then User is able to see Items Cancelled title on Order Status page
    And User is able to see Cancelled item Image on Order Status page
    And User is able to see Cancelled item Price on Order Status page
    And User is able to see Cancelled item Quantity on Order Status page
    And User is able to see Cancelled item Descriptions on Order Status page
    And User is able to see Cancelled item Reason on Order Status page
    When User clicks More Tab on Home Page
    And User clicks Your Profile link on Account Page
    And User scrolls down for one time
    And User clicks sign out button in Profile page
    Then User is on Welcome Page
