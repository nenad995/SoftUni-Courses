import java.util.ArrayDeque;
import java.util.Scanner;

public class P05BalancedParentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String expression = scanner.nextLine();
        ArrayDeque<Character> openingParentheses = new ArrayDeque<>();
        boolean isEqual = true;

        if (expression.length() % 2 == 0){
            for (int i = 0; i < expression.length(); i++) {

                char ch = expression.charAt(i);

                if (ch == '(' || ch == '[' || ch == '{') {
                    openingParentheses.push(ch);
                } else {
                    char lastOpeningParentheses = openingParentheses.pop();

                    if (lastOpeningParentheses == '(' && ch != ')') {
                        isEqual = false;
                    } else if (lastOpeningParentheses == '[' && ch != ']') {
                        isEqual = false;
                    } else if (lastOpeningParentheses == '{' && ch != '}') {
                        isEqual = false;
                        break;
                    }
                }
            }
        } else {
            isEqual = false;
        }

        if (isEqual) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
