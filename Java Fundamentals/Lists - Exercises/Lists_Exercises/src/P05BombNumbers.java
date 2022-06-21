import java.util.*;
import java.util.stream.Collectors;

public class P05BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String[] bombInput = scanner.nextLine().split(" ");
        int bombNumber = Integer.parseInt(bombInput[0]);
        int bombPower = Integer.parseInt(bombInput[1]);

        while (numbers.contains(bombNumber)){

            int bombIndex = numbers.indexOf(bombNumber);

            int startIndex = bombIndex - bombPower;
            int endIndex = bombIndex + bombPower;

            if (startIndex < 0){
                startIndex = 0;
            }

            if (endIndex > numbers.size() - 1) {
                endIndex = numbers.size() - 1;
            }

            List<Integer> remainingElementsOnLeft = numbers.subList(0, startIndex);
            List<Integer> remainingElementsOnRight = numbers.subList(endIndex + 1, numbers.size());
            List<Integer> newNumbersList = new ArrayList<>();
            newNumbersList.addAll(remainingElementsOnLeft);
            newNumbersList.addAll(remainingElementsOnRight);

            numbers = newNumbersList;

        }

        int sum = 0;

        for (int i = 0; i < numbers.size(); i++){
            sum += numbers.get(i);
        }

        System.out.println(sum);
    }
}
