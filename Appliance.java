public class Appliance {

    // Protected attributes
    protected String brand;
    protected int powerRating;

    // Parameterized constructor
    public Appliance(String brand, int powerRating) {
        this.brand = brand;
        this.powerRating = powerRating;
    }

    // Core Methods
    public void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Power Rating: " + powerRating + "W");
    }

    public String toString() {
        return "Brand: " + brand + ", Power Rating: " + powerRating + "W";
    }

    // Functional Methods
    public void turnOn() {
        System.out.println(brand + " appliance is ON");
    }

    public void turnOff() {
        System.out.println(brand + " appliance is OFF");
    }
}