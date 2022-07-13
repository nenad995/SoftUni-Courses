import java.util.Scanner;

public class P03PthBit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int p = Integer.parseInt(scanner.nextLine());

        int bitAtPositionP = (n >> p) & 1;

        System.out.println(bitAtPositionP);
    }
}
