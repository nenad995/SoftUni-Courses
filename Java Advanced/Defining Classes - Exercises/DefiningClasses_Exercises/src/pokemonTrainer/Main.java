package pokemonTrainer;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        Map<String, Trainer> competitors = new LinkedHashMap<>();

        while (!command.equals("Tournament")){
            String[] commandData = command.split("\\s+");
            String trainerName = commandData[0];
            String pokemonName = commandData[1];
            String pokemonElement = commandData[2];
            int pokemonHealth = Integer.parseInt(commandData[3]);

            Pokemon pokemon = new Pokemon(pokemonName, pokemonElement, pokemonHealth);
            Trainer trainer = null;

            if (competitors.containsKey(trainerName)){
                trainer = competitors.get(trainerName);
            } else {
                trainer = new Trainer(trainerName);
                competitors.put(trainerName, trainer);
            }

            trainer.getPokemons().add(pokemon);

            command = scanner.nextLine();
        }

        String element = scanner.nextLine();

        while (!element.equals("End")){
            for (Map.Entry<String, Trainer> entry : competitors.entrySet()) {
                entry.getValue().checkElement(entry.getValue().getPokemons(), element);
            }

            element = scanner.nextLine();
        }

        competitors.entrySet().stream()
                .sorted((first, second) -> second.getValue().getBadges() - first.getValue().getBadges())
                .forEach(e -> System.out.println(e.getKey() + " " + e.getValue().getBadges() + " "
                        + e.getValue().getPokemons().size()));

    }
}
