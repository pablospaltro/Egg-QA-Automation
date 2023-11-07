package test;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import io.restassured.response.Response;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pojos.People;
import io.restassured.RestAssured;

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

    @BeforeTest
    public void SetUp(){
        RestAssured.baseURI = "https://swapi.dev/api/";
        peopleClassResponse = given().when().get("people/2");
    }

    @Test
    public void PeopleEndpointTest(){
        assertEquals(200, peopleClassResponse.getStatusCode());

        String responseBody = peopleClassResponse.getBody().asString();
        Gson gson = new GsonBuilder().create();
        People people = gson.fromJson(responseBody, People.class);

        assertEquals("gold", people.getSkin_color());
        assertEquals(6, people.getFilms().size());
        System.out.println(people);
    }

    @Test
    public void PeopleElementsTest(){

        /*
        despues de guardar people/2 en classResponse, obtengo el item de indice 1 de lista Films
        y guardo en Response filmResponse
         */
        
        Response filmResponse = given().when().get(peopleClassResponse.jsonPath().getString("films[1]"));
        assertEquals(200, filmResponse.getStatusCode());

        String releaseDate = filmResponse.jsonPath().getString("release_date");
        assertTrue(validateDateFormat(releaseDate));

        //Verifico que todas los atributos lista correspondientes a filmResponse tengan mas de 1 elemento.
        assertTrue(filmResponse.jsonPath().getList("characters").size() > 1);
        assertTrue(filmResponse.jsonPath().getList("planets").size() > 1);
        assertTrue(filmResponse.jsonPath().getList("starships").size() > 1);
        assertTrue(filmResponse.jsonPath().getList("vehicles").size() > 1);
        assertTrue(filmResponse.jsonPath().getList("species").size() > 1);
    }

    private boolean validateDateFormat(String date) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            dateFormat.parse(date);
            return true;
        } catch (ParseException e) {
            return false;
        }
    }

}
