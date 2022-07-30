import java.util.Scanner;

public class P01ActivationKey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String activationKey = scanner.nextLine();
        StringBuilder key = new StringBuilder(activationKey);

        String command = scanner.nextLine();

        while (!command.equals("Generate")){

            String[] commandArr = command.split(">>>");
            String commandType = commandArr[0];

            switch (commandType){
                case "Contains":
                    String subString = commandArr[1];
                    if (key.toString().contains(subString)){
                        System.out.println(key + " contains " + subString);
                    } else {
                        System.out.println("Substring not found!");
                    }
                    break;
                case "Flip":
                    int startIndex = Integer.parseInt(commandArr[2]);
                    int stopIndex = Integer.parseInt(commandArr[3]);

                    String manipulationPart = key.substring(startIndex, stopIndex);

                    if (commandArr[1].contains("Upper")){
                        key.replace(startIndex, stopIndex, manipulationPart.toUpperCase());
                    } else if (commandArr[1].contains("Lower")){
                        key.replace(startIndex, stopIndex, manipulationPart.toLowerCase());
                    }
                    System.out.println(key);
                    break;
                case "Slice":
                    int startSliceIndex = Integer.parseInt(commandArr[1]);
                    int stopSliceIndex = Integer.parseInt(commandArr[2]);

                    key.replace(startSliceIndex, stopSliceIndex, "");
                    System.out.println(key);
                    break;
            }
            command = scanner.nextLine();
        }
        System.out.println("Your activation key is: " + key);
    }
}
