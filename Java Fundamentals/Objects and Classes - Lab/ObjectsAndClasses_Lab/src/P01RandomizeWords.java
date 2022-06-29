import java.util.Random;
import java.util.Scanner;

public class P01RandomizeWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] wordsArr = scanner.nextLine().split(" ");

        Random random = new Random();

        for (int i = 0; i < wordsArr.length; i++){
            String temp = wordsArr[i];
            int newRandomWord = random.nextInt(wordsArr.length);
            wordsArr[i] = wordsArr[newRandomWord];
            wordsArr[newRandomWord] = temp;
        }

        for (String word : wordsArr){
            System.out.println(word);
        }

    }
}
