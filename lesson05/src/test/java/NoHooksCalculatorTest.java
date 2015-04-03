import org.junit.Assert;
import org.junit.Test;

public class NoHooksCalculatorTest {

    @Test
    public void addReturnsSumOfTwoNumbers() throws Exception {
        junit.framework.Assert.assertEquals("Oh man! Learn how to count!!", 2, new Calculator().add(1, 1));
    }

    @Test
    public void addingNegativeNumbers() {
        junit.framework.Assert.assertEquals(-2, new Calculator().add(-1, -1));
    }

    @Test
    public void addingNegativeAndPositiveNumbers() {
        junit.framework.Assert.assertEquals(1, new Calculator().add(2, -1));
    }

    @Test
    public void addingTwoZeros() {
        junit.framework.Assert.assertEquals(0, new Calculator().add(0, 0));
    }
}