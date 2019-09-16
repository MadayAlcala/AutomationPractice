Feature: Shopping

  Background: Log in with valid credentials
    Given The user goes to "login" page
    When The user fills the form with "email" and "password"
    Then Username should appear in the left panel

  @signOut
  Scenario Outline: Order a Shopping
    Given The user goes to "<dresstype>" page
    And The user Choose a summer dress
#    Then The cart sum of product is equal to the next information
#      | TotalProductsPrice | $105.97 |
#      | TotalPrice         | $107.97 |
#      | TotalShipping      | $2.00   |
    When The user accept the terms of service check
    And The user choose a payment method
    Then The user should see this success message: "Your order on My Store is complete."
    And The user should see the order history with the number 53
    Examples: dresses with valid pages
      | dresstype      |
      | summerDresses  |
      | casualDresses  |
      | eveningDresses |
