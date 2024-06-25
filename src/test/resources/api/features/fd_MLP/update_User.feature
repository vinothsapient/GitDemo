@test
Feature: Update Users

  @apitest  @updateuser @FDTMAPPS-265 @FDTMAPPS-266 @FDTMAPPS-267
  Scenario Outline: Update User
    Given I have API "<API>"
    And I set content-type as JSON
    And I set request body for "<RequestBody>"
    When I call method 'PUT'
    Then I get the response
    Then I verify response code is 200
    Examples:
      | API          | RequestBody |
      | update_users | updateUsers |

  @apitest  @updateuser @FDTMAPPS-265 @FDTMAPPS-266 @FDTMAPPS-267
  Scenario Outline: Update Users
    Given I have API "<API>"
    And I set content-type as JSON
    And I set request body for "<RequestBody>"
    When I call method 'PUT'
    Then I get the response
    Then I verify response code is "<Status_Code>"
    Examples:
      | API          | RequestBody  |  Status_Code  |
      | update_users | updateUsers1 |   400         |
      | update_users | updateUsers2 |   400         |
      | update_users | updateUsers3 |   400         |
