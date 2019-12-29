package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

   @FindBy(id="signin_button")
   public WebElement signInButton;


   @FindBy(xpath = "(//a[@class='dropdown-toggle'])[2]")
   public WebElement username;
   @FindBy (id="logout_link")
   public WebElement logOutLink;

    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }

    public void navigateTo(String moduleName){
        String moduleLocator = "//a[text()='" + moduleName +"']";
        WebDriverWait wait = new WebDriverWait(Driver.get(),20);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(moduleLocator)));

        WebElement module = Driver.get().findElement(By.xpath(moduleLocator));
        BrowserUtils.waitForVisibility(module,5);
        BrowserUtils.waitForClickablility(module,5);
        module.click();

    }



    public void clickSignInButton(){

        BrowserUtils.waitForVisibility(signInButton,5);
        BrowserUtils.waitForClickablility(signInButton,5);
        BrowserUtils.wait(2);
        signInButton.click();
    }



    public String getPageTitle(){
        BrowserUtils.wait(5);
        return Driver.get().getTitle();
    }



    public void logOut() {

        BrowserUtils.wait(2);
        BrowserUtils.clickWithJS(username);
        BrowserUtils.clickWithJS(logOutLink);
    }



}

