import java.util.Scanner;

public class P09SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int daysForStay = Integer.parseInt(scanner.nextLine());
        String room = scanner.nextLine();
        String rating = scanner.nextLine();
        if (room.equals("room for one person")) {
            double roomPrice = 18 * (daysForStay - 1);

            if (rating.equals("positive")) {
                roomPrice = roomPrice + (roomPrice * 0.25);
            } else if (rating.equals("negative")) {
                roomPrice = roomPrice - (roomPrice * 0.1);
            }
            System.out.printf("%.2f" , roomPrice);

        } else if (room.equals("apartment")) {
            double roomPrice = 25 * (daysForStay - 1);
            if (daysForStay < 10) {
                roomPrice = roomPrice - (roomPrice * 0.30);
            } else if (daysForStay >= 10 && daysForStay <= 15) {
                roomPrice = roomPrice - (roomPrice * 0.35);
            } else if (daysForStay > 15) {
                roomPrice = roomPrice - (roomPrice * 0.50);
            }
            if (rating.equals("positive")) {
                roomPrice = roomPrice + (roomPrice * 0.25);
            } else if (rating.equals("negative")) {
                roomPrice = roomPrice - (roomPrice * 0.1);
            }
            System.out.printf("%.2f" , roomPrice);


        } else if (room.equals("president apartment")) {
            double roomPrice = 35 * (daysForStay - 1);
            if (daysForStay < 10) {
                roomPrice = roomPrice - (roomPrice * 0.10);
            } else if (daysForStay >= 10 && daysForStay <= 15) {
                roomPrice = roomPrice - (roomPrice * 0.15);
            } else if (daysForStay > 15) {
                roomPrice = roomPrice - (roomPrice * 0.20);
            }
            if (rating.equals("positive")) {
                roomPrice = roomPrice + (roomPrice * 0.25);
            } else if (rating.equals("negative")) {
                roomPrice = roomPrice - (roomPrice * 0.1);
            }
            System.out.printf("%.2f" , roomPrice);
        }
    }
}