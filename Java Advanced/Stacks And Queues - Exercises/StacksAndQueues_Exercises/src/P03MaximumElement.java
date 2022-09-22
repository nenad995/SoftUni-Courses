import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class P03MaximumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine()); // number of commands
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < n; i++){

            String[] command = scanner.nextLine().split("\\s+");

            // if command is 1 push element
            // if command is 2 pop element
            // if command is 3 print highest element
            if (command[0].equals("1")){
                stack.push(Integer.parseInt(command[1]));
            } else if (command[0].equals("2")){
                stack.pop();
            } else if (command[0].equals("3")){
                System.out.println(Collections.max(stack));
            }
        }
    }
}
