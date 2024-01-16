import net.serenitybdd.annotations.Step;
import org.junit.Assert;

public class SampleSteps {

    private int result;

    public int getResult() {
        return result;
    }

    @Step
    public void performSomeAction(int number1, int number2) {
        result = number1 + number2;
    }
    @Step
    public void verifyResult(int expectedResult, int actualResult) {
        Assert.assertEquals(expectedResult, result);
    }
}
