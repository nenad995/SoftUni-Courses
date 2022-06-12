import java.util.Scanner;

public class P01SignOfIntegerNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());
        printSignOfNumber(input);
    }

    public static void printSignOfNumber(int number){
        if (number < 0){
            System.out.println("The number " + number + " is negative.");
        } else if (number > 0) {
            System.out.println("The number " + number + " is positive.");
        } else {
            System.out.println("The number " + number + " is zero.");
        }
    }
}
