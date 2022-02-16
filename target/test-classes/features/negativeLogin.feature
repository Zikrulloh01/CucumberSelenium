@smoke
Feature: User should see error message when entered wrong credentials

  @wrongUsername
  Scenario: Login as a driver with wrong username
    Given The user is on the login page
    When User enters wrong username and correct password
    Then User should see an error Message

  @wrongPassword
  Scenario: Login as a driver with wrong password
    Given The user is on the login page
    When User enters correct username and wrong password
    Then User should see an error Message


  @invalidUsernameAndPassword
  Scenario: Login as a driver with wrong username and wrong password
    Given The user is on the login page
    When User enters wrong username and wrong password
    Then User should see an error Message
