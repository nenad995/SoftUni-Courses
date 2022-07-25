import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P03SoftUniBarIncome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Pattern pattern = Pattern.compile("%(?<customer>[A-Z][a-z]+)%[^|$%.]*?<(?<product>\\w+)>[^|$%.]*?\\|(?<count>[0-9]+)\\|[^|$%.]*?(?<price>[0-9]+(\\.[0-9]+)?)\\$");

        double totalIncome = 0;

        while (!input.equals("end of shift")){
            Matcher matcher = pattern.matcher(input);
            while (matcher.find()){
                String customerName = matcher.group("customer");
                String productName = matcher.group("product");
                int productCount = Integer.parseInt(matcher.group("count"));
                double productPrice = Double.parseDouble(matcher.group("price"));

                double totalPrice = productCount * productPrice;

                System.out.printf("%s: %s - %.2f%n", customerName, productName, totalPrice);
                totalIncome += totalPrice;
            }

            input = scanner.nextLine();
        }

        System.out.printf("Total income: %.2f", totalIncome);
    }
}
