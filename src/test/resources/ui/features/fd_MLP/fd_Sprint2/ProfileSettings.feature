@mobile @Standalone
Feature: Profile Settings Feature

  Background:
    Given User is on Welcome Page
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

  @FD_481_TC1 @FD_481_TC2 @FD_481_TC3 @FD_481_TC4 @Smoke
  Scenario: User navigate to Profile Edit Screen
    When User clicks Edit button on Account Page
    Then User is able to see Profile header text on Profile Page
    And User is able to see "Name" text on Profile Page
    And User is able to see "Family Dollar" text on Profile Page
    And User verify Back Button is present on Profile Page
    When User clicks "Name" button on Profile Page
    Then User is able to see "Name" text on Profile PopUp Page
    And User is able to see "First Name" text on Profile PopUp Page
    And User is able to see "Last Name" text on Profile PopUp Page
    And User is able to see First Name Text "Family" In Edit Input Box
    And User is able to see Last Name Text "Dollar" In Edit Input Box
    And User is able to see Save button on Profile PopUp Page
    And User is able to see close button on Profile PopUp Page
    When User enters "Jon" in First Name Edit input box
    And User enters "Taylor" in Last Name Edit input box
    And User clicks on Save button on Profile Update Page
    Then User is able to see "Updated successfully" text on Profile PopUp Page
    When User clicks OK button on Profile PopUp Page
    Then User is able to see "Jon Taylor" text on Profile Page
    When User clicks "Name" button on Profile Page
    And User enters "Family" in First Name Edit input box
    And User enters "Dollar" in Last Name Edit input box
    And User clicks on Save button on Profile Update Page
    Then User is able to see "Updated successfully" text on Profile PopUp Page
    When User clicks OK button on Profile PopUp Page
    Then User is able to see "Family Dollar" text on Profile Page
    When User clicks Account Tab on Home Page
    And User scrolls down to move bottom
    Then User is able to see sign out button in account page
    When User clicks sign out button in account page
    Then User is on Welcome Page

  @FD_481_TC5 @FD_481_TC6 @FD_481_TC7
  Scenario: Verify Edit name and cancel edit
    When User clicks Edit button on Account Page
    Then User is able to see Profile header text on Profile Page
    And User is able to see "Family Dollar" text on Profile Page
    When User clicks "Name" button on Profile Page
    And User enters "Jon" in First Name Edit input box
    And User enters "Taylor" in Last Name Edit input box
    And User clicks on Close button on Profile Update Page
    Then User is able to see "Family Dollar" text on Profile Page
    When User clicks Account Tab on Home Page
    And User scrolls down to move bottom
    Then User is able to see sign out button in account page
    When User clicks sign out button in account page
    Then User is on Welcome Page

  @FD_481_TC9 @Smoke
  Scenario: Verify Edit Date of birth
    When User clicks Edit button on Account Page
    Then User is able to see Profile header text on Profile Page
    And User is able to see "Date of Birth" text on Profile Page
    When User clicks "Date of Birth" button on Profile Page
    Then User is able to see "Date of Birth" text on Profile PopUp Page
    And User is able to see Save button on Profile PopUp Page
    And User is able to see close button on Profile PopUp Page
    When User clicks on Close button on Profile Update Page
    Then User is able to see "Date of Birth" text on Profile Page
    When User clicks Account Tab on Home Page
    And User scrolls down to move bottom
    Then User is able to see sign out button in account page
    When User clicks sign out button in account page
    Then User is on Welcome Page

  @FD_481_TC11 @Smoke
  Scenario: Verify Edit Zip Code
    When User clicks Edit button on Account Page
    Then User is able to see Profile header text on Profile Page
    And User is able to see "ZIP Code" text on Profile Page
    And User is able to see "23456" text on Profile Page
    When User clicks "ZIP Code" button on Profile Page
    Then User is able to see "ZIP Code" text on Profile PopUp Page
    And User is able to see Zip Code Text "23456" In Edit Input Box
    And User is able to see Save button on Profile PopUp Page
    And User is able to see close button on Profile PopUp Page
    When User enters "65498" in Zip Code Edit input box
    And User clicks on Save button on Profile Update Page
    Then User is able to see "Updated successfully" text on Profile PopUp Page
    When User clicks OK button on Profile PopUp Page
    Then User is able to see "65498" text on Profile Page
    When User clicks "ZIP Code" button on Profile Page
    When User enters "23456" in Zip Code Edit input box
    And User clicks on Save button on Profile Update Page
    Then User is able to see "Updated successfully" text on Profile PopUp Page
    When User clicks OK button on Profile PopUp Page
    Then User is able to see "23456" text on Profile Page
    When User clicks Account Tab on Home Page
    And User scrolls down to move bottom
    Then User is able to see sign out button in account page
    When User clicks sign out button in account page
    Then User is on Welcome Page

  @FD_481_TC12 @FD_481_TC13 @FD_481_TC14
  Scenario Outline: Verify Edit Zip Code with less than 5 digit
    When User clicks Edit button on Account Page
    Then User is able to see Profile header text on Profile Page
    And User is able to see "ZIP Code" text on Profile Page
    And User is able to see "23456" text on Profile Page
    When User clicks "ZIP Code" button on Profile Page
    And User enters "<ZipCode>" in Zip Code Edit input box
    And User clicks on Save button on Profile Update Page
    Then User is able to see "<ErrorMessage>" text on Profile PopUp Page
    When User clicks on Close button on Profile Update Page
    Then User is able to see "23456" text on Profile Page
    When User clicks Account Tab on Home Page
    And User scrolls down to move bottom
    Then User is able to see sign out button in account page
    When User clicks sign out button in account page
    Then User is on Welcome Page
    Examples:
      | ZipCode | ErrorMessage                          |
      | 6549    | Please enter a valid 5 digit ZIP code |
      | 654AB   | Please enter a valid 5 digit ZIP code |
      | 654945  | Please enter a valid 5 digit ZIP code |

  @FD_481_TC15 @FD_481_TC16 @FD_481_TC21 @FD_481_TC22 @Smoke
  Scenario: Verify Edit Password
    When User clicks Edit button on Account Page
    Then User is able to see Profile header text on Profile Page
    And User is able to see "Password" text on Profile Page
    When User clicks "Password" button on Profile Page
    Then User is able to see "Current Password" text on Profile PopUp Page
    And User is able to see Verify button on Profile PopUp Page
    And User is able to see close button on Profile PopUp Page
    And User is able to see eye image inside the password input box
    When User enters "Test@123" in Password Edit input box
    Then User is able to see default entered character as Astrix
    When User clicks on eye button inside the password input box
    Then User is able to see Password Text "Test@123" In Edit Input Box
    When User clicks on Verify button on Profile Update Page
    Then User is able to see "Change Password" text on Profile PopUp Page
    And User is able to see "New Password" text on Profile PopUp Page
    And User is able to see "At least 8 characters" text on Profile PopUp Page
    And User is able to see "One uppercase alphabetic character" text on Profile PopUp Page
    And User is able to see "One number (1, 2, 3, 4 ...)" text on Profile PopUp Page
    And User is able to see "One special character (![]`@$%^&*()-_=+;:’,<.>/?)" text on Profile PopUp Page
    And User is able to see eye image inside the password input box
    And User is able to see close button on Profile PopUp Page
    And User is able to see Save button on Profile PopUp Page
    When User enters "Test@123" in Password Edit input box
    And User clicks on Save button on Profile Update Page
    Then User is able to see "Password Changed" text on Profile PopUp Page
    And User is able to see "Your password has been changed successfully" text on Profile PopUp Page
    When User clicks OK button on Profile PopUp Page
    Then User is able to see Profile header text on Profile Page
    When User clicks Account Tab on Home Page
    And User scrolls down to move bottom
    Then User is able to see sign out button in account page
    When User clicks sign out button in account page
    Then User is on Welcome Page

  @FD_481_TC17
  Scenario: Verify user able to see error for wrong password edit window
    When User clicks Edit button on Account Page
    Then User is able to see Profile header text on Profile Page
    And User is able to see "Password" text on Profile Page
    When User clicks "Password" button on Profile Page
    Then User is able to see "Current Password" text on Profile PopUp Page
    When User enters "Test1234" in Password Edit input box
    Then User is able to see default entered character as Astrix
    When User clicks on eye button inside the password input box
    Then User is able to see Password Text "Test1234" In Edit Input Box
    When User clicks on Verify button on Profile Update Page
    Then User is able to see "Error" text on Profile PopUp Page
    And User is able to see "Your email and password combination didn’t match our records. Please try again." text on Profile PopUp Page
    When User clicks OK button on Profile PopUp Page
    Then User is able to see Profile header text on Profile Page
    When User clicks Account Tab on Home Page
    And User scrolls down to move bottom
    Then User is able to see sign out button in account page
    When User clicks sign out button in account page
    Then User is on Welcome Page

  @FD_481_TC19 @FD_481_TC20
  Scenario: Verify user move to profile window when tap cross on Change Password window
    When User clicks Edit button on Account Page
    Then User is able to see Profile header text on Profile Page
    And User is able to see "Password" text on Profile Page
    When User clicks "Password" button on Profile Page
    Then User is able to see "Current Password" text on Profile PopUp Page
    And User is able to see close button on Profile PopUp Page
    When User clicks on Close button on Profile Update Page
    Then User is able to see Profile header text on Profile Page
    When User clicks "Password" button on Profile Page
    When User enters "Test@123" in Password Edit input box
    And User clicks on Verify button on Profile Update Page
    Then User is able to see "Change Password" text on Profile PopUp Page
    And User is able to see close button on Profile PopUp Page
    When User clicks on Close button on Profile Update Page
    Then User is able to see Profile header text on Profile Page
    When User clicks Account Tab on Home Page
    And User scrolls down to move bottom
    Then User is able to see sign out button in account page
    When User clicks sign out button in account page
    Then User is on Welcome Page

  @FD_481_TC23 @Smoke
  Scenario: Verify user able edit contact information Email
    When User clicks Edit button on Account Page
    Then User is able to see Profile header text on Profile Page
    And User is able to see "Email" text on Profile Page
    And User is able to see "familydollarstg@yopmail.com" text on Profile Page
    When User clicks "Email" button on Profile Page
    Then User is able to see "Email" text on Profile PopUp Page
    And User is able to see "Email Address" text on Profile PopUp Page
    And User is able to see Email Text "familydollarstg@yopmail.com" In Edit Input Box
    And User is able to see Save button on Profile PopUp Page
    And User is able to see close button on Profile PopUp Page
    When User enters "abc456789@yopmail.com" in Email Edit input box
    And User clicks on Save button on Profile Update Page
    Then User is able to see "Updated successfully" text on Profile PopUp Page
    When User clicks OK button on Profile PopUp Page
    Then User is able to see "abc456789@yopmail.com" text on Profile Page
    When User clicks "Email" button on Profile Page
    When User enters "familydollarstg@yopmail.com" in Email Edit input box
    And User clicks on Save button on Profile Update Page
    Then User is able to see "Updated successfully" text on Profile PopUp Page
    When User clicks OK button on Profile PopUp Page
    Then User is able to see "familydollarstg@yopmail.com" text on Profile Page
    When User clicks Account Tab on Home Page
    And User scrolls down to move bottom
    Then User is able to see sign out button in account page
    When User clicks sign out button in account page
    Then User is on Welcome Page

  @FD_481_TC25 @FD_481_TC26
  Scenario: Verify user able edit contact information Email error for wrong email format
    When User clicks Edit button on Account Page
    Then User is able to see Profile header text on Profile Page
    And User is able to see "Email" text on Profile Page
    And User is able to see "familydollarstg@yopmail.com" text on Profile Page
    When User clicks "Email" button on Profile Page
    Then User is able to see "Email Address" text on Profile PopUp Page
    And User is able to see Email Text "familydollarstg@yopmail.com" In Edit Input Box
    When User enters "abc12345" in Email Edit input box
    And User clicks on Save button on Profile Update Page
    Then User is able to see "Please enter a valid Email Address" text on Profile PopUp Page
    And User is able to see close button on Profile PopUp Page
    When User clicks on Close button on Profile Update Page
    Then User is able to see "familydollarstg@yopmail.com" text on Profile Page
    When User clicks Account Tab on Home Page
    And User scrolls down to move bottom
    Then User is able to see sign out button in account page
    When User clicks sign out button in account page
    Then User is on Welcome Page

  @FD_481_TC27 @FD_481_TC29 @FD_1251_TC1 @FD_1252_TC1 @Smoke
  Scenario: Verify user able edit contact information Phone Number
    When User clicks Edit button on Account Page
    Then User is able to see Profile header text on Profile Page
    And User is able to see "Phone Number" text on Profile Page
    And User is able to see "7243748910" text on Profile Page
    When User clicks "Phone Number" button on Profile Page
    Then User is able to see "Enter Your Phone Number" text on Profile PopUp Page
    And User is able to see "You will enter your phone number at the register to redeem your coupons." text on Profile PopUp Page
    And User is able to see "Phone Number" text on Profile PopUp Page
    And User is able to see "000-000-0000" text on Profile PopUp Edit Page
    And User is able to see " Privacy Policy" text on Profile PopUp Page
    And User is able to see "Next" text on Profile PopUp Page
    And User is able to see close button on Profile PopUp Page
    And User is able to see Next button is Disabled on Profile PopUp Page
    When User enters "9875327342" in Phone Number Edit input box
    Then User is able to see Next button is Enabled on Profile PopUp Page
    And User clicks "Next" button on Profile PopUp Page
    Then User is able to see "Enter Your Verification Code" text on Profile PopUp Page
    And User is able to see "Send Again" text on Profile PopUp Page
    And User is able to see "Verify" text on Profile PopUp Page
    And User is able to see close button on Profile PopUp Page
    When User clicks on Close button on Profile Update Page
    Then User is able to see "Phone Number" text on Profile Page
    When User clicks Account Tab on Home Page
    And User scrolls down to move bottom
    Then User is able to see sign out button in account page
    When User clicks sign out button in account page
    Then User is on Welcome Page

  @FD_481_TC30 @FD_481_TC31
  Scenario: Verify user able edit contact information error for wrong Phone Number format
    When User clicks Edit button on Account Page
    Then User is able to see Profile header text on Profile Page
    And User is able to see "Phone Number" text on Profile Page
    And User is able to see "7243748910" text on Profile Page
    When User clicks "Phone Number" button on Profile Page
    Then User is able to see "Phone Number" text on Profile PopUp Page
    And User is able to see Next button is Disabled on Profile PopUp Page
    When User enters "98712345" in Phone Number Edit input box
    Then User is able to see Next button is Disabled on Profile PopUp Page
    And User is able to see close button on Profile PopUp Page
    When User clicks on Close button on Profile Update Page
    Then User is able to see "Phone Number" text on Profile Page
    When User clicks Account Tab on Home Page
    And User scrolls down to move bottom
    Then User is able to see sign out button in account page
    When User clicks sign out button in account page
    Then User is on Welcome Page

  @FD_481_TC33 @FD_481_TC35
  Scenario Outline: Verify user able edit Associate Id error for employee
    When User clicks Edit button on Account Page
    Then User is able to see Profile header text on Profile Page
    When User scrolls down to move bottom
    And User is able to see "Add your Associate Id Number" text on Profile Page
    When User clicks Add your Associate Id Number button on Profile Page
    Then User is able to see "Associate ID Number" text on Profile PopUp Page
    When User enters "<EmployeeID>" in Associate ID Edit input box
    And User clicks on Save button on Profile Update Page
    Then User is able to see "<ErrorMessage>" text on Profile PopUp Page
    And User clicks on Close button on Profile Update Page
    When User clicks Account Tab on Home Page
    And User scrolls down to move bottom
    Then User is able to see sign out button in account page
    When User clicks sign out button in account page
    Then User is on Welcome Page
    Examples:
      | EmployeeID | ErrorMessage                                                                                      |
      | 8712345    | Please enter a valid Associate ID Number                                                          |
      | 101111001   | This Associate ID is already associated with an account. Please enter another valid Associate ID. |
