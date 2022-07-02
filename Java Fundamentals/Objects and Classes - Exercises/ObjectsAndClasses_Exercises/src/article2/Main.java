package article2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Article> articleList = new ArrayList<>();

        for (int i = 0; i < n; i++){
            String command = scanner.nextLine();

            String[] commandArr = command.split(", ");
            String articleTitle = commandArr[0];
            String articleContent = commandArr[1];
            String articleAuthor = commandArr[2];

            Article article = new Article(articleTitle, articleContent, articleAuthor);
            articleList.add(article);
        }

        String command = scanner.nextLine();
        if (command.equals("title") || command.equals("content") || command.equals("author")){
            for (Article article : articleList){
                String articleToString = article.toString();
                System.out.println(articleToString);
            }
        }

    }
}
