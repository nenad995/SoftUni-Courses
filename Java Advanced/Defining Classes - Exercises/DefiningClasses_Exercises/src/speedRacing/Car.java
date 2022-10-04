package speedRacing;

public class Car {
    private String model;
    private double fuelAmount;
    private double fuelConsumption;
    private int travelledDistance;

    public Car(String model, double fuelAmount, double fuelConsumption) {
        this.model = model;
        this.fuelAmount = fuelAmount;
        this.fuelConsumption = fuelConsumption;
        this.travelledDistance = 0;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getFuelAmount() {
        return fuelAmount;
    }

    public void setFuelAmount(double fuelAmount) {
        this.fuelAmount = fuelAmount;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public int getTravelledDistance() {
        return travelledDistance;
    }

    public void setTravelledDistance(int travelledDistance) {
        this.travelledDistance = travelledDistance;
    }

    @Override
    public String toString() {
        return String.format("%s %.2f %d", this.model, this.fuelAmount, this.travelledDistance);
    }

    public double calculateRequiredFuel(int distance){
        return this.fuelConsumption * distance;
    }

    public boolean hasEnoughFuel(int distance){
        return this.fuelAmount >= calculateRequiredFuel(distance);
    }

    public void drive(int distance){
        if (hasEnoughFuel(distance)){
            this.fuelAmount -= calculateRequiredFuel(distance);
            this.travelledDistance += distance;
        } else {
            System.out.println("Insufficient fuel for the drive");

        }
    }

}
