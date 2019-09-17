Feature: Shopping

  Background: Log in with valid credentials
    Given The user goes to "login" page
    When The user fills the form with "email" and "password"
    Then Username should appear in the left panel

  @signOut
  Scenario Outline: Order a Shopping
    Given The user goes to "<dressType>" page
    When The user Choose a dress
    Then The user quantity of orders should be 1
    When The user accept the terms of service check
    When The user choose a bank payment method
    Then The user should see "BANK-WIRE PAYMENT." heading
    When The user choose a check payment method
    Then The user should see "CHECK PAYMENT" heading
    When The user proceed with the order
    Then The user should see this success message: "Your order on My Store is complete."
    And The user should see the order history
    Examples: dresses with valid pages
      | dressType      |
      | summerDresses  |
      | casualDresses  |
      | eveningDresses |
      | tShirts        |
      | blouses        |
