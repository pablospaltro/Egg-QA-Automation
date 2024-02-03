package org.example.tests;

import org.example.pages.HomePage;
import org.example.pages.InventoryPage;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class MercadoLibreTest extends BaseTest{

    private HomePage homePage;
    private InventoryPage inventoryPage;

    SoftAssert softAssert = new SoftAssert();

    @BeforeTest
    public void setUpPages(){
        homePage = getHomePage();
        inventoryPage = new InventoryPage(driver);
    }

    @Test
    public void testWhenSearchingAProduct(){

        homePage.setBarText("Botella termica");
        homePage.clickOnSearch();

        softAssert.assertEquals(inventoryPage.getFooterText(), "Botella termica");
    }
}
