import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P04ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        String command = scanner.nextLine();


        while (!command.equals("End")){

            String[] commandArr = command.split(" ");
            String commandType = commandArr[0];

            switch (commandType){
                case "Add":
                    numbers.add(Integer.parseInt(commandArr[1]));
                    break;
                case "Insert":
                    int index = Integer.parseInt(commandArr[2]);
                    if (index >= numbers.size() || index < 0){
                        System.out.println("Invalid index");
                    } else {
                        numbers.add(index, Integer.parseInt(commandArr[1]));
                    }
                    break;
                case "Remove":
                    index = Integer.parseInt(commandArr[1]);
                    if (index >= numbers.size() || index < 0){
                        System.out.println("Invalid index");
                    } else {
                        numbers.remove(index);
                    }
                    break;
                case "Shift":
                    int shifts = Integer.parseInt(commandArr[2]);
                    if (commandArr[1].equals("left")){
                        for (int i = 0; i < shifts; i++){
                            numbers.add(numbers.get(0));
                            numbers.remove(0);
                        }
                    } else if (commandArr[1].equals("right")){
                        for (int i = 0; i < shifts; i++){
                            int number = numbers.get(numbers.size() - 1);
                            numbers.remove(numbers.size() - 1);
                            numbers.add(0, number);
                        }
                    }
                    break;
            }

            command = scanner.nextLine();
        }

        System.out.println(numbers.toString().replaceAll("[\\[\\],]",""));
    }
}
