package com.zerobank.pages;


import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class AccountActivityPage extends BasePage {



    @FindBy(id = "aa_accountId")
    public WebElement accountSelect;


    @FindBy(xpath = "//table[@class='table table-condensed table-hover']/thead/tr")
    public List<WebElement> columnNamesOfShowTransactions;






    public String getDefaultSelectBox() {
        Select select = new Select(accountSelect);
        BrowserUtils.waitForVisibility(accountSelect, 3);
        return select.getFirstSelectedOption().getText();
    }

    public List<String> accountSelectBox() {
        Select select = new Select(accountSelect);
        BrowserUtils.waitForVisibility(accountSelect, 3);
        List<WebElement> option = select.getOptions();
        return BrowserUtils.getListOfString(option);
    }

    public List<String>getColumnNames(){
        return BrowserUtils.getListOfString(columnNamesOfShowTransactions);
    }
}



