Feature: Address

  Background: Log in with valid credentials
    Given The user goes to "login" page
    When The user fills the form with "email" and "password"
    Then Username should appear in the left panel

  Scenario: Create new address with the required fields
    When The user goes to create "address" form
    And The user fills the form with the following information
      | firstname  | firstname     |
      | lastname   | lastname      |
      | address1   | abc           |
      | city       | Cochabamba    |
      | id_state   | Alabama       |
      | postcode   | 00000         |
      | id_country | United States |
      | phone      | 4578962       |
      | alias      | Maday5        |
    Then The address information should be displayed in the Address page

  Scenario: Create new address with all the fields
    When The user goes to create "address" form
    And The user fills the form with the following information
      | firstname    | firstname     |
      | lastname     | lastname      |
      | company      | AT10          |
      | address1     | abc           |
      | address2     | def           |
      | city         | Cochabamba    |
      | id_state     | Alabama       |
      | postcode     | 00000         |
      | id_country   | United States |
      | phone        | 4578962       |
      | phone_mobile | 4578962       |
      | other        | New Address   |
      | alias        | Maday6        |
    Then The address information should be displayed in the Address page
