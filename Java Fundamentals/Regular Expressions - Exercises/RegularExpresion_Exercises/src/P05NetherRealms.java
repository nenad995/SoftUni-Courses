import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class P05NetherRealms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> demonNameList = Arrays.stream(scanner.nextLine().split("\\s*,\\s*")).collect(Collectors.toList());

        Pattern healthPattern = Pattern.compile("[^0-9+\\-*\\/.]");
        Pattern damagePattern = Pattern.compile("\\-?\\+?[0-9]+[\\.]?[0-9]*");

        for (String demon : demonNameList){
            StringBuilder demonHealth = new StringBuilder();
            Matcher healthMatcher = healthPattern.matcher(demon);
            //Extract symbols to calculate HP and store them in demonHealth
            while (healthMatcher.find()){
                demonHealth.append(healthMatcher.group());
            }

            int demonHP = 0;
            //Calculate demonHP
            for (char ch : demonHealth.toString().toCharArray()){
                demonHP += ch;
            }

            Matcher damageMatcher = damagePattern.matcher(demon);
            double demonDMG = 0;
            //Extract demon damage without multipliers
            while (damageMatcher.find()){
                demonDMG += Double.parseDouble(damageMatcher.group());
            }
            //Check for multipliers and apply them
            for (char ch : demon.toCharArray()){
                if (ch == '*'){
                    demonDMG *= 2;
                }

                if (ch == '/'){
                    demonDMG /= 2;
                }
            }
            //Print information about the demon
            System.out.printf("%s - %d health, %.2f damage%n", demon, demonHP, demonDMG);
        }
    }
}
