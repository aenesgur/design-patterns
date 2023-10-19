package decorator.coffee.decorator;

import decorator.coffee.Coffee;

public class EspressoWithSugar extends CoffeeDecorator {

    private final String sugarType;

    public EspressoWithSugar(Coffee coffee, String sugarType) {
        super(coffee);
        this.sugarType = sugarType;
    }

    @Override
    public void prepare() {
        super.prepare();
        System.out.println(" adding ".concat(sugarType).concat(" sugar"));
    }
}
