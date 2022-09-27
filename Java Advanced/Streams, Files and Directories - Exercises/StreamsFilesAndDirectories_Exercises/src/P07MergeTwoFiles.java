import java.io.*;

public class P07MergeTwoFiles {
    public static void main(String[] args) throws IOException {
        BufferedReader firstReader = new BufferedReader(new FileReader("resources/inputOne.txt"));
        PrintWriter printWriter = new PrintWriter(new FileWriter("output.txt", true));

        firstReader.lines().forEach(line -> printWriter.println(line));
        firstReader.close();

        BufferedReader secondReader = new BufferedReader(new FileReader("resources/inputTwo.txt"));
        secondReader.lines().forEach(line -> printWriter.println(line));
        secondReader.close();

        printWriter.close();
    }
}
