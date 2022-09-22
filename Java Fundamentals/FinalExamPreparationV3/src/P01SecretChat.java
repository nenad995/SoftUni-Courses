import java.util.Scanner;
import java.util.regex.Pattern;

public class P01SecretChat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String secretMessage = scanner.nextLine();
        StringBuilder sb = new StringBuilder(secretMessage);

        String command = scanner.nextLine();

        while (!command.equals("Reveal")){
            String commandType = command.split(":\\|:")[0];

            switch (commandType){
                case "InsertSpace":
                    int index = Integer.parseInt(command.split(":\\|:")[1]);
                    String leftPart = sb.substring(0,index);
                    String rightPart = sb.substring(index);

                    sb = new StringBuilder();
                    sb.append(leftPart).append(" ").append(rightPart);

                    System.out.println(sb);

                    break;
                case "Reverse":
                    String reverseSubstring = command.split(":\\|:")[1];
                    if (sb.toString().contains(reverseSubstring)){

                        secretMessage = sb.toString();
                        secretMessage = secretMessage.replaceFirst(Pattern.quote(reverseSubstring), "").concat(new StringBuilder(reverseSubstring).reverse().toString());
                        sb = new StringBuilder(secretMessage);

                        System.out.println(sb);
                    } else {
                        System.out.println("error");
                    }
                    break;
                case "ChangeAll":
                    String changeSubstring = command.split(":\\|:")[1];
                    String changeReplacement = command.split(":\\|:")[2];

                    sb = new StringBuilder(sb.toString().replaceAll(changeSubstring, changeReplacement));
                    System.out.println(sb);

                    break;
            }

            command = scanner.nextLine();
        }

        System.out.println("You have a new text message: " + sb);
    }
}
