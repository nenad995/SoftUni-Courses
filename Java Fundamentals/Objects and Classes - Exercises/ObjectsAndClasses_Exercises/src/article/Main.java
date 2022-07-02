package article;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> articleList = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());
        Article article = new Article(articleList.get(0), articleList.get(1), articleList.get(2));

        int n = Integer.parseInt(scanner.nextLine());
        int i = 0;

        while (i < n){
            String command = scanner.nextLine();

            String[] commandArr = command.split(": ");
            String commandType = commandArr[0];

            switch (commandType){
                case "Edit":
                    String newContent = commandArr[1];
                    article.edit(newContent);
                    break;
                case "ChangeAuthor":
                    String newAuthor = commandArr[1];
                    article.changeAuthor(newAuthor);
                    break;
                case "Rename":
                    String newTitle = commandArr[1];
                    article.rename(newTitle);
                    break;
            }

            i++;
        }

        String finalArticle = article.toString();
        System.out.println(finalArticle);

    }
}
