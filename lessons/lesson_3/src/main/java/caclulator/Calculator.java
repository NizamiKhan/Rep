package caclulator;

/**
 * Created by nizam on 12.05.2017.
 */
public class Calculator implements ICalculator {

    private double result;

    @Override
    public double getResult() {
        return this.result;
    }

    @Override
    public void add(double first, double second) {
        this.result = first + second;
    }

    @Override
    public void substract(double first, double second) {
        this.result = first - second;
    }

    @Override
    public void div(double first, double second) throws UserException {
        if (second == 0) {
            throw new UserException("нельзя делить на ноль");
        }
        this.result = first / second;
    }

    @Override
    public void multiple(double first, double second) {
        this.result = first * second;
    }

    @Override
    public void exp(double first, double second) {

        double result = first;
        for (int i = 1; i != second; ++i) {
            result *= first;
        }
        this.result = result;
    }
}
