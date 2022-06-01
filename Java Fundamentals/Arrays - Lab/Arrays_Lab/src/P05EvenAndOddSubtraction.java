import java.util.Arrays;
import java.util.Scanner;

public class P05EvenAndOddSubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int evenSum = 0;
        int oddSum = 0;

        for (int num : numbers){
            if (num % 2 == 0){
                evenSum += num;
            } else {
                oddSum += num;
            }
        }

        int diff = evenSum - oddSum;

        System.out.println(diff);
    }
}