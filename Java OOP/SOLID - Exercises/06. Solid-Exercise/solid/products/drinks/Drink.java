package solid.products.drinks;

import solid.products.Product;

public abstract class Drink implements Product {

    private double milliliters;
    private double caloriesPer100Grams;
    private double density;

    public Drink(double milliliters, double caloriesPer100Grams, double density) {
        this.milliliters = milliliters;
        this.caloriesPer100Grams = caloriesPer100Grams;
        this.density = density;
    }

    @Override
    public double getCalories() {
        double grams = milliliters * density;
        return (caloriesPer100Grams / 100) * grams;
    }

    @Override
    public double getKilograms() {
        return (milliliters * density) / 1000;
    }
}
