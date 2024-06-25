@test
Feature: Content Experience

  @ContentExperience
  Scenario Outline: verify the Content Experience Feature
    Given I have API "<API>"
    And I set content-type as JSON
    And I set header for this req
    When I call method 'GET'
    Then I get the response
    Then I verify response code is 200
    Examples:
      | API                  |
      | Content_Experience   |