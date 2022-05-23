import java.util.Scanner;

public class P05GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int paidActors = Integer.parseInt(scanner.nextLine());
        double pricePerCostume = Double.parseDouble(scanner.nextLine());

        double decoration = budget * 0.1;
        double moneyForCustoms = paidActors * pricePerCostume;

        if (paidActors > 150){
            moneyForCustoms = moneyForCustoms - (moneyForCustoms * 0.1);
        }

        double requiredMoney = decoration + moneyForCustoms;

        if (budget >= requiredMoney){
            System.out.printf("Action!%nWingard starts filming with %.2f leva left.", (budget - requiredMoney));
        } else {
            System.out.printf("Not enough money!%nWingard needs %.2f leva more.", (requiredMoney - budget));
        }
    }
}
