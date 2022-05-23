import java.util.Scanner;

public class P06WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double record = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double secondsPerMeter = Double.parseDouble(scanner.nextLine());

        double delay = Math.floor(distance / 15);
        double delayInSeconds = delay * 12.5;
        double requiredTime = (distance * secondsPerMeter) + delayInSeconds;

        if (requiredTime < record){
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", requiredTime);
        } else {
            System.out.printf("No, he failed! He was %.2f seconds slower.", requiredTime - record);
        }
    }
}
