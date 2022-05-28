import java.util.Scanner;

public class P05PrintPartOfASCIITable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = Integer.parseInt(scanner.nextLine());
        int finish = Integer.parseInt(scanner.nextLine());

        for (int i = start; i <= finish; i++){
            char ch = (char) i;
            System.out.printf("%c ", ch);
        }
    }
}
