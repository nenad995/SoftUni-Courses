import java.util.Arrays;
import java.util.Scanner;

public class P09ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        String  command = scanner.nextLine();

        while (!command.equals("end")){

            String[] commandArr = command.split(" ");
            String commandType = commandArr[0];

            switch (commandType){
                case "swap":
                    int swapIndex1 = Integer.parseInt(commandArr[1]);
                    int swapIndex2 = Integer.parseInt(commandArr[2]);
                    int temp = numbers[swapIndex1];
                    numbers[swapIndex1] = numbers[swapIndex2];
                    numbers[swapIndex2] = temp;
                    break;
                case "multiply":
                    int multiplyIndex1 = Integer.parseInt(commandArr[1]);
                    int multiplyIndex2 = Integer.parseInt(commandArr[2]);
                    numbers[multiplyIndex1] = numbers[multiplyIndex1] * numbers[multiplyIndex2];
                    break;
                case "decrease":
                    for (int i = 0; i < numbers.length; i++){
                        numbers[i] -= 1;
                    }
                    break;
            }
            command = scanner.nextLine();
        }

        for (int i = 0; i < numbers.length; i++) {
            if (i != numbers.length - 1) {
                System.out.print(numbers[i] + ", ");
            } else {
                System.out.print(numbers[i]);
            }
        }
    }
}
