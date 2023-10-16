package abstract_factory.motorCycle;

public class MercedesMotorcycle implements MotorCycle{
    @Override
    public String produce(int numberOfSeat) {
        return "Mercedes motor cycle was produced with ".concat(String.valueOf(numberOfSeat)).concat(" number of seat");
    }
}
