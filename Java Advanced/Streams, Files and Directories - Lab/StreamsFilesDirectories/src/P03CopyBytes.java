import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class P03CopyBytes {
    public static void main(String[] args) throws IOException {

        String path = "resources\\input.txt";

        FileInputStream fileInputStream = new FileInputStream(path);

        FileOutputStream fileOutputStream = new FileOutputStream("output.txt");
        //PrintWriter printer = new PrintWriter(fileOutputStream); - исползваме за принтиране на ASCII код, а ако се кастне принтира символ

        int oneByte = fileInputStream.read();

        while (oneByte != -1) {

            boolean isDelimiter = oneByte == 12 || oneByte == 32 || oneByte == 10;
            if (isDelimiter){
                fileOutputStream.write(oneByte);
            } else {
                String digit = String.valueOf(oneByte);

                for (int i = 0; i < digit.length(); i++){
                    fileOutputStream.write(digit.charAt(i));
                }
            }

            oneByte = fileInputStream.read();
        }

        fileInputStream.close();
        fileOutputStream.close();
    }
}
