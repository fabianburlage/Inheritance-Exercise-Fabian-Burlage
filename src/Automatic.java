public class Automatic extends Car{

    protected boolean transmissionIsAutomatic;


    public Automatic(String brand,
                     int wheels,
                     boolean accelerate,
                     boolean breakVehicle,
                     boolean turnLeft,
                     boolean turnRight,
                     boolean transmission,
                     boolean transmissionIsAutomatic) {
        super(brand, wheels, accelerate, breakVehicle, turnLeft, turnRight, transmission);
        this.transmissionIsAutomatic = transmissionIsAutomatic;
    }

}
