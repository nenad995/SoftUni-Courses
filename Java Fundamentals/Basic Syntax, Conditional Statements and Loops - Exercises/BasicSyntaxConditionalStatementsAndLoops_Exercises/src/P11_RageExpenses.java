import java.util.Scanner;

public class P11_RageExpenses {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int lostGames = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        double headsetExpenses = headsetPrice * (lostGames / 2);
        double mouseExpenses = mousePrice * (lostGames / 3);
        double keyboardExpenses = keyboardPrice * (lostGames / 6);
        double displayExpenses = displayPrice * (lostGames / 12);

        double total = headsetExpenses + mouseExpenses + keyboardExpenses + displayExpenses;

        System.out.printf("Rage expenses: %.2f lv.", total);
    }
}
