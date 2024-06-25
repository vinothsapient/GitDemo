@api @FD_eCommerce
Feature: Get Nearby Stores

  @GetNearbyStores
  Scenario Outline: Verify user is able to get Get Nearby Stores using valid Latitude And Longitude
    Given I have API "GetNearbyStores"
    And I set content-type as JSON
    And I set header for this req
    And I set path param 'productId' with a value of "FD1400982"
    And I set request body for "<requestBody>"
    When I call method 'POST'
    And I get the response
    Then I verify response code is <statusCode>
    Examples:
      | requestBody               | statusCode |
      | zipCode                   | 200        |
      | state                     | 200        |
      | city                      | 200        |
      | emptyStoreId              | 200        |
      | emptySearchRadius         | 200        |
      | validLatitudeAndLongitude | 200        |
      | emptySearchValue          | 400        |
      | noNearByStores            | 404        |

  @GetNearbyStoresWithBlankProductID
  Scenario: User should not get Nearby Stores using blank product id
    Given I have API "GetNearbyStores"
    And I set content-type as JSON
    And I set header for this req
    And I set path param 'productId' with a value of ' '
    And I set request body for "zipCode"
    When I call method 'POST'
    And I get the response
    Then I verify response code is 400

  @GetNearbyStoresWithHeaderMissing
  Scenario Outline: Verify Get Nearby Stores when Header missing
    Given I have API "GetNearbyStores"
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
