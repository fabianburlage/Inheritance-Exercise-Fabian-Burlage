public class PickUpTruck extends Truck{

    protected boolean pickUpTruck;

    public PickUpTruck(String brand,
                       int wheels,
                       boolean accelerate,
                       boolean breakVehicle,
                       boolean turnLeft,
                       boolean turnRight,
                       boolean truckSize,
                       boolean pickUpTruck) {
        super(brand, wheels, accelerate, breakVehicle, turnLeft, turnRight, truckSize);
        this.pickUpTruck = pickUpTruck;
    }

    public boolean isPickUpTruck() {
        return pickUpTruck;
    }

    public void setPickUpTruck(boolean pickUpTruck) {
        this.pickUpTruck = pickUpTruck;
    }
}
