import java.util.ArrayDeque;
import java.util.Scanner;

public class P06HotPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] inputArr = input.split("\\s+");

        int num = Integer.parseInt(scanner.nextLine());

        ArrayDeque<String> names = new ArrayDeque<>();

        for(int i = 0; i < inputArr.length; i++){
            names.offer(inputArr[i]);
        }

        while(names.size() > 1){

            for(int i = 1; i < num; i++){
                names.offer(names.poll());
            }

            System.out.println("Removed " + names.poll());
        }

        System.out.println("Last is " + names.peek());
    }
}
