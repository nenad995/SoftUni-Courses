import java.util.Arrays;
import java.util.Scanner;

public class P04ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int rotations = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < rotations; i++){

            int tmp = numbers[0]; //Store the first element for later

            for (int j = 0; j < numbers.length - 1; j++){
                numbers[j] = numbers[j+1];

            }
            numbers[numbers.length - 1] = tmp; //Setting last element to be the element stored earlier in tmp field
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
