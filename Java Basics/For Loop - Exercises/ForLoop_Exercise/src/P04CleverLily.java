import java.util.Scanner;

public class P04CleverLily {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double x = Double.parseDouble(scanner.nextLine());
        int pricePerDoll = Integer.parseInt(scanner.nextLine());

        int moneyFromBirthday = 0;
        int dollsCount = 0;

        for (int i = 1; i <= n; i++){
            if (i % 2 == 0){
                moneyFromBirthday = moneyFromBirthday + ((i * 10) / 2);
                moneyFromBirthday -= 1;
            } else {
                dollsCount ++;
            }
        }

        int moneyFromDolls = dollsCount * pricePerDoll;
        int total = moneyFromDolls + moneyFromBirthday;

        if (total >= x) {
            System.out.printf("Yes! %.2f", (total - x));
        } else {
            System.out.printf("No! %.2f", (x - total));
        }
    }
}
