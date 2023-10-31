package visitor;

import visitor.visitor.ProductVisitor;

public interface Product {
    void accept(ProductVisitor visitor);
}
