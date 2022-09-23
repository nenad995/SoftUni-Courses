import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class P02SetsOfElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] sizes = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int numberOfNElements = sizes[0];
        int numberOfMElements = sizes[1];

        Set<Integer> setN = new LinkedHashSet<>();
        Set<Integer> setM = new LinkedHashSet<>();

        for (int i = 0; i < numberOfNElements; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            setN.add(num);
        }

        for (int i = 0; i < numberOfMElements; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            setM.add(num);
        }

        /*setN.retainAll(setM);
        for (Integer num : setN){
            System.out.print(num + " ");
        }*/

        for (Integer num : setN){
            if (setM.contains(num)){
                System.out.print(num + " ");
            }
        }
    }
}
