import java.util.Scanner;

public class P07_TheatrePromotions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeOfDay = scanner.nextLine().toLowerCase();
        int age = Integer.parseInt(scanner.nextLine());

        switch (typeOfDay) {
            case "weekday":
                if (age >= 0 && age <= 18) {
                    System.out.println(12 + "$");
                } else if (age > 18 && age <= 64) {
                    System.out.println(18 + "$");
                } else if (age > 64 && age <= 122) {
                    System.out.println(12 + "$");
                } else {
                    System.out.println("Error!");
                }
                break;
            case "weekend":
                if (age >= 0 && age <= 18) {
                    System.out.println(15 + "$");
                } else if (age > 18 && age <= 64) {
                    System.out.println(20 + "$");
                } else if (age > 64 && age <= 122) {
                    System.out.println(15 + "$");
                } else {
                    System.out.println("Error!");
                }
                break;
            case "holiday":
                if (age >= 0 && age <= 18) {
                    System.out.println(5 + "$");
                } else if (age > 18 && age <= 64) {
                    System.out.println(12 + "$");
                } else if (age > 64 && age <= 122) {
                    System.out.println(10 + "$");
                } else {
                    System.out.println("Error!");
                }
                break;
        }
    }
}
