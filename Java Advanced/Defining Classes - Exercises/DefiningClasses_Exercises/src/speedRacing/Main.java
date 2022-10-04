package speedRacing;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Car> carMap = new LinkedHashMap<>();

        for (int i = 0; i < n; i++){
            String[] tokens = scanner.nextLine().split("\\s+");

            String model = tokens[0];
            double fuelAmount = Double.parseDouble(tokens[1]);
            double fuelConsumption = Double.parseDouble(tokens[2]);

            Car car = new Car(model, fuelAmount, fuelConsumption);

            carMap.put(model, car);
        }

        String command = scanner.nextLine();

        while (!command.equals("End")){
            String[] commandParts = command.split("\\s+");

            String model = commandParts[1];
            int distance = Integer.parseInt(commandParts[2]);

            Car carToDrive = carMap.get(model);
            carToDrive.drive(distance);

            command = scanner.nextLine();
        }

        carMap.values().forEach(System.out::println);

    }
}
