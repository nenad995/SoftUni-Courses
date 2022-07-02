package article2;

public class Article {
        private String title;
        private String content;
        private String author;

        public Article(String title, String content, String author) {
            this.title = title;
            this.content = content;
            this.author = author;
        }

        @Override
        public String toString() {
            return this.title + " - " + this.content + ": " + this.author;
        }
}
