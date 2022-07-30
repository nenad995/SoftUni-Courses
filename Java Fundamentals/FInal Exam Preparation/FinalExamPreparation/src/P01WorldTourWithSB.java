import java.util.Scanner;

public class P01WorldTourWithSB {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        StringBuilder sb = new StringBuilder(input);

        String command = scanner.nextLine();

        while (!command.equals("Travel")){

            String[] commandArr = command.split(":");
            String commandType = commandArr[0];

            switch (commandType){

                case "Add Stop":
                    int startAddIndex = Integer.parseInt(commandArr[1]);
                    String newStop = commandArr[2];

                    if (indexValidation(sb, startAddIndex)){
                        sb.insert(startAddIndex, newStop);
                    }

                    System.out.println(sb);
                    break;
                case "Remove Stop":
                    int startRemoveIndex = Integer.parseInt(commandArr[1]);
                    int stopRemoveIndex = Integer.parseInt(commandArr[2]);

                    if (indexValidation(sb, startRemoveIndex) && indexValidation(sb, stopRemoveIndex) && startRemoveIndex <= stopRemoveIndex){
                        sb.replace(startRemoveIndex, stopRemoveIndex + 1, "");
                    }

                    System.out.println(sb);
                    break;
                case "Switch":
                    String oldString = commandArr[1];
                    String newString = commandArr[2];

                    if (sb.toString().contains(oldString)){
                        sb = new StringBuilder(sb.toString().replaceAll(oldString, newString));
                    }

                    System.out.println(sb);
                    break;
            }

            command = scanner.nextLine();
        }

        System.out.println("Ready for world tour! Planned stops: " + sb);
    }

    public static boolean indexValidation(StringBuilder text, int index){
        return index >= 0 && index < text.length();
    }
}
