import java.util.Scanner;

public class P07WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int capacity = 255;
        int liters = 0;

        for (int i = 0; i < n; i++){
            int quantity = Integer.parseInt(scanner.nextLine());

            if ((liters + quantity) > capacity) {
                System.out.println("Insufficient capacity!");
                continue;
            } else {
                liters += quantity;
            }
        }

        System.out.println(liters);
    }
}
