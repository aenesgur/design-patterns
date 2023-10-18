package proxy;

import proxy.cache.CacheCalculator;
import proxy.cache.Calculator;
import proxy.virtual.Internet;
import proxy.virtual.ProxyInternet;

public class Main {
    public static void main(String[] args) {

        //region Virtual
        Internet internet = new ProxyInternet();
        try
        {
            internet.connectTo("geeksforgeeks.org");
            internet.connectTo("abc.com");
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        //endregion

        //region Cache
        Calculator calculator = new CacheCalculator();
        System.out.println(calculator.calculate(5));
        System.out.println(calculator.calculate(5));
        //endregion
    }
}
