package p04HotelReservation;

public enum DiscountType {
    VIP("VIP", 20),
    SECONDVISIT("SecondVisit", 10),
    NONE("None", 0);

    private String name;
    private double percent;

    DiscountType(String name, double percent) {
        this.name = name;
        this.percent = percent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPercent() {
        return percent;
    }

    public void setPercent(int percent) {
        this.percent = percent;
    }
}
