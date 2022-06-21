import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P06CardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstPlayerDeck = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> secondPlayerDeck = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        int firstPlayerScore = 0;
        int secondPlayerScore = 0;

        while (firstPlayerDeck.size() > 0 && secondPlayerDeck.size() > 0){

            if (firstPlayerDeck.get(0) > secondPlayerDeck.get(0)){
                firstPlayerDeck.add(firstPlayerDeck.get(0));
                firstPlayerDeck.add(secondPlayerDeck.get(0));
                firstPlayerDeck.remove(0);
                secondPlayerDeck.remove(0);
            } else if (secondPlayerDeck.get(0) > firstPlayerDeck.get(0)){
                secondPlayerDeck.add(secondPlayerDeck.get(0));
                secondPlayerDeck.add(firstPlayerDeck.get(0));
                secondPlayerDeck.remove(0);
                firstPlayerDeck.remove(0);
            } else {
                firstPlayerDeck.remove(0);
                secondPlayerDeck.remove(0);
            }
        }

        if (firstPlayerDeck.size() == 0){
            for (int i = 0; i < secondPlayerDeck.size(); i++){
                secondPlayerScore += secondPlayerDeck.get(i);
            }
            System.out.println("Second player wins! Sum: " + secondPlayerScore);
        }

        if (secondPlayerDeck.size() == 0){
            for (int i = 0; i < firstPlayerDeck.size(); i++){
                firstPlayerScore += firstPlayerDeck.get(i);
            }
            System.out.println("First player wins! Sum: " + firstPlayerScore);
        }
    }
}
