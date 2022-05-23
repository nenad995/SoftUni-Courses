import java.util.Scanner;

public class P09LeftAndRightSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum1 = 0;

        for (int i = 0; i < n; i++){
            int tmp = Integer.parseInt(scanner.nextLine());
            sum1 += tmp;
        }

        int sum2 = 0;

        for (int i = 0; i < n; i++){
            int tmp = Integer.parseInt(scanner.nextLine());
            sum2 += tmp;
        }

        if (sum1 == sum2){
            System.out.println("Yes, sum = " + sum1);
        } else {
            System.out.println("No, diff = " + Math.abs(sum1 - sum2));
        }


    }
}
