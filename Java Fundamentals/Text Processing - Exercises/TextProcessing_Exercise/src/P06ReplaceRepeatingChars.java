import java.util.Scanner;

public class P06ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        StringBuilder sb = new StringBuilder(input);

        for (int i = 0; i < sb.length()-1; i++){
            char currentChar = sb.charAt(i);
            int count = 0;

            for (int j = i + 1; j < sb.length(); j++){

                if (sb.charAt(j) == currentChar){
                    count++;
                } else {
                    break;
                }
            }

            if (count > 0){
                sb.delete(i,i + count);
            }
        }

        System.out.println(sb);
    }
}
