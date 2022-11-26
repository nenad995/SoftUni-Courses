package vehicles;

public class Truck extends VehicleImpl {

    public final static double AC_ADDITIONAL_CONSUMPTION = 1.6;
    public final static double FUEL_MULTIPLIER = 0.95;

    public Truck(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(fuelQuantity, fuelConsumption, tankCapacity, AC_ADDITIONAL_CONSUMPTION);
    }

    @Override
    public void refuel(double amount) {
        super.refuel(amount * FUEL_MULTIPLIER);
    }
}
