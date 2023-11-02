package state.car.with_state;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();

        car.startEngine();
        car.drive();

        car.setState(new DrivingState());

        car.startEngine();
        car.stopEngine();

        car.setState(new ParkedState());

        car.stop();
    }
}
