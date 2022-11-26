package vehicles;

import java.text.DecimalFormat;

public abstract class VehicleImpl implements Vehicle {

    private double fuelQuantity;
    private double fuelConsumption;
    private double tankCapacity;
    private double additionalAcConsumption;

    public VehicleImpl(double fuelQuantity, double fuelConsumption, double tankCapacity, double additionalAcConsumption) {
        this.fuelQuantity = fuelQuantity;
        this.fuelConsumption = fuelConsumption;
        this.tankCapacity = tankCapacity;
        this.additionalAcConsumption = additionalAcConsumption;
    }

    public double getFuelQuantity() {
        return fuelQuantity;
    }

    public void setFuelQuantity(double fuelQuantity) {
        if (fuelQuantity > 0){
            this.fuelQuantity = fuelQuantity;
        } else {
            System.out.println("Fuel must be a positive number");
        }
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public double getTankCapacity() {
        return tankCapacity;
    }

    public void setTankCapacity(double tankCapacity) {
        this.tankCapacity = tankCapacity;
    }

    @Override
    public String drive(double distance) {
        double fuelRequired = distance * getFuelConsumption();

        DecimalFormat decimalFormat = new DecimalFormat("0.##");

        if (fuelRequired <= getFuelQuantity()){
            setFuelQuantity(getFuelQuantity() - fuelRequired);

            return getClass().getSimpleName() + " travelled " + decimalFormat.format(distance) + " km";
        }
            return getClass().getSimpleName() + " needs refueling";
    }

    @Override
    public String driveWithAC(double distance){
        setFuelConsumption(getFuelConsumption() + additionalAcConsumption);
        String result = this.drive(distance);
        setFuelConsumption(getFuelConsumption() - additionalAcConsumption);
        return result;

    }

    @Override
    public void refuel(double amount){

        if (amount <= 0){
            System.out.println("Fuel must be a positive number");
        } else {
            double totalFuel = this.fuelQuantity + amount;

            if (totalFuel > this.tankCapacity){
                System.out.println("Cannot fit fuel in tank");
            } else {
                setFuelQuantity(totalFuel);
            }
        }
    }

    @Override
    public String toString() {
        return String.format("%s: %.2f", this.getClass().getSimpleName(), getFuelQuantity());
    }
}
