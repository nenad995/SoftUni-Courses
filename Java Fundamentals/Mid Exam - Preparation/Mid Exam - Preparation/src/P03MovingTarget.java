import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03MovingTarget {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> targets = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt)
                .collect(Collectors.toList());

        String command = scanner.nextLine();


        while (!command.equals("End")){

            String[] commandArr = command.split(" ");
            String commandType = commandArr[0];

            switch (commandType){
                case "Shoot":

                    int index = Integer.parseInt(commandArr[1]);
                    int power = Integer.parseInt(commandArr[2]);

                    if (isValid(targets, index)){
                        int currentTarget = targets.get(index);
                        if (currentTarget - power <= 0){
                            targets.remove(index);
                        } else {
                            targets.set(index, currentTarget - power);
                        }
                    }

                    break;
                case "Add":
                    index = Integer.parseInt(commandArr[1]);
                    int value = Integer.parseInt(commandArr[2]);

                    if (isValid(targets, index)){
                        targets.add(index, value);
                    } else {
                        System.out.println("Invalid placement!");
                    }

                    break;
                case "Strike":
                    index = Integer.parseInt(commandArr[1]);
                    int radius = Integer.parseInt(commandArr[2]);

                    if (isValid(targets, index)){
                        if (index - radius >= 0 && index + radius <= targets.size() - 1){
                            if (index + radius >= index - radius) {
                                targets.subList(index - radius, index + radius + 1).clear();
                            }
                        } else {
                            System.out.println("Strike missed!");
                        }
                    }

                    break;
            }

            command = scanner.nextLine();

        }

        System.out.println(targets.toString().replaceAll("[\\[\\],]", "")
                .replaceAll("\\s+",  "\\|"));

    }

    public static boolean isValid (List<Integer> targets, int index) {
        return index >= 0 && index < targets.size();
    }
}
