@test
Feature: Scan Barcode search

  @ScanBarcodeDetails @FDTMAPPS-728 @apitest
  Scenario Outline: verify the Scan Barcode search
    Given I have API "<API>"
    And I set content-type as JSON
    And I set header for this req
    When I call method 'GET'
    Then I get the response
    Then I verify response code is 200
    Examples:
      | API              |
      | user_not_found   |