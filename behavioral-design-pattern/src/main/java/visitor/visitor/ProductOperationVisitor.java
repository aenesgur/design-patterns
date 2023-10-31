package visitor.visitor;

import visitor.ClothingProduct;
import visitor.ElectronicProduct;

public class ProductOperationVisitor implements ProductVisitor {
    @Override
    public void visit(ElectronicProduct product) {
        System.out.println("Visitor is repairing an electronic product.");
        product.repair();
    }

    @Override
    public void visit(ClothingProduct product) {
        System.out.println("Visitor is cleaning a clothing product.");
        product.clean();
    }
}