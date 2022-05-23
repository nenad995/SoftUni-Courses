import java.util.Scanner;

public class P03_Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfPersons = Integer.parseInt(scanner.nextLine());
        String typeOfGroup = scanner.nextLine();
        String day = scanner.nextLine();

        double total = 0;

        if (typeOfGroup.equals("Students")){
            if (day.equals("Friday")){
                total = numberOfPersons * 8.45;
                if (numberOfPersons >= 30){
                    total = total - (total * 0.15);
                    System.out.printf("Total price: %.2f", total);
                } else {
                    System.out.printf("Total price: %.2f", total);
                }
            } else if (day.equals("Saturday")) {
                total = numberOfPersons * 9.80;
                if (numberOfPersons >= 30){
                    total = total - (total * 0.15);
                    System.out.printf("Total price: %.2f", total);
                } else {
                    System.out.printf("Total price: %.2f", total);
                }
            } else if (day.equals("Sunday")){
                total = numberOfPersons * 10.46;
                if (numberOfPersons >= 30){
                    total = total - (total * 0.15);
                    System.out.printf("Total price: %.2f", total);
                } else {
                    System.out.printf("Total price: %.2f", total);
                }
            }
        } else if (typeOfGroup.equals("Business")){
            if (day.equals("Friday")){
                total = numberOfPersons * 10.90;
                if (numberOfPersons >= 100){
                    total = total - 109;
                    System.out.printf("Total price: %.2f", total);
                } else {
                    System.out.printf("Total price: %.2f", total);
                }
            } else if (day.equals("Saturday")) {
                total = numberOfPersons * 15.60;
                if (numberOfPersons >= 100){
                    total = total - 156;
                    System.out.printf("Total price: %.2f", total);
                } else {
                    System.out.printf("Total price: %.2f", total);
                }
            } else if (day.equals("Sunday")){
                total = numberOfPersons * 16;
                if (numberOfPersons >= 160){
                    total = total - 109;
                    System.out.printf("Total price: %.2f", total);
                } else {
                    System.out.printf("Total price: %.2f", total);
                }
            }
        } else if (typeOfGroup.equals("Regular")){
            if (day.equals("Friday")){
                total = numberOfPersons * 15;
                if (numberOfPersons >= 10 && numberOfPersons <= 20) {
                    total = total * 0.95;
                    System.out.printf("Total price: %.2f", total);
                } else {
                    System.out.printf("Total price: %.2f", total);
                }
            } else if (day.equals("Saturday")) {
                total = numberOfPersons * 20;
                if (numberOfPersons >= 10 && numberOfPersons <= 20) {
                    total = total * 0.95;
                    System.out.printf("Total price: %.2f", total);
                } else {
                    System.out.printf("Total price: %.2f", total);
                }
            } else if (day.equals("Sunday")){
                total = numberOfPersons * 22.50;
                if (numberOfPersons >= 10 && numberOfPersons <= 20) {
                    total = total * 0.95;
                    System.out.printf("Total price: %.2f", total);
                } else {
                    System.out.printf("Total price: %.2f", total);
                }
            }
        }
    }
}
