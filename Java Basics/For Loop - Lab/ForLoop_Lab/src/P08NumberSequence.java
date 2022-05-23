import java.util.Scanner;

public class P08NumberSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int smallest = Integer.MAX_VALUE;
        int biggest = Integer.MIN_VALUE;

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++){
            int num = Integer.parseInt(scanner.nextLine());

            if (num < smallest) {
                smallest = num;
            }

            if (num > biggest) {
                biggest = num;
            }
        }
        System.out.println("Max number: " + biggest);
        System.out.println("Min number: " + smallest);
    }
}
