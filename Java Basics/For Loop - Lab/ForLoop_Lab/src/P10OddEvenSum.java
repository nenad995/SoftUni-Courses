import java.util.Scanner;

public class P10OddEvenSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sumEven = 0;
        int sumOdd = 0;

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0 ; i < n; i++) {
            int tmp = Integer.parseInt(scanner.nextLine());

            if (i % 2 == 0){
                sumEven += tmp;
            } else {
                sumOdd += tmp;
            }
        }

        if (sumEven == sumOdd){
            System.out.println("Yes\n" +
                    "Sum = " + sumEven);
        } else {
            System.out.println("No\n" +
                    "Diff = " + Math.abs(sumEven - sumOdd));
        }
    }
}
