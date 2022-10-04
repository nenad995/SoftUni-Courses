import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;

public class P03CountUpperCaseWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().split(" ");

        Predicate<String> isStartingWithUpperCase = w -> Character.isUpperCase(w.charAt(0));

        ArrayDeque<String> queOfWords = new ArrayDeque<>();

        Arrays.stream(words)
                .filter(isStartingWithUpperCase)
                .forEach(queOfWords::offer);

        System.out.println(queOfWords.size());

        while (!queOfWords.isEmpty()){
            System.out.println(queOfWords.poll());
        }
    }
}
