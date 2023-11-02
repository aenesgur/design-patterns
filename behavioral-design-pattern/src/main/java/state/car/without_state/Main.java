package state.car.without_state;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();

        car.startEngine();
        car.drive();

        car.startEngine();
        car.stopEngine();
    }
}
