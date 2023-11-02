package state.car.with_state;

public class ParkedState implements CarState {

    @Override
    public void startEngine() {
        System.out.println("Engine started.");
    }

    @Override
    public void stopEngine() {
        System.out.println("Engine stopped.");
    }

    @Override
    public void drive() {
        System.out.println("Car is now in drive mode.");
    }

    @Override
    public void stop() {
        System.out.println("Car is already stopped.");
    }
}