import java.util.Arrays;
import java.util.Scanner;

public class P07MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int longestSequence = 1; //Used to count longest sequence of same integers
        int currentSequence = 1; //Used to count current sequence of same integers
        int longestSquenceStartIndex = 0; //Used to store index of first element of longest sequence
        int currentIndex = 0; //Used to store index of current element

        for (int i = 1; i < numbers.length; i++){

            if (numbers[i - 1] == numbers[i]){
                currentSequence++;

                if (currentSequence > longestSequence){
                    longestSquenceStartIndex = currentIndex;
                    longestSequence = currentSequence;
                }
            } else {
                currentIndex = i;
                currentSequence = 1;
            }
        }

        for (int i = longestSquenceStartIndex; i < longestSquenceStartIndex + longestSequence; i++){
            System.out.print(numbers[i] + " ");
        }
    }
}
