@API
Feature: Qualifying_UPCs


  @Qualifying_UPCs  @apitest
  Scenario Outline: Verify if user is able to Fetch Qualifying_UPCs Details using GET method with valid details
    Given I have API "<API>"
    And I set content-type as JSON
    And I set header for this req
    When I call method 'GET'
    Then I get the response
    Then I verify response code is 200
    Examples:
      | API            |
      | Qualifying_UPCs|
