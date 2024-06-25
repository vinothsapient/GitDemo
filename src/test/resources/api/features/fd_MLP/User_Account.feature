@test
Feature: Create and Verify Accounts

   @EmailId @apitest
  Scenario Outline: Validate Email Ids
    Given I have API "<API>"
    And I set content-type as JSON
    And I set request body for "<RequestBody>"
    When I call method 'POST'
    Then I get the response
    Then I verify response code is "<Status_Code>"
    Examples:
      | API                   | RequestBody         | Status_Code |
      | user_emailId          | user_data           | 200         |
      | user_emailId          | user_data1          | 409         |
      | user_emailId          | user_data2          | 400         |
      | user_emailId          | user_data3          | 400         |

   @CreateUser
  Scenario Outline: Create users
    Given I have API "<API>"
    And I set content-type as JSON
    And I set request body for "<RequestBody>"
    When I call method 'POST'
    Then I get the response
    Then I verify response code is "<Status_Code>"
    Examples:
      | API                   | RequestBody         | Status_Code |
#      | create_accountUser    | user_data           | 200         |
      | create_accountUser    | user_data1          | 409         |
      | create_accountUser    | user_data2          | 400         |
      | create_accountUser    | user_data3          | 400         |
      | create_accountUser    | user_data4          | 400         |
      | create_accountUser    | user_data5          | 400         |
      | create_accountUser    | user_data6          | 400         |
      | create_accountUser    | user_data7          | 400         |
      | create_accountUser    | user_data8          | 400         |

  @apitest @EmployeeId
  Scenario Outline: Verify Employee Ids
    Given I have API "<API>"
    And I set content-type as JSON
    And I set request body for "<RequestBody>"
    When I call method 'POST'
    Then I get the response
    Then I verify response code is "<Status_Code>"
    Examples:
      | API        | RequestBody         | Status_Code |
      | user       | user_data           | 404         |
      | user       | user_data1          | 409         |
      | user       | user_data2          | 400         |
      | user       | user_data3          | 400         |
      | user       | user_data4          | 400         |
