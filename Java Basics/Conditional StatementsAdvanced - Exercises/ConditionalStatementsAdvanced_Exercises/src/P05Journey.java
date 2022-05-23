import java.util.Scanner;

public class P05Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        if (budget <= 100) {
            if (season.equals("summer")){
                System.out.printf("Somewhere in Bulgaria%nCamp - %.2f",(budget - (budget - (budget * 0.3))));
            } else if (season.equals("winter")){
                System.out.printf("Somewhere in Bulgaria%nHotel - %.2f",(budget - (budget - (budget * 0.7))));
            }
        } else if (budget > 100 && budget <= 1000) {
            if (season.equals("summer")){
                System.out.printf("Somewhere in Balkans%nCamp - %.2f",(budget - (budget - (budget * 0.4))));
            } else if (season.equals("winter")){
                System.out.printf("Somewhere in Balkans%nHotel - %.2f",(budget - (budget - (budget * 0.8))));
            }
        } else {
            System.out.printf("Somewhere in Europe%nHotel - %.2f",(budget - (budget - (budget * 0.9))));
        }
    }
}
