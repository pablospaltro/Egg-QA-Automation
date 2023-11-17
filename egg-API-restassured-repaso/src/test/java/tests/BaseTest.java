package tests;

import Pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

    WebDriver driver;


    public void beforeStep() {
        //System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
        driver = new ChromeDriver();
    }

    public void afterStep() {
        driver.close();
    }

    public HomePage getHomePage() {
        return new HomePage(driver, "https://www.wikipedia.org");
    }
}
