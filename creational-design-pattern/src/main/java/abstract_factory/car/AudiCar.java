package abstract_factory.car;

public class AudiCar implements Car{
    @Override
    public String produce(String color) {
        return "Audi car was produced with ".concat(color).concat(" color");
    }
}
