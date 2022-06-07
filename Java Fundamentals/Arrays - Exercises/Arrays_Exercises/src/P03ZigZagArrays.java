import java.util.Arrays;
import java.util.Scanner;

public class P03ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[] firstArr = new int[n];
        int[] secondArr = new int[n];

        for (int i = 1; i <= n; i++){
            int[] tempArr = new int[2];
            tempArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            if (i % 2 != 0){
                firstArr[i - 1] = tempArr[0];
                secondArr[i - 1] = tempArr[1];
            } else {
                firstArr[i - 1] = tempArr[1];
                secondArr[i - 1] = tempArr[0];
            }
        }

        for (int i : firstArr){
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i : secondArr){
            System.out.print(i + " ");
        }
    }
}
