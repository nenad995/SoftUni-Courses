import java.util.*;

public class P02AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        Map<String, Integer> lm = new LinkedHashMap<>();

        int line = 1;
        String key = "";
        int value = 0;

        while (!command.equals("stop")){

            if (line % 2 != 0){
                key = command;

                if (!lm.containsKey(key)){
                    lm.put(key, 0);
                }

            } else {
                value = Integer.parseInt(command);

                int currentValue = lm.get(key);
                lm.put(key, value + currentValue);
            }

            line++;
            command = scanner.nextLine();
        }

        for (Map.Entry<String, Integer> entry : lm.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

    }
}
