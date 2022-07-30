import java.util.Scanner;

public class P01WorldTour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String command = scanner.nextLine();

        while (!command.equals("Travel")){

            String[] commandArr = command.split(":");
            String commandType = commandArr[0];


            switch (commandType){

                case "Add Stop":
                    int startAddIndex = Integer.parseInt(commandArr[1]);
                    String newStop = commandArr[2];

                    if (indexValidation(input, startAddIndex)){
                        String leftPart = input.substring(0,startAddIndex);
                        String rightPart = input.substring(startAddIndex);
                        input = leftPart.concat(newStop).concat(rightPart);
                    }

                    System.out.println(input);
                    break;
                case "Remove Stop":
                    int startRemoveIndex = Integer.parseInt(commandArr[1]);
                    int stopRemoveIndex = Integer.parseInt(commandArr[2]);

                    if (indexValidation(input, startRemoveIndex) && indexValidation(input, stopRemoveIndex) && startRemoveIndex <= stopRemoveIndex){
                        String leftPart = input.substring(0,startRemoveIndex);
                        String rightPart = input.substring(stopRemoveIndex + 1);

                        input = leftPart.concat(rightPart);
                    }

                    System.out.println(input);
                    break;
                case "Switch":
                    String oldString = commandArr[1];
                    String newString = commandArr[2];

                    if (input.contains(oldString)){
                        input = input.replaceAll(oldString, newString);
                    }

                    System.out.println(input);
                    break;
            }

            command = scanner.nextLine();
        }

        System.out.println("Ready for world tour! Planned stops: " + input);
    }

    public static boolean indexValidation(String text, int index){
        return index >= 0 && index < text.length();
    }
}
