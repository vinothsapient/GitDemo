@api @FD_eCommerce
Feature: Create Cart Scenarios

  @CreateCart
  Scenario Outline: Verify create cart for valid product id and quantity greater than zero
    Given I have API "CreateCart"
    And I set content-type as JSON
    And I set request body for "<requestBody>"
    And I set ecomm token in request header
    When I call method 'POST'
    And I get the response
    Then I verify response code is <statusCode>
    Examples:
      | requestBody         | statusCode |
      | validCartDetails    | 200        |
      | qtyEqualsToZero     | 400        |
      | EmptyProductId      | 400        |
      | EmptyDeliveryOption | 400        |
      | InvalidProductId    | 400        |
      | InvalidProductQty   | 500        |

  @CreateCartHeaderMissing
  Scenario Outline: Verify create cart when Header missing
    Given I have API "CreateCart"
    And I set content-type as JSON
    And I set request body for "<requestBody>"
    And I set ecomm token in request header
    And I set header "x-api-key" with a value of "<key>"
    And I set header "feature" with a value of "<feature>"
    When I call method 'POST'
    Then I verify response code is <statusCode>
    Examples:
      | requestBody      | key                                  | feature | statusCode |
      | validCartDetails |                                      | ecomm   | 401        |
      | validCartDetails | 4678ceb6-cab2-40a9-835c-5607e7f10b45 |         | 404        |

  @CreateCartWithoutToken
  Scenario Outline: Verify create cart when Header ecommerce token missing
    Given I have API "<CartApi>"
    And I set content-type as JSON
    And I set request body for "validCartDetails"
    And I set header for this req
    When I call method 'POST'
    And I get the response
    Then I verify response code is <statusCode>
    Examples:
      | CartApi                | statusCode |
      | CreateCart             | 400        |
      | ExpiredTokenCreateCart | 401        |
