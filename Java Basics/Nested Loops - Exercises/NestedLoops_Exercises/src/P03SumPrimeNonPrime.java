import java.util.Scanner;

public class P03SumPrimeNonPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int nonPrimeSum = 0;
        int primeSum = 0;

        boolean isPrime = true;

        while (!input.equals("stop")){
            int num = Integer.parseInt(input);

            if (num < 0) {
                System.out.println("Number is negative.");
                input = scanner.nextLine();
                continue;
            }

            if (num == 1 || num == 0) {
                nonPrimeSum += num;
            }

            for (int i = 2; i < num; i++){
                if (num % i == 0) {
                    isPrime = false;
                    nonPrimeSum += num;
                    break;
                } else {
                    isPrime = true;
                }
            }

            if (isPrime){
                primeSum += num;
            }

            input = scanner.nextLine();
        }

        System.out.println("Sum of all prime numbers is: " + primeSum);
        System.out.println("Sum of all non prime numbers is: " + nonPrimeSum);
    }
}
