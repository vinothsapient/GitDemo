@FD_IBOTTA @API
Feature: ClipInmar_Coupon


  @ClipInmarCoupon @apitest @FD_IBOTTA
  Scenario Outline: Verify User is able to Clip the Inmar Coupon with Valid details
    Given I have API "<API>"
    And I set content-type as JSON
    And I set request body for "<RequestBody>"
    And I set header for this req
    And I set path param 'id' with a value of '42480'
    And  I set header "feature" with a value of "ibotta"
    And  I set header "ciamuuid" with a value of "4a60756b-efd6-4455-8a04-96993ef3fd22"
    When I call method 'PUT'
    Then I verify response code is 204
    Examples:
      | API             |  RequestBody  |
      |ClipInmar_Coupon | Clip_Data     |

  @ClipInmarCoupon @apitest @FD_IBOTTA
  Scenario Outline: Verify if the coupon is already clipped
    Given I have API "<API>"
    And I set content-type as JSON
    And I set request body for "<RequestBody>"
    And I set header for this req
    And I set path param 'id' with a value of '42480'
    And  I set header "feature" with a value of "ibotta"
    And  I set header "ciamuuid" with a value of "4a60756b-efd6-4455-8a04-96993ef3fd22"
    When I call method 'PUT'
    Then I get the response
    Then I verify response code is 409
    Examples:
      | API             |  RequestBody  |
      |ClipInmar_Coupon | Clip_Data     |

  @ClipInmarCoupon @apitest @FD_IBOTTA
  Scenario Outline: Verify User is unable to Clip the Inmar Coupon with In-Valid details
    Given I have API "<API>"
    And I set content-type as JSON
    And I set request body for "<RequestBody>"
    And I set header for this req
    And I set path param 'id' with a value of '000004'
    And  I set header "feature" with a value of "ibotta"
    And  I set header "ciamuuid" with a value of "4a60756b-efd6-4455-8a04-96993ef3fd22"
    When I call method 'PUT'
    Then I get the response
    Then I verify response code is 400
    Examples:
      | API             |  RequestBody              |
      |ClipInmar_Coupon | Clipwith_Invaild_Data     |


  @ClipInmarCoupon @apitest @FD_IBOTTA
  Scenario Outline: Verify User is able to Clip the Ibotta Coupon with Valid details
    Given I have API "<API>"
    And I set content-type as JSON
    And I set request body for "<RequestBody>"
    And I set header for this req
    And I set path param 'id' with a value of '000004'
    And  I set header "feature" with a value of "ibotta"
    And  I set header "ciamuuid" with a value of "4a60756b-efd6-4455-8a04-96993ef3fd22"
    When I call method 'PUT'
    Then I verify response code is 204
    Examples:
      | API              |  RequestBody    |
      |ClipInmar_Coupon  | Clip_Ibotta     |


  @ClipInmarCoupon @apitest @FD_IBOTTA
  Scenario Outline: Verify User is unable to Clip the Ibotta Coupon with In-Valid details
    Given I have API "<API>"
    And I set content-type as JSON
    And I set request body for "<RequestBody>"
    And I set header for this req
    And I set path param 'id' with a value of '000004'
    And  I set header "feature" with a value of "ibotta"
    And  I set header "ciamuuid" with a value of "4a60756b-efd6-4455-8a04-96993ef3fd22"
    When I call method 'PUT'
    Then I get the response
    Then I verify response code is 400
    Examples:
      | API              |  RequestBody                  |
      |ClipInmar_Coupon  | Clip_Ibotta_In-valid_Data     |


  @ClipInmarCoupon @apitest @FD_IBOTTA
  Scenario Outline: Verify User is able to UnClip the Ibotta Coupon with Valid details
    Given I have API "<API>"
    And I set content-type as JSON
    And I set request body for "<RequestBody>"
    And I set header for this req
    And I set path param 'id' with a value of '000004'
    And  I set header "feature" with a value of "ibotta"
    And  I set header "ciamuuid" with a value of "4a60756b-efd6-4455-8a04-96993ef3fd22"
    When I call method 'PUT'
    Then I verify response code is 204
    Examples:
      | API              |  RequestBody      |
      |ClipInmar_Coupon  | UnClip_Ibotta     |


  @ClipInmarCoupon @apitest @FD_IBOTTA
  Scenario Outline: Verify User is unable to UnClip the Ibotta Coupon with In-Valid details
    Given I have API "<API>"
    And I set content-type as JSON
    And I set request body for "<RequestBody>"
    And I set header for this req
    And I set path param 'id' with a value of '000004'
    And  I set header "feature" with a value of "ibotta"
    And  I set header "ciamuuid" with a value of "4a60756b-efd6-4455-8a04-96993ef3fd22"
    When I call method 'PUT'
    Then I get the response
    Then I verify response code is 400
    Examples:
      | API              |  RequestBody                    |
      |ClipInmar_Coupon  | UnClip_Ibotta_In-vaild_Data     |

  @ClipInmarCoupon @apitest @FD_IBOTTA
  Scenario Outline: Verify User is unable to Clip the Ibotta Coupon with Invalid selection token
    Given I have API "<API>"
    And I set content-type as JSON
    And I set request body for "<RequestBody>"
    And I set header for this req
    And I set path param 'id' with a value of '000004'
    And  I set header "feature" with a value of "ibotta"
    And  I set header "ciamuuid" with a value of "4a60756b-efd6-4455-8a04-96993ef3fd22"
    When I call method 'PUT'
    Then I get the response
    Then I verify response code is 400
    Examples:
      | API              |  RequestBody                           |
      |ClipInmar_Coupon  | Clip_Ibotta_Invalid_selectiontoken     |

  @ClipInmarCoupon @apitest @FD_IBOTTA
  Scenario Outline: Verify User is unable to UnClip the Ibotta Coupon with Invalid selection token
    Given I have API "<API>"
    And I set content-type as JSON
    And I set request body for "<RequestBody>"
    And I set header for this req
    And I set path param 'id' with a value of '000004'
    And  I set header "feature" with a value of "ibotta"
    And  I set header "ciamuuid" with a value of "4a60756b-efd6-4455-8a04-96993ef3fd22"
    When I call method 'PUT'
    Then I get the response
    Then I verify response code is 400
    Examples:
      | API              |  RequestBody               |
      |ClipInmar_Coupon  | Clip_Ibotta_Invalid_Cid    |

  @ClipInmarCoupon @apitest @FD_IBOTTA
  Scenario Outline: Verify User is unable to Clip the Inmar Coupon without mediaPropertyId
    Given I have API "<API>"
    And I set content-type as JSON
    And I set request body for "<RequestBody>"
    And I set header for this req
    And I set path param 'id' with a value of '000004'
    And  I set header "feature" with a value of "ibotta"
    And  I set header "ciamuuid" with a value of "4a60756b-efd6-4455-8a04-96993ef3fd22"
    When I call method 'PUT'
    Then I get the response
    Then I verify response code is 400
    Examples:
      | API              |  RequestBody                  |
      |ClipInmar_Coupon  | Clip_Inmar_mediaPropertyId    |