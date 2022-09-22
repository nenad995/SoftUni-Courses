import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02FancyBarcode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Pattern barcodePattern = Pattern.compile("@#+[A-Z][A-Za-z0-9]{4,}[A-Z]@#+");

        for (int i = 0; i < n; i++){
            String barcode = scanner.nextLine();
            Matcher barcodeMatcher = barcodePattern.matcher(barcode);

            if (barcodeMatcher.find()){
                String product = barcodeMatcher.group();

                String productGroup = "";

                for (char ch : product.toCharArray()){

                    if (Character.isDigit(ch)){
                        productGroup += ch;
                    }
                }

                if (productGroup.isEmpty()){
                    System.out.println("Product group: 00");
                } else {
                    System.out.println("Product group: " + productGroup);
                }
            } else {
                System.out.println("Invalid barcode");
            }
        }
    }
}
