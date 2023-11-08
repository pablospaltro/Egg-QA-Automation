package test;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pojos.People;
import pojos.User;

import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;

public class BankTest {

    private static Response userClassResponse;
    private static List<User> users;

    @BeforeTest
    public void GetSetUp(){
        RestAssured.baseURI = "https://654ac5a95b38a59f28ee3839.mockapi.io/";
        userClassResponse = given().when().get("banco/user");
        users = userClassResponse.jsonPath().getList("", User.class);
    }

    @Test
    public void BankUserEndpointTest(){
        assertEquals(200, userClassResponse.getStatusCode());

        for (User user : users) {
            System.out.println(user.toString());
            // Realiza otras acciones con los objetos User según tus necesidades
            //recorrer los usuarios y evitar emails duplicados:

        }
    }

    @Test
    public void AddUserAndCheckDuplicateTest() {
        // Crea un nuevo usuario
        User newUser = new User("21-123123-2323", "Nuevo Usuario", "aaaaaaaaa", 45, "usuario2@example.com");

        // Verifica que el correo electrónico no esté duplicado
        boolean isDuplicate = users.stream()
                .anyMatch(user -> user.getEmail().equals(newUser.getEmail()));

        // Si no es un duplicado, entonces realiza la solicitud POST para agregar el nuevo usuario
        if (!isDuplicate) {
            Response postResponse = given()
                    .contentType("application/json")
                    .body(newUser)
                    .when()
                    .post("banco/user");

            assertEquals(201, postResponse.getStatusCode());
        } else {
            System.out.println("entré al else :)");
        }
    }
}
