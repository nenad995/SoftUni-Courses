import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P07RemoveNegativesAndReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        numbers.removeIf(e -> e < 0);

        if (numbers.isEmpty()){
            System.out.println("empty");
        } else {
            Collections.reverse(numbers);

            for (int num : numbers){
                System.out.print(num + " ");
            }
        }

    }
}
