package lab9.rekordy;

public record Car(
        String brand,
        String model,
        double fuelConsumptionPer100km
) {

    public double fuelCost(double fuelPrice, double distance) {
        double burned = distance / 100 * fuelConsumptionPer100km;
        return burned * fuelPrice;
    }
}
