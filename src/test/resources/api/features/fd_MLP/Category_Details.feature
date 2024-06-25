@test
Feature: Category Details


  @CategoryDetails @FDTMAPPS-471 @FDTMAPPS-473 @ @apitest
  Scenario Outline: Verify if user is able to Fetch Category Details using GET method with valid details
    Given I have API "<API>"
    And I set content-type as JSON
    And I set header for this req
    When I call method 'GET'
    Then I get the response
    Then I verify response code is 200
    Examples:
      | API              |
      | Category_Details |
