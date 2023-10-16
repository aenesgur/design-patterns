package abstract_factory.motorCycle;

public class AudiMotorCycle implements MotorCycle{

    @Override
    public String produce(int numberOfSeat) {
        return "Audi motor cycle was produced with ".concat(String.valueOf(numberOfSeat)).concat(" number of seat");
    }
}
