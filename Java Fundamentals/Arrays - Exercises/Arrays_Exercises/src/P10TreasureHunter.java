import java.util.Scanner;

public class P10TreasureHunter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] treasure = scanner.nextLine().split("\\|");
        String command = scanner.nextLine();

        while (!command.equals("Yohoho!")){
            String[] commandArr = command.split(" ");
            String commandType = commandArr[0];

            switch (commandType){
                case "Loot":
                    for (int i = 1; i < commandArr.length; i++){

                        boolean isFound = false;
                        String item = commandArr[i];

                        for (int j = 0; j < treasure.length; j++){
                            if (item.equals(treasure[j])){
                                isFound = true;
                                break;
                            }
                        }
                        if (!isFound){
                            String newTreasure = item + " " + String.join(" ", treasure);
                            treasure = newTreasure.split(" ");
                        }
                    }
                    break;
                case "Drop":
                    int index = Integer.parseInt(commandArr[1]);

                    if (index < 0 || index >= treasure.length){
                        break;
                    } else {
                        String removedItem = treasure[index];

                        for (int i = index; i < treasure.length - 1; i++){
                            treasure[i] = treasure[i + 1];
                        }

                        treasure[treasure.length - 1] = removedItem;

                    }
                    break;
                case "Steal":
                    int count = Integer.parseInt(commandArr[1]);

                    if (count >= 0 && count < treasure.length){
                        for (int i = 0; i < count; i++){
                            System.out.print(treasure[treasure.length - count + i]);
                            if (i != count - 1) {
                                System.out.print(", ");
                            }
                        }

                        String[] tempTreasure = new String[treasure.length - count];

                        for (int i = 0; i < tempTreasure.length; i++) {
                            tempTreasure[i] = treasure[i];
                        }

                        treasure = tempTreasure;

                    } else if (count >= 0) {
                        for (int i = 0; i < treasure.length; i++) {
                            System.out.print(treasure[i]);

                            if (i != treasure.length - 1) {
                                System.out.print(", ");
                            }
                        }
                        treasure = new String[0];
                    }
                    System.out.println();
                    break;
            }

            command = scanner.nextLine();

        }

        String treasureCount = String.join("", treasure);
        int charCounter = 0;

        for (int i = 0; i < treasureCount.length(); i++) {
            charCounter++;
        }

        double average = (1.0 * charCounter) / treasure.length;

        if (charCounter > 0) {
            System.out.printf("Average treasure gain: %.2f pirate credits.", average);
        } else {
            System.out.println("Failed treasure hunt.");
        }

    }
}
