import java.util.Scanner;

public class P02SquareRoot {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        try {
            double sqrt = sqrt(input);
            System.out.printf("%.2f%n", sqrt);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid");
        } finally {
            System.out.println("Goodbye");
        }
    }

    private static double sqrt(String input) {

        int number = Integer.parseInt(input);

        if (number < 0) {
            throw new IllegalArgumentException("Number " + number + " is negative");
        }

        return Math.sqrt(number);

    }
}
