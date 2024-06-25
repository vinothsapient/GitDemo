@api @FD_eCommerce
Feature: Paypal Payment Scenarios

  @PaypalPayment
  Scenario Outline: Verify the Create Paypal Payment API for valid order ID
    Given I have API "PaypalPayment"
    And I set content-type as JSON
    And I set request body for "<requestBody>"
    And I set path param 'orderId' with a value of "22801037299"
    And I set ecomm token in request header
    When I call method 'POST'
    And I get the response
    Then I verify response code is <statusCode>
    Examples:
      | requestBody           | statusCode |
      | validPaymentDetails   | 200        |
      | AmountTotalMissing    | 400        |
      | AmountCurrencyMissing | 400        |
      | AmountSubTotalMissing | 400        |
      | AmountTaxMissing      | 400        |
      | ItemsNameMissing      | 400        |
      | ItemsQuantityMissing  | 400        |
      | ItemsPriceMissing     | 400        |
      | ItemsTaxMissing       | 400        |
      | ItemsCurrencyMissing  | 400        |
      | UrlsReturnMissing     | 400        |
      | UrlsCancelMissing     | 400        |

  @PaypalPaymentHeaderMissing
  Scenario Outline: Verify Paypal Payment when Header missing
    Given I have API "PaypalPayment"
    And I set content-type as JSON
    And I set request body for "<requestBody>"
    And I set ecomm token in request header
    And I set path param 'orderId' with a value of "22801037299"
    And I set header "x-api-key" with a value of "<key>"
    And I set header "feature" with a value of "<feature>"
    When I call method 'POST'
    Then I verify response code is <statusCode>
    Examples:
      | requestBody         | key                                  | feature | statusCode |
      | validPaymentDetails |                                      | ecomm   | 401        |
      | validPaymentDetails | 4678ceb6-cab2-40a9-835c-5607e7f10b45 |         | 503        |
