package wildFarm;

import java.text.DecimalFormat;

public class Cat extends Felime {

    private String breed;

    public Cat(String animalType, String animalName, Double animalWeight, Integer foodEaten, String livingRegion, String breed) {
        super(animalType, animalName, animalWeight, foodEaten, livingRegion);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println("Meowwww");
    }

    @Override
    public void eat(Food food) {
        setFoodEaten(getFoodEaten() + food.getQuantity());
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#.##");
        return String.format("%s[%s, %s, %s, %s, %d]",
                getAnimalType(), getAnimalName(), getBreed(), df.format(getAnimalWeight()), getLivingRegion(), getFoodEaten());
    }
}
