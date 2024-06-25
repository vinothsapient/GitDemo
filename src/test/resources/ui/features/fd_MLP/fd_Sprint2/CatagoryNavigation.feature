@mobile
Feature: Category Navigation Feature

  Background:
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

  @FD_473_TC1 @FD_473_TC2 @FD_473_TC5 @FD_473_TC6 @FD_473_TC7 @FD_471_TC1
  Scenario: Verify Explore All Categories title on the Main categories navigation page
    And User is able to see a Horizontally separated line after Explore All Categories title
    And User is able to see "Featured" text on Category Page
    And User is able to see "Find Products by Category" text on Category Page
    And User is able to see Featured section list in Alphabetical order
    And User is able to see Find Products by Category section list in Alphabetical order
    When User clicks Account Tab on Home Page
    And User scrolls down to move bottom
    Then User is able to see sign out button in account page
    When User clicks sign out button in account page
    Then User is on Welcome Page

  @FD_473_TC3 @FD_471_TC2
  Scenario: Verify search icon on the Main categories navigation page
    And User is able to view search icon on Category Page
    When User clicks on search icon Category Page
    Then User is able to enter text for a global search
    When User clicks Account Tab on Home Page
    And User scrolls down to move bottom
    Then User is able to see sign out button in account page
    When User clicks sign out button in account page
    Then User is on Welcome Page

  @FD_473_TC4
  Scenario: Verify back button on the Main categories navigation page
    And User is able to view back button on Category Page
    When User clicks on back button on Category Page
    Then User is able to see Explore Product Categories text on More Page
    When User clicks Account Tab on Home Page
    And User scrolls down to move bottom
    Then User is able to see sign out button in account page
    When User clicks sign out button in account page
    Then User is on Welcome Page

  @FD_473_TC11 @FD_473_TC12 @FD_471_TC4 @FD_471_TC5 @FD_474_TC12
  Scenario: Verify Find Products by Category section with drilled down view
    And User is able to view drilled down arrow beside Product of Featured section
    And User is able to view drilled down arrow beside Product of Find Products by Category section
    When User scrolls down to move Home Page
    And User clicks on "Cleaning" under Find Products by Category section
    Then User is able to view "Cleaning" as header on drill down page
    When User clicks Account Tab on Home Page
    And User scrolls down to move bottom
    Then User is able to see sign out button in account page
    When User clicks sign out button in account page
    Then User is on Welcome Page

  @FD_472_TC1 @FD_474_TC1
  Scenario: Verify Sub Category product (L3) when any product selected on Find Products by Category section
    And User is able to see "Beauty" text on Category Page
    When User clicks on "Beauty" under Find Products by Category section
    Then User is able to view "Beauty" as header on Sub Categories Page
    And User is able to view "Skincare" under Sub Categories Page
    When User clicks Account Tab on Home Page
    And User scrolls down to move bottom
    Then User is able to see sign out button in account page
    When User clicks sign out button in account page
    Then User is on Welcome Page

  @FD_472_TC2 @FD_472_TC3 @FD_472_TC4 @FD_472_TC6 @FD_472_TC7 @FD_472_TC8 @FD_472_TC12 @FD_474_TC4 @FD_474_TC8 @FD_474_TC11
  Scenario: Verify Sub Category (L4) product when any product selected on Find Products by Category section
    When User scrolls down to move Home Page
    Then User is able to see "Cleaning" text on Category Page
    When User clicks on "Cleaning" under Find Products by Category section
    Then User is able to view "Cleaning" as header on Sub Categories Page
    And User is able to view "Air Fresheners" under Sub Categories Page
    When User clicks on "Air Fresheners" under Sub Categories Page
    Then User is able to view "Air Fresheners" as header on L4 Sub Categories Page
    And User is able to view PLP product list in L4 Sub Categories Page
    And User is able to view All Categories under L4 Sub Categories Page
    And User is able to view total number of products searched on L4 Sub Categories Page
    And User is able to view back button on Category Page
    When User clicks on back button on Category Page
    Then User is able to view "Cleaning" as header on Sub Categories Page
    When User clicks Account Tab on Home Page
    And User scrolls down to move bottom
    Then User is able to see sign out button in account page
    When User clicks sign out button in account page
    Then User is on Welcome Page

  @FD_474_TC5 @FD_474_TC6 @FD_474_TC7 @FD_474_TC9 @FD_471_TC3
  Scenario: Verify the user is directed to Explore by category section from All cleaning Products
    When User scrolls down to move Home Page
    Then User is able to see "Cleaning" text on Category Page
    When User clicks on "Cleaning" under Find Products by Category section
    Then User is able to view "Cleaning" as header on Sub Categories Page
    And User is able to view "Air Fresheners" under Sub Categories Page
    When User clicks on "Air Fresheners" under Sub Categories Page
    Then User is able to view "Air Fresheners" as header on L4 Sub Categories Page
    And User is able to view "Explore By Category" under L4 Sub Categories Page
    And User is able to view product image on L4 Sub Categories Page
    When User clicks on All Categories under L4 Sub Categories Page
    Then User is able to see Explore All Categories Header on Category Page
    When User clicks Account Tab on Home Page
    And User scrolls down to move bottom
    Then User is able to see sign out button in account page
    When User clicks sign out button in account page
    Then User is on Welcome Page
