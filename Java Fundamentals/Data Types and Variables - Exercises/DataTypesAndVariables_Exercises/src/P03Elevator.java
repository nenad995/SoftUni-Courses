import java.util.Scanner;

public class P03Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfPeople = Integer.parseInt(scanner.nextLine());
        int capacity = Integer.parseInt(scanner.nextLine());

        int courses = numberOfPeople / capacity;

        if (numberOfPeople % capacity != 0){
            courses++;
        }

        System.out.println(courses);
    }
}
