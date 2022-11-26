package vehicles;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] carInfo = scanner.nextLine().split("\\s+");
        double carFuelQuantity = Double.parseDouble(carInfo[1]);
        double carFuelConsumption = Double.parseDouble(carInfo[2]);
        double carTankCapacity = Double.parseDouble(carInfo[3]);
        VehicleImpl car = new Car(carFuelQuantity, carFuelConsumption, carTankCapacity);

        String[] truckInfo = scanner.nextLine().split("\\s+");
        double truckFuelQuantity = Double.parseDouble(truckInfo[1]);
        double truckFuelConsumption = Double.parseDouble(truckInfo[2]);
        double truckTankCapacity = Double.parseDouble(truckInfo[3]);
        VehicleImpl truck = new Truck(truckFuelQuantity, truckFuelConsumption, truckTankCapacity);

        String[] busInfo = scanner.nextLine().split("\\s+");
        double busFuelQuantity = Double.parseDouble(busInfo[1]);
        double busFuelConsumption = Double.parseDouble(busInfo[2]);
        double busTankCapacity = Double.parseDouble(busInfo[3]);
        VehicleImpl bus = new Bus(busFuelQuantity, busFuelConsumption, busTankCapacity);

        Map<String, VehicleImpl> vehicles = new LinkedHashMap<>();
        vehicles.put("Car", car);
        vehicles.put("Truck", truck);
        vehicles.put("Bus", bus);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {

            String command = scanner.nextLine();

            String commandType = command.split("\\s+")[0];
            String vehicleType = command.split("\\s+")[1];
            double distance = Double.parseDouble(command.split("\\s+")[2]);

            if ("Drive".equals(commandType)){
                System.out.println(vehicles.get(vehicleType).driveWithAC(distance));
            } else if ("DriveEmpty".equals(commandType)) {
                System.out.println(vehicles.get(vehicleType).drive(distance));
            } else if ("Refuel".equals(commandType)){
                double liters = Double.parseDouble(command.split("\\s+")[2]);
                vehicles.get(vehicleType).refuel(liters);
            }
        }

        for (Map.Entry<String, VehicleImpl> entry : vehicles.entrySet()) {
            System.out.println(entry.getValue());
        }

    }
}
