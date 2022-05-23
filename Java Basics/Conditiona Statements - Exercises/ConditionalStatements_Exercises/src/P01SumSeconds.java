import java.util.Scanner;

public class P01SumSeconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstRacer = Integer.parseInt(scanner.nextLine());
        int secondRacer = Integer.parseInt(scanner.nextLine());
        int thirdRacer = Integer.parseInt(scanner.nextLine());

        int totalSeconds = firstRacer + secondRacer + thirdRacer;
        int minutes = totalSeconds / 60;
        int remainingSeconds = totalSeconds % 60;

        if (remainingSeconds < 10){
            System.out.printf("%d:0%d", minutes, remainingSeconds);
        } else {
            System.out.printf("%d:%d", minutes, remainingSeconds);
        }
    }
}
