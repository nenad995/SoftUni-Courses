import java.util.Scanner;

public class P01RhombusOfStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        printTopPart(n);
        printRow(n, n);
        printBottomPart(n);
    }

    private static void printBottomPart(int n) {
        for (int row = n - 1; row >= 1; row--){
            printRow(n, row);
        }
    }

    private static void printTopPart(int n) {
        for (int row = 1; row < n; row++){
            printRow(n, row);
        }
    }

    private static void printRow(int n, int row) {
        for (int space = 0; space < n - row; space++){
            System.out.print(" ");
        }

        for (int j = 1; j <= row; j++){
            System.out.print("* ");
        }
        System.out.println();
    }
}
