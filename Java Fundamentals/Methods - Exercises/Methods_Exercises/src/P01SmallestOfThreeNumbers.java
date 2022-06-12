import java.util.Scanner;

public class P01SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());

        int smallestNumber = findSmallestNum(num1, num2, num3);
        System.out.println(smallestNumber);
    }

    public static int findSmallestNum(int num1, int num2, int num3){
        int smallest = num1;

        if (smallest > num2){
            smallest = num2;
        }

        if (smallest > num3){
            smallest = num3;
        }

        return smallest;
    }
}
