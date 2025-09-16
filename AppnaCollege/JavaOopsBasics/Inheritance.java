// Base Class
class Vehicle {
    String numberOfVehicle;
    public Vehicle(String numberOfVehicle){
        this.numberOfVehicle = numberOfVehicle;
    }

    public void honk(){
        System.out.println("Honk!!!!!!!!!!");
    }

    public void printNumberOfVehicle(){
        System.out.println(numberOfVehicle);
    }
}


// Derived classes
class Car extends Vehicle {
    private String numberOfCar;

    public Car(String numberOfCar){
        super(numberOfCar);
    }

    @Override
    public void honk(){
        System.out.println("Give me way!!!");
    }
}

// Derived classes
class Bus extends Vehicle {
    private String numberOfBus;

    public Bus(String numberOfBus){
        super(numberOfBus);
    }
}


public class Inheritance {
    public static void main(String[] args) {
        Car car = new Car("OD05BW3289");
        car.printNumberOfVehicle();
        car.honk();

        Bus bus = new Bus("OD04BW6005");
        bus.printNumberOfVehicle();
        car.honk();
    }
}
