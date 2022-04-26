#Tester Name:vinay kumar
Feature: feature to test login functionality in mystore

  Scenario Outline: Check login is successful with valid credentials in mystore
    Given user is on Indexpage
    And user click on sgin button navigate to login page
    When use enters <username> and <password> in mystore
    And clicks on login button in mystore
    Then user is navigated to the home page in mystore

    Examples: 
      | username              | password    |
      | vinayvinay1@gmail.com | vinayvinay1 |
   #   | vinay123@gmail.com    | vinay123    |
