package wildFarm;

import java.text.DecimalFormat;

public abstract class Animal {

    private String animalName;
    private String animalType;
    private Double animalWeight;
    private Integer foodEaten;

    public Animal(String animalType, String animalName, Double animalWeight, Integer foodEaten) {
        this.animalType = animalType;
        this.animalName = animalName;
        this.animalWeight = animalWeight;
        this.foodEaten = foodEaten;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public Double getAnimalWeight() {
        return animalWeight;
    }

    public void setAnimalWeight(Double animalWeight) {
        this.animalWeight = animalWeight;
    }

    public Integer getFoodEaten() {
        return foodEaten;
    }

    public void setFoodEaten(Integer foodEaten) {
        this.foodEaten = foodEaten;
    }

    public abstract void makeSound();
    public abstract void eat (Food food);


}
