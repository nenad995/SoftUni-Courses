package birthdayCelebration;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        List<Birthable> birthables = new ArrayList<>();

        while ("End".equals(input)){
            String[] data = input.split("\\s+");
            String type = data[0];

            switch (type){
                case "Citizen":
                    String name = data[1];
                    int age = Integer.parseInt(data[2]);
                    String id = data[3];
                    String birthDate = data[4];

                    Citizen citizen = new Citizen(name, age, id, birthDate);
                    birthables.add(citizen);
                    break;
                case "Pet":
                    String petName = data[1];
                    String petBirthDate = data[2];

                    Pet pet = new Pet(petName, petBirthDate);
                    birthables.add(pet);
                    break;
                case "Robot":
                    break;
            }

            input = scanner.nextLine();
        }

        String year = scanner.nextLine();

        for (Birthable birthable : birthables){
            if (birthable.getBirthDate().equals(year)){
                System.out.println(birthable.getBirthDate());
            }
        }

    }

}
