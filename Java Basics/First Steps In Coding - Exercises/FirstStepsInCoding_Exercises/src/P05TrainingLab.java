import java.util.Scanner;

public class P05TrainingLab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double w = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        double wcm = w * 100;
        double hcm = h * 100;

        int desksPerRow = (int) ((hcm - 100) / 70);
        int numOfRows = (int) (wcm / 120);

        int totalDesks = desksPerRow * numOfRows - 3;

        System.out.println(totalDesks);
    }
}
