import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class P01SumLines {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("resources/input.txt"));

        String line = bufferedReader.readLine();

        while (line != null){
            long sum = 0;

            char[] charactersFromLine = line.toCharArray();

            for (char ch : charactersFromLine){
                sum += ch;
            }

            System.out.println(sum);

            line = bufferedReader.readLine();
        }

        bufferedReader.close();
    }
}
