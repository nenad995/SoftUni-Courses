import java.util.ArrayDeque;
import java.util.Scanner;

public class P01BrowserHistory {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> history = new ArrayDeque<>();

        String input = scanner.nextLine();
        String currentUrl = null;

        while (!input.equals("Home")){

            if (input.equals("back")){
                if (history.isEmpty()){
                    System.out.println("no previous URLs");
                    input = scanner.nextLine();
                    continue;
                } else {
                    currentUrl = history.pop();
                }
            } else {
                if (currentUrl != null){
                    history.push(currentUrl);
                }
                currentUrl = input;
            }

            System.out.println(currentUrl);

            input = scanner.nextLine();
        }

    }
}
