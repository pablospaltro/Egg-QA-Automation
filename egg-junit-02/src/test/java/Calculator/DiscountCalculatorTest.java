package Calculator;

import org.example.entities.DiscountCalculator;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class DiscountCalculatorTest {

    private static DiscountCalculator discountCalculator;

    @BeforeClass
    public static void setUp(){
        discountCalculator = new DiscountCalculator();
    }

    @Test
    public void testPriceDiscount10Percent(){
        assertEquals(90, discountCalculator.discount10Percent(100), 0);
    }

    @Test
    public void testPriceDiscountHalf(){
        assertEquals(50, discountCalculator.discountHalf(100), 0);
    }

    @Test
    public void testPriceNoDiscount(){
        assertEquals(100, discountCalculator.noDiscount(100), 0);
    }

}
