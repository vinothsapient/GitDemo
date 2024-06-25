@test
Feature: Coupon Details


  @CouponDetails  @apitest
  Scenario Outline: Verify if user is able to Fetch Coupon Details using GET method with valid details
    Given I have API "<API>"
    And I set content-type as JSON
    And I set header for this req
    When I call method 'GET'
    Then I get the response
    Then I verify response code is 200
    Examples:
      | API            |
      | Coupon_Details |
