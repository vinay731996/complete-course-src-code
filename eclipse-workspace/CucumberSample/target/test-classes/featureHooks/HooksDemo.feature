Feature: validate login functionality
 
 Scenario: check with the correct crediantiality
 
  Given user navigated to login page
  When user enter username and password
  Then user navigated to Home Page
  
  
  Scenario:  check with worng crediantiality
  
  Given user landed on the Indexpage
  When user naviagted to login page and enter username and paswword
  Then user get a erorr msg  invalid crediantiality
  