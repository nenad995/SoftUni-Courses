import java.util.Scanner;

public class P11FruitShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        String day = scanner.nextLine();
        double amount = Double.parseDouble(scanner.nextLine());

        switch (product){
            case "banana":
                switch (day){
                    case "Monday":
                    case "Tuesday":
                    case "Wednesday":
                    case "Thursday":
                    case "Friday":
                        System.out.printf("%.2f",2.50 * amount);
                        break;
                    case "Saturday":
                    case "Sunday":
                        System.out.printf("%.2f",2.70 * amount);
                        break;
                    default:
                        System.out.println("error");
                        break;
                }
                break;
            case "apple":
                switch (day){
                    case "Monday":
                    case "Tuesday":
                    case "Wednesday":
                    case "Thursday":
                    case "Friday":
                        System.out.printf("%.2f",1.20 * amount);
                        break;
                    case "Saturday":
                    case "Sunday":
                        System.out.printf("%.2f",1.25 * amount);
                        break;
                    default:
                        System.out.println("error");
                        break;
                }
                break;
            case "orange":
                switch (day){
                    case "Monday":
                    case "Tuesday":
                    case "Wednesday":
                    case "Thursday":
                    case "Friday":
                        System.out.printf("%.2f",0.85 * amount);
                        break;
                    case "Saturday":
                    case "Sunday":
                        System.out.printf("%.2f",0.90 * amount);
                        break;
                    default:
                        System.out.println("error");
                        break;
                }
                break;
            case "grapefruit":
                switch (day){
                    case "Monday":
                    case "Tuesday":
                    case "Wednesday":
                    case "Thursday":
                    case "Friday":
                        System.out.printf("%.2f",1.45 * amount);
                        break;
                    case "Saturday":
                    case "Sunday":
                        System.out.printf("%.2f",1.60 * amount);
                        break;
                    default:
                        System.out.println("error");
                        break;
                }
                break;
            case "kiwi":
                switch (day){
                    case "Monday":
                    case "Tuesday":
                    case "Wednesday":
                    case "Thursday":
                    case "Friday":
                        System.out.printf("%.2f",2.70 * amount);
                        break;
                    case "Saturday":
                    case "Sunday":
                        System.out.printf("%.2f",3.00 * amount);
                        break;
                    default:
                        System.out.println("error");
                        break;
                }
                break;
            case "pineapple":
                switch (day){
                    case "Monday":
                    case "Tuesday":
                    case "Wednesday":
                    case "Thursday":
                    case "Friday":
                        System.out.printf("%.2f",5.50 * amount);
                        break;
                    case "Saturday":
                    case "Sunday":
                        System.out.printf("%.2f",5.60 * amount);
                        break;
                    default:
                        System.out.println("error");
                        break;
                }
                break;
            case "grapes":
                switch (day){
                    case "Monday":
                    case "Tuesday":
                    case "Wednesday":
                    case "Thursday":
                    case "Friday":
                        System.out.printf("%.2f",3.85 * amount);
                        break;
                    case "Saturday":
                    case "Sunday":
                        System.out.printf("%.2f",4.20 * amount);
                        break;
                    default:
                        System.out.println("error");
                        break;
                }
                break;
            default:
                System.out.println("error");
                break;
        }
    }
}