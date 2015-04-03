import junit.framework.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void addReturnsSumOfTwoNumbers() throws Exception {
        Assert.assertEquals("Oh man! Learn how to count!!", 1, new Calculator().add(1, 1));
    }

    @Test
    public void differentAssertions() {
        Assert.assertFalse(1 == 2);
        Assert.assertTrue(1 == 1);
        Assert.assertNotNull(new Calculator());

        Calculator expectedCalculator = new Calculator();
        Calculator actualCalculator = new Calculator();
        Assert.assertNotSame(expectedCalculator, actualCalculator);

        Calculator calculator = new Calculator();
        Calculator calculator2 = calculator;
        Assert.assertSame(calculator, calculator2);
    }
}