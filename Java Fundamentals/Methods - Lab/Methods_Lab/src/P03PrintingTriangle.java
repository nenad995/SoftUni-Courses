import java.util.Scanner;

public class P03PrintingTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        printTriangle(num);

    }

    public static void printTriangle(int number){
        for (int i = 1; i <= number; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
        for (int i = number; i > 0; i--){
            for (int j = 1; j < i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
