public class Bike extends Vehicle {

    protected boolean bikeType;

    public Bike(String brand,
                int wheels,
                boolean accelerate,
                boolean breakVehicle,
                boolean turnLeft,
                boolean turnRight,
                boolean BikeType) {
        super(brand, wheels, accelerate, breakVehicle, turnLeft, turnRight);
        this.bikeType = BikeType;
    }

    public boolean isBikeType() {
        return bikeType;
    }

    public void setBikeType(boolean bikeType) {
        this.bikeType = bikeType;
    }
}
