import java.util.Scanner;

public class P02ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxPoorGrades = Integer.parseInt(scanner.nextLine());
        int poorGradesCount = 0;

        String problem = scanner.nextLine();
        int problemCount = 0;
        String lastProblem = problem;

        int grade = Integer.parseInt(scanner.nextLine());
        int gradeSum = 0;

        boolean isBreak = false;

        while (!problem.equals("Enough")) {

            if (grade <= 4) {
                poorGradesCount++;
            }
            if (poorGradesCount >= maxPoorGrades){
                isBreak = true;
                break;
            }

            problemCount++;
            gradeSum += grade;

            if (!lastProblem.equals("Enough")){
                lastProblem = problem;
            }

            problem = scanner.nextLine();
            grade = Integer.parseInt(scanner.nextLine());

        }
        if (!isBreak){
            System.out.printf("Average score: %.2f%n" +
                    "Number of problems: %d%n" +
                    "Last problem: %s", (gradeSum * 1.00 / problemCount * 1.00), problemCount, lastProblem);
        } else {
            System.out.printf("You need a break, %d poor grades.", poorGradesCount);
        }
    }
}
