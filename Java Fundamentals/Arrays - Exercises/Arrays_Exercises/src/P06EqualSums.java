import java.util.Arrays;
import java.util.Scanner;

public class P06EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        boolean isFound = false;

        for (int i = 0; i < numbers.length; i++){
            int currentElement = numbers[i];

            int leftSum = 0;
            int rightSum = 0;

            //left index
            for (int j = 0; j < i; j++){
                leftSum += numbers[j];
            }

            //right index
            for (int k = i + 1; k < numbers.length; k++){
                rightSum += numbers[k];
            }

            if (leftSum == rightSum){
                System.out.println(i);
                isFound = true;
                break;
            }
        }

        if (!isFound){
            System.out.println("no");
        }
    }
}
