package composite;

import composite.composite.Box;
import composite.leaf.Product;

public class Main {
    public static void main(String[] args) {
        // Create products
        Product laptop = new Product("Laptop", 1000.0);
        Product smartphone = new Product("Smartphone", 500.0);

        // Create small boxes
        Box smallBox1 = new Box();
        smallBox1.add(laptop);
        smallBox1.add(smartphone);

        Product headphones = new Product("Headphones", 50.0);
        Product tablet = new Product("Tablet", 300.0);

        Box smallBox2 = new Box();
        smallBox2.add(headphones);
        smallBox2.add(tablet);

        // Create a big box
        Box bigBox = new Box();
        bigBox.add(smallBox1);
        bigBox.add(smallBox2);

        // Calculate total price
        double totalPrice = bigBox.getPrice();
        System.out.println("Total Price: $" + totalPrice);
    }
}
