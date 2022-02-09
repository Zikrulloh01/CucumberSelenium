Feature: Contacts page

  Scenario: Navigate to pages
    Given The user is on the login page
    When User enters the driver information
    And User navigates to "Customers" "Contacts" on top of menu
    Then the default page number should be 1




  Scenario: Verify Create Calendar Event
    Given The user is on the login page
    When User enters the sales manager information
    And User navigates to "Activities" "Calendar Events" on top of menu
    Then User verifies tht title contains "Calendars"



  Scenario: Menu Options Driver
    Given The user is on the login page
    When User enters the "driver" information
    Then The user should see following options
      | Fleet      |
      | Customers  |
      | Activities |
      | System     |






  Scenario: Menu Options Driver
    Given The user is on the login page
    When User enters the "sales manager" information
    Then The user should see following options
      | Dashboards         |
      | Fleet              |
      | Customers          |
      | Sales              |
      | Activities         |
      | Marketing          |
      | Reports & Segments |
      | System             |



  Scenario: login as a given user
      Given The user is on the login page
      When User logs in using following credentials
        | username  | user10      |
        | password  | UserUser123 |
        | firstname | John        |
        | lastname  | Doe         |
    Then The user should be logged in

