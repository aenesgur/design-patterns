package template_method;

public abstract class CoffeeTemplate {
    public final void prepareCoffee() {
        boilWater();
        brewCoffeeGrounds();
        pourInCup();
        addCondiments();
    }

    abstract void boilWater();

    abstract void brewCoffeeGrounds();

    abstract void pourInCup();

    abstract void addCondiments();
}
