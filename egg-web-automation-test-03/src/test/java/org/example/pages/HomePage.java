package org.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage extends BasePage{

    // regarding the webElements below, always declare them as private, and later interact
    // with them through the implementation of methods (not as public ones, so don´t return them
    // directly in other classes):

    @FindBy(id="searchInput")
    private WebElement searchInput;

    @FindBy(css="button[type=\"submit\"]")
    private WebElement submitBtn;

    @FindBy(css=".footer-sidebar-text + div.footer-sidebar-text")
    private WebElement footerText;

    @FindBy(className="central-featured-lang")
    private List<WebElement> lang_list;

    public void setBarText(String text){
        this.searchInput.sendKeys(text);
    }

    public void clickOnSearch(){
        this.submitBtn.click();
    }

    // first we wait to the element to be present before doing anything:
    public String getFooterText(){
        this.isElementDisplayed(this.footerText);
        return this.footerText.getText();
    }

    // when initializing, we get to the specific web page:
    public HomePage(WebDriver driver, String url){
        super(driver);
        this.driver.get(url);
    }
}
