import java.util.Scanner;

public class P04BitDestroyer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int position = Integer.parseInt(scanner.nextLine());

        int mask = 1 << position;
        int invertedMask = ~mask;

        int convertedBit = n & invertedMask;

        System.out.println(convertedBit);
    }
}
