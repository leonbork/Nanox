Feature: Order confirmation

  Scenario: Submit an order and verify confirmation
    Given I open the demoblaze home page
    When I add an item to the cart
    And I go to cart and place an order
    Then I should see a purchase confirmation
