import java.util.Scanner;

public class P04FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fishermen = Integer.parseInt(scanner.nextLine());

        switch (season){
            case "Spring":
                double rent = 3000;
                //Check for number of fishermen
                if (fishermen <= 6){
                    rent = rent - (rent * 0.1);
                } else if (fishermen >= 7 && fishermen <= 11){
                    rent = rent - (rent * 0.15);
                } else {
                    rent = rent - (rent * 0.25);
                }
                //Check if odd or even
                if (fishermen % 2 == 0){
                    rent = rent - (rent * 0.05);
                }
                //Check for budget
                if (budget >= rent){
                    System.out.printf("Yes! You have %.2f leva left.", budget - rent);
                } else {
                    System.out.printf("Not enough money! You need %.2f leva.", rent - budget);
                }
                break;
            case "Summer":
                rent = 4200;
                //Check for number of fishermen
                if (fishermen <= 6){
                    rent = rent - (rent * 0.1);
                } else if (fishermen >= 7 && fishermen <= 11){
                    rent = rent - (rent * 0.15);
                } else {
                    rent = rent - (rent * 0.25);
                }
                //Check if odd or even
                if (fishermen % 2 == 0){
                    rent = rent - (rent * 0.05);
                }
                //Check for budget
                if (budget >= rent){
                    System.out.printf("Yes! You have %.2f leva left.", budget - rent);
                } else {
                    System.out.printf("Not enough money! You need %.2f leva.", rent - budget);
                }
                break;
            case "Autumn":
                rent = 4200;
                //Check for number of fishermen
                if (fishermen <= 6){
                    rent = rent - (rent * 0.1);
                } else if (fishermen >= 7 && fishermen <= 11){
                    rent = rent - (rent * 0.15);
                } else {
                    rent = rent - (rent * 0.25);
                }
                //Check for budget
                if (budget >= rent){
                    System.out.printf("Yes! You have %.2f leva left.", budget - rent);
                } else {
                    System.out.printf("Not enough money! You need %.2f leva.", rent - budget);
                }
                break;
            case "Winter":
                rent = 2600;
                //Check for number of fishermen
                if (fishermen <= 6){
                    rent = rent - (rent * 0.1);
                } else if (fishermen >= 7 && fishermen <= 11){
                    rent = rent - (rent * 0.15);
                } else {
                    rent = rent - (rent * 0.25);
                }
                //Check if odd or even
                if (fishermen % 2 == 0){
                    rent = rent - (rent * 0.05);
                }
                //Check for budget
                if (budget >= rent){
                    System.out.printf("Yes! You have %.2f leva left.", budget - rent);
                } else {
                    System.out.printf("Not enough money! You need %.2f leva.", rent - budget);
                }
                break;
        }
    }
}
