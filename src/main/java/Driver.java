public class Driver {
    private Vehicle vehicle;
    private String name;

    public Driver(Vehicle vehicle, String name) {
        this.vehicle = vehicle;
        this.name = name;
    }

    public void speedUp(float toSpeed) {
        System.out.printf("Driver %s\n", name);
        vehicle.speedUp(toSpeed);
    }
}
