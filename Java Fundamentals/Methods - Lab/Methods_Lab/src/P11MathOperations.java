import java.text.DecimalFormat;
import java.util.Scanner;

public class P11MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        int num2 = Integer.parseInt(scanner.nextLine());

        double sum = calculate(num1, operator, num2);
        System.out.println(new DecimalFormat("0.##").format(sum));

    }

    public static double calculate(int num1, String operator, int num2){
        double result = 0;

        switch (operator){
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 * 1.00 / num2 * 1.00;
                break;
        }
        return result;
    }
}
