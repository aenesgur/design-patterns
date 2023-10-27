package flyweight.shape;

public class LShape implements Shape{

    private final String color;

    public LShape(String color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("L shape with ".concat(color).concat(" color is drawing!"));
    }
}
