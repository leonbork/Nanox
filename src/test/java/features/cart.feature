Feature: Shopping Cart

  Scenario: Add item to cart and place order
    Given I open the demoblaze home page
    When I add an item to the cart
    And I go to cart and place an order
    Then I should see a purchase confirmation