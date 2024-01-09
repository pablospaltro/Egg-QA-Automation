package org.example.tests;

import java.util.List;

import org.example.pages.HomePage;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class MyTest extends BaseTest{

    SoftAssert softAssert = new SoftAssert();

    // we handle the driver in the beforeTest (in the basePage),
    // not in the test:
    @Test
    public void testWikipedia(){

        // interacting with the web elements implementing the homePage methods
        // and making assertions:

        HomePage homePage = getHomePage();
        homePage.setBarText("Selenium");
        softAssert.assertEquals(homePage.getFooterText(), "You can support our work with a donation.");
        homePage.clickOnSearch();

        //check if all assertions in the test passed or not:
        softAssert.assertAll();
    }
}
