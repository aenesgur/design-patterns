package proxy.cache;

import java.util.HashMap;
import java.util.Map;

public class CacheCalculator implements Calculator {
    private RealCalculator realCalculator;
    private Map<Integer, Integer> cache = new HashMap<>();

    public CacheCalculator() {
        realCalculator = new RealCalculator();
    }

    public int calculate(int number) {
        if (cache.containsKey(number)) {
            System.out.println("Received from cache: " + number);
            return cache.get(number);
        } else {
            int result = realCalculator.calculate(number);
            cache.put(number, result);
            return result;
        }
    }
}