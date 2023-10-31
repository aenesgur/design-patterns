package visitor;

import visitor.visitor.ProductVisitor;

public class ElectronicProduct implements Product {
    @Override
    public void accept(ProductVisitor visitor) {
        visitor.visit(this);
    }

    public void repair() {
        System.out.println("Repairing the electronic product.");
    }
}
