package foodShortage;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String ,Buyer> buyers = new HashMap<>();

        for (int i = 0 ; i < n; i++){
            String information = scanner.nextLine();
            String[] data = information.split("\\s+");

            String type = data[0];
            String name = data[1];
            int age = Integer.parseInt(data[2]);

            Buyer buyer;

            if ("Citizen".equals(type)){
                String id = data[3];
                String birthDate = data[4];
                buyer = new Citizen(name, age, id, birthDate);
            } else {
                String group = data[3];
                buyer = new Rebel(name, age, group);
            }

            buyers.put(name ,buyer);

        }

        String command = scanner.nextLine();

        while (!"End".equals(command)){
            String nameToCheck = command;

            Buyer buyer = buyers.get(nameToCheck);

            if (buyer != null){
                buyer.buyFood();
            }

            command = scanner.nextLine();
        }

        System.out.println(buyers.values().stream().mapToInt(Buyer::getFood).sum());

    }

}
