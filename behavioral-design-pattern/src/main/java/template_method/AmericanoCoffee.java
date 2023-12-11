package template_method;

public class AmericanoCoffee extends CoffeeTemplate {
    @Override
    void boilWater() {
        System.out.println("Boiling water for Americano");
    }

    @Override
    void brewCoffeeGrounds() {
        System.out.println("Brewing Americano coffee grounds");
    }

    @Override
    void pourInCup() {
        System.out.println("Pouring Americano into cup");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding salt into Americano");
    }
}
