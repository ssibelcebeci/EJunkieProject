Feature: Add to Cart Demo Ebook functionality
  Scenario: Add to cart success
    Given Navigate to the website
    When Click add to cart for the demo e book option
    When Verify that e book successfully added to cart
    When Click on the add promo code button
    When Enter an invalid (random) promo code into the specified field.
    And Click on the Apply button.
    Then Verify that the invalid promo code warning message is displayed.