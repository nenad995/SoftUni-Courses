import java.util.Scanner;

public class P10MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        System.out.println(getMultipleOfEvensAndOdds(number));

    }

    public static int getEvenSum(int number){

        int evenSum = 0;

        while (number > 0){
            int digit = number % 10;

            if (digit % 2 == 0){
                evenSum += digit;
            }

            number /= 10;
        }
        return evenSum;
    }

    public static int getOddSum(int number){

        int oddSum = 0;

        while (number > 0){
            int digit = number % 10;

            if (digit % 2 != 0){
                oddSum += digit;
            }

            number /= 10;
        }
        return oddSum;
    }

    public static int getMultipleOfEvensAndOdds(int number){

        if (number < 0){
            number = Math.abs(number);
        }

        int evenSum = getEvenSum(number);
        int oddSum = getOddSum(number);
        int total = evenSum * oddSum;

        return total;
    }
}
