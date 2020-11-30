public class RegularBike extends Bike{

    protected boolean regularBike;

    public RegularBike(String brand,
                       int wheels,
                       boolean accelerate,
                       boolean breakVehicle,
                       boolean turnLeft,
                       boolean turnRight,
                       boolean bikeType,
                       boolean regularBike) {
        super(brand, wheels, accelerate, breakVehicle, turnLeft, turnRight, bikeType);
        this.regularBike = regularBike;
    }

    public boolean isRegularBike() {
        return regularBike;
    }

    public void setRegularBike(boolean regularBike) {
        this.regularBike = regularBike;
    }
}
