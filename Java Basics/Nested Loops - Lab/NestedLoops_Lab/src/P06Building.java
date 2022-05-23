import java.util.Scanner;

public class P06Building {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfFloors = Integer.parseInt(scanner.nextLine());
        int numberOfRooms = Integer.parseInt(scanner.nextLine());

        for (int i = numberOfFloors; i > (numberOfFloors - 1); i--) {
            for (int j = 0; j < numberOfRooms; j++) {
                System.out.printf("L%d%d ", i, j);
            }
            System.out.println();
        }
        for (int i = numberOfFloors - 1; i > 0; i--){
            for (int j = 0; j < numberOfRooms; j++){
                if (i % 2 == 0){
                    System.out.printf("O%d%d ", i, j);
                } else {
                    System.out.printf("A%d%d ", i, j);
                }
            }
            System.out.println();
        }
    }
}
