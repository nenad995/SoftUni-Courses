package jediGalaxy;

public class Galaxy {
    private Field field;
    private Jedi jedi;
    private EvilForce evilForce;

    public Galaxy(Field field, Jedi jedi) {
        this.field = field;
        this.jedi = jedi;
        evilForce = new EvilForce();
    }

    public int moveJedi() {
        return jedi.move(field);
    }

    public void moveEvil(int rowEvil, int colEvil) {
        evilForce.move(rowEvil, colEvil, field);
    }
}
