package flyweight;

import flyweight.shape.Shape;
import flyweight.shape.ShapeFactory;

public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape redTShape = shapeFactory.getShape("Red", "T");
        Shape blueIShape = shapeFactory.getShape("Blue", "I");
        Shape redLShape = shapeFactory.getShape("Red", "L");

        redTShape.draw();
        blueIShape.draw();
        redLShape.draw();

        Shape yellowTShape = shapeFactory.getShape("Red", "T"); //Comes from cache!
        yellowTShape.draw();
    }
}
