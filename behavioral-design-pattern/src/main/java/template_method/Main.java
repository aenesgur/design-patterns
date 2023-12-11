package template_method;

public class Main {
    public static void main(String[] args) {
        CoffeeTemplate americano = new AmericanoCoffee();
        americano.prepareCoffee();

        CoffeeTemplate latte = new LatteCoffee();
        latte.prepareCoffee();
    }
}
