@api @FD_eCommerce
Feature: Get Order History Scenarios

  @GetOrderHistory
  Scenario Outline: Verify user is able to get Order History with valid email and limit details
    Given I have API "GetOrderHistory"
    And I set content-type as JSON
    And I set header for this req
    And I set ecomm token in request header
    And I set query param 'email' with a value of "<emailId>"
    And I set query param 'limit' with a value of "<limitCount>"
    When I call method 'GET'
    And I get the response
    Then I verify response code is <statusCode>
    Examples:
      | emailId                   | limitCount | statusCode |
      | ecomm.testing@yopmail.com | 2          | 200        |
      |                           | 2          | 400        |
      | ecomm.testing@yopmail.com | 0          | 400        |
      | ecomm.testing@yopmail.com | abc        | 400        |
      | varunS@yopmail.com        | 2          | 404        |

  @GetOrderHistoryWithoutLimit
  Scenario Outline: Verify user is able to get Order History with valid email details
    Given I have API "GetOrderHistory"
    And I set content-type as JSON
    And I set header for this req
    And I set ecomm token in request header
    And I set query param 'email' with a value of "<emailId>"
    When I call method 'GET'
    And I get the response
    Then I verify response code is <statusCode>
    Examples:
      | emailId                   | statusCode |
      | ecomm.testing@yopmail.com | 200        |
      |                           | 400        |
      | varunS@yopmail.com        | 404        |

  @GetOrderHistoryWithHeaderMissing
  Scenario Outline: Verify Get Order History when Header missing
    Given I have API "GetOrderHistory"
    And I set content-type as JSON
    And I set header for this req
    And I set ecomm token in request header
    And I set query param 'email' with a value of "ecomm.testing@yopmail.com"
    And I set query param 'limit' with a value of "2"
    And I set header "x-api-key" with a value of "<key>"
    And I set header "feature" with a value of "<feature>"
    When I call method 'GET'
    Then I verify response code is <statusCode>
    Examples:
      | key                                  | feature | statusCode |
      |                                      | ecomm   | 401        |
      | 4678ceb6-cab2-40a9-835c-5607e7f10b45 |         | 404        |

  @GetOrderHistoryWithExpiredToken
  Scenario: Verify Get Order History with expiry token
    Given I have API "ExpiredTokenGetOrderHistory"
    And I set content-type as JSON
    And I set header for this req
    And I set query param 'email' with a value of "ecomm.testing@yopmail.com"
    And I set query param 'limit' with a value of "2"
    When I call method 'GET'
    And I get the response
    Then I verify response code is 401
