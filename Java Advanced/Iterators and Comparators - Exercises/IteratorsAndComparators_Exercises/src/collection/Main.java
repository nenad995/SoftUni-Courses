package collection;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        ListyIterator listyIterator = null;

        while (!command.equals("END")){
            String[] commandParts = command.split("\\s+");
            String commandName = commandParts[0];

            switch (commandName){
                case "Create":
                    if (commandParts.length > 1){
                        String[] elementArr = Arrays.copyOfRange(commandParts,1,commandParts.length);
                        listyIterator = new ListyIterator(elementArr);
                    } else {
                        listyIterator = new ListyIterator();
                    }
                    break;
                case "Move":
                    System.out.println(listyIterator.move());
                    break;
                case "HasNext":
                    System.out.println(listyIterator.hasNext());
                    break;
                case "Print":
                    try {
                        listyIterator.print();
                    } catch (IllegalStateException e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case "PrintAll":
                    listyIterator.printAll();
                    break;
            }

            command = scanner.nextLine();
        }
    }
}
