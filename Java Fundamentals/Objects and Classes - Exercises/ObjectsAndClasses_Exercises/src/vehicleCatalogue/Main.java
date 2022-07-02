package vehicleCatalogue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        List<Vehicle> vehicles = new ArrayList<>();

        while (!command.equals("End")){
            String[] commandArr = command.split(" ");

            String vehicleType = commandArr[0];
            String vehicleModel = commandArr[1];
            String vehicleColor = commandArr[2];
            int vehicleHorsepower = Integer.parseInt(commandArr[3]);

            Vehicle vehicle = new Vehicle(vehicleType, vehicleModel, vehicleColor, vehicleHorsepower);

            vehicles.add(vehicle);

            command = scanner.nextLine();
        }

        command = scanner.nextLine();

        while (!command.equals("Close the Catalogue")){
            String model = command;

            for (Vehicle vehicle : vehicles){
                if (vehicle.getModel().equals(model)){
                    String vehicleInfo = vehicle.toString();
                    System.out.println(vehicleInfo);
                }
            }

            command = scanner.nextLine();
        }

        int totalCarHorsepower = 0;
        int totalTruckHorsepower = 0;
        int carCount = 0;
        int truckCount = 0;

        for (Vehicle vehicle : vehicles){

            int hp = vehicle.getHorsepower();

            if (vehicle.getType().equals("car")){
                totalCarHorsepower += hp;
                carCount++;
            } else {
                totalTruckHorsepower += hp;
                truckCount++;
            }
        }

        if (carCount != 0){
            double averageCarHp = (totalCarHorsepower * 1.0) / carCount;
            System.out.printf("Cars have average horsepower of: %.2f.%n", averageCarHp);
        } else {
            System.out.printf("Cars have average horsepower of: 0.00.%n");
        }

        if (truckCount != 0){
            double averageTruckHp = (totalTruckHorsepower * 1.0) / truckCount;
            System.out.printf("Trucks have average horsepower of: %.2f.%n", averageTruckHp);
        } else {
            System.out.printf("Trucks have average horsepower of: 0.00.%n");
        }

    }
}
