public class LargeTruck extends Truck{

    protected boolean largeTruck;


    public LargeTruck(String brand,
                      int wheels,
                      boolean accelerate,
                      boolean breakVehicle,
                      boolean turnLeft,
                      boolean turnRight,
                      boolean TruckSize,
                      boolean LargeTruck) {
        super(brand, wheels, accelerate, breakVehicle, turnLeft, turnRight, TruckSize);
        this.largeTruck = LargeTruck;
    }

    public boolean isLargeTruck() {
        return largeTruck;
    }

    public void setLargeTruck(boolean largeTruck) {
        this.largeTruck = largeTruck;
    }
}
