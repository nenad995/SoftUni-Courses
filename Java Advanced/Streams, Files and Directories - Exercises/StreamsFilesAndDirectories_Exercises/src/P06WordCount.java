import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P06WordCount {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new FileReader("resources/words.txt"));

        String[] wordsToSearch = scanner.nextLine().split(" ");

        Map<String, Integer> wordCount = new LinkedHashMap<>();
        for (String word : wordsToSearch){
            wordCount.put(word, 0);
        }
        
        scanner.close();

        Scanner fileScanner = new Scanner(new FileReader("resources/text.txt"));
        String singleWord = fileScanner.next().toLowerCase();

        while (fileScanner.hasNext()){

            if (wordCount.containsKey(singleWord)){
                int occurrences = wordCount.get(singleWord);
                wordCount.put(singleWord, occurrences + 1);
            }

            singleWord = fileScanner.next();
        }

        fileScanner.close();

        PrintWriter printWriter = new PrintWriter(new FileWriter("output.txt"));

        wordCount.entrySet().stream().sorted((f, s) -> s.getValue() - f.getValue())
                .forEach(e -> printWriter.printf("%s - %d%n", e.getKey(), e.getValue()));

        printWriter.close();

    }
}
