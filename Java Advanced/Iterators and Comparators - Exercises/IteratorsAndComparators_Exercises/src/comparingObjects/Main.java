package comparingObjects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        List<Person> people = new ArrayList<>();

        while (!input.equals("END")){
            String[] peopleData = input.split("\\s+");

            String name = peopleData[0];
            int age = Integer.parseInt(peopleData[1]);
            String town = peopleData[2];

            Person person = new Person(name, age, town);
            people.add(person);

            input = scanner.nextLine();
        }

        int index = Integer.parseInt(scanner.nextLine());

        int differentPeople = 0;
        int samePeople = 0;
        int size = people.size();

        Person mainPerson = people.get(index - 1);
        //people.remove(index - 1);

        for (Person person : people){
            if (person.compareTo(mainPerson) == 0){
                samePeople++;
            } else {
                differentPeople++;
            }
        }

        if (samePeople == 0){
            System.out.println("No Matches");
        } else {
            System.out.printf("%d %d %d%n", samePeople, differentPeople, size);
        }
    }
}
