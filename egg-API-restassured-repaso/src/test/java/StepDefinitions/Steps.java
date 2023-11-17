package StepDefinitions;

import Pages.HomePage;
import Pages.SearchResults;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import io.restassured.response.Response;
import tests.BaseTest;

import static io.restassured.path.json.JsonPath.given;

public class Steps extends BaseTest {

    HomePage homePage;
    SearchResults searchResults;
    Response response;
    String name;
    String url = "https://swapi.dev/api/";


    public Steps() {
        beforeStep();
    }

    @Given("I am an user at the Wikipedia WebPage requesting SW character")
    public void i_am_an_user_at_the_wikipedia_web_page_requesting_sw_character() {
        homePage = getHomePage();
    }

    @When("^I search the requested character ([^\"]*) on Wikipedia search page")
    public void i_search_the_requested_character_name_on_wikipedia_search_page(int id) {
        response = given().get(url + "people/" + id);
        name =  response.getBody().jsonPath().getString("name");
        homePage.setBarText(name);
        searchResults = homePage.clickOnSearch();
    }

    @Then("^I should be able to see the article page correctly displayed for the requested ([^\"]*) character")
    public void i_should_be_able_to_see_the_article_page_correctly_displayed_for_the_requested_character(String name) {
        Assert.assertEquals(searchResults.getPageTitle(),name);
        afterStep();
    }
}
