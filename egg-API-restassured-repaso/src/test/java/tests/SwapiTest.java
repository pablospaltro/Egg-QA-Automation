package tests;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import io.restassured.response.Response;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pojos.People;
import io.restassured.RestAssured;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


import java.text.ParseException;
import java.text.SimpleDateFormat;

import static io.restassured.RestAssured.given;
import static org.testng.Assert.*;

public class SwapiTest {

    /*
    Test the endpoint people/2/ and check the success response,
    the skin color to be gold, and the amount of films
     it appears on (should be 6)
     */

    private static Response peopleClassResponse;
    WebDriver driver = null;


    @BeforeTest
    public void SetUp(){
        RestAssured.baseURI = "https://swapi.dev/api/";
        peopleClassResponse = given().when().get("people/2");
    }

    @Test
    public void PeopleEndpointTest(){



        //assertEquals(200, peopleClassResponse.getStatusCode());


        //vinculamos el objeto de la API con nuestro objeto (POJO)
        String responseBody = peopleClassResponse.getBody().asString();
        Gson gson = new GsonBuilder().create();
        People people = gson.fromJson(responseBody, People.class);

        //obtenemos el nombre, ya en nuestro POJO
        String characterName = people.getName();

        //establecemos la ruta a nuestro ChromeDriver
        //String driverPath = "C:\\Users\\Usuario\\JAVA\\Egg-QA-Automation-Curso\\egg-API-restassured-repaso\\src\\utils\\chromedriver.exe";
        //System.setProperty("webdriver.chrome.driver", driverPath);
        //driver = new ChromeDriver();



        WebDriver driver = new FirefoxDriver();

        //navegamos hacia wikipedia
        driver.navigate().to("https://www.wikipedia.org");

        //identificamos un elemento web especifico, en este caso el buscador:
        WebElement searchInput = driver.findElement(By.id("searchInput"));
        //le pasamos el nombre obtenido del objeto:
        searchInput.sendKeys(characterName);

        //identifico el boton de busqueda:
        WebElement searchButton = driver.findElement(By.cssSelector(".pure-button"));
        searchButton.click();

        WebElement heading = driver.findElement(By.cssSelector(".firstHeading"));

        assertEquals(characterName, heading.getText());

       //driver.close();


    }
}