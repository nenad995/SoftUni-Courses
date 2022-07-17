import java.util.Scanner;

public class P02RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputArr = scanner.nextLine().split(" ");
        StringBuilder sb = new StringBuilder();

        for (String input : inputArr) {
            int wordLength = input.length();

            for (int j = 0; j < wordLength; j++) {
                sb.append(input);
            }
        }
        System.out.println(sb);
    }
}
