@mobile
Feature: Defects Automation

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

  @ProductSortingWorkflow
  Scenario: Defects Validation
    When User clicks More Tab on Home Page
    And User clicks Explore Product Categories Tab on More Page
    Then User is able to see Explore All Categories Header on Category Page
    When User clicks on "Cleaning" under Find Products by Category section
    And User clicks on "Air Fresheners" under Sub Categories Page
    And User clicks on Second Product from the List
    And User is able to see Out of stock product on Plp Page
    And User is able to see IN Store Only on Plp Page
    And User will click back button on PDP Page
    And User clicks on First Product from the List
    When User scroll to "Product Description" field of page
    When User scroll to "You Might Also Like" field of page
    When User scroll down little on home page
    And User scroll to "Ratings snapshots" field of page
    And User scroll to "Search topics and reviews" field of page
    And User scrolls down for one time
    And User is able to see review search field on pdp page
    And User is able to see rating selector drop down btn on pdp page
    And User is able to see locale selector drop down btn on pdp page
    And User clicks on relevancy info tooltip on Pdp Page
    And User will click back button on PDP Page
    And User will click back button on Category Page
    And User will click back button on Category Page
    When User clicks on "Food & Beverages" under Find Products by Category section
    And User clicks on "Beverages" under Sub Categories Page
    When User clicks on filter CTA
    When User tap on "Product Availability" from Filters List
    And User is able to view "Select an option Online" under L4 Sub Categories Page
    And User is able to view "Select an option In-Store Only" under L4 Sub Categories Page
    And User will click back button add on Product Availability filter
    And User will click cross Icon on filter
    When User clicks on sort CTA
    When User tap on "Most-Reviewed" radioButton from Sorting List
    And User clicks on Show Results CTA in Sorting Box
    When User clicks on filter CTA
    When User tap on "Product Availability" from Filters List
