import java.util.Scanner;

public class P02BitAtPosition1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String  bitRepresentation = Integer.toBinaryString(n);

        System.out.println(bitRepresentation.charAt(bitRepresentation.length()-2));
    }
}
