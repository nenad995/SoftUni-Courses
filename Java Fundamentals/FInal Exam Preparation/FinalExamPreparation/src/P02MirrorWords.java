import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02MirrorWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Pattern pattern = Pattern.compile("([@#])([A-Za-z]{3,})(\\1{2})([A-Za-z]{3,})(\\1)");
        Matcher matcher = pattern.matcher(input);

        List<String> pairs = new ArrayList<>();

        while (matcher.find()){
            pairs.add(matcher.group());
        }

        List<String> mirrorWords = new ArrayList<>();

        if (pairs.size() > 0){
            for (String element : pairs){
                char[] eachElement = element.toCharArray();
                boolean isEqual = true;

                for (int i = 0; i < eachElement.length / 2; i++){

                    char leftSide = eachElement[i];
                    char rightSide = eachElement[eachElement.length - 1 - i];

                    if (leftSide != rightSide){
                        isEqual = false;
                        break;
                    }
                }

                if (isEqual){
                   mirrorWords.add(element);
                }
            }
        }

        if (pairs.size() > 0){
            System.out.println(pairs.size() + " word pairs found!");

            if (mirrorWords.size() > 0){
                System.out.println("The mirror words are:");

                Pattern pattern1 = Pattern.compile("[@#]([A-Za-z]+)[@#]{2}([A-Za-z]+)[@#]");

                for (int i = 0; i < mirrorWords.size(); i++){
                    String checkWord = mirrorWords.get(i);
                    Matcher matcher1 = pattern1.matcher(checkWord);

                    String leftWord = "";
                    String rightWord = "";

                    while (matcher1.find()){
                        leftWord = matcher1.group(1);
                        rightWord = matcher1.group(2);
                    }
                    if (i < mirrorWords.size() - 1){
                        System.out.printf("%s <=> %s, ",leftWord, rightWord);
                    } else {
                        System.out.print(leftWord + " <=> " + rightWord);
                    }
                }
            } else {
                System.out.println("No mirror words!");
            }
        } else {
            System.out.println("No word pairs found!");
            System.out.println("No mirror words!");
        }
    }
}
