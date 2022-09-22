import java.util.Arrays;
import java.util.Scanner;

public class P04MaximalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimensions = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int rows = dimensions[0];
        int cols = dimensions[1];

        int[][] matrix = new int[rows][cols];

        for (int r = 0; r < matrix.length; r++){
            matrix[r] = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        int maxSum = Integer.MIN_VALUE;
        int bestRow = 0;
        int bestCol = 0;

        for (int r = 0; r < matrix.length - 2; r++){
            for (int c = 0; c < matrix[r].length - 2; c++){

                int sum = 0;

                //Use this for bigger subMatrix
                for (int currentRow = r; currentRow < r+3; currentRow++){
                    for (int currentCol = c; currentCol < c+3; currentCol++){
                        sum += matrix[currentRow][currentCol];
                    }
                }

                /*int currentSum = matrix[r][c] + matrix[r][c+1] + matrix[r][c+2] +
                        matrix[r+1][c] + matrix[r+1][c+1] + matrix[r+1][c+2] +
                        matrix[r+2][c] + matrix[r+2][c+1] + matrix[r+2][c+2];*/

                if (sum > maxSum){
                    maxSum = sum;
                    bestRow = r;
                    bestCol = c;
                }
            }
        }

        System.out.println("Sum = " + maxSum);

        for (int r = bestRow; r < bestRow + 3; r++){
            for (int c = bestCol; c < bestCol + 3; c++){
                System.out.print(matrix[r][c] + " ");
            }
            System.out.println();
        }
    }
}
