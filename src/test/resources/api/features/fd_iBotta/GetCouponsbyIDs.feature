@FD_IBOTTA @API
Feature: Fetch Coupons

  @GetCouponsByIDs @apitest @FD_IBOTTA
  Scenario Outline: Verify User is able to fetch the coupons details with Valid cid and ids for Logged In user
    Given I have API "<API>"
    And I set content-type as JSON
    And I set header for this req
    And I set path param 'ids' with a value of '100,200'
    And I set path param 'cid' with a value of '1000'
    When I call method 'GET'
    Then I get the response
    Then I verify response code is "<Status_Code>"
    Examples:
      | API                         | Status_Code |
      | Fetch_Coupons_By_IDs        | 200         |

  @GetCouponsByIDs @apitest @FD_IBOTTA
  Scenario Outline: Verify User is able to fetch the coupons details with Valid cid and ids for Guest In user
    Given I have API "<API>"
    And I set content-type as JSON
    And I set header for this req
    And I set path param 'ids' with a value of '100,200'
    And I set path param 'cid' with a value of 'guest'
    When I call method 'GET'
    Then I get the response
    Then I verify response code is "<Status_Code>"
    Examples:
      | API                         | Status_Code |
      | Fetch_Coupons_By_IDs        | 200         |

  @GetCouponsByIDs @apitest @FD_IBOTTA
  Scenario Outline: Verify User is unable to fetch the coupons details with ids and without cid
    Given I have API "<API>"
    And I set content-type as JSON
    And I set header for this req
    And I set path param 'ids' with a value of '100,200'
    And I set path param 'cid' with a value of ''
    When I call method 'GET'
    Then I get the response
    Then I verify response code is "<Status_Code>"
    Examples:
      | API                         | Status_Code |
      | Fetch_Coupons_By_IDs        | 400         |

  @GetclippedCoupons @apitest @FD_IBOTTA
  Scenario Outline: Verify User is able to fetch the Clipped coupons with valid cid for Logged In user
    Given I have API "<API>"
    And I set content-type as JSON
    And I set header for this req
    And I set path param 'states' with a value of 'CLIPPED'
    And I set path param 'cid' with a value of '100'
    When I call method 'GET'
    Then I get the response
    Then I verify response code is "<Status_Code>"
    Examples:
      | API                         | Status_Code |
      | Fetch_Clipped_Coupons       | 200         |

  @GetclippedCoupons @apitest @FD_IBOTTA
  Scenario Outline: Verify User is able to fetch the Clipped coupons with valid cid for Guest In user
    Given I have API "<API>"
    And I set content-type as JSON
    And I set header for this req
    And I set path param 'states' with a value of 'CLIPPED'
    And I set path param 'cid' with a value of 'guest'
    When I call method 'GET'
    Then I get the response
    Then I verify response code is "<Status_Code>"
    Examples:
      | API                         | Status_Code |
      | Fetch_Clipped_Coupons       | 200         |

  @GetclippedCoupons @apitest @FD_IBOTTA
  Scenario Outline: Verify User is able to fetch the Available coupons with valid cid for Logged In user
    Given I have API "<API>"
    And I set content-type as JSON
    And I set header for this req
    And I set path param 'states' with a value of 'AVAILABLE'
    And I set path param 'cid' with a value of '1000'
    When I call method 'GET'
    Then I get the response
    Then I verify response code is "<Status_Code>"
    Examples:
      | API                         | Status_Code |
      | Fetch_Clipped_Coupons       | 200         |


  @GetclippedCoupons @apitest @FD_IBOTTA
  Scenario Outline: Verify User is unable to fetch the Clipped coupons without cid
    Given I have API "<API>"
    And I set content-type as JSON
    And I set header for this req
    And I set path param 'states' with a value of 'CLIPPED'
    And I set path param 'cid' with a value of ''
    When I call method 'GET'
    Then I get the response
    Then I verify response code is "<Status_Code>"
    Examples:
      | API                         | Status_Code |
      | Fetch_Clipped_Coupons       | 404         |


  @GetCouponsBykeyword @apitest @FD_IBOTTA
  Scenario Outline: Verify User is able to fetch the coupons with Valid cid and keyword for Logged In user
    Given I have API "<API>"
    And I set content-type as JSON
    And I set header for this req
    And I set path param 'keyword' with a value of 'dove'
    And I set path param 'cid' with a value of '1000'
    When I call method 'GET'
    Then I get the response
    Then I verify response code is "<Status_Code>"
    Examples:
      | API                            | Status_Code |
      | Fetch_Coupons_By_Keyword       | 200         |

  @GetCouponsBykeyword @apitest @FD_IBOTTA
  Scenario Outline: Verify User is able to fetch the coupons with Valid cid and keyword for Guest In user
    Given I have API "<API>"
    And I set content-type as JSON
    And I set header for this req
    And I set path param 'keyword' with a value of 'dove'
    And I set path param 'cid' with a value of 'guest'
    When I call method 'GET'
    Then I get the response
    Then I verify response code is "<Status_Code>"
    Examples:
      | API                            | Status_Code |
      | Fetch_Coupons_By_Keyword       | 200         |

  @GetCouponsBykeyword @apitest @FD_IBOTTA
  Scenario Outline: Verify User is unable to fetch the coupons with  Keyword and without cid
    Given I have API "<API>"
    And I set content-type as JSON
    And I set header for this req
    And I set path param 'keyword' with a value of 'dove'
    And I set path param 'cid' with a value of ''
    When I call method 'GET'
    Then I get the response
    Then I verify response code is "<Status_Code>"
    Examples:
      | API                            | Status_Code |
      | Fetch_Coupons_By_Keyword       | 404         |

  @GetCouponsByCategory @apitest @FD_IBOTTA
  Scenario Outline: Verify User is able to fetch the coupons by category with valid cid for Logged In user
    Given I have API "<API>"
    And I set content-type as JSON
    And I set header for this req
    And I set path param 'category' with a value of 'fd-personal-care'
    And I set path param 'cid' with a value of '1000'
    When I call method 'GET'
    Then I get the response
    Then I verify response code is "<Status_Code>"
    Examples:
      | API                             | Status_Code |
      | Fetch_Coupons_By_Category       | 200         |

  @GetCouponsByCategory @apitest @FD_IBOTTA
  Scenario Outline: Verify User is able to fetch the coupons by category with valid cid for Guest In user
    Given I have API "<API>"
    And I set content-type as JSON
    And I set header for this req
    And I set path param 'category' with a value of 'fd-personal-care'
    And I set path param 'cid' with a value of 'guest'
    When I call method 'GET'
    Then I get the response
    Then I verify response code is "<Status_Code>"
    Examples:
      | API                             | Status_Code |
      | Fetch_Coupons_By_Category       | 200         |

  @GetCouponsByCategory @apitest @FD_IBOTTA
  Scenario Outline: Verify User is unable to fetch the coupons by category without cid
    Given I have API "<API>"
    And I set content-type as JSON
    And I set header for this req
    And I set path param 'category' with a value of 'fd-personal-care'
    And I set path param 'cid' with a value of ''
    When I call method 'GET'
    Then I get the response
    Then I verify response code is "<Status_Code>"
    Examples:
      | API                             | Status_Code |
      | Fetch_Coupons_By_Category       | 404         |

  @GetCouponsByUPCs @apitest @FD_IBOTTA
  Scenario Outline: Verify User is able to fetch the coupons by UPCs with Valid cid for Logged In user
    Given I have API "<API>"
    And I set content-type as JSON
    And I set header for this req
    And I set path param 'upcs' with a value of '00011111634619,00001258722242'
    And I set path param 'cid' with a value of '1000'
    When I call method 'GET'
    Then I get the response
    Then I verify response code is "<Status_Code>"
    Examples:
      | API                             | Status_Code |
      | Fetch_Coupons_By_upcs           | 200         |

  @GetCouponsByUPCs @apitest @FD_IBOTTA
  Scenario Outline: Verify User is able to fetch the coupons by UPCs with Valid cid for guest user
    Given I have API "<API>"
    And I set content-type as JSON
    And I set header for this req
    And I set path param 'upcs' with a value of '00011111634619,00001258722242'
    And I set path param 'cid' with a value of 'guest'
    When I call method 'GET'
    Then I get the response
    Then I verify response code is "<Status_Code>"
    Examples:
      | API                             | Status_Code |
      | Fetch_Coupons_By_upcs           | 200         |

  @GetCouponsByUPCs @apitest @FD_IBOTTA
  Scenario Outline: Verify User is unable to fetch the coupons by UPCs without Valid cid
    Given I have API "<API>"
    And I set content-type as JSON
    And I set header for this req
    And I set path param 'upcs' with a value of '00011111634619,00001258722242'
    And I set path param 'cid' with a value of ''
    When I call method 'GET'
    Then I get the response
    Then I verify response code is "<Status_Code>"
    Examples:
      | API                             | Status_Code |
      | Fetch_Coupons_By_upcs           | 404         |

  @GetRedeemedCoupons @apitest @FD_IBOTTA
  Scenario Outline: Verify User is able to fetch the Redeemed coupons with Valid cid for Logged In user
    Given I have API "<API>"
    And I set content-type as JSON
    And I set header for this req
    And I set path param 'states' with a value of 'REDEEMED'
    And I set path param 'cid' with a value of '1000'
    When I call method 'GET'
    Then I get the response
    Then I verify response code is "<Status_Code>"
    Examples:
      | API                             | Status_Code |
      | Fetch_Redeemed_Coupons          | 200         |

  @GetRedeemedCoupons @apitest @FD_IBOTTA
  Scenario Outline: Verify User is able to fetch the Redeemed coupons with Valid cid for Guest In user
    Given I have API "<API>"
    And I set content-type as JSON
    And I set header for this req
    And I set path param 'states' with a value of 'REDEEMED'
    And I set path param 'cid' with a value of 'guest'
    When I call method 'GET'
    Then I get the response
    Then I verify response code is "<Status_Code>"
    Examples:
      | API                             | Status_Code |
      | Fetch_Redeemed_Coupons          | 200         |


  @GetRedeemedCoupons @apitest @FD_IBOTTA
  Scenario Outline: Verify User is unable to fetch the Redeemed coupons without Valid cid
    Given I have API "<API>"
    And I set content-type as JSON
    And I set header for this req
    And I set path param 'states' with a value of 'REDEEMED'
    And I set path param 'cid' with a value of ''
    When I call method 'GET'
    Then I get the response
    Then I verify response code is "<Status_Code>"
    Examples:
      | API                             | Status_Code |
      | Fetch_Redeemed_Coupons          | 404         |

  @GetCouponsByUPCs @apitest @FD_IBOTTA
  Scenario Outline: Verify User is able to fetch the coupons by UPCs with Valid cid for guest user
    Given I have API "<API>"
    And I set content-type as JSON
    And I set header for this req
    And I set path param 'upcs' with a value of '000111116346196477764764'
    And I set path param 'cid' with a value of 'guest'
    When I call method 'GET'
    Then I get the response
    Then I verify response code is "<Status_Code>"
    Examples:
      | API                             | Status_Code |
      | Fetch_Coupons_By_upcs           | 400         |