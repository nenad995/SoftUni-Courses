package p04HotelReservation;

public class PriceCalculator {

    public static double calculateHolidayPrice(double pricePerDay, int numberOfDays, Season season, DiscountType discountType){
        double priceForAllDays = pricePerDay * numberOfDays;

        priceForAllDays = priceForAllDays * season.getMultiplier();

        priceForAllDays = priceForAllDays - (priceForAllDays * (discountType.getPercent() / 100));

        return priceForAllDays;
    }
}
