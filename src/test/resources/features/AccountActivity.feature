@accountActivity
Feature: Account Activity
  As a user, I should be able to navigate to account activity page

  Background:login as an authorized user
    Given user is on the home page
    Then user clicks sign in button
    And user verifies that "Zero - Log in" page title is displayed
    When user enters valid username and password


  @default_dropdown
  Scenario: Account drop down default option should be displayed
    Given user is on the "Account Activity" home page
    And user verifies that "Zero - Account Activity" page title is displayed
    Then User verifies that Account drop down default option should have "Savings" selected

  @dropdown_options
  Scenario: Account drop down should have the following options
    Then user verifies that checkbox user verifies Account drop down should have following options
      | Savings     |
      | Checking    |
      | Loan        |
      | Credit Card |
      | Brokerage   |

  @transactions_table_column
  Scenario: Transactions table should have column names
    Then user verifies that Transactions table should have column names
      | Date        |
      | Description |
      | Deposit     |
      | Withdrawal  |

