package carInfo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Car> cars = new ArrayList<>();

        for (int i = 0; i < n; i++){
            String input = scanner.nextLine();
            String[] tokens = input.split(" ");

            String brand = tokens[0];

            if (tokens.length == 1){
                Car car = new Car(brand);
                cars.add(car);
            } else {
                String mode = tokens[1];
                int horsePower = Integer.parseInt(tokens[2]);
                Car car = new Car(brand, mode, horsePower);
                cars.add(car);
            }

        }

        cars.forEach(Car::carInfo);
    }
}
