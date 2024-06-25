@api @FD_eCommerce
Feature: Refresh token

  @RefreshToken
  Scenario: Verify refresh token api using PUT method with valid details
    Given I have API "RefreshToken"
    And I set content-type as JSON
    And I set request header for refresh token
    When I call method 'PUT'
    And I get the response
    Then I verify response code is 200

  @RefreshWithInvalidToken
  Scenario Outline: Verify refresh token api using PUT method with Invalid details
    Given I have API "<API>"
    And I set content-type as JSON
    And I set header for this req
    When I call method 'PUT'
    And I get the response
    Then I verify response code is <statusCode>
    Examples:
      | API          | statusCode |
      | ExpiredToken | 401        |
      | RefreshToken | 400        |
