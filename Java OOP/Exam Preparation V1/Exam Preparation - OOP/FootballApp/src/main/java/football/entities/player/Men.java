package football.entities.player;

public class Men extends BasePlayer {

    private final static double INITIAL_KG = 85.50;

    public Men(String name, String nationality, int strength) {
        super(name, nationality, INITIAL_KG, strength);
    }

    @Override
    public void stimulation() {
        setStrength(getStrength() + 145);
    }
}
