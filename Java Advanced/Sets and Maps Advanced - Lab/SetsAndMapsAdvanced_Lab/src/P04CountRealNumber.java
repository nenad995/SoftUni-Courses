import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P04CountRealNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] input = Arrays.stream(scanner.nextLine().split(" ")).mapToDouble(Double::parseDouble).toArray();

        Map<Double, Integer> realNumbers = new LinkedHashMap<>();

        for (double value : input){
            if (!realNumbers.containsKey(value)){
                realNumbers.put(value, 1);
            } else {
                int count = realNumbers.get(value);
                realNumbers.put(value, count + 1);
            }
        }

        for (Double key : realNumbers.keySet()){
            System.out.printf("%.1f -> %d%n",key, realNumbers.get(key));
        }
    }
}
