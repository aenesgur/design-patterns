package abstract_factory;

import abstract_factory.car.Car;
import abstract_factory.factory.AbstractFactory;
import abstract_factory.factory.AudiFactory;
import abstract_factory.factory.MercedesFactory;


public class Main {
    public static void main(String[] args) {
        AbstractFactory audiFactory = new AudiFactory();
        AbstractFactory mercedesFactory = new MercedesFactory();

        Car audiCar = audiFactory.produceCar();
        Car mercedesCar = mercedesFactory.produceCar();

        System.out.println(audiCar.produce("Red"));
        System.out.println(mercedesCar.produce("Black"));

    }
}