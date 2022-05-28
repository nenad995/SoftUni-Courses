import java.util.Scanner;

public class P02SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        while (num > 0){
            sum = sum + (num % 10);
            num /= 10;
        }

        System.out.println(sum);
    }
}
