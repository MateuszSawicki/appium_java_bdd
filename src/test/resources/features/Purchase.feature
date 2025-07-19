Feature: Purchase
  Scenario: User purchases the product
    Given the user is logged in
    When the user adds the product to the shopping cart
    And the user opens the shopping cart
    Then the added product is displayed
    When the user checks out
    And the user fills in required information
    Then payment details are displayed
    When the user clicks finish
    Then the complete purchase screen is displayed

  Scenario: User adds and removes items from the cart
    Given the user is logged in
    And the user adds the product to the shopping cart
    And the user opens the shopping cart
    When user removes item from the cart
    Then the item is removed from the cart

