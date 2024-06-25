@api @FD_eCommerce
Feature: Phone Number Verification

  @PhoneNumberVerification
  Scenario Outline: verify response for verification API when user sends invalid SMS code
    Given I have API "PhoneNumberVerification"
    And I set content-type as JSON
    And I set request body for "<RequestBody>"
    And I set header for this req
    When I call method 'POST'
    And I get the response
    Then I verify response code is 400
    Examples:
      | RequestBody               |
      | PhoneNumberWrongSms       |
      | PhoneNumberInvalid        |
      | PhoneNumberBlankSms       |
      | PhoneNumberInvalidEmail   |
      | PhoneNumberBlankEmail     |
      | PhoneNumberBlankPassword  |
      | PhoneNumberBlankFirstName |
      | PhoneNumberBlankLastName  |
