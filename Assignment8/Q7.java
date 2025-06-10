interface Switchable {
    void turnOn();
    void turnOff();
}

interface Configurable {
    void setBrightness(int level);
    void setColor(String color);
}

class SmartBulb implements Switchable, Configurable {
    private boolean isOn;
    private int brightness;
    private String color;

    @Override
    public void turnOn() {
        isOn = true;
        System.out.println("SmartBulb is now ON.");
    }

    @Override
    public void turnOff() {
        isOn = false;
        System.out.println("SmartBulb is now OFF.");
    }

    @Override
    public void setBrightness(int level) {
        brightness = level;
        System.out.println("Brightness set to " + level + "%.");
    }

    @Override
    public void setColor(String color) {
        this.color = color;
        System.out.println("Color changed to " + color + ".");
    }
}

public class Q7 {
    public static void main(String[] args) {
        SmartBulb bulb = new SmartBulb();

        // Demonstrate Switchable methods
        bulb.turnOn();
        bulb.turnOff();

        // Demonstrate Configurable methods
        bulb.setBrightness(75);
        bulb.setColor("Warm White");
    }
}
