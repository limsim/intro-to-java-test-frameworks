/**
 * Created by limsim on 23/03/15.
 */
public class Calculator {

    private int result;

    public int add(int firstNumber, int secondNumber) {
        result = result + firstNumber + secondNumber;
        return result;
    }

    public void reset() {
        result = 0;
    }
}
