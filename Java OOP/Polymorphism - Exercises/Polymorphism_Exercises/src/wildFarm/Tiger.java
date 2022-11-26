package wildFarm;

public class Tiger extends Felime {

    public Tiger(String animalType, String animalName, Double animalWeight, Integer foodEaten, String livingRegion) {
        super(animalType, animalName, animalWeight, foodEaten, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("ROAAR!!!");
    }

    @Override
    public void eat(Food food) {
        if (food.getClass().getSimpleName().equals("Meat")){
            setFoodEaten(getFoodEaten() + food.getQuantity());
        } else {
            System.out.println("Tigers are not eating that type of food!");
        }
    }
}
