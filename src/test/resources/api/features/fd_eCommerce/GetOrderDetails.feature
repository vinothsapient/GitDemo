@api @FD_eCommerce
Feature: Get Order Details Scenarios

  @GetOrderDetails
  Scenario: Verify user is able to get Order details with valid Order Id
    Given I have API "GetOrderHistory"
    And I set content-type as JSON
    And I set header for this req
    And I set ecomm token in request header
    And I set query param 'email' with a value of "ecomm.testing@yopmail.com"
    And I set query param 'limit' with a value of "2"
    When I call method 'GET'
    And I get the response
    Then I verify response code is 200
    Given I have API "GetOrderDetails"
    And I set content-type as JSON
    And I set order id 'orderId' for get Order details
    And I set ecomm token in request header
    When I call method 'GET'
    And I get the response
    Then I verify response code is 200

  @GetOrderDetailsWithBlankOrderId
  Scenario: Verify user is able to get Order details with blank Order Id
    Given I have API "GetOrderDetails"
    And I set content-type as JSON
    And I set path param 'orderId' with a value of ' '
    And I set ecomm token in request header
    When I call method 'GET'
    And I get the response
    Then I verify response code is 400

  @GetOrderDetailsWithHeaderMissing
  Scenario Outline: Verify Get Order Details when Header missing
    Given I have API "GetOrderDetails"
    And I set content-type as JSON
    And I set header for this req
    And I set ecomm token in request header
    And I set path param 'orderId' with a value of '228010530'
    And I set header "x-api-key" with a value of "<key>"
    And I set header "feature" with a value of "<feature>"
    When I call method 'GET'
    Then I verify response code is <statusCode>
    Examples:
      | key                                  | feature | statusCode |
      |                                      | ecomm   | 401        |
      | 4678ceb6-cab2-40a9-835c-5607e7f10b45 |         | 404        |

  @GetOrderDetailsWithExpiredToken
  Scenario: Verify Get Order Details with expiry token
    Given I have API "ExpiredTokenGetOrderDetails"
    And I set content-type as JSON
    And I set path param 'orderId' with a value of '228010530'
    And I set header for this req
    When I call method 'GET'
    And I get the response
    Then I verify response code is 401
