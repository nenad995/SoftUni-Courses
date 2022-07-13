import java.util.Scanner;

public class P06TriBitSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        int p = Integer.parseInt(scanner.nextLine());

        int mask = 7 << p;

        int result = num ^ mask;

        System.out.println(result);

    }
}
