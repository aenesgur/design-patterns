package state.car.with_state;

public class Car implements CarState{
    private CarState currentState;

    public Car() {
        currentState = new ParkedState();
    }

    public void setState(CarState state) {
        currentState = state;
    }

    @Override
    public void startEngine() {
        currentState.startEngine();
    }

    @Override
    public void stopEngine() {
        currentState.stopEngine();
    }

    @Override
    public void drive() {
        currentState.drive();
    }

    @Override
    public void stop() {
        currentState.stop();
    }
}
