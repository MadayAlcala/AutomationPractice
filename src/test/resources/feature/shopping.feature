Feature: Shopping

  Background: Log in with valid credentials
    Given The user goes to "login" page
    When The user fills the form with "email" and "password"
    Then Username should appear in the left panel

  Scenario: Order a Shopping
    Given The user goes to "summerDresses" page
      And The user Choose a summer dress
    Given The user goes to "casualDresses" page
      And The user choose a casual dress
    Given The user goes to "eveningDresses" page
      And The user casual a evening dress
    Then The cart sum of product is equal to the next information
      | TotalProductsPrice | $105.97 |
      | TotalPrice         | $107.97 |
      | TotalShipping      | $2.00   |
    When The user accept the terms of service check
      And The user choose a payment method
    Then The user should see this success message: "Your order on My Store is complete."
      And The user should see the order history with the number 155
