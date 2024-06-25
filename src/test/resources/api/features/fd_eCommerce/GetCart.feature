@api @FD_eCommerce
Feature: Get cart

  @GetCart @GetCartCheckoutFlag
  Scenario Outline: Verify user is able to get cart details when checkout flag is true or false
    Given I have API "Get_Cart"
    And I set content-type as JSON
    And I set ecomm token in request header
    And I set query param 'storeId' with a value of "<storeId>"
    And I set query param 'zipCode' with a value of "<zipCode>"
    And I set query param 'checkOutFlag' with a value of "<flag>"
    When I call method 'GET'
    And I get the response
    Then I verify response code is <statusCode>
    Examples:
      | flag  | zipCode | statusCode | storeId |
      | false | 89101   | 200        | 32271   |
      | true  | 89101   | 200        | 32271   |

  @GetCart @GetCartTokenMissing
  Scenario Outline: Verify Get cart details when Checkout is True and token is missing
    Given I have API "Get_Cart"
    And I set content-type as JSON
    And I set header for this req
    And I set query param 'storeId' with a value of "32271"
    And I set query param 'zipCode' with a value of "89101"
    And I set query param 'checkOutFlag' with a value of "true"
    And I set header "token" with a value of " "
    When I call method 'GET'
    And I get the response
    Then I verify response code is "<statusCode>"
    Examples:
      | statusCode |
      | 400        |

  @GetCart @GetCartFeatureMissing
  Scenario Outline: Verify create cart when Header feature is missing
    Given I have API "Get_Cart"
    And I set content-type as JSON
    And I set ecomm token in request header
    And I set header "x-api-key" with a value of "<key>"
    And I set header "feature" with a value of "<feature>"
    And I set query param 'storeId' with a value of "<storeId>"
    And I set query param 'zipCode' with a value of "<zipCode>"
    And I set query param 'checkOutFlag' with a value of "<flag>"
    When I call method 'GET'
    Then I verify response code is <statusCode>
    Examples:
      | flag | zipCode | storeId | key                                  | feature | statusCode |
      | true | 89101   | 32271   | 4678ceb6-cab2-40a9-835c-5607e7f10b45 |         | 404        |

  @GetCart @GetCartExpiredToken
  Scenario Outline: Verify Get cart details when Checkout is True and expired ecommerce token
    Given I have API "Get_Cart"
    And I set content-type as JSON
    And I set header for this req
    And I set query param 'storeId' with a value of "<storeId>"
    And I set query param 'zipCode' with a value of "<zipCode>"
    And I set query param 'checkOutFlag' with a value of "<flag>"
    When I call method 'GET'
    And I get the response
    Then I verify response code is <statusCode>
    Examples:
      | flag | zipCode | statusCode | storeId |
      | true | 89101   | 401        | 32271   |

  @GetCart @GetCartKeyMissing
  Scenario Outline: Verify create cart when key missing
    Given I have API "Get_Cart"
    And I set content-type as JSON
    And I set ecomm token in request header
    And I set header "x-api-key" with a value of "<key>"
    And I set header "feature" with a value of "<feature>"
    And I set query param 'storeId' with a value of "<storeId>"
    And I set query param 'zipCode' with a value of "<zipCode>"
    And I set query param 'checkOutFlag' with a value of "<flag>"
    When I call method 'GET'
    And I get the response
    Then I verify response code is <statusCode>
    Examples:
      | flag | zipCode | storeId | key | feature | statusCode |
      | true | 89101   | 32271   |     | ecomm   | 401        |

  @GetCart @GetCartParamMissing
  Scenario Outline: Verify Get cart details for zipcode flag or StoreID is missing
    Given I have API "Get_Cart"
    And I set content-type as JSON
    And I set ecomm token in request header
    And I set query param 'storeId' with a value of "<storeId>"
    And I set query param 'zipCode' with a value of "<zipCode>"
    And I set query param 'checkOutFlag' with a value of "<flag>"
    When I call method 'GET'
    And I get the response
    Then I verify response code is <statusCode>
    Examples:
      | flag | zipCode | statusCode | storeId |
      | true |         | 400        | 32271   |
      | true | 56445   | 400        |         |
      |      | 56445   | 200        | 32271   |
