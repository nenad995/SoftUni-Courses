package carSalesman;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfEngines = Integer.parseInt(scanner.nextLine());

        List<Engine> engines = new ArrayList<>();

        for (int i = 0; i < numberOfEngines; i++){
            String[] engineDetails = scanner.nextLine().split("\\s+");

            Engine engine = null;

            String engineModel = engineDetails[0];
            int enginePower = Integer.parseInt(engineDetails[1]);

            switch (engineDetails.length){
                case 4:
                    String engineDisplacement = engineDetails[2];
                    String engineEfficiency = engineDetails[3];
                    engine = new Engine(engineModel, enginePower, engineDisplacement, engineEfficiency);
                    break;
                case 3:
                    if (Character.isLetter(engineDetails[2].charAt(0))){
                        String efficiency = engineDetails[2];
                        engine = new Engine(engineModel, enginePower);
                        engine.setEfficiency(efficiency);
                        engine.setDisplacement("n/a");
                    } else {
                        String displacement = engineDetails[2];
                        engine = new Engine(engineModel, enginePower);
                        engine.setDisplacement(displacement);
                        engine.setEfficiency("n/a");
                    }
                    break;
                case 2:
                    engine = new Engine(engineModel, enginePower);
            }

            engines.add(engine);

        }

        int numberOfCars = Integer.parseInt(scanner.nextLine());

        List<Car> cars = new ArrayList<>();

        for (int j = 0; j < numberOfCars; j++){
            String[] carDetails = scanner.nextLine().split("\\s+");

            String carModel = carDetails[0];
            String engine = carDetails[1];

            Engine currentEngine = engines.stream().filter(engine1 -> engine1.getModel().equals(engine)).findFirst().get();

            Car car = null;

            switch (carDetails.length){
                case 4:
                    String weight = carDetails[2];
                    String color = carDetails[3];
                    car = new Car(carModel, currentEngine,weight, color);
                    break;
                case 3:
                    String token = carDetails[2];

                    if (Character.isDigit(token.charAt(0))){
                        car = new Car(carModel, currentEngine);
                        car.setWeight(token);
                        car.setColor("n/a");
                    } else {
                        car = new Car(carModel, currentEngine);
                        car.setColor(token);
                        car.setWeight("n/a");
                    }
                    break;
                case 2:
                    car = new Car(carModel, currentEngine);
                    break;
            }

         cars.add(car);

        }

        cars.forEach(System.out::println);
    }
}
