import java.util.Scanner;

public class P05_Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();

        String correctPassword = "";

        for (int i = username.length() - 1; i >= 0; i--){
            char symbol = username.charAt(i);
            correctPassword = correctPassword + symbol;
        }

        String password = "";

        int counter = 0;
        boolean isCorrect = false;

        while (!isCorrect) {
            password = scanner.nextLine();

            if (password.equals(correctPassword)) {
                System.out.printf("User %s logged in.", username);
                isCorrect = true;
            } else {
                counter++;

                if (counter < 4){
                    System.out.println("Incorrect password. Try again.");
                } else {
                    System.out.printf("User %s blocked!", username);
                    break;
                }
            }

        }
    }
}
