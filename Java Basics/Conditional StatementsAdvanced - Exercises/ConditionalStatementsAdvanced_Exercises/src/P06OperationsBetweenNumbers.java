import java.util.Scanner;

public class P06OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        String operation = scanner.nextLine();

        if (operation.equals("+")){
            if ((n1 + n2) % 2 == 0){
                System.out.printf("%d + %d = %d - even", n1, n2, (n1 + n2));
            } else if ((n1 + n2) % 2 != 0) {
                System.out.printf("%d + %d = %d - odd", n1, n2, (n1 + n2));
            }
        } else if (operation.equals("-")) {
            if ((n1 - n2) % 2 == 0){
                System.out.printf("%d - %d = %d - even", n1, n2, (n1 - n2));
            } else if ((n1 - n2) % 2 != 0) {
                System.out.printf("%d - %d = %d - odd", n1, n2, (n1 - n2));
            }
        } else if (operation.equals("*")) {
            if ((n1 * n2) % 2 == 0){
                System.out.printf("%d * %d = %d - even", n1, n2, (n1 * n2));
            } else if ((n1 * n2) % 2 != 0) {
                System.out.printf("%d * %d = %d - odd", n1, n2, (n1 * n2));
            }
        } else if (operation.equals("/")) {
            if (n2 == 0){
                System.out.printf("Cannot divide %d by zero", n1);
            } else {
                double result = (n1 * 1.00) / (n2 * 1.00);
                System.out.printf("%d / %d = %.2f", n1, n2, result);
            }
        } else if (operation.equals("%")){
            if (n2 == 0){
                System.out.printf("Cannot divide %d by zero", n1);
            } else {
                System.out.printf("%d %% %d = %d", n1, n2, (n1 % n2));
            }
        }
    }
}