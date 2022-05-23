import java.util.Scanner;

public class P04PasswordGuess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String pwd = scanner.nextLine();

        if (pwd.equals("s3cr3t!P@ssw0rd")){
            System.out.println("Welcome");
        } else {
            System.out.println("Wrong password!");
        }
    }
}
