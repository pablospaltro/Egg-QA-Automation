package org.example;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class myTest {

    WebDriver driver = null;

    SoftAssert softAssert = new SoftAssert();

    @Test
    public void testWikipedia(){
        String driverPath = "C:\\Users\\Usuario\\JAVA\\Egg-QA-Automation-Curso\\egg-web-automation-test-03\\src\\utils\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);
        driver = new ChromeDriver();

        driver.navigate().to("https://www.wikipedia.org");

        WebElement searchInput = driver.findElement(By.id("searchInput"));
        WebElement footerLink = driver.findElement(By.cssSelector(".footer-sidebar-text + div.footer-sidebar-text"));

        searchInput.sendKeys("Selenium");

        softAssert.assertEquals(footerLink.getText(), "Puedes apoyar nuestro trabajo con una donación.");

        WebElement submitBtn = driver.findElement(By.cssSelector("button[type=\"submit\"]"));

        List<WebElement> languages = driver.findElements(By.className("central-featured-lang"));
        softAssert.assertTrue(languages.size() != 0);

        softAssert.assertTrue(submitBtn.isDisplayed());
        submitBtn.click();

        //check if all assertions passed or not:
        softAssert.assertAll();

        driver.close();
    }




}
