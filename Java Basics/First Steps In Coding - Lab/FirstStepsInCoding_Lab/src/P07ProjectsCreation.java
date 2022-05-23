import java.util.Scanner;

public class P07ProjectsCreation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String architectName = scanner.nextLine();
        int numberOfProjects = Integer.parseInt(scanner.nextLine());

        int hours = numberOfProjects * 3;

        System.out.println("The architect " + architectName + " will need " + hours + " hours to complete " +
                numberOfProjects + " project/s.");
    }
}
