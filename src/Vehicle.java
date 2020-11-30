public class Vehicle {

    protected String brand;
    protected int wheels;
    protected boolean accelerate;
    protected boolean breakVehicle;
    protected boolean turnLeft;
    protected boolean turnRight;


    public Vehicle(String brand,
                   int wheels,
                   boolean accelerate,
                   boolean breakVehicle,
                   boolean turnLeft,
                   boolean turnRight){

        this.brand = brand;
        this.wheels = wheels;
        this.accelerate = accelerate;
        this.breakVehicle = breakVehicle;
        this.turnLeft = turnLeft;
        this.turnRight = turnRight;


    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public boolean isAccelerate() {
        return accelerate;
    }

    public void setAccelerate(boolean accelerate) {
        this.accelerate = accelerate;
    }

    public boolean isBreakVehicle() {
        return breakVehicle;
    }

    public void setBreakVehicle(boolean breakVehicle) {
        this.breakVehicle = breakVehicle;
    }

    public boolean isTurnLeft() {
        return turnLeft;
    }

    public void setTurnLeft(boolean turnLeft) {
        this.turnLeft = turnLeft;
    }

    public boolean isTurnRight() {
        return turnRight;
    }

    public void setTurnRight(boolean turnRight) {
        this.turnRight = turnRight;
    }
}
