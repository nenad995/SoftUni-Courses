import java.util.Scanner;

public class P05Travelling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        double currentAmount = 0;

        while (!input.equals("End")) {
            String destination = input;
            double requiredMoney = Double.parseDouble(scanner.nextLine());

            while (currentAmount < requiredMoney){
                double amount = Double.parseDouble(scanner.nextLine());
                currentAmount += amount;
            }

            System.out.println("Going to " + destination + "!");
            currentAmount = 0;
            input = scanner.nextLine();
        }
    }
}
