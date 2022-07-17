import java.util.Scanner;

public class P01ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.equals("end")){
            String reverse = "";

            for (int i = input.length()-1; i >= 0; i--){
                reverse += input.charAt(i);
            }

            System.out.println(input + " = " + reverse);

            input = scanner.nextLine();
        }
    }
}
