import java.io.File;

public class P07ListFiles {
    public static void main(String[] args) {

        String location = "resources/Files-and-Streams";
        File file = new File(location);

        if (file.isDirectory()){
            File[] files = file.listFiles();

            for (File file1 : files){
                if (file1.isFile()){
                    System.out.println(file1.getName() + ": [" + file1.length() + "]");
                }
            }
        }
    }
}
