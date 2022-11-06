import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P01OSPlanning {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Stack
        ArrayDeque<Integer> tasks = new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split(", ")).map(Integer::parseInt).forEach(tasks::push);

        //Queue
        ArrayDeque<Integer> threads = new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).forEach(threads::offer);

        int taskToBeKilled = Integer.parseInt(scanner.nextLine());

        int task = tasks.peek();
        int thread = threads.peek();

        while (task != taskToBeKilled){

            if (thread >= task){
                tasks.pop();
                threads.poll();
            } else {
                threads.poll();
            }

            task = tasks.peek();
            thread = threads.peek();
        }

        System.out.println("Thread with value " + threads.peek() + " killed task " + taskToBeKilled);
        String leftThreads = threads.stream().map(String::valueOf).collect(Collectors.joining(" "));
        System.out.println(leftThreads);
    }
}
