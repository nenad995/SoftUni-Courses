import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P09PokemonDontGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> distances = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        int sumOfRemovedElements = 0;

        while (distances.size() > 0){

            int index = Integer.parseInt(scanner.nextLine());

            if (index < 0){

                int firstElement = distances.get(0);
                sumOfRemovedElements += firstElement;
                int lastElement = distances.get(distances.size() - 1);

                distances.set(0, lastElement);
                modifyList(distances, firstElement);

            } else if (index > distances.size() - 1){
                int firstElement = distances.get(0);
                int lastElement = distances.get(distances.size() - 1);
                sumOfRemovedElements += lastElement;

                distances.set(distances.size() - 1, firstElement);
                modifyList(distances, lastElement);

            } else if (index >= 0 && index <= distances.size() - 1){
                int removedElement = distances.get(index);
                sumOfRemovedElements += removedElement;
                distances.remove(index);

                modifyList(distances, removedElement);
            }
        }

        System.out.println(sumOfRemovedElements);

    }

    public static void modifyList(List<Integer> distances, int valueOfRemovedElement){
        for (int i = 0; i < distances.size(); i++){

            int currentElement = distances.get(i);

            if (currentElement <= valueOfRemovedElement){
                currentElement += valueOfRemovedElement;
            } else {
                currentElement -= valueOfRemovedElement;
            }

            distances.set(i, currentElement);
        }
    }
}
