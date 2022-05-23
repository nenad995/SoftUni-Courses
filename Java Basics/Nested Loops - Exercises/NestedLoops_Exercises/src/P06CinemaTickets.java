import java.util.Scanner;

public class P06CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int standard = 0;
        int student = 0;
        int kid = 0;

        int countAllTickets = 0;

        String input = scanner.nextLine();

        while (!input.equals("Finish")) {
            String movie = input;
            int seats = Integer.parseInt(scanner.nextLine());

            int countCurrentTickets = 0;

            String typeTicket = scanner.nextLine();

            while (!typeTicket.equals("End")) {
                countCurrentTickets++;
                countAllTickets++;

                switch (typeTicket) {
                    case "standard":
                        standard++;
                        break;
                    case "student":
                        student++;
                        break;
                    case "kid":
                        kid++;
                        break;
                }

                if (countCurrentTickets >= seats) {
                    break;
                }
                typeTicket = scanner.nextLine();
            }

            System.out.printf("%s - %.2f%% full.%n", movie, countCurrentTickets * 1.0 / seats * 100);
            input = scanner.nextLine();
        }

        System.out.printf("Total tickets: %d%n", countAllTickets);
        System.out.printf("%.2f%% student tickets.%n", student * 1.0 / countAllTickets * 100);
        System.out.printf("%.2f%% standard tickets.%n", standard * 1.0 / countAllTickets * 100);
        System.out.printf("%.2f%% kids tickets.%n", kid * 1.0 / countAllTickets * 100);
    }
}
