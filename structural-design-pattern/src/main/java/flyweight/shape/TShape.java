package flyweight.shape;

public class TShape implements Shape{

    private final String color;

    public TShape(String color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("T shape with ".concat(color).concat(" color is drawing!"));
    }
}
