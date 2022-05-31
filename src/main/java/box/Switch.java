package box;

public class Switch {
    private volatile boolean isOn = false;

    public void turnOn() {
        if (!isOn) {
            isOn = true;
            System.out.println("\n-тумблер включен");
        }
    }

    public void turnOff() {
        if (isOn) {
            isOn = false;
            System.out.println("тумблер выключен");
        }
    }

}
