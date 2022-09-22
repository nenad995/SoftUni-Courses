import java.util.Scanner;

public class P03IntersectionOfTwoMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());
        int cols = Integer.parseInt(scanner.nextLine());

        String[][] firstMatrix = new String[rows][cols];
        for (int r = 0; r < firstMatrix.length; r++){
            String[] col = scanner.nextLine().split("\\s+");
            firstMatrix[r] = col;
        }

        String[][] secondMatrix = new String[rows][cols];
        for (int r = 0; r < secondMatrix.length; r++){
            String[] col = scanner.nextLine().split("\\s+");
            secondMatrix[r] = col;
        }

        for (int r = 0; r < firstMatrix.length; r++){
            for (int c = 0; c < firstMatrix[r].length; c++){
                if (firstMatrix[r][c].equals(secondMatrix[r][c])){
                    System.out.print(firstMatrix[r][c] + " ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
