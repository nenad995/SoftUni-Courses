import java.util.Scanner;

public class P02VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int vowels = countVowels(input);
        System.out.println(vowels);


    }
    public static int countVowels (String stringArr){
        int count = 0;

        for (int i = 0; i < stringArr.length(); i++){

            if (stringArr.charAt(i) == 'a' || stringArr.charAt(i) == 'e' || stringArr.charAt(i) == 'i' ||
                    stringArr.charAt(i) == 'o' || stringArr.charAt(i) == 'u' || stringArr.charAt(i) == 'A' ||
                    stringArr.charAt(i) == 'E' || stringArr.charAt(i) == 'I' || stringArr.charAt(i) == 'O' ||
                    stringArr.charAt(i) == 'U'){
                count++;
            }
        }

        return count;
    }
}
