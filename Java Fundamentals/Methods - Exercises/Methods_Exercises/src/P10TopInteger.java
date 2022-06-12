import java.util.Scanner;

public class P10TopInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i < number; i++){
            boolean isDivisible = checkIfDigitsAreDivisible(i);
            boolean isOdd = isAnyDigitOdd(i);

            if (isDivisible && isOdd){
                System.out.println(i);
            }
        }


    }

    public static boolean checkIfDigitsAreDivisible(int num) {

        int digitSum = 0;

        while (num > 0){

            int digit = num % 10;
            digitSum += digit;

            num /= 10;
        }

        return digitSum % 8 == 0;
    }

    public static boolean isAnyDigitOdd(int num) {

        while (num > 0){

            if ((num % 10) % 2 != 0){
                return true;
            }

            num /= 10;
        }

        return false;

    }
}
