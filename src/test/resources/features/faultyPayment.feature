Feature: Faulty payment
Scenario: Verify payment fails when required fields are left blank
  Given Navigate to the website
  When Click add to cart for the demo e book option
  When Click the “Pay with Debit Card” option on the cart page
  When Click the “Pay” button to complete the payment process
  Then Verify “Invalid Email” and “Invalid Billing Name” errors