Feature: Payment feature Positive
  Background: Add item to cart
    Given Navigate to the website
    Then Click add to cart for the demo e book option
    Then Click the “Pay with Debit Card” option on the cart page
    Then Fill in the billing details
    Scenario: Positive Payment
      Then Fill valid card details
      When CLick pay button
      Then Verify successful payment text