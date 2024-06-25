@test
Feature: Store Details

  @apitest @StoreDetails @FDTMAPPS-265 @FDTMAPPS-266 @FDTMAPPS-267
  Scenario Outline: Verify if user is able to Post search store Details using POST method with valid details
    Given I have API "<API>"
    And I set content-type as JSON
    And I set request body for "<RequestBody>"
    When I call method 'POST'
    Then I get the response
    Then I verify response code is 200
    Examples:
      | API             | RequestBody    |
      | store_Details   | Valid_store    |

  @apitest @StoreDetails @FDTMAPPS-265 @FDTMAPPS-266 @FDTMAPPS-267
  Scenario Outline: Validate Fetch Store details API
    Given I have API "<API>"
    And I set content-type as JSON
    And I set request body for "<RequestBody>"
    When I call method 'POST'
    Then I get the response
    Then I verify response code is "<Status_Code>"
    Examples:
      | API             | RequestBody     |   Status_Code  |
      | store_Details   | Valid_store1    |     200        |
      | store_Details   | Valid_store2    |     400        |
      | store_Details   | Valid_store3    |     400        |
      | store_Details   | Valid_store4    |     200        |
      | store_Details   | Valid_store5    |     200        |

  @apitest @StoreDetails @FDTMAPPS-265 @FDTMAPPS-266 @FDTMAPPS-267
  Scenario Outline: Verify if user is able to Fetch store Details using POST method with valid details
    Given I have API "<API>"
    And I set content-type as JSON
    And I set header for this req
    When I call method 'GET'
    Then I get the response
    Then I verify response code is 200
    Examples:
      | API                  |
      | fetch_storeDetails   |
