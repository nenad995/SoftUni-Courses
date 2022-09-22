import java.util.Arrays;
import java.util.Scanner;

public class P03DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());

        int[][] matrix = new int[size][size];

        for (int r = 0; r < matrix.length; r++){
            matrix[r] = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        int primaryDiagonal = 0;
        int secondaryDiagonal = 0;

        //Method to find primary diagonal in square matrix
        for (int index = 0; index < matrix.length; index++){
            primaryDiagonal += matrix[index][index];
        }

        //Method to find secondary diagonal in square matrix
        for (int index = 0; index < matrix.length; index++){
            secondaryDiagonal += matrix[index][matrix.length - 1 - index];
        }

        //One more method to find secondary diagonal
        /*for (int r = matrix.length, c = 0; r >= 0 && c < matrix.length; r--, c++){
            secondaryDiagonal += matrix[r][c];
        }*/

        System.out.println(Math.abs(primaryDiagonal - secondaryDiagonal));
    }
}
