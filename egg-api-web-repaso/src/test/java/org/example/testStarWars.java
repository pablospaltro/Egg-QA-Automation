package org.example;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class testStarWars {

    WebDriver driver2 = new FirefoxDriver();
    SoftAssert softAssert = new SoftAssert();
    protected String url = "https://swapi.dev/api";
    protected String name;

    @Test
    public void buscarNombreTest() {
        //PRIMERO BUSCO EN LA API EL NAME DE PEOPLE 1
        SoftAssert softAssert = new SoftAssert();
        Response response;
        String url = "https://swapi.dev/api";
        response = RestAssured.given().get(url + "/people/1");
        softAssert.assertEquals(response.getStatusCode(), 200);

        JsonPath jsonPath = response.jsonPath();
        name = jsonPath.get("name");

        softAssert.assertEquals(name, "Luke Skywalker");

        //BUSCAR EN WIKIPEDIA
        driver2.navigate().to("https://www.wikipedia.org/");

        WebElement busqueda = driver2.findElement(By.id("searchInput"));
        busqueda.isDisplayed();
        busqueda.isEnabled();
        busqueda.sendKeys(name);

        WebElement boton = driver2.findElement(By.cssSelector(".pure-button"));
        boton.isDisplayed();
        boton.isEnabled();
        boton.click();


        WebElement titulo  = driver2.findElement(By.cssSelector(".mw-page-title-main"));
        titulo.isDisplayed();
        titulo.isEnabled();
        softAssert.assertEquals(titulo.getText(),name);



    }

}
