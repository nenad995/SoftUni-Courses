import java.util.Arrays;
import java.util.Scanner;

public class P01CompareMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimensionsOfFirstMatrix = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int numberOfArrays = dimensionsOfFirstMatrix[0];
        int numberOfElementsInEachArray = dimensionsOfFirstMatrix[1];

        int[][] firstMatrix = new int[numberOfArrays][numberOfElementsInEachArray];

        for (int r = 0; r < numberOfArrays; r++) {
            String[] rRow = scanner.nextLine().split(" ");
            for (int c = 0; c < numberOfElementsInEachArray; c++) {
                firstMatrix[r][c] = Integer.parseInt(rRow[c]);
            }
        }

        int[] dimensionsOfSecondMatrix = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        numberOfArrays = dimensionsOfSecondMatrix[0];
        numberOfElementsInEachArray = dimensionsOfSecondMatrix[1];

        int[][] secondMatrix = new int[numberOfArrays][numberOfElementsInEachArray];

        for (int r = 0; r < numberOfArrays; r++) {
            String[] rRow = scanner.nextLine().split(" ");
            for (int c = 0; c < numberOfElementsInEachArray; c++) {
                secondMatrix[r][c] = Integer.parseInt(rRow[c]);
            }
        }

        boolean areEqual = firstMatrix.length == secondMatrix.length;

        if (areEqual) {
            areEqual = areArraysEqual(firstMatrix, secondMatrix);
        }

        System.out.println(areEqual ? "equal" : "not equal");

    }

    private static boolean areArraysEqual(int[][] firstMatrix, int[][] secondMatrix) {

        for (int r = 0; r < firstMatrix.length; r++) {

            int[] firstArr = firstMatrix[r];
            int[] secondArr = secondMatrix[r];

            if (firstArr.length != secondArr.length) {
                return false;
            } else {
                for (int i = 0; i < firstArr.length; i++) {
                    int firstNum = firstArr[i];
                    int secondNum = secondArr[i];

                    if (firstNum != secondNum) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
