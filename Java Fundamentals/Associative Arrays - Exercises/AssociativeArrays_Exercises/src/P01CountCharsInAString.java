import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P01CountCharsInAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine().replace(" ", "");

        Map<Character, Integer> characterCountMap = new LinkedHashMap<>();

        for (int i = 0; i < input.length(); i++){
            char ch =  input.charAt(i);

            if (characterCountMap.containsKey(ch)){
                int characterCount = characterCountMap.get(ch);
                characterCountMap.put(ch, characterCount += 1);
            } else {
                characterCountMap.put(ch, 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : characterCountMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

    }
}
