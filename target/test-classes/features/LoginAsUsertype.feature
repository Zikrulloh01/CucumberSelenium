@usertype
Feature: Login as "usertype"
  Scenario: Login as UserType
    Given The user is on the login page
    When User enters the "sales manager" information
    Then The user should be logged in
    And The title should contain "Dashboard"

  @tc001
  Scenario: Verify Options Subtitle is displayed on Calendar Events Page
    Given User is on login Page
    When User logs in as a store manager
    And Navigates to Activities -> Calendar Events
    Then Verify that page subtitle "Options" is displayed