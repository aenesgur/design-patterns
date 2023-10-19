package decorator.coffee.decorator;

import decorator.coffee.Coffee;

public class CoffeeDecorator implements Coffee {

    protected Coffee coffee;

    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public void prepare() {
        coffee.prepare();
    }
}
