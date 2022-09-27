import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class P05LineNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("resources/inputLineNumbers.txt"));
        PrintWriter printWriter = new PrintWriter("output.txt");

        String line = bufferedReader.readLine();
        int counter = 1;

        while (line != null){
            printWriter.println(counter + ". " + line);
            counter++;
            line = bufferedReader.readLine();
        }

        bufferedReader.close();
        printWriter.close();
    }
}
