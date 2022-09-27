import java.io.File;
import java.util.ArrayDeque;

public class P08NestedFolders {
    public static void main(String[] args) {
        String location = "resources/Files-and-Streams";

        File root = new File(location);

        ArrayDeque<File> queue = new ArrayDeque<>();

        queue.offer(root);

        int counter = 0;

        while (!queue.isEmpty()){

            File file = queue.poll();
            System.out.println(file.getName());


            File[] files = file.listFiles();

            if (files != null){
                for (File f : files){
                    if (f.isDirectory()){
                        queue.offer(f);
                    }
                }
            }
            counter++;
        }
        System.out.println(counter + " folders");
    }
}
