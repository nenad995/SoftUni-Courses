import java.util.Arrays;
import java.util.Scanner;

public class P05MaximumSumOf2x2Submatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] dimensions = scanner.nextLine().split(", ");
        int rows = Integer.parseInt(dimensions[0]);
        int cols = Integer.parseInt(dimensions[1]);

        int[][] matrix = new int[rows][cols];

        for (int r = 0; r < matrix.length; r++){
            int[] arr = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
            matrix[r] = arr;
        }

        int bestRow = 0;
        int bestCol = 0;

        int total = Integer.MIN_VALUE;

        for (int r = 0; r < matrix.length-1; r++){
            for (int c = 0; c < matrix[r].length-1; c++){
                int sumOfCurrentSubmatrix = matrix[r][c] + matrix[r][c + 1] +
                                            matrix[r + 1][c] + matrix[r + 1][c + 1];
                if (total < sumOfCurrentSubmatrix){
                    bestRow = r;
                    bestCol = c;
                    total = sumOfCurrentSubmatrix;
                }
            }
        }

        for (int r = bestRow; r < bestRow + 2; r++){
            for (int c = bestCol; c < bestCol + 2; c++){
                System.out.printf("%d ", matrix[r][c]);
            }
            System.out.println();
        }
        System.out.println(total);
    }
}
