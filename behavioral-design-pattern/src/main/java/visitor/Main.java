package visitor;

import visitor.visitor.ProductOperationVisitor;
import visitor.visitor.ProductVisitor;

public class Main {
    public static void main(String[] args) {
        Product electronicProduct = new ElectronicProduct();
        Product clothingProduct = new ClothingProduct();

        ProductVisitor visitor = new ProductOperationVisitor();

        electronicProduct.accept(visitor);
        clothingProduct.accept(visitor);
    }
}
