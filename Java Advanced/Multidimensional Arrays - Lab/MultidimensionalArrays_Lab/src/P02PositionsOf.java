import java.util.Arrays;
import java.util.Scanner;

public class P02PositionsOf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimensions = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        int rows = dimensions[0];
        int cols = dimensions[1];

        int[][] matrix = new int[rows][cols];

        for (int r = 0; r < matrix.length; r++){
            matrix[r] = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        }

        int searchNumber = Integer.parseInt(scanner.nextLine());

        boolean isFound = false;

        for (int r = 0; r < matrix.length; r++){
            for (int c = 0; c < matrix[r].length; c++){
                int currentNumber = matrix[r][c];

                if (currentNumber == searchNumber){
                    System.out.println(r + " " + c);
                    isFound = true;
                }
            }
        }

        if (!isFound){
            System.out.println("not found");
        }
    }
}
