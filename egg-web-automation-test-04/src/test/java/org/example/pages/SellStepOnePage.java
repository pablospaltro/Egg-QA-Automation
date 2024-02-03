package org.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SellStepOnePage extends BasePage {

    public SellStepOnePage (WebDriver driver){
        super(driver);
    }

    @FindBy(css=".center-card__header .center-card__title")
    private WebElement footerText;

    public String getFooterText(){
        this.isElementDisplayed(this.footerText);
        return this.footerText.getText();
    }
}
