import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02GaussTrick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());


        int listSize = numbers.size();

        for (int i = 0; i < listSize / 2; i++){
            numbers.set(i, numbers.get(i) + numbers.get(numbers.size() - 1));
            numbers.remove(numbers.size() - 1);

        }

        for (int element : numbers){
            System.out.print(element + " ");
        }
    }
}
