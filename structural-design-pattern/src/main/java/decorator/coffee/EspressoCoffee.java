package decorator.coffee;

public class EspressoCoffee implements Coffee{

    private final String beanType;
    public EspressoCoffee(String beanType){
        this.beanType = beanType;
    }

    @Override
    public void prepare() {
        System.out.println("Espresso with ".concat(beanType));
    }
}
