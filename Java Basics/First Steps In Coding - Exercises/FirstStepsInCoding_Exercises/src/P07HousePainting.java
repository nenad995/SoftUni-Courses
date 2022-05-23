import java.util.Scanner;

public class P07HousePainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x = Double.parseDouble(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        //Green - 1l for 3.4m^2
        //Red - 1l for 4.3m^2

        double frontWallArea = (x * x) - (1.2 * 2); //Front wall w/o door
        double backWallArea = x * x;

        double sideWalls = 2 * ((x * y) - (1.5 * 1.5)); //Side walls w/o windows

        double roofSideArea = 2 * (x * y); //Two rectangles
        double roofTriangleArea = 2 * ((x * h) / 2); //Area of two roof triangles

        double litersForBase = (frontWallArea + backWallArea + sideWalls) / 3.4;
        double litersForRoof = (roofSideArea + roofTriangleArea) / 4.3;

        System.out.printf("%.2f%n%.2f", litersForBase, litersForRoof);
    }
}
