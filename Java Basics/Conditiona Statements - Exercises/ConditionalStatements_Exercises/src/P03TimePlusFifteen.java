import java.util.Scanner;

public class P03TimePlusFifteen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        if (hour < 24 && hour >= 00 && minutes < 60 && minutes >= 00) {

            int addedMinutes = minutes + 15;

            if (addedMinutes >= 60){
                int remainingMinutes = addedMinutes - 60;
                hour = hour + 1;
                if (hour >= 24) {
                    hour = 0;
                }
                if (remainingMinutes < 10){
                    System.out.printf("%d:0%d", hour, remainingMinutes);
                } else {
                    System.out.printf("%d:%d", hour, remainingMinutes);
                }
            } else {
                System.out.printf("%d:%d", hour, addedMinutes);
            }
        }

    }
}
