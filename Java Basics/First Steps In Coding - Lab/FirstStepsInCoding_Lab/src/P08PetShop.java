import java.util.Scanner;

public class P08PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dogFoodPackages = Integer.parseInt(scanner.nextLine());
        double requiredMoneyForDogFood = dogFoodPackages * 2.50;

        int catFoodPackages = Integer.parseInt(scanner.nextLine());
        double requiredMoneyForCatFood = catFoodPackages * 4.00;

        double total = requiredMoneyForDogFood + requiredMoneyForCatFood;

        System.out.println(total + " lv.");
    }
}
