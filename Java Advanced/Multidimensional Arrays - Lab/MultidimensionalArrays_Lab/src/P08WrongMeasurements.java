import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class P08WrongMeasurements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfRows = Integer.parseInt(scanner.nextLine());

        int[][] matrix = new int[numberOfRows][];

        for (int r = 0; r < matrix.length; r++){
            matrix[r] = readArrays(scanner);
        }

        int[] mistakenValueIndexes = readArrays(scanner);
        int mistakenValue = matrix[mistakenValueIndexes[0]][mistakenValueIndexes[1]];

        List<int[]> correctValues = new ArrayList<>();

        for (int r = 0; r < matrix.length; r++){
            for (int c = 0; c < matrix[r].length; c++){
                if (matrix[r][c] == mistakenValue){
                    int correctValue = getNearbySum(matrix, r, c, mistakenValue);
                    correctValues.add(new int[] {r,c, correctValue});
                }
            }
        }

        for(int[] correctValue : correctValues){
            int row = correctValue[0];
            int col = correctValue[1];
            matrix[row][col] = correctValue[2];
        }

        for (int r = 0; r < matrix.length; r++){
            for (int c = 0; c < matrix[r].length; c++){
                System.out.printf("%d ", matrix[r][c]);
            }
            System.out.println();
        }

    }

    private static int getNearbySum(int[][] matrix, int r, int c, int mistakenValue) {
        int sum = 0;

        if (isInBounds(matrix, r + 1, c) && matrix[r + 1][c] != mistakenValue){
            sum += matrix[r + 1][c];
        }

        if (isInBounds(matrix, r - 1, c) && matrix[r - 1][c] != mistakenValue){
            sum += matrix[r - 1][c];
        }

        if (isInBounds(matrix, r, c + 1) && matrix[r][c + 1] != mistakenValue){
            sum += matrix[r][c + 1];
        }

        if (isInBounds(matrix, r, c - 1) && matrix[r][c - 1] != mistakenValue){
            sum += matrix[r][c - 1];
        }

        return sum;
    }

    private static boolean isInBounds(int[][] matrix, int r, int c) {
        return r >= 0 && r < matrix.length && c >= 0 && c < matrix[r].length;
    }

    private static boolean isOutOfBounds(int[][] matrix, int r, int c){
        return !isInBounds(matrix, r, c);
    }

    private static int[] readArrays(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    }
}
