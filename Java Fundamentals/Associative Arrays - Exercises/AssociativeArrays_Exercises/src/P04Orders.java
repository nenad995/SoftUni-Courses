import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P04Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Double> priceMap = new LinkedHashMap<>();
        Map<String, Integer> quantityMap = new LinkedHashMap<>();

        String input = scanner.nextLine();

        while (!input.equals("buy")){

            String[] inputArr = input.split(" ");

            String productName = inputArr[0];
            double productPrice = Double.parseDouble(inputArr[1]);
            int productQuantity = Integer.parseInt(inputArr[2]);

            if (!quantityMap.containsKey(productName)){
                quantityMap.put(productName, productQuantity);
            } else {
                int currentQuantity = quantityMap.get(productName);
                quantityMap.put(productName, currentQuantity + productQuantity);
            }

            priceMap.put(productName, productPrice);


            input = scanner.nextLine();
        }

        for (Map.Entry<String, Double> priceEntry : priceMap.entrySet()) {
            String productName = priceEntry.getKey();
            double sum = quantityMap.get(productName) * priceEntry.getValue();

            System.out.printf("%s -> %.2f%n", productName, sum);

        }
    }
}
