package cardSuit;

public class Main {
    public static void main(String[] args) {

        System.out.println("Card Suits:");

        for (CardSuit cardSuit : CardSuit.values()){
            System.out.println("Ordinal value: " + cardSuit.ordinal() + "; Name value: " + cardSuit.name());
        }

    }
}
