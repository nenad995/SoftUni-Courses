import java.util.Scanner;

public class P05AccountBalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double balance = 0;

        String input = scanner.nextLine();

        while (!input.equals("NoMoreMoney")){
            double increase = Double.parseDouble(input);

            if (increase < 0){
                System.out.println("Invalid operation!");
                break;
            } else {
                System.out.printf("Increase: %.2f%n", increase);
                balance += increase;
            }

            input = scanner.nextLine();
        }

        System.out.printf("Total: %.2f", balance);
    }
}
