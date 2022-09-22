import java.util.Scanner;

public class P01FillTheMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");

        int size = Integer.parseInt(input[0]);
        String pattern = input[1];

        int[][] matrix = new int[size][size];

        if (pattern.equals("A")){
            fillMatrixWithPatternA(size, matrix);
        } else {
            fillMatrixWithPatternB(size, matrix);
        }

        printMatrix(matrix);

    }

    private static void fillMatrixWithPatternB(int size, int[][] matrix) {
        int counter = 1;

        for (int c = 0; c < size; c++){
            if (c % 2 == 0){
               for (int r = 0; r < size; r++){
                   matrix[r][c] = counter;
                   counter++;
               }
            } else {
                for (int r = size - 1; r >= 0; r--){
                    matrix[r][c] = counter;
                    counter++;
                }
            }
        }
    }

    private static void fillMatrixWithPatternA(int size, int[][] matrix) {
        int counter = 1;

        for (int c = 0; c < size; c++){
            for (int r = 0; r < size; r++){
                matrix[r][c] = counter;
                counter++;
            }
        }
    }

    private static void printMatrix(int[][] matrix) {
        for (int r = 0; r < matrix.length; r++){
            for (int c = 0; c < matrix[r].length; c++){
                System.out.print(matrix[r][c] + " ");
            }
            System.out.println();
        }
    }
}
