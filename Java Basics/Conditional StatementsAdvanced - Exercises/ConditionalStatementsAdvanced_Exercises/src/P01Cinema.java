import java.util.Scanner;

public class P01Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String projection = scanner.nextLine();
        int rows = Integer.parseInt(scanner.nextLine());
        int column = Integer.parseInt(scanner.nextLine());

        double price = 0;

        switch (projection) {
            case "Premiere":
                price = 12;
                break;
            case "Normal":
                price = 7.50;
                break;
            case "Discount":
                price = 5;
                break;
        }
        int allSeats = rows * column;
        double total = allSeats * price;

        System.out.printf("%.2f leva" , total);
    }
}