import java.util.Scanner;

public class P03Substring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String key = scanner.nextLine();
        String  text = scanner.nextLine();

        int indexOfKey = text.indexOf(key);

        while (indexOfKey != -1){
            text = text.replace(key, "");
            indexOfKey = text.indexOf(key);
        }

        System.out.println(text);
    }
}
