package proxy.cache;

public class RealCalculator implements Calculator {
    public int calculate(int number) {
        System.out.println("Calculating: " + number);
        return number * 2;
    }
}
