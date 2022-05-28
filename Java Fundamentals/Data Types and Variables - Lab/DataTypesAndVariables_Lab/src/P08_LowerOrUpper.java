import java.util.Scanner;

public class P08_LowerOrUpper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char ch = scanner.nextLine().charAt(0);

        if (Character.isLowerCase(ch)){
            System.out.println("lower-case");
        } else {
            System.out.println("upper-case");
        }
    }
}
