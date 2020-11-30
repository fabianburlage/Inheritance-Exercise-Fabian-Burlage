public class RegularBike extends Bike{

    protected boolean regularBike;

    public RegularBike(String brand,
                       int wheels,
                       boolean accelerate,
                       boolean breakVehicle,
                       boolean turnLeft,
                       boolean turnRight,
                       boolean BikeType,
                       boolean RegularBike) {
        super(brand, wheels, accelerate, breakVehicle, turnLeft, turnRight, BikeType);
        this.regularBike = RegularBike;
    }

    public boolean isRegularBike() {
        return regularBike;
    }

    public void setRegularBike(boolean regularBike) {
        this.regularBike = regularBike;
    }
}
