import java.util.Arrays;
import java.util.Scanner;

public class P05MatrixShuffling {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimensions = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int rows = dimensions[0];
        int cols = dimensions[1];

        String[][] matrix = new String[rows][cols];

        for (int r = 0; r < matrix.length; r++){
            matrix[r] = scanner.nextLine().split(" ");
        }


        String input = scanner.nextLine();

        while (!input.contains("END")){

            String[] commandArr = input.split(" ");

            if (commandArr.length != 5 || !commandArr[0].equals("swap")){
                System.out.println("Invalid input!");
                input = scanner.nextLine();
                continue;
            } else {
                int row1 = Integer.parseInt(commandArr[1]);
                int col1 = Integer.parseInt(commandArr[2]);
                int row2 = Integer.parseInt(commandArr[3]);
                int col2 = Integer.parseInt(commandArr[4]);

                if (areIndexesInvalid(matrix, row1, col1, row2, col2)){
                    System.out.println("Invalid input!");
                    input = scanner.nextLine();
                    continue;
                } else {
                    String tmp = matrix[row1][col1];
                    matrix[row1][col1] = matrix[row2][col2];
                    matrix[row2][col2] = tmp;

                    printMatrix(matrix);
                }
            }
            input = scanner.nextLine();
        }
    }

    private static boolean areIndexesInvalid(String[][] matrix, int row1, int col1, int row2, int col2) {
        return row1 < 0 || row1 > matrix.length - 1 || col1 < 0 || col1 > matrix[row1].length - 1 ||
                row2 < 0 || row2 > matrix.length - 1 || col2 < 0 || col2 > matrix[row2].length;
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
