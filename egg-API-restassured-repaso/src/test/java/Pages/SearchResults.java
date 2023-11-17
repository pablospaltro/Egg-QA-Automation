package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchResults extends BasePage {

    @FindBy(className = "firstHeading")
    private WebElement pageTitle;

    public String getPageTitle(){
        this.isElementDisplayed(pageTitle);
        return pageTitle.getText();
    }
    public SearchResults(WebDriver driver) {
        super(driver);
    }
}
