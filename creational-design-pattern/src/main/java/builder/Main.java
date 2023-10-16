package builder;

import builder.model.Product;

public class Main {
    public static void main(String[] args) {
        Product samsungProduct = new Product.Builder("Samsung")
                .price(2000)
                .type("Smartphone")
                .build();

        Product iphoneProduct = new Product.Builder("IPhone")
                .price(2000)
                .build();

        System.out.println(iphoneProduct.getType());
        System.out.println(samsungProduct.getType());
    }
}
