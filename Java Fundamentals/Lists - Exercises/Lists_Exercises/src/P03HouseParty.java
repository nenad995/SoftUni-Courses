import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P03HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> guestList = new ArrayList<>();
        int numberOfCommands = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numberOfCommands; i++){
            String command = scanner.nextLine();

            String[] commandArr = command.split(" ");
            String guestName = commandArr[0];
            boolean isGoing = !commandArr[2].equals("not");

            if (isGoing && guestList.contains(guestName)){
                System.out.println(guestName + " is already in the list!");
            } else if (isGoing && !guestList.contains(guestName)){
                guestList.add(guestName);
            } else if (!isGoing && guestList.contains(guestName)){
                guestList.remove(guestName);
            } else {
                System.out.println(guestName + " is not in the list!");
            }
        }

        for (String guest : guestList){
            System.out.println(guest);
        }
    }
}
