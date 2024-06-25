@test
Feature: Update Preferred store

  @apitest @PreferredStore @FDTMAPPS-481
  Scenario Outline: Update Preferred Store
    Given I have API "<API>"
    And I set content-type as JSON
    And I set request body for "<RequestBody>"
    When I call method 'PUT'
    Then I get the response
    Then I verify response code is "<Status_Code>"
    And I verify the response schema
    Examples:
      | API                       | RequestBody         | Status_Code |
      | update_preferred_store    | Store_data          | 200         |


  @apitest @PreferredStore @FDTMAPPS-481
  Scenario Outline: Update Preferred Stores
    Given I have API "<API>"
    And I set content-type as JSON
    And I set request body for "<RequestBody>"
    When I call method 'PUT'
    Then I get the response
    Then I verify response code is "<Status_Code>"
    Examples:
      | API                       | RequestBody         | Status_Code |
      | update_preferred_store    | Store_data1         | 400         |
      | update_preferred_store    | Store_data2         | 400         |
      | update_preferred_store    | Store_data3         | 400         |