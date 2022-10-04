package google;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, Person> people = new HashMap<>();

        while (!input.equals("End")){
            String[] tokens = input.split("\\s+");
            String name = tokens[0];

            Person person = null;

            if (!people.containsKey(name)){
                person = new Person(name);
            } else {
                person = people.get(name);
            }


            String modifier = tokens[1];

            switch (modifier){
                case "company":
                    String companyName = tokens[2];
                    String department = tokens[3];
                    double salary = Double.parseDouble(tokens[4]);
                    Company company = new Company(companyName, department, salary);
                    person.setCompany(company);
                    break;
                case "pokemon":
                    String pokemonName = tokens[2];
                    String pokemonType = tokens[3];
                    Pokemon pokemon = new Pokemon(pokemonName, pokemonType);
                    person.getPokemons().add(pokemon);
                    break;
                case "parents":
                    String parentName = tokens[2];
                    String parentBirthday = tokens[3];
                    Parent parent = new Parent(parentName, parentBirthday);
                    person.getParents().add(parent);
                    break;
                case "children":
                    String childName = tokens[2];
                    String childBirthday = tokens[3];
                    Children children = new Children(childName, childBirthday);
                    person.getChildren().add(children);
                    break;
                case "car":
                    String carModel = tokens[2];
                    int carSpeed = Integer.parseInt(tokens[3]);
                    Car car = new Car(carModel, carSpeed);
                    person.setCar(car);
                    break;
            }

            people.put(name, person);

            input = scanner.nextLine();
        }

        String personName = scanner.nextLine();

        if (people.containsKey(personName)){
            System.out.println(people.get(personName).toString());
        }
    }
}
