import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class P12CreateZipArchive {
    public static void main(String[] args) throws IOException {
        FileInputStream inputFile1 = new FileInputStream("resources/input.txt");
        FileInputStream inputFile2 = new FileInputStream("resources/inputOne.txt");
        FileInputStream inputFile3 = new FileInputStream("resources/inputTwo.txt");

        FileOutputStream outputZip = new FileOutputStream("resources/files.zip");
        ZipOutputStream zip = new ZipOutputStream(outputZip);

        ZipEntry entry = new ZipEntry("input.txt");
        zip.putNextEntry(entry);
        zip.write(inputFile1.readAllBytes());
        zip.closeEntry();

        ZipEntry entry1 = new ZipEntry("inputOne.txt");
        zip.putNextEntry(entry1);
        zip.write(inputFile2.readAllBytes());
        zip.closeEntry();

        ZipEntry entry2 = new ZipEntry("inputTwo.txt");
        zip.putNextEntry(entry2);
        zip.write(inputFile3.readAllBytes());
        zip.closeEntry();
        zip.close();

        /*ZipEntry entry1 = new ZipEntry("inputOne.txt");
        ZipEntry entry2 = new ZipEntry("inputTwo.txt");*/

    }
}
