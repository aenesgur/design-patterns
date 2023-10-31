package visitor.visitor;

import visitor.ClothingProduct;
import visitor.ElectronicProduct;

public interface ProductVisitor {
    void visit(ElectronicProduct product);
    void visit(ClothingProduct product);
}
