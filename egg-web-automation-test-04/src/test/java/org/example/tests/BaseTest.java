package org.example.tests;

import org.example.pages.HomePage;
import org.example.pages.InventoryPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {

    HomePage homePage;
    WebDriver driver = null;

    @BeforeTest
    public void beforeTest(){
        String driverPath = "C:\\Users\\Usuario\\JAVA\\Egg-QA-Automation-Curso\\egg-web-automation-test-04\\src\\utils\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);
        driver = new ChromeDriver();
    }

    @AfterTest
    public void afterTest(){
        driver.close();
    }

    public HomePage getHomePage(){
        return homePage = new HomePage(driver, "https://www.mercadolibre.com.ar");
    }
}
