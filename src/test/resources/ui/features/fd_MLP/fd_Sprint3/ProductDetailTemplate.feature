@mobile
Feature: Product Detail Template

  @FD_475_TC1
  Scenario: Verify PDP page header element
    Given User is on Welcome Page
    When User clicks Log In button on Welcome Page
    And User enter the login details for "ValidLoginDetails"
    And User clicks Now Now button on Enable Biometric Login page
    And User clicks Start Saving button on Sign Up complete Page
    And User clicks Skip button on Enable My Location Page
    And User clicks Skip button on Enable My Location Page Pop Up
    And User clicks Not Now button on Keep Up to Date Page
    Then User is able to see More text on Home Page
    When User clicks More Tab on Home Page
    And User clicks Explore Product Categories Tab on More Page
    Then User is able to see Explore All Categories Header on Category Page
    When User clicks on "Food & Beverages" under Find Products by Category section
    And User clicks on "Condiments & Garnishes" under Sub Categories Page
    And User clicks on First Product from the List
    Then User is able to see Product details page
    And User is able see to Back button on Product details page
    And User is able to see the search icon on Product Details Page
    And User is able to see the scanner on Product Details Page
    And User is able to see the Search Products and Coupons text default on PDP
    When User clicks back button on Product Details page
    Then User is able to view product image on L4 Sub Categories Page
    And User is able to view "Condiments & Garnishes" as header on L4 Sub Categories Page
    When User clicks Account Tab on Home Page
    And User scrolls down to move bottom
    Then User is able to see sign out button in account page
    When User clicks sign out button in account page
    Then User is on Welcome Page

  @FD_476_TC1 @FD_478_TC1 @FD_478_TC2
  Scenario: Verify PDP page for product data
    Given User is on Welcome Page
    When User clicks Log In button on Welcome Page
    And User enter the login details for "ValidLoginDetails"
    And User clicks Now Now button on Enable Biometric Login page
    And User clicks Start Saving button on Sign Up complete Page
    And User clicks Skip button on Enable My Location Page
    And User clicks Skip button on Enable My Location Page Pop Up
    And User clicks Not Now button on Keep Up to Date Page
    Then User is able to see More text on Home Page
    When User clicks More Tab on Home Page
    And User clicks Explore Product Categories Tab on More Page
    Then User is able to see Explore All Categories Header on Category Page
    When User clicks on "Food & Beverages" under Find Products by Category section
    And User clicks on "Condiments & Garnishes" under Sub Categories Page
    And User clicks on First Product from the List
    Then User is able to see Product details page
    And User is able see to Product Title on Product details page
    And User is able see to SKU on Product details page
    And User is able see to Rating on Product details page
    And User is able see to Description on Product details page
    And User is able see to Strike Through Price on Product details page
    When User scrolls down to move Home Page
    Then User is able see to Product Description Tab on Product details page
    And User is able see to Product Specifications Tab on Product details page
    And User is able see to Product Information on Product details page
    When User clicks Specifications Tab on Product Details page
    Then User is able see to Product Specifications Tab on Product details page
    When User clicks Account Tab on Home Page
    And User scrolls down to move bottom
    Then User is able to see sign out button in account page
    When User clicks sign out button in account page
    Then User is on Welcome Page

  @FD_475_TC2
  Scenario: Verify PDP page header element for guest user
    Given User is on Welcome Page
    When User clicks Continue as Guest button on Welcome Page
    And User click Continue as Guest link on popup dialog
    And User clicks Skip button on Enable My Location Page
    And User clicks Skip button on Enable My Location Page Pop Up
    And User clicks Not Now button on Keep Up to Date Page
    Then User is able to see More text on Home Page
    When User clicks More Tab on Home Page
    And User clicks Explore Product Categories Tab on More Page
    Then User is able to see Explore All Categories Header on Category Page
    When User clicks on "Food & Beverages" under Find Products by Category section
    And User clicks on "Condiments & Garnishes" under Sub Categories Page
    And User clicks on First Product from the List
    Then User is able to see Product details page
    And User is able see to Back button on Product details page
    And User is able to see the search icon on Product Details Page
    And User is able to see the scanner on Product Details Page
    And User is able to see the Search Products and Coupons text default on PDP
    When User clicks back button on Product Details page
    Then User is able to view product image on L4 Sub Categories Page
    And User is able to view "Condiments & Garnishes" as header on L4 Sub Categories Page

  @FD_476_TC2 @FD_478_TC3 @FD_478_TC4 @Standalone
  Scenario: Verify PDP page for guest user
    Given User is on Welcome Page
    When User clicks Continue as Guest button on Welcome Page
    And User click Continue as Guest link on popup dialog
    And User clicks Skip button on Enable My Location Page
    And User clicks Skip button on Enable My Location Page Pop Up
    And User clicks Not Now button on Keep Up to Date Page
    Then User is able to see More text on Home Page
    When User clicks More Tab on Home Page
    And User clicks Explore Product Categories Tab on More Page
    Then User is able to see Explore All Categories Header on Category Page
    When User clicks on "Food & Beverages" under Find Products by Category section
    And User clicks on "Condiments & Garnishes" under Sub Categories Page
    And User clicks on First Product from the List
    Then User is able to see Product details page
    And User is able see to Product Title on Product details page
    And User is able see to SKU on Product details page
    And User is able see to Rating on Product details page
    And User is able see to Description on Product details page
    And User is able see to Strike Through Price on Product details page
    When User scrolls down to move Home Page
    Then User is able see to Product Description Tab on Product details page
    And User is able see to Product Specifications Tab on Product details page
    And User is able see to Product Information on Product details page
    When User clicks Specifications Tab on Product Details page
    Then User is able see to Product Specifications Tab on Product details page

  @FD_478_TC5 @Standalone
  Scenario: Verify specification tab on PDP page for guest user
    Given User is on Welcome Page
    When User clicks Continue as Guest button on Welcome Page
    And User click Continue as Guest link on popup dialog
    And User clicks Skip button on Enable My Location Page
    And User clicks Skip button on Enable My Location Page Pop Up
    And User clicks Not Now button on Keep Up to Date Page
    Then User is able to see More text on Home Page
    When User clicks More Tab on Home Page
    And User clicks Explore Product Categories Tab on More Page
    Then User is able to see Explore All Categories Header on Category Page
    When User clicks on "Food & Beverages" under Find Products by Category section
    And User clicks on "Condiments & Garnishes" under Sub Categories Page
    And User clicks on First Product from the List
    And User scroll to "Specifications" field of page
    And User clicks Specifications Tab on Product Details page
    And User verifies Specifications Tab columns counts are present on Product Details page

  @FD_478_TC6 @Standalone
  Scenario: Verify PDP page for specification data fields
    Given User is on Welcome Page
    When User clicks Log In button on Welcome Page
    And User enter the login details for "ValidLoginDetails"
    And User clicks Now Now button on Enable Biometric Login page
    And User clicks Start Saving button on Sign Up complete Page
    And User clicks Skip button on Enable My Location Page
    And User clicks Skip button on Enable My Location Page Pop Up
    And User clicks Not Now button on Keep Up to Date Page
    Then User is able to see More text on Home Page
    When User clicks More Tab on Home Page
    And User clicks Explore Product Categories Tab on More Page
    Then User is able to see Explore All Categories Header on Category Page
    When User clicks on "Food & Beverages" under Find Products by Category section
    And User clicks on "Condiments & Garnishes" under Sub Categories Page
    And User clicks on First Product from the List
    And User scroll to "Specifications" field of page
    And User clicks Specifications Tab on Product Details page
    And User verifies Specifications Tab columns counts are present on Product Details page
    When User clicks Account Tab on Home Page
    And User scrolls down to move bottom
    Then User is able to see sign out button in account page
    When User clicks sign out button in account page
    Then User is on Welcome Page



  @FD_1614_TC1 @FD_1614_TC2 @FD_1614_TC3 @Standalone
  Scenario: You may also like Product Display Page carousel
    Given User is on Welcome Page
    When User clicks Log In button on Welcome Page
    And User enter the login details for "ValidLoginDetails"
    And User clicks Now Now button on Enable Biometric Login page
    And User clicks Start Saving button on Sign Up complete Page
    And User clicks Skip button on Enable My Location Page
    And User clicks Skip button on Enable My Location Page Pop Up
    And User clicks Not Now button on Keep Up to Date Page
    Then User is able to see More text on Home Page
    When User clicks More Tab on Home Page
    And User clicks Explore Product Categories Tab on More Page
    Then User is able to see Explore All Categories Header on Category Page
    When User clicks on "Food & Beverages" under Find Products by Category section
    And User clicks on "Condiments & Garnishes" under Sub Categories Page
    And User clicks on First Product from the List
    Then User is able to see Product details page
    And User is able see to Product Title on Product details page
    When User scrolls down to move Home Page
    Then User is able see to Product Description Tab on Product details page
    Then User able to see you may also like section on Product details page
    And User See Minimum 2 and maximum 5 tabs showing
    And User verify Product name is displayed on you may also like for Product details Page
    And User verify each product showing price in carousel
    When User clicks Account Tab on Home Page
    And User scrolls down to move bottom
    Then User is able to see sign out button in account page
    When User clicks sign out button in account page
    Then User is on Welcome Page



  @FD_1523_TC1 @FD_1523_TC2 @FD_1523_TC3 @Standalone
  Scenario: Verify user should be able to see ratings and review pagination
    Given User is on Welcome Page
    When User clicks Log In button on Welcome Page
    And User enter the login details for "ValidLoginDetails"
    And User clicks Now Now button on Enable Biometric Login page
    And User clicks Start Saving button on Sign Up complete Page
    And User clicks Skip button on Enable My Location Page
    And User clicks Skip button on Enable My Location Page Pop Up
    And User clicks Not Now button on Keep Up to Date Page
    Then User is able to see More text on Home Page
    When User clicks More Tab on Home Page
    Then User is able to see Explore All Categories Header on Category Page
    When User clicks on "Food & Beverages" under Find Products by Category section
    And User clicks on "All Food & Beverages Products" under Sub Categories Page
    Then User is able to view PLP product list in L4 Sub Categories Page
    And User is able to see sort CTA
    When User clicks on sort CTA
    When User tap on "Most-Reviewed" radioButton from Sorting List
    And User clicks on Show Results CTA in Sorting Box
    Then User is able to view PLP product list in L4 Sub Categories Page
    And User clicks on First Product from the List
    Then User is able to see Product details page
    When User scroll to "Sort by" field of page
    Then User verify 1-8 of and Reviews Present
    When User scrolls down to move bottom
    Then User verify previous and next button present
    When User tap on next review Button
    Then User verify 1-8 of and Reviews Present
    When User clicks Account Tab on Home Page
    And User scrolls down to move bottom
    Then User is able to see sign out button in account page
    When User clicks sign out button in account page
    Then User is on Welcome Page