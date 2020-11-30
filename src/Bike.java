public class Bike extends Vehicle {

    protected boolean bikeType;

    public Bike(String brand,
                int wheels,
                boolean accelerate,
                boolean breakVehicle,
                boolean turnLeft,
                boolean turnRight,
                boolean bikeType) {
        super(brand, wheels, accelerate, breakVehicle, turnLeft, turnRight);
        this.bikeType = bikeType;
    }

    public boolean isBikeType() {
        return bikeType;
    }

    public void setBikeType(boolean bikeType) {
        this.bikeType = bikeType;
    }
}
