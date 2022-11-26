package solid.calculators;

import solid.products.Product;

import java.util.List;

public class CalorieCalculator implements Calculator {

    public CalorieCalculator() {
    }

    @Override
    public double total(List<Product> products) {
        return products.stream().mapToDouble(Product::getCalories).sum();
    }

    public double average(List<Product> products) {
        return total(products) / products.size();
    }

}
