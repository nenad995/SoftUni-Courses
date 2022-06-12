import java.util.Scanner;

public class P04Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());

        switch (command){
            case "add":
                add(num1, num2);
                break;
            case "subtract":
                subtract(num1, num2);
                break;
            case "multiply":
                multiply(num1, num2);
                break;
            case "divide":
                divide(num1, num2);
                break;
        }
    }

    public static void add(int a, int b){
        System.out.println(a + b);
    }

    public static void subtract(int a, int b){
        System.out.println(a - b);
    }

    public static void multiply(int a, int b){
        System.out.println(a * b);
    }

    public static void divide(int a, int b){
        System.out.println(a / b);
    }

}
