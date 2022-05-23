import java.util.Scanner;

public class P02HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int max = Integer.MIN_VALUE;
        int sum = 0;

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++){
            int tmp = Integer.parseInt(scanner.nextLine());

            if (tmp > max){
                max = tmp;
            }

            sum += tmp;
        }

        int sumWithoutMax = sum - max;

        if (sumWithoutMax == max){
            System.out.println("Yes\n" +
                    "Sum = " + max);
        } else {
            System.out.println("No\n" +
                    "Diff = " + Math.abs(sumWithoutMax - max));
        }
    }
}