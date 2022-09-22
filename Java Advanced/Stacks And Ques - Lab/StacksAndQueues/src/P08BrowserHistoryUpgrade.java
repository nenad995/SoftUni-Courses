import java.util.ArrayDeque;
import java.util.Scanner;

public class P08BrowserHistoryUpgrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> backBrowserHistory = new ArrayDeque<>();
        ArrayDeque<String> forwardBrowserHistory = new ArrayDeque<>();

        String input = scanner.nextLine();
        String currentUrl = null;

        while (!input.equals("Home")){

            if (input.equals("back")){
                if (backBrowserHistory.isEmpty()){
                    System.out.println("no previous URLs");
                    input = scanner.nextLine();
                    continue;
                } else {
                    forwardBrowserHistory.push(currentUrl);
                    currentUrl = backBrowserHistory.pop();
                }
            } else if (input.equals("forward")) {
                if (forwardBrowserHistory.isEmpty()){
                    System.out.println("no next URLs");
                    input = scanner.nextLine();
                    continue;
                } else {
                    backBrowserHistory.push(currentUrl);
                    currentUrl = forwardBrowserHistory.pop();
                }
            } else {
                if (currentUrl != null){
                    backBrowserHistory.push(currentUrl);
                    forwardBrowserHistory.clear();
                }
                currentUrl = input;
            }

            System.out.println(currentUrl);

            input = scanner.nextLine();
        }
    }
}
