package org.example;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

public class AppTest {

    public Logger log = Logger.getLogger(AppTest.class);

    @Test
    @Parameters({"string1", "string2"})
    public void testParameters(String a, String b){

        Assert.assertEquals(a, "Hello");
        Assert.assertEquals(b, "Globant");

    }
}
