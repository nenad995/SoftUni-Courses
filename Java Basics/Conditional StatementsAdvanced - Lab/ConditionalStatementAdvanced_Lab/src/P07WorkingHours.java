import java.util.Scanner;

public class P07WorkingHours {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        String day = scanner.nextLine();

        if (hour >= 10 && hour <= 18) {
            switch (day){
                case "Monday":
                case "Tuesday":
                case "Wednesday":
                case "Thursday":
                case "Friday":
                case "Saturday":
                    System.out.println("open");
                    break;
                default:
                    System.out.println("closed");
            }
        }
        else {
            System.out.println("closed");
        }
    }
}
