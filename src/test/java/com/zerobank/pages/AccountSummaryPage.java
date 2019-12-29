package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import java.util.List;

public class AccountSummaryPage extends BasePage {
    @FindBy(css = "div h2")
    public List<WebElement> accountType;

    @FindBy(xpath = "//h2[text()='Credit Accounts']/following-sibling::div[1]/div/table/thead/tr/th")
          //  "(//table[@class='table'])[3]/thead/tr")
    public List<WebElement> columnNamesOfCreditAccount;




    public List<String> getAccountTypes(){
        return BrowserUtils.getListOfString(accountType);
    }

    public List<String>getColumnNames(){
        return BrowserUtils.getListOfString(columnNamesOfCreditAccount);
    }
}
