package strategy.with_strategy;

import strategy.with_strategy.discount.BookDiscount;
import strategy.with_strategy.discount.ClothingDiscount;
import strategy.with_strategy.discount.DiscountStrategy;
import strategy.with_strategy.discount.ElectronicsDiscount;

public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Product book = new Product(100);
        Product phone = new Product(500);
        Product shirt = new Product(50);

        cart.addProduct(book);
        cart.addProduct(phone);
        cart.addProduct(shirt);

        DiscountStrategy bookDiscount = new BookDiscount();
        DiscountStrategy electronicsDiscount = new ElectronicsDiscount();
        DiscountStrategy clothingDiscount = new ClothingDiscount();

        cart.setDiscountStrategy(bookDiscount);
        double totalWithBookDiscount = cart.calculateTotal();

        cart.setDiscountStrategy(electronicsDiscount);
        double totalWithElectronicsDiscount = cart.calculateTotal();

        cart.setDiscountStrategy(clothingDiscount);
        double totalWithClothingDiscount = cart.calculateTotal();

        System.out.println("Total (Book): " + totalWithBookDiscount);
        System.out.println("Total (Electronics): " + totalWithElectronicsDiscount);
        System.out.println("Total (Clothing): " + totalWithClothingDiscount);
    }
}
