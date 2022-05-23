import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        boolean isOdd = true;

        while (true){
            if (Math.abs(number) % 2 == 0){
                System.out.println("The number is: " + Math.abs(number));
                isOdd = false;
                break;
            } else {
                System.out.println("Please write an even number.");
                number = Integer.parseInt(scanner.nextLine());
            }
        }

    }
}
