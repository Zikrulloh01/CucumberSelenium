Feature: Login as Usertype


  Scenario Outline: Different User types
    Given The user is on the login page
    When User enters the "<usertype>" information
    Then The title should contain "Dashboard"

    Examples:
      | usertype      |
      | driver        |
      | sales manager |
      | store manager |


  @wip
  Scenario Outline: Login with Different Accounts
    Given The user is on the login page
    When User enters the "<usertype>" information
    And User navigates to "<tab>" "<module>" on top of menu
    Then The title should contain "<title>"

    Examples:
      | usertype      | tab        | module          | title                        |
      | driver        | Activities | Calendar Events | Calendar Events - Activities |
      | sales manager | Customers  | Accounts        | Accounts - Customers         |
      | store manager | Customers  | Contacts        | Contacts - Customers         |





