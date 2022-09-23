import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class P04CountSymbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<Character, Integer> map = new TreeMap<>();

        for (int i = 0; i < input.length(); i++){

            char ch = input.charAt(i);

            if (!map.containsKey(ch)){
                map.put(ch, 1);
            } else {
                int count = map.get(ch);
                map.put(ch, count + 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " time/s");
        }

    }
}
