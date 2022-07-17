import java.util.Scanner;

public class P02CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputArr = scanner.nextLine().split(" ");
        int result = multiplyCharacters(inputArr[0], inputArr[1]);
        System.out.println(result);

    }

    public static int multiplyCharacters(String str1, String str2){
        int result = 0;

        if (str1.length() >= str2.length()){
            for (int i = 0; i < str2.length(); i++){
                char str2Char = str2.charAt(i);
                char str1Char = str1.charAt(i);

                result += str2Char * str1Char;
            }

            for (int j = str2.length(); j < str1.length(); j++){
                result += str1.charAt(j);
            }
        } else {
            for (int i = 0; i < str1.length(); i++){
                char str1Char = str1.charAt(i);
                char str2Char = str2.charAt(i);

                result += str2Char * str1Char;
            }

            for (int j = str1.length(); j < str2.length(); j++){
                result += str2.charAt(j);
            }
        }

        return result;
    }

}
