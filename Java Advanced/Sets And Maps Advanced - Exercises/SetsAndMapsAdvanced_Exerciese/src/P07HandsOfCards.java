import java.util.*;

public class P07HandsOfCards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, HashSet<String>> map = new LinkedHashMap<>();

        while (!input.equals("JOKER")){

            String name = input.split(": ")[0];
            String[] cards = input.split(": ")[1].split(", ");

            if (!map.containsKey(name)){
                map.put(name, new HashSet<>());
            }

            Collections.addAll(map.get(name), cards);

            input = scanner.nextLine();
        }

        for (Map.Entry<String, HashSet<String>> player : map.entrySet()) {
            String name = player.getKey();
            int points = calculatePoints(player.getValue());

            System.out.println(name + ": " + points);
        }
    }

    private static int calculatePoints(HashSet<String> cards) {
        int points = 0;

        for (String card : cards){
            String power = card.substring(0, card.length() - 1);
            String type = card.substring(card.length() - 1);

            int cardPoints = getPower(power) * getCardType(type);
            points += cardPoints;
        }

        return points;
    }

    private static int getCardType(String type) {
        int multiplier = 0;

        switch (type){
            case "S":
                multiplier = 4;
                break;
            case "H":
                multiplier = 3;
                break;
            case "D":
                multiplier = 2;
                break;
            case "C":
                multiplier = 1;
                break;
        }
        return multiplier;
    }

    private static int getPower(String power) {
        switch (power){
            case "J":
                return 11;
            case "Q":
                return 12;
            case "K":
                return 13;
            case "A":
                return 14;
            default:
                return Integer.parseInt(power);
        }
    }
}
