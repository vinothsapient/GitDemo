@mobile @FD_eCommerce @FD_iBotta
Feature: Product Coupon Sorting Workflow

  Background:
    Given User is on Welcome Page
    And User is able to see Family Dollar Icon on Welcome Page

  @ProductSortingWorkflow @FD_740_TC1 @FD_740_TC2 @FD_740_TC3 @FD_740_TC4 @FD_740_TC5 @FD_742_TC1
  @FD_742_TC2 @FD_742_TC3 @FD_742_TC4 @FD_743_TC1 @FD_743_TC2 @FD_743_TC3 @FD_743_TC4 @FD_743_TC5
  @FD_743_TC10 @FD_3067_TC1
  Scenario: Verify Product Sorting Workflow
    When User clicks Log In button on Welcome Page
    And User enter the login details for "ValidLoginDetails"
    And User clicks Now Now button on Enable Biometric Login page
    And User clicks Start Saving button on Sign Up complete Page
    And User clicks Skip button on Enable My Location Page
    And User clicks Skip button on Enable My Location Page Pop Up
    And User clicks Not Now button on Keep Up to Date Page
    Then User is able to see Home text on Home Page
    When User clicks Shop button on Home Page
    And User scroll down little on home page
    And User scroll down little on home page
    When User clicks on "Food & Beverages" under Find Products by Category section
    And User clicks on "Breakfast" under Sub Categories Page
    Then User is able to view "Breakfast" as header on L4 Sub Categories Page
    And User is able to see Home button on Global Navigation
    And User is able to see Shop button on Global Navigation
    And User is able to see Coupon button on Global Navigation
    And User is able to see Cart button on Global Navigation
    And User is able to see More button on Global Navigation
    And User is able to view PLP product list in L4 Sub Categories Page
    And User is able to see sort CTA
    And User is able to view "Relevance" under L4 Sub Categories Page
    When User clicks on sort CTA
    Then User is able to see Sorting Box Open Up
    And User is able to see all sorting opting text
      | Relevance               |
      | New Products            |
      | Top-Rated               |
      | Name: A to Z            |
      | Name: Z to A            |
      | Unit Price: Low to High |
      | Unit Price: High to Low |
      | Most-Reviewed           |
    And User is able to see Show Results CTA in Sorting Box
    And User is able to see close button in Sorting Box
    When User clicks on close button in Sorting box
    Then User is able to see sort CTA
    When User clicks on sort CTA
    Then User is able to see Sorting Box Open Up
    When User select any other form of sort apart from Relevance
    Then User is able to see Reset CTA in Sorting Box
    When User clicks on Show Results CTA in Sorting Box
    Then User is able to view PLP product list in L4 Sub Categories Page
    And User is able to view total number of products searched on L4 Sub Categories Page
    And User is able to view "Top-Rated" under L4 Sub Categories Page
    When User clicks on sort CTA
    Then User is able to see Sorting Box Open Up
    And User is able to see Reset CTA in Sorting Box
    When User clicks on Reset CTA in Sorting Box
    And User clicks on Show Results CTA in Sorting Box
    Then User is able to view PLP product list in L4 Sub Categories Page
    And User is able to view "Relevance" under L4 Sub Categories Page
    And User is able to see filter CTA
    And User is able to view " Filters" under L4 Sub Categories Page
    When User clicks on filter CTA
    Then User is able to see Filter Box Open Up
    And User is able to see all filter options text
      | Category              |
      | Product Availability  |
      | Average Rating And Up |
      | Price                 |
      | Brand                 |
      | Material Base         |
      | Color                 |
      | Finish Base           |
    And User is able to see Show Results CTA in Filter Box
    And User is able to see close button in Filter Box
    When User clicks on close button in Filter box
    Then User is able to see filter CTA
    And User is able to view back button on Category Page
    When User clicks on back button on Category Page
    Then User is able to view "Food & Beverages" as header on Sub Categories Page
    When User clicks More Tab on Home Page
    And User clicks Your Profile link on Account Page
    And User scrolls down for one time
    And User clicks sign out button in Profile page
    Then User is on Welcome Page

  @ProductReviewWorkflowForLoginUser @FD_1227_TC1 @FD_1227_TC2 @FD_1225_TC1 @FD_1225_TC2 @FD_1226_TC1
  @FD_1226_TC13 @FD_2863_TC1 @FD_2863_TC2 @FD_2863_TC3 @FD_2863_TC4 @FD_2863_TC5 @FD_2863_TC6
  @FD_2858_TC1 @FD_3615_TC1 @FD_3615_TC2 @FD_3517_TC1 @FD_3518_TC1 @FD_3518_TC2 @FD_2860_TC3
  @FD_3521_TC1 @FD_3521_TC2 @FD_3521_TC3 @FD_3521_TC4 @FD_3521_TC5 @FD_3521_TC6 @FD_3521_TC7
  @FD_3520_TC5 @FD_3520_TC8 @FD_3562_TC4 @FD_3562_TC6 @FD_3064_TC1
  Scenario: Verify PDP page and rating snapshot notifications for Login User
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
    And User is able to see total number of products searched on product and Coupon listing Page
    And User is able to see sort CTA
    And User is able to see filter CTA
    And User is able to view product Image for every product
    When User clicks on First Product from the List
    Then User is able to see Product details page
    And User is able see to Product Title on Product details page
    And User is able see to Rating on Product details page
    And User is able see to Description on Product details page
    And User is able see to SKU on Product details page
    And User is able see to Strike Through Price on Product details page
    When User scroll down little on home page
    And User scroll down little on home page
    Then User is able to see In Store Pickup label on pdp
    And User is able to see Free Pickup label on pdp
    And User is able to see Free Pickup Day on pdp
    And User is able to see Order Within label on pdp
    And User is able to see Order Within data on pdp
    And User is able to see PickUp address on pdp
    And User is able to see stock status "In Stock" on pdp
    And User is able to see Decrease count CTA for a product on pdp
    And User is able to see count Number for a product on pdp
    And User is able to see Increase count CTA for a product on pdp
    And User is able to see Add To Cart button on pdp
    And User is able to see Default Product Quantity as "1" on pdp
    And User is able to see Default decrease CTA is disabled on the quantity selector
    And User is able to see Default increase CTA is enabled on the quantity selector
    When User clicks increase CTA on the quantity selector
    Then User is able to see Product Quantity as "2" on pdp
    And User is able to see Decrease CTA is enabled on the quantity selector
    When User clicks decrease CTA on the quantity selector
    Then User is able to see Product Quantity as "1" on pdp
    And User is able to see decrease CTA is disabled on the quantity selector
    When User clicks quantity count text on quantity selector
    Then User is able to see quantity options as an overlay
    When User selects maximum allowed quantity "Max 6" of the product
    Then User is able to see warning message on pdp
    And User is able to see Product Quantity as "Max 6" on pdp
    And User is able to see increase CTA is disabled on the quantity selector
    When User clicks quantity count text on quantity selector
    Then User is able to see quantity options as an overlay
    When User selects item quantity "4" from the overlay
    Then User is able to see quantity options overlay is dismissed
    And User is able to see Product Quantity as "4" on pdp
    Then User is able see to Product Description Tab on Product details page
    When User scrolls down for one time
    Then User able to see you may also like section on Product details page
    And User verify Product name is displayed on you may also like for Product details Page
    And User See Minimum 2 and maximum 5 tabs showing
    When User scrolls down for one time
    Then User is able to see review search field on pdp page
    And User is able to see rating selector drop down btn on pdp page
    And User is able to see locale selector drop down btn on pdp page
    And User is able to see count Number for a product on pdp
    And User is able to see Add To Cart button on pdp
    When User clicks More Tab on Home Page
    And User clicks Your Profile link on Account Page
    And User scrolls down for one time
    And User clicks sign out button in Profile page
    Then User is on Welcome Page

  @ViewCartForGuestUser @FD_2860_TC5 @FD_2860_TC6 @FD_2860_TC7 @FD_2860_TC8 @FD_2860_TC10 @FD_2860_TC11
  @FD_3194_TC1 @FD_3194_TC2 @FD_3194_TC2 @FD_3194_TC3 @FD_3194_TC4 @FD_3194_TC5 @FD_3194_TC6 @FD_3194_TC7
  @FD_2860_TC4 @FD_3064_TC2 @FD_2858_TC2 @FD_2860_TC1 @FD_2860_TC2 @FD_3520_TC6 @FD_3562_TC2 @FD_3562_TC3
  @FD_3562_TC5 @FD_3064_TC3
  Scenario: Verify product details page for guest user is presented with action required
    When User clicks Continue as Guest button on Welcome Page
    And User click Continue as Guest link on popup dialog
    And User clicks Enter my Zip Code button on Enable My Location Page
    And User enters the Zipcode "23504"
    Then User is able to see Store List on Choose A Store Page
    When User selects a Store from Choose A Store Page
    And User clicks Make This My Store button on Choose Store Page
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
    Then User is able to see Guest User Header "Action Required" on View Cart
    And User is able to see Guest User Content "To add items to your cart, please log in or sign up." on View Cart
    And User is able to see close button on View Cart
    And User is able to see Guest User Login text on View Cart
    And User is able to see Guest User SignUp text on View Cart
    When User clicks close button on View Cart
    Then User is able to see Add To Cart button on pdp
    When User clicks on Add To Cart button on pdp
    And User clicks Guest User SignUp button on View Cart
    Then User is redirected to the Sign Up page
    When User clicks back button on Sign Up Page
    Then User is able to see Product details page
    When User scroll down little on More page
    And User scroll down little on More page
    And User clicks on Add To Cart button on pdp
    And User clicks Guest User Login button on View Cart
    Then User is redirected to the login page
    When User enter the login details for "ValidLoginDetails"
    Then User is able to see Product details page
    When User enter the "FD1220131" in searchBar on Home Page
    Then User is able see to Product tab on Product and Coupons listing page
    When User clicks on First Product from the List
    Then User is able to see Product details page
    When User scroll down little on More page
    And User scroll down little on More page
    Then User is able to see stock status "Limited Stock" on pdp
    And User is able to see Note Description for Limited Stock on pdp
    And User is able to see Check Nearby Stores CTA on pdp
    When User enter the "Downy April Fresh Liquid Fabric" in searchBar on Home Page
    Then User is able see to Product tab on Product and Coupons listing page
    When User clicks on First Product from the List
    Then User is able to see Product details page
    When User scroll down little on More page
    And User scroll down little on More page
    Then User is able to see PickUp address on pdp
    And User is able to see stock status "Out of Stock" on pdp
    And User is able to see Note Description for Out of Stock on pdp
    And User is not able to see quantity selector for a product on pdp
    And User is not able to see Add To Cart button on pdp
    And User is able to see Check Nearby Stores CTA on pdp
    When User clicks More Tab on Home Page
    And User clicks Your Profile link on Account Page
    And User scrolls down for one time
    And User clicks sign out button in Profile page
    Then User is on Welcome Page
