import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class P07FindSmallestElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        Function<List<Integer>, Integer> findIndexOfMin = list -> {
            int min = Integer.MAX_VALUE;
            int index = -1;

            for (int i = 0; i < list.size(); i++) {
                int number = list.get(i);
                if (number <= min){
                    min = number;
                    index = i;
                }
            }

            return index;
        };

        System.out.println(findIndexOfMin.apply(numbers));
    }
}
