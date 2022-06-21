import java.util.Scanner;

public class P02MuOnline {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int playersHealth = 100;
        int playersBitcoins = 0;
        int bestRoom = 0;

        String[] dungeon = scanner.nextLine().split("\\|");

        while (playersHealth > 0 && bestRoom < dungeon.length){

            String[] roomArray = dungeon[bestRoom].split(" ");
            String command = roomArray[0];

            switch (command){
                case "potion":
                    int healingAmount = Integer.parseInt(roomArray[1]);

                    if (playersHealth + healingAmount > 100){
                        int tempHealing = 100 - playersHealth;
                        playersHealth = 100;
                        System.out.println("You healed for " + tempHealing + " hp.");

                    } else {
                        playersHealth += healingAmount;
                        System.out.println("You healed for " + healingAmount + " hp.");
                    }
                    System.out.println("Current health: " + playersHealth +" hp.");
                    break;
                case "chest":
                    int bitcoinAmount = Integer.parseInt(roomArray[1]);
                    playersBitcoins += bitcoinAmount;
                    System.out.println("You found " + bitcoinAmount + " bitcoins.");
                    break;
                default:
                    String monsterName = roomArray[0];
                    int monsterDmg = Integer.parseInt(roomArray[1]);

                    playersHealth -= monsterDmg;

                    if (playersHealth <= 0){
                        System.out.println("You died! Killed by " + monsterName + ".");
                    } else {
                        System.out.println("You slayed " + monsterName + ".");
                    }
                    break;
            }
            bestRoom++;
        }

        if (playersHealth > 0 && bestRoom == dungeon.length){
            System.out.println("You've made it!");
            System.out.println("Bitcoins: " + playersBitcoins);
            System.out.println("Health: " + playersHealth);
        } else {
            System.out.println("Best room: " + bestRoom);
        }
    }
}
