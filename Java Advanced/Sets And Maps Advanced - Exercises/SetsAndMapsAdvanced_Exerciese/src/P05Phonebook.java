import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class P05Phonebook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, String> phonebook = new HashMap<>();

        while (!input.equals("search")){

            String name = input.split("-")[0];
            String number = input.split("-")[1];

            if (!phonebook.containsKey(name)){
                phonebook.put(name, number);
            } else {
                String existingNumber = phonebook.get(name);

                if (!existingNumber.equals(number)){
                    phonebook.put(name, number);
                }
            }
            input = scanner.nextLine();
        }

        input = scanner.nextLine();

        while (!input.equals("stop")){

            String contactName = input;

            if (phonebook.containsKey(contactName)){
                System.out.println(contactName + " -> " + phonebook.get(contactName));
            } else {
                System.out.println("Contact " + contactName + " does not exist.");
            }

            input = scanner.nextLine();
        }
    }
}
