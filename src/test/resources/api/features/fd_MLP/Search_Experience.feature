@test
Feature: Search experience

  @SearchExperienceDetails @FDTMAPPS-737 @apitest
  Scenario Outline: Validate the Search Experience api
    Given I have API "<API>"
    And I set content-type as JSON
    And I set header for this req
    When I call method 'GET'
    Then I get the response
    Then I verify response code is 200
    Examples:
      | API                         |
      | search_experience_details   |

  @SearchExperienceDetails @FDTMAPPS-737 @apitest
  Scenario Outline: Validate the Trending Search API
    Given I have API "<API>"
    And I set content-type as JSON
    And I set header for this req
    When I call method 'GET'
    Then I get the response
    Then I verify response code is 200
    Examples:
      | API                         |
      | trending_search_details     |

  @SearchExperienceDetails @FDTMAPPS-737 @apitest
  Scenario Outline: Validate the TypeHead search API
    Given I have API "<API>"
    And I set content-type as JSON
    And I set header for this req
    When I call method 'GET'
    Then I get the response
    Then I verify response code is 200
    Examples:
      | API                         |
      | typehead_search_details     |