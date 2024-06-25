@test
Feature: Marketing experience Feature

  @MarketingExperience @apitest
  Scenario Outline: verify the Marketing Experience Feature
    Given I have API "<API>"
    And I set content-type as JSON
    And I set header for this req
    When I call method 'GET'
    Then I get the response
    Then I verify response code is 200
    Examples:
      | API                  |
      | Publications_Store   |

  @MarketingExperience @apitest
  Scenario Outline: verify the Citrus Banner HomePage Feature
    Given I have API "<API>"
    And I set content-type as JSON
    And I set header for this req
    And I set request body for "<RequestBody>"
    When I call method 'POST'
    Then I get the response
    Then I verify response code is 200
    Examples:
      | API            |   RequestBody   |
      | Citrus_Ads     |  user_data      |

  @MarketingExperience @apitest
  Scenario Outline: verify the Citrus Banner Category Feature
    Given I have API "<API>"
    And I set content-type as JSON
    And I set header for this req
    And I set request body for "<RequestBody>"
    When I call method 'POST'
    Then I get the response
    Then I verify response code is 200
    Examples:
      | API                     |   RequestBody   |
      | Citrus_Ads_Category     |  user_data      |

  @MarketingExperience @apitest
  Scenario Outline: verify the Citrus Banner Brand Home Feature
    Given I have API "<API>"
    And I set content-type as JSON
    And I set header for this req
    And I set request body for "<RequestBody>"
    When I call method 'POST'
    Then I get the response
    Then I verify response code is 200
    Examples:
      | API                      |   RequestBody   |
      | Citrus_Ads_BrandHome     |  user_data      |

  @MarketingExperience @apitest
  Scenario Outline: verify the Citrus Banner Coupons Feature
    Given I have API "<API>"
    And I set content-type as JSON
    And I set header for this req
    And I set request body for "<RequestBody>"
    When I call method 'POST'
    Then I get the response
    Then I verify response code is 200
    Examples:
      | API                      |   RequestBody   |
      | Citrus_Ads_Coupons       |  user_data      |