package prototype.sheep_not_clonable;

public interface Sheep {
    Sheep clone();
    String getName();
    int getAge();
    void setAge(int age);
    void setName(String name);
}
