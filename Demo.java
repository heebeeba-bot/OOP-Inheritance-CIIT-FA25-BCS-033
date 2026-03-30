public class Demo {
    public static void main(String[] args) {

        // Object of Base Class
        Appliance a = new Appliance("Haier", 500);
        System.out.println("=== Appliance ===");
        a.display();
        System.out.println(a.toString());
        a.turnOn();
        a.turnOff();

        System.out.println();

        // Object of Intermediate Class
        WashingMachine wm = new WashingMachine("LG", 800, 7, "Normal, Quick");
        System.out.println("=== Washing Machine ===");
        wm.display();
        System.out.println(wm.toString());
        wm.turnOn();
        wm.startWash();
        wm.stopWash();
        wm.turnOff();

        System.out.println();

        // Object of Derived Class
        SmartWashingMachine swm = new SmartWashingMachine("Samsung", 1000, 9,
                "Auto, Eco", true, true);

        System.out.println("=== Smart Washing Machine ===");
        swm.display();
        System.out.println(swm.toString());
        swm.turnOn();
        swm.startWash();
        swm.connectWifi();
        swm.controlFromApp();
        swm.stopWash();
        swm.turnOff();
    }
}