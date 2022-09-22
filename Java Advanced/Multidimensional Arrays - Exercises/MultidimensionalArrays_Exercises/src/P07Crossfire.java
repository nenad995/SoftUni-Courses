import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P07Crossfire {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] dimensions = scanner.nextLine().split(" ");
        int rows = Integer.parseInt(dimensions[0]);
        int cols = Integer.parseInt(dimensions[1]);

        int counter = 1;

        int[][] matrix = new int[rows][cols];

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                matrix[r][c] = counter;
                counter++;
            }
        }

        String input = scanner.nextLine();

        while (!input.equals("Nuke it from orbit")) {
            String[] coordinates = input.split(" ");
            int rowCoordinate = Integer.parseInt(coordinates[0]);
            int colCoordinate = Integer.parseInt(coordinates[1]);
            int radius = Integer.parseInt(coordinates[2]);

            if (radius < 0){
                input = scanner.nextLine();
                continue;
            }

            //Go right
            for (int i = 0; i <= radius; i++) {
                if (isInBounds(matrix, rowCoordinate, colCoordinate + i)) {
                    matrix[rowCoordinate][colCoordinate + i] = 0;
                } /*else {
                    break;
                }*/
            }
            //Go left
            for (int i = 0; i <= radius; i++) {
                if (isInBounds(matrix, rowCoordinate, colCoordinate - i)) {
                    matrix[rowCoordinate][colCoordinate - i] = 0;
                } /*else {
                    break;
                }*/
            }
            //Go up
            for (int i = 0; i <= radius; i++) {
                if (isInBounds(matrix, rowCoordinate - i, colCoordinate)) {
                    matrix[rowCoordinate - i][colCoordinate] = 0;
                } /*else {
                    break;
                }*/
            }
            //Go down
            for (int i = 0; i <= radius; i++) {
                if (isInBounds(matrix, rowCoordinate + i, colCoordinate)) {
                    matrix[rowCoordinate + i][colCoordinate] = 0;
                } /*else {
                    break;
                }*/
            }
            //Store nonzero(not destroyed) elements into list and use them to make new row
            //replace existing rows in matrix with new rows
            for (int r = 0; r < matrix.length; r++) {
                List<Integer> nonZeroValuesInRow = new ArrayList<>();
                for (int c = 0; c < matrix[r].length; c++) {
                    if (matrix[r][c] != 0) {
                        nonZeroValuesInRow.add(matrix[r][c]);
                    }
                }

                int[] rowWithoutZeros = new int[nonZeroValuesInRow.size()];

                for (int i = 0; i < nonZeroValuesInRow.size(); i++) {
                    rowWithoutZeros[i] = nonZeroValuesInRow.get(i);
                }

                matrix[r] = rowWithoutZeros;
            }

            input = scanner.nextLine();
        }

        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                System.out.print(matrix[r][c] + " ");
            }
            System.out.println();
        }
    }

    private static boolean isInBounds(int[][] matrix, int r, int c) {
        return r >= 0 && r < matrix.length && c >= 0 && c < matrix[r].length;
    }
}
