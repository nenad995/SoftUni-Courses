import java.util.Scanner;

public class P03CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char startChar = scanner.nextLine().charAt(0);
        char endChar = scanner.nextLine().charAt(0);

        printCharsInRange(startChar, endChar);

    }

    public static void printCharsInRange(char startChar, char endChar){
        for (int i  = startChar + 1; i < endChar; i++){
            System.out.print((char) i + " ");
        }

        if (endChar < startChar){
            for (int i = endChar + 1; i < startChar; i++){
                System.out.print((char) i + " ");
            }
        }
    }

}
