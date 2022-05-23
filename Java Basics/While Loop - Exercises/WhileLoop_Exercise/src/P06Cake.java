import java.util.Scanner;

public class P06Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());

        int area = width * height;
        int pieces = 0;

        String command = scanner.nextLine();
        boolean isEaten = false;

        while (!command.equals("STOP")){
            pieces = Integer.parseInt(command);

            if (pieces > area){
                isEaten = true;
                break;
            }

            area -= pieces;
            command = scanner.nextLine();
        }

        if (isEaten){
            System.out.println("No more cake left! You need " + (pieces - area) + " pieces more.");
        } else {
            System.out.println(area + " pieces are left.");
        }
    }
}
