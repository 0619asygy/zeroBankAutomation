package com.zerobank.stepdefinitions;

import com.zerobank.pages.AccountActivityPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class AccountActivityStepDefinitions {
    AccountActivityPage accountActivityPage=new AccountActivityPage();

    @Given("user is on the {string} home page")
    public void userIsOnTheHomePage(String  module) {
        accountActivityPage.navigateTo(module);
    }



    @Then("User verifies that Account drop down default option should have {string} selected")
    public void userVerifiesThatAccountDropDownDefaultOptionShouldHaveSelected(String defaultSelect) {
        System.out.println(accountActivityPage.getDefaultSelectBox());
        Assert.assertEquals(defaultSelect,accountActivityPage.getDefaultSelectBox());
        accountActivityPage.logOut();
    }

    @Then("user verifies that checkbox user verifies Account drop down should have following options")
    public void userVerifiesThatCheckboxUserVerifiesAccountDropDownShouldHaveFollowingOptions(List<String>checkbox) {
        Assert.assertEquals(checkbox,accountActivityPage.accountSelectBox());
        accountActivityPage.logOut();
    }

    @Then("user verifies that Transactions table should have column names")
    public void userVerifiesThatTransactionsTableShouldHaveColumnNames(List<String>columnNames) {
        Assert.assertEquals(columnNames,accountActivityPage.getColumnNames());
        accountActivityPage.logOut();
    }



}
