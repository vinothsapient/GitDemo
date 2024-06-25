@api @FD_eCommerce
Feature: Get Complete Address

  @GetCompleteAddress @AddressForValidID
  Scenario Outline: Verify the GetCompleteAddress API for valid ID
    Given I have API "Get_Complete_Address"
    And I set content-type as JSON
    And I set header for this req
    And I set query param 'id' with a value of "<ID>"
    When I call method 'GET'
    Then I get the response
    And I verify response code is <statusCode>
    Examples:
      | statusCode |ID |
      | 200        |aWQ9MSBXYXNoaW5ndG9uLCBCYXNjbyBJTCA2MjMxMywgVW5pdGVkIFN0YXRlcyBPZiBBbWVyaWNhfmFsdF9rZXk9fDEgV2FzaGluZ3Rvbnx8QmFzY28sSUwsNjIzMTMtMTAyMX5kYXRhc2V0PVVTQV9QQUZ-Zm9ybWF0aWQ9M2VkNmE4MDItMTk3Yi00ODhhLWE0NDMtZDhhMTA1NzhjMTI5X1U0MF8yNF8wXzBfMD0xfnFsPTEwfmdlbz0w  |

  @GetCompleteAddress @AddressForInValidAndBlankID
  Scenario Outline: Verify the GetCompleteAddress API for Invalid and Blank ID
    Given I have API "Get_Complete_Address"
    And I set content-type as JSON
    And I set header for this req
    And I set query param 'id' with a value of "<ID>"
    When I call method 'GET'
    Then I get the response
    And I verify response code is <statusCode>
    Examples:
      | statusCode |ID |
      | 200        | aWQ9MSBXYXNoaW5ndG9uLCBCYXNjbyBJTCA2MjMxMywgVW5pdGVkIFN0YXRlcyBPZiBBbWVyaWNhfmFsdF9rZXk9fDEgV2FzaGluZ3Rvbnx8QmFzY28sSUwsNjIzMTMtMTAyMX5kYXRhc2V0PVVTQV9QQUZ-Zm9ybWF0aWQ9M2VkNmE4MDItMTk3Yi00ODhhLWE0NDMtZDhhMTA1NzhjMTI5X1U0MF8yNF8wXzBfMD0xfnFsPTEwfmdlbz0w |
      | 400        |                                                                                                                                    |

  @GetCompleteAddress @GetCompleteAddressBlankAndInvalidXApiKey
  Scenario Outline: Verify the GetCompleteAddress API for blank and Invalid X-API
    Given I have API "Get_Complete_Address"
    And I set content-type as JSON
    And I set header "x-api-key" with a value of "<key>"
    And I set header "feature" with a value of "<feature>"
    And I set query param 'id' with a value of "<ID>"
    When I call method 'GET'
    Then I get the response
    And I verify response code is <statusCode>
    Examples:
      | statusCode |ID | key | feature |
      | 401        | aWQ9MSBXYXNoaW5ndG9uLCBCYXNjbyBJTCA2MjMxMywgVW5pdGVkIFN0YXRlcyBPZiBBbWVyaWNhfmFsdF9rZXk9fDEgV2FzaGluZ3Rvbnx8QmFzY28sSUwsNjIzMTMtMTAyMX5kYXRhc2V0PVVTQV9QQUZ-Zm9ybWF0aWQ9M2VkNmE4MDItMTk3Yi00ODhhLWE0NDMtZDhhMTA1NzhjMTI5X1U0MF8yNF8wXzBfMD0xfnFsPTEwfmdlbz0w  | | ecomm|
      | 401        | aWQ9MSBXYXNoaW5ndG9uLCBCYXNjbyBJTCA2MjMxMywgVW5pdGVkIFN0YXRlcyBPZiBBbWVyaWNhfmFsdF9rZXk9fDEgV2FzaGluZ3Rvbnx8QmFzY28sSUwsNjIzMTMtMTAyMX5kYXRhc2V0PVVTQV9QQUZ-Zm9ybWF0aWQ9M2VkNmE4MDItMTk3Yi00ODhhLWE0NDMtZDhhMTA1NzhjMTI5X1U0MF8yNF8wXzBfMD0xfnFsPTEwfmdlbz0w  | 123 | ecomm|


@GetCompleteAddress @GetCompleteAddressBlankFeature
  Scenario Outline: Verify the GetCompleteAddress API for feature value as blank
    Given I have API "Get_Complete_Address"
    And I set content-type as JSON
    And I set header "x-api-key" with a value of "<key>"
    And I set header "feature" with a value of "<feature>"
    And I set query param 'id' with a value of "<ID>"
    When I call method 'GET'
    Then I verify response code is <statusCode>
    Examples:
      | statusCode |ID | key | feature |
      | 404        | aWQ9MSBXYXNoaW5ndG9uLCBCYXNjbyBJTCA2MjMxMywgVW5pdGVkIFN0YXRlcyBPZiBBbWVyaWNhfmFsdF9rZXk9fDEgV2FzaGluZ3Rvbnx8QmFzY28sSUwsNjIzMTMtMTAyMX5kYXRhc2V0PVVTQV9QQUZ-Zm9ybWF0aWQ9M2VkNmE4MDItMTk3Yi00ODhhLWE0NDMtZDhhMTA1NzhjMTI5X1U0MF8yNF8wXzBfMD0xfnFsPTEwfmdlbz0w |4678ceb6-cab2-40a9-835c-5607e7f10b45| |