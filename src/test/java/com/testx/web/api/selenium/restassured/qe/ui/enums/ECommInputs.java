package com.testx.web.api.selenium.restassured.qe.ui.enums;

public enum ECommInputs {
  IN_STORE_PICKUP("In-Store Pickup"),
  NOTE_DESC("There is a Max of 6 per item for app orders to help with fulfillment and availability for users."),
  NOTE_DESC_OUT_OF_STOCK("This item is not available for in-app purchases. Visit your store to purchase."),
  LIMITED_STOCK("Your store has low stock, visit your store or to purchase online check nearby stores with in-stock quantities."),
  MAX_ITEM_TITLE("Maximum Items Reached"),
  MAX_ITEM_DESC("You have met the maximum amount of 6 items to your cart."),
  ADD_TO_CART("Add to Cart"),
  VIEW_CART("View Cart"),
  PAYMENT_INFORMATION("Payment Information"),
  PAYMENT("Payment"),
  ADD("Add"),
  TEXT_UPDATES("Text Updates (Optional)"),
  SMS_UPDATES_MESSAGE("This phone number is associated with your profile. You will be able to edit this phone number after your order is placed."),
  ORDER_UPDATES_MESSAGE("Enable order updates to receive text notifications related to your order."),
  TERMS_AND_PRIVACY_POLICY("By signing up, you agree to get text order updates from Family Dollar. Up to 5 messages per order. Message & data rates may apply. Reply STOP to opt out or HELP for more information. View our0 and0"),
  MARKETING_NOTIFICATIONS_MESSAGE("Enable order updates to receive text notifications related to your order"),
  RECENT_ORDERS("Recent Orders"),
  VIEW_ALL("View All"),
  ORDER_CONFIRMATION("Order confirmation and updates will be emailed to"),
  PLACE_ORDER_DESC("By clicking ‘Place Order’ you are agreeing to our"),
  SMART_COUPON_SECTION("Any clipped Smart Coupons™ in the app are only redeemable on purchases in store and are not applied or valid for In-Store Pickup or Ship to Home orders."),
  WANT_TO_ADD_REMOVE("Want to add or remove items?"),
  RETURN_TO_CART("Return to Cart"),
  PLACE_ORDER("Place Order"),
  THANK_YOU_MESSAGE("Thank you for your order!"),
  ORDER_ID("Order #"),
  VIEW_ORDER_DETAILS("View Order Details"),
  PICK_UP_DETAILS("Pick Up Details"),
  GET_DIRECTIONS("Get Directions"),
  PICK_UP_PERSON("Pick Up Person"),
  ITEMS_IN_ORDER("Items in Order"),
  QUANTITY("Qty"),
  BUY_AGAIN("Buy Again"),
  PAID_VIA_PAYPAL("Paid via PayPal"),
  IN_STORE_PICK_DETAILS("In-Store Pickup Details"),
  FREE_PICKUP("FREE Pickup"),
  TODAY("Today."),
  TOMORROW("Tomorrow."),
  ORDER_WITHIN("Order within"),
  FAMILY_DOLLAR("FAMILY DOLLAR #"),
  YOUR_ORDERS("Your Orders"),
  CANCELLATION_REASON("Cancellation Reason"),
  CANCELLATION_REASON_TEXT(
      "We regret to inform you that part or all of your order has been cancelled. Please see the item(s) listed below for the cancellation reason.\n"
          + "\n"
          + "Please note: At the time your order was placed, a pending authorization was placed on your form of payment for the entire order amount. However, you are only charged for the items that you receive. You are not charged for items that have been cancelled from the order.\n"
          + "\n"
          + "Questions? Give us a call at 833-232-0002-- We’re happy to help!”"),
  ITEMS_CANCELLED("Item(s) Cancelled"),
  SUB_TOTAL("Subtotal"),
  ITEM("Item"),
  ITEMS("Items"),
  ORDER_SUMMARY("Order Summary"),
  ITEM_TOTAL("Item Total"),
  ESTIMATED_TAX("Estimated Tax"),
  ESTIMATED_TOTAL("Estimated Total"),
  TAX("Tax"),
  ORDER_TOTAL("Order Total"),
  CHECK_OUT("Checkout"),
  ONE("1"),
  PAY_WITH_CARD("Pay With Credit or Debit Card"),
  PAY_WITH_PAYPAL("Pay With PayPal"),
  PAY_NOW_LATER("Pay now or later with PayPal"),
  ADD_CARD("Add Card"),
  EDIT_CARD("Edit Card"),
  NAME_ON_CARD("Name on Card*"),
  CARD_NUMBER("Card Number*"),
  EXPIRATION("Expiration*"),
  CVV("CVV*"),
  BILLING_ADDRESS("Billing Address"),
  FIRST_NAME("First Name*"),
  LAST_NAME("Last Name*"),
  ADDRESS_LINE_1("Address Line 1*"),
  ADDRESS_LINE_2("Address Line 2"),
  CITY("City*"),
  STATE("State*"),
  ZIP_CODE("Zip Code*"),
  PHONE_NUMBER("Phone Number*"),
  SAVE("Save"),
  MOBILE_NUMBER("Mobile Number"),
  TERMS_AND_PRIVACY_MESSAGE("You have opted in to receive text order updates. Message & data rates may apply. Reply STOP to opt out or HELP for more information. View our Terms and Privacy Policy"),
  EMPTY_CART_MESSAGE("Explore product categories and add products to your shopping cart to proceed to checkout. Click below to begin shopping.");

  private final String enumValue;

  ECommInputs(String value) {
    this.enumValue = value;
  }

  public String getValue() {
    return this.enumValue;
  }
}
