import java.util.Scanner;

public class P04CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < input.length(); i++){
            int currentChar = input.charAt(i);
            char encryptedChar = (char) (currentChar + 3);

            sb.append(encryptedChar);
        }

        System.out.println(sb);
    }
}
