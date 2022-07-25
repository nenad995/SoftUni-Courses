import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P04StarEnigma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Pattern pattern = Pattern.compile("@(?<planetName>[A-Z][a-z]+)[^@!:>-]*?:(?<planetPopulation>[0-9]+)[^@!:>-]*?!(?<attackType>A|D)![^@!:>-]*?->(?<soldiersCount>[0-9]+)");

        Map<String, String> attackPlan = new TreeMap<>();

        for (int i = 0; i < n; i++){
            String encryptedMessage = scanner.nextLine();

            int count = 0; //Counter for letters 's','t','a','r'
            for (int j = 0; j < encryptedMessage.length(); j++){
                char ch = encryptedMessage.toLowerCase().charAt(j); //check letter (case insensitive)

                if (ch == 's' || ch == 't' || ch == 'a' || ch == 'r'){
                    count++;
                }
            }

            //Decrypt the message
            StringBuilder decryptedMessage = new StringBuilder();

            for (char ch : encryptedMessage.toCharArray()){
                char decryptedChar = (char) (ch - count);
                decryptedMessage.append(decryptedChar);
            }

            Matcher matcher = pattern.matcher(decryptedMessage);

            while (matcher.find()){
                String planetName = matcher.group("planetName");
                String attackType = matcher.group("attackType");
                attackPlan.put(planetName, attackType);
            }

            //Extract the planet and attack type
            //If attack type is A
            //Store planet in attackedPlanets list
            //If attack type is D
            //Store planet in destroyedPlanets list
        }

        List<String> attackedPlanets = new ArrayList<>();
        List<String> destroyedPlanets = new ArrayList<>();

        for (Map.Entry<String, String> entry : attackPlan.entrySet()) {
            if (entry.getValue().equals("A")){
                attackedPlanets.add(entry.getKey());
            } else if (entry.getValue().equals("D")){
                destroyedPlanets.add(entry.getKey());
            }
        }

        //Order attackedPlanets list and print
        System.out.println("Attacked planets: " + attackedPlanets.size());
        for (String planetName : attackedPlanets){
            System.out.println("-> " + planetName);
        }
        //Order destroyedPlanets list and print
        System.out.println("Destroyed planets: " + destroyedPlanets.size());
        for (String planetName : destroyedPlanets){
            System.out.println("-> " + planetName);
        }
    }
}
