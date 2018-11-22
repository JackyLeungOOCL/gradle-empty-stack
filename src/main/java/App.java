/*
 * This Java source file was generated by the Gradle 'init' task.
 */
public class App {
    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) {

        System.out.println(new App().getGreeting());

        Vehicle vehicleA = new Vehicle("A", "Audi");
        vehicleA.speedUp(30);

        Vehicle vehicleB = new Vehicle("B", "BMW");
        vehicleB.speedUp(50);

        Car carA = new Car("C", "NewCar");
        carA.speedUp(200);
        carA.speedUp(201);

        Vehicle bus = new Bus("My bus", "OOCL");
        bus.speedUp(70);
        bus.speedUp(100);

        Driver tommy = new Driver(vehicleA, "Tommy");
        tommy.speedUp(50);

        Driver jacky = new Driver(vehicleB, "Jacky");
        jacky.speedUp(111);

        Driver baby = new Driver(bus, "Baby");
        baby.speedUp(666);
    }
}