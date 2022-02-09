@login
Feature: User should be able to login


  @driver @VYT-123
  Scenario: Login as a driver
    Given The user is on the login page
    When User enters the driver information
    Then The user should be logged in

  @sales_manager @VYT-123
  Scenario: Login as a sales manager
    Given The user is on the login page
    When User enters the sales manager information
    Then The user should be logged in

    @store_manager @smoke @beingDone
    Scenario: Login as a store manager
    Given The user is on the login page
    When User enters the store manager information
    Then The user should be logged in