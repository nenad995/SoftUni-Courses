import java.util.Scanner;

public class P05DigitsLettersAndOther {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        StringBuilder numberSB = new StringBuilder();
        StringBuilder letterSB = new StringBuilder();
        StringBuilder otherSB = new StringBuilder();

        for (int i = 0; i < input.length(); i++){

            char ch = input.charAt(i);

            if (Character.isDigit(ch)){
                numberSB.append(ch);
            } else if (Character.isLetter(ch)){
                letterSB.append(ch);
            } else {
                otherSB.append(ch);
            }
        }

        System.out.println(numberSB);
        System.out.println(letterSB);
        System.out.println(otherSB);
    }
}
