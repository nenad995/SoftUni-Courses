import java.util.Scanner;

public class P06Fishland {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double skumriqPrice = Double.parseDouble(scanner.nextLine());
        double cacaPrice = Double.parseDouble(scanner.nextLine());

        double palamudQuantity = Double.parseDouble(scanner.nextLine());
        double safridQuantity = Double.parseDouble(scanner.nextLine());
        int midiQuantity = Integer.parseInt(scanner.nextLine());

        double palamudPrice = (1.6 * skumriqPrice) * palamudQuantity;
        double safridPrice = (1.8 * cacaPrice) * safridQuantity;
        double midiPrice = 7.5 * midiQuantity;

        double total = palamudPrice + safridPrice + midiPrice;

        System.out.printf("%.2f", total);
    }
}
