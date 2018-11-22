public class Car extends Vehicle {
    public Car(String name, String brand) {
        super(name, brand);
    }

    public void speedUp(float toSpeed) {
        if (toSpeed <= 200) {
            super.speedUp(toSpeed);
        } else {
            System.out.printf("%.2f km/h exceeds its speed limit 200 km/h. Cannot speed up.", toSpeed);
        }
    }
}
