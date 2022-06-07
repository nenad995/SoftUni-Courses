import java.util.Scanner;

public class P01Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int wagons = Integer.parseInt(scanner.nextLine());
        int[] train = new int[wagons];

        for (int i = 0; i < train.length; i++){
            train[i] = Integer.parseInt(scanner.nextLine());
        }

        int sum = 0;

        for (int i = 0; i < train.length; i++){
            System.out.print(train[i] + " ");
            sum += train[i];
        }
        System.out.println();
        System.out.println(sum);
    }
}
