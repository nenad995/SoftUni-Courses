import java.util.Scanner;

public class P03Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double requiredMoney = Double.parseDouble(scanner.nextLine());
        double startingBalance = Double.parseDouble(scanner.nextLine());

        double finalSum = startingBalance;

        boolean spendingInARow = false;
        int spendingCounter = 0;

        int days = 0;

        while (requiredMoney > finalSum) {

            if (spendingCounter >= 5) {
                spendingInARow = true;
                break;
            }

            String action = scanner.nextLine();
            double amount = Double.parseDouble(scanner.nextLine());

            if (action.equals("spend")) {
                finalSum = finalSum - amount;
                spendingCounter ++;
                if (finalSum < 0){
                    finalSum = 0;
                }
            }

            if (action.equals("save")) {
                finalSum = finalSum + amount;
                spendingCounter = 0;
            }

            days++;
        }

        if (spendingInARow) {
            System.out.printf("You can't save the money.%n" +
                    "%d", days);
        } else {
            System.out.printf("You saved the money for %d days." , days);
        }
    }
}