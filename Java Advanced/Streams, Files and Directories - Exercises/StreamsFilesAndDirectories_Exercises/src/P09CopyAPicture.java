import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class P09CopyAPicture {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream("resources/picture.jpg");
        FileOutputStream outputStream = new FileOutputStream("resources/picture-copy.jpg");

        byte[] byteArr = new byte[1024];

        while (inputStream.read(byteArr) >= 0){
            outputStream.write(byteArr);
        }

        inputStream.close();
        outputStream.close();
    }
}
