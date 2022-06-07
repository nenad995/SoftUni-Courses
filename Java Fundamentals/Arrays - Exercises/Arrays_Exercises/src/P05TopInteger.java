import java.util.Arrays;
import java.util.Scanner;

public class P05TopInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < numbers.length; i++){
            int topInteger = numbers[i];

            for (int j = i + 1; j < numbers.length; j++){

                if (numbers[j] >= topInteger){
                    topInteger = numbers[j];
                    i = j;
                }
            }
            System.out.print(topInteger + " ");
        }
    }
}
