package decorator.car.decorator;

import decorator.car.Car;

public class BasicCarWithBabySeat extends CarDecorator{

    private final String babySeatColor;

    public BasicCarWithBabySeat(Car decoratedCar, String babySeatColor) {
        super(decoratedCar);
        this.babySeatColor = babySeatColor;
    }

    @Override
    public String getCarDetail() {
        return super.getCarDetail().concat(", baby seat color: ").concat(babySeatColor);
    }
}
