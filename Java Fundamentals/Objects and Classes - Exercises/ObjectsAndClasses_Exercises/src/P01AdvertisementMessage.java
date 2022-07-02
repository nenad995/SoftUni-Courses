import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class P01AdvertisementMessage {

    static List<String> phrase = new ArrayList<>();
    static List<String> events = new ArrayList<>();
    static List<String> authors = new ArrayList<>();
    static List<String> cities = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        phrase.add("Excellent product.");
        phrase.add("Such a great product.");
        phrase.add("I always use that product.");
        phrase.add("Best product of its category.");
        phrase.add("Exceptional product.");
        phrase.add("I can't live without this product.");

        events.add("Now I feel good.");
        events.add("I have succeeded with this product.");
        events.add("Makes miracles. I am happy of the results!.");
        events.add("I cannot believe but now I feel awesome.");
        events.add("Try it yourself, I am very satisfied.");
        events.add("I feel great!");

        authors.add("Diana");
        authors.add("Petya");
        authors.add("Stella");
        authors.add("Elena");
        authors.add("Katya");
        authors.add("Iva");
        authors.add("Annie");
        authors.add("Eva");

        cities.add("Burgas");
        cities.add("Sofia");
        cities.add("Plovdiv");
        cities.add("Varna");
        cities.add("Ruse");

        int n = Integer.parseInt(scanner.nextLine());
        Random random = new Random();

        for (int i = 0; i < n; i++){

            int randomPhrase = random.nextInt(6);
            int randomEvent = random.nextInt(6);
            int randomAuthor = random.nextInt(8);
            int randomCity = random.nextInt(5);

            System.out.println(phrase.get(randomPhrase) + " " + events.get(randomEvent) + " "
                    + authors.get(randomAuthor) + " - " + cities.get(randomCity));
        }
    }
}
