public class PickUpTruck extends Truck{

    protected boolean pickUpTruck;

    public PickUpTruck(String brand,
                       int wheels,
                       boolean accelerate,
                       boolean breakVehicle,
                       boolean turnLeft,
                       boolean turnRight,
                       boolean TruckSize,
                       boolean PickUpTruck) {
        super(brand, wheels, accelerate, breakVehicle, turnLeft, turnRight, TruckSize);
        this.pickUpTruck = PickUpTruck;
    }

    public boolean isPickUpTruck() {
        return pickUpTruck;
    }

    public void setPickUpTruck(boolean pickUpTruck) {
        this.pickUpTruck = pickUpTruck;
    }
}
