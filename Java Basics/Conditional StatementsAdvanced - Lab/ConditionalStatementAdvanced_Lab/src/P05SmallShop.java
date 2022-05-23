import java.util.Scanner;

public class P05SmallShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        String city = scanner.nextLine();
        double amount = Double.parseDouble(scanner.nextLine());

        if ("Sofia".equals(city)) {
            if ("coffee".equals(product)) {
                System.out.println(0.50 * amount);
            } else if ("water".equals(product)) {
                System.out.println(0.80 * amount);
            } else if ("beer".equals(product)) {
                System.out.println(1.20 * amount);
            } else if ("sweets".equals(product)) {
                System.out.println(1.45 * amount);
            } else if ("peanuts".equals(product)) {
                System.out.println(1.60 * amount);
            }
        } else if ("Plovdiv".equals(city)) {
            if ("coffee".equals(product)) {
                System.out.println(0.40 * amount);
            } else if ("water".equals(product)) {
                System.out.println(0.70 * amount);
            } else if ("beer".equals(product)) {
                System.out.println(1.15 * amount);
            } else if ("sweets".equals(product)) {
                System.out.println(1.30 * amount);
            } else if ("peanuts".equals(product)) {
                System.out.println(1.50 * amount);
            }
        } else if ("Varna".equals(city)) {
            if ("coffee".equals(product)) {
                System.out.println(0.45 * amount);
            } else if ("water".equals(product)) {
                System.out.println(0.70 * amount);
            } else if ("beer".equals(product)) {
                System.out.println(1.10 * amount);
            } else if ("sweets".equals(product)) {
                System.out.println(1.35 * amount);
            } else if ("peanuts".equals(product)) {
                System.out.println(1.55 * amount);
            }
        }
    }
}
