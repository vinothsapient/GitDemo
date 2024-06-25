@api @FD_eCommerce
Feature: Update Cart Scenarios

  @UpdateCart
  Scenario Outline: Verify update cart for valid product id and quantity greater than zero
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
    Examples:
      | requestBody         | checkout | storeId | zipCode | statusCode |
      | validUpdateCartDetails    | true     | 72224   | 89101   | 200        |
      | validUpdateCartDetails    | false    | 72224   | 89101   | 200        |
      | qtyEqualsToZero     | false    | 72224   | 89101   | 400        |
      | EmptyDeliveryOption | false    | 72224   | 89101   | 400        |
      | EmptyProductId      | false    | 72224   | 89101   | 400        |
      | InvalidProductId    | false    | 72224   | 89101   | 400        |
      | InvalidProductQty   | false    | 72224   | 89101   | 500        |
      | validCartDetails    |          | 72224   | 89101   | 200        |
      | validCartDetails    | false    |         | 89101   | 400        |
      | validCartDetails    | false    | 72224   |         | 400        |

  @UpdateCartWithInvalidCartId
  Scenario Outline: Verify update cart for valid product id and quantity greater than zero with Invalid cart Id
    Given I have API "UpdateCart"
    And I set content-type as JSON
    And I set request body for "<requestBody>"
    And I set path param 'cartId' with a value of " "
    And I set query param 'checkout' with a value of "<checkout>"
    And I set query param 'storeId' with a value of "72224"
    And I set query param 'zipCode' with a value of "89101"
    And I set ecomm token in request header
    When I call method 'PUT'
    And I get the response
    Then I verify response code is <statusCode>
    Examples:
      | requestBody      | checkout | statusCode |
      | validCartDetails | false    | 400        |

  @UpdateCartWithoutToken
  Scenario Outline: Verify update cart when Header ecommerce token missing
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
    And I set query param 'storeId' with a value of "72224"
    And I set query param 'zipCode' with a value of "89101"
    When I call method 'PUT'
    And I get the response
    Then I verify response code is <statusCode>
    Examples:
      | requestBody      | checkout | statusCode |
      | validCartDetails | false    | 400        |

  @UpdateCartWithHeaderMissing
  Scenario Outline: Verify update cart when Header missing
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
    And I set query param 'checkout' with a value of "false"
    And I set query param 'storeId' with a value of "72224"
    And I set query param 'zipCode' with a value of "89101"
    And I set ecomm token in request header
    And I set header "x-api-key" with a value of "<key>"
    And I set header "feature" with a value of "<feature>"
    When I call method 'PUT'
    Then I verify response code is <statusCode>
    Examples:
      | requestBody      | key                                  | feature | statusCode |
      | validCartDetails |                                      | ecomm   | 401        |
      | validCartDetails | 4678ceb6-cab2-40a9-835c-5607e7f10b45 |         | 404        |

  @UpdateCartWithExpiredToken
  Scenario Outline: Verify update cart when Header ecommerce token missing
    Given I have API "ExpiredTokenUpdatedCart"
    And I set content-type as JSON
    And I set request body for "<requestBody>"
    And I set path param 'cartId' with a value of "EC1020478"
    And I set query param 'checkout' with a value of "false"
    And I set query param 'storeId' with a value of "72224"
    And I set query param 'zipCode' with a value of "89101"
    And I set header for this req
    When I call method 'PUT'
    And I get the response
    Then I verify response code is <statusCode>
    Examples:
      | requestBody      | statusCode |
      | validCartDetails | 401        |
