package template_method;

public class LatteCoffee extends CoffeeTemplate {
    @Override
    void boilWater() {
        System.out.println("Boiling water for Latte");
    }

    @Override
    void brewCoffeeGrounds() {
        System.out.println("Brewing Latte coffee grounds");
    }

    @Override
    void pourInCup() {
        System.out.println("Pouring Latte into cup");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding milk for Latte");
    }
}
