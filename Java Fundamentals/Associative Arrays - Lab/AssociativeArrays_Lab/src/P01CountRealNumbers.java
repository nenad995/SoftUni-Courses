import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class P01CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToDouble(Double::parseDouble).toArray();
        Map<Double, Integer> map = new TreeMap<>();

        for (double num : numbers){

            map.putIfAbsent(num, 0);
            int currentValue = map.get(num);
            map.put(num, currentValue + 1);

            /*if (!map.containsKey(num)){
                map.put(num, 1);
            } else {
                int value  = map.get(num);
                map.put(num, value + 1);
            }*/
        }

        for (Map.Entry<Double, Integer> entry : map.entrySet()){
            DecimalFormat decimalFormat = new DecimalFormat("#.#######");
            System.out.println(decimalFormat.format(entry.getKey()) + " -> " + entry.getValue());
        }
    }
}
