package caclulator;

/**
 * Created by nizam on 12.05.2017.
 */
public interface ICalculator {

    double getResult();

    void add(double first, double second);

    void substract(double first, double second);

    void div(double first, double second) throws UserException;

    void multiple(double first, double second);

    void exp(double first, double second);
}
