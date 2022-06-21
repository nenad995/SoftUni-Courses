import java.util.Scanner;

public class P01ComputerStore {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        double totalWithoutTaxes = 0;
        double totalWithTaxes = 0;
        double taxes = 0;

        while (!command.equals("special") && !command.equals("regular")){

            double partPrice = Double.parseDouble(command);

            if (partPrice > 0){
                totalWithoutTaxes += partPrice;
                taxes += partPrice * 0.2;
                double tax = partPrice * 1.2;
                totalWithTaxes += tax;
            } else {
                System.out.println("Invalid price!");
            }

            command = scanner.nextLine();
        }

        if (command.equals("special")){
            double specialTotal = totalWithTaxes - (totalWithTaxes * 0.10);
            if (specialTotal > 0) {
                System.out.println("Congratulations you've just bought a new computer!");
                System.out.printf("Price without taxes: %.2f$%n", totalWithoutTaxes );
                System.out.printf("Taxes: %.2f$%n", taxes );
                System.out.println("-----------");
                System.out.printf("Total price: %.2f$", specialTotal );
            } else {
                System.out.println("Invalid order!");
            }
        }

        if (command.equals("regular")){
            if (totalWithTaxes > 0) {
                System.out.println("Congratulations you've just bought a new computer!");
                System.out.printf("Price without taxes: %.2f$%n", totalWithoutTaxes );
                System.out.printf("Taxes: %.2f$%n", taxes );
                System.out.println("-----------");
                System.out.printf("Total price: %.2f$", totalWithTaxes );
            } else {
                System.out.println("Invalid order");
            }
        }
    }
}
