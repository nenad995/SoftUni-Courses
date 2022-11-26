package solid.output;

import solid.calculators.Calculator;
import solid.products.Product;

import java.util.List;

public class ConsoleOutput implements Output {

    private static final String SUM = "Sum: %f";
    private static final String AVERAGE = "Average: %f";
    private Calculator calculator;

    public ConsoleOutput(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public void outputSum(List<Product> products) {
        System.out.printf((SUM) + "%n", calculator.total(products));
    }

    @Override
    public void outputAverage(List<Product> products) {
        System.out.printf((AVERAGE) + "%n", calculator.average(products));
    }
}
