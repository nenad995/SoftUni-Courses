package wildFarm;

public class Mouse extends Mammal {

    public Mouse(String animalType, String animalName, Double animalWeight, Integer foodEaten, String livingRegion) {
        super(animalType, animalName, animalWeight, foodEaten, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("SQUEEEAAAK!");
    }

    @Override
    public void eat(Food food) {
        if (food.getClass().getSimpleName().equals("Vegetable")){
            setFoodEaten(getFoodEaten() + food.getQuantity());
        } else {
            System.out.println("Mice are not eating that type of food!");
        }
    }
}
