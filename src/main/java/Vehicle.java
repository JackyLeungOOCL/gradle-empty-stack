public class Vehicle {
    private String name;
    private String brand;
    private float speed;

    public Vehicle(String name, String brand) {
        this.name = name;
        this.brand = brand;
        speed = 0;
    }

    public void speedUp(float toSpeed) {
        speed = toSpeed;
        System.out.printf("Car %s in brand %s is in %.2f km/h\n", name, brand, speed);
    }
}