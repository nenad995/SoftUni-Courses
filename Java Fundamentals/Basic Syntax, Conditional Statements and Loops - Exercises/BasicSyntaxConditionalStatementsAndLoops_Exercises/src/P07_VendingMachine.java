import java.util.Scanner;

public class P07_VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = "";
        double total = 0;

        boolean isStart = false;
        boolean isEnd = false;

        while (!isStart) {

            command = scanner.nextLine();

            if (command.equals("Start")) {
                isStart = true;
            } else {
                double coin = Double.parseDouble(command);

                if (coin == 0.1) {
                    total += 0.1;
                } else if (coin == 0.2) {
                    total += 0.2;
                } else if (coin == 0.5) {
                    total += 0.5;
                } else if (coin == 1) {
                    total += 1;
                } else if (coin == 2) {
                    total += 2;
                } else {
                    System.out.printf("Cannot accept %.2f%n", coin);
                }
            }
        }

        double nuts = 2.0;
        double water = 0.7;
        double crisps = 1.5;
        double soda = 0.8;
        double coke = 1.0;

        while (!isEnd) {

            command = scanner.nextLine();

            if (command.equals("End")) {
                isEnd = true;
            } else {
                if (command.equals("Nuts")) {
                    if (total >= nuts) {
                        System.out.println("Purchased Nuts");
                        total -= nuts;
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                } else if (command.equals("Water")) {
                    if (total >= water) {
                        System.out.println("Purchased Water");
                        total -= water;
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                } else if (command.equals("Crisps")) {
                    if (total >= crisps) {
                        System.out.println("Purchased Crisps");
                        total -= crisps;
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                } else if (command.equals("Soda")) {
                    if (total >= soda) {
                        System.out.println("Purchased Soda");
                        total -= soda;
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                } else if (command.equals("Coke")) {
                    if (total >= coke) {
                        System.out.println("Purchased Coke");
                        total -= coke;
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                } else {
                    System.out.println("Invalid product");
                }
            }
        }

        System.out.printf("Change: %.2f", total);
    }
}
