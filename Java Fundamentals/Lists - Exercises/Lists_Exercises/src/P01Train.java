import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P01Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> wagonsList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        int passengers = Integer.parseInt(scanner.nextLine()); //Passengers per wagon
        String command = scanner.nextLine();

        while (!command.equals("end")){

            String[] commandArr = command.split(" ");

            if (commandArr[0].equals("Add")){
                wagonsList.add(Integer.parseInt(commandArr[1]));
            } else {
                int passengersToInsert = Integer.parseInt(commandArr[0]); //Passengers to insert in ONE wagon

                for (int i = 0; i < wagonsList.size(); i++){
                    if (wagonsList.get(i) + passengersToInsert <= passengers){
                        wagonsList.set(i, wagonsList.get(i) + passengersToInsert);
                        break;
                    }
                }
            }

            command = scanner.nextLine();
        }

        System.out.println(wagonsList.toString().replaceAll("[\\[\\],]", ""));

    }
}
