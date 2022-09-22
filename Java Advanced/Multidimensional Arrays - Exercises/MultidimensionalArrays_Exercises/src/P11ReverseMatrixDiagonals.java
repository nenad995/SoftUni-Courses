import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class P11ReverseMatrixDiagonals {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        String[] dimensions = scanner.nextLine().split(" ");
        int rows = Integer.parseInt(dimensions[0]);
        int cols = Integer.parseInt(dimensions[1]);

        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            matrix[i] = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        Map<Integer, List<Integer>> diagonals = new LinkedHashMap<>();

        for (int i = 0; i < (rows + cols) - 1; i++){
            int diagonal = i;

            for (int r = rows - 1 - i; r >= 0; r--){

                for (int c = cols - 1; c >= 0; c--){
                    addValueToDiagonal(diagonals, matrix[r][c], diagonal);
                    diagonal++;
                }
                break;
            }
        }



        StringBuilder sb = new StringBuilder();

        diagonals.values().forEach(numbers -> sb
                .append(numbers.stream().map(Object::toString).collect(Collectors.joining(" ")))
                .append(System.lineSeparator()));

        System.out.print(sb);
    }

    private static void addValueToDiagonal(Map<Integer, List<Integer>> diagonals, int value, int diagonal) {
        diagonals.putIfAbsent(diagonal, new ArrayList<>());
        diagonals.get(diagonal).add(value);
    }
}