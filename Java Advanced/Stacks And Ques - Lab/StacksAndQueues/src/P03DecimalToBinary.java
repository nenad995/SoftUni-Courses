import java.util.ArrayDeque;
import java.util.Scanner;

public class P03DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());

        ArrayDeque<Integer> binary = new ArrayDeque<>();

        if (input != 0){
            while (input != 0){
                int reminder = input % 2;
                binary.push(reminder);
                input /= 2;
            }
        } else {
            binary.push(0);
        }

        String binaryVersion = "";

        for (Integer integer : binary){
            binaryVersion += integer;
        }

        System.out.println(binaryVersion);
    }
}
