import java.util.Scanner;

public class P06CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double inputWidth = Double.parseDouble(scanner.nextLine());
        double inputHeight = Double.parseDouble(scanner.nextLine());

        double area = calculateRectangleArea(inputWidth, inputHeight);

        System.out.printf("%.0f", area);
    }

    public static double calculateRectangleArea(double width, double height){
        return width * height;
    }
}
