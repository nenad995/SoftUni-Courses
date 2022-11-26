package vehicles;

public class Car extends VehicleImpl {

    public final static double AC_ADDITIONAL_CONSUMPTION = 0.9;

    public Car(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(fuelQuantity, fuelConsumption, tankCapacity, AC_ADDITIONAL_CONSUMPTION);
    }

}
