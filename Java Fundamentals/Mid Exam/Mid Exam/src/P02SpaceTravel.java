import java.util.Scanner;

public class P02SpaceTravel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] travelRoute = scanner.nextLine().split("\\|\\|");
        int fuel = Integer.parseInt(scanner.nextLine());
        int ammo = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < travelRoute.length; i++){
            String[] commandArr = travelRoute[i].split(" ");
            String commandType = commandArr[0];

            switch (commandType){
                case "Travel":
                    int distance = Integer.parseInt(commandArr[1]);
                    if (distance <= fuel){
                        fuel = fuel - distance;
                        System.out.println("The spaceship travelled " + distance + " light-years.");
                    } else {
                        System.out.println("Mission failed.");
                        return;
                    }
                    break;
                case "Enemy":
                    int armour = Integer.parseInt(commandArr[1]);
                    if (armour <= ammo){
                        ammo = ammo - armour;
                        System.out.println("An enemy with " + armour + " armour is defeated.");
                    } else if (fuel >= (armour * 2)){
                        fuel = fuel - (armour * 2);
                        System.out.println("An enemy with " + armour + " armour is outmaneuvered.");
                    } else {
                        System.out.println("Mission failed.");
                        return;
                    }
                    break;
                case "Repair":
                    int resupply = Integer.parseInt(commandArr[1]);
                    ammo = ammo + (resupply * 2);
                    System.out.println("Ammunitions added: " + (resupply * 2) + ".");
                    fuel = fuel + resupply;
                    System.out.println("Fuel added: " + resupply + ".");
                    break;
                case "Titan":
                    System.out.println("You have reached Titan, all passengers are safe.");
                    return;
            }
        }
    }
}
