import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P06FixEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, String> map = new LinkedHashMap<>();

        while (!input.equals("stop")){

            String name = input;
            String email = scanner.nextLine();
            String[] emailArr = email.split("\\.");
            String tld = emailArr[emailArr.length - 1];

            if (!tld.equalsIgnoreCase("us") &&
                    !tld.equalsIgnoreCase("uk") &&
                    !tld.equalsIgnoreCase("com")){
                map.put(name, email);
            }

            input = scanner.nextLine();
        }

        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

    }
}
