package visitor;

import visitor.visitor.ProductVisitor;

public class ClothingProduct implements Product {
    @Override
    public void accept(ProductVisitor visitor) {
        visitor.visit(this);
    }

    public void clean() {
        System.out.println("Cleaning the clothing product.");
    }
}

