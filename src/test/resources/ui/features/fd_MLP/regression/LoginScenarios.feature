@mobile @regression
Feature: Login User Workflow

  Background:
    Given User is on Welcome Page

  @FD_299_TC2 @FD_299_TC3 @FD_299_TC4 @FD_299_TC5 @FD_299_TC6 @FD_299_TC7 @FD_299_TC8 @FD_299_TC12
  @FD_299_TC13 @FD_1910_TC1
  Scenario: Login Page validation flow for different Scenarios
    When User clicks Log In button on Welcome Page
    Then User is redirected to the login page
    When User enters password on Login Page "Test@123"
    Then User is able to see default entered character as Astrix
    When User clicks on eye button inside the password input box
    And User is able to see Password "Test@123" on Login Page
    When User clicks on eye button inside the password input box
    Then User is able to see default entered character as Astrix
    And User is able to see back button on Login Page
    When User clicks back button on Login Page
    And User clicks Log In button on Welcome Page
    And User enter the login details for "ValidEmailWrongPassword"
    Then User verify Error Message "Your email and password combination didn’t match our records. Please try again." on Login Page
    When User clicks back button on Login Page
    And User clicks Log In button on Welcome Page
    And User enter the login details for "ValidPasswordWrongEmail"
    Then User verify Error Message "Your email and password combination didn’t match our records. Please try again." on Login Page
    When User clicks back button on Login Page
    And User clicks Log In button on Welcome Page
    And User enter the login details for "EmptyEmail"
    Then User verify Error Message "Please enter your email address" on Login Page
    When User clicks back button on Login Page
    And User clicks Log In button on Welcome Page
    And User enter the login details for "EmptyPassword"
    Then User verify Error Message "Please enter your password" on Login Page
    When User clicks back button on Login Page
    And User clicks Log In button on Welcome Page
    And User enter the login details for "InValidLoginDetails"
    Then User verify Error Message "This email address is not valid. Remember to include the \"@\" and a domain." on Login Page
    When User clicks Sign Up button on Login Page
    Then User is redirected to the Sign Up page

  @FD_227_TC1 @FD_227_TC2 @FD_227_TC3 @FD_227_TC4 @FD_227_TC5 @FD_227_TC6 @FD_227_TC7 @FD_227_TC8
  Scenario: Family Dollar Password Recovery Scenarios
    When User clicks Log In button on Welcome Page
    And User clicks on Forget Password Link on Login Page
    Then User is redirected to the Reset Password Page
    And User is able to see Reset Your Password text on Reset Password Page
    And User is able to see Reset Password Body on Reset Password Page
    And User is able to see Email Text on Reset Password Page
    And User is able to see Email input box on Reset Password Page
    And User is able to see Remember your password Text on Reset Password Page
    And User is able to see Log In Link text on Reset Password Page
    And User is able to see Send Me a Recovery Link on Reset Password Page
    And User is able to see back button on Reset Password Page
    When User input "registeredEmailId" in Email input on Reset Password Page
    And User clicks on Send Me a Recovery Link on Reset Password Page
    Then User is redirected to Recovery Link sent Page
    And User is able to see Close button on Reset Password Page
    And User is able to see "Thank You !" text on Reset Password Page
    And User is able to see "If your email address is registered to an account, you will receive a confirmation link to reset your password." text on Reset Password Page
    And User is able to see "Return To Sign In" text on Reset Password Page
    When User clicks on Return To Login Link on Recovery Link Sent Page
    Then User is redirected to the login page
    And User clicks on Forget Password Link on Login Page
    Then User is redirected to the Reset Password Page
    When User input "nonRegisteredEmailId" in Email input on Reset Password Page
    And User clicks on Send Me a Recovery Link on Reset Password Page
    Then User is redirected to Recovery Link sent Page
    And User is able to see "Thank You !" text on Reset Password Page
    When User clicks on Return To Login Link on Recovery Link Sent Page
    Then User is redirected to the login page
    And User clicks on Forget Password Link on Login Page
    Then User is redirected to the Reset Password Page
    And User is able to see back button on Reset Password Page
    When User input "registeredEmailId" in Email input on Reset Password Page
    And User clicks Back button on Reset Password Page
    Then User is redirected to the login page
    And User clicks on Forget Password Link on Login Page
    Then User is redirected to the Reset Password Page
    When User input "emailIdWithSpaces" in Email input on Reset Password Page
    And User clicks on Send Me a Recovery Link on Reset Password Page
    Then User is redirected to Recovery Link sent Page
    And User is able to see "Thank You !" text on Reset Password Page
    When User clicks on Return To Login Link on Recovery Link Sent Page
    Then User is redirected to the login page
    When User clicks on Forget Password Link on Login Page
    Then User is redirected to the Reset Password Page
    When User input "wrongEmailFormat" in Email input on Reset Password Page
    And User clicks on Send Me a Recovery Link on Reset Password Page
    Then User is able to see Error Message for "This email address is not valid. Remember to include the \"@\" and a domain."
    When User input "emptyEmail" in Email input on Reset Password Page
    And User clicks on Send Me a Recovery Link on Reset Password Page
    Then User is able to see Error Message for "Please enter your email address"
    When User clicks Log In button on Reset Password Page
    Then User is redirected to the login page

  @FD_276_TC1 @FD_276_TC2 @FD_276_TC4 @FD_276_TC5 @FD_276_TC6 @FD_276_TC7 @FD_276_TC8 @FD_276_TC9
  @FD_276_TC12 @FD_276_TC14 @FD_276_TC17 @FD_276_TC18 @FD_276_TC24 @FD_276_TC25 @FD_275_TC1
  @FD_277_TC8 @FD_254_TC3 @FD_254_TC4 @FD_254_TC6 @FD_1248_TC1
  Scenario: Signup flow Validations
    Given User is on Welcome Page
    When User clicks Sign Up button on Welcome Page
    Then User is redirected to the Sign Up page
    And User is able to see back button on Sign Up Page
    When User clicks back button on Sign Up Page
    Then User is on Welcome Page
    When User clicks Sign Up button on Welcome Page
    And User is able to see Family Dollar Icon on Sign Up Page
    And User is able to see Continue as Guest button on Sign Up Page
    When User clicks Continue as Guest button on Sign Up Page
    Then User is able to see Tailored Landing screen for guests
    And User verify Sign Up Now link text on Continue As Guest popup dialog
    When User click Sign Up Now link on popup dialog
    Then User is on Sign Up page
    And User is able to see Sign Up Header text on Sign Up Page
    And User is able to see Sign Up Header Sub text on Sign Up Page
    And User is able to see Sign In text on Sign Up Page
    And User is able to see bulb icon on Sign Up Page
    And User is able to see FD Tip text on Sign Up Page
    And User is able to see FD Tip Description text on Sign Up Page
    When User clicks Log In button on Sign Up Page
    Then User is redirected to the login page
    When User clicks Sign Up button on Welcome Page
    And User is able to see First Name text on Sign Up Page
    And User is able to see First Name input box on Sign Up Page
    And User is able to see Last Name text on Sign Up Page
    And User is able to see Last Name input box on Sign Up Page
    And User is able to see Zip Code text on Sign Up Page
    And User is able to see Zip Code input box on Sign Up Page
    And User is able to see Phone Number text on Sign Up Page
    And User is able to see Phone Number input box on Sign Up Page
    And User is able to see Email text on Sign Up Page
    And User is able to see Email input box on Sign Up Page
    And User is able to see Password text on Sign Up Page
    And User scrolls down for one time
    And User is able to see Password input box on Sign Up Page
    And User is able to see eye image inside the password input box
    When User enters the password "Test@123"
    Then User is able to see default entered character as Astrix
    When User clicks on eye button inside the password input box
    And User is able to see Password "Test@123" on Sign Up Page
    When User clicks on eye button inside the password input box
    Then User is able to see default entered character as Astrix
    When User scrolls down to move bottom
    Then User is able to see "Password must contain:" text on Sign Up Page
    And User is able to see "At least 8 characters" text on Sign Up Page
    And User is able to see "One uppercase alphabetic character" text on Sign Up Page
    And User is able to see "One number (1, 2, 3, 4 ...)" text on Sign Up Page
    And User is able to see "One special character (![]`@$%^&*()-_=+;:’,<.>/?)" text on Sign Up Page
    And User is able to see Password character check icon
    And User is able to see Password Alphabet check icon
    And User is able to see Password Number check icon
    And User is able to see Password Special Character check icon
    Then User is able to see "I want to receive news and promotions emails from Family Dollar" text on Sign Up Page
    And User is able to see "I agree to the following: " text on Sign Up Page
    And User is able to see "Privacy Policy," text on Sign Up Page
    And User is able to see "Terms & Conditions," text on Sign Up Page
    And User is able to see " and " text on Sign Up Page
    And User is able to see "Smart Coupons Terms & Conditions" text on Sign Up Page
    And User is able to see "I am a Family Dollar employee" text on Sign Up Page
    And User is able to see News Letter checkbox
    And User is able to see Privacy Policy checkbox
    And User is able to see Dollar Employee checkbox
    When User clicks on I am a Family Dollar employee checkbox
    Then User is able to see "Employee ID#" text on Sign Up Page
    And User is able to see Employee ID input box on Sign Up Page
    And User is able to see "Create Account" text on Sign Up Page

  @FD_276_TC10 @FD_276_TC11 @FD_276_T13 @FD_276_T15 @FD_276_TC16 @FD_1375_TC5
  Scenario Outline: Verify Error Message for Sign up with different scenarios
    When User clicks Sign Up button on Welcome Page
    When User enters the first name "<FirstName>"
    And User enters the last name "<LastName>"
    And User enters the zip code "11202"
    And User enters the Phone Number "<PhoneNumber>"
    And User enters the email "<Email>"
    And User enters the password "<Password>"
    And User clicks on T&C checkbox
    And User clicks Create Account button on Sign Up Page
    Then User verify Error Message "<ErrorMessage>" on Sign Up Page
    Examples:
      | FirstName  | LastName  | PhoneNumber | Email              | Password | ErrorMessage                                                                 |
      |            | Last Name | 9262556425  | abc123@yopmail.com | Test@123 | First name is required                                                       |
      | First Name |           | 9262556425  | abc123@yopmail.com | Test@123 | Last name is required                                                        |
      | First Name | Last Name |             | abc123@yopmail.com | Test@123 | Phone number is required                                                     |
      | First Name | Last Name | 9262556425  |                    | Test@123 | Email address is required                                                    |
      | First Name | Last Name | 9262556425  | abc123@yopmail.com |          | Password is required                                                         |
      | First Name | Last Name | 9262556425  | abc123mail         | Test@123 | This email address is not valid. Remember to include the \"@\" and a domain. |

  Scenario: Verify Create Account CTA with All details along with Employee ID
    When User clicks Sign Up button on Welcome Page
    When User enters the first name "firstName"
    And User enters the last name "stg1"
    And User enters the zip code "11202"
    And User enters the Phone Number "9262556425"
    And User enters the email "fd-associate-stg1@yopmail.com"
    And User enters the password "Test@123"
    And User clicks on T&C checkbox
    And User clicks on I am a Family Dollar employee checkbox
    And User enters the Employee ID "101111001"
    Then User is able to see "You can now log in to Family Dollar using your existing account with DollarTree." text on Sign Up Page

  Scenario: Profile Settings Feature
    When User clicks Log In button on Welcome Page
    And User enter the login details for "ValidLoginDetails"
    And User clicks Now Now button on Enable Biometric Login page
    And User clicks Start Saving button on Sign Up complete Page
    And User clicks Skip button on Enable My Location Page
    And User clicks Skip button on Enable My Location Page Pop Up
    And User clicks Not Now button on Keep Up to Date Page
    Then User is able to see Account text on Home Page
    When User clicks Account Tab on Home Page
    Then User move to Account Page
    When User clicks Edit button on Account Page
    And User is able to see Date of Birth text on Profile Page
    And User is able to see ZIP Code text on Profile Page
    And User is able to see "Profile" text on Profile Page
    And User is able to see Personal Information text on Profile Page
    And User verify Back Button is present on Profile Page
    When User is able to see Name button on Profile Page
    When User clicks Name button on Profile Page
    And User is able to see "First Name" text on Profile Page
    And User is able to see "Last Name" text on Profile Page
    And User is able to see Save button on Profile PopUp Page
    And User is able to see close button on Profile PopUp Page
    When User enters "Jon" in First Name Edit input box
    And User enters "Taylor" in Last Name Edit input box
    And User clicks on Save button on Profile Update Page
    When User clicks OK button on Profile PopUp Page
    When User clicks Name button on Profile Page
    And User enters "Family" in First Name Edit input box
    And User enters "Dollar" in Last Name Edit input box
    And User clicks on Save button on Profile Update Page
    When User clicks OK button on Profile PopUp Page
    When User clicks Account Tab on Home Page
    When User scrolls down to move Home Page
    When User clicks sign out button in account page
    Then User is on Welcome Page
