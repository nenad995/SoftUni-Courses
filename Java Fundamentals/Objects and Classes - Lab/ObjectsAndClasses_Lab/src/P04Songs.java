import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P04Songs {

    public static class Song{
        private String typeList;
        private String name;
        private String time;

        public String getTypeList() {
            return typeList;
        }

        public void setTypeList(String typeList) {
            this.typeList = typeList;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfSongs = Integer.parseInt(scanner.nextLine());

        List<Song> songs = new ArrayList<>();

        for (int i = 0; i < numberOfSongs; i++){
            String[] inputData = scanner.nextLine().split("_");

            String songType = inputData[0];
            String songName = inputData[1];
            String songDuration = inputData[2];

            Song song = new Song();

            song.setTypeList(songType);
            song.setName(songName);
            song.setTime(songDuration);

            songs.add(song);
        }

        String listType = scanner.nextLine();


        for (Song song : songs){
            if (listType.equals("all")){
                System.out.println(song.getName());
            } else {
                if (listType.equals(song.getTypeList())){
                    System.out.println(song.getName());
                }
            }

        }
    }
}
