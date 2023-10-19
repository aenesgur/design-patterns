package decorator.car.decorator;

import decorator.car.Car;

public class BasicCarWithSunroof extends CarDecorator{

    public BasicCarWithSunroof(Car decoratedCar) {
        super(decoratedCar);
    }

    @Override
    public String getCarDetail() {
        return super.getCarDetail().concat(", sunroof added");
    }
}
