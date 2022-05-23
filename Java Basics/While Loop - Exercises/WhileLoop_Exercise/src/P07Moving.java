import java.util.Scanner;

public class P07Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());

        int volume = width * length * height;

        String input = scanner.nextLine();
        while (!input.equals("Done")) {
            int boxes = Integer.parseInt(input);

            volume -= boxes;

            if (volume <= 0) {
                break;
            }

            input = scanner.nextLine();
        }

        if (volume <= 0) {
            System.out.printf("No more free space! You need %d Cubic meters more.",
                    Math.abs(volume));
        } else {
            System.out.printf("%d Cubic meters left.", volume);
        }
    }
}
