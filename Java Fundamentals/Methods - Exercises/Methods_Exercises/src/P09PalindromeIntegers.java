import java.util.Scanner;

public class P09PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();


        while (!command.equals("END")){

            int num = Integer.parseInt(command);
            boolean isNumPalindrome = isPalindrome(num);

            System.out.println(isNumPalindrome);

            command = scanner.nextLine();

        }

    }

    public static boolean isPalindrome(int num){

        String number = String.valueOf(num);
        String reversedNumber = "";

        for (int i = number.length() - 1; i >= 0; i--) {
            reversedNumber = reversedNumber + number.charAt(i);
        }

        if (!reversedNumber.equals(number)){
            return false;
        }
        return true;
    }
}
