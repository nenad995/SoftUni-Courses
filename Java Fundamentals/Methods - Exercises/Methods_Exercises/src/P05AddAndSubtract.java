import java.util.Scanner;

public class P05AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());

        int sum = add(num1, num2);
        int result = subtract(sum, num3);

        System.out.println(result);

    }

    public static int add(int num1, int num2){
        return num1 + num2;
    }

    public static int subtract(int sumOfFirstAndSecondNum, int num3){
        return sumOfFirstAndSecondNum - num3;
    }
}
