import java.util.Scanner;

public class P02Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double grade = Double.parseDouble(scanner.nextLine());

        printGradeInWords(grade);
    }

    public static void printGradeInWords(double grade){
        if (grade >= 2.00 && grade < 3.00){
            System.out.println("Fail");
        }
        if (grade >= 3 && grade < 3.50){
            System.out.println("Poor");
        }
        if (grade >= 3.50 && grade < 4.50) {
            System.out.println("Good");
        }
        if (grade >= 4.50 && grade < 5.50) {
            System.out.println("Very good");
        }
        if (grade >= 5.50 && grade <= 6.00){
            System.out.println("Excellent");
        }
    }
}
