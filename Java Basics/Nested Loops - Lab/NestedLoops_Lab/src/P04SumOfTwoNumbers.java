import java.util.Scanner;

public class P04SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = Integer.parseInt(scanner.nextLine());
        int y = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());

        int count = 0;

        for (int i = x; i <= y; i++){
            for (int j = x ; j <= y; j++) {
                count ++;
                int sum = i + j;

                if (sum == m) {
                    System.out.printf("Combination N:%d (%d + %d = %d)", count, i, j, sum);
                    return;
                }
            }
        }
        System.out.printf("%d combinations - neither equals %d", count, m);
    }
}
