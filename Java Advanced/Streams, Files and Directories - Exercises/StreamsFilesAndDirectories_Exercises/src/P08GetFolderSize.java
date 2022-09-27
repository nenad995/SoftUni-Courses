import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;

public class P08GetFolderSize {
    public static void main(String[] args) throws IOException {

        File file = new File("resources/Exercises Resources");

        ArrayDeque<File> directories = new ArrayDeque<>();
        directories.offer(file);

        int sumOfBytes = 0;

        while (!directories.isEmpty()){
            File currentFile = directories.poll();

            File[] files = currentFile.listFiles();

            for (File f : files){
                if (f.isDirectory()){
                    directories.offer(f);
                } else {
                    sumOfBytes += f.length();
                }
            }
        }

        System.out.println("Folder size: " + sumOfBytes);
    }
}
