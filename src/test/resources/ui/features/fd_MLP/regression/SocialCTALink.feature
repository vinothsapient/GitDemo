@mobile @local_run
Feature: Social CTA Link Validation Workflow

  Background:
    Given User is on Welcome Page
    And User is able to see Family Dollar Icon on Welcome Page

  @SocialCTALinkValidation
  Scenario: Verify continue as a guest Workflow For More Screen
    When User clicks Continue as Guest button on Welcome Page
    And User click Continue as Guest link on popup dialog
    And User clicks Skip button on Enable My Location Page
    And User clicks Skip button on Enable My Location Page Pop Up
    And User clicks Not Now button on Keep Up to Date Page
    Then User is able to see Home text on Home Page
    When User clicks More Tab on Home Page
    And User scrolls down for one time
    And User scrolls down for one time
    Then User is able to see Facebook text on More Page
    And User is able to see Instagram text on More Page
    And User is able to see X text on More Page
    When User clicks X link on More Page
    Then User is able to see X text on FD Web Page
    When User clicks back button from Keypad
    Then User is able to see TikTok text on More Page
    And User is able to see Pinterest text on More Page
    When User clicks Pinterest link on More Page
    Then User is able to see Pinterest text on FD Web Page
    When User clicks back button from Keypad
    Then User is able to see Pinterest text on More Page
