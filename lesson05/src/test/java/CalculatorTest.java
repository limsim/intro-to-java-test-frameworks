import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp() throws Exception {
        calculator = new Calculator();
    }

    @Test
    public void addReturnsSumOfTwoNumbers() throws Exception {
        Assert.assertEquals("Oh man! Learn how to count!!", 2, calculator.add(1, 1));
    }

    @Test
    public void addingNegativeNumbers() {
        Assert.assertEquals(-2, calculator.add(-1, -1));
    }

    @Test
    public void addingNegativeAndPositiveNumbers() {
        Assert.assertEquals(1, calculator.add(2, -1));
    }

    @Test
    public void addingTwoZeros() {
        junit.framework.Assert.assertEquals(0, calculator.add(0, 0));
    }
}