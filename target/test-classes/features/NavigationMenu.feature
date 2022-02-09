@navigate
Feature: Logged in sales managers should be able to navigate to pages using the top menu

  @vehicle
  Scenario: Navigate to Fleet > Vehicle Page
    Given The user is on the login page
    And the user enters the sales manager credentials
    When User navigates to Fleet Vehicle module on top of menu
    Then User verifies that expected title is Vehicle


  @campaigns @db
  Scenario: Navigate to Marketing -> Campaigns
    Given The user is on the login page
    And the user enters the sales manager credentials
    When User navigates to Marketing Campaigns module on top of menu
    Then User verifies that expected title Campaigns


  @calendar_events
  Scenario: Navigate to Activities -> Calendar Events
    Given The user is on the login page
    And the user enters the sales manager credentials
    When User navigates to Activities Calendar Events module on top of menu
    Then User verifies that expected title is Calendar Events





