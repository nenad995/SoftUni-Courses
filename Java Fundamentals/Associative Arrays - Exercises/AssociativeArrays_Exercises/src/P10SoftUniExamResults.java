import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P10SoftUniExamResults {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        Map<String, Integer> results = new LinkedHashMap<>();
        Map<String, Integer> submissions = new LinkedHashMap<>();

        while (!command.equals("exam finished")){

            String[] commandArr = command.split("-");
            String username = commandArr[0];

            if (!commandArr[1].equals("banned")){
                String language = commandArr[1];
                int points = Integer.parseInt(commandArr[2]);

                if (!results.containsKey(username)){
                    results.put(username, points);
                } else {
                    int currentPoints = results.get(username);
                    if (currentPoints < points){
                        results.put(username, points);
                    }
                }

                if (!submissions.containsKey(language)){
                    submissions.put(language, 1);
                } else {
                    int submissionsCount = submissions.get(language);
                    submissions.put(language, submissionsCount + 1);
                }
            } else {
                results.remove(username);
            }

            command = scanner.nextLine();
        }

        System.out.println("Results:");
        for (Map.Entry<String, Integer> entry : results.entrySet()) {
            System.out.println(entry.getKey() + " | " +entry.getValue());
        }

        System.out.println("Submissions:");
        for (Map.Entry<String, Integer> entry : submissions.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
