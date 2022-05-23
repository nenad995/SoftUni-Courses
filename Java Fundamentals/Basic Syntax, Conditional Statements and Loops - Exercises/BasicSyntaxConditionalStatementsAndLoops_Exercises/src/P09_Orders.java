import java.util.Scanner;

public class P09_Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countOfOrders = Integer.parseInt(scanner.nextLine());

        double pricePerCapsule = 0;
        int days = 0;
        int numberOfCapsules = 0;

        double total = 0;

        for (int i = 0; i < countOfOrders; i++) {
            pricePerCapsule = Double.parseDouble(scanner.nextLine());
            days = Integer.parseInt(scanner.nextLine());
            numberOfCapsules = Integer.parseInt(scanner.nextLine());

            double totalForSingleOrder = (days * numberOfCapsules) * pricePerCapsule;
            System.out.printf("The price for the coffee is: $%.2f%n", totalForSingleOrder);

            total = total + totalForSingleOrder;
        }

        System.out.printf("Total: $%.2f", total);

    }
}
