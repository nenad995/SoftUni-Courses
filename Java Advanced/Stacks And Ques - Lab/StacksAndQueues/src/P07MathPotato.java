import java.util.ArrayDeque;
import java.util.Scanner;

public class P07MathPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] inputArr = input.split("\\s+");

        int num = Integer.parseInt(scanner.nextLine());

        ArrayDeque<String> names = new ArrayDeque<>();

        for(int i = 0; i < inputArr.length; i++){
            names.offer(inputArr[i]);
        }

        int cycle = 1;

        while(names.size() > 1){

            if (isPrime(cycle)){
                for(int i = 1; i < num; i++){
                    names.offer(names.poll());
                }
                System.out.println("Prime " + names.peek());
            } else {
                for(int i = 1; i < num; i++){
                    names.offer(names.poll());
                }
                System.out.println("Removed " + names.poll());
            }

            cycle++;

        }
        System.out.println("Last is " + names.peek());
    }

    public static boolean isPrime (int n){

        if (n < 2){
            return false;
        }

        for (int i = 2; i < n; i++){
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }
}
