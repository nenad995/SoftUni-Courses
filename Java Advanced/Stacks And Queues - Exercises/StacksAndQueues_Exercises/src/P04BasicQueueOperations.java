import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class P04BasicQueueOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] nsx = scanner.nextLine().split("\\s+");
        int n = Integer.parseInt(nsx[0]); // count of elements to offer
        int s = Integer.parseInt(nsx[1]); // count of elements to poll
        int x = Integer.parseInt(nsx[2]); // element to look for

        String[] input = scanner.nextLine().split("\\s+");
        ArrayDeque<Integer> que = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            que.offer(Integer.parseInt(input[i]));
        }

        for (int i = 0; i < s; i++) {
            que.poll();
        }

        // if the que is empty print 0
        // if the que contains the element X print true
        // if the que is not empty and element X is not present print lowest element
        if (que.isEmpty()) {
            System.out.println("0");
        } else if (que.contains(x)) {
            System.out.println("true");
        } else {
            System.out.println(Collections.min(que));
        }
    }
}
