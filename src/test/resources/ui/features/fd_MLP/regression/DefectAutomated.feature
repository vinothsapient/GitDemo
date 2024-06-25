@mobile
Feature: Defect flow automation

  Background:
    Given User is on Welcome Page


  Scenario: Verify code will expire message
    And User clicks Sign Up button on Welcome Page
    When User enters the first name "firstName"
    And User enters the last name "lastName"
    And User enters the zip code "11202"
    And User enters the Phone Number "6163193856"
    And User enters the email "email"
    And User enters the password "Test@123"
    And User clicks on T&C checkbox
    When User clicks Create Account button on Sign Up Page
    Then User is able to view Enter Your Verification Code Page
    And User not get "Code will expire after 0 minutes" message on verification code input screen

    Scenario: Verify User able to see Store miles in store details page
      When User clicks Log In button on Welcome Page
      And User enter the login details for "ValidLoginDetails"
      And User clicks Now Now button on Enable Biometric Login page
      And User clicks Start Saving button on Sign Up complete Page
      Then User is able to see "Enable My Location" text on Enable My Location Page
      When User clicks Enter my Zip Code button on Enable My Location Page
      And User enters the city "chesapeake"
      And User clicks "List View" button on Choose a Store search Page
      And User clicks on storeDetails
      Then User is able to see "Store Details" text on storeDetails
      And User able to see miles below Store name

  @DefectFix
  Scenario: Verify Login User Workflow For Coupons Screen
    When User clicks Log In button on Welcome Page
    And User enter the login details for "ValidLoginDetails"
    And User clicks Now Now button on Enable Biometric Login page
    And User clicks Start Saving button on Sign Up complete Page
    And User clicks Skip button on Enable My Location Page
    And User clicks Skip button on Enable My Location Page Pop Up
    And User clicks Not Now button on Keep Up to Date Page
    Then User is able to see Home text on Home Page
    When User clicks Coupons Tab on Home Page
    Then User is able to see SmartCoupon Page
    And User store the text for clipped coupons in "oldClippedValue" on SmartCoupon Page
    When User clicks on Clip Coupon CTA on SmartCoupon Page
    And User scroll to "Your Digital ID" field of page on SmartCoupon Page
    And User store the text for clipped coupons in "newClippedValue" on SmartCoupon Page
    Then User verifies "oldClippedValue" and "newClippedValue" on SmartCoupon Page

  Scenario: Verify error of today as  Date of birth
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
    Then User is able to see Profile header text on Profile Page
    And User is able to see "Date of Birth" text on Profile Page
    When User clicks "Date of Birth" button on Profile Page
    Then User is able to see "Date of Birth" text on Profile PopUp Page
    And User is able to see Save button on Profile PopUp Page
    When User taps on Date Of Birth Input box
    Then User tap on OK from Calender
    And User clicks on Save button on Profile Update Page
    And User verify Error Message Date of birth must not be the current date on Edit profile page





