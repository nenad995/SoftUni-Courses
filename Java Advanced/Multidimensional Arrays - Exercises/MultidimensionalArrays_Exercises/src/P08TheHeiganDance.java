import java.util.Scanner;

public class P08TheHeiganDance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double damage = Double.parseDouble(scanner.nextLine());

        int playerRow = 7;
        int playerCol = 7;

        int playerHP = 18500;
        boolean isInfected = false;

        double heiganHP = 3000000;
        String lastSpell = "";


        while (playerHP > 0 && heiganHP > 0) {

            heiganHP -= damage;

            if (isInfected) {
                playerHP -= 3500;
                isInfected = false;

                if (playerHP < 0) {
                    break;
                }
            }

            if (heiganHP < 0) {
                break;
            }

            String input = scanner.nextLine();
            String[] bossTurn = input.split(" ");

            String spellName = bossTurn[0];
            int spellRow = Integer.parseInt(bossTurn[1]);
            int spellCol = Integer.parseInt(bossTurn[2]);

            int[][] platform = new int[15][15];

            for (int r = spellRow - 1; r <= spellRow + 1; r++) {
                if (r >= 0 && r < platform.length) {
                    for (int c = spellCol - 1; c <= spellCol + 1; c++) {
                        if (c >= 0 && c < platform[r].length) {
                            platform[r][c] = 1;
                        }
                    }
                }
            }

            if (platform[playerRow][playerCol] == 1) {
                //Go UP, RIGHT, DOWN or LEFT if it is possible
                if (isRowValid(platform, playerRow - 1) && platform[playerRow - 1][playerCol] != 1) {
                    playerRow--;
                } else if (isColValid(platform, playerCol + 1) && platform[playerRow][playerCol + 1] != 1) {
                    playerCol++;
                } else if (isRowValid(platform, playerRow + 1) && platform[playerRow + 1][playerCol] != 1) {
                    playerRow++;
                } else if (isColValid(platform, playerCol - 1) && platform[playerRow][playerCol - 1] != 1) {
                    playerCol--;
                } else {
                    if (spellName.equals("Cloud")) {
                        playerHP -= 3500;
                        isInfected = true;
                        lastSpell = "Plague " + spellName;
                    } else if (spellName.equals("Eruption")) {
                        playerHP -= 6000;
                        lastSpell = spellName;
                    }
                }
            }
        }

        if (heiganHP > 0){
            System.out.printf("Heigan: %.2f%n", heiganHP);
        } else {
            System.out.println("Heigan: Defeated!");
        }

        if (playerHP > 0){
            System.out.println("Player: " + playerHP);
        } else {
            System.out.println("Player: Killed by " + lastSpell);
        }

        System.out.println("Final position: " + playerRow + ", " + playerCol);

    }

    public static boolean isRowValid(int[][] platform, int playerRow) {
        return playerRow >= 0 && playerRow < platform.length;
    }

    public static boolean isColValid(int[][] platform, int playerCol) {
        return playerCol >= 0 && playerCol < platform.length;
    }
}
