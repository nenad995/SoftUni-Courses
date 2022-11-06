import java.util.Scanner;

public class P02ReVolt {

    public static int playerRow;
    public static int playerCol;
    public static boolean isWon = false;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());
        char[][] matrix = new char[size][size];

        int numberOfCommands = Integer.parseInt(scanner.nextLine());

        for (int row = 0; row < size; row++){
            String matrixRow = scanner.nextLine();
            matrix[row] = matrixRow.toCharArray();

            if (matrixRow.contains("f")){
                playerRow = row;
                playerCol = matrixRow.indexOf('f');
            }
        }

        while (numberOfCommands > 0 && !isWon){
            String command = scanner.nextLine();

            switch (command){
                case "up":
                    movePlayer(matrix, -1, 0);
                    break;
                case "down":
                    movePlayer(matrix, 1, 0);
                    break;
                case "left":
                    movePlayer(matrix, 0, -1);
                    break;
                case "right":
                    movePlayer(matrix, 0, 1);
                    break;
            }
            numberOfCommands--;
        }

        if (!isWon){
            System.out.println("Player lost!");
        } else {
            System.out.println("Player won!");
        }

        print(matrix);
    }

    private static void movePlayer(char[][] matrix, int rowMutator, int colMutator) {

        int nextRow = playerRow + rowMutator;
        int nextCol = playerCol + colMutator;

        if (isOutOfBounds(matrix, nextRow, nextCol)){
            if (nextRow < 0){
                nextRow = matrix.length - 1;
            } else if (nextRow >= matrix.length){
                nextRow = 0;
            } else if (nextCol < 0){
                nextCol = matrix[nextRow].length - 1;
            } else {
                nextCol = 0;
            }
        }

        if (matrix[nextRow][nextCol] == 'T'){
            return;
        } else if (matrix[nextRow][nextCol] == 'B'){
            matrix[playerRow][playerCol] = '-';
            playerRow = nextRow;
            playerCol = nextCol;
            movePlayer(matrix, rowMutator, colMutator);
            return;
        } else if (matrix[nextRow][nextCol] == 'F'){
            isWon = true;
        }

        if (matrix[playerRow][playerCol] != 'B'){
            matrix[playerRow][playerCol] = '-';
        }

        matrix[nextRow][nextCol] = 'f';
        playerRow = nextRow;
        playerCol = nextCol;
    }

    private static boolean isOutOfBounds(char[][] matrix, int row, int col) {
        return row < 0 || row >= matrix.length || col < 0 || col >= matrix[row].length;
    }

    public static void print(char[][] matrix){
        for (char[] row : matrix){
            for (char element : row){
                System.out.print(element);
            }
            System.out.println();
        }
    }

}
