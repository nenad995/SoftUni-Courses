import java.util.*;

public class P03NeedForSpeedIII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Car> carDetails = new LinkedHashMap<>();

        for (int i = 0; i < n; i++){
            String input = scanner.nextLine();

            String carName = input.split("\\|")[0];
            int carMileage = Integer.parseInt(input.split("\\|")[1]);
            int carFuel = Integer.parseInt(input.split("\\|")[2]);

            carDetails.put(carName, new Car(carMileage, carFuel));
        }

        String command = scanner.nextLine();

        while (!command.equals("Stop")){

            String[] commandArr = command.split(" : ");
            String commandType = commandArr[0];
            String car = commandArr[1];

            if (commandType.equals("Drive")){

                int requiredFuel = Integer.parseInt(commandArr[3]);
                int currentFuel = carDetails.get(car).getFuel();

                if (currentFuel >= requiredFuel){
                    int distance = Integer.parseInt(commandArr[2]);
                    int currentMileage = carDetails.get(car).getMileage();

                    carDetails.get(car).setFuel(currentFuel - requiredFuel);
                    carDetails.get(car).setMileage(currentMileage + distance);

                    System.out.println(car + " driven for " + distance + " kilometers. " + requiredFuel + " liters of fuel consumed.");

                    if (carDetails.get(car).getMileage() >= 100000){
                        System.out.println("Time to sell the " + car + "!");
                        carDetails.remove(car);
                    }
                } else {
                    System.out.println("Not enough fuel to make that ride");
                }

            } else if (commandType.equals("Refuel")){
                int fuelAmount = Integer.parseInt(commandArr[2]);
                int currentFuel = carDetails.get(car).getFuel();

                if (fuelAmount + currentFuel > 75){
                    int requiredAmount = 75 - currentFuel;
                    carDetails.get(car).setFuel(currentFuel + requiredAmount);
                    System.out.println(car + " refueled with " + requiredAmount + " liters");
                } else {
                    carDetails.get(car).setFuel(currentFuel + fuelAmount);
                    System.out.println(car + " refueled with " + fuelAmount + " liters");
                }

            } else if (commandType.equals("Revert")){
                int kilometers = Integer.parseInt(commandArr[2]);
                int currentMileage = carDetails.get(car).getMileage();

                if (currentMileage - kilometers < 10000){
                    carDetails.get(car).setMileage(10000);
                } else {
                    carDetails.get(car).setMileage(currentMileage - kilometers);
                    System.out.println(car + " mileage decreased by " + kilometers + " kilometers");
                }
            }

            command = scanner.nextLine();
        }

        for (Map.Entry<String, Car> entry : carDetails.entrySet()) {
            int mileage = entry.getValue().getMileage();
            int fuel = entry.getValue().getFuel();

            System.out.println(entry.getKey() + " -> Mileage: " + mileage + " kms, Fuel in the tank: " + fuel + " lt.");
        }
    }

    public static class Car{
        int mileage;
        int fuel;

        public Car(int mileage, int fuel) {
            this.mileage = mileage;
            this.fuel = fuel;
        }

        public int getMileage() {
            return mileage;
        }

        public void setMileage(int mileage) {
            this.mileage = mileage;
        }

        public int getFuel() {
            return fuel;
        }

        public void setFuel(int fuel) {
            this.fuel = fuel;
        }

        @Override
        public String toString() {
            return "Car{" +
                    "mileage=" + mileage +
                    ", fuel=" + fuel +
                    '}';
        }
    }
}
