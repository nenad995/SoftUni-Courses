package pokemonTrainer;

import java.util.ArrayList;
import java.util.List;

public class Trainer {
    private String name;
    private int badges;
    private List<Pokemon> pokemons;

    public Trainer(String name) {
        this.name = name;
        this.badges = 0;
        this.pokemons = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBadges() {
        return badges;
    }

    public void setBadges(int badges) {
        this.badges = badges;
    }

    public List<Pokemon> getPokemons() {
        return pokemons;
    }

    public void setPokemons(List<Pokemon> pokemons) {
        this.pokemons = pokemons;
    }

    public void checkElement(List<Pokemon> pokemons, String element){
        boolean hasElement = false;
        for (Pokemon pokemon : pokemons){
            if (pokemon.getElement().equals(element)){
                hasElement = true;
                break;
            }
        }

        if (!hasElement){
            for (int i = pokemons.size() - 1; i >= 0; i--){
                Pokemon pokemon = pokemons.get(i);
                pokemon.setHealth(pokemon.getHealth() - 10);
                if (pokemon.getHealth() <= 0){
                    pokemons.remove(pokemon);
                }
            }
        } else {
            this.badges += 1;
        }
    }
}
