import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P04ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();


        while (!command.equals("end")){

            String[] commandArr = command.split(" ");
            String commandType = commandArr[0];

            switch (commandType){
                case "Add":
                    numbers.add(Integer.parseInt(commandArr[1]));
                    break;
                case "Remove":
                    numbers.remove(Integer.valueOf(commandArr[1]));
                    break;
                case "RemoveAt":
                    numbers.remove(Integer.parseInt(commandArr[1]));
                    break;
                case "Insert":
                    numbers.add(Integer.parseInt(commandArr[2]), Integer.parseInt(commandArr[1]));
                    break;
            }

            command = scanner.nextLine();
        }

        for (int element : numbers){
            System.out.print(element + " ");
        }

    }
}
