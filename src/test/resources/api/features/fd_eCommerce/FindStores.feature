@api @FD_eCommerce
Feature: Find Nearby Stores

  @FindStores
  Scenario Outline: Verify user is able to find Stores using zip Code and location
    Given I have API "FindStores"
    And I set content-type as JSON
    And I set header for this req
    And I set request body for "<requestBody>"
    When I call method 'POST'
    And I get the response
    Then I verify response code is <statusCode>
    Examples:
      | requestBody                       | statusCode |
      | zipCode                           | 200        |
      | location                          | 200        |
      | emptySearchValue                  | 400        |
      | emptyLatitudeLongitude            | 400        |
      | emptySearchValueLatitudeLongitude | 400        |

  @FindStoresWithHeaderMissing
  Scenario Outline: Verify Find Stores when Header missing
    Given I have API "FindStores"
    And I set content-type as JSON
    And I set header for this req
    And I set request body for "<requestBody>"
    And I set header "x-api-key" with a value of "<key>"
    And I set header "feature" with a value of "<feature>"
    When I call method 'POST'
    Then I verify response code is <statusCode>
    Examples:
      | requestBody | key                                  | feature | statusCode |
      | zipCode     |                                      | ecomm   | 401        |
      | zipCode     | 4678ceb6-cab2-40a9-835c-5607e7f10b45 |         | 404        |
