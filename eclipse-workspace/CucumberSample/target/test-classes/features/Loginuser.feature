#Tester Name:vinay kumar
@SmokeFeature
Feature: feature to test login functionality

  @smoketest
  Scenario: Check login is successful with valid credentials
    Given user is on login page
    When use enters username and password
    And clicks on login button
    Then user is navigated to the home page
      