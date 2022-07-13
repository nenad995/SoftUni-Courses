import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P05SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfEntries = Integer.parseInt(scanner.nextLine());

        Map<String, String> parking = new LinkedHashMap<>();

        for (int i = 0; i < numberOfEntries; i++) {
            String command = scanner.nextLine();

            String[] commandArr = command.split(" ");
            String commandType = commandArr[0];
            String username = commandArr[1];

            if (commandType.equals("register")){
                String licencePlates = commandArr[2];

                if (!parking.containsKey(username)){
                    parking.put(username, licencePlates);
                    System.out.println(username + " registered " + licencePlates + " successfully");
                } else {
                    String registeredPlates = parking.get(username);
                    System.out.println("ERROR: already registered with plate number " + registeredPlates);
                }
            } else if (commandType.equals("unregister")){
                if (!parking.containsKey(username)){
                    System.out.println("ERROR: user " + username + " not found");
                } else {
                    parking.remove(username);
                    System.out.println(username + " unregistered successfully");
                }
            }
        }

        for (Map.Entry<String, String> entry : parking.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

    }
}
