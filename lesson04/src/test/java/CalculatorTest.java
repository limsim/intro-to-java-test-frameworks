import junit.framework.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void addReturnsSumOfTwoNumbers() throws Exception {
        Assert.assertEquals("Oh man! Learn how to count!!", 2, new Calculator().add(1, 1));
    }

    @Test
    public void addingNegativeNumbers() {
        Assert.assertEquals(-2, new Calculator().add(-1, -1));
    }

    @Test
    public void addingNegativeAndPositiveNumbers() {
        Assert.assertEquals(1, new Calculator().add(2, -1));
    }

    @Test
    public void addingTwoZeros() {
        Assert.assertEquals(0, new Calculator().add(0, 0));
    }
}