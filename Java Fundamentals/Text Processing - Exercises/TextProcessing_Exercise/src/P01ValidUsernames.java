import java.util.Scanner;

public class P01ValidUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] usernames = scanner.nextLine().split(", ");

        for (String username : usernames){
            if (isValid(username)){
                System.out.println(username);
            }
        }
    }

    public static boolean isValid(String username){
        if (username.length() < 3 || username.length() > 16){
            return false;
        }

        for (char ch : username.toCharArray()){
            if (!Character.isLetterOrDigit(ch) && ch != '-' && ch != '_'){
                return false;
            }
        }
        return true;
    }
}
