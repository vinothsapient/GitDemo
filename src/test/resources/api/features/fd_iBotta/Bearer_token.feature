@FD_IBOTTA @API

Feature: Bearer token
  Background: Generate the Bearer Token
    Given I have API "Bearer_token"
    And I set content-type as JSON
    And I set request body for "token Body"
    When I call method 'POST'
    Then I get the response
    Then I verify response code is 200
    And I get the "access_token" from response body

  @ProductSearchId @apitest @FD_IBOTTA
  Scenario Outline: Verify if user is able to Fetch Product Search using POST method with valid details
    Given I have API "<API>"
    And I set content-type as JSON
    And I set request body for "Body"
    And I set header for this req with bearer token
    When I call method 'POST'
    Then I get the response
    Then I verify response code is 200
    Examples:
      | API |
      | search_product_identifier |