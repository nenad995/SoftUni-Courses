package greedyTimes;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        long bagCapacity = Long.parseLong(scanner.nextLine());
        String[] safe = scanner.nextLine().split("\\s+");

        Map<String, LinkedHashMap<String, Long>> bag = new LinkedHashMap<>((int) bagCapacity);
        long goldAmount = 0;
        long gemAmount = 0;
        long cashAmount = 0;

        for (int i = 0; i < safe.length - 1; i += 2) {
            String item = safe[i];
            long quantity = Long.parseLong(safe[i + 1]);

            String currentItem = "";

            if (item.length() == 3) {
                currentItem = "Cash";
            } else if (item.toLowerCase().endsWith("gem")) {
                currentItem = "Gem";
            } else if (item.equalsIgnoreCase("gold")) {
                currentItem = "Gold";
            } else {
                continue;
            }

            if (checkIfNotEoughSpace(bagCapacity, bag, quantity)) {
                continue;
            }

            switch (currentItem) {
                case "Gem":
                    if (!bag.containsKey(currentItem)) {
                        if (bag.containsKey("Gold")) {
                            if (quantity > bag.get("Gold").values().stream().mapToLong(e -> e).sum()) {
                                continue;
                            }
                        } else {
                            continue;
                        }
                    } else if (bag.get(currentItem).values().stream()
                            .mapToLong(e -> e)
                            .sum() + quantity > bag.get("Gold")
                            .values()
                            .stream()
                            .mapToLong(e -> e)
                            .sum()) {
                        continue;
                    }
                    break;
                case "Cash":
                    if (!bag.containsKey(currentItem)) {
                        if (bag.containsKey("Gem")) {
                            if (quantity > bag.get("Gold").values().stream().mapToLong(e -> e).sum()) {
                                continue;
                            }
                        } else {
                            continue;
                        }
                    } else if (bag.get(currentItem).values().stream().mapToLong(e -> e).sum() + quantity > bag.get("Gem").values().stream().mapToLong(e -> e).sum()) {
                        continue;
                    }
                    break;
            }

            if (!bag.containsKey(currentItem)) {
                bag.put((currentItem), new LinkedHashMap<String, Long>());
            }

            if (!bag.get(currentItem).containsKey(item)) {
                bag.get(currentItem).put(item, 0L);
            }


            bag.get(currentItem).put(item, bag.get(currentItem).get(item) + quantity);
            if (currentItem.equals("Gold")) {
                goldAmount += quantity;
            } else if (currentItem.equals("Gem")) {
                gemAmount += quantity;
            } else if (currentItem.equals("Cash")) {
                cashAmount += quantity;
            }
        }

        for (var x : bag.entrySet()) {
            Long sumValues = x.getValue().values().stream().mapToLong(l -> l).sum();

            System.out.println(String.format("<%s> $%s", x.getKey(), sumValues));

            x.getValue().entrySet().stream().sorted((e1, e2) -> e2.getKey().compareTo(e1.getKey())).forEach(i -> System.out.println("##" + i.getKey() + " - " + i.getValue()));

        }
    }

    private static boolean checkIfNotEoughSpace(long bagCapacity, Map<String, LinkedHashMap<String, Long>> bag, long quantity) {
        return bagCapacity < bag.values().stream().map(Map::values).flatMap(Collection::stream).mapToLong(e -> e).sum() + quantity;
    }
}