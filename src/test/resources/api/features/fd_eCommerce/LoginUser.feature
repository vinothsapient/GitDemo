@api @FD_eCommerce
Feature: Login User

  @LoginUser
  Scenario Outline: Verify user is able to login using valid email and password for Family dollar
    Given I have API "Login_User"
    And I set content-type as JSON
    And I set request body for "<requestBody>"
    And I set header for this req
    When I call method 'POST'
    And I get the response
    Then I verify response code is <statusCode>
    Examples:
      | requestBody        | statusCode |
      | ValidCredentials   | 200        |
      | InvalidCredentials | 401        |
