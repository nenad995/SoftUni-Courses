import java.util.Scanner;

public class P10_PadawanEquipment {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double money = Double.parseDouble(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());
        double lightsaberPrice = Double.parseDouble(scanner.nextLine());
        double robePrice = Double.parseDouble(scanner.nextLine());
        double beltPrice = Double.parseDouble(scanner.nextLine());

        double totalLightsaberCost = Math.ceil((students * 1.1)) * lightsaberPrice;
        double totalRobeCost = students * robePrice;
        int freeBelts = students / 6;
        double totalBeltCost = (students - freeBelts) * beltPrice;

        double totalCost = totalLightsaberCost + totalRobeCost + totalBeltCost;

        if (money < totalCost){
            System.out.printf("George Lucas will need %.2flv more.", totalCost - money);
        } else {
            System.out.printf("The money is enough - it would cost %.2flv.", totalCost);
        }
    }
}
