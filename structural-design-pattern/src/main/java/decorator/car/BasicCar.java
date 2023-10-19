package decorator.car;

public class BasicCar implements Car{
    private final String color;
    private final double engineVolume;
    private final Boolean hasLed;

    public BasicCar(String color, double engineVolume, Boolean hasLed) {
        this.color = color;
        this.engineVolume = engineVolume;
        this.hasLed = hasLed;
    }


    @Override
    public String getCarDetail() {
        return "Car color: ".concat(color)
                .concat(", engine volume: ").concat(String.valueOf(engineVolume))
                .concat(", has led: ").concat(String.valueOf(hasLed));
    }
}
