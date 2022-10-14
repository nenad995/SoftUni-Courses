package stackIterator;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        Stack stack = new Stack();

        while (!command.equals("END")){
            if (command.contains("Push")){
                String elements = command.substring(5);
                int[] elementsToPush = Arrays.stream(elements.split(", "))
                        .mapToInt(Integer::parseInt)
                        .toArray();
                stack.push(elementsToPush);
            } else if (command.contains("Pop")){
                stack.pop();
            }

            command = scanner.nextLine();
        }

        for (Integer element : stack){
            System.out.println(element);
        }

        for (Integer element : stack){
            System.out.println(element);
        }
    }
}
