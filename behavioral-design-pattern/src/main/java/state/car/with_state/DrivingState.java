package state.car.with_state;

public class DrivingState implements CarState {
    @Override
    public void startEngine() {
        System.out.println("Car is already running.");
    }

    @Override
    public void stopEngine() {
        System.out.println("Engine stopped.");
    }

    @Override
    public void drive() {
        System.out.println("Car is already in drive mode.");
    }

    @Override
    public void stop() {
        System.out.println("Car is stopped.");
    }
}
