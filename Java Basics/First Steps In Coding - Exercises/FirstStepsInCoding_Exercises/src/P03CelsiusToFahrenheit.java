import java.util.Scanner;

public class P03CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //T(°F) = T(°C) × 1.8 + 32

        double celsius = Double.parseDouble(scanner.nextLine());

        double fahrenheit = celsius * 1.8 + 32;

        System.out.printf("%.2f", fahrenheit);
    }
}
