import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeClass
    public void createCalculator() {
        calculator = new Calculator();
    }

    @Test
    public void addReturnsSumOfTwoNumbers() throws Exception {
        Assert.assertEquals(calculator.add(1, 1), 2, "Please learn to count!");
    }
}