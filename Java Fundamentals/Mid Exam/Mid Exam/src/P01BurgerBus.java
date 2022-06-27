import java.util.Scanner;

public class P01BurgerBus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int numberOfCities = Integer.parseInt(scanner.nextLine());

        double total = 0;
        int cityCount = 0;
        boolean isRainy = false;

        for (int i = 0; i < numberOfCities; i++){

            String city = scanner.nextLine();
            double income = Double.parseDouble(scanner.nextLine());
            double expenses = Double.parseDouble(scanner.nextLine());

            cityCount++;

            if (cityCount % 5 == 0) {
                isRainy = true;
            }

            double profitPerCity = 0;

            if (cityCount % 3 == 0 && isRainy){
                profitPerCity = (income * 0.9) - expenses;
            } else if (cityCount % 3 != 0 && isRainy) {
                profitPerCity = (income * 0.9) - expenses;
            } else if (cityCount % 3 == 0) {
                expenses = expenses * 1.5;
                profitPerCity = income - expenses;
            } else {
                profitPerCity = income - expenses;
            }

            System.out.printf("In %s Burger Bus earned %.2f leva.%n", city, profitPerCity);

            total += profitPerCity;
            isRainy = false;

        }

        System.out.printf("Burger Bus total profit: %.2f leva.", total);
    }
}
