import java.util.Scanner;

public class P07StringExplosion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        StringBuilder text = new StringBuilder(input);

        int totalPower = 0;

        for (int i = 0; i < text.length(); i++){
            char currentChar = text.charAt(i);

            if (currentChar == '>'){
                int currentPower = Integer.parseInt(Character.toString(text.charAt(i + 1)));
                totalPower += currentPower;
            } else if (currentChar != '>' && totalPower > 0){
                text.deleteCharAt(i);
                totalPower--;
                i--;
            }
        }

        System.out.println(text);

    }
}
