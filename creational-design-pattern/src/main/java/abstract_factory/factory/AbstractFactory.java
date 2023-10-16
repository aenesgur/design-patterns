package abstract_factory.factory;

import abstract_factory.car.Car;
import abstract_factory.motorCycle.MotorCycle;

public interface AbstractFactory {
    Car produceCar();
    MotorCycle produceMotorCycle();
}
