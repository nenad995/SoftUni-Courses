import java.util.Arrays;
import java.util.Optional;
import java.util.Scanner;

public class P01NumberInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] range = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        System.out.println(String.format("Range: [%d...%d]", range[0], range[1]));

        boolean isValidInput = false;

        while (!isValidInput){
            String nextInput = scanner.nextLine();
            Optional<Integer> number = Optional.empty();

            try {
                number = Optional.of(Integer.parseInt(nextInput));
            } catch (NumberFormatException ignored) {

            }

            if (number.isPresent() && isInRange(range, number.get())){
                System.out.println("Valid number: " + number.get());
                isValidInput = true;
            } else {
                System.out.println("Invalid number: " + nextInput);
            }

        }
    }

    private static boolean isInRange(int[] range, int number) {
        return number >= range[0] && number <= range[1];
    }
}
