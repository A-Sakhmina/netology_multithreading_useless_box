package box;

public class Box {
    private Switch aSwitch = new Switch();

    public void openUp() {
        int attemptNumber = 10;
        int newAttemptInterval = 4000;
        for (int i = 0; i < attemptNumber; i++) {
            try {
                Thread.sleep(newAttemptInterval);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            aSwitch.turnOn();
        }
    }

    public void close() {
        while (!Thread.currentThread().isInterrupted()) {
            aSwitch.turnOff();
        }
    }
}
