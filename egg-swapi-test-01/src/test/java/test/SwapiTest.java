package test;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import io.restassured.response.Response;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pojos.People;
import io.restassured.RestAssured;

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

}
