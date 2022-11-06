package borderControl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        List<Identifiable> list = new ArrayList<>();

        while (!"End".equals(input)){

            String[] data = input.split("\\s+");
            Identifiable identifiable;

            if (data.length == 3) {
                String name = data[0];
                int age = Integer.parseInt(data[1]);
                String citizenId = data[2];

                identifiable = new Citizen(name, age, citizenId);
            } else {
                String mode = data[0];
                String robotId = data[1];

                identifiable = new Robot(mode, robotId);
            }

            list.add(identifiable);

            input = scanner.nextLine();
        }

        String idToCheck = scanner.nextLine();

        for (Identifiable identifiable : list){
            if (identifiable.getId().endsWith(idToCheck)){
                System.out.println(identifiable.getId());
            }
        }

    }
}
