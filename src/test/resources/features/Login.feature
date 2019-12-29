@Login_test
Feature:Login
  Only authorized users should be able to login to the application.


  #Only authorized users should be able to login to the application. When user logs in
  #with valid credentials, Account summary page should be displayed.

  #Users with wrong username or wrong password should not be able to login. Users
  #with blank username or password should also not be able to login. When user tries
  #to login with invalid information, error message Login and/or password are wrong.
  #should be displayed.


  @negative_test
  Scenario: Login with wrong password
    Given user is on the home page
    Then user clicks sign in button
    And user verifies that "Zero - Log in" page title is displayed
    When user enters "username" username and "wrong" password
    And user verifies that "Login and/or password are wrong." error message should be displayed.

  @negative_test
  Scenario:Login with wrong username
    Given user is on the home page
    Then user clicks sign in button
    And user verifies that "Zero - Log in" page title is displayed
    When user enters "wrong" username1 and "password" password
    And user verifies that "Login and/or password are wrong." error message should be displayed.
  @autorized_user
  Scenario: Login as autorized_user
    Given user is on the home page
    Then user clicks sign in button
    And user verifies that "Zero - Log in" page title is displayed
    When user enters valid username and password
    Then user verifies that "Zero - Account Summary" page title is displayed