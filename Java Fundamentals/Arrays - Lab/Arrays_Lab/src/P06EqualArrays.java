import java.util.Arrays;
import java.util.Scanner;

public class P06EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] firstArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] secondArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        boolean isIdentical = true;

        for (int i = 0; i < firstArr.length; i++){
            if (firstArr[i] != secondArr[i]){
                int index = i;
                System.out.printf("Arrays are not identical. Found difference at %d index.", index);
                isIdentical = false;
                break;
            }
        }
        if (isIdentical){
            int sum = 0;
            for (int element : firstArr) {
                sum += element;
            }

            System.out.printf("Arrays are identical. Sum: %d", sum);
        }
    }
}
