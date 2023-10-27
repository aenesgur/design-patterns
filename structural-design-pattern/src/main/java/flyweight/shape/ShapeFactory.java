package flyweight.shape;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShapeFactory {

    private static final Map<String, Shape> colorByShape = new HashMap<>();

    public Shape getShape(String color, String shape){
        String key = generateColorByShapeKey(color,shape);
        if (colorByShape.containsKey(key)){
            return colorByShape.get(key);
        }
        else {
            Shape shapeObject = getShapeObject(color, shape);
            colorByShape.put(key, shapeObject);
            return shapeObject;
        }
    }

    private Shape getShapeObject(String color, String shape){
        switch (shape.toUpperCase()){
            case "T":
                return new TShape(color);
            case "L":
                return new LShape(color);
            case "I":
                return new IShape(color);
            default:
                throw new IllegalArgumentException();
        }
    }

    private String generateColorByShapeKey(String color, String shape){
        return color.concat("-").concat(shape);
    }
}
