import java.util.Scanner;

public class P06Oscar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String actorName = scanner.nextLine();
        double pointsFromAcademy = Double.parseDouble(scanner.nextLine());
        int judgesCount = Integer.parseInt(scanner.nextLine());

        double totalPoints = pointsFromAcademy;

        for (int i = 0; i < judgesCount; i++) {

            String judgeName = scanner.nextLine();
            double judgePoints = Double.parseDouble(scanner.nextLine());

            double sumJudgePoints = (judgePoints * judgeName.length()) / 2;

            if (totalPoints < 1250.5) {
                totalPoints += sumJudgePoints;
            }

        }

        if (totalPoints >= 1250.5) {
            System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", actorName, totalPoints);
        } else {
            System.out.printf("Sorry, %s you need %.1f more!", actorName, (1250.5 - totalPoints));
        }
    }
}