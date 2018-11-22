public class Bus extends Vehicle {
    public Bus(String name, String brand) {
        super(name, brand);
    }

    public void speedUp(float toSpeed) {
        System.out.println("__I am Bus__");
        if (toSpeed <= 80) {
            super.speedUp(toSpeed);
        } else {
            System.out.printf("%.2f km/h exceeds its speed limit 80 km/h. Cannot speed up.", toSpeed);
        }
    }
}
