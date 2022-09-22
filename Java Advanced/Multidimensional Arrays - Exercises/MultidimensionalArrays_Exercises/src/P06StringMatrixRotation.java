import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P06StringMatrixRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Get rotation angle
        String rotation = scanner.nextLine();
        String rotationNumberString = rotation.split("[()]")[1];
        int rotationNumber = Integer.parseInt(rotationNumberString);
        int angleOfRotation = rotationNumber % 360;

        //Store elements into list to use them later
        String input = scanner.nextLine();
        List<String> wordList = new ArrayList<>();

        //Read elements and find longest element to construct matrix later
        int maxLength = Integer.MIN_VALUE;
        while (!input.equals("END")){
            wordList.add(input);

            if (maxLength < input.length()){
                maxLength = input.length();
            }

            input = scanner.nextLine();
        }

        //Get matrix dimensions and construct matrix
        int rows = wordList.size();
        int cols = maxLength;

        char[][] matrix = new char[rows][cols];

        //Insert elements into matrix
        for (int r = 0; r < rows; r++){
            String currentWord = wordList.get(r);
            for (int c = 0; c < cols; c++){
                if (c < currentWord.length()){
                    char currentChar = currentWord.charAt(c);
                    matrix[r][c] = currentChar;
                } else {
                    matrix[r][c] = ' ';
                }
            }
        }

        //Pick rotation method according to the rotation angle entered at the first line
        switch (angleOfRotation){
            //Print matrix as it is
            case 0:
                for (int r = 0; r < rows; r++){
                    for (int c = 0; c < cols; c++){
                        System.out.print(matrix[r][c]);
                    }
                    System.out.println();
                }
                break;
                //For element in each colon print one row
            case 90:
                for (int c = 0; c < cols; c++){
                    for (int r = rows - 1; r >= 0; r--){
                        System.out.print(matrix[r][c]);
                    }
                    System.out.println();
                }
                break;
                //Upside-down initial matrix
            case 180:
                for (int r = rows - 1; r >= 0; r--){
                    for (int c = cols - 1; c >= 0; c--){
                        System.out.print(matrix[r][c]);
                    }
                    System.out.println();
                }
                break;
                //Upside-down for angle of 90 degrees
            case 270:
                for (int c = cols - 1; c >= 0; c--){
                    for (int r = 0; r < rows; r++){
                        System.out.print(matrix[r][c]);
                    }
                    System.out.println();
                }
                break;

        }
    }
}
