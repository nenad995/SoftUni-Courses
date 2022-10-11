package genericArrayCreator;

public class Main {
    public static void main(String[] args) {

        Integer[] numbers = ArrayCreator.create(5, 13);
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }
    }
}
