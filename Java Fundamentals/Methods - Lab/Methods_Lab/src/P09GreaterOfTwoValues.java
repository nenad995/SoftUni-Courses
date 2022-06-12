import java.util.Scanner;

public class P09GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String dataType = scanner.nextLine();

        switch (dataType){
            case "int":
                int num1 = Integer.parseInt(scanner.nextLine());
                int num2 = Integer.parseInt(scanner.nextLine());
                System.out.println(returnMax(num1, num2));
                break;
            case "char":
                char char1 = scanner.nextLine().charAt(0);
                char char2 = scanner.nextLine().charAt(0);
                System.out.println(returnMax(char1, char2));
                break;
            case "string":
                String string1 = scanner.nextLine();
                String string2 = scanner.nextLine();
                System.out.println(returnMax(string1, string2));
                break;
        }

    }

    public static int returnMax(int firstInt, int secondInt){
        if (firstInt > secondInt){
            return firstInt;
        }
        return secondInt;
    }

    public static char returnMax(char firstChar, char secondChar){
        if (firstChar > secondChar){
            return firstChar;
        }
        return secondChar;
    }

    public static String returnMax(String firstString, String secondString){
        if (firstString.compareTo(secondString) > 0){
            return firstString;
        } else if (firstString.compareTo(secondString) < 0){
            return secondString;
        }

        return firstString;
    }
}
