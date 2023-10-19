package decorator.coffee;

import decorator.coffee.decorator.EspressoWithMilk;
import decorator.coffee.decorator.EspressoWithSugar;

public class Main {
    public static void main(String[] args) {
        Coffee espresso = new EspressoCoffee("Arabic");
        espresso.prepare();

        System.out.println("***");

        Coffee espressoWithMilk = new EspressoWithMilk(espresso);
        espressoWithMilk.prepare();

        System.out.println("***");

        Coffee espressoWithSugar = new EspressoWithSugar(espressoWithMilk, "Brown");
        espressoWithSugar.prepare();
    }
}
