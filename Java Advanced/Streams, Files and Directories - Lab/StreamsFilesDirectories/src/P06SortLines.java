import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class P06SortLines {
    public static void main(String[] args) throws IOException {
        String location = "resources\\input.txt";

        Path path = Paths.get(location);
        List<String> lines = Files.lines(path).sorted().collect(Collectors.toList());
        Files.write(Paths.get("sorted-lines.txt"), lines);

    }
}
