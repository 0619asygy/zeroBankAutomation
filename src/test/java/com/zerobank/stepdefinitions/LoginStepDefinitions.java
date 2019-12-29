package com.zerobank.stepdefinitions;

import com.zerobank.pages.BasePage;
import com.zerobank.pages.LoginPage;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginStepDefinitions {
    LoginPage loginPage = new LoginPage();


    @Given("user is on the home page")
    public void user_is_on_the_login_page() {
        System.out.println("I am on the login page");
        Driver.get().get(ConfigurationReader.getProperty("url"));
    }

    @Then("user clicks sign in button")
    public void user_logs_in_as_autorized_user() {
        loginPage.clickSignInButton();
    }
    @And("user verifies that {string} page title is displayed")
    public void userVerifiesThatPageTitleIsDisplayed(String pageTitle) {
       Assert.assertEquals(pageTitle,loginPage.getPageTitle());
    }

    @When("user enters valid username and password")
    public void userEntersValidUsernameAndPassword() {
        System.out.println("Login as authorized user");
        loginPage.login();
    }

    @Then("user verifies that {string} page should be displayed.")
    public void user_verifies_that_page_should_be_displayed(String pageTitle) {
        System.out.println("Verified that warning message is displayed: " + pageTitle);
        BrowserUtils.wait(3);
        Assert.assertEquals(pageTitle,loginPage.getPageTitle());
    }


    @Then("user enters {string} username and {string} password")
    //user enters "username" username and "wrong" password
    public void user_enters_username_and_password(String username, String password) {
        System.out.println("Login with "+username+" username and "+password+" password.");
       loginPage.login(username, password);
    }

    @Then("user verifies that {string} error message should be displayed.")
    public void user_verifies_that_error_message_should_be_displayed(String warningMessage) {
        BrowserUtils.wait(3);
        Assert.assertEquals(warningMessage,loginPage.warningMessage().trim());
    }

     //user enters "wrong" username and "password" password
    @Then("user enters {string} username1 and {string} password")
    public void user_enters_wrong_username_and_password(String username, String password) {
        System.out.println("Login with "+username+" username and "+password+" password.");
        loginPage.login(username, password);

    }

}

