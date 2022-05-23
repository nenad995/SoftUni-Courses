import java.util.Scanner;

public class P08LunchBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int epDuration = Integer.parseInt(scanner.nextLine());
        int breakDuration = Integer.parseInt(scanner.nextLine());

        double lunchTime = breakDuration / 8d;
        double restTime = breakDuration / 4d;

        double remainingTime = breakDuration - lunchTime - restTime;
        double freeTimeLeft = Math.abs(remainingTime - epDuration);

        if (remainingTime >= epDuration){
            System.out.printf("You have enough time to watch %s " +
                    "and left with %.0f minutes free time.", name, Math.ceil(freeTimeLeft));
        } else {
            System.out.printf("You don't have enough time to watch %s, " +
                    "you need %.0f more minutes.", name, Math.ceil(freeTimeLeft));
        }
    }
}
