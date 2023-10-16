package abstract_factory.factory;


import abstract_factory.car.Car;
import abstract_factory.car.MercedesCar;
import abstract_factory.motorCycle.MercedesMotorcycle;
import abstract_factory.motorCycle.MotorCycle;

public class MercedesFactory implements AbstractFactory{
    @Override
    public Car produceCar() {
        return new MercedesCar();
    }

    @Override
    public MotorCycle produceMotorCycle() {
        return new MercedesMotorcycle();
    }
}
