import java.util.Scanner;

public class P06_StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        int tempNum = number;
        int sum = 0;

        while (tempNum > 0) {
            int tmp = 1;

            for (int i = 1; i <= (tempNum % 10); i++){
                tmp = tmp * i;
            }
            tempNum = tempNum / 10;
            sum += tmp;
        }

        if (number == sum){
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
