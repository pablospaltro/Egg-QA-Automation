package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(id = "searchInput")
    private WebElement searchInput;

    @FindBy(css = "button[type=\"submit\"]")
    private WebElement submitBtn;

    public void setBarText(String text) {
        this.isElementDisplayed(this.searchInput);
        this.searchInput.sendKeys(text);
    }

    public SearchResults clickOnSearch() {
        this.submitBtn.click();
        return new SearchResults(this.driver);
    }

    public HomePage(WebDriver driver, String url) {
        super(driver);
        this.driver.get(url);
    }
}
