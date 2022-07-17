import java.util.Scanner;

public class P08LettersChangeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] codeArr = input.split("\\s+");

        double total = 0;

        for (String code : codeArr){
            double number = getModifiedNum(code);

            total += number;
        }

        System.out.printf("%.2f", total);
    }

    public static double getModifiedNum(String code){
        char firstLetter = code.charAt(0);
        char secondLetter = code.charAt(code.length() - 1);

        double number = Double.parseDouble(code.replace(firstLetter, ' ').replace(secondLetter, ' ').trim());

        if (Character.isUpperCase(firstLetter)){
            int upperLetterPosition = firstLetter - 64;
            number /= upperLetterPosition;
        } else {
            int lowerLetterPosition = firstLetter - 96;
            number *= lowerLetterPosition;
        }

        if (Character.isUpperCase(secondLetter)){
            int upperLetterPosition = secondLetter - 64;
            number -= upperLetterPosition;
        } else {
            int lowerLetterPosition = secondLetter - 96;
            number += lowerLetterPosition;
        }

        return number;
    }
}
