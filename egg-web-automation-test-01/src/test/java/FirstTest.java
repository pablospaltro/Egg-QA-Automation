
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {

    WebDriver driver = null;

    @Test
    public void testWikipedia(){
        //allowing the connection between my code and the browser:
        String driverPath = "C:\\Users\\Usuario\\JAVA\\Egg-QA-Automation-Curso\\egg-web-automation-test-01\\src\\utils\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);
        driver = new ChromeDriver();

        driver.navigate().to("https://www.wikipedia.org");

        WebElement searchInput = driver.findElement(By.id("searchInput"));
        WebElement footerLink = driver.findElement(By.cssSelector(".footer-sidebar-text + div.footer-sidebar-text"));

        searchInput.sendKeys("Selenium");

        Assert.assertEquals(footerLink.getText(), "You can support our work with a donation.");

        WebElement submitBtn = driver.findElement(By.cssSelector("button[type=\"submit\"]"));

        Assert.assertTrue(submitBtn.isDisplayed());
        submitBtn.click();

        driver.close();
    }
}
