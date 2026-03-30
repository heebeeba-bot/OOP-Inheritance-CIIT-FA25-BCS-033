public class WashingMachine extends Appliance {

    protected int capacity;
    protected String washModes;

    // Parameterized constructor
    public WashingMachine(String brand, int powerRating, int capacity, String washModes) {
        super(brand, powerRating); // constructor chaining
        this.capacity = capacity;
        this.washModes = washModes;
    }

    // Override display()
    @Override
    public void display() {
        super.display(); // calling parent method
        System.out.println("Capacity: " + capacity + "kg");
        System.out.println("Wash Modes: " + washModes);
    }

    // Override toString()
    @Override
    public String toString() {
        return super.toString() + ", Capacity: " + capacity + "kg, Wash Modes: " + washModes;
    }

    // Functional Methods
    public void startWash() {
        System.out.println("Washing started...");
    }

    public void stopWash() {
        System.out.println("Washing stopped.");
    }
}