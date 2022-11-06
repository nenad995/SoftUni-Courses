package shoppingSpree;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] peopleInput = scanner.nextLine().split(";");
        Map<String ,Person> people = new LinkedHashMap<>();

        for (String input : peopleInput){
            String name = input.split("=")[0];
            double money = Double.parseDouble(input.split("=")[1]);

            try {
                Person person = new Person(name, money);
                people.put(name ,person);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                return;
            }
        }

        String[] productInput = scanner.nextLine().split(";");
        Map<String, Product> products = new LinkedHashMap<>();

        for (String input : productInput){
            String name = input.split("=")[0];
            double cost = Double.parseDouble(input.split("=")[1]);

            try {
                Product product = new Product(name, cost);
                products.put(name ,product);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        String command = scanner.nextLine();

        while (!command.equals("END")){
            String personName = command.split("\\s+")[0];
            String productName = command.split("\\s+")[1];

            try {
                Person person = people.get(personName);
                Product product = products.get(productName);
                person.buyProduct(product);
            } catch (IllegalStateException e){
                System.out.println(e.getMessage());
            }

            command = scanner.nextLine();
        }

        for (Map.Entry<String, Person> entry : people.entrySet()) {
            System.out.println(entry.getValue());
        }


    }
}
