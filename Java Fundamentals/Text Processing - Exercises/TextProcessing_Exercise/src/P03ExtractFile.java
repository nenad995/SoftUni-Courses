import java.util.Scanner;

public class P03ExtractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] pathToFile = input.split("\\\\");

        String fullFileName = pathToFile[pathToFile.length-1];

        String fileName = fullFileName.split("\\.")[0];
        String fileExtension = fullFileName.split("\\.")[1];

        System.out.println("File name: " + fileName);
        System.out.println("File extension: " + fileExtension);
    }
}
