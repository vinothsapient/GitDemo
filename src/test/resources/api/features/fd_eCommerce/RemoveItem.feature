@api @FD_eCommerce
Feature: Remove Item API

  @RemoveItem
  Scenario Outline: Verify remove cart for single item from the cart for logged in user using Valid data
    Given I have API "CreateCart"
    And I set content-type as JSON
    And I set request body for "validCartDetails"
    And I set ecomm token in request header
    When I call method 'POST'
    And I get the response
    Then I verify response code is 200
    Given I have API "Remove_Item"
    And I set content-type as JSON
    And I set header for this req
    And I set cart id 'cartId' for update cart
    And I set item id 'itemId' for remove cart
    And I set query param 'storeId' with a value of "<storeId>"
    And I set query param 'zipCode' with a value of "<zipCode>"
    And I set ecomm token in request header
    When I call method 'DELETE'
    Then I get the response
    And I verify response code is <statusCode>
    Examples:
      | statusCode | storeId | zipCode |
      | 404        | 32275   | 23504   |

  @RemoveItem @RemoveMultipleItems
  Scenario Outline: Verify remove cart for multiple items from the cart for logged in user using Valid data
    Given I have API "CreateCart"
    And I set content-type as JSON
    And I set request body for "validCartDetails"
    And I set ecomm token in request header
    When I call method 'POST'
    And I get the response
    Then I verify response code is 200
    Given I have API "UpdateCart"
    And I set content-type as JSON
    And I set request body for "<requestBody>"
    And I set cart id 'cartId' for update cart
    And I set query param 'checkout' with a value of "<checkout>"
    And I set query param 'storeId' with a value of "<storeId>"
    And I set query param 'zipCode' with a value of "<zipCode>"
    And I set ecomm token in request header
    When I call method 'PUT'
    And I get the response
    Then I verify response code is <statusCode>
    Given I have API "Remove_Item"
    And I set content-type as JSON
    And I set header for this req
#    And I set path param cart id 'cart' for remove cart
    And I set cart id 'cartId' for update cart
    And I set item id 'itemId' for remove cart
    And I set query param 'storeId' with a value of "<storeId>"
    And I set query param 'zipCode' with a value of "<zipCode>"
    And I set ecomm token in request header
    When I call method 'DELETE'
    Then I get the response
    And I verify response code is <statusCode>
    Examples:
      | statusCode | storeId | zipCode | checkout | requestBody       |
      | 200        | 32275   | 23504   | false    | validUpdateCartDetails |

  @RemoveItem @RemoveWithEmptyCartId
  Scenario Outline: Verify remove cart for Empty cartId
    Given I have API "Remove_Item"
    And I set content-type as JSON
    And I set header for this req
#    And I set path param cart id 'cart' for remove cart
    And I set path param 'cartId' with a value of " "
    And I set path param 'itemId' with a value of "<itemId>"
    And I set query param 'storeId' with a value of "<storeId>"
    And I set query param 'zipCode' with a value of "<zipCode>"
    And I set ecomm token in request header
    When I call method 'DELETE'
    Then I get the response
    And I verify response code is <statusCode>
    Examples:
      | statusCode | storeId | zipCode | itemId      |
      | 400        | 32275   | 23504   | ci156019011 |

  @RemoveItem @RemoveWithEmptyItemId
  Scenario Outline: Verify remove cart for Empty itemId
    Given I have API "Remove_Item"
    And I set content-type as JSON
    And I set header for this req
#    And I set path param cart id 'cart' for remove cart
    And I set path param 'cartId' with a value of "<cartId>"
    And I set path param 'itemId' with a value of " "
    And I set query param 'storeId' with a value of "<storeId>"
    And I set query param 'zipCode' with a value of "<zipCode>"
    And I set ecomm token in request header
    When I call method 'DELETE'
    Then I get the response
    And I verify response code is <statusCode>
    Examples:
      | statusCode | storeId | zipCode | cartId      |
      | 400        | 32275   | 23504   | 22801053092 |

  @RemoveItem @RemoveWithMissingToken
  Scenario Outline: Verify remove cart for Missing token
    Given I have API "CreateCart"
    And I set content-type as JSON
    And I set request body for "validCartDetails"
    And I set ecomm token in request header
    When I call method 'POST'
    And I get the response
    Then I verify response code is 200
    Given I have API "Remove_Item"
    And I set content-type as JSON
    And I set header for this req
#    And I set path param cart id 'cart' for remove cart
    And I set cart id 'cartId' for update cart
    And I set item id 'itemId' for remove cart
    And I set query param 'storeId' with a value of "<storeId>"
    And I set query param 'zipCode' with a value of "<zipCode>"
    When I call method 'DELETE'
    Then I get the response
    And I verify response code is <statusCode>
    Examples:
      | statusCode | storeId | zipCode |
      | 400        | 32275   | 23504   |

  @RemoveItem @RemoveWithMissingHeader
  Scenario Outline: Verify remove cart for Missing header
    Given I have API "CreateCart"
    And I set content-type as JSON
    And I set request body for "validCartDetails"
    And I set ecomm token in request header
    When I call method 'POST'
    And I get the response
    Then I verify response code is 200
    Given I have API "Remove_Item"
    And I set content-type as JSON
    And I set cart id 'cartId' for update cart
    And I set item id 'itemId' for remove cart
    And I set query param 'storeId' with a value of "72224"
    And I set query param 'zipCode' with a value of "89101"
    And I set ecomm token in request header
    And I set header "x-api-key" with a value of "<key>"
    And I set header "feature" with a value of "<feature>"
    When I call method 'DELETE'
    Then I verify response code is <statusCode>

    Examples:
      | statusCode | key                                  | feature |
      | 404        | 4678ceb6-cab2-40a9-835c-5607e7f10b45 |         |
      | 401        |                                      | ecomm   |


  @RemoveItem @RemoveWithMissingQueryParam
  Scenario Outline: Verify remove cart for Missing store ID and Zip code
    Given I have API "CreateCart"
    And I set content-type as JSON
    And I set request body for "validCartDetails"
    And I set ecomm token in request header
    When I call method 'POST'
    And I get the response
    Then I verify response code is 200
    Given I have API "Remove_Item"
    And I set content-type as JSON
    And I set header for this req
#    And I set path param cart id 'cart' for remove cart
    And I set cart id 'cartId' for update cart
    And I set item id 'itemId' for remove cart
    And I set query param 'storeId' with a value of "<storeId>"
    And I set query param 'zipCode' with a value of "<zipCode>"
    And I set ecomm token in request header
    When I call method 'DELETE'
    Then I get the response
    And I verify response code is <statusCode>
    Examples:
      | statusCode | storeId | zipCode |
      | 400        |         | 23504   |
      | 400        | 32275   |         |

  @RemoveItem @RemoveWithExpiredToken
  Scenario Outline: Verify remove cart for Expired token
    Given I have API "ExpiredTokenRemoveCart"
    And I set content-type as JSON
    And I set header for this req
#    And I set path param cart id 'cart' for remove cart
    And I set path param 'cartId' with a value of "<cartId>"
    And I set path param 'itemId' with a value of "<itemId>"
    And I set query param 'storeId' with a value of "<storeId>"
    And I set query param 'zipCode' with a value of "<zipCode>"
    When I call method 'DELETE'
    Then I get the response
    And I verify response code is <statusCode>
    Examples:
      | statusCode | storeId | zipCode | cartId      |itemId|
      | 401       | 32275   | 23504   | 22801053092  | ci156023534|