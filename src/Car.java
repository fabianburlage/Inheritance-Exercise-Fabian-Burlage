public class Car extends Vehicle{

    protected boolean transmission;


    public Car(String brand,
               int wheels,
               boolean accelerate,
               boolean breakVehicle,
               boolean turnLeft,
               boolean turnRight,
               boolean transmission) {
        super(brand, wheels, accelerate, breakVehicle, turnLeft, turnRight);
        this.transmission = transmission;

    }

    public boolean isTransmission() {
        return transmission;
    }

    public void setTransmission(boolean transmission) {
        this.transmission = transmission;
    }
}
