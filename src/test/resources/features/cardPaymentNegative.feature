Feature: Payment feature Negative
  Background: Add item to cart
    Given Navigate to the website
    Then Click add to cart for the demo e book option
    Then Click the “Pay with Debit Card” option on the cart page
    Scenario: Negative Payment
      Then Fill in the billing details
      Then Fill in the card number
      Then Verify invalid card number error
