package catLady;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Cat> cats = new HashMap<>();

        String input = scanner.nextLine();

        while (!input.equals("End")){
            String[] catInfo = input.split("\\s+");

            String catBreed = catInfo[0];
            String catName = catInfo[1];

            Cat cat = null;

            switch (catBreed){
                case "Siamese":
                    double earSize = Double.parseDouble(catInfo[2]);
                    cat = new Siamese(catName, earSize);
                    break;
                case "Cymric":
                    double furLength = Double.parseDouble(catInfo[2]);
                    cat = new Cymric(catName, furLength);
                    break;
                case "StreetExtraordinaire":
                    double decibelsOfMeow = Double.parseDouble(catInfo[2]);
                    cat = new StreetExtraordinaire(catName, decibelsOfMeow);
                    break;
            }

            cats.put(catName, cat);

            input = scanner.nextLine();
        }

        String catNameToSearch = scanner.nextLine();

        if (cats.containsKey(catNameToSearch)){
            System.out.println(cats.get(catNameToSearch));
        }
    }
}
