import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P09Largest3Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> list = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> sorted = list.stream().sorted((n1, n2) -> n2.compareTo(n1)).collect(Collectors.toList());

        if (sorted.size() < 3){
            for (Integer i : sorted){
                System.out.print(i + " ");
            }
        } else {
            System.out.print(sorted.get(0) + " " + sorted.get(1) + " " + sorted.get(2));
        }
    }
}
