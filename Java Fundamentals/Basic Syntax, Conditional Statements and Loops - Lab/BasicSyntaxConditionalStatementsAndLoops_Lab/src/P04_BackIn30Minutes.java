import java.util.Scanner;

public class P04_BackIn30Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        if ((minutes + 30) > 59) {
            hours += 1;
            minutes -= 30;

        } else {
            minutes += 30;
        }

        if (hours > 23){
            hours = 0;
        }

        if (minutes <= 9){
            System.out.printf("%d:0%d", hours, minutes);
        } else {
            System.out.printf("%d:%d", hours, minutes);

        }
    }
}
