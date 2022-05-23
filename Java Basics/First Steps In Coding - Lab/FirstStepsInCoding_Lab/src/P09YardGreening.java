import java.util.Scanner;

public class P09YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double area = Double.parseDouble(scanner.nextLine());

        //Price for 1 m^2 is 7.61
        double totalPrice = area * 7.61;

        //Calculate the discount
        double discount = 0.18 * totalPrice;
        //Calculate the final price
        double finalPrice = totalPrice - discount;

        System.out.println("The final price is " + finalPrice + " lv.");
        System.out.println("The discount is " + discount + " lv.");
    }
}
