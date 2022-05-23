import java.util.Scanner;

public class P01OldBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String searchBook = scanner.nextLine();
        String input = scanner.nextLine();
        int bookCount = 0;

        boolean wasFound = false;

        while (!input.equals("No More Books")){

            if (input.equals(searchBook)){
                wasFound = true;
                break;
            }

            bookCount ++;
            input = scanner.nextLine();
        }

        if (wasFound){
            System.out.printf("You checked %d books and found it.", bookCount);
        } else {
            System.out.printf("The book you search is not here!%nYou checked %d books.", bookCount);
        }
    }
}
