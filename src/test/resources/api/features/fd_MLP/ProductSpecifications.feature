@test
Feature: Product Specifications


  @ProductSearch @FDTMAPPS-822  @apitest
  Scenario Outline: Verify if user is able to fetch the product specifications using GET method using product Id
    Given I have API "<API>"
    And I set content-type as JSON
    And I set header for this req
    When I call method 'GET'
    Then I get the response
    Then I verify response code is 200
    Examples:
      | API              |
      | Products_Details |


  @ProductSearch @FDTMAPPS-822 @apitest
  Scenario Outline: Verify if user is able to Get the product specifications using GET method using product Id
    Given I have API "<API>"
    And I set content-type as JSON
    And I set header for this req
    When I call method 'GET'
    Then I get the response
    Then I verify response code is 200
    Examples:
      | API                    |
      | Product_Specifications |
