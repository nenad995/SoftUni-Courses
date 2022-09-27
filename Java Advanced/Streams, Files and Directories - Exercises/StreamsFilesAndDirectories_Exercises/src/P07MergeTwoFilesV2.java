import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class P07MergeTwoFilesV2 {
    public static void main(String[] args) throws IOException {
        Path firstFilePath = Paths.get("resources/inputOne.txt");
        List<String> firstFileLines = Files.readAllLines(firstFilePath);

        Path secondFilePath = Paths.get("resources/inputTwo.txt");
        List<String> secondFileLines = Files.readAllLines(secondFilePath);

        Path output = Paths.get("output.txt");

        Files.write(output, firstFileLines, StandardOpenOption.APPEND);
        Files.write(output, secondFileLines, StandardOpenOption.APPEND);
    }
}
