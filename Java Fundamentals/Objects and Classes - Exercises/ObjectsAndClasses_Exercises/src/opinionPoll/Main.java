package opinionPoll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Person> personList = new ArrayList<>();
        int entries = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < entries; i++){
            String[] inputArr = scanner.nextLine().split(" ");

            String personName = inputArr[0];
            int personAge = Integer.parseInt(inputArr[1]);

            Person person = new Person(personName, personAge);

            personList.add(person);
        }

        for (Person person : personList){
            if (person.getAge() > 30){
                System.out.println(person.getName() + " - " + person.getAge());
            }
        }
    }
}
