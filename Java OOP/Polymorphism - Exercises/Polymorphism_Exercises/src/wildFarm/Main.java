package wildFarm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int line = 0;
        int index = 0;
        String command = scanner.nextLine();

        List<Mammal> mammals = new ArrayList<>();
        List<Food> foodList = new ArrayList<>();

        while (!"End".equals(command)){

            String[] tokens = command.split("\\s+");

            if (line % 2 == 0) {

                String animalType = tokens[0];
                String animalName = tokens[1];
                Double animalWeight = Double.parseDouble(tokens[2]);
                String animalLivingRegion = tokens[3];

                Mammal mammal = null;

                switch (animalType) {
                    case "Mouse":
                        mammal = new Mouse(animalType, animalName, animalWeight, 0, animalLivingRegion);
                        break;
                    case "Cat":
                        String catBreed = tokens[4];
                        mammal = new Cat(animalType, animalName, animalWeight, 0, animalLivingRegion, catBreed);
                        break;
                    case "Tiger":
                        mammal = new Tiger(animalType, animalName, animalWeight, 0, animalLivingRegion);
                        break;
                    case "Zebra":
                        mammal = new Zebra(animalType, animalName, animalWeight, 0, animalLivingRegion);
                        break;
                }

                mammal.makeSound();
                mammals.add(mammal);

            } else {

                String foodType = tokens[0];
                int quantity = Integer.parseInt(tokens[1]);
                Food food = null;

                switch (foodType) {
                    case "Vegetable":
                        food = new Vegetable(quantity);
                        break;
                    case "Meat":
                        food = new Meat(quantity);
                        break;
                }

                foodList.add(food);

                //mammals.get(index).makeSound();
                mammals.get(index).eat(food);
                index++;

            }

            line++;
            command = scanner.nextLine();

        }

        for (Mammal mammal : mammals){
            System.out.println(mammal);
        }

    }

}
