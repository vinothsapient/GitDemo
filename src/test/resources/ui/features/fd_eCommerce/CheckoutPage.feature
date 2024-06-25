@mobile @FD_eCommerce @FD_iBotta
Feature: Checkout Workflow

  Background:
    Given User is on Welcome Page
    And User is able to see Family Dollar Icon on Welcome Page

  @CheckoutWorkflow @FD_3221_TC1 @FD_3221_TC2 @FD_3221_TC3 @FD_3620_TC1 @FD_3202_TC1 @FD_3202_TC2
  @FD_3202_TC3 @FD_3202_TC4 @FD_3202_TC5 @FD_3617_TC1 @FD_3617_TC2 @FD_3612_TC1 @FD_3612_TC2
  @FD_4279_TC1 @FD_4279_TC2 @FD_4279_TC3 @FD_4279_TC4 @FD_4279_TC6 @FD_4279_TC7
  @FD_4279_TC8 @FD_4279_TC9
  Scenario: Verify Checkout Workflow for Logged In User
    When User clicks Log In button on Welcome Page
    And User enter the login details for "ValidLoginDetails"
    And User clicks Now Now button on Enable Biometric Login page
    And User clicks Start Saving button on Sign Up complete Page
    And User clicks Skip button on Enable My Location Page
    And User clicks Skip button on Enable My Location Page Pop Up
    And User clicks Not Now button on Keep Up to Date Page
    Then User is able to see Home text on Home Page
    When User clicks Shop button on Home Page
    And User clicks Products and Coupons Search box on Home Page
    Then User is able to see Scan Product Barcode text on Coupon Search Page
    When User enter the "FD1416605" in searchBar on Home Page
    Then User is able see to Product tab on Product and Coupons listing page
    When User clicks on First Product from the List
    Then User is able to see Product details page
    When User scroll down little on More page
    And User scroll down little on More page
    Then User is able to see Add To Cart button on pdp
    When User clicks on Add To Cart button on pdp
    And User clicks View Cart button on View Cart Page
    Then User is navigated to Cart Page
    When User clicks Checkout button on Cart Page
    Then User is able to see Checkout Header on Checkout Page
    And User is able to see back button on Checkout Page
    And User is able to see InStore Pickup details label on Checkout Page
    And User is able to see Free Pickup label on Checkout Page
    And User is able to see Free Pickup Day on Checkout Page
    And User is able to see Order Within label on Checkout Page
    And User is able to see Order Within data on Checkout Page
    And User is able to see Pickup address on Checkout Page
    And User is able to see Item Image with badge on Checkout Page
    And User is able to see Payment Info Icon on Checkout Page
    And User is able to see Payment Information text on Checkout Page
    And User is able to see Payment Info Add Text on Checkout Page
    And User is able to see Sms Notification Text Updates on Checkout Page
    And User is able to see Sms Notification Add Text on Checkout Page
    When User clicks on Add Sms Notification button on Checkout Page
    Then User is able to see Sms Updates title "Sign Up for Text Updates" text on bottom sheet
    And User is able to see close button on Sms Updates bottom sheet
    And User is able to see Your Phone Number title "Your Phone Number" text on bottom sheet
    And User is able to see Your Phone Number text on bottom sheet
    And User is able to see Sms Updates message on bottom sheet
    And User is able to see Order Updates "Order Updates" text on bottom sheet
    And User is able to see Order Updates description on bottom sheet
    And User is able to see Order Updates toggle button on bottom sheet
    And User is able to see Sms Updates Terms Message on bottom sheet
    And User is able to see "Terms" and "Privacy Policy" links on Sms Updates bottom sheet
    And User is able to see Marketing Notifications "Marketing Notifications" text on bottom sheet
    And User is able to see Marketing Notifications description on bottom sheet
    And User is able to see Marketing Notifications toggle button on bottom sheet
    When User clicks Close button on Sms Updates bottom sheet
    Then User is able to see Sms Notification Add Text on Checkout Page
    When User clicks on Add Sms Notification button on Checkout Page
    Then User is able to see Save text on bottom sheet
    When User clicks Order Updates toggle button on bottom sheet
    Then User is able to see Save button enabled on bottom sheet
    When User clicks Save CTA on bottom sheet
    Then User is navigated to Checkout Page
    And User is able to see Sms Notification Edit Text on Checkout Page
    When User scrolls down for one time
    Then User is able to see Mobile Number label on Checkout Page
    And User is able to see Mobile Number on Checkout Page
    And User is able to see Terms And Privacy Message on Checkout Page
    And User is able to see Order Summary header text on Checkout Page
    When User scrolls down for one time
    Then User is able to see Items Total text on Checkout Page
    And User is able to see Items Total value on Checkout Page
    And User is able to see Tax text on Checkout Page
    And User is able to see Tax value on Checkout Page
    And User is able to see Order Total text on Cart Page
    And User is able to see Order Total value on Checkout Page
    And User is able to see Order Confirmation Updates on Checkout Page
    And User is able to see Order Confirmation Email on Checkout Page
    And User is able to see Place Order Description on Checkout Page
    And User is able to see Terms and Conditions text on Checkout Page
    And User is able to see Smart Coupon Section Description on Checkout Page
    And User is able to see Want to add remove items text on Checkout Page
    And User is able to see Return to Cart Text on Checkout Page
    And User is able to see Order Price on Checkout Page
    And User is able to see Order Quantity on Checkout Page
    And User is able to see Place Order text on Checkout Page
    When User clicks on Return To Cart link on Checkout Page
    Then User is navigated to Cart Page
    When User clicks Checkout button on Cart Page
    Then User is able to see Checkout Header on Checkout Page
    When User clicks on Terms and Conditions link on Checkout Page
    And User clicks Allow device location pop up
    Then User is able to see Checkout Terms And Conditions Web Page
    When User clicks back button from Keypad
    Then User is navigated to Checkout Page
    When User clicks More Tab on Home Page
    And User clicks Your Profile link on Account Page
    And User scrolls down for one time
    And User clicks sign out button in Profile page
    Then User is on Welcome Page

  @PaymentWorkflow @FD_3203_TC1 @FD_3203_TC2 @FD_3203_TC3 @FD_3924_TC1 @FD_3924_TC2 @FD_3924_TC3
  @FD_4182_TC4
  Scenario: Verify Check out Payment Workflow
    When User clicks Log In button on Welcome Page
    And User enter the login details for "ValidLoginDetails"
    And User clicks Now Now button on Enable Biometric Login page
    And User clicks Start Saving button on Sign Up complete Page
    And User clicks Skip button on Enable My Location Page
    And User clicks Skip button on Enable My Location Page Pop Up
    And User clicks Not Now button on Keep Up to Date Page
    Then User is able to see Home text on Home Page
    When User clicks Shop button on Home Page
    And User clicks Products and Coupons Search box on Home Page
    Then User is able to see Scan Product Barcode text on Coupon Search Page
    When User enter the "FD1416605" in searchBar on Home Page
    Then User is able see to Product tab on Product and Coupons listing page
    When User clicks on First Product from the List
    Then User is able to see Product details page
    When User scroll down little on More page
    And User scroll down little on More page
    Then User is able to see Add To Cart button on pdp
    When User clicks on Add To Cart button on pdp
    And User clicks View Cart button on View Cart Page
    Then User is navigated to Cart Page
    When User clicks Checkout button on Cart Page
    Then User is navigated to Checkout Page
    And User is able to see Item Image with badge on Checkout Page
    When User clicks on Add Payment Information button on Checkout Page
    Then User is able to see Payment header on Payment Popup
    And User is able to see Cancel Button on Payment Popup
    When User clicks Cancel Button on Payment Popup
    Then User is navigated to Checkout Page
    When User clicks on Add Payment Information button on Checkout Page
    And User is able to see Pay with Card option text on Payment Popup
    And User is able to see Payment Option Modal Card on Payment Popup
    And User is able to see Pay with PayPal option text on Payment Popup
    And User is able to see Payment Option Modal PayPal text on Payment Popup
    And User is able to see Continue text on Payment Popup
    When User clicks on Continue button on Payment Popup
    Then User is able to see Add Card header text on Payment Card Details Page
    And User is able to see Cancel Button on Payment Card Details Page
    And User is able to see Name On Card text on Payment Card Details Page
    And User is able to see Card Number text on Payment Card Details Page
    And User is able to see Expiration text on Payment Card Details Page
    And User is able to see CVV text on Payment Card Details Page
    And User is able to see Billing Address text on Payment Card Details Page
    And User is able to see First name text on Payment Card Details Page
    And User is able to see Last Name text on Payment Card Details Page
    When User scrolls down for one time
    Then User is able to see Address Line1 text on Payment Card Details Page
    And User is able to see Address Line2 text on Payment Card Details Page
    And User is able to see City text on Payment Card Details Page
    And User is able to see State text on Payment Card Details Page
    And User is able to see Zip Code text on Payment Card Details Page
    And User is able to see Phone number text on Payment Card Details Page
    When User scrolls down for one time
    Then User is able to see Save text on Payment Card Details Page
    When User click on Cancel button in Add Payment popup
    Then User is navigated to Checkout Page
    When User clicks Shop button on Home Page
    Then User is able to see AdsAndBooks Title text "Explore via Ads & Books" on Shop Page
    When User clicks Cart Tab on Home Page
    Then User is navigated to Checkout Page
    When User clicks More Tab on Home Page
    And User clicks Your Profile link on Account Page
    And User scrolls down for one time
    And User clicks sign out button in Profile page
    Then User is on Welcome Page

  @CheckoutWorkflow @FD_3204_TC1 @FD_3204_TC2 @FD_3204_TC4 @FD_3204_TC5 @FD_3205_TC1 @FD_3618_TC1
  @FD_3618_TC2 @FD_3618_TC3 @FD_3618_TC4 @FD_3618_TC5 @FD_3621_TC1 @FD_3621_TC3 @FD_3621_TC4
  @FD_3621_TC5 @FD_3614_TC1 @FD_3614_TC2 @FD_3614_TC4 @FD_3614_TC5 @FD_3614_TC6 @FD_3614_TC7
  @FD_3614_TC8 @FD_3614_TC9 @FD_4180_TC1 @FD_4176_TC1 @FD_4399_TC1
  Scenario: Verify Card Details Workflow
    When User clicks Log In button on Welcome Page
    And User enter the login details for "ValidLoginDetails"
    And User clicks Now Now button on Enable Biometric Login page
    And User clicks Start Saving button on Sign Up complete Page
    And User clicks Skip button on Enable My Location Page
    And User clicks Skip button on Enable My Location Page Pop Up
    And User clicks Not Now button on Keep Up to Date Page
    Then User is able to see Home text on Home Page
    When User clicks Shop button on Home Page
    And User clicks Products and Coupons Search box on Home Page
    Then User is able to see Scan Product Barcode text on Coupon Search Page
    When User enter the "FD1416605" in searchBar on Home Page
    Then User is able see to Product tab on Product and Coupons listing page
    When User clicks on First Product from the List
    Then User is able to see Product details page
    When User scroll down little on More page
    And User scroll down little on More page
    Then User is able to see Add To Cart button on pdp
    When User clicks on Add To Cart button on pdp
    And User clicks View Cart button on View Cart Page
    Then User is navigated to Cart Page
    When User clicks Checkout button on Cart Page
    Then User is navigated to Checkout Page
    And User is able to see Payment Info Add Text on Checkout Page
    And User is able to see Place Order text on Checkout Page
    And User is able to see Place Order button in disabled status on Checkout Page
    When User clicks on Add Payment Information button on Checkout Page
    Then User is able to see Payment header on Payment Popup
    When User selects Pay with Card option on Payment Popup
    And User clicks on Continue button on Payment Popup
    Then User is able to see Add Card header text on Payment Card Details Page
    When User enters Name on Card as "William" in Add Card popup on checkout page
    And User enters Card Number "4485581000000005" in Add Card popup on checkout page
    And User enters Card Expiration date as "12/29" in Add Card popup on checkout page
    And User enters CVV number "382" in Add Card popup on checkout page
    And User scroll down little on More page
    And User scroll down little on More page
    And User enters First name "William" on Payment Card Details Page
    And User enters Last Name "Brown" on Payment Card Details Page
    And User enters Address Line1 "1 Boston, Irvine CA 92604" on Payment Card Details Page
    And User scrolls down for one time
    And User enters Phone number "9187432567" on Payment Card Details Page
    And User scrolls down for one time
    And User clicks on Save button on Payment Card Details Page
    Then User is navigated to Checkout Page
    And User is able to see Edit in Payment Information Section
    And User is able to see already entered "4485581000000005" and "12/29" payment details in Payment Information Section
    And User is able to see Place Order button in enabled status on Checkout Page
    When User clicks on Edit link Payment Information Section
    And User selects Pay with Card option on Payment Popup
    And User clicks on Continue button on Payment Popup
    Then User should be able to see Edit Payment popup
    When User click on Cancel button in Add Payment popup
    Then User is navigated to Checkout Page
    When User scrolls down for one time
    And User scrolls down for one time
    Then User is able to see Smart Coupon Disclaimers Section on Checkout Page
    When User clicks Place Order button on Checkout Page
    Then User is navigated to Order Confirmation Page
    And User is able to see Header "Order Confirmation" on Order Confirmation Page
    And User is able to see back button on Order Confirmation Page
    And User is able to see Thank you message on Order Confirmation Page
    And User is able to see Order Id on Order Confirmation Page
    And User is able to see View Order Details on Order Confirmation Page
    And User is able to see View Order Details Right arrow on Order Confirmation Page
    And User is able to see PickUp Details on Order Confirmation Page
    And User is able to see Address on Order Confirmation Page
    And User is able to see Get Directions on Order Confirmation Page
    And User is able to see Get Directions Map on Order Confirmation Page
    When User scroll down little on More page
    And User scroll down little on More page
    Then User is able to see PickUp Person on Order Confirmation Page
    And User is able to see Email on Order Confirmation Page
    And User is able to see Phone Number on Order Confirmation Page
    And User is able to see Items In Order on Order Confirmation Page
    And User is able to see Item Image on Order Confirmation Page
    And User is able to see Item Product Price on Order Confirmation Page
    And User is able to see Items Quantity on Order Confirmation Page
    And User is able to see Item Descriptions on Order Confirmation Page
    And User is able to see Buy Again text on Order Confirmation Page
    When User scrolls down for one time
    Then User is able to see Payment Information text on Order Confirmation Page
    And User is able to see Amount Price text on Order Confirmation Page
    And User is able to see Order Summary header text on Order Confirmation Page
    And User is able to see Items Total text on Order Confirmation Page
    And User is able to see Items Total value on Order Confirmation Page
    And User is able to see Estimated Tax text on Order Confirmation Page
    And User is able to see Estimated Tax value on Order Confirmation Page
    And User is able to see Estimated Total text on Order Confirmation Page
    And User is able to see Estimated Total value on Order Confirmation Page
    When User clicks Buy Again button on Order Confirmation Page
    Then User is able to see Product details page
    When User clicks More Tab on Home Page
    And User clicks Your Profile link on Account Page
    And User scrolls down for one time
    And User clicks sign out button in Profile page
    Then User is on Welcome Page

  @FD_3204_TC6 @FD_3205_TC3 @FD_4180_TC2 @FD_4180_TC3 @FD_4180_TC4
  Scenario: Verify error messages for mandatory fields in Checkout page Payment Information
    When User clicks Log In button on Welcome Page
    And User enter the login details for "ValidLoginDetails"
    And User clicks Now Now button on Enable Biometric Login page
    And User clicks Start Saving button on Sign Up complete Page
    And User clicks Skip button on Enable My Location Page
    And User clicks Skip button on Enable My Location Page Pop Up
    And User clicks Not Now button on Keep Up to Date Page
    Then User is able to see Home text on Home Page
    When User clicks Shop button on Home Page
    And User clicks Products and Coupons Search box on Home Page
    Then User is able to see Scan Product Barcode text on Coupon Search Page
    When User enter the "FD1416605" in searchBar on Home Page
    Then User is able see to Product tab on Product and Coupons listing page
    When User clicks on First Product from the List
    Then User is able to see Product details page
    When User scroll down little on More page
    And User scroll down little on More page
    Then User is able to see Add To Cart button on pdp
    When User clicks on Add To Cart button on pdp
    And User clicks View Cart button on View Cart Page
    Then User is navigated to Cart Page
    When User clicks Checkout button on Cart Page
    Then User is navigated to Checkout Page
    And User is able to see Payment Info Add Text on Checkout Page
    When User clicks on Add Payment Information button on Checkout Page
    Then User is able to see Payment header on Payment Popup
    When User selects Pay with Card option on Payment Popup
    And User clicks on Continue button on Payment Popup
    Then User is able to see Add Card header text on Payment Card Details Page
    When User scroll down little on More page
    And User scroll down little on More page
    And User scrolls down for one time
    And User clicks on Save button on Payment Card Details Page
    And User clicks back button from Keypad
    And User is able to see Name On Card error message in Add Card popup on Checkout Page
    And User is able to see Card Number error message in Add Card popup on Checkout Page
    And User is able to see Card Expiration Date error message in Add Card popup on Checkout Page
    And User is able to see Card CVV error message in Add Card popup on Checkout Page
    And User is able to see Address First Name error message in Add Card popup on Checkout Page
    And User is able to see Address Last Name error message in Add Card popup on Checkout Page
    And User is able to see Address Line1 error message in Add Card popup on Checkout Page
    When User scrolls down for one time
    And User is able to see Address City error message in Add Card popup on Checkout Page
    And User is able to see Address State error message in Add Card popup on Checkout Page
    And User is able to see Address Zip Code error message in Add Card popup on Checkout Page
    And User is able to see Address Phone Number error message in Add Card popup on Checkout Page
    And User is able to see Add Card header text on Payment Card Details Page
    When User click on Cancel button in Add Payment popup
    Then User is navigated to Checkout Page
    When User clicks More Tab on Home Page
    And User clicks Your Profile link on Account Page
    And User scrolls down for one time
    And User clicks sign out button in Profile page
    Then User is on Welcome Page

  @FD_3197_TC1 @FD_3197_TC2 @FD_3197_TC3 @FD_4101_TC1 @FD_4101_TC2
  Scenario: Verify Address Type ahead search
    When User clicks Log In button on Welcome Page
    And User enter the login details for "ValidLoginDetails"
    And User clicks Now Now button on Enable Biometric Login page
    And User clicks Start Saving button on Sign Up complete Page
    And User clicks Skip button on Enable My Location Page
    And User clicks Skip button on Enable My Location Page Pop Up
    And User clicks Not Now button on Keep Up to Date Page
    Then User is able to see Home text on Home Page
    When User clicks Shop button on Home Page
    And User clicks Products and Coupons Search box on Home Page
    Then User is able to see Scan Product Barcode text on Coupon Search Page
    When User enter the "FD1416605" in searchBar on Home Page
    Then User is able see to Product tab on Product and Coupons listing page
    When User clicks on First Product from the List
    Then User is able to see Product details page
    When User scroll down little on More page
    And User scroll down little on More page
    Then User is able to see Add To Cart button on pdp
    When User clicks on Add To Cart button on pdp
    And User clicks View Cart button on View Cart Page
    Then User is navigated to Cart Page
    When User clicks Checkout button on Cart Page
    Then User is navigated to Checkout Page
    And User is able to see Payment Info Add Text on Checkout Page
    When User clicks on Add Payment Information button on Checkout Page
    Then User is able to see Payment header on Payment Popup
    When User selects Pay with Card option on Payment Popup
    And User clicks on Continue button on Payment Popup
    Then User is able to see Add Card header text on Payment Card Details Page
    When User scroll down little on More page
    And User scroll down little on More page
    And User enters 3 characters in Address Line1 "Bos" on Payment Card Details Page
    Then User should be able to see Type ahead
    When User should have ability to select the suggested address from the pop up
    Then User is able to see selected address "Bos" in Address Line1
    When User edits the Address "Tes" on Payment Card Details Page
    And User should have ability to select the updated address from the pop up
    Then User is able to see updated address "Tes" in Address Line1
    When User enters 2 characters in Address Line1 "Bo" on Payment Card Details Page
    Then Type ahead should not trigger
    When User click on Cancel button in Add Payment popup
    Then User is navigated to Checkout Page
    When User clicks on Add Payment Information button on Checkout Page
    Then User is able to see Payment header on Payment Popup
    When User selects Pay with Card option on Payment Popup
    And User clicks on Continue button on Payment Popup
    Then User is able to see Add Card header text on Payment Card Details Page
    And User enters Name on Card as "William" in Add Card popup on checkout page
    And User enters Card Number "4485581000000005" in Add Card popup on checkout page
    And User enters Card Expiration date as "12/29" in Add Card popup on checkout page
    And User enters CVV number "382" in Add Card popup on checkout page
    And User scroll down little on More page
    And User scroll down little on More page
    And User enters First name "William" on Payment Card Details Page
    And User enters Last Name "Brown" on Payment Card Details Page
    And User enters Address Line1 "36 W Side" on Payment Details Page
    And User scroll down little on More page
    And User enters city "Gaithersburg" on Payment Card Details Page
    And User enters State "Maryland" on Payment Card Details Page
    And User enters zipcode "20878" on Payment Card Details Page
    And User scroll down little on More page
    And User enters Phone number "9187432567" on Payment Card Details Page
    When User scrolls down for one time
    And User clicks on Save button on Payment Card Details Page
    And User is able to see "Is This Your Correct Address?" popup after saving Card Details
    And User scroll down little on More page
    And User scroll down little on More page
    And User scroll down little on More page
    And User selects edit suggested address in popup
    And User is able to see Add Card header text on Payment Card Details Page
    And User clicks on Save button on Payment Card Details Page
    And User scroll down little on More page
    And User scroll down little on More page
    And User scroll down little on More page
    And User selects Use Suggested Address in popup
    Then User is navigated to Checkout Page
    And User is able to see Edit in Payment Information Section
    When User clicks More Tab on Home Page
    And User clicks Your Profile link on Account Page
    And User scrolls down for one time
    And User clicks sign out button in Profile page
    Then User is on Welcome Page

  @FD_4181_TC3 @FD_3621_TC2 @FD_4101_TC3
  Scenario: Add card details and verify card details are scrubbed when user moves away from checkout
    When User clicks Log In button on Welcome Page
    And User enter the login details for "ValidLoginDetails"
    And User clicks Now Now button on Enable Biometric Login page
    And User clicks Start Saving button on Sign Up complete Page
    And User clicks Skip button on Enable My Location Page
    And User clicks Skip button on Enable My Location Page Pop Up
    And User clicks Not Now button on Keep Up to Date Page
    Then User is able to see Home text on Home Page
    When User clicks Shop button on Home Page
    And User clicks Products and Coupons Search box on Home Page
    Then User is able to see Scan Product Barcode text on Coupon Search Page
    When User enter the "FD1416605" in searchBar on Home Page
    Then User is able see to Product tab on Product and Coupons listing page
    When User clicks on First Product from the List
    Then User is able to see Product details page
    When User scroll down little on More page
    And User scroll down little on More page
    Then User is able to see Add To Cart button on pdp
    When User clicks on Add To Cart button on pdp
    And User clicks View Cart button on View Cart Page
    Then User is navigated to Cart Page
    When User clicks Checkout button on Cart Page
    Then User is navigated to Checkout Page
    And User is able to see Payment Info Add Text on Checkout Page
    And User is able to see Place Order text on Checkout Page
    When User clicks on Add Payment Information button on Checkout Page
    Then User is able to see Payment header on Payment Popup
    When User selects Pay with Card option on Payment Popup
    And User clicks on Continue button on Payment Popup
    Then User is able to see Add Card header text on Payment Card Details Page
    When User enters Name on Card as "William" in Add Card popup on checkout page
    And User enters Card Number "4485581000000005" in Add Card popup on checkout page
    And User enters Card Expiration date as "12/29" in Add Card popup on checkout page
    And User enters CVV number "382" in Add Card popup on checkout page
    And User scroll down little on More page
    And User scroll down little on More page
    And User enters First name "William" on Payment Card Details Page
    And User enters Last Name "Brown" on Payment Card Details Page
    And User enters Address Line1 "365 W Side Dr" on Payment Details Page
    And User scroll down little on More page
    And User enters city "Gaithersburg" on Payment Card Details Page
    And User enters State "Maryland" on Payment Card Details Page
    And User enters zipcode "20878" on Payment Card Details Page
    And User scroll down little on More page
    And User enters Phone number "9187432567" on Payment Card Details Page
    And User scrolls down for one time
    And User clicks on Save button on Payment Card Details Page
    Then User is able to see "Is This Your Correct Address?" popup after saving Card Details
    When User selects Use Address as Entered in popup
    Then User is able to see Checkout Header on Checkout Page
    When User scrolls down for one time
    And User scrolls down for one time
    Then User is able to see Return to Cart Text on Checkout Page
    When User clicks on Return To Cart link on Checkout Page
    Then User is navigated to Cart Page
    When User clicks Checkout button on Cart Page
    Then User should not get already entered CardNumber and CardExpiryDate payment details in Payment Information Section
    When User clicks More Tab on Home Page
    And User clicks Your Profile link on Account Page
    And User scrolls down for one time
    And User clicks sign out button in Profile page
    Then User is on Welcome Page
