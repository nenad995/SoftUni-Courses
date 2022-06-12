import java.util.Scanner;

public class P06MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String result = printMiddleChars(input);
        System.out.println(result);

    }

    public static String printMiddleChars(String input){
        if (input.length() % 2 == 0){
            String middleChars = "";

            middleChars += input.charAt((input.length() / 2) - 1);
            middleChars += input.charAt(input.length() / 2);

            return middleChars;
        } else {
            String middleChar = String.valueOf(input.charAt(input.length() / 2));
            return middleChar;
        }
    }
}
