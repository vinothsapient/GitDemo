@api @FD_eCommerce
Feature: Sponsored Products Scenarios

  @SponsoredProducts
  Scenario Outline: Verify Sponsored Products for valid Scenarios
    Given I have API "SponsoredProducts"
    And I set content-type as JSON
    And I set header for this req
    And I set header "sessionId" with a value of "80000199738"
    And I set path param 'platform' with a value of "<platform>"
    And I set path param 'placement' with a value of "<placement>"
    And I set query param 'categoryName' with a value of ""
    And I set query param 'searchTerm' with a value of "<searchTerm>"
    When I call method 'GET'
    And I get the response
    Then I verify response code is <statusCode>
    Examples:
      | platform | placement | searchTerm | statusCode |
      | android  | category  |            | 200        |
      | ios      | category  |            | 200        |
      | android  | search    | Chocolate  | 200        |
      | ios      | search    | Chocolate  | 200        |
      | android  | search    |            | 400        |
      | ios      | search    |            | 400        |
      | abc      | category  |            | 400        |
      | abc      | search    | Chocolate  | 400        |
      | android  | 123       | Chocolate  | 400        |
      | ios      | 123       | Chocolate  | 400        |

  @SponsoredProductsPlatformBlank
  Scenario Outline: Verify Sponsored Products for platform blank
    Given I have API "SponsoredProducts"
    And I set content-type as JSON
    And I set header for this req
    And I set header "sessionId" with a value of "80000199738"
    And I set path param 'platform' with a value of " "
    And I set path param 'placement' with a value of "<placement>"
    And I set query param 'searchTerm' with a value of "<searchTerm>"
    When I call method 'GET'
    And I get the response
    Then I verify response code is <statusCode>
    Examples:
      | placement | searchTerm | statusCode |
      | category  |            | 400        |
      | search    | Chocolate  | 400        |

  @SponsoredProductsPlacementBlank
  Scenario Outline: Verify Sponsored Products for placement blank
    Given I have API "SponsoredProducts"
    And I set content-type as JSON
    And I set header for this req
    And I set header "sessionId" with a value of "80000199738"
    And I set path param 'platform' with a value of "<platform>"
    And I set path param 'placement' with a value of " "
    When I call method 'GET'
    And I get the response
    Then I verify response code is <statusCode>
    Examples:
      | platform | statusCode |
      | android  | 400        |
      | ios      | 400        |

  @SponsoredProductsCategoryInvalid
  Scenario Outline: Verify Sponsored Products for Invalid Category
    Given I have API "SponsoredProducts"
    And I set content-type as JSON
    And I set header for this req
    And I set header "sessionId" with a value of "80000199738"
    And I set path param 'platform' with a value of "<platform>"
    And I set path param 'placement' with a value of "category"
    And I set query param 'categoryName' with a value of "123"
    When I call method 'GET'
    And I get the response
    Then I verify response code is <statusCode>
    Examples:
      | platform | statusCode |
      | android  | 400        |
      | ios      | 400        |

  @SponsoredProductsCategoryCombination
  Scenario Outline: Verify Sponsored Products for Category Combination
    Given I have API "SponsoredProducts"
    And I set content-type as JSON
    And I set header for this req
    And I set header "sessionId" with a value of "80000199738"
    And I set path param 'platform' with a value of "<platform>"
    And I set path param 'placement' with a value of "category"
    And I set query param 'searchTerm' with a value of "Chocolate"
    When I call method 'GET'
    And I get the response
    Then I verify response code is <statusCode>
    Examples:
      | platform | statusCode |
      | android  | 400        |
      | ios      | 400        |

  @SponsoredProductsSearchCombination
  Scenario Outline: Verify Sponsored Products for Search Combination
    Given I have API "SponsoredProducts"
    And I set content-type as JSON
    And I set header for this req
    And I set header "sessionId" with a value of "80000199738"
    And I set path param 'platform' with a value of "<platform>"
    And I set path param 'placement' with a value of "search"
    And I set query param 'searchTerm' with a value of "Chocolate"
    And I set query param 'categoryName' with a value of "123"
    When I call method 'GET'
    And I get the response
    Then I verify response code is <statusCode>
    Examples:
      | platform | statusCode |
      | android  | 400        |
      | ios      | 400        |

  @SponsoredProductsWithLimit
  Scenario Outline: Verify Sponsored Products With Limit
    Given I have API "SponsoredProducts"
    And I set content-type as JSON
    And I set header for this req
    And I set header "sessionId" with a value of "80000199738"
    And I set path param 'platform' with a value of "<platform>"
    And I set path param 'placement' with a value of "<placement>"
    And I set query param 'categoryName' with a value of "<categoryName>"
    And I set query param 'searchTerm' with a value of "<searchTerm>"
    And I set query param 'limit' with a value of "<limit>"
    When I call method 'GET'
    And I get the response
    Then I verify response code is <statusCode>
    Examples:
      | platform | placement | categoryName     | searchTerm | limit | statusCode |
      | android  | category  | cooking & baking |            | 2     | 200        |
      | ios      | search    |                  | Chocolate  | 0     | 400        |

  @SponsoredProductsHeaderMissing
  Scenario Outline: Verify Sponsored Products when Header missing
    Given I have API "SponsoredProducts"
    And I set content-type as JSON
    And I set header "sessionId" with a value of "80000199738"
    And I set header "x-api-key" with a value of "<key>"
    And I set header "feature" with a value of "<feature>"
    And I set path param 'platform' with a value of "android"
    And I set path param 'placement' with a value of "category"
    When I call method 'GET'
    Then I verify response code is <statusCode>
    Examples:
      | key                                  | feature | statusCode |
      |                                      | ecomm   | 401        |
      | 4678ceb6-cab2-40a9-835c-5607e7f10b45 |         | 200        |

  @SponsoredProductsWithoutSessionId
  Scenario: Verify Sponsored Products when SessionId is missing in Header
    Given I have API "SponsoredProducts"
    And I set content-type as JSON
    And I set path param 'platform' with a value of "android"
    And I set path param 'placement' with a value of "category"
    When I call method 'GET'
    And I get the response
    Then I verify response code is 403
