package animals;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String animalType = scanner.nextLine();

        while (!"Beast!".equals(animalType)){
            String[] animalInfo = scanner.nextLine().split("\\s+");
            String name = animalInfo[0];
            int age = Integer.parseInt(animalInfo[1]);
            String gender = animalInfo[2];

            try {
                switch (animalType) {
                    case "Cat":
                        Cat cat = new Cat(name, age, gender);
                        break;
                    case "Dog":
                        Dog dog = new Dog(name, age, gender);
                        break;
                    case "Frog":
                        Frog frog = new Frog(name, age, gender);
                        break;
                    case "Kitten":
                        Kitten kitten = new Kitten(name, age);
                        break;
                    case "Tomcat":
                        Tomcat tomcat = new Tomcat(name, age);
                        break;
                }
            } catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }

            animalType = scanner.nextLine();
        }
    }
}
