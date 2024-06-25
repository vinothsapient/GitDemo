@api @FD_eCommerce
Feature: Type Ahead Address Search

  @TypeAheadAddressSearch @ValidAddress
  Scenario Outline: Verify the TypeAheadAddressSearch API for Address more than 3 chars
    Given I have API "Type_Ahead_Address_Search"
    And I set content-type as JSON
    And I set header for this req
    And I set query param 'search' with a value of "<Search>"
    When I call method 'GET'
    Then I get the response
    And I verify that there are maximum 7 records for "<JSONArrayName>"
    And I verify response code is <statusCode>
    Examples:
      | statusCode |Search|JSONArrayName|
     | 200       |washington  | addresses |


  @TypeAheadAddressSearch @InvalidAddressType
  Scenario Outline: Verify the TypeAheadAddressSearch API for Address less than 3 chars and Empty address
    Given I have API "Type_Ahead_Address_Search"
    And I set content-type as JSON
    And I set header for this req
    And I set query param 'search' with a value of "<Search>"
    When I call method 'GET'
    Then I get the response
    And I verify response code is <statusCode>
    Examples:
      | statusCode |Search |
      | 400        |wa     |
      | 400        |       |
      | 200        | washingtom  |


  @TypeAheadAddressSearch @InvalidXApiKey
  Scenario Outline: Verify the TypeAheadAddressSearch API for Invalid X-API Key
    Given I have API "Type_Ahead_Address_Search"
    And I set content-type as JSON
    And I set header "x-api-key" with a value of "<key>"
    And I set header "feature" with a value of "<feature>"
    And I set query param 'search' with a value of "<Search>"
    When I call method 'GET'
    Then I get the response
    And I verify response code is <statusCode>
    Examples:
      | statusCode |Search      | key                 | feature |
      |401         |Washington  | 5af2bdb3e-afcs8-4079-ab83-6c148954da7a | ecomm |
      |401         |Washington  |                     | ecomm |

  @TypeAheadAddressSearch @BlankFeature
  Scenario Outline: Verify the TypeAheadAddressSearch API for Blank feature
    Given I have API "Type_Ahead_Address_Search"
    And I set content-type as JSON
    And I set header "x-api-key" with a value of "<key>"
    And I set header "feature" with a value of "<feature>"
    And I set query param 'search' with a value of "<Search>"
    When I call method 'GET'
    And I verify response code is <statusCode>
    Examples:
      | statusCode |Search      | key                                   | feature |
      |404         |Washington  | 4678ceb6-cab2-40a9-835c-5607e7f10b45  |         |