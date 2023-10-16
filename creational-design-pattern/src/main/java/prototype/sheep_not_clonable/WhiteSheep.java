package prototype.sheep_not_clonable;

public class WhiteSheep implements Sheep {
    private String name;
    private int age;

    public WhiteSheep(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Sheep clone() {
        return new WhiteSheep(this.name, this.age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
