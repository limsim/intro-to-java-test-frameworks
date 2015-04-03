import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {

    @Test
    public void addReturnsSumOfTwoNumbers() throws Exception {
        Assert.assertEquals(Calculator.add(1,1), 2, "Please learn to count!");
    }
}