package org.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage extends BasePage{

    public HomePage(WebDriver driver, String url){
        super(driver);
        this.driver.get(url);
    }

    @FindBy(css=".nav-search .nav-search-input")
    private WebElement searchInput;

    @FindBy(css=".nav-icon-search")
    private WebElement submitBtn;

    @FindBy(css = "ul.nav-menu-list > li:nth-child(7)")
    private WebElement sellBtn;

    public void setBarText(String text){
        this.searchInput.sendKeys(text);
    }

    public void clickOnSearch(){
        this.submitBtn.click();
    }

    public void clickOnSell() {
        this.sellBtn.click();
    }
}
