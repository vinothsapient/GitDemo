@api @FD_eCommerce
Feature: Get Verified Address

  @GetVerifiedAddress @ValidAddressWithSuggestion
  Scenario Outline: Verify the GetVerifiedAddress API for the valid Address- case 1 (Entered Address Need Further Confirmation from User)
    Given I have API "Get_Verified_Address"
    And I set content-type as JSON
    And I set header for this req
    And I set query param 'address' with a value of "<Address>"
    When I call method 'Get'
    Then I get the response
    And I verify response code is <statusCode>
    Examples:
      | statusCode |Address      |
      | 200        |25 Tory Ct , Bedminster NJ 09899   |

  @GetVerifiedAddress @ValidAddressWithoutSuggestion
  Scenario Outline: Verify the GetVerifiedAddress API for the valid Address- case 2 (Entered Address Does Not Need Any Further Confirmation from User)
    Given I have API "Get_Verified_Address"
    And I set content-type as JSON
    And I set header for this req
    And I set query param 'address' with a value of "<Address>"
    When I call method 'Get'
    Then I get the response
    And I verify response code is <statusCode>
    Examples:
      | statusCode |Address      |
      | 200        |25 Tory Ct , Bedminster NJ 07921-1818   |

  @GetVerifiedAddress @InvalidVerifiedAddress
  Scenario Outline: Verify the GetVerifiedAddress API for Invalid and Empty Address
    Given I have API "Get_Verified_Address"
    And I set content-type as JSON
    And I set header for this req
    And I set query param 'address' with a value of "<Address>"
    When I call method 'Get'
    Then I get the response
    And I verify response code is <statusCode>
    Examples:
      | statusCode |Address      |
      | 400        |25 Tory Ct  Bedminster NJ 07921-1818   |
      | 400        |                                       |

  @GetVerifiedAddress @GetVerifiedInvalidApiKey
  Scenario Outline: Verify the GetCompleteAddress API for blank and Invalid X-API
    Given I have API "Get_Verified_Address"
    And I set content-type as JSON
    And I set header "x-api-key" with a value of "<key>"
    And I set header "feature" with a value of "<feature>"
    And I set query param 'address' with a value of "<Address>"
    When I call method 'GET'
    Then I get the response
    And I verify response code is <statusCode>
    Examples:
      | statusCode |Address                             | key | feature |
      | 401        | 25 Tory Ct , Bedminster NJ 09899   |     | ecomm|
      | 401        | 25 Tory Ct , Bedminster NJ 09899   | 123 | ecomm|


  @GetVerifiedAddress @GetVerifiedBlankFeature
  Scenario Outline: Verify the GetCompleteAddress API for blank feature
    Given I have API "Get_Verified_Address"
    And I set content-type as JSON
    And I set header "x-api-key" with a value of "<key>"
    And I set header "feature" with a value of "<feature>"
    And I set query param 'address' with a value of "<Address>"
    When I call method 'GET'
    Then I get the response
    And I verify response code is <statusCode>
    Examples:
      | statusCode |Address                             | key                                    | feature |
      | 404        | 25 Tory Ct , Bedminster NJ 09899   | 4678ceb6-cab2-40a9-835c-5607e7f10b45   |         |
