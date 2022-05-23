import java.util.Scanner;

public class P04TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        double allGradesSum = 0;
        int countAllGrades = 0;

        String input = scanner.nextLine();

        while (!input.equals("Finish")) {
            String presentationName = input;

            double sumCurrentGrade = 0;
            for (int i = 1; i <= n; i++) {
                double currentGrade = Double.parseDouble(scanner.nextLine());
                countAllGrades++;
                sumCurrentGrade += currentGrade;
            }

            allGradesSum += sumCurrentGrade;
            double avgCurrentGrade = sumCurrentGrade / n;

            System.out.printf("%s - %.2f.%n", presentationName, avgCurrentGrade);

            input = scanner.nextLine();
        }

        double finalGrade = allGradesSum / countAllGrades;
        System.out.printf("Student's final assessment is %.2f.", finalGrade);

    }
}
 