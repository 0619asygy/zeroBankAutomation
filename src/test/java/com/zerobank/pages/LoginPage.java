package com.zerobank.pages;

import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {


    @FindBy(id = "user_login")
    public WebElement userNameInput;

    @FindBy(id = "user_password")
    public WebElement passwordInput;


    @FindBy(xpath="//div[@class='alert alert-error']")
    public WebElement warningMessage;


    public LoginPage(){
        PageFactory.initElements(Driver.get(),this);
    }


    public void login(String userName, String password) {
        userNameInput.sendKeys(userName);
        passwordInput.sendKeys(password, Keys.ENTER);
    }
    public void login() {
        userNameInput.sendKeys(ConfigurationReader.getProperty("username"));
        passwordInput.sendKeys("password", Keys.ENTER);
    }
    public String warningMessage(){
        return warningMessage.getText();
}

}
