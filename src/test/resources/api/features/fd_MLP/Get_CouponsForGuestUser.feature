@test
Feature: Get Coupons feature

  @FecthCoupons @FDTMAPPS-1246  @apitest
  Scenario Outline: Validate the Get Coupons API
    Given I have API "<API>"
    And I set content-type as JSON
    And I set header for this req
    When I call method 'GET'
    Then I get the response
    Then I verify response code is 200
    Examples:
      | API              |
      | fetch_coupons    |