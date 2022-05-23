import java.util.Scanner;

public class P07Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int videoCards = Integer.parseInt(scanner.nextLine());
        int processors = Integer.parseInt(scanner.nextLine());
        int ram = Integer.parseInt(scanner.nextLine());

        int videoCardPrice = videoCards * 250;
        double processorPrice = (videoCardPrice * 0.35) * processors;
        double ramPrice = (videoCardPrice * 0.10) * ram;

        double total = videoCardPrice + processorPrice + ramPrice;

        if (videoCards > processors){
            total = total - (total * 0.15);
        }

        if (budget >= total){
            System.out.printf("You have %.2f leva left!", budget - total);
        } else {
            System.out.printf("Not enough money! You need %.2f leva more!", total - budget);
        }
    }
}