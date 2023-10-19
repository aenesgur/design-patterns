package decorator.car;

import decorator.car.decorator.BasicCarWithBabySeat;
import decorator.car.decorator.BasicCarWithSunroof;

public class Main {
    public static void main(String[] args) {
        Car basicCar = new BasicCar("Red", 1.5, false);
        System.out.println(basicCar.getCarDetail());

        System.out.println("***");

        Car carWithSunroof = new BasicCarWithSunroof(new BasicCar("Blue", 1.0, true));
        System.out.println(carWithSunroof.getCarDetail());

        System.out.println("***");

        Car carWithBabySeat = new BasicCarWithBabySeat(carWithSunroof, "White");
        System.out.println(carWithBabySeat.getCarDetail());
    }
}
