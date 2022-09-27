import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class P04CountCharacterTypes {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("resources/input.txt");
        PrintWriter printWriter = new PrintWriter("output.txt");

        int vowels = 0;
        int consonants = 0;
        int punctuation = 0;

        int oneByte = fileReader.read();

        while (oneByte >= 0){
            char symbol = (char) oneByte;

            if (isVowel(symbol)) {
                vowels++;
            } else if (isPunctuation(symbol)){
                punctuation++;
            } else if (!Character.isWhitespace(symbol)){
                consonants++;
            }

            oneByte = fileReader.read();
        }

        fileReader.close();

        printWriter.println("Vowels: " + vowels);
        printWriter.println("Consonants: " + consonants);
        printWriter.println("Punctuation: " + punctuation);

        printWriter.close();
    }

    private static boolean isPunctuation(char symbol) {
        return symbol == '!' || symbol == '?' || symbol == '.' || symbol == ',';
    }

    private static boolean isVowel(char symbol) {
        return symbol == 'a' || symbol == 'e' || symbol == 'i' || symbol == 'o' || symbol == 'u';
    }
}
