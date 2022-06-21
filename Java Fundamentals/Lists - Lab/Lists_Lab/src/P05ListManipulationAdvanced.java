import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P05ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();


        while (!command.equals("end")){

            String[] commandArr = command.split(" ");
            String commandType = commandArr[0];

            switch (commandType){
                case "Contains":
                    if (numbers.contains(Integer.parseInt(commandArr[1]))){
                        System.out.println("Yes");
                    } else {
                        System.out.println("No such number");
                    }
                    break;
                case "Print":
                    List<Integer> newNumbersList = new ArrayList<>();

                    if (commandArr[1].equals("even")){
                        for (int i = 0; i < numbers.size(); i++){
                            if (numbers.get(i) % 2 == 0){
                                newNumbersList.add(numbers.get(i));
                            }
                        }
                        System.out.println(newNumbersList.toString().replaceAll("[\\[\\],]", ""));
                        break;
                    } else if (commandArr[1].equals("odd")){

                        for (int i = 0; i < numbers.size(); i++){
                            if (numbers.get(i) % 2 != 0){
                                newNumbersList.add(numbers.get(i));
                            }
                        }
                        System.out.println(newNumbersList.toString().replaceAll("[\\[\\],]", ""));
                        break;
                    }
                case "Get":
                    int sum = 0;

                    for (int i = 0; i < numbers.size(); i++){
                        int currentElement = numbers.get(i);
                        sum += currentElement;
                    }

                    System.out.println(sum);
                    break;
                case "Filter":
                    filterElements(numbers, commandArr[1], Integer.parseInt(commandArr[2]));
                    break;
            }

            command = scanner.nextLine();
        }

    }

    public static void filterElements(List<Integer> numbers, String condition, int number){
        switch (condition){
            case "<":
                for (int i = 0; i < numbers.size(); i++){
                    if (numbers.get(i) < number){
                        System.out.print(numbers.get(i) + " ");
                    }
                }
                System.out.println();
                break;
            case ">":
                for (int i = 0; i < numbers.size(); i++){
                    if (numbers.get(i) > number){
                        System.out.print(numbers.get(i) + " ");
                    }
                }
                System.out.println();
                break;
            case ">=":
                for (int i = 0; i < numbers.size(); i++){
                    if (numbers.get(i) >= number){
                        System.out.print(numbers.get(i) + " ");
                    }
                }
                System.out.println();
                break;
            case "<=":
                for (int i = 0; i < numbers.size(); i++){
                    if (numbers.get(i) <= number){
                        System.out.print(numbers.get(i) + " ");
                    }
                }
                System.out.println();
                break;
        }
    }
}
