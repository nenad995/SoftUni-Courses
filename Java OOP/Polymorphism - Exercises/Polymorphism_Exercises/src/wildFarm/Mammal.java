package wildFarm;

import java.text.DecimalFormat;

public abstract class Mammal extends Animal {

    private String livingRegion;

    public Mammal(String animalType, String animalName, Double animalWeight, Integer foodEaten, String livingRegion) {
        super(animalType, animalName, animalWeight, foodEaten);
        this.livingRegion = livingRegion;
    }

    public String getLivingRegion() {
        return livingRegion;
    }

    public void setLivingRegion(String livingRegion) {
        this.livingRegion = livingRegion;
    }

    @Override
    public String toString() {
        //"{AnimalType} [{AnimalName}, {AnimalWeight}, {AnimalLivingRegion}, {FoodEaten}]"
        DecimalFormat df = new DecimalFormat("#.##");
        return String.format("%s[%s, %s, %s, %d]",
                this.getAnimalType(), this.getAnimalName(), df.format(this.getAnimalWeight()), this.getLivingRegion(), this.getFoodEaten());
    }
}
