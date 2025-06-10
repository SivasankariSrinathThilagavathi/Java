interface PollutionControl {
    void checkEmission();
}
abstract class Vehicle implements PollutionControl {
    abstract void fuelType();

    void start() {
        System.out.println("Vehicle is starting...");
    }
}
class Car extends Vehicle {
    @Override
    void fuelType() {
        System.out.println("Car runs on petrol.");
    }

    @Override
    public void checkEmission() {
        System.out.println("Car emission check: Passed.");
    }
}
class Bike extends Vehicle {
    @Override
    void fuelType() {
        System.out.println("Bike runs on diesel.");
    }

    @Override
    public void checkEmission() {
        System.out.println("Bike emission check: Passed.");
    }
}
public class Q3{
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle bike = new Bike();
        System.out.println("Car Details:");
        car.start();
        car.fuelType();
        car.checkEmission();
        System.out.println("\nBike Details:");
        bike.start();
        bike.fuelType();
        bike.checkEmission();
    }
}
