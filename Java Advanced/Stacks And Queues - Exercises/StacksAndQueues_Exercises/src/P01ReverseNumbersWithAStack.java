import java.util.ArrayDeque;
import java.util.Scanner;

public class P01ReverseNumbersWithAStack {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        ArrayDeque<Integer> reverseInput = new ArrayDeque<>();

        for (String number : input) {
            reverseInput.push(Integer.parseInt(number));
        }

        while (!reverseInput.isEmpty()){
            System.out.printf("%d ", reverseInput.pop());
        }
    }
}
