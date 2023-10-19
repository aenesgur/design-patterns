package decorator.coffee.decorator;

import decorator.coffee.Coffee;

public class EspressoWithMilk extends CoffeeDecorator {

    public EspressoWithMilk(Coffee coffee) {
        super(coffee);
    }

    @Override
    public void prepare() {
        super.prepare();
        System.out.println(" adding milk.");
    }
}
