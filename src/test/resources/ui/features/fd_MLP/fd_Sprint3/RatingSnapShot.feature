Feature: Rating snapshot

  @FD_479_TC1 @FD_479_TC2 @FD_479_TC3 @Standalone
  Scenario: Verify PDP page rating snapshots scenarios
    Given User is on Welcome Page
    When User clicks Log In button on Welcome Page
    And User enter the login details for "ValidLoginDetails"
    And User clicks Now Now button on Enable Biometric Login page
    And User clicks Start Saving button on Sign Up complete Page
    And User clicks Skip button on Enable My Location Page
    And User clicks Skip button on Enable My Location Page Pop Up
    And User clicks Not Now button on Keep Up to Date Page
    When User clicks More Tab on Home Page
    And User clicks Explore Product Categories Tab on More Page
    Then User is able to see Explore All Categories Header on Category Page
    When User clicks on "Food & Beverages" under Find Products by Category section
    And User clicks on "Condiments & Garnishes" under Sub Categories Page
    And User clicks on First Product from the List
    And User scroll to "Ratings snapshots" field of page
    And User is able to see rating snapshot header on pdp page
    And User is able to see overall rating on pdp page
    And User scroll to "Search topics and reviews" field of page
    And User is able to see five rating fields on pdp page
    And User is able to see review search field on pdp page
    And User is able to see rating selector drop down btn on pdp page
    And User is able to see locale selector drop down btn on pdp page
    And User enter value "product" review search field on pdp page
    And User clicks enter button on page
    And User select "fdh" rating selector drop down btn on pdp page
    When User clicks Account Tab on Home Page
    And User scrolls down to move bottom
    Then User is able to see sign out button in account page
    When User clicks sign out button in account page
    Then User is on Welcome Page
