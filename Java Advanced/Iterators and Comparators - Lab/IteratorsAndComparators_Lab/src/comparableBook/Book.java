package comparableBook;

import java.util.Arrays;
import java.util.List;

public class Book implements Comparable<Book>{
    private String title;
    private int year;
    private List<String> authors;

    public Book(String title, int year, String... authors) {
        setTitle(title);
        setYear(year);
        setAuthors(authors);
    }

    public String getTitle() {
        return title;
    }

    private void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    private void setYear(int year) {
        this.year = year;
    }

    public List<String> getAuthors() {
        return authors;
    }

    private void setAuthors(String[] authors) {
        this.authors = Arrays.asList(authors);
    }

    @Override
    public int compareTo(Book o) {
        int result = this.getTitle().compareTo(o.getTitle());

        if (result == 0){
            result = Integer.compare(this.getYear(), o.getYear());
        }

        return result;
    }
}
