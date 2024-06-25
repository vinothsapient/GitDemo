@mobile @regression
Feature: Product Coupon Sorting Workflow

  Background:
    Given User is on Welcome Page
    And User is able to see Family Dollar Icon on Welcome Page
    When User clicks Log In button on Welcome Page
    And User enter the login details for "ValidLoginDetails"
    And User clicks Now Now button on Enable Biometric Login page
    And User clicks Start Saving button on Sign Up complete Page
    And User clicks Skip button on Enable My Location Page
    And User clicks Skip button on Enable My Location Page Pop Up
    And User clicks Not Now button on Keep Up to Date Page
    Then User is able to see More text on Home Page

  @CouponSortingWorkflow @FD_741_TC1 @FD_741_TC2 @FD_741_TC3 @FD_741_TC4 @FD_741_TC5 @FD_741_TC6
  @FD_741_TC7 @FD_741_TC8
  Scenario: Verify Coupon Sorting Workflow
    When User clicks Coupons Tab on Home Page
    Then User is able to see SmartCoupon Page
    When User clicks All Listed Coupon Tab on SmartCoupon Page
    And User clicks on All Coupons Link on All Listed Coupon section
    Then User is able to see Coupon sort CTA
    And User is able to see "Expiring Soon" sorted text on Coupon details Page
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
    When User clicks Account Tab on Home Page
    And User scrolls down to move bottom
    Then User is able to see sign out button in account page
    When User clicks sign out button in account page
    Then User is on Welcome Page

  @ProductSortingWorkflow @FD_740_TC1 @FD_740_TC2 @FD_740_TC3 @FD_740_TC4 @FD_740_TC5 @FD_742_TC1
  @FD_742_TC2 @FD_742_TC3 @FD_742_TC4 @FD_743_TC1 @FD_743_TC2 @FD_743_TC3 @FD_743_TC4 @FD_743_TC5
  @FD_743_TC10
  Scenario: Verify Product Sorting Workflow
    When User clicks More Tab on Home Page
    And User clicks Explore Product Categories Tab on More Page
    Then User is able to see Explore All Categories Header on Category Page
    When User clicks on "Food & Beverages" under Find Products by Category section
    And User clicks on "Breakfast" under Sub Categories Page
    Then User is able to view "Breakfast" as header on L4 Sub Categories Page
    And User is able to see Home button on Global Navigation
    And User is able to see Ads and Books button on Global Navigation
    And User is able to see Coupon button on Global Navigation
    And User is able to see Account button on Global Navigation
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
    When User clicks Account Tab on Home Page
    And User scrolls down to move bottom
    Then User is able to see sign out button in account page
    When User clicks sign out button in account page
    Then User is on Welcome Page

  @ProductReviewWorkflowForLoginUser @FD_1227_TC1 @FD_1227_TC2 @FD_1225_TC1 @FD_1225_TC2 @FD_1226_TC1
  @FD_1226_TC13
  Scenario: Verify PDP page and rating snapshot notifications for Login User
    When User clicks More Tab on Home Page
    And User clicks Explore Product Categories Tab on More Page
    Then User is able to see Explore All Categories Header on Category Page
    When User clicks on "Food & Beverages" under Find Products by Category section
    And User clicks on "Condiments & Garnishes" under Sub Categories Page
    Then User is able to see sort CTA
    When User clicks on sort CTA
    And User tap on "Most-Reviewed" radioButton from Sorting List
    And User clicks on Show Results CTA in Sorting Box
    Then User is able to view PLP product list in L4 Sub Categories Page
    And User clicks on First Product from the List
    Then User is able to see Product details page
    And User is able see to Product Title on Product details page
    And User is able see to Rating on Product details page
    And User is able see to Description on Product details page
    And User is able see to SKU on Product details page
    And User is able see to Strike Through Price on Product details page
    And User is able see to Product Description Tab on Product details page
    And User able to see you may also like section on Product details page
    And User verify Product name is displayed on you may also like for Product details Page
    And User See Minimum 2 and maximum 5 tabs showing
    When User scrolls down for one time
    Then User is able to see review search field on pdp page
    And User is able to see rating selector drop down btn on pdp page
    And User is able to see locale selector drop down btn on pdp page
    When User clicks More Tab on Home Page
    Then User is able to see Message text on More Page
    When User clicks Message button on More Page
    Then User is on Message display Page
    When User clicks Account Tab on Home Page
    And User scrolls down to move Home Page
    And User clicks sign out button in account page
    Then User is on Welcome Page
