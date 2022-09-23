import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class P03PeriodicTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Set<String> elements = new HashSet<>();

        for (int i = 0; i < n; i++){
            String[] input = scanner.nextLine().split(" ");
            for (String element : input){
                elements.add(element);
            }
        }

        elements.stream().sorted(
                (e1, e2) -> {
                    return e1.compareTo(e2);
                }
        ).forEach(e -> System.out.print(e + " "));

        //Second approach is with TreeSet + String.join()
    }
}
