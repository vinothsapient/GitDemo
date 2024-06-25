@test
Feature: User Login

  @LoginApi @FDTMAPPS-299 @FDTMAPPS-377
  Scenario Outline: Verify if user is able to Login using POST method with valid details
    Given I have API "<API>"
    And I set content-type as JSON
    And I set request body for "<RequestBody>"
    When I call method 'POST'
    Then I get the response
    Then I verify response code is 200
    Examples:
      | API          | RequestBody |
      | user_login   | User_Login  |

   @LoginApi @FDTMAPPS-299 @FDTMAPPS-377
  Scenario Outline: Validate Login api
    Given I have API "<API>"
    And I set content-type as JSON
    And I set request body for "<RequestBody>"
    When I call method 'POST'
    Then I get the response
    Then I verify response code is "<Status_Code>"
    Examples:
      | API          | RequestBody  |        Status_Code    |
      | user_login   | User_Login1  |        404            |
      | user_login   | User_Login2  |        404            |
      | user_login   | User_Login3  |        400            |
      | user_login   | User_Login4  |        400            |
      | user_login   | User_Login5  |        400            |
      | user_login   | User_Login6  |        400            |