import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03PhoneShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> storage = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());
        String command = scanner.nextLine();

        while (!command.equals("End")){

            String[] commandArr = command.split(" - ");
            String commandType = commandArr[0];

            switch (commandType){
                case "Add":
                    String phoneToAdd = commandArr[1];
                    if (!storage.contains(phoneToAdd)){
                        storage.add(phoneToAdd);
                    }
                    break;
                case "Remove":
                    String phoneToRemove = commandArr[1];
                    storage.removeIf(e -> e.equals(phoneToRemove));
                    break;
                case "Bonus phone":
                    String[] bonusPhoneArr = commandArr[1].split(":");

                    String oldPhone = bonusPhoneArr[0];
                    String newPhone = bonusPhoneArr[1];

                    if (storage.contains(oldPhone)){
                        int oldPhoneIndex = storage.indexOf(oldPhone);
                        storage.add(oldPhoneIndex + 1, newPhone);
                    }
                    break;
                case "Last":
                    String lastPhone = commandArr[1];

                    if (storage.contains(lastPhone)){
                        storage.remove(lastPhone);
                        storage.add(lastPhone);
                    }
                    break;
            }

            command = scanner.nextLine();
        }

        System.out.println(String.join(", ", storage));

    }
}
