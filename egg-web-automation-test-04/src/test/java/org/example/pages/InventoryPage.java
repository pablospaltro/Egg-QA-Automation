package org.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InventoryPage extends BasePage{

    public InventoryPage (WebDriver driver){
        super(driver);
    }

    @FindBy(css=".ui-search-breadcrumb__title")
    private WebElement footerText;

    public String getFooterText(){
        this.isElementDisplayed(this.footerText);
        return this.footerText.getText();
    }
}
