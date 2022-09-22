import java.util.ArrayDeque;
import java.util.Scanner;

public class P02BasicStackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] nsx = scanner.nextLine().split("\\s+");
        int n = Integer.parseInt(nsx[0]); // count of elements to push
        int s = Integer.parseInt(nsx[1]); // count of elements to pop
        int x = Integer.parseInt(nsx[2]); // element to look for

        String[] input = scanner.nextLine().split("\\s+"); //numbers to add to the stack
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < n; i++){
            stack.push(Integer.parseInt(input[i]));
        }

        for (int i = 0; i < s; i++){
            stack.pop();
        }

        // if the stack is empty print 0
        // if the stack contains the element X print true
        // if the stack is not empty and element X is not present print lowest element
        if (stack.isEmpty()){
            System.out.println("0");
        } else {
            if (stack.contains(x)){
                System.out.println("true");
            } else {
                int min = stack.peek();

                for(Integer integer : stack){
                    if(integer <= min){
                        min = integer;
                    }
                }

                System.out.println(min);
            }
        }
    }
}
