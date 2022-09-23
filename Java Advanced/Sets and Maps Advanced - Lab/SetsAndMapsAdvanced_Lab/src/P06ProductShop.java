import java.util.*;

public class P06ProductShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> productNames = new TreeMap<>();
        Map<String, List<Double>> productPrices = new TreeMap<>();
        String input = scanner.nextLine();

        while (!input.equals("Revision")){

            String shopName = input.split(", ")[0];
            String productName = input.split(", ")[1];
            double productPrice = Double.parseDouble(input.split(", ")[2]);

            if (!productNames.containsKey(shopName)){
                productNames.put(shopName, new ArrayList<>());
                productNames.get(shopName).add(productName);
                productPrices.put(shopName, new ArrayList<>());
                productPrices.get(shopName).add(productPrice);
            } else {
                //if shop is already in the map, check if there is a product with the given name in this shop
                //if we find the product in the shop, we get it's index
                int index = -1;

                for (int i = 0; i < productNames.get(shopName).size(); i++){
                    String product = productNames.get(shopName).get(i);

                    if (product.equals(productName)){
                        index = i;
                        break;
                    }
                }
                //if we didn't find the product in the shop, we add product to the list
                //else we update the price
                if (index < 0){
                    productNames.get(shopName).add(productName);
                    productPrices.get(shopName).add(productPrice);
                } else {
                    productPrices.get(shopName).set(index, productPrice);
                }
            }

            input = scanner.nextLine();
        }

        for (Map.Entry<String, List<String>> entry : productNames.entrySet()) {
            System.out.println(entry.getKey() + "->");

            for (int i = 0; i < entry.getValue().size(); i++){
                System.out.printf("Product: %s, Price: %.1f%n",
                        entry.getValue().get(i),
                        productPrices.get(entry.getKey()).get(i));
            }
        }

    }
}
