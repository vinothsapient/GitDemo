@test
Feature: Change Password Flow

  @apitest @ChangePassword @FDTMAPPS-481
  Scenario Outline: Validate change password
    Given I have API "<API>"
    And I set content-type as JSON
    And I set request body for "<RequestBody>"
    When I call method 'POST'
    Then I get the response
    Then I verify response code is "<Status_Code>"
    Examples:
      | API                   | RequestBody         | Status_Code |
      | change_password       | user_data           | 400         |
      | change_password       | user_data1          | 400         |
      | change_password       | user_data2          | 400         |