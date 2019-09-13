Feature: Address

  Background: Log in with valid credentials
    Given The user goes to "login" page
    When The user fills the form with "email" and "password"
    And "Sign out" should appear

  @DeleteAddress
  Scenario: Create new address
    When The user goes to create "address" form
    And The user fills the form with the following information
      | firstname    | firstname     |
      | lastname     | lastname      |
      | company      | site          |
      | address1     | Prospect      |
      | address2     | Agriculture   |
      | city         | 1             |
      | id_state     | Alabama       |
      | postcode     | 00000         |
      | id_country   | United States |
      | phone        | 4578962       |
      | phone_mobile | 4578962       |
      | other        | Public        |
      | alias        | Nuevo1245     |
    Then The address information should be displayed in the Address page
