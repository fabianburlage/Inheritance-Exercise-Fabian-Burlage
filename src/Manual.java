public class Manual extends Car{

    protected boolean transmissionIsManual;


    public Manual(String brand,
                  int wheels,
                  boolean accelerate,
                  boolean breakVehicle,
                  boolean turnLeft,
                  boolean turnRight,
                  boolean transmission,
                  boolean transmissionIsManual) {
        super(brand, wheels, accelerate, breakVehicle, turnLeft, turnRight, transmission);
        this.transmissionIsManual = transmissionIsManual;
    }

    public boolean isTransmissionIsManual() {
        return transmissionIsManual;
    }

    public void setTransmissionIsManual(boolean transmissionIsManual) {
        this.transmissionIsManual = transmissionIsManual;
    }
}
