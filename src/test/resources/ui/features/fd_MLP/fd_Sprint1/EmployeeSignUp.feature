@mobile @FamilyDollarEmployeeID @Standalone
Feature: Family Dollar Employee ID Scenarios

  Background:
    Given User is on Welcome Page
    And User clicks Sign Up button on Welcome Page

  @FD_276_TC26 @FD_255_TC2 @FD_274_TC7 @FD_1249_TC1 @FD_1249_TC2 @FD_1250_TC1 @FD_1250_TC2 @FD_1253_TC1
  Scenario: Verify Create Account CTA
    When User enters the first name "firstName"
    And User enters the last name "lastName"
    And User enters the Phone Number "6163193856"
    And User enters the email "email"
    And User enters the password "Test@123"
    And User clicks on T&C checkbox
    And User clicks Create Account button on Sign Up Page
    Then User is able to view Enter Your Verification Code Page
    And User is able to see "Send Again" text on Sign Up Page

  @FD_255_TC1 @Smoke
  Scenario: Verify Exiting Email Error in Sign Up Page
    When User enters the first name "First Name"
    And User enters the last name "Last Name"
    And User enters the zip code "11202"
    And User enters the Phone Number "9262556425"
    And User enters the email "familydollarstg@yopmail.com"
    And User enters the password "Test@123"
    Then User verify Error Message "The email address that you entered is already associated with an account. " on Sign Up Page
    And User is able to see Login link text besides Email error message
    When User clicks on Log In link present after Email error message
    Then User is redirected to the login page

  @FD_274_TC1 @FD_275_TC4
  Scenario: Verify Create Account CTA with Employee ID
    When User enters the first name "firstName"
    And User enters the last name "stg33"
    And User enters the zip code "11202"
    And User enters the Phone Number "6163193856"
    And User enters the email "fd-associate-stg33@yopmail.com"
    And User enters the password "Test@123"
    And User clicks on T&C checkbox
    And User clicks on I am a Family Dollar employee checkbox
    And User enters the Employee ID "101111033"
    And User clicks Create Account button on Sign Up Page
    Then User is able to view Enter Your Verification Code Page

  @FD_274_TC5 @FD_275_TC6
  Scenario: Verify Create Account CTA with All details along with Employee ID
    When User enters the first name "firstName"
    And User enters the last name "stg33"
    And User enters the zip code "11202"
    And User enters the Phone Number "6163193856"
    And User enters the email "fd-associate-stg33@yopmail.com"
    And User enters the password "Test@123"
    And User clicks on Promotional email checkbox
    And User clicks on T&C checkbox
    And User clicks on I am a Family Dollar employee checkbox
    And User enters the Employee ID "101111033"
    And User clicks Create Account button on Sign Up Page
    Then User is able to view Enter Your Verification Code Page

  @FD_274_TC2 @FD_274_TC3 @FD_274_TC6 @FD_274_TC12
  Scenario Outline: Verify Create Account CTA with Invalid Employee ID
    When User enters the first name "firstName"
    And User enters the last name "stg1"
    And User enters the zip code "11202"
    And User enters the Phone Number "6163193856"
    And User enters the email "email"
    And User enters the password "Test@123"
    And User clicks on T&C checkbox
    And User clicks on I am a Family Dollar employee checkbox
    And User enters the Employee ID "<EmployeeID>"
    And User clicks Create Account button on Sign Up Page
    Then User is able to see "<ErrorMessage>" text on Sign Up Page
    Examples:
      | EmployeeID | ErrorMessage                                                                                      |
      |            | If you do not have a valid Associate ID, please uncheck the employee box above                    |
      | 45573      | Please enter a valid Associate ID number                                                          |
      | 45573531*  | Please enter a valid Associate ID number                                                          |
      | 101111001  | This Associate ID is already associated with an account. Please enter another valid Associate ID. |

  @FD_274_TC4 @FD_275_TC2 @FD_275_TC3 @FD_275_TC5
  Scenario: Verify Create Account CTA with Employee ID without T&C
    When User enters the first name "firstName"
    And User enters the last name "stg33"
    And User enters the Phone Number "6163193856"
    And User enters the email "fd-associate-stg33@yopmail.com"
    And User enters the password "Test@123"
    And User clicks on Promotional email checkbox
    And User clicks on I am a Family Dollar employee checkbox
    And User enters the Employee ID "101111033"
    And User clicks Create Account button on Sign Up Page
    Then User is able to see "You must agree to the Privacy Policy, Terms & Conditions, and Smart Coupons Terms & Conditions before signing up." text on Sign Up Page
    When User clicks on T&C checkbox
    And User clicks Create Account button on Sign Up Page
    Then User is able to view Enter Your Verification Code Page

  @FD_274_TC8
  Scenario: Verify Create Account CTA with Hide UnHide of Employee ID text box
    When User enters the first name "firstName"
    And User enters the last name "lastName"
    And User enters the Phone Number "6163193856"
    And User enters the email "email"
    And User enters the password "Test@123"
    And User clicks on T&C checkbox
    And User clicks on I am a Family Dollar employee checkbox
    And User enters the Employee ID "455735389"
    And User clicks on I am a Family Dollar employee checkbox
    Then User is not able to see Family Dollar input box
    When User clicks Create Account button on Sign Up Page
    Then User is able to view Enter Your Verification Code Page

  @FD_274_TC11
  Scenario: Verify employee check box even if entire form is empty
    When User scrolls down to move bottom
    And User clicks on I am a Family Dollar employee checkbox
    And User enters the Employee ID "455735389"
    And User clicks on I am a Family Dollar employee checkbox
    Then User is not able to see Family Dollar input box
