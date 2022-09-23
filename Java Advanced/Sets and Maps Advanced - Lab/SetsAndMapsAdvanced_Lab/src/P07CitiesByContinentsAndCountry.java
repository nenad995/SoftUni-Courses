import java.util.*;

public class P07CitiesByContinentsAndCountry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Map<String, List<String>>> map = new LinkedHashMap<>();

        for (int i = 0; i < n; i++){
            String[] input = scanner.nextLine().split(" ");

            String continent = input[0];
            String country = input[1];
            String city = input[2];

            if (!map.containsKey(continent)){
                Map<String, List<String>> innerMap = new LinkedHashMap<>();
                innerMap.put(country, new ArrayList<>());
                innerMap.get(country).add(city);
                map.put(continent, innerMap);
            } else {
                //Check if country exists as a key in inner map
                if (!map.get(continent).containsKey(country)){
                    map.get(continent).put(country, new ArrayList<>());
                    map.get(continent).get(country).add(city);
                } else {
                    if (!map.get(continent).get(country).contains(city)){
                        map.get(continent).get(country).add(city);
                    } else {
                        map.get(continent).get(country).add(city);
                    }
                }
            }
        }

        for (Map.Entry<String, Map<String, List<String>>> outerEntry : map.entrySet()) {
            System.out.println(outerEntry.getKey() + ":");

            for (Map.Entry<String, List<String>> innerEntry : outerEntry.getValue().entrySet()){
                System.out.printf(" %s -> %s%n",
                        innerEntry.getKey(),
                        String.join(", ", innerEntry.getValue()).replace("[","").replace("]",""));
            }
        }

    }
}
