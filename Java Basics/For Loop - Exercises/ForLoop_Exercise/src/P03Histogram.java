import java.util.Scanner;

public class P03Histogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int p1count = 0;
        int p2count = 0;
        int p3count = 0;
        int p4count = 0;
        int p5count = 0;

        for (int i = 0; i < n; i++) {
            int tmp = Integer.parseInt(scanner.nextLine());

            if (tmp < 200) {
                p1count ++;
            } else if (tmp >= 200 && tmp < 400){
                p2count++;
            } else if (tmp >= 400 && tmp < 600){
                p3count++;
            } else if (tmp >= 600 && tmp < 800){
                p4count++;
            } else {
                p5count++;
            }
        }

        double p1percent = (p1count * 1.00 / n * 1.00) * 100;
        double p2percent = (p2count * 1.00 / n * 1.00) * 100;
        double p3percent = (p3count * 1.00 / n * 1.00) * 100;
        double p4percent = (p4count * 1.00 / n * 1.00) * 100;
        double p5percent = (p5count * 1.00 / n * 1.00) * 100;

        System.out.printf("%.2f%%%n" +
                "%.2f%%%n" +
                "%.2f%%%n" +
                "%.2f%%%n" +
                "%.2f%%", p1percent, p2percent, p3percent, p4percent, p5percent);
    }
}
