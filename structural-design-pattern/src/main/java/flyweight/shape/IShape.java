package flyweight.shape;

public class IShape implements Shape{

    private final String color;

    public IShape(String color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("I shape with ".concat(color).concat(" color is drawing!"));
    }
}
