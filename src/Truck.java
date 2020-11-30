public class Truck extends Vehicle{

    protected boolean truckType;

    public Truck(String brand,
                 int wheels,
                 boolean accelerate,
                 boolean breakVehicle,
                 boolean turnLeft,
                 boolean turnRight,
                 boolean TruckType) {
        super(brand, wheels, accelerate, breakVehicle, turnLeft, turnRight);
        this.truckType = TruckType;
    }

    public boolean isTruckType() {
        return truckType;
    }

    public void setTruckType(boolean truckType) {
        this.truckType = truckType;
    }
}
