import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Set;

public class P02WriteToFile {
    public static void main(String[] args) throws IOException {

        String path = "C:\\Users\\Nenad\\Desktop\\input.txt";

        FileInputStream fileInputStream = new FileInputStream(path);

        FileOutputStream fileOutputStream = new FileOutputStream("output.txt");

        int oneByte = fileInputStream.read();

        Set<Character> punctuationTable = Set.of(',', '.', '!', '?');

        while (oneByte != -1) {

            char symbol = (char)oneByte;

            boolean isPunctuation = punctuationTable.contains(symbol);

            if (!isPunctuation){
                fileOutputStream.write(symbol);
            }

            oneByte = fileInputStream.read();
        }

        fileInputStream.close();
        fileOutputStream.close();
    }
}
