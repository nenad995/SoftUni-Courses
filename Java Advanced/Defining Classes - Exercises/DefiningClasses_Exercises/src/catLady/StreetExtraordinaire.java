package catLady;

public class StreetExtraordinaire extends Cat{
    private double decibelsOfMeow;

    public StreetExtraordinaire(String name, double decibelsOfMeow) {
        super(name);
        this.decibelsOfMeow = decibelsOfMeow;
    }

    public double getDecibelsOfMeow() {
        return decibelsOfMeow;
    }

    public void setDecibelsOfMeow(double decibelsOfMeow) {
        this.decibelsOfMeow = decibelsOfMeow;
    }

    @Override
    public String toString() {
        return String.format("%s %s %.2f", "StreetExtraordinaire", getName(), this.decibelsOfMeow);
    }
}
