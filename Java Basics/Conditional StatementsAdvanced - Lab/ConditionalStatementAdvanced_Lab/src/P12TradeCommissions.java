import java.util.Scanner;

public class P12TradeCommissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String city = scanner.nextLine();
        double s = Double.parseDouble(scanner.nextLine());

        switch (city){
            case "Sofia":
                if (s >= 0 && s <= 500){
                    double total = s * 0.05;
                    System.out.printf("%.2f", total);
                } else if (s > 500 && s <= 1000){
                    double total = s * 0.07;
                    System.out.printf("%.2f", total);
                } else if (s > 100 && s <= 10000) {
                    double total = s * 0.08;
                    System.out.printf("%.2f", total);
                } else if (s > 10000) {
                    double total = s * 0.12;
                    System.out.printf("%.2f", total);
                } else {
                    System.out.println("error");
                }
                break;
            case "Varna":
                if (s >= 0 && s <= 500){
                    double total = s * 0.045;
                    System.out.printf("%.2f", total);
                } else if (s > 500 && s <= 1000){
                    double total = s * 0.075;
                    System.out.printf("%.2f", total);
                } else if (s > 100 && s <= 10000) {
                    double total = s * 0.1;
                    System.out.printf("%.2f", total);
                } else if (s > 10000) {
                    double total = s * 0.13;
                    System.out.printf("%.2f", total);
                } else {
                    System.out.println("error");
                }
                break;
            case "Plovdiv":
                if (s >= 0 && s <= 500){
                    double total = s * 0.055;
                    System.out.printf("%.2f", total);
                } else if (s > 500 && s <= 1000){
                    double total = s * 0.08;
                    System.out.printf("%.2f", total);
                } else if (s > 100 && s <= 10000) {
                    double total = s * 0.12;
                    System.out.printf("%.2f", total);
                } else if (s > 10000) {
                    double total = s * 0.145;
                    System.out.printf("%.2f", total);
                } else {
                    System.out.println("error");
                }
                break;
            default:
                System.out.println("error");
                break;
        }
    }
}
