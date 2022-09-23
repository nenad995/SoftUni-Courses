import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03VoinaNumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashSet<Integer> firstPlayerNumbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(LinkedHashSet::new));

        LinkedHashSet<Integer> secondPlayerNumbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(LinkedHashSet::new));

        int rounds = 50;

        while (rounds >= 0){

            int p1Card = firstPlayerNumbers.iterator().next();
            firstPlayerNumbers.remove(p1Card);

            int p2Card = secondPlayerNumbers.iterator().next();
            secondPlayerNumbers.remove(p2Card);

            if (p1Card > p2Card){
                firstPlayerNumbers.add(p1Card);
                firstPlayerNumbers.add(p2Card);
            } else if (p2Card > p1Card){
                secondPlayerNumbers.add(p2Card);
                secondPlayerNumbers.add(p1Card);
            }

            if (firstPlayerNumbers.isEmpty() || secondPlayerNumbers.isEmpty()){
                break;
            }

            rounds--;
        }

        if (firstPlayerNumbers.size() > secondPlayerNumbers.size()){
            System.out.println("First player win!");
        } else if (secondPlayerNumbers.size() > firstPlayerNumbers.size()){
            System.out.println("Second player win!");
        } else {
            System.out.println("Draw");
        }
    }
}
