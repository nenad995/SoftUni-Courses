import java.util.Scanner;

public class P02EqualSumsEvenOddPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());

        int sumOdd = 0;
        int sumEven = 0;

        int num = 0;
        int current = 0;

        while (first <= second){

            current = first;

            for (int i = 0; i < 6; i++) {

                num = current % 10;

                if (i % 2 == 0) {
                    sumEven = sumEven + num;
                } else {
                    sumOdd = sumOdd + num;
                }

                current /= 10;
            }

            if (sumEven == sumOdd){
                System.out.printf("%d ", first);
            }

            first++;
            sumEven = 0;
            sumOdd = 0;
        }
    }
}
