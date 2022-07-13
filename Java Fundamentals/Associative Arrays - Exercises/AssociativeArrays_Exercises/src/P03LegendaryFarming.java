import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P03LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> legendaryItems = new LinkedHashMap<>();
        legendaryItems.put("shards", 0);
        legendaryItems.put("fragments", 0);
        legendaryItems.put("motes", 0);

        boolean isObtained = legendaryItems.get("shards") >= 250 ||
                legendaryItems.get("fragments") >= 250 ||
                legendaryItems.get("motes") >= 250;

        Map<String, Integer> junkItems = new LinkedHashMap<>();

        String command = scanner.nextLine();

        while (!isObtained) {

            String[] lootTable = command.split(" ");

            for (int i = 0; i < lootTable.length; i+=2) {

                String lootItem = lootTable[i+1].toLowerCase();

                int itemQuantity = Integer.parseInt(lootTable[i]);

                if (lootItem.equals("shards") || lootItem.equals("fragments") || lootItem.equals("motes")){
                    int currentQuantity = legendaryItems.get(lootItem);
                    legendaryItems.put(lootItem, currentQuantity + itemQuantity);
                } else {
                    if (!junkItems.containsKey(lootItem)){
                        junkItems.put(lootItem, itemQuantity);
                    } else {
                        int currentJunkItemQuantity = junkItems.get(lootItem);
                        junkItems.put(lootItem, currentJunkItemQuantity + itemQuantity);
                    }
                }

                if (legendaryItems.get("shards") >= 250) {
                    isObtained = true;
                    System.out.println("Shadowmourne obtained!");
                    int remainingShards = legendaryItems.get("shards") - 250;
                    legendaryItems.put("shards", remainingShards);
                    break;
                }

                if (legendaryItems.get("fragments") >= 250) {
                    isObtained = true;
                    System.out.println("Valanyr obtained!");
                    int remainingFragments = legendaryItems.get("fragments") - 250;
                    legendaryItems.put("fragments", remainingFragments);
                    break;
                }

                if (legendaryItems.get("motes") >= 250) {
                    isObtained = true;
                    System.out.println("Dragonwrath obtained!");
                    int remainingMotes = legendaryItems.get("motes") - 250;
                    legendaryItems.put("motes", remainingMotes);
                    break;
                }
            }

            if (!isObtained){
                command = scanner.nextLine();
            }

        }

        for (Map.Entry<String, Integer> entry : legendaryItems.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        for (Map.Entry<String, Integer> entry : junkItems.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
