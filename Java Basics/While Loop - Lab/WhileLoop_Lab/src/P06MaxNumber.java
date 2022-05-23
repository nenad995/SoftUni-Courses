import java.util.Scanner;

public class P06MaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int max = Integer.MIN_VALUE;

        while (!input.equals("Stop")){
            int num = Integer.parseInt(input);

            if (num > max){
                max = num;
            }

            input = scanner.nextLine();
        }

        System.out.println(max);


    }
}
