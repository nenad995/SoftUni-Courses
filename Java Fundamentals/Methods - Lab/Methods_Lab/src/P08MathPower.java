import java.text.DecimalFormat;
import java.util.Scanner;

public class P08MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num = Double.parseDouble(scanner.nextLine());
        int power = Integer.parseInt(scanner.nextLine());
        double finalSum = power(num, power);

        System.out.println(new DecimalFormat("0.####").format(finalSum));

    }

    public static double power(double number, int power){

        double result = Math.pow(number, power);

        return result;
    }
}
