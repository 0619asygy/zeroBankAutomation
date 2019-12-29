@account_summary
Feature: Account Summary
  As a user, I should be able to navigate to account summary page


  Background:login as an authorized user
    Given user is on the home page
    Then user clicks sign in button
    And user verifies that "Zero - Log in" page title is displayed
    When user enters valid username and password

  Scenario:Verify the page title for Account Summary
    Then Verify the Account summary page should have the title "Zero - Account Summary"


  @account_types
  Scenario: Verify account types on Account Summary page
    And user verifies account types are displayed
      |  Cash Accounts       |
      |  Investment Accounts |
      |  Credit Accounts     |
      |  Loan Accounts       |

  @table_columns
  Scenario:Verify the Credit Accounts table for Account Summary
    Then  Verify the Credit Accounts table must have columns
      | Account     |
      | Credit Card |
      | Balance     |
