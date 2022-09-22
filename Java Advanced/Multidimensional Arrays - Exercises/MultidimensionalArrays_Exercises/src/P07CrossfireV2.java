import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P07CrossfireV2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] dimensions = scanner.nextLine().split(" ");
        int rows = Integer.parseInt(dimensions[0]);
        int cols = Integer.parseInt(dimensions[1]);

        List<List<Integer>> matrix = new ArrayList<>();
        int counter = 1;

        for (int row = 0; row < rows; row++) {
            matrix.add(new ArrayList<>());
            for (int col = 0; col < cols; col++) {
                matrix.get(row).add(counter++);
            }
        }

        String input = scanner.nextLine();

        while (!input.equals("Nuke it from orbit")){

            String[] coordinates = input.split(" ");
            int destroyRow = Integer.parseInt(coordinates[0]);
            int destroyCol = Integer.parseInt(coordinates[1]);
            int radius = Integer.parseInt(coordinates[2]);

            for (int row = destroyRow - radius; row <= destroyRow + radius; row++){
                if (isIndexInBounds(matrix, row, destroyCol) && row != destroyRow){
                    matrix.get(row).remove(destroyCol);
                }
            }

            for (int col = destroyCol + radius; col >= destroyCol - radius; col--){
                if (isIndexInBounds(matrix, destroyRow, col)){
                    matrix.get(destroyRow).remove(col);
                }
            }

            matrix.removeIf(List::isEmpty);

            input = scanner.nextLine();
        }

        for (List<Integer> row : matrix){
            for (Integer element : row){
                System.out.print(element + " ");
            }
            System.out.println();
        }

    }

    public static boolean isIndexInBounds(List<List<Integer>> matrix, int r, int c){
        return r >= 0 && r < matrix.size() && c >= 0 && c < matrix.get(r).size();
    }
}
