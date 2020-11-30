public class CrossCountryBike extends Bike{

    protected boolean crossCountryBike;

    public CrossCountryBike(String brand,
                            int wheels,
                            boolean accelerate,
                            boolean breakVehicle,
                            boolean turnLeft,
                            boolean turnRight,
                            boolean BikeType,
                            boolean CrossCountryBike) {
        super(brand, wheels, accelerate, breakVehicle, turnLeft, turnRight, BikeType);
        this.crossCountryBike = CrossCountryBike;
    }

    public boolean isCrossCountryBike() {
        return crossCountryBike;
    }

    public void setCrossCountryBike(boolean crossCountryBike) {
        this.crossCountryBike = crossCountryBike;
    }
}
