package start;

import caclulator.Calculator;
import caclulator.UserException;

/**
 * Created by nizam on 12.05.2017.
 */
public class Start {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        try {
            calculator.div(3, 0);
        } catch (UserException e) {
            System.out.println(e.getMessage());
        }


        System.out.println(calculator.getResult());
    }
}
