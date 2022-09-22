import java.util.ArrayDeque;
import java.util.Scanner;

public class P02SimpleCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String expression = scanner.nextLine();
        String[] expressionElements = expression.split("\\s+");

        ArrayDeque<Integer> numbers = new ArrayDeque<>();
        ArrayDeque<String> operators = new ArrayDeque<>();

        for (int i = expressionElements.length - 1; i >= 0; i--) {

            if (!expressionElements[i].equals("+") && !expressionElements[i].equals("-")) {
                numbers.push(Integer.parseInt(expressionElements[i]));
            } else {
                operators.push(expressionElements[i]);
            }

        }

        int result = numbers.pop();

        for (String operator : operators) {

            int currentNum = numbers.pop();

            if (operator.equals("+")) {
                result = result + currentNum;
            } else {
                result = result - currentNum;
            }
        }

        System.out.println(result);
    }
}
