package rawData;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Car> cars = new ArrayList<>();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++){
            String[] information = scanner.nextLine().split("\\s+");

            String model = information[0];

            int engineSpeed = Integer.parseInt(information[1]);
            int enginePower = Integer.parseInt(information[2]);
            Engine engine = new Engine(engineSpeed, enginePower);

            int cargoWeight = Integer.parseInt(information[3]);
            String cargoType = information[4];
            Cargo cargo = new Cargo(cargoWeight, cargoType);

            double tire1Pressure = Double.parseDouble(information[5]);
            int tire1Age = Integer.parseInt(information[6]);
            double tire2Pressure = Double.parseDouble(information[7]);
            int tire2Age = Integer.parseInt(information[8]);
            double tire3Pressure = Double.parseDouble(information[9]);
            int tire3Age = Integer.parseInt(information[10]);
            double tire4Pressure = Double.parseDouble(information[11]);
            int tire4Age = Integer.parseInt(information[12]);
            Tire tire1 = new Tire(tire1Age, tire1Pressure);
            Tire tire2 = new Tire(tire2Age, tire2Pressure);
            Tire tire3 = new Tire(tire3Age, tire3Pressure);
            Tire tire4 = new Tire(tire4Age, tire4Pressure);
            List<Tire> tires = new ArrayList<>();
            tires.add(tire1);
            tires.add(tire2);
            tires.add(tire3);
            tires.add(tire4);

            Car car = new Car(model, engine, cargo, tires);
            cars.add(car);
        }

        String command = scanner.nextLine();

        if (command.equals("fragile")){
            cars.stream()
                    .filter(car -> car.getCargo().getType().equals("fragile") &&
                            car.isOneTireUnder1Pressure(car.getTires()))
                    .forEach(System.out::println);
        } else if (command.equals("flamable")){
            cars.stream()
                    .filter(car -> car.getCargo().getType().equals("flamable") &&
                            car.getEngine().getPower() > 250)
                    .forEach(System.out::println);
        }
    }
}
