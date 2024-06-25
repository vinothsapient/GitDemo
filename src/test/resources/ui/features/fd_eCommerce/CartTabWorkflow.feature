@mobile @FD_eCommerce @FD_iBotta
Feature: Product Cart Page Workflow

  Background:
    Given User is on Welcome Page
    And User is able to see Family Dollar Icon on Welcome Page

  @EmptyCartForLoginUser @FD_3067_TC3 @FD_3171_TC1 @FD_3171_TC2 @FD_4182_TC1 @FD_4182_TC2 @FD_4182_TC3
  @FD_3520_TC1 @FD_3520_TC2 @FD_3562_TC1 @FD_3587_TC1 @FD_3587_TC2 @FD_3585_TC2
  Scenario: Verify that user is able to see Empty Cart CTA when no product added for logged in user
    When User clicks Log In button on Welcome Page
    And User enter the login details for "NoStoreSelectedLogin"
    And User clicks Now Now button on Enable Biometric Login page
    And User clicks Start Saving button on Sign Up complete Page
    And User clicks Skip button on Enable My Location Page
    And User clicks Skip button on Enable My Location Page Pop Up
    And User clicks Not Now button on Keep Up to Date Page
    Then User is able to see Cart button on Global Navigation
    When User clicks Cart Tab on Home Page
    Then User is able to see Cart Header text on Cart Page
    And User is able to see Empty Cart Sub Header text "Your Cart is Empty" on Cart Page
    And User is able to see Empty Cart icon in Cart Page
    And User is able to see Empty Cart title "Your Cart is Empty" on Cart Page
    And User is able to see Empty Cart Message on Cart Page
    And User is able to see Explore Product Categories text in empty Cart Page
    And User is able to see Scanner button in empty Cart Page
    And User is able to see Scan Product Barcode text in empty Cart Page
    When User clicks on Explore Product Categories button on Empty Cart Page
    Then User is able to see AdsAndBooks Title text "Explore via Ads & Books" on Shop Page
    When User clicks Cart Tab on Home Page
    Then User is navigated to Cart Page
    When User clicks Shop button on Home Page
    And User clicks Products and Coupons Search box on Home Page
    Then User is able to see Scan Product Barcode text on Coupon Search Page
    When User enter the "FD1416605" in searchBar on Home Page
    Then User is able see to Product tab on Product and Coupons listing page
    When User clicks on First Product from the List
    Then User is able to see Product details page
    When User scroll down little on More page
    And User scroll down little on More page
    Then User is not able to see Add To Cart button on pdp
    And User is able to see "Select a Store" store text on pdp
    When User clicks on Select A Store CTA
    And User select Only this time on Device Location pop up
    And User clicks OK button on Profile PopUp Page
    Then User is able to see "Choose a Store" header on Choose A Store Page
    And User is able to see back button on Choose A Store Page
    When User clicks back button on Choose a store Page
    Then User is able to see Product details page
    When User clicks More Tab on Home Page
    Then User is not able to see Recent Orders text on More Page
    When User clicks Your Orders button on More Page
    Then User is redirected to "Your Orders" screen
    And User is able to see back button on Your Order Page
    And User is able to see No Order History Image on Order History Page
    And User is able to see No Order History text "You have no order history." on Order History Page
    When User clicks back button on Your Order Page
    And User clicks Your Profile link on Account Page
    And User scrolls down for one time
    And User clicks sign out button in Profile page
    Then User is on Welcome Page

  @EmptyCartForGuestUser @FD_3068_TC1 @FD_3068_TC2 @FD_3068_TC3 @FD_3068_TC4 @FD_3068_TC6 @FD_3068_TC7
  @FD_3068_TC8 @FD_3068_TC9 @FD_3563_TC1
  Scenario: Verify that user is able to see Empty Cart CTA for guest user
    When User clicks Continue as Guest button on Welcome Page
    And User click Continue as Guest link on popup dialog
    And User clicks Skip button on Enable My Location Page
    And User clicks Skip button on Enable My Location Page Pop Up
    And User clicks Not Now button on Keep Up to Date Page
    Then User is able to see Cart button on Global Navigation
    When User clicks Cart Tab on Home Page
    Then User is able to see Cart Header text on Cart Page
    And User is able to see Empty Cart Sub Header text "Your Cart is Empty" on Cart Page
    And User is able to see "Account Login Required" text on Empty Cart Page for Guest User
    And User is able to see "Login or sign up to start adding items to your cart and proceed to checkout." sub text on Account Page for Guest User
    And User is able to see Log In link text on Empty Cart page
    When User clicks Login button on Empty Cart page
    Then User is redirected to the login page
    When User clicks back button on Login Page
    And User is able to see Create one link text on Empty Cart page
    When User clicks Create One button on Empty Cart page
    Then User is redirected to the Sign Up page
    When User clicks back button on Sign Up Page
    Then User is able to see Cart Header text on Cart Page
    When User clicks Login button on Empty Cart page
    Then User is redirected to the login page
    When User enter the login details for "ValidLoginDetails"
    And User clicks Now Now button on Enable Biometric Login page
    And User clicks Start Saving button on Sign Up complete Page
    And User clicks Skip button on Enable My Location Page
    And User clicks Skip button on Enable My Location Page Pop Up
    And User clicks Not Now button on Keep Up to Date Page
    Then User is able to see Cart Header text on Cart Page
    When User clicks More Tab on Home Page
    And User clicks Your Profile link on Account Page
    And User scrolls down for one time
    And User clicks sign out button in Profile page
    Then User is on Welcome Page

  @FD_3173_TC1 @FD_3173_TC2 @FD_3173_TC3 @FD_3173_TC4 @FD_3172_TC1 @FD_3172_TC3 @FD_3194_TC1
  @FD_3194_TC2 @FD_3194_TC3 @FD_3194_TC4 @FD_3194_TC5 @FD_3194_TC6 @FD_3194_TC7 @FD_3194_TC8
  @FD_3194_TC9 @FD_3177_TC1 @FD_3201_TC1 @FD_3201_TC2 @FD_3201_TC3 @FD_3201_TC5 @FD_3201_TC6
  @FD_3201_TC7 @FD_3201_TC8 @FD_3201_TC9 @FD_3201_TC10 @FD_3563_TC2 @FD_3563_TC3 @FD_3563_TC4
  @FD_3563_TC5 @FD_3563_TC6 @FD_3563_TC15 @FD_3563_TC16 @FD_4183_TC1 @FD_4183_TC2
  Scenario: Verify Product Cart Page Workflow
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
    And User is not able to see View Cart Overlay
    When User clicks on Add To Cart button on pdp
    Then User is able to see Logged In User Header "Added to Cart" on View Cart
    And User is able to see Header with Success Icon on View Cart
    And User is able to see Product Image on View Cart
    And User is able to see Product Description on View Cart
    And User is able to see Product List Price on View Cart
    And User is able to see Product Total Price on View Cart
    And User is able to see close button on View Cart
    When User clicks close button on View Cart
    Then User is able to see Add To Cart button on pdp
    When User clicks on Add To Cart button on pdp
    Then User is able to see View Cart button on View Cart
    And User is able to see default number of items on View Cart CTA
    When User clicks View Cart button on View Cart Page
    Then User is able to see Cart Header text on Cart Page
    And User is able to see Sub Total text on Cart Page
    And User is able to see Total Items text on Cart Page
    And User is able to see In Store Pickup label on Cart Page
    And User is able to see Free Pickup label on Cart Page
    And User is able to see Free Pickup Day on Cart Page
    And User is able to see Order Within label on Cart Page
    And User is able to see Order Within data on Cart Page
    And User is able to see PickUp address on Cart Page
    And User is able to see Model Product Image on Cart Page
    And User is able to see Product Price on Cart Page
    And User is able to see Product Description on Cart Page
    And User is able to see Quantity Selector for a product on Cart Page
    And User is able to see Decrease count CTA for a product on Cart Page
    And User is able to see count Number for a product on Cart Page
    And User is able to see Increase count CTA for a product on Cart Page
    And User is able to see Remove Product button for a product on Cart Page
    And User is able to see Check Out button text on Cart Page
    When User clicks quantity count text on quantity selector
    Then User is able to see quantity options as an overlay
    When User selects item quantity "2" from the overlay
    Then User is able to see quantity options overlay is dismissed
    And User is able to see Product Quantity as "2" on pdp
    When User scrolls down for one time
    Then User is able to see Order Summary header text on Cart Page
    And User is able to see Items Total text on Cart Page
    And User is able to see Items Total value on Cart Page
    And User is able to see Estimated Tax text on Cart Page
    And User is able to see Estimated Tax value on Cart Page
    And User is able to see Estimated Total text on Cart Page
    And User is able to see Estimated Total value on Cart Page
    And User is able to see Check Out button text on Cart Page
    And User is able to see PayPal button text on Cart Page
    And User is able to see Cart Header text on Cart Page
    When User is able to see Increase count CTA for a product on Cart Page
    When User clicks Model Product Image on Cart Page
    Then User is able to see Product details page
    When User scroll down little on More page
    And User scroll down little on More page
    And User selects maximum allowed quantity "Max 6" of the product
    And User clicks on Add To Cart button on pdp
    Then User is able to see Logged In User Header "Added to Cart" on View Cart
    When User clicks close button on View Cart
    Then User is able to Max Item Reached warning message on pdp
    When User clicks Max Item Reached Close button on pdp
    And User clicks back button on Product Details page
    Then User is navigated to Cart Page
    When User clicks Checkout button on Cart Page
    Then User is able to see Checkout Header on Checkout Page
    When User clicks back button on Check Out Page
    Then User is navigated to Cart Page
    When User clicks Remove Product button for a product on Cart Page
    Then User is able to see Empty Cart title "Your Cart is Empty" on Cart Page
    When User clicks More Tab on Home Page
    And User clicks Your Profile link on Account Page
    And User scrolls down for one time
    And User clicks sign out button in Profile page
    Then User is on Welcome Page

  @FD_3925_TC1 @FD_3925_TC2 @FD_3925_TC3 @FD_3925_TC4 @FD_3924_TC4 @FD_4181_TC4
  Scenario: Verify Paypal Page Workflow
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
    Then User is able to see Logged In User Header "Added to Cart" on View Cart
    When User clicks View Cart button on View Cart Page
    Then User is able to see Cart Header text on Cart Page
    And User is able to see PayPal button text on Cart Page
    When User clicks PayPal button on Cart Page
    Then User is able to see PayPal header "Pay with PayPal" on Paypal Page
    When User clicks Cancel button on Paypal Page
    Then User is able to see PayPal button text on Cart Page
    When User clicks PayPal button on Cart Page
    Then User is able to see PayPal header "Pay with PayPal" on Paypal Page
    When User enter the Paypal login details for "ValidPaypalLogin"
    Then User is able to see Continue to Review Order button on Paypal Page
    When User clicks Continue to Review Order button on Paypal Page
    Then User is able to see Checkout Header on Checkout Page
    And User is able to see Place Order button in enabled status on Checkout Page
    And User is able to see Paypal Payment Option on Checkout Page
    When User clicks on Add Payment Information button on Checkout Page
    Then User is able to see Payment header on Payment Popup
    When User selects Pay with Paypal option on Payment Popup
    And User clicks on Continue button on Payment Popup
    Then User is able to see Continue to Review Order button on Paypal Page
    When User clicks Continue to Review Order button on Paypal Page
    Then User is able to see Checkout Header on Checkout Page
    When User clicks back button on Check Out Page
    Then User is navigated to Cart Page
    When User clicks Checkout button on Cart Page
    Then User is not able to see Paypal Payment Option on Checkout Page
    When User clicks More Tab on Home Page
    And User clicks Your Profile link on Account Page
    And User scrolls down for one time
    And User clicks sign out button in Profile page
    Then User is on Welcome Page
