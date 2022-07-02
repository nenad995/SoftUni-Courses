package orderByAge;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Person> personList = new ArrayList<>();
        String input = scanner.nextLine();

        while (!input.equals("End")){

            String[] inputArr = input.split(" ");

            String name = inputArr[0];
            int id = Integer.parseInt(inputArr[1]);
            int age = Integer.parseInt(inputArr[2]);

            Person person = new Person(name, id, age);
            personList.add(person);

            input = scanner.nextLine();
        }

        for (int i = 0; i < personList.size() - 1; i++) {
            for (int j = i + 1; j < personList.size(); j++){
                if (personList.get(i).getAge() > personList.get(j).getAge()){
                    Person youngerPerson = personList.get(j);
                    Person olderPerson = personList.get(i);

                    personList.set(i, youngerPerson);
                    personList.set(j, olderPerson);
                }
            }
        }

        for (Person person : personList){
            String personInfo = person.toString();
            System.out.println(personInfo);
        }

    }
}
