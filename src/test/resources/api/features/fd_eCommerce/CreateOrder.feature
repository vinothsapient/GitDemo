@api @FD_eCommerce
Feature: Create Order Scenarios

  @CreateOrder
  Scenario Outline: Verify the Create Order API for valid order ID
    Given I have API "CreateOrder"
    And I set content-type as JSON
    And I set request body for "<requestBody>"
    And I set path param 'orderId' with a value of "22801037299"
    And I set query param 'storeId' with a value of "<storeId>"
    And I set query param 'zipCode' with a value of "<zipCode>"
    And I set ecomm token in request header
    When I call method 'POST'
    And I get the response
    Then I verify response code is <statusCode>
    Examples:
      | requestBody                       | storeId | zipCode | statusCode |
      | validOrderDetails                 | 12275   | 23504   | 200        |
      | validOrderDetails                 |         | 23504   | 400        |
      | validOrderDetails                 | 12275   |         | 400        |
      | ProductIdMissing                  | 12275   | 23504   | 400        |
      | QuantityMissing                   | 12275   | 23504   | 400        |
      | QuantityInvalid                   | 12275   | 23504   | 400        |
      | DeliveryOptionMissing             | 12275   | 23504   | 400        |
      | DeliveryOptionInvalid             | 12275   | 23504   | 400        |
      | OrderTotalMissing                 | 12275   | 23504   | 400        |
      | ShippingAddressMissing            | 12275   | 23504   | 400        |
      | ShippingAddressFirstNameMissing   | 12275   | 23504   | 400        |
      | ShippingAddressLastNameMissing    | 12275   | 23504   | 400        |
      | ShippingAddressCountryMissing     | 12275   | 23504   | 400        |
      | ShippingAddressPostalCodeMissing  | 12275   | 23504   | 400        |
      | ShippingAddressAddress1Missing    | 12275   | 23504   | 400        |
      | ShippingAddressCityMissing        | 12275   | 23504   | 400        |
      | ShippingAddressStateMissing       | 12275   | 23504   | 400        |
      | ShippingAddressPhoneNumberMissing | 12275   | 23504   | 400        |
      | ShippingAddressPhoneNumberInvalid | 12275   | 23504   | 400        |
      | ShippingAddressEmailMissing       | 12275   | 23504   | 400        |
      | ShippingAddressEmailInvalid       | 12275   | 23504   | 400        |
      | BillingAddressMissing             | 12275   | 23504   | 400        |
      | BillingAddressFirstNameMissing    | 12275   | 23504   | 400        |
      | BillingAddressLastNameMissing     | 12275   | 23504   | 400        |
      | BillingAddressCountryMissing      | 12275   | 23504   | 400        |
      | BillingAddressPostalCodeMissing   | 12275   | 23504   | 400        |
      | BillingAddressAddress1Missing     | 12275   | 23504   | 400        |
      | BillingAddressCityMissing         | 12275   | 23504   | 400        |
      | BillingAddressStateMissing        | 12275   | 23504   | 400        |
      | BillingAddressPhoneNumberMissing  | 12275   | 23504   | 400        |
      | BillingAddressPhoneNumberInvalid  | 12275   | 23504   | 400        |
      | BillingAddressEmailMissing        | 12275   | 23504   | 400        |
      | BillingAddressEmailInvalid        | 12275   | 23504   | 400        |
      | PaymentMissing                    | 12275   | 23504   | 400        |
      | PaymentTypeMissing                | 12275   | 23504   | 400        |
      | PaymentEmailMissing               | 12275   | 23504   | 400        |
      | PaymentNameOnCardMissing          | 12275   | 23504   | 400        |
      | PaymentCardTypeMissing            | 12275   | 23504   | 400        |
      | PaymentTokenMissing               | 12275   | 23504   | 400        |
      | PaymentMaskedPanMissing           | 12275   | 23504   | 400        |
      | PaymentEndMonthMissing            | 12275   | 23504   | 400        |
      | PaymentEndYearMissing             | 12275   | 23504   | 400        |
      | PaymentTotalMissing               | 12275   | 23504   | 400        |
      | AmountAuthorizedMissing           | 12275   | 23504   | 400        |
      | AmountTotalMissing                | 12275   | 23504   | 400        |
      | PayerIDMissing                    | 12275   | 23504   | 400        |
      | CreateTimeMissing                 | 12275   | 23504   | 400        |
      | PayerStatusMissing                | 12275   | 23504   | 400        |
      | PaymentIdMissing                  | 12275   | 23504   | 400        |
      | TransactionStateMissing           | 12275   | 23504   | 400        |
      | RedirectURLMissing                | 12275   | 23504   | 400        |
      | MerchantTransactionIdMissing      | 12275   | 23504   | 400        |

  @CreateOrderMissingOrderId
  Scenario: Verify the Create Order API for Missing order ID
    Given I have API "CreateOrder"
    And I set content-type as JSON
    And I set request body for "validOrderDetails"
    And I set ecomm token in request header
    When I call method 'POST'
    And I get the response
    Then I verify response code is 400

  @CreateOrderWithTokenMissing
  Scenario: Verify the Create Order API for valid order ID and missing token
    Given I have API "CreateOrder"
    And I set content-type as JSON
    And I set request body for "<requestBody>"
    And I set path param 'orderId' with a value of "<orderId>"
    And I set query param 'storeId' with a value of "<storeId>"
    And I set query param 'zipCode' with a value of "<zipCode>"
    When I call method 'POST'
    And I get the response
    Then I verify response code is 400

  @CreateOrderWithTokenExpired
  Scenario: Verify create order when Header ecommerce token expired
    Given I have API "ExpiredTokenCreateOrder"
    And I set content-type as JSON
    And I set request body for "validCartDetails"
    And I set header for this req
    When I call method 'POST'
    And I get the response
    Then I verify response code is 401

  @UpdateOrderWithHeaderMissing
  Scenario Outline: Verify Create Order when Header missing
    Given I have API "CreateOrder"
    And I set content-type as JSON
    And I set request body for "<requestBody>"
    And I set path param 'orderId' with a value of "<orderId>"
    And I set query param 'storeId' with a value of "<storeId>"
    And I set query param 'zipCode' with a value of "<zipCode>"
    And I set ecomm token in request header
    And I set header "x-api-key" with a value of "<key>"
    And I set header "feature" with a value of "<feature>"
    When I call method 'POST'
    Then I verify response code is <statusCode>
    Examples:
      | requestBody       | key                                  | feature | statusCode |
      | validOrderDetails |                                      | ecomm   | 401        |
      | validOrderDetails | 4678ceb6-cab2-40a9-835c-5607e7f10b45 |         | 404        |
