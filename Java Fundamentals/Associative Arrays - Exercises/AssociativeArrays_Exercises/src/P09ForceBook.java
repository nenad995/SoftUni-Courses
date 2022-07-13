import java.util.*;

public class P09ForceBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> forceBook = new LinkedHashMap<>();

        String command = scanner.nextLine();

        while (!command.equals("Lumpawaroo")) {

            if (command.contains("|")) {
                String[] commandArr = command.split(" \\| ");

                String forceSide = commandArr[0];
                String forceUser = commandArr[1];

                boolean userExists = false;

                if (!forceBook.containsKey(forceSide)) {
                    for (Map.Entry<String, List<String>> entry : forceBook.entrySet()) {
                        if (entry.getValue().contains(forceUser)) {
                            userExists = true;
                            break;
                        }
                    }

                    if (!userExists) {
                        forceBook.put(forceSide, new ArrayList<>());
                        forceBook.get(forceSide).add(forceUser);
                    }
                } else {
                    for (Map.Entry<String, List<String>> entry : forceBook.entrySet()) {
                        if (entry.getValue().contains(forceUser)) {
                            userExists = true;
                            break;
                        }
                    }

                    if (!userExists) {
                        forceBook.get(forceSide).add(forceUser);
                    }
                }
            } else if (command.contains("->")) {
                String[] commandArr = command.split(" -> ");

                String forceSide = commandArr[1];
                String forceUser = commandArr[0];

                boolean userExists = false;

                String side = "";

                if (!forceBook.containsKey(forceSide)) {

                    for (Map.Entry<String, List<String>> entry : forceBook.entrySet()) {
                        if (entry.getValue().contains(forceUser)) {
                            userExists = true;
                            side = entry.getKey();
                            break;
                        }
                    }

                    if (userExists) {
                        forceBook.get(side).remove(forceUser);
                    }

                    forceBook.put(forceSide, new ArrayList<>());
                } else {

                    for (Map.Entry<String, List<String>> entry : forceBook.entrySet()) {
                        if (entry.getValue().contains(forceUser)) {
                            userExists = true;
                            side = entry.getKey();
                            break;
                        }
                    }

                    if (userExists) {
                        forceBook.get(side).remove(forceUser);
                    }
                }

                forceBook.get(forceSide).add(forceUser);
                System.out.println(forceUser + " joins the " + forceSide + " side!");
            }

            command = scanner.nextLine();
        }

        for (Map.Entry<String, List<String>> entry : forceBook.entrySet()) {
            if (entry.getValue().size() > 0){
                System.out.println("Side: " + entry.getKey() + ", Members: " + entry.getValue().size());

                for (String user : entry.getValue()){
                    System.out.println("! " + user);
                }
            }
        }
    }
}
