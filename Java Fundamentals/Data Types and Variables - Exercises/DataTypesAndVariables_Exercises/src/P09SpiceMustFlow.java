import java.util.Scanner;

public class P09SpiceMustFlow {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      int source = Integer.parseInt(scanner.nextLine());

      int days = 0;
      int total = 0;

      while (source >= 100) {
         int spices = source - 26;
         total = total + spices;
         days++;
         source -= 10;
      }

      System.out.println(days);

      if (total >= 26){
         total -= 26;
      }
      System.out.println(total);
   }
}
