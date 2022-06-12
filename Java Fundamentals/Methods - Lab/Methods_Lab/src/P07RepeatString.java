import java.util.Scanner;

public class P07RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputString = scanner.nextLine();
        int repetitions = Integer.parseInt(scanner.nextLine());

        String result = repeatString(inputString, repetitions);
        System.out.println(result);
    }

    public static String repeatString(String str, int reps){

        String finalString = "";

        for (int i = 0; i < reps; i++){
            finalString += str;
        }

        return finalString;
    }
}
