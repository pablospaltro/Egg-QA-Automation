package org.example.tests;

import org.example.pages.HomePage;
import org.example.pages.InventoryPage;
import org.example.pages.SellStepOnePage;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class MercadoLibreTest extends BaseTest{

    private HomePage homePage;
    private InventoryPage inventoryPage;
    private SellStepOnePage sellStepOnePage;

    SoftAssert softAssert = new SoftAssert();

    @BeforeTest
    public void setUpPages(){
        homePage = getHomePage();
        inventoryPage = new InventoryPage(driver);
        sellStepOnePage = new SellStepOnePage(driver);
    }

    @Test
    public void whenSearchingAProductTest(){

        homePage.setBarText("Botella termica");
        homePage.clickOnSearch();

        softAssert.assertEquals(inventoryPage.getFooterText(), "Botella termica");
    }

    @Test
    public void whenClickOnSellTest(){

        homePage.clickOnSell();

        softAssert.assertEquals(sellStepOnePage.getFooterText(), "¡Hola! Para vender, ingresá tu e‑mail, teléfono o usuario de ");
    }


}
