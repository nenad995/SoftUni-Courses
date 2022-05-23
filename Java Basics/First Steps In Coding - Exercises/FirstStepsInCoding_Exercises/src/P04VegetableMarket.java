import java.util.Scanner;

public class P04VegetableMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double vegetablesPricePerKg = Double.parseDouble(scanner.nextLine());
        double fruitsPricePerKg = Double.parseDouble(scanner.nextLine());
        double vegetablesKg = Double.parseDouble(scanner.nextLine());
        double fruitsKg = Double.parseDouble(scanner.nextLine());

        double vegetablesTotal = vegetablesPricePerKg * vegetablesKg;
        double fruitsTotal = fruitsPricePerKg * fruitsKg;

        double totalInBGN = vegetablesTotal + fruitsTotal;
        double totalInEUR = totalInBGN / 1.94;

        System.out.printf("%.2f", totalInEUR);

    }
}
