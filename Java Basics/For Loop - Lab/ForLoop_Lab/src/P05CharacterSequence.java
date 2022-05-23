import java.util.Scanner;

public class P05CharacterSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String tmp = scanner.nextLine();

        for (int i = 0; i < tmp.length(); i++){
            System.out.println(tmp.charAt(i));
        }
    }
}
