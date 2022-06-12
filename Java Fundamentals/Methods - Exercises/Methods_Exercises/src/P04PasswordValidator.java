import java.util.Scanner;

public class P04PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();

        boolean isPasswordLengthValid = checkLength(password);
        if (!isPasswordLengthValid){
            System.out.println("Password must be between 6 and 10 characters");
        }

        boolean doesPasswordContainStrangeCharacters = checkForDigitsAndLetters(password);
        if (!doesPasswordContainStrangeCharacters){
            System.out.println("Password must consist only of letters and digits");
        }

        boolean checkHowManyDigits = countDigits(password);
        if (!checkHowManyDigits){
            System.out.println("Password must have at least 2 digits");
        }

        if (isPasswordLengthValid && doesPasswordContainStrangeCharacters && checkHowManyDigits){
            System.out.println("Password is valid");
        }
    }

    public static boolean checkLength(String password){

        if (password.length() >= 6 && password.length() <= 10){
            return true;
        } else {
            return false;
        }

    }

    public static boolean checkForDigitsAndLetters(String password) {

        for (char symbol : password.toCharArray()){
            if (!Character.isLetterOrDigit(symbol)){
                return false;
            }
        }

        return true;
    }

    public static boolean countDigits(String password){
        int digitsCount = 0;

        for (char symbol : password.toCharArray()){
            if (Character.isDigit(symbol)){
                digitsCount++;
            }
        }

        return digitsCount >= 2;
    }

}
