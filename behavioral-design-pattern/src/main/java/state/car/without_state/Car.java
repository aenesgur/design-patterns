package state.car.without_state;

public class Car {
    private boolean engineStarted;
    private boolean inDriveMode;

    public Car() {
        engineStarted = false;
        inDriveMode = false;
    }

    public void startEngine() {
        if (!engineStarted) {
            engineStarted = true;
            System.out.println("Engine started.");
        } else {
            System.out.println("Engine is already running.");
        }
    }

    public void stopEngine() {
        if (engineStarted) {
            engineStarted = false;
            inDriveMode = false;
            System.out.println("Engine stopped.");
        } else {
            System.out.println("Engine is not running.");
        }
    }

    public void drive() {
        if (engineStarted && !inDriveMode) {
            inDriveMode = true;
            System.out.println("Car is now in drive mode.");
        } else if (!engineStarted) {
            System.out.println("Engine is not running.");
        } else {
            System.out.println("Car is already in drive mode.");
        }
    }

    public void stop() {
        if (inDriveMode) {
            inDriveMode = false;
            System.out.println("Car is stopped.");
        } else {
            System.out.println("Car is already stopped.");
        }
    }
}
