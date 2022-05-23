import java.util.Scanner;

public class P04Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = "";
        int stepsCount = 0;
        boolean isGoalReached = false;

        while (stepsCount < 10000) {
            command = scanner.nextLine();

            if (!command.equals("Going home")){
                int steps = Integer.parseInt(command);
                stepsCount = stepsCount + steps;

                if (stepsCount >= 10000) {
                    isGoalReached = true;
                    break;
                }
            } else if (command.equals("Going home")) {
                String stepsToHome = scanner.nextLine();
                int steps = Integer.parseInt(stepsToHome);
                stepsCount = stepsCount + steps;

                if (stepsCount >= 10000){
                    isGoalReached = true;
                }
                break;
            }
        }
        if (isGoalReached){
            System.out.println("Goal reached! Good job!");
            System.out.println((stepsCount - 10000) + " steps over the goal!");
        } else {
            System.out.println((10000 - stepsCount) + " more steps to reach goal.");
        }
    }
}
