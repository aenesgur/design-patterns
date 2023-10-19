package decorator.car.decorator;

import decorator.car.Car;

public class CarDecorator implements Car {

    private final Car decoratedCar;

    public CarDecorator(Car decoratedCar) {
        this.decoratedCar = decoratedCar;
    }

    @Override
    public String getCarDetail() {
        return decoratedCar.getCarDetail();
    }
}
