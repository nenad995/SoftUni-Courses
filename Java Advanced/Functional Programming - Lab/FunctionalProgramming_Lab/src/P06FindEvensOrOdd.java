import java.util.Scanner;
import java.util.function.IntPredicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class P06FindEvensOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] numbers = scanner.nextLine().split(" ");

        int begin = Integer.parseInt(numbers[0]);
        int end = Integer.parseInt(numbers[numbers.length - 1]);

        String filter = scanner.nextLine();

        IntPredicate predicate = n -> {
            /*filter.equals("odd") == (n % 2 != 0);*/
            return switch (filter) {
                case "odd" -> n % 2 != 0;
                case "even" -> n % 2 == 0;
                default -> false;
            };
        };

        String output = IntStream.rangeClosed(begin,end)
                .filter(predicate)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(" "));

        System.out.println(output);

    }
}
