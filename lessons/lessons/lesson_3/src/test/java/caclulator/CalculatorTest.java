package caclulator;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by nizam on 12.05.2017.
 */
public class CalculatorTest {
    @Test
    public void getResult() throws Exception {
        Calculator calculator = new Calculator();
        double result = calculator.getResult();
        assertEquals(0, result, 0);
    }

    @Test
    public void add() throws Exception {
        Calculator calculator = new Calculator();
        calculator.add(1, 1);
        assertEquals(2, calculator.getResult(), 0);
    }

    @Test
    public void substract() throws Exception {
        Calculator calculator = new Calculator();
        calculator.substract(1, 1);
        assertEquals(0, calculator.getResult(), 0);
    }

    @Test
    public void div() throws UserException {
        Calculator calculator = new Calculator();
        calculator.div(6, 2);
        assertEquals(3, calculator.getResult(), 0);
    }

    @Test(expected = UserException.class)
    public void divException() throws UserException {
        Calculator calculator = new Calculator();
        calculator.div(3, 0);
    }

    @Test
    public void multiple() throws Exception {
        Calculator calculator = new Calculator();
        calculator.multiple(4, 2);
        assertEquals(8, calculator.getResult(), 0);
    }

    @Test
    public void exp() throws Exception {
        Calculator calculator = new Calculator();
        calculator.exp(3, 3);
        assertEquals(27, calculator.getResult(), 0);
    }

}