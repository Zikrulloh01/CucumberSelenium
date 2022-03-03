Feature: Login as different users

@smoke
  Scenario: Login as a driver user
    Given The user is on the login page
    When the user logs in with "User10" and "UserUser123"
    Then The user should be logged in
    And The title should contain "Dashboard"