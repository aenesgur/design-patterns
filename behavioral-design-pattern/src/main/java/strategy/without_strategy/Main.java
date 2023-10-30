package strategy.without_strategy;

public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Product book = new Product("book", 100);
        Product phone = new Product("electronics", 500);
        Product shirt = new Product("clothing", 50);

        cart.addProduct(book);
        cart.addProduct(phone);
        cart.addProduct(shirt);

        double total = cart.calculateTotal();

        System.out.println(total);

    }
}
