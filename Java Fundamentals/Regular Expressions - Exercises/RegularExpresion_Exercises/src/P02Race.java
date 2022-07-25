import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class P02Race {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> racersList = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());
        Map<String, Integer> raceInfo = new LinkedHashMap<>();

        for (String racer : racersList){
            raceInfo.put(racer, 0);
        }

        String input = scanner.nextLine();
        Pattern letterPattern = Pattern.compile("[A-Za-z]+");
        Pattern digitPattern = Pattern.compile("[0-9]");

        while (!input.equals("end of race")){

            String racerName = "";
            int distance = 0;

            Matcher letterMatcher = letterPattern.matcher(input);
            while (letterMatcher.find()){
                racerName += letterMatcher.group();
            }

            if (raceInfo.containsKey(racerName)){

                Matcher digitMatcher = digitPattern.matcher(input);
                while (digitMatcher.find()){
                    distance += Integer.parseInt(digitMatcher.group());
                }

                int currentDistance = raceInfo.get(racerName);
                int totalDistance = currentDistance + distance;
                raceInfo.put(racerName, totalDistance);
            }


            input = scanner.nextLine();
        }

        /*List<String> winners = new ArrayList<>();

        for (int i = 0; i < 3; i++){

            String racerName = "";
            int racerDistance = 0;

            for (Map.Entry<String, Integer> entry : raceInfo.entrySet()) {
                if (entry.getValue() > racerDistance){
                    racerName = entry.getKey();
                    racerDistance = entry.getValue();
                }
            }
            winners.add(racerName);
            raceInfo.remove(racerName);
        }*/

        //Simplified the above check
        List<String> winners = raceInfo.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(3)
                .map(entry -> entry.getKey())
                .collect(Collectors.toList());

        System.out.println("1st place: " + winners.get(0));
        System.out.println("2nd place: " + winners.get(1));
        System.out.println("3rd place: " + winners.get(2));

    }
}
