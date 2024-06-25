@mobile
Feature: Preferred Store Feature

  Background:
    Given User is on Welcome Page
    And User is able to see Family Dollar Icon on Welcome Page

  @FD_267_TC1 @FD_267_TC2 @FD_266_TC2 @PreferredStorePage
  Scenario: To verify that user is able to see the List view and Map view
    When User clicks Log In button on Welcome Page
    And User enter the login details for "ValidLoginDetails"
    And User clicks Now Now button on Enable Biometric Login page
    And User clicks Start Saving button on Sign Up complete Page
    Then User is able to see "Enable My Location" text on Enable My Location Page
    When User clicks "Share My Location" button on Enable My Location Page
    And User clicks "Only this time" button on Device Location pop up
    Then User is able to see "List View" text on Choose a Store Page
    When User clicks "List View" button on Choose a Store Page
    And User clicks "Map View" button on Choose a Store Page
    When User clicks Account Tab on Home Page
    And User scrolls down to move bottom
    Then User is able to see sign out button in account page
    When User clicks sign out button in account page
    Then User is on Welcome Page

  @FD_266_TC1 @PreferredStorePage
  Scenario: To verify that when user clicks on Enter my Zip Code button user should be landed on Choose A Store page.
    When User clicks Log In button on Welcome Page
    And User enter the login details for "ValidLoginDetails"
    And User clicks Now Now button on Enable Biometric Login page
    And User clicks Start Saving button on Sign Up complete Page
    Then User is able to see "Enable My Location" text on Enable My Location Page
    When User clicks Enter my Zip Code button on Enable My Location Page
    And User clicks Enable Location Services button on Choose a Store Page
    When User clicks Account Tab on Home Page
    And User scrolls down to move bottom
    Then User is able to see sign out button in account page
    When User clicks sign out button in account page
    Then User is on Welcome Page

  @FD_266_TC2 @PreferredStorePage
  Scenario: To verify that user should be able to search the stores by using valid city ,zip code and State name
    When User clicks Log In button on Welcome Page
    And User enter the login details for "ValidLoginDetails"
    And User clicks Now Now button on Enable Biometric Login page
    And User clicks Start Saving button on Sign Up complete Page
    Then User is able to see "Enable My Location" text on Enable My Location Page
    When User clicks Enter my Zip Code button on Enable My Location Page
    And User enters the city "chesapeake"
    When User clicks Account Tab on Home Page
    And User scrolls down to move bottom
    Then User is able to see sign out button in account page
    When User clicks sign out button in account page
    Then User is on Welcome Page

  @FD_268_TC1 @PreferredStorePage @FD_265_TC11
  Scenario: To verify that when a user clicks on information icon of the store in Nearby Stores list user should get navigated to Store Details page
    When User clicks Log In button on Welcome Page
    And User enter the login details for "ValidLoginDetails"
    And User clicks Now Now button on Enable Biometric Login page
    And User clicks Start Saving button on Sign Up complete Page
    Then User is able to see "Enable My Location" text on Enable My Location Page
    When User clicks Enter my Zip Code button on Enable My Location Page
    And User enters the city "chesapeake"
    And User clicks "List View" button on Choose a Store Page
    And User clicks on storeDetails
    Then User is able to see "Store Details" text on storeDetails
    And User is able to see "Store Amenities" text on storeDetails
    And User is able to see "Get Directions" text on storeDetails
    And User is able to see "Call Store" text on storeDetails
    And User clicks Make This My Store button on storeDetails
    When User clicks Account Tab on Home Page
    And User scrolls down to move bottom
    Then User is able to see sign out button in account page
    When User clicks sign out button in account page
    Then User is on Welcome Page

  @FD_265_TC1 @FD_265_TC2 @FD_265_TC3
  Scenario: Verify Enable my location screen after clicking on Start saving button on Welcome to the Family Page
    When User clicks Log In button on Welcome Page
    And User enter the login details for "ValidLoginDetails"
    And User clicks Now Now button on Enable Biometric Login page
    And User clicks Start Saving button on Sign Up complete Page
    Then User is able to see "Enable My Location" text on Enable My Location Page
    And User is able to see Family Dollar Icon on Sign Up Page
    When User clicks Skip button on Enable My Location Page
    Then User is able to see "Are you sure?" text on Enable My Location Page
    When User clicks Skip button on Enable My Location Page Pop Up
    Then User is able to see "Enable Notifications" text on Enable Notification Page
    When User clicks Account Tab on Home Page
    And User scrolls down to move bottom
    Then User is able to see sign out button in account page
    When User clicks sign out button in account page
    Then User is on Welcome Page

  @FD_265_TC4 @FD_265_TC5 @FD_265_TC6 @FD_265_TC7 @FD_266_TC2
  Scenario: Verify Enable my location sub text
    When User clicks Log In button on Welcome Page
    And User enter the login details for "ValidLoginDetails"
    And User clicks Now Now button on Enable Biometric Login page
    And User clicks Start Saving button on Sign Up complete Page
    Then User is able to see "Enable My Location" text on Enable My Location Page
    When User clicks Skip button on Enable My Location Page
    Then User is able to see "Are you sure?" text on Enable My Location Page
    When User clicks "Set Location Settings" button on Enable My Location Page
    Then User is able to see "Enable My Location" text on Enable My Location Page
    And User is able to see "Family Dollar works way better with location services on." text on Enable My Location Page
    And User is able to see "Family Dollar receives your location when you’re using the app to highlight savings in your area." text on Enable My Location Page
    And User is able to see "You can adjust your location settings any time." text on Enable My Location Page
    When User clicks Account Tab on Home Page
    And User scrolls down to move bottom
    Then User is able to see sign out button in account page
    When User clicks sign out button in account page
    Then User is on Welcome Page

  @FD_265_TC8 @FD_265_TC10 @FD_265_TC14 @FD_266_TC3
  Scenario: Verify Enter my Zip Code sub text
    When User clicks Log In button on Welcome Page
    And User enter the login details for "ValidLoginDetails"
    And User clicks Now Now button on Enable Biometric Login page
    And User clicks Start Saving button on Sign Up complete Page
    Then User is able to see "Enable My Location" text on Enable My Location Page
    When User clicks Skip button on Enable My Location Page
    Then User is able to see "Are you sure?" text on Enable My Location Page
    When User click close button on Sign up popup dialog
    Then User is able to see "Enable My Location" text on Enable My Location Page
    When User clicks Enter my Zip Code button on Enable My Location Page
    Then User is able to see Location icon on Choose A Store Page
    And User is able to see "Choose A Store" text on Choose a Store Page
    And User is able to see Enter Zip Code State text on Enable My Location Page
    And User is able to see "If you allow us to use your location, we can help find your closest Family Dollar store location." text on Enable My Location Page
    When User clicks Account Tab on Home Page
    And User scrolls down to move bottom
    Then User is able to see sign out button in account page
    When User clicks sign out button in account page
    Then User is on Welcome Page

  @FD_1393_TC1 @FD_1393_TC2
  Scenario: Verify Guest User navigates to choose a store window
    When User clicks Continue as Guest button on Welcome Page
    And User click Continue as Guest link on popup dialog
    When User clicks Enter my Zip Code button on Enable My Location Page
    And User is able to see "Choose A Store" text on Choose a Store Page
    Then User is able to see "List View" text on Choose a Store Page
    When User clicks "List View" button on Choose a Store Page
    And User clicks "Map View" button on Choose a Store Page
    And User clicks "Enable Location Services" button on Choose a Store Page

  @FD_1393_TC3
  Scenario: Verify User able to input zipcode and see related zipcode store list
    When User clicks Continue as Guest button on Welcome Page
    And User click Continue as Guest link on popup dialog
    When User clicks Enter my Zip Code button on Enable My Location Page
    And User enters the Zipcode "11202"
    And User clicks "List View" button on Choose a Store Page
    When User clicks Make This My Store button on Choose Store Page
    And User clicks Not Now button on Keep Up to Date Page
    Then User is able to see Home text on Home Page

  @FD_1393_TC6
  Scenario: Verify User able to select store from search listing page
    When User clicks Continue as Guest button on Welcome Page
    And User click Continue as Guest link on popup dialog
    When User clicks Enter my Zip Code button on Enable My Location Page
    And User enters the Zipcode "11202"
    And User clicks "List View" button on Choose a Store Page
    When User clicks Make This My Store button on Choose Store Page
    And User clicks Not Now button on Keep Up to Date Page
    Then User is able to see Home text on Home Page
    When User clicks More Tab on Home Page
    And User clicks on View My store details
    Then User is able to see "Store Details" text on storeDetails

  @FD_1393_TC4
  Scenario: Choose a Store from home page
    When User clicks Continue as Guest button on Welcome Page
    And User click Continue as Guest link on popup dialog
    When User clicks Enter my Zip Code button on Enable My Location Page
    And User enters the Zipcode "11202"
    And User clicks "List View" button on Choose a Store Page
    When User clicks Make This My Store button on Choose Store Page
    And User clicks Not Now button on Keep Up to Date Page
    Then User is able to see Home text on Home Page
    When User drag and drop to down on Home Page
    And User scrolls down to move Home Page
    When User drag and drop to down on Home Page
    Then User is able to see Store details on Home Page
