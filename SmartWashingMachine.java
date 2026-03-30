public class SmartWashingMachine extends WashingMachine {

    protected boolean wifiEnabled;
    protected boolean appControl;

    // Parameterized constructor
    public SmartWashingMachine(String brand, int powerRating, int capacity, String washModes,
                               boolean wifiEnabled, boolean appControl) {
        super(brand, powerRating, capacity, washModes); // constructor chaining
        this.wifiEnabled = wifiEnabled;
        this.appControl = appControl;
    }

    // Override display()
    @Override
    public void display() {
        super.display(); // calling parent method
        System.out.println("WiFi Enabled: " + wifiEnabled);
        System.out.println("App Control: " + appControl);
    }

    // Override toString()
    @Override
    public String toString() {
        return super.toString() + ", WiFi: " + wifiEnabled + ", App Control: " + appControl;
    }

    // Functional Methods
    public void connectWifi() {
        if (wifiEnabled) {
            System.out.println("Connected to WiFi.");
        } else {
            System.out.println("WiFi not available.");
        }
    }

    public void controlFromApp() {
        if (appControl) {
            System.out.println("Controlling via mobile app.");
        } else {
            System.out.println("App control not supported.");
        }
    }
}