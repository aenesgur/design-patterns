package abstract_factory.factory;


import abstract_factory.car.AudiCar;
import abstract_factory.car.Car;
import abstract_factory.motorCycle.AudiMotorCycle;
import abstract_factory.motorCycle.MotorCycle;

public class AudiFactory implements AbstractFactory{
    @Override
    public Car produceCar() {
        return new AudiCar();
    }

    @Override
    public MotorCycle produceMotorCycle() {
        return new AudiMotorCycle();
    }
}
