import junit.framework.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testAdd() throws Exception {
        Assert.assertEquals("Oh man! Learn how to count!!", 1, Calculator.add(1, 1));
    }
}