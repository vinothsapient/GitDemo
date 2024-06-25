@mobile @Standalone
Feature: Continue as a guest feature

  Background:
    Given User is on Welcome Page
    And User is able to see Family Dollar Icon on Welcome Page

  @FD_1614_TC1 @FD_1614_TC2 @FD_1614_TC3
  Scenario: You may also like Product Display Page carousel
    Given User clicks Continue as Guest button on Welcome Page
    When User click Continue as Guest link on popup dialog
    When User clicks Skip button on Enable My Location Page
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

  @FD_1523_TC1 @FD_1523_TC2 @FD_1523_TC3
  Scenario: Verify user should be able to see ratings and review pagination
    Given User clicks Continue as Guest button on Welcome Page
    When User click Continue as Guest link on popup dialog
    When User clicks Skip button on Enable My Location Page
    And User clicks Skip button on Enable My Location Page Pop Up
    And User clicks Not Now button on Keep Up to Date Page
    Then User is able to see More text on Home Page
    When User clicks More Tab on Home Page
    And User clicks Explore Product Categories Tab on More Page
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
