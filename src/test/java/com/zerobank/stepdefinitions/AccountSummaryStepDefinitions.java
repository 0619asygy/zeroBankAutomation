package com.zerobank.stepdefinitions;

import com.zerobank.pages.AccountSummaryPage;


import com.zerobank.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class AccountSummaryStepDefinitions {
    AccountSummaryPage accountSummaryPage = new AccountSummaryPage();

    @Then("Verify the Account summary page should have the title {string}")
    public void verifyTheAccountSummaryPageShouldHaveTheTitle(String title) {
        Assert.assertEquals(title,accountSummaryPage.getPageTitle());
        accountSummaryPage.logOut();
    }

    @And("user verifies account types are displayed")
    public void user_verifies_account_types_are_displayed(List<String> dataTable) {

        System.out.println(dataTable);
        BrowserUtils.wait(2);
        Assert.assertEquals(dataTable,accountSummaryPage.getAccountTypes());
        accountSummaryPage.logOut();
    }

    @Then("Verify the Credit Accounts table must have columns")
    public void verify_the_Credit_Accounts_table_must_have_columns(List<String> dataTable) {

        Assert.assertEquals(dataTable, accountSummaryPage.getColumnNames());
    }


}
