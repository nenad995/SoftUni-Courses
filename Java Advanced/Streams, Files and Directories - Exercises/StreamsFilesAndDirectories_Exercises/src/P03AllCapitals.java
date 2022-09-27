import java.io.*;

public class P03AllCapitals {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("resources/input.txt"));
        PrintWriter printWriter = new PrintWriter(new FileWriter("output.txt"));
        bufferedReader.lines().forEach(line -> printWriter.println(line.toUpperCase()));
        bufferedReader.close();
        printWriter.close();
    }
}
