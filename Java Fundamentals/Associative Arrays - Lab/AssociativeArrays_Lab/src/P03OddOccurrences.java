import java.util.*;

public class P03OddOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] wordsArr = scanner.nextLine().split(" ");
        Map<String, Integer> wordsCountMap = new LinkedHashMap<>();

        for (int i = 0; i < wordsArr.length; i++){

            String currentWord = wordsArr[i].toLowerCase();

            Integer wordCount = wordsCountMap.get(currentWord);

            if (wordsCountMap.containsKey(currentWord)){
                wordsCountMap.put(currentWord, wordCount + 1);
            } else {
                wordsCountMap.put(currentWord, 1);
            }

        }

        List<String> oddCountWords = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : wordsCountMap.entrySet()) {
            if (entry.getValue() % 2 != 0){
                oddCountWords.add(entry.getKey());
            }
        }

        System.out.println(String.join(", ", oddCountWords));

    }
}
