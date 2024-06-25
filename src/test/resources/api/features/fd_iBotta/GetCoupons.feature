@FD_IBOTTA @API
Feature: Fetch Coupons

  @FetchCoupons @apitest @FD_IBOTTA
  Scenario Outline: Verify user is able to Fetch the coupons with valid details
    Given I have API "<API>"
    And I set content-type as JSON
    And I set header for this req
    And I set path param 'cid' with a value of '1000'
    And  I set header "feature" with a value of "ibotta"
    When I call method 'GET'
    Then I get the response
    Then I verify response code is "<Status_Code>"
    Examples:
      | API                      | Status_Code |
      | Fetch_Coupons_Ibotta     | 200         |

  @FetchCoupons @apitest @FD_IBOTTA
  Scenario Outline: Verify User is unable to Fetch the Coupons without CID
    Given I have API "<API>"
    And I set content-type as JSON
    And I set header for this req
    And I set path param 'cid' with a value of ''
    And  I set header "feature" with a value of "ibotta"
    When I call method 'GET'
    Then I get the response
    Then I verify response code is "<Status_Code>"
    Examples:
      | API                      | Status_Code |
      | Fetch_Coupons_Ibotta     | 400         |

  @FetchCoupons @apitest @FD_IBOTTA
  Scenario Outline: Verify user is able to Fetch the Qualifying Coupons with valid details
    Given I have API "<API>"
    And I set content-type as JSON
    And I set header for this req
    And I set path param 'id' with a value of '372452'
    And I set path param 'cid' with a value of '1000'
    And  I set header "feature" with a value of "ibotta"
    When I call method 'GET'
    Then I get the response
    Then I verify response code is "<Status_Code>"
    Examples:
      | API                                  | Status_Code |
      | Fetch_Qualifying_Coupons_Ibotta      | 200         |


  @FetchCoupons @apitest @FD_IBOTTA
  Scenario Outline: Verify user is unable to Fetch the Qualifying Coupons without cid
    Given I have API "<API>"
    And I set content-type as JSON
    And I set header for this req
    And I set path param 'id' with a value of '372452'
    And I set path param 'cid' with a value of ''
    And  I set header "feature" with a value of "ibotta"
    When I call method 'GET'
    Then I get the response
    Then I verify response code is "<Status_Code>"
    Examples:
      | API                                  | Status_Code |
      | Fetch_Qualifying_Coupons_Ibotta      | 404         |

  @FetchCoupons @apitest @FD_IBOTTA
  Scenario Outline: Verify user is able to Fetch the Qualifying UPCs with valid details
    Given I have API "<API>"
    And I set content-type as JSON
    And I set header for this req
    And I set path param 'offerGroup' with a value of 'IBOTTA'
    And  I set header "feature" with a value of "ibotta"
    When I call method 'GET'
    Then I get the response
    Then I verify response code is "<Status_Code>"
    Examples:
      | API            | Status_Code |
      | Fetch_UPCS     | 200         |


  @FetchCoupons @apitest @FD_IBOTTA
  Scenario Outline: Verify user is unable to Fetch the Qualifying UPCs without valid details
    Given I have API "<API>"
    And I set content-type as JSON
    And I set header for this req
    And I set path param 'offerGroup' with a value of ''
    And  I set header "feature" with a value of "ibotta"
    When I call method 'GET'
    Then I get the response
    Then I verify response code is "<Status_Code>"
    Examples:
      | API            | Status_Code |
      | Fetch_UPCS     | 400         |


