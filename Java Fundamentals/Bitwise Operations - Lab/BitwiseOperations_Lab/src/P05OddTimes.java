import java.util.Arrays;
import java.util.Scanner;

public class P05OddTimes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int result = 0;

        for (int i = 0; i < arr.length; i++){

            int currentElement = result ^ arr[i];
            int count = 0;

            for (int j = 0; j < arr.length; j++){
                int testElement = result ^ arr[j];

                if ((currentElement ^ testElement) == 0){
                    count++;
                }
            }

            if (count % 2 != 0){
                System.out.println(arr[i]);
                break;
            }

        }
    }
}
