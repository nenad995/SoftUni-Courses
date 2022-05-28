import java.util.Scanner;

public class P02_PoundsToDollars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double pounds = Double.parseDouble(scanner.nextLine());
        double dollars = pounds * 1.36;

        System.out.printf("%.3f", dollars);
    }
}
