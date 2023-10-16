package abstract_factory.car;

public class MercedesCar implements Car{
    @Override
    public String produce(String color) {
        return "Mercedes car was produced with ".concat(color).concat(" color");
    }
}
