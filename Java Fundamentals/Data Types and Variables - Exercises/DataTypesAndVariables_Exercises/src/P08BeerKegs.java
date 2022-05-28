import java.util.Scanner;

public class P08BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfKegs = Integer.parseInt(scanner.nextLine());

        String model = "";
        double radius = 0.0;
        int height = 0;

        double volume = Math.PI * radius * radius * height;
        String biggestKeg = "";

        for (int i = 0; i < numberOfKegs; i++){
            model = scanner.nextLine();
            radius = Double.parseDouble(scanner.nextLine());
            height = Integer.parseInt(scanner.nextLine());

            if ((Math.PI * radius * radius * height) > volume) {
                volume = Math.PI * radius * radius * height;
                biggestKeg = model;
            }
        }

        System.out.println(biggestKeg);
    }
}
