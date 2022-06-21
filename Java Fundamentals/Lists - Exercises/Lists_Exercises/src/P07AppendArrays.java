import java.util.*;
import java.util.stream.Collectors;

public class P07AppendArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String > arraysOfNumbers = Arrays.stream(scanner.nextLine().split("\\|")).collect(Collectors.toList());
        Collections.reverse(arraysOfNumbers);

        System.out.println(arraysOfNumbers.toString().replaceAll("[\\[\\],]", "")
                .trim().replaceAll("\\s+",  " "));

    }
}
