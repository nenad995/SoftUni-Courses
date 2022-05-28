import java.util.Scanner;

public class P10PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine()); //Energy
        int m = Integer.parseInt(scanner.nextLine()); //Distance between targets
        int y = Integer.parseInt(scanner.nextLine()); //Exhaustion factor

        int targets = 0;
        int currentEnergy = n;

        while (currentEnergy >= m){

            currentEnergy = currentEnergy - m;
            targets++;

            if (n * 0.5 == currentEnergy){
                if (y > 0){
                    currentEnergy = currentEnergy / y;
                    continue;
                }
            }
        }

        System.out.println(currentEnergy);
        System.out.println(targets);
    }
}
