import java.util.Scanner;

public class P04ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double excursionPrice = Double.parseDouble(scanner.nextLine());

        int puzzles = Integer.parseInt(scanner.nextLine());
        int dolls = Integer.parseInt(scanner.nextLine());
        int bears = Integer.parseInt(scanner.nextLine());
        int minions = Integer.parseInt(scanner.nextLine());
        int trucks = Integer.parseInt(scanner.nextLine());

        int totalItems = puzzles + dolls + bears + minions + trucks;

        double totalEarnings = (puzzles * 2.60) + (dolls * 3) + (bears * 4.10) + (minions * 8.20) + (trucks * 2); //Печалбата от всичките купени играчки

        if (totalItems >= 50) {
            totalEarnings = totalEarnings - (totalEarnings * 0.25);
        }

        double tax = totalEarnings * 0.1;
        double total = totalEarnings - tax;

        if (total >= excursionPrice){
            System.out.printf("Yes! %.2f lv left.", (total - excursionPrice));
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", (excursionPrice - total));
        }
    }
}
