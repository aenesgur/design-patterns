package strategy.without_strategy;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public double calculateTotal() {
        double total = 0;
        for (Product product : products) {
            if (product.getType().equals("book")) {
                total += product.getPrice() * 0.1;
            } else if (product.getType().equals("electronics")) {
                total += product.getPrice() * 0.05;
            } else if (product.getType().equals("clothing")) {
                total += product.getPrice() * 0.2;
            } else {
                total += product.getPrice();
            }
        }
        return total;
    }
}
