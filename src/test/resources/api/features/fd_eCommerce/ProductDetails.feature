@api @FD_eCommerce
Feature: Product Details

  @ProductDetails
  Scenario Outline: Verify user is able to get product details for a product id for Family dollar
    Given I have API "ProductDetails"
    And I set content-type as JSON
    And I set header for this req
    And I set path param 'id' with a value of "<productId>"
    When I call method 'GET'
    And I get the response
    Then I verify response code is <statusCode>
    Examples:
      | productId     | statusCode |
      | FD1400982     | 200        |
      | FD1400982dfg5 | 400        |

  @ProductDetailsWithStoreId
  Scenario Outline: Verify user is able to get product details for a product id with store id for Family dollar
    Given I have API "ProductDetails"
    And I set content-type as JSON
    And I set header for this req
    And I set path param 'id' with a value of "<productId>"
    And I set query param 'storeId' with a value of "72224"
    And I set query param 'zipCode' with a value of "<zipCode>"
    When I call method 'GET'
    And I get the response
    Then I verify response code is <statusCode>
    Examples:
      | productId     | zipCode | statusCode |
      | FD1400982     | 89101   | 200        |
      | FD1400982dfg5 | 89101   | 404        |
      | FD1400982     |         | 200        |
