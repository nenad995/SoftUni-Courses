import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P01Furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        List<String> furniture = new ArrayList<>();
        double totalPrice = 0;

        Pattern pattern = Pattern.compile(">>(?<furnitureName>\\w+)<<(?<price>\\d+.?\\d*)!(?<quantity>\\d+)");

        while (!input.equals("Purchase")){
            Matcher matcher = pattern.matcher(input);

            if (matcher.find()){
                String furnitureName = matcher.group("furnitureName");
                double price = Double.parseDouble(matcher.group("price"));
                int quantity = Integer.parseInt(matcher.group("quantity"));

                furniture.add(furnitureName);
                totalPrice += price * quantity;

            }

            input = scanner.nextLine();
        }

        System.out.println("Bought furniture:");

        for (String element : furniture){
            System.out.println(element);
        }

        System.out.printf("Total money spend: %.2f", totalPrice);
    }
}
