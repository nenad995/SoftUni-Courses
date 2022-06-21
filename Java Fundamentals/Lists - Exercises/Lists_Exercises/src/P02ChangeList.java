import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        String command = scanner.nextLine();

        while (!command.equals("end")){
            String[] commandArr = command.split(" ");
            String commandType = commandArr[0];

            switch (commandType){
                case "Delete":
                    int condition = Integer.parseInt(commandArr[1]);
                    numbers.removeIf(e -> e == condition);
                    break;
                case "Insert":
                    int element = Integer.parseInt(commandArr[1]);
                    int position = Integer.parseInt(commandArr[2]);
                    numbers.add(position, element);
                    break;
            }

            command = scanner.nextLine();

        }

        System.out.println(numbers.toString().replaceAll("[\\[\\],]",""));
    }
}

