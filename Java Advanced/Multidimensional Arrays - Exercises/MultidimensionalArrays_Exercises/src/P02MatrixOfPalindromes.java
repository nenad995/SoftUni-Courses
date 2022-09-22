import java.util.Arrays;
import java.util.Scanner;

public class P02MatrixOfPalindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimensions = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int rows = dimensions[0];
        int cols = dimensions[1];

        String[][] matrix = new String[rows][cols];

        fillMatrix(rows, cols, matrix);

        printMatrix(matrix);
    }

    private static void fillMatrix(int rows, int cols, String[][] matrix) {
        for (int r = 0; r < rows; r++){
            for (int c = 0; c < cols; c++){
                char outsideLetter = (char)('a' + r);
                char innerLetter = (char) ('a' + r + c);
                matrix[r][c] = "" + outsideLetter + innerLetter + outsideLetter;
            }
        }
    }

    private static void printMatrix(String[][] matrix) {
        for (int r = 0; r < matrix.length; r++){
            for (int c = 0; c < matrix[r].length; c++){
                System.out.print(matrix[r][c] + " ");
            }
            System.out.println();
        }
    }
}
